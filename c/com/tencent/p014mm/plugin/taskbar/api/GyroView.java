package com.tencent.p014mm.plugin.taskbar.api;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.taskbar.api.GyroView */
public class GyroView extends View {

    /* renamed from: d */
    public float f21357d = 0.0f;

    /* renamed from: e */
    public float f21358e = 0.0f;

    /* renamed from: f */
    public float f21359f = (getResources().getDisplayMetrics().density * 100.0f);

    /* renamed from: g */
    public float f21360g = (getResources().getDisplayMetrics().density * 40.0f);

    /* renamed from: h */
    public float f21361h = (getResources().getDisplayMetrics().density * 20.0f);

    /* renamed from: i */
    public float f21362i = (getResources().getDisplayMetrics().density * 10.0f);

    /* renamed from: j */
    public float f21363j = (getResources().getDisplayMetrics().density * 6.0f);

    /* renamed from: n */
    public Paint f21364n;

    public GyroView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f21364n = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f21364n.setColor(-9934744);
    }

    /* renamed from: a */
    public void mo6557a(float f, int i) {
        float f2 = this.f21360g;
        this.f21358e = Math.max(0.0f, Math.min((f - f2) / (((float) i) - f2), 1.0f));
        this.f21357d = Math.max(0.0f, Math.min(f / this.f21360g, 1.0f));
        Log.m105919d("MicroMsg.GyroView", "alvinluo GyroView setVerticalScroll y: %f, limit: %d, percent: %f, paddingPercent: %f", Float.valueOf(f), Integer.valueOf(i), Float.valueOf(this.f21357d), Float.valueOf(this.f21358e));
        postInvalidate();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float measuredWidth = ((float) getMeasuredWidth()) / 2.0f;
        float measuredHeight = ((float) getMeasuredHeight()) / 2.0f;
        float f = this.f21358e;
        if (f > 0.0f) {
            float f2 = this.f21362i;
            canvas.drawCircle(measuredWidth, measuredHeight, (f2 / 2.0f) - ((f * (f2 - this.f21363j)) / 2.0f), this.f21364n);
            canvas.drawCircle(measuredWidth - (this.f21358e * this.f21361h), measuredHeight, this.f21363j / 2.0f, this.f21364n);
            canvas.drawCircle(measuredWidth + (this.f21358e * this.f21361h), measuredHeight, this.f21363j / 2.0f, this.f21364n);
            return;
        }
        canvas.drawCircle(measuredWidth, measuredHeight, (this.f21357d * this.f21362i) / 2.0f, this.f21364n);
    }

    public void setVerticalScroll(float f) {
        float f2 = this.f21360g;
        this.f21358e = Math.max(0.0f, Math.min((f - f2) / (this.f21359f - f2), 1.0f));
        this.f21357d = Math.max(0.0f, Math.min(f / this.f21360g, 1.0f));
        postInvalidate();
    }
}
