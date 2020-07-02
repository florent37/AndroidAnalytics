# AndroidAnalytics

# Download

<a href="https://goo.gl/WXW8Dc">
  <img alt="Android app on Google Play" src="https://developer.android.com/images/brand/en_app_rgb_wo_45.png" />
</a>


<a href='https://ko-fi.com/A160LCC' target='_blank'><img height='36' style='border:0px;height:36px;' src='https://az743702.vo.msecnd.net/cdn/kofi1.png?v=0' border='0' alt='Buy Me a Coffee at ko-fi.com' /></a>

In your module [![Download](https://api.bintray.com/packages/florent37/maven/androidanalytics/images/download.svg)](https://bintray.com/florent37/maven/androidanalytics/_latestVersion)
```groovy
//not available yet
compile 'com.github.florent37:androidanalytics:1.0.0'
compile 'com.github.florent37:androidanalytics-google:1.0.0'
```

# Register analytics providers

`MainApplication.java`
```java
Analytics.registerProvider(
      new GoogleAnalyticsProvider(this, R.xml.app_tracker)
);
```

example of `app_tracker.xml` :

```
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <string name="ga_trackingId" translatable="false">UA-XXXXXXX-X</string>
</resources>
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

`MainActivity.java`
```java
Analytics.screen("MainActivity");

button.setOnClickListener(v -> {
         Analytics.event("main", "click", "button");
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

# Credits

Author: Florent Champigny

Fiches Plateau Moto : [https://www.fiches-plateau-moto.fr/](https://www.fiches-plateau-moto.fr/)

<a href="https://goo.gl/WXW8Dc">
  <img alt="Android app on Google Play" src="https://developer.android.com/images/brand/en_app_rgb_wo_45.png" />
</a>

<a href="https://plus.google.com/+florentchampigny">
  <img alt="Follow me on Google+"
       src="https://raw.githubusercontent.com/florent37/DaVinci/master/mobile/src/main/res/drawable-hdpi/gplus.png" />
</a>
<a href="https://twitter.com/florent_champ">
  <img alt="Follow me on Twitter"
       src="https://raw.githubusercontent.com/florent37/DaVinci/master/mobile/src/main/res/drawable-hdpi/twitter.png" />
</a>
<a href="https://www.linkedin.com/in/florentchampigny">
  <img alt="Follow me on LinkedIn"
       src="https://raw.githubusercontent.com/florent37/DaVinci/master/mobile/src/main/res/drawable-hdpi/linkedin.png" />
</a>


License
--------

    Copyright 2016 florent37, Inc.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
