package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.t4 */
public class C92913t4 extends Drawable {

    /* renamed from: j */
    public static final /* synthetic */ int f267619j = 0;

    /* renamed from: a */
    public Paint f267620a;

    /* renamed from: b */
    public Paint f267621b;

    /* renamed from: c */
    public int f267622c;

    /* renamed from: d */
    public int f267623d;

    /* renamed from: e */
    public int f267624e;

    /* renamed from: f */
    public int f267625f;

    /* renamed from: g */
    public int f267626g;

    /* renamed from: h */
    public int[] f267627h;

    /* renamed from: i */
    public RectF f267628i;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.t4$b */
    public static class C84677b {

        /* renamed from: a */
        public int f247032a;

        /* renamed from: b */
        public int f247033b;

        /* renamed from: c */
        public int f247034c;

        /* renamed from: d */
        public int f247035d;

        /* renamed from: e */
        public int f247036e;

        /* renamed from: f */
        public int[] f247037f;

        public C84677b() {
            this.f247035d = 0;
            this.f247036e = 0;
            this.f247032a = 12;
            this.f247033b = Color.parseColor("#4d000000");
            this.f247034c = 18;
            this.f247035d = 0;
            this.f247036e = 0;
            int[] iArr = new int[1];
            this.f247037f = iArr;
            iArr[0] = 0;
        }
    }

    public C92913t4(int i, int[] iArr, int i2, int i3, int i4, int i5, int i6, C84676a aVar) {
        this.f267623d = i;
        this.f267627h = iArr;
        this.f267624e = i2;
        this.f267622c = i4;
        this.f267625f = i5;
        this.f267626g = i6;
        Paint paint = new Paint();
        this.f267620a = paint;
        paint.setColor(0);
        this.f267620a.setAntiAlias(true);
        this.f267620a.setShadowLayer((float) i4, (float) i5, (float) i6, i3);
        this.f267620a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
        Paint paint2 = new Paint();
        this.f267621b = paint2;
        paint2.setAntiAlias(true);
    }

    public void draw(Canvas canvas) {
        int[] iArr = this.f267627h;
        if (iArr != null) {
            if (iArr.length == 1) {
                this.f267621b.setColor(iArr[0]);
            } else {
                Paint paint = this.f267621b;
                RectF rectF = this.f267628i;
                float f = rectF.left;
                float height = rectF.height() / 2.0f;
                RectF rectF2 = this.f267628i;
                paint.setShader(new LinearGradient(f, height, rectF2.right, rectF2.height() / 2.0f, this.f267627h, (float[]) null, Shader.TileMode.CLAMP));
            }
        }
        if (this.f267623d == 1) {
            RectF rectF3 = this.f267628i;
            int i = this.f267624e;
            canvas.drawRoundRect(rectF3, (float) i, (float) i, this.f267620a);
            RectF rectF4 = this.f267628i;
            int i2 = this.f267624e;
            canvas.drawRoundRect(rectF4, (float) i2, (float) i2, this.f267621b);
            return;
        }
        canvas.drawCircle(this.f267628i.centerX(), this.f267628i.centerY(), Math.min(this.f267628i.width(), this.f267628i.height()) / 2.0f, this.f267620a);
        canvas.drawCircle(this.f267628i.centerX(), this.f267628i.centerY(), Math.min(this.f267628i.width(), this.f267628i.height()) / 2.0f, this.f267621b);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.f267620a.setAlpha(i);
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = this.f267622c;
        int i6 = this.f267625f;
        int i7 = this.f267626g;
        this.f267628i = new RectF((float) ((i + i5) - i6), (float) ((i2 + i5) - i7), (float) ((i3 - i5) - i6), (float) ((i4 - i5) - i7));
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f267620a.setColorFilter(colorFilter);
    }
}
