package com.example.mycustomviews1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CustomView extends View {

    public static final int SQUARE_SIZE = 200;

    private Rect mRectSquare;
    private Paint mPaintSquare;

    public CustomView(Context context) {
        super(context);
        init(null);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {

        super(context, attrs, defStyleAttr);
        init(attrs);

    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);

    }

    private void init(@Nullable AttributeSet set) {
        mRectSquare = new Rect();
        mPaintSquare = new Paint(Paint.ANTI_ALIAS_FLAG);
        //anti_alias_flag giup bo rang cua nhung hinh se mo hon
        mPaintSquare.setColor(Color.RED);
    }

    public void swapColor() {
        mPaintSquare.setColor(mPaintSquare.getColor() == Color.RED ? Color.GRAY : Color.RED);
        //goi lai onDraw
        //Synchronous
//        invalidate();
        //Asynchronous bat dong bo
        postInvalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
//        super.onDraw(canvas);
//        canvas.drawColor(Color.RED);
//        Rect rect = new Rect();
        mRectSquare.left = 50;
        mRectSquare.top = 50;
        mRectSquare.right = mRectSquare.left + SQUARE_SIZE;
        mRectSquare.bottom = mRectSquare.top + SQUARE_SIZE;

//        Paint paint = new Paint();


        canvas.drawRect(mRectSquare, mPaintSquare);
    }

}
