package com.example.zaijie.planedemo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        initPlane();
    }

    private void initPlane() {
        final PlaneView planeView=new PlaneView(this);
        setContentView(planeView);
        planeView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                planeView.currentX=event.getX();
                planeView.currentY=event.getY();
                planeView.invalidate();
                return true;
            }
        });
    }

}
