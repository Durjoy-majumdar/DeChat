package com.tencent.p014mm.smiley;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import go3.C76003c;
import gy3.C87412m;

/* renamed from: com.tencent.mm.smiley.u */
public final class C72953u extends C76003c {

    /* renamed from: e */
    public final boolean f212635e;

    /* renamed from: f */
    public final int f212636f;

    /* renamed from: g */
    public final int f212637g;

    /* renamed from: h */
    public final RectF f212638h = new RectF();

    /* renamed from: i */
    public int f212639i = 255;

    /* renamed from: j */
    public boolean f212640j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72953u(Drawable drawable, boolean z, int i, int i2) {
        super(drawable, 0);
        C87412m.m108594g(drawable, "drawable");
        this.f212635e = z;
        this.f212636f = i;
        this.f212637g = i2;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(paint, "paint");
        Drawable drawable = getDrawable();
        canvas.save();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = fontMetricsInt.descent - fontMetricsInt.ascent;
        int abs = Math.abs(i6);
        if (abs != drawable.getBounds().width()) {
            drawable.setBounds(0, 0, abs, abs);
        }
        float f2 = ((float) ((i4 + fontMetricsInt.descent) - (i6 / 2))) - (((float) (drawable.getBounds().bottom - drawable.getBounds().top)) / 2.0f);
        canvas.translate(f, f2);
        this.f212638h.set(f, f2, ((float) drawable.getBounds().width()) + f, ((float) drawable.getBounds().height()) + f2);
        int alpha = drawable.getAlpha();
        int alpha2 = this.f212640j ? this.f212639i : paint.getAlpha();
        if (alpha2 == 0 && alpha != alpha2) {
            drawable.setAlpha(alpha2);
        }
        drawable.draw(canvas);
        drawable.setAlpha(alpha);
        canvas.restore();
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C87412m.m108594g(paint, "paint");
        Drawable drawable = getDrawable();
        Rect bounds = drawable.getBounds();
        C87412m.m108593f(bounds, "drawable.bounds");
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        int width = bounds.width();
        if (fontMetricsInt2 != null) {
            int abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent);
            drawable.setBounds(0, 0, abs, abs);
            width = drawable.getBounds().width();
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = fontMetricsInt2.ascent;
                fontMetricsInt.descent = fontMetricsInt2.descent;
                fontMetricsInt.top = fontMetricsInt2.top;
                fontMetricsInt.bottom = fontMetricsInt2.bottom;
            }
        }
        return width;
    }
}
