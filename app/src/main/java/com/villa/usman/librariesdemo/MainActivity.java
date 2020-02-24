package com.villa.usman.librariesdemo;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    Button btnErr,btnSucc,btnInfo,btnNorm,btnImg,btnWarn,btnCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnErr = (Button) findViewById(R.id.btn_error);
        btnSucc = (Button) findViewById(R.id.btn_success);
        btnInfo = (Button) findViewById(R.id.btn_info);
        btnNorm = (Button) findViewById(R.id.btn_normal);
        btnImg = (Button) findViewById(R.id.btn_image);
        btnWarn = (Button) findViewById(R.id.btn_warning);
        btnCustom = (Button) findViewById(R.id.btn_custom);

        btnErr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toasty.error(getApplicationContext(), "This is an error toast.", Toast.LENGTH_SHORT, true).show();
            }
        });

        btnSucc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toasty.success(getApplicationContext(), "Success!", Toast.LENGTH_SHORT, true).show();
            }
        });

        btnInfo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toasty.info(getApplicationContext(), "Here is some info for you.", Toast.LENGTH_SHORT, true).show();
            }
        });

        btnNorm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toasty.normal(getApplicationContext(), "Normal toast").show();
            }
        });

        btnImg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Drawable icon = getResources().getDrawable(android.R.drawable.ic_lock_lock);
                Toasty.normal(getApplicationContext(), "Image toast", icon).show();
            }
        });

        btnWarn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toasty.warning(getApplicationContext(), "Warning Toast", Toast.LENGTH_SHORT, true).show();
            }
        });

        btnCustom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toasty.custom(getApplicationContext(), "I'm a custom Toast", getResources().getDrawable(android.R.drawable.ic_lock_power_off), Color.GREEN, 4, true,true).show();
            }
        });

    }
}
