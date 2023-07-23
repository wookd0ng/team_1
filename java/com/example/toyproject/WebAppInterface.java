package com.example.toyproject;

import android.content.Context;
import android.webkit.JavascriptInterface;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class WebAppInterface {
    Context context;        //뭐에쓰는겨
    File cacheFile;


    WebAppInterface(Context c){
        context = c;
        cacheFile=c.getCacheDir();
    }



    @JavascriptInterface
    public String readCacheFile() throws IOException{
        //Uncaught Error: Java exception was raised during method invocation 발생으로 try catch 사용
        try{
            String data = "";
            if(!cacheFile.exists()){
                return "저장된 이력이 없습니다.";
            }
            else{
                FileInputStream inputStream = new FileInputStream(cacheFile);
                Scanner s = new Scanner(inputStream);
                while(s.hasNext()){
                    data = data + s.nextLine() + "/n";
                }
                inputStream.close();
            }
            return data;
        }
        catch (Exception e){
            return "error";
        }
    }


}
