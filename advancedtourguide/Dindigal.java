package com.example.advancedtourguide;

import java.util.ArrayList;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class Dindigal extends Activity {

	ListView lv;
	TextView tv1,tv2,tv3;
	ArrayList<String> al;
	ArrayAdapter<String> aa;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dindigal);
		
		lv=(ListView) findViewById(R.id.listView1);
		tv1=(TextView) findViewById(R.id.textView1);
		tv2=(TextView) findViewById(R.id.textView2);
		tv3=(TextView) findViewById(R.id.textView3);
		
		tv3.setText("           Dindigul District is an administrative region in the south of Tamil Nadu , India. The District was carved out of Madurai District. Dindigul has 200,000 hectares of cultivable land, and agriculture continues to be main occupation of its inhabitants.Dindigal has a number of historical monuments,the Rock Fort being the most prominent.Its name in the Tamil language means 'The Gift of the Forest'. Kodaikanal is referred to as the 'Princess of Hill stations'and has a long history as a retreat and popular tourist destination. ");
		
		al=new ArrayList<String>();
		aa=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_expandable_list_item_1,al);
		lv.setAdapter(aa);
		
		al.add("Place to Visit");
		al.add("Attraction");
		aa.notifyDataSetChanged();
		
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				
				switch(arg2)
				{
				case 0:
					Intent i=new Intent(getApplicationContext(),Dindigal_Place.class);
					startActivity(i);
					break;
				case 1:
					Intent j=new Intent(getApplicationContext(),Dindigal_Attraction.class);
					startActivity(j);
					break;
					
				}
				
			}
		});
	
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dindigal, menu);
		return true;
	}

}
