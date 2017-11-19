package jasontuchler.com.videoviewexample;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView player = (VideoView) findViewById(R.id.player);
        //Enter your url in String url
        String url = "http://test/vod/sample.mp4/playlist.m3u8";
        player.setVideoURI(Uri.parse(url));
        player.setMediaController(new MediaController(this));
        player.requestFocus();
        player.start();

    }
}
