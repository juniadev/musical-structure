package com.wordpress.juniadev.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myAlbumsButton = (Button) findViewById(R.id.my_albums_button);
        myAlbumsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MyAlbumsActivity.class));
            }
        });

        Button searchButton = (Button) findViewById(R.id.search_button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SearchActivity.class));
            }
        });

        ImageView lastPlayedAlbumImage = (ImageView) findViewById(R.id.last_played_album_image);
        lastPlayedAlbumImage.setOnClickListener(new AlbumOnClickListener());
    }
}
