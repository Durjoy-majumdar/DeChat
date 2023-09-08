package p925z1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import gy3.C87412m;

/* renamed from: z1.c */
public final class C112553c extends MetricAffectingSpan {

    /* renamed from: d */
    public final float f336988d;

    public C112553c(float f) {
        this.f336988d = f;
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f336988d);
    }

    public void updateMeasureState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f336988d);
    }
}
