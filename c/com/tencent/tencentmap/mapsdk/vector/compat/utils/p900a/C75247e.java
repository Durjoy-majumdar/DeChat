package com.tencent.tencentmap.mapsdk.vector.compat.utils.p900a;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;

/* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.a.e */
public class C75247e extends TextView {

    /* renamed from: a */
    private int f221381a = 0;

    /* renamed from: b */
    private int f221382b = 0;

    public C75247e(Context context) {
        super(context);
    }

    public void draw(Canvas canvas) {
        canvas.translate((float) (this.f221382b / 2), (float) (this.f221381a / 2));
        super.draw(canvas);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int max = Math.max(measuredWidth, measuredHeight);
        if (measuredWidth > measuredHeight) {
            this.f221381a = measuredWidth - measuredHeight;
            this.f221382b = 0;
        } else {
            this.f221381a = 0;
            this.f221382b = measuredHeight - measuredWidth;
        }
        setMeasuredDimension(max, max);
    }
}
