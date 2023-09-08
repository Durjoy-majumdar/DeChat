package p925z1;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import gy3.C87412m;

/* renamed from: z1.k */
public final class C79302k extends MetricAffectingSpan {

    /* renamed from: d */
    public final Typeface f232815d;

    public C79302k(Typeface typeface) {
        C87412m.m108594g(typeface, "typeface");
        this.f232815d = typeface;
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "ds");
        textPaint.setTypeface(this.f232815d);
    }

    public void updateMeasureState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "paint");
        textPaint.setTypeface(this.f232815d);
    }
}
