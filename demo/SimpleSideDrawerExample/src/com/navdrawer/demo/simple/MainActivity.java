package com.navdrawer.demo.simple;

import com.navdrawer.SimpleSideDrawer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    private SimpleSideDrawer mNav;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNav = new SimpleSideDrawer(this);
        View content = mNav.setBehindContentView(R.layout.activity_behind_simple);
        Button test = (Button) content.findViewById(R.id.behind_btn);
        
        findViewById(R.id.btn).setOnClickListener(new OnClickListener() {
            @Override 
            public void onClick(View v) {
                mNav.toggleDrawer();
            }
        });
        test.setOnClickListener(new OnClickListener() {
            @Override 
            public void onClick(View v) {
                mNav.toggleDrawer();
            }
        });
    }
}