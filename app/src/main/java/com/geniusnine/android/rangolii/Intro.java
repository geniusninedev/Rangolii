package com.geniusnine.android.rangolii;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Intro extends AppCompatActivity {
WebView Introductionweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        Introductionweb = (WebView) findViewById(R.id.IntroductionWebView);

        WebSettings webSetting = Introductionweb.getSettings();
        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        Introductionweb.setWebViewClient(new Intro.WebViewClient());
        Introductionweb.loadUrl("file:///android_res/raw/introrangoli.html");
    }



    class WebViewClient extends android.webkit.WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            return super.shouldOverrideUrlLoading(view, url);
        }

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch(keyCode){
            case KeyEvent.KEYCODE_BACK:

                finish();

                return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}



