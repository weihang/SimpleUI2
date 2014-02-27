package com.example.simpleui2;

import org.w3c.dom.Text;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	private EditText editText;
	private Button button;
	private TextView textView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		textView= (TextView) findViewById(R.id.textView1);
		
		editText = (EditText) findViewById(R.id.editText1);
		editText.setHint("Type Something...");
		
		button = (Button) findViewById(R.id.button1);
		button.setText("Send");
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String text = editText.getText().toString();
				Log.d("debug", "[button1]" + text);
				textView.setText(text);
				editText.getText().clear();
				
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
		String text = editText.getText().toString();
		Log.d("debug", "[button2]" + text);
		editText.getText().clear();
	}

}
