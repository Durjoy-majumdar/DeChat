package com.tencent.p014mm.p136ui.widget.loading;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.wxmm.v2helper;
import yo3.C79142a;

/* renamed from: com.tencent.mm.ui.widget.loading.MMProgressLoading */
public class MMProgressLoading extends View {

    /* renamed from: d */
    public Paint f165540d;

    /* renamed from: e */
    public int f165541e;

    /* renamed from: f */
    public int f165542f;

    /* renamed from: g */
    public int f165543g;

    /* renamed from: h */
    public int f165544h;

    public MMProgressLoading(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo82347a(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo82347a(Context context, AttributeSet attributeSet, int i) {
        this.f165540d = new Paint();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C79142a.f232411j, i, 0);
            this.f165541e = obtainStyledAttributes.getColor(1, getResources().getColor(C0966R.color.f2975b6));
            this.f165542f = obtainStyledAttributes.getInt(0, 100);
            this.f165544h = obtainStyledAttributes.getInt(3, 0);
            this.f165543g = obtainStyledAttributes.getInt(2, -90);
            obtainStyledAttributes.recycle();
        }
    }

    public int getProgress() {
        return this.f165544h;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        int width2 = (int) (((double) (getWidth() / 2)) * 0.175d);
        int i = (width - (width2 / 2)) - 1;
        int color = getResources().getColor(C0966R.color.f2967ax);
        float f = (float) width2;
        this.f165540d.setStrokeWidth(f);
        this.f165540d.setColor(color);
        this.f165540d.setAlpha(127);
        this.f165540d.setAntiAlias(true);
        this.f165540d.setStyle(Paint.Style.STROKE);
        float f2 = (float) width;
        float f3 = (float) i;
        canvas.drawCircle(f2, f2, f3, this.f165540d);
        this.f165540d.setStrokeWidth(f);
        this.f165540d.setColor(this.f165541e);
        this.f165540d.setAlpha(51);
        this.f165540d.setAntiAlias(true);
        this.f165540d.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(f2, f2, f3, this.f165540d);
        this.f165540d.setStrokeWidth(f);
        this.f165540d.setStrokeCap(Paint.Cap.ROUND);
        this.f165540d.setColor(this.f165541e);
        float f4 = (float) (width - i);
        float f5 = (float) (width + i);
        Canvas canvas2 = canvas;
        canvas2.drawArc(new RectF(f4, f4, f5, f5), (float) this.f165543g, (float) ((this.f165544h * v2helper.VOIP_ENC_HEIGHT_LV1) / this.f165542f), false, this.f165540d);
    }

    public void setProgress(int i) {
        this.f165544h = Math.max(0, i);
        this.f165544h = Math.min(i, this.f165542f);
        invalidate();
    }

    public MMProgressLoading(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo82347a(context, attributeSet, i);
    }
}
