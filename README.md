# AndroidAnalytics

# Register analytics providers

`MainApplication.java`
```java
Analytics.registerProvider(
      new GoogleAnalyticsProvider(this, R.xml.app_tracker)
);
```

# Send events

`MainActivity.java`
```java
Analytics.screen("MainActivity");

button.setOnClickListener(v -> {
         Analytics.event(new AnalyticsEvent()
                 .category("main")
                 .action("click")
                 .label("button")
         );
});
```

# Loggin analytics provider

```java
Analytics.registerProvider(
       new AnalyticsLogginProvider("analytics")
);
```