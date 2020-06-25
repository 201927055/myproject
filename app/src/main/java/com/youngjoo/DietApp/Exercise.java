package com.youngjoo.DietApp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;

public class Exercise extends AppCompatActivity {

    WebView WB;
    View videoCustomView;
    FrameLayout customView;
    View containerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        WB = (WebView) findViewById(R.id.WB);
        customView = (FrameLayout) findViewById(R.id.customView);

        WebSettings settings = WB.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAppCacheEnabled(true);

        WB.setWebChromeClient(new CustomWeb());

        WB.loadUrl("https://www.youtube.com/channel/UCpg89Ys3E4BaLGgEEWVmI9g");
    }

    class CustomWeb extends WebChromeClient{
        @Override
        public void onShowCustomView(View view, CustomViewCallback callback){
            if(videoCustomView != null){
                callback.onCustomViewHidden();
                return;
            }

            final FrameLayout frame = ((FrameLayout)view);

            final View v1 = frame.getChildAt(0);

            view.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,
                    FrameLayout.LayoutParams.MATCH_PARENT, Gravity.CENTER));
            v1.setOnKeyListener(new View.OnKeyListener(){
                @Override
                public boolean onKey(View v, int keyCode, KeyEvent event){
                    if(keyCode == KeyEvent.KEYCODE_BACK&&event.getAction()==KeyEvent.ACTION_DOWN){
                        onHideCustomView();
                        return true;
                    }
                    return false;
                }
            });
            //뒤로가기 눌렀을때 앱으로 돌아가기
            videoCustomView= view;
            customView.setVisibility(View.VISIBLE);
            customView.bringToFront();
            WB.setVisibility(View.GONE);
        }
        @Override
        public void onHideCustomView(){
            super.onHideCustomView();

            customView.removeView(videoCustomView);
            videoCustomView = null;
            customView.setVisibility(View.INVISIBLE);
            WB.setVisibility(View.VISIBLE);
        }

    }
}
