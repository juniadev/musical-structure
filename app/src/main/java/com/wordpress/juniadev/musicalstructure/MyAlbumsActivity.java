package com.wordpress.juniadev.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MyAlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_albums);

        ImageView albumImage1 = (ImageView) findViewById(R.id.album_image_1);
        albumImage1.setOnClickListener(new AlbumOnClickListener());

        ImageView albumImage2 = (ImageView) findViewById(R.id.album_image_2);
        albumImage2.setOnClickListener(new AlbumOnClickListener());
    }
}
