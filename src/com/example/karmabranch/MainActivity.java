package com.example.karmabranch;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button button_5min = (Button) findViewById(R.id.button_5min);
		Button button_10min = (Button) findViewById(R.id.button_10min);
		Button button_1hr = (Button) findViewById(R.id.button_1hr);
		Button button_login = (Button) findViewById(R.id.button_login_login_page);
		Button button_register = (Button) findViewById(R.id.button_register);

		button_5min.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i=new Intent(MainActivity.this,FavorList.class);
				startActivity(i);
			}
		});
		button_10min.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i=new Intent(MainActivity.this,FavorList.class);
				startActivity(i);
			}
		});
		button_1hr.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i=new Intent(MainActivity.this,FavorList.class);
				startActivity(i);
			}
		});
		button_login.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i=new Intent(MainActivity.this,Login_Activity.class);
				startActivity(i);
			}
		});
		button_register.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i=new Intent(MainActivity.this,UserRegistration.class);
				startActivity(i);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
