package com.example.primes;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.content.Intent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void aboutThisApp(View view)
    {
    	Intent intent = new Intent(this, AboutThisApp.class);
    	startActivity(intent);
    }
    
    public void isItPrime(View view)
    {
    	Intent intent=new Intent(this, IsItPrime.class);
    	startActivity(intent);
    }
    
    public void firstNPrimes(View view)
    {
    	Intent intent=new Intent(this, FirstNPrimes.class);
    	startActivity(intent);
    }
    
    public void primeFactorization(View view)
    {
    	Intent intent=new Intent(this, PrimeFactorization.class);
    	startActivity(intent);
    }
    
    
}
