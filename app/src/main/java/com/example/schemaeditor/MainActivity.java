package com.example.schemaeditor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button shareButton;
    LinearLayout schemasContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shareButton = findViewById(R.id.shareButton);
        schemasContainer = findViewById(R.id.schemasContainer);

        LinearLayout schemaChooser = new LinearLayout(this);
        schemaChooser.setOrientation(LinearLayout.HORIZONTAL);

        ImageView im = new ImageView(this);

        Button btn = new Button(this);
        btn.setText("saafs");
        btn.setActivated(true);
        btn.setEnabled(true);


        Button btn1 = new Button(this);
        btn1.setText("saafs");
        btn1.setActivated(true);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Приложение name, скачивай от сюда - ссылка");
                sendIntent.setType("text/plain");
                startActivity(Intent.createChooser(sendIntent,"Поделиться"));
            }
        });


        schemaChooser.addView(btn);
        schemaChooser.addView(btn1);

        schemasContainer.addView(schemaChooser);



        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Приложение name, скачивай от сюда - ссылка");
                sendIntent.setType("text/plain");
                startActivity(Intent.createChooser(sendIntent,"Поделиться"));
            }
        });
    }
}