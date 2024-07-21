package com.example.hospitalmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashWindow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_window);

        Thread td = new Thread(){
            public void run()
            {
             try
             {
                sleep(5000);
             }
             catch (Exception e) {
                 e.printStackTrace();
             }
             finally
             {
                 Intent it = new Intent(SplashWindow.this, MainActivity.class);
                 startActivity(it);
             }
            }
        };td.start();
        }
    }