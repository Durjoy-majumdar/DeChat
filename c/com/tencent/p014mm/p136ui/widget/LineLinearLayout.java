package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.widget.LineLinearLayout */
public class LineLinearLayout extends LinearLayout {

    /* renamed from: d */
    public Paint f24810d;

    /* renamed from: e */
    public int f24811e;

    public LineLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onDraw(Canvas canvas) {
        int measuredHeight = getMeasuredHeight();
        Paint paint = this.f24810d;
        int i = 1;
        while (true) {
            int i2 = this.f24811e;
            if (i2 * i < measuredHeight) {
                canvas.drawLine(0.0f, (float) (i2 * i), (float) getMeasuredWidth(), (float) (this.f24811e * i), paint);
                i++;
            } else {
                super.onDraw(canvas);
                return;
            }
        }
    }

    public LineLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        new Rect();
        Paint paint = new Paint();
        this.f24810d = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f24810d.setColor(-571543826);
        this.f24810d.setStrokeWidth((float) Math.round(C76577a.m92156g(getContext()) * 0.5f));
        this.f24811e = C76577a.m92151b(context, 44);
    }
}
