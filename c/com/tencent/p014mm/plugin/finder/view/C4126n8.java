package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ImageSpan;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.view.n8 */
public final class C4126n8 extends ImageSpan {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4126n8(Context context, Bitmap bitmap) {
        super(context, bitmap);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bitmap, "bitmap");
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(paint, "paint");
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        canvas.save();
        canvas.translate(f, (((((float) (i4 * 2)) + fontMetrics.ascent) + fontMetrics.descent) / ((float) 2)) - ((float) ((getDrawable().getBounds().bottom + getDrawable().getBounds().top) / 2)));
        getDrawable().draw(canvas);
        canvas.restore();
    }
}
