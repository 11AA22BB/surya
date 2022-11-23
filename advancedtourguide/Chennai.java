package com.example.advancedtourguide;

import java.util.ArrayList;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Chennai extends Activity {
	ListView lv;
	TextView tv1,tv2,tv3;
	ArrayList<String> al;
	ArrayAdapter<String> aa;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chennai);
		
		tv1=(TextView) findViewById(R.id.textView1);
		tv2=(TextView) findViewById(R.id.textView2);
		tv3=(TextView) findViewById(R.id.textView3);
		
		tv3.setText("         Chennai, formerly known as Madras,is the capital of the state of Tamil Nadu and is India&apos;s fourth largest city.It is located on the Coromandelcoast of the Bay of Bengal. With an estimated population of 8.9 million (2014),the 400-year-old city is the 34st largest metropolitan area in the world. It has the Second longest seashore in the world. In 1996, the TamilNadu Goverment renamed 'Madras' to 'Chennai' Providing the reason that 'Chennai was the cities' traditional name while madras was one derived during colonial rule.");
		
		lv=(ListView) findViewById(R.id.listView1);
		al=new ArrayList<String>();
		aa=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,al);
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
					Intent i=new Intent(getApplicationContext(),Chennai_Place.class);
					startActivity(i);
					break;
				case 1:
					Intent j=new Intent(getApplicationContext(),Chennai_Attraction.class);
					startActivity(j);
					break;
					
				}
				
			}
		});
	
		
				
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.chennai, menu);
		return true;
	}

}
