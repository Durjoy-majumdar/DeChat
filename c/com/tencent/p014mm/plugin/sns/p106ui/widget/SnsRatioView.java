package com.tencent.p014mm.plugin.sns.p106ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsRatioView */
public class SnsRatioView extends View {

    /* renamed from: d */
    public int f281574d;

    /* renamed from: e */
    public int f281575e;

    /* renamed from: f */
    public int f281576f;

    /* renamed from: g */
    public int f281577g = 70;

    /* renamed from: h */
    public int f281578h = 10;

    /* renamed from: i */
    public int f281579i = 0;

    /* renamed from: j */
    public Path f281580j = new Path();

    /* renamed from: n */
    public Path f281581n = new Path();

    /* renamed from: o */
    public Paint f281582o = new Paint();

    /* renamed from: p */
    public Paint f281583p = new Paint();

    /* renamed from: q */
    public float[] f281584q = new float[8];

    public SnsRatioView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo134105a(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("setRatio", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
        this.f281574d = i;
        this.f281575e = i2;
        int max = Math.max(0, i);
        this.f281574d = max;
        this.f281574d = Math.min(100, max);
        int max2 = Math.max(0, this.f281575e);
        this.f281575e = max2;
        int min = Math.min(100, max2);
        this.f281575e = min;
        int i3 = this.f281574d;
        if (min + i3 != 100) {
            this.f281575e = 100 - i3;
        }
        invalidate();
        SnsMethodCalculate.markEndTimeMs("setRatio", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
    }

    public void onDraw(Canvas canvas) {
        SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
        int width = getWidth();
        int height = getHeight();
        int tan = (int) (((double) height) / Math.tan(Math.toRadians((double) this.f281577g)));
        int max = Math.max((int) ((((float) ((((width - tan) - this.f281578h) - (this.f281576f * 2)) * this.f281574d)) * 1.0f) / 100.0f), this.f281579i);
        this.f281580j.reset();
        this.f281580j.moveTo(0.0f, 0.0f);
        int i = tan + max;
        this.f281580j.lineTo((float) i, 0.0f);
        float f = (float) height;
        this.f281580j.lineTo((float) max, f);
        this.f281580j.lineTo(0.0f, f);
        this.f281580j.close();
        this.f281581n.reset();
        this.f281581n.moveTo((float) (i + this.f281578h), 0.0f);
        float f2 = (float) width;
        this.f281581n.lineTo(f2, 0.0f);
        this.f281581n.lineTo(f2, f);
        this.f281581n.lineTo((float) (max + this.f281578h), f);
        this.f281581n.close();
        Path path = new Path();
        path.addRoundRect(new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight()), this.f281584q, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPath(this.f281580j, this.f281582o);
        canvas.drawPath(this.f281581n, this.f281583p);
        SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            invalidate();
        }
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
    }
}
