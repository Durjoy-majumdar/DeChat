package com.tencent.p014mm.media.camera.view.control;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import j80.C108655d;
import j80.C60780c;
import kg3.C76577a;

/* renamed from: com.tencent.mm.media.camera.view.control.CameraFocusView */
public class CameraFocusView extends View implements C108655d {

    /* renamed from: d */
    public Paint f157384d = new Paint();

    /* renamed from: e */
    public boolean f157385e = false;

    /* renamed from: f */
    public boolean f157386f = false;

    /* renamed from: g */
    public boolean f157387g = false;

    /* renamed from: h */
    public long f157388h = 0;

    /* renamed from: i */
    public int f157389i = -12206054;

    /* renamed from: j */
    public int f157390j;

    /* renamed from: n */
    public int f157391n;

    /* renamed from: o */
    public int f157392o;

    /* renamed from: p */
    public int f157393p;

    /* renamed from: q */
    public int f157394q;

    public CameraFocusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo76563a(float f, float f2, boolean z) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.m105920e("MicroMsg.CameraFrontSightView", "LayoutParams is not MarginLayoutParams! use doAimation()");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = ((int) f) - (this.f157390j / 2);
        marginLayoutParams.topMargin = ((int) f2) - (this.f157391n / 2);
        setLayoutParams(marginLayoutParams);
        setVisibility(0);
        this.f157385e = true;
        this.f157386f = false;
        this.f157387g = false;
        this.f157388h = System.currentTimeMillis();
        invalidate();
    }

    /* renamed from: b */
    public void mo76564b(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            layoutParams.height = i2;
        }
        this.f157390j = i;
        this.f157391n = i2;
        this.f157392o = i / 2;
        this.f157393p = i2 / 2;
        this.f157394q = C76577a.m92151b(getContext(), 1);
        this.f157384d.setColor(this.f157389i);
        this.f157384d.setStrokeWidth((float) this.f157394q);
        setLayerType(1, (Paint) null);
    }

    /* renamed from: c */
    public void mo76565c(float f, C60780c cVar) {
    }

    public void draw(Canvas canvas) {
        canvas.translate((float) (this.f157392o / 2), (float) (this.f157393p / 2));
        long currentTimeMillis = System.currentTimeMillis() - this.f157388h;
        if (currentTimeMillis > 200) {
            this.f157385e = false;
            this.f157386f = true;
        }
        if (currentTimeMillis > 800) {
            this.f157386f = false;
        }
        if (currentTimeMillis > 1100) {
            this.f157387g = true;
        }
        if (currentTimeMillis > 1300) {
            this.f157387g = false;
            canvas.drawColor(0);
            return;
        }
        if (this.f157385e) {
            float f = (((float) (200 - currentTimeMillis)) / 200.0f) + 1.0f;
            canvas.scale(f, f, (float) (this.f157392o / 2), (float) (this.f157393p / 2));
            this.f157384d.setAlpha((int) ((2.0f - f) * 255.0f));
        } else {
            canvas.scale(1.0f, 1.0f);
        }
        if (this.f157386f) {
            float f2 = (((float) ((currentTimeMillis - 200) % 200)) / 200.0f) * 2.0f;
            this.f157384d.setAlpha((int) (((f2 > 1.0f ? f2 - 1.0f : 1.0f - f2) * 128.0f) + 127.0f));
        } else {
            this.f157384d.setAlpha(255);
        }
        if (this.f157387g) {
            this.f157384d.setAlpha((int) ((1.0f - (((float) (currentTimeMillis - 1100)) / 200.0f)) * 255.0f));
        }
        canvas.drawLine(0.0f, 0.0f, (float) this.f157392o, 0.0f, this.f157384d);
        canvas.drawLine(0.0f, 0.0f, 0.0f, (float) this.f157393p, this.f157384d);
        int i = this.f157392o;
        canvas.drawLine((float) i, 0.0f, (float) i, (float) this.f157393p, this.f157384d);
        int i2 = this.f157393p;
        canvas.drawLine(0.0f, (float) i2, (float) this.f157392o, (float) i2, this.f157384d);
        int i3 = this.f157393p;
        canvas.drawLine(0.0f, (float) (i3 / 2), (float) (this.f157392o / 10), (float) (i3 / 2), this.f157384d);
        int i4 = this.f157392o;
        int i5 = this.f157393p;
        canvas.drawLine((float) i4, (float) (i5 / 2), (float) ((i4 * 9) / 10), (float) (i5 / 2), this.f157384d);
        int i6 = this.f157392o;
        Canvas canvas2 = canvas;
        canvas2.drawLine((float) (i6 / 2), 0.0f, (float) (i6 / 2), (float) (this.f157393p / 10), this.f157384d);
        int i7 = this.f157392o;
        int i8 = this.f157393p;
        canvas2.drawLine((float) (i7 / 2), (float) i8, (float) (i7 / 2), (float) ((i8 * 9) / 10), this.f157384d);
        invalidate();
    }

    public void reset() {
    }

    public void setFocusColor(int i) {
        if (i != 0) {
            this.f157389i = i;
            this.f157384d.setColor(i);
        }
    }

    public void setOrientation(int i) {
    }

    public CameraFocusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CameraFocusView(Context context) {
        super(context);
    }
}
