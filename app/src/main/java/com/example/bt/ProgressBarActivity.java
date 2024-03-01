package com.example.bt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;

public class ProgressBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar2);
        ImageButton img2 = (ImageButton) findViewById(R.id.imageButton1);
        // bài 1 progressbar

        /*img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int current = progressBar.getProgress();
                progressBar.setProgress(current + 10);
            }
        });*/

        // bài 2 progressbar
        /*
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int current = progressBar.getProgress();
                //chạy đều đều >100 quay về 0
                if (current>= progressBar.getMax()){
                    current=0;
                }
                progressBar.setProgress(current + 10); //thiết lập progress
            }
        });*/

        // bài 3 progressbar
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tự đếm progress 10s mỗi tick 1s
                CountDownTimer countDownTimer = new CountDownTimer(10000,1000) {
                    @Override
                    //được gọi sau mỗi khoảng thời gian giữa các tick.
                    public void onTick(long millisUntilFinished) {
                        int current = progressBar.getProgress();
                        //chạy đều đều >100 quay về 0
                        if (current>= progressBar.getMax()){
                            current=0;
                        }
                        progressBar.setProgress(current + 10); //thiết lập progress
                    }
                    @Override
                    public void onFinish() {
                        Toast.makeText(ProgressBarActivity.this,"Hết giờ",Toast.LENGTH_LONG).show();
                    }
                };
                // lần click tiếp theo sẽ đếm ngược tt
                countDownTimer.start();
            }
        });
    }
}