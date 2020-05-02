package com.example.collegeexperience;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class BackgroundMusicService extends Service {
    private MediaPlayer backingMusic;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //backingMusic = MediaPlayer.create(this, R.raw.head_candy);
        backingMusic.setLooping(true);
        backingMusic.start();
        return START_STICKY;
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        backingMusic.stop();
    }
}
