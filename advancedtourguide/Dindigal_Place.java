package com.example.advancedtourguide;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Dindigal_Place extends Activity {
	
	ListView lv;
    ArrayList<String>al;
    ArrayAdapter<String>aa;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dindigal__place);
	
		lv=(ListView) findViewById(R.id.listView1);
		al=new ArrayList<String>();
		aa=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,al);
		lv.setAdapter(aa);
		
		al.add("Sri Abirami Amman Temple");
		al.add("Silver Cascade Falls");
		al.add("Sendrayar perumal Temple");
		al.add("Dindugal Fort");
		al.add("Sirumalai Reserve Forest");
		al.add("Kamarajar Lake");
		al.add("Sri Kottai Mariamman Temple");
		al.add("Thalaiyar Falls");
		al.add("Moer Point");
		al.add("Green Valley View");
		al.add("Telescope House");
		
		
		aa.notifyDataSetChanged();
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dindigal__place, menu);
		return true;
	}

}
