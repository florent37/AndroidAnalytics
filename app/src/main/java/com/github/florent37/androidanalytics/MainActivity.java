package com.github.florent37.androidanalytics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.florent37.androidanalytics.androidanalytics.Analytics;
import com.github.florent37.androidanalytics.androidanalytics.AnalyticsEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Analytics.screen("MainActivity");

        findViewById(R.id.text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Analytics.event(new AnalyticsEvent()
                        .category("main")
                        .action("click")
                        .label("hello world")
                );
            }
        });
    }
}
