package com.tencent.p014mm.plugin.finder.view;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import gy3.C87412m;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.finder.view.a */
public final class C4011a extends ImageSpan {

    /* renamed from: d */
    public WeakReference<Drawable> f18060d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4011a(Drawable drawable) {
        super(drawable);
        C87412m.m108594g(drawable, "drawable");
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(paint, "paint");
        WeakReference<Drawable> weakReference = this.f18060d;
        Drawable drawable = weakReference != null ? weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.f18060d = new WeakReference<>(drawable);
        }
        if (drawable == null) {
            super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
            return;
        }
        canvas.save();
        canvas.translate(f, (float) ((i5 + paint.getFontMetricsInt().ascent) - paint.getFontMetricsInt().descent));
        drawable.draw(canvas);
        canvas.restore();
    }
}
