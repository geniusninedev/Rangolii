package com.geniusnine.android.rangolii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
}


