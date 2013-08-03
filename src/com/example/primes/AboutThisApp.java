package com.example.primes;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AboutThisApp extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about_this_app);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_about_this_app, menu);
		return true;
	}

}
