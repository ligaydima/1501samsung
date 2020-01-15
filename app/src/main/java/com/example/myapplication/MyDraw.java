package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyDraw extends View {

    public MyDraw(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        System.out.println(1);
        Paint p = new Paint();
        int DOOR_X1 = 450;
        int DOOR_Y1 = 1000;
        int DOOR_X2 = 700;
        int DOOR_Y2 = 1500;
        p.setColor(Color.rgb(133, 99, 52));
        int HOUSERECT_x1 = 200;
        int HOUSERECT_y1 = 600;
        int HOUSERECT_x2 = 800;
        int HOUSERECT_y2 = 1600;
        canvas.drawRect(HOUSERECT_x1, HOUSERECT_y1, HOUSERECT_x2, HOUSERECT_y2, p);

        p.setColor(Color.WHITE);
        for (int i = 0; i < 1000; ++i) {
            canvas.drawLine(0, canvas.getHeight() - i * 30, i * 30, canvas.getHeight(), p);
        }
        p.setColor(Color.rgb(133, 99, 52));
        canvas.drawRect(HOUSERECT_x1, HOUSERECT_y1, HOUSERECT_x2, DOOR_Y1, p);
        canvas.drawRect(HOUSERECT_x1, HOUSERECT_y1, DOOR_X1, HOUSERECT_y2, p);
        canvas.drawRect(HOUSERECT_x1, DOOR_Y2, HOUSERECT_x2, HOUSERECT_y2, p);
        canvas.drawRect(DOOR_X2, HOUSERECT_y1, HOUSERECT_x2, HOUSERECT_y2, p);
        p.setColor(Color.rgb(133, 99, 52));
        Path path = new Path();
        path.moveTo(HOUSERECT_x1, HOUSERECT_y1);
        path.lineTo(HOUSERECT_x1 + (HOUSERECT_x2 - HOUSERECT_x1) / 2, HOUSERECT_y1 - 300);
        path.lineTo(HOUSERECT_x2, HOUSERECT_y1);
        path.lineTo(HOUSERECT_x1, HOUSERECT_y1);
        path.close();
        canvas.drawPath(path, p);
        p.setColor(Color.BLACK);
        p.setStyle(Paint.Style.STROKE);
        p.setStrokeWidth(30);
        canvas.drawRect(DOOR_X1, DOOR_Y1, DOOR_X2, DOOR_Y2, p);

    }
}
