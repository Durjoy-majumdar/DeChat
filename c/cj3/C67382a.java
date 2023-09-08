package cj3;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import iy3.C60641c;

/* renamed from: cj3.a */
public final class C67382a implements LineHeightSpan.WithDensity {
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
    }

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt, TextPaint textPaint) {
        int i5 = 0;
        int i6 = fontMetricsInt != null ? fontMetricsInt.descent : 0;
        if (fontMetricsInt != null) {
            i5 = fontMetricsInt.ascent;
        }
        int i7 = i6 - i5;
        int b = textPaint == null ? -1 : C60641c.m70921b(textPaint.getTextSize() * 1.45f);
        if (b != i7) {
            float f = (((float) b) * 1.0f) / ((float) i7);
            if (fontMetricsInt != null) {
                int round = Math.round(((float) fontMetricsInt.descent) * f);
                fontMetricsInt.descent = round;
                fontMetricsInt.ascent = round - b;
            }
        }
    }
}
