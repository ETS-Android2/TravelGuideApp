package com.example.travelguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ThirdActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.thirdact);

		ImageView img4 = (ImageView) findViewById(R.id.addaya_pic);
		img1.setImageResource(R.drawable.addayaport);
		TextView txt4 = (TextView) findViewById(R.id.addaya_des);
		txt1.getText().toString();
		Button fav_4=(Button)findViewById(R.id.fav1);//on clicklistner create a listview and use addapter to add img
		ScrollView s4=(ScrollView)findViewById(R.id.scrollview4);//?

		ImageView img5 = (ImageView) findViewById(R.id.barcelona_pic);
		img1.setImageResource(R.drawable.barcelona);
		TextView txt5 = (TextView) findViewById(R.id.barcelona_des);
		txt1.getText().toString();
		Button fav_5=(Button)findViewById(R.id.fav2);
		ScrollView s5=(ScrollView)findViewById(R.id.scrollview5);

		ImageView img6 = (ImageView) findViewById(R.id.ibiz_pic);
		img1.setImageResource(R.drawable.ibiza);
		TextView txt6= (TextView) findViewById(R.id.ibiz_des);
		txt1.getText().toString();
		Button fav_6=(Button)findViewById(R.id.fav3);
		ScrollView s6=(ScrollView)findViewById(R.id.scrollview6);

		ImageView img7 = (ImageView) findViewById(R.id.mallorca_pic);
		img1.setImageResource(R.drawable.mallorca);
		TextView txt7= (TextView) findViewById(R.id.mallorca_des);
		txt1.getText().toString();
		Button fav_7=(Button)findViewById(R.id.fav7);
		ScrollView s7=(ScrollView)findViewById(R.id.scrollview7);

		ImageView img8 = (ImageView) findViewById(R.id.alhambra_pic);
		img1.setImageResource(R.drawable.alhambra);
		TextView txt8= (TextView) findViewById(R.id.alhambra_des);
		txt1.getText().toString();
		Button fav_8=(Button)findViewById(R.id.fav8);
		ScrollView s8=(ScrollView)findViewById(R.id.scrollview8);

		ImageView img9 = (ImageView) findViewById(R.id.parkuell_pic);
		img1.setImageResource(R.drawable.parkuell);
		TextView txt9= (TextView) findViewById(R.id.parkuell_des);
		txt1.getText().toString();
		Button fav_9=(Button)findViewById(R.id.fav9);
		ScrollView s9=(ScrollView)findViewById(R.id.scrollview9);


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.third, menu);
		return true;
	}

}