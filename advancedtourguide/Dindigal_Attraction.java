package com.example.advancedtourguide;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Dindigal_Attraction extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dindigal__attraction);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dindigal__attraction, menu);
		return true;
	}

}
