package com.example.anubhav.apppali;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import com.yalantis.guillotine.animation.GuillotineAnimation;

public class MainActivity extends AppCompatActivity {
    //    ElasticDownloadView elasticDownloadView;
//    Button button23,button58,button96;
    private static final long RIPPLE_DURATION = 250;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FrameLayout root = findViewById(R.id.root);
        Toolbar toolbar = findViewById(R.id.toolbar);
        View contentHamburger = findViewById(R.id.content_hamburger);

        View guillotineMenu = LayoutInflater.from(this).inflate(R.layout.nav_items, null);
        root.addView(guillotineMenu);

        new GuillotineAnimation.GuillotineBuilder(guillotineMenu, guillotineMenu.findViewById(R.id.guillotine_hamburger), contentHamburger)
                .setStartDelay(RIPPLE_DURATION)
                .setActionBarViewForAnimation(toolbar)
                .build();

    }


}

