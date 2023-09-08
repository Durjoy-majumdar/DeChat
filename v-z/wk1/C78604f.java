package wk1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import gy3.C87412m;

/* renamed from: wk1.f */
public final class C78604f extends ReplacementSpan {

    /* renamed from: d */
    public final int f230235d;

    public C78604f(int i) {
        this.f230235d = i;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        CharSequence charSequence2 = charSequence;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(paint2, "paint");
        int i6 = i;
        int i7 = i2;
        int measureText = (int) paint2.measureText(charSequence, i, i2);
        int i8 = this.f230235d;
        float f2 = measureText < i8 ? ((float) ((i8 - measureText) / 2)) + f : f;
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        canvas.drawText(charSequence2, i, i2, f2, (float) i4, paint);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C87412m.m108594g(paint, "paint");
        int measureText = (int) paint.measureText(charSequence, i, i2);
        int i3 = this.f230235d;
        return measureText < i3 ? i3 : measureText;
    }
}
