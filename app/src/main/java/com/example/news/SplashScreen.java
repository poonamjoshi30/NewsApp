package com.example.news;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.StrictMode;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TableRow;
import android.widget.TextView;
import com.github.ybq.android.spinkit.style.ThreeBounce;
import com.example.news.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    ImageView splashimageView2;
    ProgressBar progressBar;
    SharedPreferences mSharedPreferences;
    SharedPreferences.Editor editor;
    //    int images[] = {R.drawable.splash1, R.drawable.splash2, R.drawable.splash3};
    String result = "";


    TextView btnretry;
    TableRow tblRetry, tblProgress;


    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);


        splashimageView2 = findViewById(R.id.splashimageView2);

        progressBar = (ProgressBar) findViewById(R.id.spin_kit);


        tblProgress = (TableRow) findViewById(R.id.tblProgress);


//        Random r = new Random();
//        int p = r.nextInt(images.length);
        /*Uri uri=Uri.parse(getResources().getDrawable(images[p]).toString());
        Glide.with(this).
                load(uri)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(splashimageView2);*/
        splashimageView2.setImageDrawable(getResources().getDrawable(R.drawable.icon1));


            tblProgress.setVisibility(View.VISIBLE);
        ThreeBounce doubleBounce = new ThreeBounce();
        progressBar.setIndeterminateDrawable(doubleBounce);



        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(SplashScreen.this,Login.class);
                startActivity(i);
            }
        }, 5000);
        }




}



