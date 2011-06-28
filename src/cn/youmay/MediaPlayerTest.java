package cn.youmay;

import java.io.File;

import android.app.Activity;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


public class MediaPlayerTest extends Activity {
	
	private VideoView video;
	private MediaController ctrl;
	private MediaPlayer mediaPlayer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		getWindow().setFormat(PixelFormat.TRANSLUCENT);
		setContentView(R.layout.video);
		File clip=new File("/sdcard/music/car2.mp4");
		boolean f=clip.exists();
		
		video=(VideoView)findViewById(R.id.videoView1);
		video.setVideoURI(Uri.parse("http://daily3gp.com/vids/family_guy_penis_car.3gp"));
		//video.setVideoPath(clip.getAbsolutePath());
		
		ctrl=new MediaController(this);
		ctrl.setMediaPlayer(video);
		video.setMediaController(ctrl);
		video.requestFocus();
		//video.prepare();
		video.start();

	}
}
