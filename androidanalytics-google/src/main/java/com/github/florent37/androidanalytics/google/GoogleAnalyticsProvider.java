package com.github.florent37.androidanalytics.google;

import android.content.Context;

import com.github.florent37.androidanalytics.AnalyticsEvent;
import com.github.florent37.androidanalytics.AnalyticsProvider;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.StandardExceptionParser;
import com.google.android.gms.analytics.Tracker;

/**
 * Created by florentchampigny on 14/04/2017.
 */

public class GoogleAnalyticsProvider implements AnalyticsProvider {

    private final Context applicationContext;
    private final GoogleAnalytics analytics;
    private final Tracker tracker;

    public GoogleAnalyticsProvider(Context context, int xmlFile) {
        this.applicationContext = context.getApplicationContext();
        this.analytics = GoogleAnalytics.getInstance(context);

        this.tracker = analytics.newTracker(xmlFile);
    }

    @Override
    public void exception(Exception e) {
        if (e != null) {
            tracker.send(new HitBuilders.ExceptionBuilder()
                    .setDescription(
                            new StandardExceptionParser(applicationContext, null).getDescription(Thread.currentThread().getName(), e))
                    .setFatal(false)
                    .build()
            );
        }
    }

    @Override
    public void event(AnalyticsEvent analyticsEvent) {
        tracker.send(
                new HitBuilders.EventBuilder()
                        .setCategory(analyticsEvent.getCategory())
                        .setAction(analyticsEvent.getAction())
                        .setLabel(analyticsEvent.getLabel())
                        .build()
        );
    }

    @Override
    public void screen(String screenName) {
        // Set screen name.
        tracker.setScreenName(screenName);

        // Send a screen view.
        tracker.send(new HitBuilders.ScreenViewBuilder().build());

        analytics.dispatchLocalHits();
    }
}
