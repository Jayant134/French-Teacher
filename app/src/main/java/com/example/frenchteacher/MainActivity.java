package com.example.frenchteacher;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button blackbtn, greenbtn, purplebtn, yellowbtn, redbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blackbtn = findViewById(R.id.blackButton);
        greenbtn = findViewById(R.id.greenButton);
        purplebtn = findViewById(R.id.purpleButton);
        yellowbtn = findViewById(R.id.yellowButton);
        redbtn = findViewById(R.id.redButton);

        blackbtn.setOnClickListener(this);
        greenbtn.setOnClickListener(this);
        purplebtn.setOnClickListener(this);
        yellowbtn.setOnClickListener(this);
        redbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int clickedBtnId = view.getId();
        if(clickedBtnId == R.id.blackButton){
            playMusic(R.raw.black);
        }else if(clickedBtnId == R.id.greenButton){
            playMusic(R.raw.green);
        }else if(clickedBtnId == R.id.purpleButton){
            playMusic(R.raw.purple);
        }else if(clickedBtnId == R.id.yellowButton){
            playMusic(R.raw.yellow);
        }else if(clickedBtnId == R.id.redButton){
            playMusic(R.raw.red);
        }
    }

    public void playMusic(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, id);
        Log.d("AUDIO TEST", "button clicked");
        if(mediaPlayer == null){
            Log.d("AUDIO TEST", "null is associated");
        }
        mediaPlayer.start();
    }
}