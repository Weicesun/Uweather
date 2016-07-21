package edu.gatech.uweather.sync;

import android.content.Intent;
import android.os.IBinder;

import edu.gatech.uweather.service.Service;

/**
 * Created by weice_sun on 7/20/16.
 */
public class SunshineAuthenticatorService extends Service {
    private SunshineAuthenticator mAuthenticator;

    @Override
    public void onCreate() {
        mAuthenticator = new SunshineAuthenticator(this);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mAuthenticator.getIBinder();
    }
}
