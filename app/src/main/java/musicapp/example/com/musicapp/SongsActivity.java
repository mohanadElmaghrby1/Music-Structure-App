package musicapp.example.com.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * we will use the MediaPlayer class to play music and control the running
 * of the music
 */
public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
    }
}
