package com.geniusnine.android.rangolii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Tips1 extends AppCompatActivity {
WebView Tip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips1);
        Tip = (WebView) findViewById(R.id.IntroductionWebView);
        WebSettings webSetting = Tip.getSettings();
        webSetting.setBuiltInZoomControls(true);
        webSetting.setJavaScriptEnabled(true);
        Tip.setWebViewClient(new Tips1.WebViewClient());
        Tip.loadUrl("file:///android_res/raw/tips.html");
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


