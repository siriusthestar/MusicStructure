package hr.grubelic.nevena.musicstructure;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the Search category
        TextView search = (TextView) findViewById(R.id.search);

        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Search View is clicked on.
            @Override
            public void onClick(View view) {
                //create a new intent to open the {@Link SearchActivity}
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        // Find the View that shows the Playing category
        TextView playing = (TextView) findViewById(R.id.playing);

        // Set a click listener on that View
        playing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Search View is clicked on.
            @Override
            public void onClick(View view) {
                //create a new intent to open the {@Link PlayingActivity}
                Intent playingIntent = new Intent(MainActivity.this, PlayingActivity.class);
                startActivity(playingIntent);
            }
        });

        // Find the View that shows the Playlist category
        TextView playlist = (TextView) findViewById(R.id.playlist);

        // Set a click listener on that View
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Playlist View is clicked on.
            @Override
            public void onClick(View view) {
                //create a new intent to open the {@Link PlaylistActivity}
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });

        // Find the View that shows the Albums category
        TextView albums = (TextView) findViewById(R.id.albums);

        // Set a click listener on that View
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Albums View is clicked on.
            @Override
            public void onClick(View view) {
                //create a new intent to open the {@Link AlbumsActivity}
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        // Find the View that shows the Artists category
        TextView artists = (TextView) findViewById(R.id.artists);

        // Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Artists View is clicked on.
            @Override
            public void onClick(View view) {
                //create a new intent to open the {@Link ArtistsActivity}
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        // Find the View that shows the Store category
        TextView store = (TextView) findViewById(R.id.store);

        // Set a click listener on that View
        store.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Store View is clicked on.
            @Override
            public void onClick(View view) {
                //create a new intent to open the {@Link StoreActivity}
                Intent storeIntent = new Intent(MainActivity.this, StoreActivity.class);
                startActivity(storeIntent);
            }
        });

    }
}
