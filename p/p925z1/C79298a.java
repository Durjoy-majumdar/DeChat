package p925z1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import gy3.C87412m;

/* renamed from: z1.a */
public class C79298a extends MetricAffectingSpan {

    /* renamed from: d */
    public final float f232791d;

    public C79298a(float f) {
        this.f232791d = f;
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "textPaint");
        textPaint.baselineShift += (int) ((float) Math.ceil((double) (textPaint.ascent() * this.f232791d)));
    }

    public void updateMeasureState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "textPaint");
        textPaint.baselineShift += (int) ((float) Math.ceil((double) (textPaint.ascent() * this.f232791d)));
    }
}
