package ru.traveltojapan.firstknowledge;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class PlayMusic extends Application {
    public static boolean Music = true;
    public static int zero0, one1, two2, three3, four4, five5, six6, seven7, eight8, nine9;
    public static int A, B, VE, GE, DE, E, YO, JE, ZE, I, Iyo, K, L, M, N, O, P, R, S, T, U, F, H, CE, CH, SH, SHE, Sol, Iii, Sof, Ea, Yu, Ya;



    @SuppressLint("StaticFieldLeak")
    public static ImageView imageViewA, imageViewB, imageViewVE, imageViewGE, imageViewDE, imageViewE,
            imageViewYO, imageViewJE, imageViewZE, imageViewI, imageViewIyo, imageViewK, imageViewL, imageViewM,
            imageViewN, imageViewO, imageViewP, imageViewR, imageViewS, imageViewT, imageViewU, imageViewF, imageViewH,
            imageViewCE, imageViewCH, imageViewSH, imageViewSHE, imageViewSolid, imageViewIii, imageViewSoft, imageViewEa,
            imageViewYu, imageViewYa;

    @SuppressLint("StaticFieldLeak")
    public static ImageView imageView0, imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9;




    public static void PutFalse() {
        Music = false;
    }


    public static void MusicLooperMain() {

        if (Music) {
            MainActivity.imageButtonMusicOn.setVisibility(View.VISIBLE);
            MainActivity.imageButtonMusicOff.setVisibility(View.INVISIBLE);
            PlayMusic.BreakBetweenActivities();

        } else {
            MainActivity.mPlayer.stop();
            MainActivity.mPlayer.setLooping(false);
            MainActivity.imageButtonMusicOn.setVisibility(View.INVISIBLE);
            MainActivity.imageButtonMusicOff.setVisibility(View.VISIBLE);
        }
    }

    public static void MusicLooperLetters() {

        if (Music) {
            LettersActivity.imageButtonMusicOn.setVisibility(View.VISIBLE);
            LettersActivity.imageButtonMusicOff.setVisibility(View.INVISIBLE);
            PlayMusic.BreakBetweenAktivitiesLatters();

        } else {
            LettersActivity.mPlayer.stop();
            LettersActivity.mPlayer.setLooping(false);
            LettersActivity.imageButtonMusicOn.setVisibility(View.INVISIBLE);
            LettersActivity.imageButtonMusicOff.setVisibility(View.VISIBLE);
        }
    }

    public static void MusicLooperNumbs() {

        if (Music) {
            NumbsActivity.imageButtonMusicOn.setVisibility(View.VISIBLE);
            NumbsActivity.imageButtonMusicOff.setVisibility(View.INVISIBLE);
            PlayMusic.BreakBetweenAktivitiesNumbs();

        } else {
            NumbsActivity.mPlayer.stop();
            NumbsActivity.mPlayer.setLooping(false);
            NumbsActivity.imageButtonMusicOn.setVisibility(View.INVISIBLE);
            NumbsActivity.imageButtonMusicOff.setVisibility(View.VISIBLE);
        }
    }

    public static void BreakBetweenActivities() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                MainActivity.mPlayer.start();
                MainActivity.mPlayer.setLooping(true);

            }

        }, 350);

    }

    public static void BreakBetweenAktivitiesLatters() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                LettersActivity.mPlayer.start();
                LettersActivity.mPlayer.setLooping(true);

            }

        }, 350);

    }

    public static void BreakBetweenAktivitiesNumbs() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                NumbsActivity.mPlayer.start();
                NumbsActivity.mPlayer.setLooping(true);

            }

        }, 350);

    }

    public static void BreakLetterSounds() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                if (A == 1) {
                    A = 0;
                    soundLongLettersA();
                }
                if (B == 1) {
                    B = 0;
                    soundLongLettersB();
                }
                if (VE == 1) {
                    VE = 0;
                    soundLongLettersVE();
                }
                if (GE == 1) {
                    GE = 0;
                    soundLongLettersGE();
                }
                if (DE == 1) {
                    DE = 0;
                    soundLongLettersDE();
                }
                if (E == 1) {
                    E = 0;
                    soundLongLettersE();
                }
                if (YO == 1) {
                    YO = 0;
                    soundLongLettersYO();
                }
                if (JE == 1) {
                    JE = 0;
                    soundLongLettersJE();
                }
                if (ZE == 1) {
                    ZE = 0;
                    soundLongLettersZE();
                }
                if (I == 1) {
                    I = 0;
                    soundLongLettersI();
                }
                if (Iyo == 1) {
                    Iyo = 0;
                    soundLongLettersIYO();
                }
                if (K == 1) {
                    K = 0;
                    soundLongLettersK();
                }
                if (L == 1) {
                    L = 0;
                    soundLongLettersL();
                }
                if (M == 1) {
                    M = 0;
                    soundLongLettersM();
                }
                if (N == 1) {
                    N = 0;
                    soundLongLettersN();
                }
                if (O == 1) {
                    O = 0;
                    soundLongLettersO();
                }
                if (P == 1) {
                    P = 0;
                    soundLongLettersP();
                }
                if (R == 1) {
                    R = 0;
                    soundLongLettersR();
                }
                if (S == 1) {
                    S = 0;
                    soundLongLettersS();
                }
                if (T == 1) {
                    T = 0;
                    soundLongLettersT();
                }
                if (U == 1) {
                    U = 0;
                    soundLongLettersU();
                }
                if (F == 1) {
                    F = 0;
                    soundLongLettersF();
                }
                if (H == 1) {
                    H = 0;
                    soundLongLettersH();
                }
                if (CE == 1) {
                    CE = 0;
                    soundLongLettersCE();
                }
                if (CH == 1) {
                    CH = 0;
                    soundLongLettersCH();
                }
                if (SH == 1) {
                    SH = 0;
                    soundLongLettersSH();
                }
                if (SHE == 1) {
                    SHE = 0;
                    soundLongLettersSHE();
                }
                if (Sol == 1) {
                    Sol = 0;
                    soundLongLettersSOL();
                }
                if (Iii == 1) {
                    Iii = 0;
                    soundLongLettersIII();
                }
                if (Sof == 1) {
                    Sof = 0;
                    soundLongLettersSOF();
                }
                if (Ea == 1) {
                    Ea = 0;
                    soundLongLettersEA();
                }
                if (Yu == 1) {
                    Yu = 0;
                    soundLongLettersYU();
                }
                if (Ya == 1) {
                    Ya = 0;
                    soundLongLettersYA();
                }

            }

        }, 500);

    }




    public static void BreakNumbsSounds() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                if (PlayMusic.zero0 == 1) {
                    PlayMusic.zero0 = 0;
                    soundLongLNumbs0();
                }
                if (PlayMusic.one1 == 1) {
                    PlayMusic.one1 = 0;
                    soundLongLNumbs1();
                }
                if (PlayMusic.two2 == 1) {
                    PlayMusic.two2 = 0;
                    soundLongLNumbs2();
                }
                if (PlayMusic.three3 == 1) {
                    PlayMusic.three3 = 0;
                    soundLongLNumbs3();
                }
                if (PlayMusic.four4 == 1) {
                    PlayMusic.four4 = 0;
                    soundLongLNumbs4();
                }
                if (PlayMusic.five5 == 1) {
                    PlayMusic.five5 = 0;
                    soundLongLNumbs5();
                }
                if (PlayMusic.six6 == 1) {
                    PlayMusic.six6 = 0;
                    soundLongLNumbs6();
                }
                if (PlayMusic.seven7 == 1) {
                    PlayMusic.seven7 = 0;
                    soundLongLNumbs7();
                }
                if (PlayMusic.eight8 == 1) {
                    PlayMusic.eight8 = 0;
                    soundLongLNumbs8();
                }
                if (PlayMusic.nine9 == 1) {
                    PlayMusic.nine9 = 0;
                    soundLongLNumbs9();
                }

            }

        }, 350);

    }

    public static void soundLongLNumbs0() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (zero0 == 0) {
                    PlayMusic.imageView0.setEnabled(true);

                }


            }

        }, 350);

    }

    public static void soundLongLNumbs1() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (one1 == 0) {
                    PlayMusic.imageView1.setEnabled(true);

                }


            }

        }, 350);

    }

    public static void soundLongLNumbs2() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (two2 == 0) {
                    PlayMusic.imageView2.setEnabled(true);

                }


            }

        }, 350);

    }

    public static void soundLongLNumbs3() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (three3 == 0) {
                    PlayMusic.imageView3.setEnabled(true);

                }


            }

        }, 350);

    }

    public static void soundLongLNumbs4() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (four4 == 0) {
                    PlayMusic.imageView4.setEnabled(true);

                }


            }

        }, 350);

    }

    public static void soundLongLNumbs5() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (five5== 0) {
                    PlayMusic.imageView5.setEnabled(true);

                }


            }

        }, 350);

    }

    public static void soundLongLNumbs6() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (six6 == 0) {
                    PlayMusic.imageView6.setEnabled(true);

                }


            }

        }, 350);

    }

    public static void soundLongLNumbs7() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (seven7 == 0) {
                    PlayMusic.imageView7.setEnabled(true);

                }


            }

        }, 350);

    }

    public static void soundLongLNumbs8() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (eight8 == 0) {
                    PlayMusic.imageView8.setEnabled(true);

                }


            }

        }, 350);

    }

    public static void soundLongLNumbs9() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (nine9 == 0) {
                    PlayMusic.imageView9.setEnabled(true);

                }


            }

        }, 350);

    }


    public static void soundLongLettersA() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (A == 0) {
                    PlayMusic.imageViewA.setEnabled(true);

                }


            }

        },400 );

    }

    public static void soundLongLettersB() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (B == 0) {
                    PlayMusic.imageViewB.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersVE() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (VE == 0) {
                    PlayMusic.imageViewVE.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersGE() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (GE == 0) {
                    PlayMusic.imageViewGE.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersDE() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (DE == 0) {
                    PlayMusic.imageViewDE.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersE() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (E == 0) {
                    PlayMusic.imageViewE.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersYO() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (YO == 0) {
                    PlayMusic.imageViewYO.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersJE() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (JE == 0) {
                    PlayMusic.imageViewJE.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersZE() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (ZE == 0) {
                    PlayMusic.imageViewZE.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersI() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (I == 0) {
                    PlayMusic.imageViewI.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersIYO() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (Iyo == 0) {
                    PlayMusic.imageViewIyo.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersK() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (K == 0) {
                    PlayMusic.imageViewK.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersL() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (L == 0) {
                    PlayMusic.imageViewL.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersM() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (M == 0) {
                    PlayMusic.imageViewM.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersN() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (N == 0) {
                    PlayMusic.imageViewN.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersO() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (O == 0) {
                    PlayMusic.imageViewO.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersP() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (P == 0) {
                    PlayMusic.imageViewP.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersR() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (R == 0) {
                    PlayMusic.imageViewR.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersS() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (S == 0) {
                    PlayMusic.imageViewS.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersT() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (T == 0) {
                    PlayMusic.imageViewT.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersU() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (U == 0) {
                    PlayMusic.imageViewU.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersF() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (F == 0) {
                    PlayMusic.imageViewF.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersH() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (H == 0) {
                    PlayMusic.imageViewH.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersCE() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (CE == 0) {
                    PlayMusic.imageViewCE.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersCH() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (CH == 0) {
                    PlayMusic.imageViewCH.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersSH() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (SH == 0) {
                    PlayMusic.imageViewSH.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersSHE() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (SHE == 0) {
                    PlayMusic.imageViewSHE.setEnabled(true);

                }


            }

        }, 400);

    }


    public static void soundLongLettersSOL() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (Sol == 0) {
                    PlayMusic.imageViewSolid.setEnabled(true);

                }

            }

        }, 650);

    }

    public static void soundLongLettersIII() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (Iii == 0) {
                    PlayMusic.imageViewIii.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersSOF() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (Sof == 0) {
                    PlayMusic.imageViewSoft.setEnabled(true);

                }


            }

        }, 650);

    }

    public static void soundLongLettersEA() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (Ea == 0) {
                    PlayMusic.imageViewEa.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersYU() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (Yu == 0) {
                    PlayMusic.imageViewYu.setEnabled(true);

                }


            }

        }, 400);

    }

    public static void soundLongLettersYA() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (Ya == 0) {
                    PlayMusic.imageViewYa.setEnabled(true);

                }


            }

        }, 400);

    }

}
