package com.tencent.p014mm.p136ui.widget.progress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.wxmm.v2helper;
import yo3.C79142a;

/* renamed from: com.tencent.mm.ui.widget.progress.RoundProgressBtn */
public class RoundProgressBtn extends View {

    /* renamed from: d */
    public Paint f165549d;

    /* renamed from: e */
    public int f165550e;

    /* renamed from: f */
    public float f165551f;

    /* renamed from: g */
    public int f165552g;

    /* renamed from: h */
    public float f165553h;

    /* renamed from: i */
    public int f165554i;

    /* renamed from: j */
    public int f165555j;

    /* renamed from: n */
    public boolean f165556n;

    /* renamed from: o */
    public int f165557o;

    /* renamed from: p */
    public int f165558p = 0;

    /* renamed from: q */
    public int f165559q = 0;

    public RoundProgressBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C74942w4.m89786c(getContext(), C0966R.dimen.f3703bv);
        mo82352a(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo82352a(Context context, AttributeSet attributeSet, int i) {
        this.f165549d = new Paint();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C79142a.f232412k, i, 0);
            this.f165550e = obtainStyledAttributes.getColor(5, getContext().getResources().getColor(C0966R.color.a_l));
            this.f165551f = obtainStyledAttributes.getDimension(6, 0.0f);
            this.f165552g = obtainStyledAttributes.getColor(3, getContext().getResources().getColor(C0966R.color.akw));
            this.f165553h = obtainStyledAttributes.getDimension(4, this.f165551f);
            this.f165554i = obtainStyledAttributes.getInt(1, 100);
            this.f165557o = obtainStyledAttributes.getInt(2, 0);
            this.f165555j = obtainStyledAttributes.getInt(7, -90);
            this.f165556n = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    public int getProgress() {
        return this.f165557o;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        if (this.f165551f == 0.0f) {
            this.f165551f = (float) ((int) (((double) (getWidth() / 2)) * 0.167d));
        }
        float f = this.f165551f;
        this.f165553h = f;
        this.f165558p = (int) f;
        float f2 = (float) width;
        this.f165559q = (int) (0.667f * f2);
        int i = (int) (f2 - (f / 2.0f));
        this.f165549d.setStrokeWidth(f);
        this.f165549d.setColor(this.f165550e);
        this.f165549d.setAntiAlias(true);
        this.f165549d.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(f2, f2, (float) i, this.f165549d);
        this.f165549d.setStrokeWidth(this.f165553h);
        this.f165549d.setStrokeCap(Paint.Cap.ROUND);
        this.f165549d.setColor(this.f165552g);
        float f3 = (float) (width - i);
        float f4 = (float) (i + width);
        Canvas canvas2 = canvas;
        canvas2.drawArc(new RectF(f3, f3, f4, f4), (float) this.f165555j, (float) ((this.f165557o * v2helper.VOIP_ENC_HEIGHT_LV1) / this.f165554i), false, this.f165549d);
        this.f165549d.setStrokeWidth(0.0f);
        this.f165549d.setStyle(Paint.Style.FILL);
        if (this.f165556n) {
            float f5 = this.f165551f;
            int i2 = this.f165559q;
            Canvas canvas3 = canvas;
            canvas3.drawRect(f2 - (f5 * 1.5f), (float) (width - (i2 / 2)), f2 - (f5 * 0.5f), (float) ((i2 / 2) + width), this.f165549d);
            int i3 = this.f165558p;
            int i4 = this.f165559q;
            Canvas canvas4 = canvas;
            canvas4.drawRect(f2 + (((float) i3) * 0.5f), (float) (width - (i4 / 2)), f2 + (((float) i3) * 1.5f), (float) (width + (i4 / 2)), this.f165549d);
        }
    }

    public void setHasPause(boolean z) {
        this.f165556n = z;
        invalidate();
    }

    public void setProgress(int i) {
        this.f165557o = Math.max(0, i);
        this.f165557o = Math.min(i, this.f165554i);
        invalidate();
    }

    public void setProgressColor(int i) {
        this.f165552g = i;
    }

    public RoundProgressBtn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C74942w4.m89786c(getContext(), C0966R.dimen.f3703bv);
        mo82352a(context, attributeSet, i);
    }
}
