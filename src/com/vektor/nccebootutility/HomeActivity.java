package com.vektor.nccebootutility;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		Button poweroff = (Button) this.findViewById(R.id.button1);
		poweroff.setOnClickListener(
				new OnClickListener(){

					@Override
					public void onClick(View v) {
						ShInterface.poweroff();
					}}
				);
		Button reboot = (Button) this.findViewById(R.id.button2);
		reboot.setOnClickListener(
				new OnClickListener(){

					@Override
					public void onClick(View v) {
						ShInterface.reboot();
					}}
				);
		Button recovery = (Button) this.findViewById(R.id.button3);
		recovery.setOnClickListener(
				new OnClickListener(){

					@Override
					public void onClick(View v) {
						ShInterface.recovery();
					}}
				);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

}
