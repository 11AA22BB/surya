package com.example.advancedtourguide;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Chennai_Place extends Activity {
	ListView lv;
    ArrayList<String>al;
    ArrayAdapter<String>aa;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chennai__place);
		lv=(ListView) findViewById(R.id.listView1);
		al=new ArrayList<String>();
		aa=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,al);
		lv.setAdapter(aa);
		
		al.add("Marina Beach");
		al.add("St.Thomas cathedral Basilica");
		al.add("Government Museum");
		al.add("Vadapalani Andavar Temple");
		al.add("Fort St.George");
		al.add("Parthasarathy Temple");
		al.add("Kapaleeshwarar Temple");
		al.add("Vivekanandar Ilam");
		al.add("Spencer Plaza");
		al.add("Edward Elliot's Beach");
		
		aa.notifyDataSetChanged();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.chennai__place, menu);
		return true;
	}

}
