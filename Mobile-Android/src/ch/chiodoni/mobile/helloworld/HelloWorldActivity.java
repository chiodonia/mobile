package ch.chiodoni.mobile.helloworld;

import android.os.Bundle;

import com.phonegap.DroidGap;

public class HelloWorldActivity extends DroidGap {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.main);
		super.loadUrl("file:///android_asset/www/index.html");
	}
}