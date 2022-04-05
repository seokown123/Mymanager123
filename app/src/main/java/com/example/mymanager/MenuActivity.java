package com.example.mymanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class MenuActivity extends AppCompatActivity {

//    private DrawerLayout drawerLayout;
//    private View drawerView;
//
//    private WebView webView;
//    private String url = "https://www.naver.com";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

//        webView = (WebView) findViewById(R.id.webView); // webview id 값
//
//        webView.getSettings().setJavaScriptEnabled(true);
//        webView.loadUrl(url);
//        webView.setWebChromeClient(new WebChromeClient());
//        webView.setWebViewClient(new WebViewClientClass());


//        drawerLayout=(DrawerLayout) findViewById(R.id.drawer_layout);
//        drawerView =(View) findViewById(R.id.drawer);
//        //슬라이드 열기 버튼
//        Button btn_open = (Button) findViewById(R.id.btn_open);
//
//        btn_open.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                drawerLayout.openDrawer(drawerView);
//            }
//        });



        // 다이어트 페이지 간다.
        ImageButton Diet_btn = (ImageButton) findViewById(R.id.Diet_btn);
        Diet_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, DietActivity.class);
                startActivity(intent);
            }
        });

        //벌크업 페이지 간다.
        ImageButton bulk_btn = (ImageButton) findViewById(R.id.bulk_btn);
        bulk_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, BulkActivity.class);
                startActivity(intent);
            }
        });

        //당뇨 페이지 간다.
        ImageButton dn_btn = (ImageButton) findViewById(R.id.dn_btn);
        dn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, DangNewoActivity.class);
                startActivity(intent);
            }
        });
        //고혈압 페이지 간다.
        ImageButton go_btn = (ImageButton) findViewById(R.id.go_btn);
        go_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, GohyulAapActivity.class);
                startActivity(intent);
            }
        });


         // 닫기 버튼
//        Button btn_close = (Button)findViewById(R.id.btn_close);
//        btn_close.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                drawerLayout.closeDrawers();
//            }
//        });
//
//        drawerLayout.setDrawerListener(listener);
//        drawerView.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                return true;
//            }
//        });
//    }


//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) { //안드로이드에서 어떤 특정한  key값을 지정 해줘라
//        if((keyCode == KeyEvent.KEYCODE_BACK)&& webView.canGoBack() ){
//            webView.goBack();
//            return true;
//        }
//        return super.onKeyDown(keyCode, event);
//    }
//
//
//    private class WebViewClientClass extends WebViewClient {
//        @Override
//        public boolean shouldOverrideUrlLoading(WebView view, String url) { //현재 페이지 보일수 있는 메소드
//            view.loadUrl(url);
//            return true;
//        }
//    }


        DrawerLayout.DrawerListener listener = new DrawerLayout.DrawerListener() { // 만들어놓을때 이벤트를 넣으면 된다.
            @Override
            public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

            }

            @Override
            public void onDrawerOpened(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerClosed(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        };


    }
}
