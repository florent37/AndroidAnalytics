package com.github.florent37.androidanalytics;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by florentchampigny on 14/04/2017.
 */

public class Analytics {

    private static final Analytics INSTANCE;
    private final Collection<AnalyticsProvider> providers = new ConcurrentLinkedQueue<>();

    static {
        INSTANCE = new Analytics();
    }

    public static Analytics registerProvider(AnalyticsProvider...analyticsProvider){
        synchronized (INSTANCE.providers) {
            INSTANCE.providers.addAll(Arrays.asList(analyticsProvider));
        }
        return INSTANCE;
    }

    public static Analytics screen(String screenName) {
        synchronized (INSTANCE.providers) {
            for (AnalyticsProvider provider : INSTANCE.providers) {
                provider.screen(screenName);
            }
        }
        return INSTANCE;
    }

    public static Analytics event(AnalyticsEvent event) {
        synchronized (INSTANCE.providers) {
            for (AnalyticsProvider provider : INSTANCE.providers) {
                provider.event(event);
            }
        }
        return INSTANCE;
    }

    public static Analytics event(String category, String action, String label) {
        synchronized (INSTANCE.providers) {
            for (AnalyticsProvider provider : INSTANCE.providers) {
                provider.event(new AnalyticsEvent(category, action, label));
            }
        }
        return INSTANCE;
    }

    public static Analytics exception(Exception exception) {
        synchronized (INSTANCE.providers) {
            for (AnalyticsProvider provider : INSTANCE.providers) {
                provider.exception(exception);
            }
        }
        return INSTANCE;
    }
}
