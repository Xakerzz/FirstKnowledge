package ru.traveltojapan.firstknowledge;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class NumbsActivity extends AppCompatActivity {
    public static MediaPlayer mPlayer;
    public static MediaPlayer sound0, sound1, sound2, sound3, sound4, sound5, sound6, sound7, sound8, sound9;

    @SuppressLint("StaticFieldLeak")
    public static ImageButton imageButtonMusicOn, imageButtonMusicOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbs);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        imageButtonMusicOff = findViewById(R.id.ButtonMusicOff);
        imageButtonMusicOn = findViewById(R.id.ButtonMusicOn);


        mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bensoundnumbs);

        PlayMusic.MusicLooperNumbs();
        PlayMusic.imageView0 = findViewById(R.id.imageView0);
        PlayMusic.imageView1 = findViewById(R.id.imageView1);
        PlayMusic.imageView2 = findViewById(R.id.imageView2);
        PlayMusic.imageView3 = findViewById(R.id.imageView3);
        PlayMusic.imageView4 = findViewById(R.id.imageView4);
        PlayMusic.imageView5 = findViewById(R.id.imageView5);
        PlayMusic.imageView6 = findViewById(R.id.imageView6);
        PlayMusic.imageView7 = findViewById(R.id.imageView7);
        PlayMusic.imageView8 = findViewById(R.id.imageView8);
        PlayMusic.imageView9 = findViewById(R.id.imageView9);


    }

    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("musicOnOff", PlayMusic.Music);
        mPlayer.stop();
        mPlayer.setLooping(false);

    }


    public void MusicOn(View view) {
        PlayMusic.Music = true;
        mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bensoundnumbs);
        mPlayer.start();
        mPlayer.setLooping(true);
        imageButtonMusicOn.setVisibility(View.VISIBLE);
        imageButtonMusicOff.setVisibility(View.INVISIBLE);
        Toast.makeText(getApplicationContext(), "Музыка включена", Toast.LENGTH_SHORT).show();
    }

    public void MusicOff(View view) {
        PlayMusic.Music = false;
        mPlayer.stop();
        mPlayer.setLooping(false);
        imageButtonMusicOn.setVisibility(View.INVISIBLE);
        imageButtonMusicOff.setVisibility(View.VISIBLE);
        Toast.makeText(getApplicationContext(), "Музыка выключена", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        mPlayer.stop();
        mPlayer.setLooping(false);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (PlayMusic.Music) {
            imageButtonMusicOn.setVisibility(View.VISIBLE);
            imageButtonMusicOff.setVisibility(View.INVISIBLE);
            mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bensoundnumbs);
            PlayMusic.MusicLooperNumbs();
            imageButtonMusicOn.setVisibility(View.VISIBLE);
            imageButtonMusicOff.setVisibility(View.INVISIBLE);
        } else {
            mPlayer.stop();
            mPlayer.setLooping(false);
            imageButtonMusicOn.setVisibility(View.INVISIBLE);
            imageButtonMusicOff.setVisibility(View.VISIBLE);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();

        mPlayer.stop();
        mPlayer.setLooping(false);


    }

    public void BackToMain(View view) {
        mPlayer.stop();
        mPlayer.setLooping(false);
        finish();
    }

    public void sound0(View view) {
        if (PlayMusic.zero0 == 0) {
            PlayMusic.imageView0.setEnabled(false);
            soundsChoose(0);
            PlayMusic.BreakNumbsSounds();
            PlayMusic.zero0 = 1;
        }
    }

    public void sound1(View view) {
        if (PlayMusic.one1 == 0) {
            PlayMusic.one1 = 1;
            PlayMusic.imageView1.setEnabled(false);
            soundsChoose(1);
            PlayMusic.BreakNumbsSounds();
        }

    }

    public void sound2(View view) {
        if (PlayMusic.two2 == 0) {
            PlayMusic.two2 = 1;
            PlayMusic.imageView2.setEnabled(false);
            soundsChoose(2);
            PlayMusic.BreakNumbsSounds();
        }

    }

    public void sound3(View view) {
        if (PlayMusic.three3 == 0) {
            PlayMusic.three3 = 1;
            PlayMusic.imageView3.setEnabled(false);
            soundsChoose(3);
            PlayMusic.BreakNumbsSounds();
        }

    }

    public void sound4(View view) {
        if (PlayMusic.four4 == 0) {
            PlayMusic.four4 = 1;
            PlayMusic.imageView4.setEnabled(false);
            soundsChoose(4);
            PlayMusic.BreakNumbsSounds();
        }

    }

    public void sound5(View view) {
        if (PlayMusic.five5 == 0) {
            PlayMusic.five5 = 1;
            PlayMusic.imageView5.setEnabled(false);
            soundsChoose(5);
            PlayMusic.BreakNumbsSounds();
        }

    }

    public void sound6(View view) {
        if (PlayMusic.six6 == 0) {
            PlayMusic.six6 = 1;
            PlayMusic.imageView6.setEnabled(false);
            soundsChoose(6);
            PlayMusic.BreakNumbsSounds();
        }

    }

    public void sound7(View view) {
        if (PlayMusic.seven7 == 0) {
            PlayMusic.seven7 = 1;
            PlayMusic.imageView7.setEnabled(false);
            soundsChoose(7);
            PlayMusic.BreakNumbsSounds();
        }

    }

    public void sound8(View view) {
        if (PlayMusic.eight8 == 0) {
            PlayMusic.eight8 = 1;
            PlayMusic.imageView8.setEnabled(false);
            soundsChoose(8);
            PlayMusic.BreakNumbsSounds();
        }

    }

    public void sound9(View view) {
        if (PlayMusic.nine9 == 0) {
            PlayMusic.nine9 = 1;
            PlayMusic.imageView9.setEnabled(false);
            soundsChoose(9);
            PlayMusic.BreakNumbsSounds();
        }

    }


    private void soundsChoose(int i) {


        switch (i) {
            case 0:
                sound0 = MediaPlayer.create(getApplicationContext(), R.raw.zero);
                sound0.start();
                break;
            case 1:
                sound1 = MediaPlayer.create(getApplicationContext(), R.raw.one);
                sound1.start();
                break;
            case 2:
                sound2 = MediaPlayer.create(getApplicationContext(), R.raw.two);
                sound2.start();
                break;
            case 3:
                sound3 = MediaPlayer.create(getApplicationContext(), R.raw.three);
                sound3.start();
                break;
            case 4:
                sound4 = MediaPlayer.create(getApplicationContext(), R.raw.four);
                sound4.start();
                break;
            case 5:
                sound5 = MediaPlayer.create(getApplicationContext(), R.raw.five);
                sound5.start();
                break;
            case 6:
                sound6 = MediaPlayer.create(getApplicationContext(), R.raw.six);
                sound6.start();
                break;
            case 7:
                sound7 = MediaPlayer.create(getApplicationContext(), R.raw.seven);
                sound7.start();
                break;
            case 8:
                sound8 = MediaPlayer.create(getApplicationContext(), R.raw.eight);
                sound8.start();
                break;
            case 9:
                sound9 = MediaPlayer.create(getApplicationContext(), R.raw.nine);
                sound9.start();
                break;

        }
    }
}