package com.starbug1.android.eronews;

import org.fukata.android.addeluxe.AdDeluxeAdView;

import android.app.Activity;
import android.util.Log;
import android.widget.RelativeLayout;

import com.starbug1.android.newsapp.ActivityProcessAditional;

public class AppActivityProcessAditional implements ActivityProcessAditional {
	private static final String TAG = "AppActivityProcessAditional";

	public AppActivityProcessAditional() {
	}

	public void onCreateAditional(Activity activity) {
		Log.d(TAG, "coCreateAditional");
        AdDeluxeAdView adView = new AdDeluxeAdView(activity, "1659");
        RelativeLayout adLayout = (RelativeLayout) activity.findViewById(R.id.adView);
        adLayout.addView(adView);
	}
}
