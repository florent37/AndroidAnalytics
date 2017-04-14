package com.github.florent37.androidanalytics;

/**
 * Created by florentchampigny on 14/04/2017.
 */

public interface AnalyticsProvider {
    void exception(Exception e);

    void event(AnalyticsEvent analyticsEvent);

    void screen(String screenName);
}
