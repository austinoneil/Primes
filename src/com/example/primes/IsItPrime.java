package com.example.primes;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.widget.TextView;

public class IsItPrime extends Activity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_is_it_prime);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_is_it_prime, menu);
		return true;
	}
	
	public void isItPrimeAction(View view)
	{
		EditText editText = (EditText) findViewById(R.id.editText1);
	    String message = editText.getText().toString();
	    int x=Integer.parseInt(message);
	    
	    if(isPrime(x))
	    {
	    	message=x+" is prime.";
	    }
	    else
	    {
	    	message=x+" is composite.";
	    }
	    TextView primeOutput=(TextView)this.findViewById(R.id.primeOutput);
	    primeOutput.setText(message);
	    
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
