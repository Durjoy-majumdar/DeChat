package p925z1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import gy3.C87412m;

/* renamed from: z1.i */
public class C112556i extends MetricAffectingSpan {

    /* renamed from: d */
    public final float f336994d;

    public C112556i(float f) {
        this.f336994d = f;
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "textPaint");
        textPaint.setTextSkewX(this.f336994d + textPaint.getTextSkewX());
    }

    public void updateMeasureState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "textPaint");
        textPaint.setTextSkewX(this.f336994d + textPaint.getTextSkewX());
    }
}
