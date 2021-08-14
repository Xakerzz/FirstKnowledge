package ru.traveltojapan.firstknowledge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class PrivatePolicy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private_policy);
    }

    public void BackToMain(View view) {
        finish();
MainActivity.policy.setEnabled(true);
    }
}