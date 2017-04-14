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

# Another analytics provider

```java
Analytics
          .registerProvider(
                  new AnalyticsProvider() {
                      @Override
                      public void event(AnalyticsEvent analyticsEvent) {
                            //send it to your analytics
                      }

                      @Override
                      public void screen(String screenName) {
                            //send it to your analytics
                      }
                  }
          );
```

# Loggin analytics provider

```java
Analytics.registerProvider(
       new AnalyticsLogginProvider("analytics")
);
```