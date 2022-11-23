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

public class Coimbatore extends Activity {
	ListView lv;
	TextView tv1,tv2,tv3;
	ArrayList<String> al;
	ArrayAdapter<String> aa;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_coimbatore);
		lv=(ListView) findViewById(R.id.listView1);
		tv1=(TextView) findViewById(R.id.textView1);
		tv2=(TextView) findViewById(R.id.textView2);
		tv3=(TextView) findViewById(R.id.textView3);
		
		tv3.setText("            Coimbatore is a major industrial city in, Tamil Nadu.Often likened to being the Manchester or Detroit of southern india.It's famous for the manufacture of motor pump sets and varied engineering goods. The Tamil Spoken here is called Kongu Tamil. It's one of the upcoming Information Technology Hub with new initiatives from the state Goverment has that pride of having the world second Tastiest water 'Siruvani water'. ");
		
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
					Intent i=new Intent(getApplicationContext(),Coimbatore_Place.class);
					startActivity(i);
					break;
				case 1:
					Intent j=new Intent(getApplicationContext(),Coimbatore_Attraction.class);
					startActivity(j);
					break;
					
				}
			}
			});
		
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.coimbatore, menu);
		return true;
	}

}
