package com.github.florent37.androidanalytics.androidanalytics;

/**
 * Created by florentchampigny on 14/04/2017.
 */

public class AnalyticsEvent {
    private String category;
    private String action;
    private String label;

    public AnalyticsEvent(String category, String action, String label) {
        this.category = category;
        this.action = action;
        this.label = label;
    }

    public AnalyticsEvent() {
    }

    public AnalyticsEvent category(String category) {
        this.category = category;
        return this;
    }

    public AnalyticsEvent action(String action) {
        this.action = action;
        return this;
    }

    public AnalyticsEvent label(String label) {
        this.label = label;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public String getAction() {
        return action;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "AnalyticsEvent{" +
                "category='" + category + '\'' +
                ", action='" + action + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
