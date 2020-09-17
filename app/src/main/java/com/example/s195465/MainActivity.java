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
    Button bIndstillinger;
    TextView tStatus;
    EditText insertURL;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bWeb = findViewById(R.id.buttonWeb);
        bIndstillinger = findViewById(R.id.buttonInd);
        tStatus = findViewById(R.id.textViewStatus);
        insertURL = findViewById(R.id.inputURL);
        webView = findViewById(R.id.webView);
        final ImageView picture = findViewById(R.id.imageViewMain);
        webView.setVisibility(View.GONE);

        bWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tStatus.setText("WebView");
                picture.setImageResource(0);
                bIndstillinger.setText("Tilbage");
                webView.setVisibility(View.VISIBLE);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl(insertURL.getText().toString());

            }
        });
        bIndstillinger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView.setVisibility(View.GONE);
                bIndstillinger.setText("Indstillinger");
                tStatus.setText("Menu");
                picture.setImageResource(R.drawable.xv17fnu);
            }
        });

    }
}