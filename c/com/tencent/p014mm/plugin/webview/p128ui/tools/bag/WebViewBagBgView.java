package com.tencent.p014mm.plugin.webview.p128ui.tools.bag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBagBgView */
public class WebViewBagBgView extends View {

    /* renamed from: d */
    public int f283073d = -7829368;

    /* renamed from: e */
    public int f283074e = -65536;

    /* renamed from: f */
    public float f283075f = 0.0f;

    /* renamed from: g */
    public int f283076g;

    /* renamed from: h */
    public int f283077h;

    /* renamed from: i */
    public long f283078i;

    /* renamed from: j */
    public float f283079j;

    /* renamed from: n */
    public float f283080n;

    /* renamed from: o */
    public int f283081o;

    /* renamed from: p */
    public int f283082p;

    /* renamed from: q */
    public boolean f283083q;

    /* renamed from: r */
    public Paint f283084r;

    /* renamed from: s */
    public RectF f283085s;

    public WebViewBagBgView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f283084r = paint;
        paint.setAntiAlias(true);
        this.f283082p = -1;
    }

    /* renamed from: a */
    public final void mo134823a(long j) {
        int i = this.f283082p;
        if (i < 0) {
            Log.m105925i("MicroMsg.WebViewBagBgView", "doUpdateAngryInfo not measured, mDiameter:%d", Integer.valueOf(i));
            return;
        }
        int i2 = this.f283076g;
        float f = ((float) (i * 2)) / (((float) this.f283077h) / ((float) i2));
        this.f283075f = f;
        long j2 = this.f283078i;
        if (j - j2 <= 0) {
            this.f283079j = (float) i;
        } else {
            float f2 = ((float) i) - (((float) (((int) (((float) (j - j2)) / ((float) i2))) + 1)) * f);
            this.f283079j = f2;
            int i3 = this.f283081o;
            if (f2 < ((float) (-i3))) {
                f2 = (float) (-i3);
            }
            this.f283079j = f2;
        }
        float f3 = this.f283079j;
        int i4 = this.f283081o;
        this.f283080n = ((float) i) - f3 < ((float) i4) ? (float) i : ((float) i4) + f3;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f283080n;
        float f2 = this.f283079j;
        if (f == f2) {
            this.f283079j = f2 - 0.001f;
        }
        this.f283084r.setShader(new LinearGradient(0.0f, this.f283079j, 0.0f, this.f283080n, new int[]{this.f283073d, this.f283074e}, (float[]) null, Shader.TileMode.CLAMP));
        canvas.drawOval(this.f283085s, this.f283084r);
        if (this.f283083q && this.f283080n > 0.0f) {
            float f3 = this.f283079j - this.f283075f;
            this.f283079j = f3;
            int i = this.f283081o;
            if (f3 < ((float) (-i))) {
                f3 = (float) (-i);
            }
            this.f283079j = f3;
            int i2 = this.f283082p;
            this.f283080n = ((float) i2) - f3 < ((float) i) ? (float) i2 : f3 + ((float) i);
            postInvalidateDelayed((long) this.f283076g);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f283082p = View.MeasureSpec.getSize(i);
        int i3 = this.f283082p;
        this.f283085s = new RectF(0.0f, 0.0f, (float) i3, (float) i3);
        this.f283081o = this.f283082p / 2;
        mo134823a(System.currentTimeMillis());
    }

    public void setAngryColor(int i) {
        this.f283074e = i;
    }

    public void setStartColor(int i) {
        this.f283073d = i;
    }
}
