package com.example.advancedtourguide;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Coimbatore_Place extends Activity {
	
	ListView lv;
    ArrayList<String>al;
    ArrayAdapter<String>aa;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_coimbatore__place);
		
		lv=(ListView) findViewById(R.id.listView1);
		al=new ArrayList<String>();
		aa=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,al);
		lv.setAdapter(aa);
		
		al.add("Siruvani Waterfalls");
		al.add("Monkey falls");
		al.add("VOC park and Zoo");
		al.add("Amaravathi Dam");
		al.add("Black Thunder");
		al.add("Singanallaru Lake");
		al.add("Kovai Kondattam");
		al.add("Gass Forest Museum");
		al.add("Dhyanalinga Temple");
		al.add("Naga Sai Mandir");
		
		aa.notifyDataSetChanged();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.coimbatore__place, menu);
		return true;
	}

}
