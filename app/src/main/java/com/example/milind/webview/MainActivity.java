package com.example.milind.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView wv;
    @Override
    public void onBackPressed(){
        // When back pressed Go Back
        if (wv.canGoBack()){
            wv.goBack();
        }else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv = (WebView) findViewById(R.id.wv);
        // Enable Javascript
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setFocusable(true);
        wv.setFocusableInTouchMode(true);
        // Set Render Priority To High
        wv.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        wv.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        wv.getSettings().setDomStorageEnabled(true);
        wv.getSettings().setDatabaseEnabled(true);
        wv.getSettings().setAppCacheEnabled(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        //Load URL
        wv.loadUrl("https://www.google.com/");
        wv.setWebViewClient(new WebViewClient());
    }
}
