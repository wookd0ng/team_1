package com.example.toyproject;

import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WebAppInterface {
    Context context;
    File cacheFile;

    //Uncaught Error: Java exception was raised during method invocation 발생으로 try catch 사용

    WebAppInterface(Context c,  File cache){
        context = c;
        cacheFile = cache;
    }

    @JavascriptInterface
    public void callApp(){
        try {
            Intent intent = new Intent(context, SubActivity.class);
            context.startActivity(intent);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }




    @JavascriptInterface
    public String readCacheFile() throws IOException{
        try{
            String data = "";
            if(cacheFile.length()==0){              //괜찮은지 여쭈어볼 것
                return "저장된 이력이 없습니다.";
            }
            else{
                FileInputStream inputStream = new FileInputStream(cacheFile);
                Scanner s = new Scanner(inputStream);
                while(s.hasNext()){
                    data = data + s.nextLine() + "\n";
                }
                inputStream.close();
            }
            return data;
        }
        catch (Exception e){
            return "파일이 없습니다.";
        }
    }


}
