package ru.traveltojapan.firstknowledge;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static MediaPlayer mPlayer;
    @SuppressLint("StaticFieldLeak")
    public static ImageButton imageButtonMusicOn, imageButtonMusicOff;
    public static TextView policy;
    private Button numbs, letters;

    @SuppressLint("StaticFieldLeak")


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setNavigationBarColor(getResources().getColor(R.color.DarkYellow));
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        policy = findViewById(R.id.Policy);
        imageButtonMusicOff = findViewById(R.id.ButtonMusicOff);
        imageButtonMusicOn = findViewById(R.id.ButtonMusicOn);
        numbs = findViewById(R.id.ButtonNumbs);
        letters = findViewById(R.id.ButtonLetters);
        MainActivity.mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bensoundmain);



        PlayMusic.MusicLooperMain();
    }


    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("musicOnOff", PlayMusic.Music);
        mPlayer.stop();
        mPlayer.setLooping(false);

    }


    public void toNumbsActivity(View view) {
        numbs.setEnabled(false);
        if (PlayMusic.Music) {
            mPlayer.stop();
            mPlayer.setLooping(false);
        }
        Intent intent = new Intent(this, NumbsActivity.class);

        startActivity(intent);

    }

    public void toLettersActivity(View view) {
        letters.setEnabled(false);
        if (PlayMusic.Music) {
            mPlayer.stop();
            mPlayer.setLooping(false);
        }
        Intent intent = new Intent(this, LettersActivity.class);

        startActivity(intent);
    }

    public void MusicOff(View view) {
        PlayMusic.PutFalse();
        mPlayer.stop();
        mPlayer.setLooping(false);
        imageButtonMusicOn.setVisibility(View.INVISIBLE);
        imageButtonMusicOff.setVisibility(View.VISIBLE);
        Toast.makeText(getApplicationContext(), "Музыка выключена", Toast.LENGTH_SHORT).show();
    }

    public void MusicOn(View view) {
        PlayMusic.Music = true;
        mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bensoundmain);
        mPlayer.start();
        mPlayer.setLooping(true);
        imageButtonMusicOn.setVisibility(View.VISIBLE);
        imageButtonMusicOff.setVisibility(View.INVISIBLE);
        Toast.makeText(getApplicationContext(), "Музыка включена", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        numbs.setEnabled(true);
        letters.setEnabled(true);
        if (PlayMusic.Music) {
            imageButtonMusicOn.setVisibility(View.VISIBLE);
            imageButtonMusicOff.setVisibility(View.INVISIBLE);
            mPlayer.stop();
            mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bensoundmain);
            PlayMusic.BreakBetweenActivities();

        } else {
            mPlayer.stop();
            mPlayer.setLooping(false);
            imageButtonMusicOn.setVisibility(View.INVISIBLE);
            imageButtonMusicOff.setVisibility(View.VISIBLE);
        }

    }


    @Override
    protected void onPause() {
        super.onPause();
        mPlayer.stop();
        mPlayer.setLooping(false);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mPlayer.stop();
        mPlayer.setLooping(false);
    }

    public void ToPrivatePolicy(View view) {
        if (mPlayer.isPlaying()) {
            mPlayer.stop();
        }
        policy.setEnabled(false);
        Intent intent = new Intent(getApplicationContext(), PrivatePolicy.class);
        startActivity(intent);
    }
}