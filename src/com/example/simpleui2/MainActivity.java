package com.example.simpleui2;

import org.w3c.dom.Text;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private EditText editText;
	private Button button;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		editText = (EditText) findViewById(R.id.editText1);
		editText.setHint("Type Something...");
		editText.setOnKeyListener(new OnKeyListener() {
			
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				
				// TODO Auto-generated method stub
				
				Log.d("debug", "keyCode="+keyCode+"keyEvent="+event.getAction());
				
				if (event.getAction() == KeyEvent.ACTION_DOWN){
					if(keyCode == KeyEvent.KEYCODE_ENTER){
						sendMessage();
						return true;
					}
						
				}
				
				return false;
			}
		});
		
		button = (Button) findViewById(R.id.button1);
		button.setText("Send");
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sendMessage();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void submit2(View view){
		sendMessage();
	}
	
	private void sendMessage(){
		String text = editText.getText().toString();
		editText.getText().clear();
		Toast.makeText(this, text, Toast.LENGTH_LONG).show();
	}
	
}
