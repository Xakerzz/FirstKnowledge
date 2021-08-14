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

public class LettersActivity extends AppCompatActivity {
    public static MediaPlayer mPlayer;
    public static MediaPlayer soundA, soundB, soundVE, soundGE, soundDE, soundE, soundYO, soundJE, soundZE, soundI, soundIyo, soundK,
            soundL, soundM, soundN, soundO, soundP, soundR, soundS, soundT, soundU, soundF, soundH, soundCE, soundCH, soundSH, soundSHE, soundSolid,
            soundIii, soundSoft, soundEa, soundYu, soundYa;

    @SuppressLint("StaticFieldLeak")
    public static ImageButton imageButtonMusicOn, imageButtonMusicOff;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letters);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        imageButtonMusicOff = findViewById(R.id.ButtonMusicOff);
        imageButtonMusicOn = findViewById(R.id.ButtonMusicOn);

        mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bensoundletters);


        PlayMusic.MusicLooperLetters();
        PlayMusic.imageViewA = findViewById(R.id.imageViewA);
        PlayMusic.imageViewB = findViewById(R.id.imageViewB);
        PlayMusic.imageViewVE = findViewById(R.id.imageViewVE);
        PlayMusic.imageViewGE = findViewById(R.id.imageViewGE);
        PlayMusic.imageViewDE = findViewById(R.id.imageViewDE);
        PlayMusic.imageViewE = findViewById(R.id.imageViewE);
        PlayMusic.imageViewYO = findViewById(R.id.imageViewYO);
        PlayMusic.imageViewJE = findViewById(R.id.imageViewJE);
        PlayMusic.imageViewZE = findViewById(R.id.imageViewZE);
        PlayMusic.imageViewI = findViewById(R.id.imageViewI);
        PlayMusic.imageViewIyo = findViewById(R.id.imageViewIyo);
        PlayMusic.imageViewK = findViewById(R.id.imageViewK);
        PlayMusic.imageViewL = findViewById(R.id.imageViewL);
        PlayMusic.imageViewM = findViewById(R.id.imageViewM);
        PlayMusic.imageViewN = findViewById(R.id.imageViewN);
        PlayMusic.imageViewO = findViewById(R.id.imageViewO);
        PlayMusic.imageViewP = findViewById(R.id.imageViewP);
        PlayMusic.imageViewR = findViewById(R.id.imageViewR);
        PlayMusic.imageViewS = findViewById(R.id.imageViewS);
        PlayMusic.imageViewT = findViewById(R.id.imageViewT);
        PlayMusic.imageViewU = findViewById(R.id.imageViewU);
        PlayMusic.imageViewF = findViewById(R.id.imageViewF);
        PlayMusic.imageViewH = findViewById(R.id.imageViewH);
        PlayMusic.imageViewCE = findViewById(R.id.imageViewCE);
        PlayMusic.imageViewCH = findViewById(R.id.imageViewCH);
        PlayMusic.imageViewSH = findViewById(R.id.imageViewSH);
        PlayMusic.imageViewSHE = findViewById(R.id.imageViewSHE);
        PlayMusic.imageViewSolid = findViewById(R.id.imageViewSolid);
        PlayMusic.imageViewIii = findViewById(R.id.imageViewIii);
        PlayMusic.imageViewSoft = findViewById(R.id.imageViewSoft);
        PlayMusic.imageViewEa = findViewById(R.id.imageViewEa);
        PlayMusic.imageViewYu = findViewById(R.id.imageViewYu);
        PlayMusic.imageViewYa = findViewById(R.id.imageViewYa);


    }

    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("musicOnOff", PlayMusic.Music);
        mPlayer.stop();
        mPlayer.setLooping(false);
    }


    public void MusicOn(View view) {
        mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bensoundletters);
        mPlayer.start();
        mPlayer.setLooping(true);
        PlayMusic.Music = true;
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
    protected void onResume() {
        super.onResume();


        if (PlayMusic.Music) {
            imageButtonMusicOn.setVisibility(View.VISIBLE);
            imageButtonMusicOff.setVisibility(View.INVISIBLE);
            mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bensoundletters);
            PlayMusic.BreakBetweenAktivitiesLatters();
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


    public void soundA(View view) {

        if (PlayMusic.A == 0) {
            PlayMusic.A = 1;
            PlayMusic.imageViewA.setEnabled(false);
            soundsChoose(0);
            PlayMusic.BreakLetterSounds();
        }
    }

    public void soundBE(View view) {

        if (PlayMusic.B == 0) {
            PlayMusic.B = 1;
            PlayMusic.imageViewB.setEnabled(false);
            soundsChoose(1);
            PlayMusic.BreakLetterSounds();
        }
    }

    public void soundVE(View view) {

        if (PlayMusic.VE == 0) {
            PlayMusic.VE = 1;
            PlayMusic.imageViewVE.setEnabled(false);
            soundsChoose(2);
            PlayMusic.BreakLetterSounds();
        }
    }

    public void soundGE(View view) {
        if (PlayMusic.GE == 0) {
            PlayMusic.GE = 1;
            PlayMusic.imageViewGE.setEnabled(false);
            soundsChoose(3);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundDE(View view) {
        if (PlayMusic.DE == 0) {
            PlayMusic.DE = 1;
            PlayMusic.imageViewDE.setEnabled(false);
            soundsChoose(4);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundE(View view) {
        if (PlayMusic.E == 0) {
            PlayMusic.E = 1;
            PlayMusic.imageViewE.setEnabled(false);
            soundsChoose(5);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundYO(View view) {
        if (PlayMusic.YO == 0) {
            PlayMusic.YO = 1;
            PlayMusic.imageViewYO.setEnabled(false);
            soundsChoose(6);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundJE(View view) {
        if (PlayMusic.JE == 0) {
            PlayMusic.JE = 1;
            PlayMusic.imageViewJE.setEnabled(false);
            soundsChoose(7);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundZE(View view) {
        if (PlayMusic.ZE == 0) {
            PlayMusic.ZE = 1;
            PlayMusic.imageViewZE.setEnabled(false);
            soundsChoose(8);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundI(View view) {
        if (PlayMusic.I == 0) {
            PlayMusic.I = 1;
            PlayMusic.imageViewI.setEnabled(false);
            soundsChoose(9);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundIyo(View view) {
        if (PlayMusic.Iyo == 0) {
            PlayMusic.Iyo = 1;
            PlayMusic.imageViewIyo.setEnabled(false);
            soundsChoose(10);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundK(View view) {
        if (PlayMusic.K == 0) {
            PlayMusic.K = 1;
            PlayMusic.imageViewK.setEnabled(false);
            soundsChoose(11);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundL(View view) {
        if (PlayMusic.L == 0) {
            PlayMusic.L = 1;
            PlayMusic.imageViewL.setEnabled(false);
            soundsChoose(12);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundM(View view) {
        if (PlayMusic.M == 0) {
            PlayMusic.M = 1;
            PlayMusic.imageViewM.setEnabled(false);
            soundsChoose(13);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundN(View view) {
        if (PlayMusic.N == 0) {
            PlayMusic.N = 1;
            PlayMusic.imageViewN.setEnabled(false);
            soundsChoose(14);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundO(View view) {
        if (PlayMusic.O == 0) {
            PlayMusic.O = 1;
            PlayMusic.imageViewO.setEnabled(false);
            soundsChoose(15);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundP(View view) {
        if (PlayMusic.P == 0) {
            PlayMusic.P = 1;
            PlayMusic.imageViewP.setEnabled(false);
            soundsChoose(16);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundR(View view) {
        if (PlayMusic.R == 0) {
            PlayMusic.R = 1;
            PlayMusic.imageViewR.setEnabled(false);
            soundsChoose(17);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundS(View view) {
        if (PlayMusic.S == 0) {
            PlayMusic.S = 1;
            PlayMusic.imageViewS.setEnabled(false);
            soundsChoose(18);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundT(View view) {
        if (PlayMusic.T == 0) {
            PlayMusic.T = 1;
            PlayMusic.imageViewT.setEnabled(false);
            soundsChoose(19);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundU(View view) {
        if (PlayMusic.U == 0) {
            PlayMusic.U = 1;
            PlayMusic.imageViewU.setEnabled(false);
            soundsChoose(20);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundF(View view) {
        if (PlayMusic.F == 0) {
            PlayMusic.F = 1;
            PlayMusic.imageViewF.setEnabled(false);
            soundsChoose(21);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundH(View view) {
        if (PlayMusic.H == 0) {
            PlayMusic.H = 1;
            PlayMusic.imageViewH.setEnabled(false);
            soundsChoose(22);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundCE(View view) {
        if (PlayMusic.CE == 0) {
            PlayMusic.CE = 1;
            PlayMusic.imageViewCE.setEnabled(false);
            soundsChoose(23);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundCH(View view) {
        if (PlayMusic.CH == 0) {
            PlayMusic.CH = 1;
            PlayMusic.imageViewCH.setEnabled(false);
            soundsChoose(24);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundSH(View view) {
        if (PlayMusic.SH == 0) {
            PlayMusic.SH = 1;
            PlayMusic.imageViewSH.setEnabled(false);
            soundsChoose(25);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundSHE(View view) {
        if (PlayMusic.SHE == 0) {
            PlayMusic.SHE = 1;
            PlayMusic.imageViewSHE.setEnabled(false);
            soundsChoose(26);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundSolid(View view) {
        if (PlayMusic.Sol == 0) {
            PlayMusic.Sol = 1;
            PlayMusic.imageViewSolid.setEnabled(false);
            soundsChoose(27);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundIii(View view) {
        if (PlayMusic.Iii == 0) {
            PlayMusic.Iii = 1;
            PlayMusic.imageViewIii.setEnabled(false);
            soundsChoose(28);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundSoft(View view) {
        if (PlayMusic.Sof == 0) {
            PlayMusic.Sof = 1;
            PlayMusic.imageViewSoft.setEnabled(false);
            soundsChoose(29);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundEa(View view) {
        if (PlayMusic.Ea == 0) {
            PlayMusic.Ea = 1;
            PlayMusic.imageViewEa.setEnabled(false);
            soundsChoose(30);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundYu(View view) {
        if (PlayMusic.Yu == 0) {
            PlayMusic.Yu = 1;
            PlayMusic.imageViewYu.setEnabled(false);
            soundsChoose(31);
            PlayMusic.BreakLetterSounds();

        }
    }

    public void soundYa(View view) {
        if (PlayMusic.Ya == 0) {
            PlayMusic.Ya = 1;
            PlayMusic.imageViewYa.setEnabled(false);
            soundsChoose(32);
            PlayMusic.BreakLetterSounds();

        }
    }


    private void soundsChoose(int i) {


        switch (i) {
            case 0:
                soundA = MediaPlayer.create(getApplicationContext(), R.raw.a);
                soundA.start();
                break;
            case 1:
                soundB = MediaPlayer.create(getApplicationContext(), R.raw.b);
                soundB.start();
                break;
            case 2:
                soundVE = MediaPlayer.create(getApplicationContext(), R.raw.v);
                soundVE.start();
                break;
            case 3:
                soundGE = MediaPlayer.create(getApplicationContext(), R.raw.g);
                soundGE.start();
                break;
            case 4:
                soundDE = MediaPlayer.create(getApplicationContext(), R.raw.d);
                soundDE.start();
                break;
            case 5:
                soundE = MediaPlayer.create(getApplicationContext(), R.raw.e);
                soundE.start();
                break;
            case 6:
                soundYO = MediaPlayer.create(getApplicationContext(), R.raw.ee);
                soundYO.start();
                break;
            case 7:
                soundJE = MediaPlayer.create(getApplicationContext(), R.raw.je);
                soundJE.start();
                break;
            case 8:
                soundZE = MediaPlayer.create(getApplicationContext(), R.raw.ze);
                soundZE.start();
                break;
            case 9:
                soundI = MediaPlayer.create(getApplicationContext(), R.raw.i);
                soundI.start();
                break;
            case 10:
                soundIyo = MediaPlayer.create(getApplicationContext(), R.raw.iyo);
                soundIyo.start();
                break;

            case 11:
                soundK = MediaPlayer.create(getApplicationContext(), R.raw.k);
                soundK.start();
                break;

            case 12:
                soundL = MediaPlayer.create(getApplicationContext(), R.raw.l);
                soundL.start();
                break;

            case 13:
                soundM = MediaPlayer.create(getApplicationContext(), R.raw.m);
                soundM.start();
                break;

            case 14:
                soundN = MediaPlayer.create(getApplicationContext(), R.raw.n);
                soundN.start();
                break;

            case 15:
                soundO = MediaPlayer.create(getApplicationContext(), R.raw.o);
                soundO.start();
                break;

            case 16:
                soundP = MediaPlayer.create(getApplicationContext(), R.raw.p);
                soundP.start();
                break;

            case 17:
                soundR = MediaPlayer.create(getApplicationContext(), R.raw.r);
                soundR.start();
                break;

            case 18:
                soundS = MediaPlayer.create(getApplicationContext(), R.raw.s);
                soundS.start();
                break;
            case 19:
                soundT = MediaPlayer.create(getApplicationContext(), R.raw.t);
                soundT.start();
                break;
            case 20:
                soundU = MediaPlayer.create(getApplicationContext(), R.raw.u);
                soundU.start();
                break;
            case 21:
                soundF = MediaPlayer.create(getApplicationContext(), R.raw.f);
                soundF.start();
                break;
            case 22:
                soundH = MediaPlayer.create(getApplicationContext(), R.raw.h);
                soundH.start();
                break;
            case 23:
                soundCE = MediaPlayer.create(getApplicationContext(), R.raw.ce);
                soundCE.start();
                break;
            case 24:
                soundCH = MediaPlayer.create(getApplicationContext(), R.raw.ch);
                soundCH.start();
                break;
            case 25:
                soundSH = MediaPlayer.create(getApplicationContext(), R.raw.sh);
                soundSH.start();
                break;
            case 26:
                soundSHE = MediaPlayer.create(getApplicationContext(), R.raw.she);
                soundSHE.start();
                break;
            case 27:
                soundSolid = MediaPlayer.create(getApplicationContext(), R.raw.solid);
                soundSolid.start();
                break;

            case 28:
                soundIii = MediaPlayer.create(getApplicationContext(), R.raw.iii);
                soundIii.start();
                break;

            case 29:
                soundSoft = MediaPlayer.create(getApplicationContext(), R.raw.soft);
                soundSoft.start();
                break;

            case 30:
                soundEa = MediaPlayer.create(getApplicationContext(), R.raw.eee);
                soundEa.start();
                break;

            case 31:
                soundYu = MediaPlayer.create(getApplicationContext(), R.raw.you);
                soundYu.start();
                break;

            case 32:
                soundYa = MediaPlayer.create(getApplicationContext(), R.raw.ya);
                soundYa.start();
                break;


        }


    }


}

