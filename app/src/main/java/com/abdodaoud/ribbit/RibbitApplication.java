package com.abdodaoud.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Abdo Daoud on 10/17/14.
 */
public class RibbitApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "aLIN0fzyVrRwKGLnZ730ApLFqIrx0jdlkX6LbpAe", "LcxAEINEgLrB1BxqpwInZeFfCT81FBs3sDGCZwpR");
    }
}
