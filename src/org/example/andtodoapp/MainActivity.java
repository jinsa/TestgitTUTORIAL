package org.example.andtodoapp;

import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.view.KeyEvent;
import android.view.View.OnKeyListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
	
		
		
		ListView list1=(ListView)findViewById(R.id.listView1);
		final EditText ed1=(EditText)findViewById(R.id.editText1);
		
		final ArrayList<String> todoitem=new ArrayList<String>();
		final ArrayAdapter<String> aa;
		
		
		
		aa=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, todoitem);
		
		list1.setAdapter(aa);
		
		ed1.setOnKeyListener(new OnKeyListener() {
			
			public boolean onKey(View v, int keyCode, KeyEvent event) {
			
				if (event.getAction() == KeyEvent.ACTION_DOWN)
				{
					if ((keyCode == KeyEvent.KEYCODE_DPAD_CENTER) ||(keyCode == KeyEvent.KEYCODE_ENTER))
					{
					todoitem.add(0, ed1.getText().toString());
					aa.notifyDataSetChanged();
					ed1.setText("");
					
					return true;
					}
			    }
			return false;	
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
