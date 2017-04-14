package com.github.florent37.androidanalytics.sample;

import android.app.Application;

import com.github.florent37.androidanalytics.Analytics;
import com.github.florent37.androidanalytics.AnalyticsEvent;
import com.github.florent37.androidanalytics.AnalyticsLogginProvider;
import com.github.florent37.androidanalytics.AnalyticsProvider;
import com.github.florent37.androidanalytics.google.GoogleAnalyticsProvider;

/**
 * Created by florentchampigny on 14/04/2017.
 */

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Analytics
                .registerProvider(
                        new AnalyticsProvider() {
                            @Override
                            public void exception(Exception e) {

                            }

                            @Override
                            public void event(AnalyticsEvent analyticsEvent) {

                            }

                            @Override
                            public void screen(String screenName) {

                            }
                        }
                );

        Analytics
                .registerProvider(
                        new AnalyticsLogginProvider("analytics"),
                        new GoogleAnalyticsProvider(this, R.xml.app_tracker)
                );
    }
}
