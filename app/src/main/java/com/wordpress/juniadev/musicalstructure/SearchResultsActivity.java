package com.wordpress.juniadev.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SearchResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);

        TextView searchResultAlbum = (TextView) findViewById(R.id.search_result_album);
        searchResultAlbum.setOnClickListener(new AlbumOnClickListener());

        TextView searchResultSong = (TextView) findViewById(R.id.search_result_song);
        searchResultSong.setOnClickListener(new AlbumOnClickListener());
    }
}
