package com.example.zaijie.planedemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by zaijie on 15/7/12.
 */
public class PlaneView extends View {
    public float currentX;
    public float currentY;
    Bitmap plane;

    public PlaneView(Context context) {
        super(context);
        plane= BitmapFactory.decodeResource(context.getResources(),R.drawable.plane);
        setFocusable(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        canvas.drawBitmap(plane,currentX,currentY,paint);
    }
}
