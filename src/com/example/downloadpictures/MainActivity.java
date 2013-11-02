package com.example.downloadpictures;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity {
	String UrlOfPicture = "http://chart.googleapis.com/chart?chs=440x220&cht=map:auto&chco=B3BCC0|5781AE|FFC726|518274|CA4E00|885E80&chld=CN|US|AU|CN-51|US-TX&chdl=China%20mainland|Australia|USA|Sichuan|Texas&chm=a,000000,0,3,7";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ImageView imageToHaveTheDownloadedPicture = (ImageView)findViewById(R.id.imageView1);
		imageToHaveTheDownloadedPicture.setImageBitmap(ImageDownloader.loadBitmap(UrlOfPicture)); 
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
