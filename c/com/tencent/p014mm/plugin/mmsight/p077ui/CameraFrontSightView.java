package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.CameraFrontSightView */
public class CameraFrontSightView extends View {

    /* renamed from: d */
    public Paint f272131d = new Paint();

    /* renamed from: e */
    public boolean f272132e = false;

    /* renamed from: f */
    public boolean f272133f = false;

    /* renamed from: g */
    public boolean f272134g = false;

    /* renamed from: h */
    public long f272135h = 0;

    /* renamed from: i */
    public int f272136i;

    /* renamed from: j */
    public int f272137j;

    /* renamed from: n */
    public int f272138n;

    /* renamed from: o */
    public int f272139o;

    /* renamed from: p */
    public int f272140p;

    public CameraFrontSightView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo129481a(float f, float f2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.m105920e("MicroMsg.CameraFrontSightView", "LayoutParams is not MarginLayoutParams! use doAimation()");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = ((int) f) - (this.f272136i / 2);
        marginLayoutParams.topMargin = ((int) f2) - (this.f272137j / 2);
        setLayoutParams(marginLayoutParams);
        setVisibility(0);
        this.f272132e = true;
        this.f272133f = false;
        this.f272134g = false;
        this.f272135h = System.currentTimeMillis();
        invalidate();
    }

    /* renamed from: b */
    public void mo129482b(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            layoutParams.height = i2;
        }
        this.f272136i = i;
        this.f272137j = i2;
        this.f272138n = i / 2;
        this.f272139o = i2 / 2;
        this.f272140p = C76577a.m92151b(getContext(), 1);
        this.f272131d.setColor(-12206054);
        this.f272131d.setStrokeWidth((float) this.f272140p);
        setLayerType(1, (Paint) null);
    }

    public void draw(Canvas canvas) {
        canvas.translate((float) (this.f272138n / 2), (float) (this.f272139o / 2));
        long currentTimeMillis = System.currentTimeMillis() - this.f272135h;
        if (currentTimeMillis > 200) {
            this.f272132e = false;
            this.f272133f = true;
        }
        if (currentTimeMillis > 800) {
            this.f272133f = false;
        }
        if (currentTimeMillis > 1100) {
            this.f272134g = true;
        }
        if (currentTimeMillis > 1300) {
            this.f272134g = false;
            canvas.drawColor(0);
            return;
        }
        if (this.f272132e) {
            float f = (((float) (200 - currentTimeMillis)) / 200.0f) + 1.0f;
            canvas.scale(f, f, (float) (this.f272138n / 2), (float) (this.f272139o / 2));
            this.f272131d.setAlpha((int) ((2.0f - f) * 255.0f));
        } else {
            canvas.scale(1.0f, 1.0f);
        }
        if (this.f272133f) {
            float f2 = (((float) ((currentTimeMillis - 200) % 200)) / 200.0f) * 2.0f;
            this.f272131d.setAlpha((int) (((f2 > 1.0f ? f2 - 1.0f : 1.0f - f2) * 128.0f) + 127.0f));
        } else {
            this.f272131d.setAlpha(255);
        }
        if (this.f272134g) {
            this.f272131d.setAlpha((int) ((1.0f - (((float) (currentTimeMillis - 1100)) / 200.0f)) * 255.0f));
        }
        canvas.drawLine(0.0f, 0.0f, (float) this.f272138n, 0.0f, this.f272131d);
        canvas.drawLine(0.0f, 0.0f, 0.0f, (float) this.f272139o, this.f272131d);
        int i = this.f272138n;
        canvas.drawLine((float) i, 0.0f, (float) i, (float) this.f272139o, this.f272131d);
        int i2 = this.f272139o;
        canvas.drawLine(0.0f, (float) i2, (float) this.f272138n, (float) i2, this.f272131d);
        int i3 = this.f272139o;
        canvas.drawLine(0.0f, (float) (i3 / 2), (float) (this.f272138n / 10), (float) (i3 / 2), this.f272131d);
        int i4 = this.f272138n;
        int i5 = this.f272139o;
        canvas.drawLine((float) i4, (float) (i5 / 2), (float) ((i4 * 9) / 10), (float) (i5 / 2), this.f272131d);
        int i6 = this.f272138n;
        Canvas canvas2 = canvas;
        canvas2.drawLine((float) (i6 / 2), 0.0f, (float) (i6 / 2), (float) (this.f272139o / 10), this.f272131d);
        int i7 = this.f272138n;
        int i8 = this.f272139o;
        canvas2.drawLine((float) (i7 / 2), (float) i8, (float) (i7 / 2), (float) ((i8 * 9) / 10), this.f272131d);
        invalidate();
    }

    public void setFocusColor(int i) {
        if (i != 0) {
            this.f272131d.setColor(i);
        }
    }

    public CameraFrontSightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
