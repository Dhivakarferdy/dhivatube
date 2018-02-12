package com.tutorial.streaming;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

public class VideoStreamActivity extends Activity {

	Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Get the layout from video_main.xml
		setContentView(R.layout.main);

		// Locate the button in activity_main.xml
		button = (Button) findViewById(R.id.button1);

		// Capture button clicks
		button.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {

				// Start NewActivity.class
				Intent myIntent = new Intent(VideoStreamActivity.this, Show.class);
				startActivity(myIntent);
			}
		});
	}

}