package musicapp.example.com.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * we will use the Adapter to display the playlist in the ListView
 */
public class PlayListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);
    }
}
