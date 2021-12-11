package com.example.travelguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FourthAct extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fourthact);
		ImageView im1 = (ImageView) findViewById(R.id.euro_pic);
		im1.setImageResource(R.drawable.hoteleurostarspalace);
		TextView t10 = (TextView) findViewById(R.id.euro_des);
		Button b10=(Button)findViewById(R.id.fav10);
		ScrollView sc10=(ScrollView)findViewById(R.id.scrollview10);

		ImageView im2 = (ImageView) findViewById(R.id.exegran_pic);
		im2.setImageResource(R.drawable.exegranhotel);
		TextView t11 = (TextView) findViewById(R.id.exegran_des);

		Button b11=(Button)findViewById(R.id.fav11);
		ScrollView sc11=(ScrollView)findViewById(R.id.scrollview11);
		ImageView im3 = (ImageView) findViewById(R.id.saylu_pic);
		im3.setImageResource(R.drawable.hotelsaylu);
		TextView t12 = (TextView) findViewById(R.id.saylu_des);

		Button b13=(Button)findViewById(R.id.fav13);
		ScrollView sc13=(ScrollView)findViewById(R.id.scrollview13);
		ImageView im4 = (ImageView) findViewById(R.id.castil_pic);
		im4.setImageResource(R.drawable.castillahotel);
		TextView t13 = (TextView) findViewById(R.id.castil_des);
		Button b14=(Button)findViewById(R.id.fav14);
		ScrollView sc14=(ScrollView)findViewById(R.id.scrollview14);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fourth, menu);
		return true;
	}

}