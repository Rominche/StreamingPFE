package fr.eseo.i3.ld.streamingpfe;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.MediaController;
import android.widget.VideoView;

public class MovieActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        MediaController mediaController = new MediaController(this);

        videoView = findViewById(R.id.film);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        Uri uri = Uri.parse("https://developers.google.com/training/images/tacoma_narrows.mp4");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}