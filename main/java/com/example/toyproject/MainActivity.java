package com.example.toyproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint; //?
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {

    WebView myWebView;

    @SuppressLint("JavascriptInterface")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myWebView = (WebView) findViewById(R.id.webView1);  //웹뷰 사용하기 위해 id연결
        WebSettings webSettings = myWebView.getSettings();  //웹뷰 세팅 변수 만들고
        webSettings.setJavaScriptEnabled(true);             //만들어진 변수로 자바스크립트 웹뷰에서 사용가능
        myWebView.loadUrl("file:///android_asset/toyProject.html"); //웹 화면 연결
        myWebView.setWebChromeClient(new WebChromeClient());
        myWebView.setWebViewClient(new WebViewClient());

        myWebView.addJavascriptInterface(new WebAppInterface(this), "Android");
    }

    public void onBackPressed(){    //뒤로가기 버튼 눌렀을 때
        if(myWebView.canGoBack()){  //만약 웹뷰가 뒤로갈수 있으면
            myWebView.goBack();     //뒤로가기
        }
        else{                       //아니면
            super.onBackPressed();  //뒤로가기 (원래기능/앱 나가기) super을 이용해 부모에 접근
        }
    }
}