package com.example.primes;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.widget.TextView;

public class FirstNPrimes extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first_nprimes);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_first_nprimes, menu);
		return true;
	}
	
	public void firstNPrimesAction(View view)
	{
		EditText editText = (EditText) findViewById(R.id.firstNPrimesInput);
	    String message = editText.getText().toString();
	    int x=Integer.parseInt(message);
	    
	    message=firstNPrimes(x);
	    TextView firstNPrimesText=(TextView)this.findViewById(R.id.FirstNPrimesText);
	    firstNPrimesText.setText(message);
	}
	
	public String firstNPrimes(int n)
	{
		int current=2;
		int count=0;
		String output="";
		while(count<n)
		{
			if(isPrime(current))
			{
				output=output+" "+current;
				count++;
			}
			current++;
		}
		return output;
	}
	
	public boolean isPrime(int x)
	{
		if(x%2==0 && x!=2)
		{
			return false;
		}
		int a=(int)Math.sqrt(x);
		for(int i=3; i<=a; i+=2)
		{
			if(x%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
