package com.example.travelguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecActivityFirst extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondact);
		ImageView img1 = (ImageView) findViewById(R.id.Valencia_pic);
		img1.setImageResource(R.drawable.valencia);
		TextView txt1 = (TextView) findViewById(R.id.valencia_des);
		txt1.getText().toString();
		Button fav_1=(Button)findViewById(R.id.fav1);//on clicklistner create a listview and use addapter to add img
		ScrollView s1=(ScrollView)findViewById(R.id.scrollview1);//?

		ImageView img2 = (ImageView) findViewById(R.id.Temple);
		img1.setImageResource(R.drawable.temple);
		TextView txt2 = (TextView) findViewById(R.id.temple_des);
		txt1.getText().toString();
		Button fav_2=(Button)findViewById(R.id.fav2);
		ScrollView s2=(ScrollView)findViewById(R.id.scrollview2);

		ImageView img3 = (ImageView) findViewById(R.id.myrtles_pic);
		img1.setImageResource(R.drawable.myrtles);
		TextView txt3 = (TextView) findViewById(R.id.myrtles_des);
		txt1.getText().toString();
		Button fav_3=(Button)findViewById(R.id.fav3);
		ScrollView s3=(ScrollView)findViewById(R.id.scrollview3);




	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.secact, menu);
		return true;
	}

}
