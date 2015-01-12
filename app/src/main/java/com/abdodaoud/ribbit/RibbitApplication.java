package com.abdodaoud.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by abdodaoud on 10/17/14.
 */
public class RibbitApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, ParseConstants.API_APP_ID, ParseConstants.API_CLIENT_KEY);
    }
}
