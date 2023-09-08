package p925z1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import gy3.C87412m;

/* renamed from: z1.d */
public final class C112554d extends MetricAffectingSpan {

    /* renamed from: d */
    public final float f336989d;

    public C112554d(float f) {
        this.f336989d = f;
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "textPaint");
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (!(textSize == 0.0f)) {
            textPaint.setLetterSpacing(this.f336989d / textSize);
        }
    }

    public void updateMeasureState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "textPaint");
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (!(textSize == 0.0f)) {
            textPaint.setLetterSpacing(this.f336989d / textSize);
        }
    }
}
