package com.github.florent37.androidanalytics;

import android.app.Application;

import com.github.florent37.androidanalytics.androidanalytics.Analytics;
import com.github.florent37.androidanalytics.androidanalytics.AnalyticsLogginProvider;
import com.github.florent37.androidanalytics.androidanalytics.GoogleAnalyticsProvider;

/**
 * Created by florentchampigny on 14/04/2017.
 */

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Analytics
                .registerProvider(
                        new AnalyticsLogginProvider("analytics"),
                        new GoogleAnalyticsProvider(this, R.xml.app_tracker)
                );
    }
}
