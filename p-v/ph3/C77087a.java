package ph3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;

/* renamed from: ph3.a */
public class C77087a extends ReplacementSpan {

    /* renamed from: d */
    public int f225174d;

    public C77087a(int i) {
        this.f225174d = i;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        CharSequence subSequence = charSequence.subSequence(i, i2);
        TextPaint textPaint = new TextPaint(paint);
        textPaint.setTextSize((float) this.f225174d);
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        canvas.drawText(subSequence.toString(), f, (float) (i4 - (((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2) - ((i5 + i3) / 2))), textPaint);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        CharSequence subSequence = charSequence.subSequence(i, i2);
        TextPaint textPaint = new TextPaint(paint);
        textPaint.setTextSize((float) this.f225174d);
        return (int) textPaint.measureText(subSequence.toString());
    }
}
