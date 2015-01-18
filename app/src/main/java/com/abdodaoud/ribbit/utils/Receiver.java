package com.abdodaoud.ribbit.utils;

import android.content.Context;
import android.content.Intent;

import com.abdodaoud.ribbit.ui.MainActivity;
import com.parse.ParsePushBroadcastReceiver;

/**
 * Created by abdodaoud on 1/18/15.
 */
public class Receiver extends ParsePushBroadcastReceiver {

    @Override
    public void onPushOpen(Context context, Intent intent) {
        Intent i = new Intent(context, MainActivity.class);
        i.putExtras(intent.getExtras());
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}
