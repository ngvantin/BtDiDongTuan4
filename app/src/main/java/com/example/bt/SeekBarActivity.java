package com.example.bt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;

public class SeekBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);

        //SeekBar
        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            // pt đc gọi khi thay đổi seekbar, progress là gtri hien tai
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//progress: giá trị của seekbar
                Log.d("AAA","Giá trị:" + progress);
            }
            @Override
            // đc gọi khi người dùng bắt đầu chạm vào seekbar
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.d("AAA","Start");
            }
            @Override
            // kết thúc chạm seekbar
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.d("AAA","Stop");// ghi vào logcat chứ ko hiển thiện lên màn hình
            }});
    }
}