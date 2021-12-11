package com.example.travelguide;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class FifthActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fifthaction);
		TextView t1 = (TextView) findViewById(R.id.train);
		TextView t1a = (TextView) findViewById(R.id.train_des);
		ScrollView sc16=(ScrollView)findViewById(R.id.scrollview16)
		TextView t2 = (TextView) findViewById(R.id.bus);
		TextView t2a = (TextView) findViewById(R.id.bus_des);
		ScrollView sc18=(ScrollView)findViewById(R.id.scrollview18);

		TextView t3 = (TextView) findViewById(R.id.car);
		TextView t3a = (TextView) findViewById(R.id.car_des);
		ScrollView sc20=(ScrollView)findViewById(R.id.scrollview20);

		TextView t4 = (TextView) findViewById(R.id.taxi);
		TextView t4a = (TextView) findViewById(R.id.taxi_des);
		ScrollView sc22=(ScrollView)findViewById(R.id.scrollview22);


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fifth, menu);
		return true;
	}

}
