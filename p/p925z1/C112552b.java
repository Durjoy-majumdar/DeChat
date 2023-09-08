package p925z1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import gy3.C87412m;

/* renamed from: z1.b */
public final class C112552b extends MetricAffectingSpan {

    /* renamed from: d */
    public final String f336987d;

    public C112552b(String str) {
        C87412m.m108594g(str, "fontFeatureSettings");
        this.f336987d = str;
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f336987d);
    }

    public void updateMeasureState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f336987d);
    }
}
