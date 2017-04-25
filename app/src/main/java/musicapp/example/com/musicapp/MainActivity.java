package musicapp.example.com.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView searchSelction ;
    Intent searchActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchSelction=(TextView)findViewById(R.id.search_selection);
        /*
        open the search activity to search for a song
         */
        searchActivity = new Intent(this , SearchActivity.class);
        searchSelction.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(searchActivity);
            }
        });

    }

    /**
     *open the device songs
     */
    public void openSongs(View view) {
        Intent song = new Intent(this , SongsActivity.class);
        startActivity(song);
    }

    /**
     * open the play list activity
     * @param view
     */
    public void openPlaylist(View view) {
        Intent playList = new Intent(this , PlayListActivity.class);
        startActivity(playList);
    }

    /**
     * open music artist list activity
     * @param view
     */
    public void openArtists(View view) {
        Intent artists = new Intent(this , ArtistsActivity.class);
        startActivity(artists);
    }

    /**
     * open the albums of the musics activity
     * @param view
     */
    public void openAlbums(View view) {
        Intent albums = new Intent(this , AlbumsActivity.class);
        startActivity(albums);
    }

}
