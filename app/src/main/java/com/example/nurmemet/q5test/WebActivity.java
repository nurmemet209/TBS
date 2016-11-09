package com.example.nurmemet.q5test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tencent.smtt.sdk.WebChromeClient;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;

/**
 * Created by nurmemet on 2016/11/8.
 */

public class WebActivity extends AppCompatActivity {

    WebView tbsWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view_layout);

        tbsWebView = (WebView) findViewById(R.id.web_view);
        tbsWebView.getSettings().setJavaScriptEnabled(true);
        tbsWebView.setWebChromeClient(new WebChromeClient());
        tbsWebView.getSettings().setJavaScriptEnabled(true);
        tbsWebView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView webView, String s) {
                System.out.println("sfdsfsdfdsf");
                return super.shouldOverrideUrlLoading(webView, s);
            }
        });

        tbsWebView.loadUrl("http://baidu.com");
    }


}
