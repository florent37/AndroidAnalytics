package com.github.florent37.androidanalytics.androidanalytics;

import android.util.Log;

/**
 * Created by florentchampigny on 14/04/2017.
 */

public class AnalyticsLogginProvider implements AnalyticsProvider {

    private final String tag;

    public AnalyticsLogginProvider(String tag) {
        this.tag = tag;
    }

    //can be overriden
    public void log(String text) {
        Log.d(tag, text);
    }
    public void log(Exception e) {
        Log.e(tag, e.getLocalizedMessage(), e);
    }

    @Override
    public void exception(Exception e) {
        log(e);
    }

    @Override
    public void event(AnalyticsEvent analyticsEvent) {
        log(analyticsEvent.toString());
    }

    @Override
    public void screen(String screenName) {
        log("screen: " + screenName);
    }
}
