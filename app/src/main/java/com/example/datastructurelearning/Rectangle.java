package com.example.datastructurelearning;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class Rectangle extends View {

    Paint paint = new Paint();
    int left,top,right,bottom;
    int color;
    public Rectangle(Context context, int left, int top, int right, int bottom, int color) {

        super(context);
        this.left = left;
        this.right = right;
        this.top = top;
        this.bottom = bottom;
        this.color = color;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        paint.setColor(color);
        Rect rect = new Rect(left,top,right,bottom);
        canvas.drawRect(rect,paint);
    }
}
