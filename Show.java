package com.tutorial.streaming;

import android.app.Activity;
import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

public class Show extends Activity{
	
	
	ProgressDialog pd;
	VideoView view;
	String URL = "http://www.androidbegin.com/tutorial/AndroidCommercial.3gp";
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.video);
		
		
		view = (VideoView)findViewById(R.id.videoView1);
		pd = new ProgressDialog(Show.this);
		
		pd.setTitle("Video Streamming Demo");
		
		pd.setMessage("Buffering...");
		
		pd.setIndeterminate(false);
		
		pd.setCancelable(false);
		
		pd.show();
		
		 try{
			 
			 MediaController controller = new MediaController(Show.this);
			 
			 controller.setAnchorView(view);
			 
			 Uri vid = Uri.parse(URL);
			 
			 view.setMediaController(controller);
			 
			 view.setVideoURI(vid);
			 
			 
		      }catch(Exception e){
		    	  
		    	  
		    	  Log.e("Error", e.getMessage());
		    	  
		    	  e.printStackTrace();
		    	  
		    	  
		      }
		 
		 view.requestFocus();
		 view.setOnPreparedListener(new OnPreparedListener() {
			
			public void onPrepared(MediaPlayer mp) {
				// TODO Auto-generated method stub
				
				
				pd.dismiss();
				
				view.start();
				
				
				
			}
		});
		
		
		
		
	}
	
	
}
