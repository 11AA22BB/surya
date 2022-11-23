package com.example.advancedtourguide;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class Aboutus extends Activity {
	TextView tv1,tv2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_aboutus);
		
		tv1=(TextView) findViewById(R.id.textView1);
		tv2=(TextView) findViewById(R.id.textView2);
				
		tv2.setText("         Advanced Tour Guide app developed by III B.Sc(IT).This App provide Information on Places to visit, getting there weather view and map view for major cities in TamilNadu Such as Coimbatore, Chennai, Erode, Trichy, Dindigal, Nilgiris, Kanyakumari, Tiruppur, Theni. ");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.aboutus, menu);
		return true;
	}

}
