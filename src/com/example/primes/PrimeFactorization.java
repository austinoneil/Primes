package com.example.primes;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.widget.TextView;

public class PrimeFactorization extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_prime_factorization);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_prime_factorization, menu);
		return true;
	}
	
	public void primeFactorization(View view)
	{
		EditText editText = (EditText) findViewById(R.id.editText1);
	    String message = editText.getText().toString();
	    int x=Integer.parseInt(message);
	    message=primeFact(x);
	   	TextView PrimeFactorizationText=(TextView)this.findViewById(R.id.PrimeFactorizationText);
	   	PrimeFactorizationText.setText(message);
	    
	}
	
	public String primeFact(int x)
	{
		int[] a=new int[x];
		int count=2;
		while(count<=x)
		{
			if(x%count==0)
			{
				x=x/count;
				a[count-1]++;
				count=2;
			}
			else
			{
				count++;
			}
		}
		String output="";
		for(int i=2; i<=a.length; i++)
		{
			if(a[i-1]!=0)
			{
				if(output.length()!=0)
				{
					output=output+" x "+(i);
				}
				else
				{
					output=output+(i);
				}
				if(a[i-1]!=1)
				{
					output=output+"^"+a[i-1];
				}
			}
		}
		return output;
	}

}
