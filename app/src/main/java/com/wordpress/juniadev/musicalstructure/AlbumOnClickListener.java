package com.wordpress.juniadev.musicalstructure;

import android.content.Intent;
import android.view.View;

/**
 * OnClickListener activated when the user clicks on an album, to go to the Now Playing activity.
 */
public class AlbumOnClickListener implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        v.getContext().startActivity(new Intent(v.getContext(), NowPlayingActivity.class));
    }
}
