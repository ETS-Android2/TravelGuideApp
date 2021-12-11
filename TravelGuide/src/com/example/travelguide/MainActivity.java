package com.example.travelguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button click_historic = (Button) findViewById(R.id.HistoricSites);
		Button click_intrests = (Button) findViewById(R.id.points_interests);
		Button click_transport= (Button) findViewById(R.id.Transports);
		Button click_hotels= (Button) findViewById(R.id.Hotels);


		click_historic.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent nexxt = new Intent(getApplicationContext(),
						SecActivityFirst.class);
				startActivity(nexxt);
			}
		});
		click_intrests.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent next = new Intent(getApplicationContext(),
						ThirdActivity.class);
				startActivity(next);
			}
		});
		click_transport.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent n= new Intent(getApplicationContext(),
						FourthAct.class);
				startActivity(n);
			}
		});
		click_hotels.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent nt = new Intent(getApplicationContext(),
						FifthActivity.class);
				startActivity(nt);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
