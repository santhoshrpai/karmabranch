package com.example.karmabranch;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class FavorList extends Activity {
	private ListView mainListView ;  
	private ArrayAdapter<String> listAdapter ;  

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_favor_list);
		mainListView = (ListView) findViewById( R.id.listView1 );  
		Button button_view_detail = (Button) findViewById(R.id.button1);
		// Create and populate a List of planet names.  
		String[] planets = new String[] { "David Bowie needs a baby sitter", "Joan would like too borrow a bike", "Iggy Pop wants a ride to California", "Barack Obama needs a look-alike"};    
		ArrayList<String> planetList = new ArrayList<String>();  
		planetList.addAll( Arrays.asList(planets) );  
		button_view_detail.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent i=new Intent(FavorList.this,FavorDescription.class);
				startActivity(i);
			}
		});
		
		// Create ArrayAdapter using the planet list.  
		listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, planetList);  
		// Add more planets. If you passed a String[] instead of a List<String>   
		// into the ArrayAdapter constructor, you must not add more items.   
		// Otherwise an exception will occur.  
		// Set the ArrayAdapter as the ListView's adapter.  
		mainListView.setAdapter( listAdapter );    
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.favor_list, menu);
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
