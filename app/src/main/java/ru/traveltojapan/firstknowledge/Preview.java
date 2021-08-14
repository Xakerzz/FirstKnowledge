package ru.traveltojapan.firstknowledge;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class Preview extends AppCompatActivity {
  public static TextView textViewPreview, textViewPreview2;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        getWindow().setNavigationBarColor(getResources().getColor(R.color.DarkYellow));
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        textViewPreview = findViewById(R.id.textViewPreview);
        textViewPreview2 = findViewById(R.id.textViewPreview2);
        PreviewAction1();
        PreviewAction3();
    }

    public static void PreviewAction1() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                textViewPreview.setVisibility(View.VISIBLE);
                PreviewAction2();
            }

        }, 750);

    }

    public static void PreviewAction2() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                textViewPreview2.setVisibility(View.VISIBLE);

            }

        }, 750);

    }

    public void PreviewAction3() {

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                finish();


                startActivity(new Intent(getApplicationContext(),MainActivity.class));



            }

        }, 1800);

    }


}

