package com.example.flixstermovies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.codepath.asynchttpclient.AsyncHttpClient;
import com.codepath.asynchttpclient.callback.JsonHttpResponseHandler;
import com.example.flixstermovies.models.Movie;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import okhttp3.Headers;

public class MovieTrailerActivity extends YouTubeBaseActivity {

    public static final String YOUTUBE_API_KEY = "AIzaSyB7p23Pq5Clwu_bkYSmVUPbTdL9_rnQr_g";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_trailer);

        final String videoId = "tKodtNFpzBA";

        YouTubePlayerView youTubePlayerView =
                (YouTubePlayerView) findViewById(R.id.player);
        youTubePlayerView.initialize(YOUTUBE_API_KEY,
                new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider,
                                                        YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.cueVideo(videoId);
                    }
                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider,
                                                        YouTubeInitializationResult youTubeInitializationResult) {
                        Log.e("MovieTrailerActivity", "Error initializing YouTube player");
                    }
                });
    }
}