package com.tencent.youtu.ytagreflectlivecheck.p139ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* renamed from: com.tencent.youtu.ytagreflectlivecheck.ui.YTReflectLayout */
public class YTReflectLayout extends RelativeLayout {
    private static String TAG = "YTReflectLayout";
    private ColorMatrixColorFilter mColorMatrixColorFilter;
    private Paint mPaint;
    private Rect mRect = new Rect();

    public YTReflectLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.mPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mPaint.setColor(Color.argb(200, 0, 0, 0));
        this.mColorMatrixColorFilter = new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        setWillNotDraw(false);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.mPaint.setColorFilter(this.mColorMatrixColorFilter);
        this.mRect.set(0, 0, getWidth(), getHeight());
        canvas.drawRect(this.mRect, this.mPaint);
    }

    public void setColorMatrixColorFilter(ColorMatrixColorFilter colorMatrixColorFilter) {
        this.mColorMatrixColorFilter = colorMatrixColorFilter;
        invalidate();
    }
}
