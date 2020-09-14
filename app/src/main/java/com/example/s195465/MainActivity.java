package com.example.s195465;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bWeb;
    Button bInd;
    TextView tStatus;
    EditText urlEdit;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bWeb = findViewById(R.id.buttonWeb);
        bInd = findViewById(R.id.buttonInd);
        tStatus = findViewById(R.id.textViewStatus);
        urlEdit = findViewById(R.id.inputURL);
        webView = findViewById(R.id.webView1);
        webView.setVisibility(View.GONE);

        final ImageView picture = findViewById(R.id.imageViewMain);

        bWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tStatus.setText("WebView");
                picture.setImageResource(0);
                webView.setVisibility(View.VISIBLE);
                bInd.setText("Tilbage");
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl(urlEdit.getText().toString());

            }
        });
        bInd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView.setVisibility(View.GONE);
                tStatus.setText("Menu");
                bInd.setText("Indstillinger");
                picture.setImageResource(R.drawable.xv17fnu);

            }
        });

    }
}