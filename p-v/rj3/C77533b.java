package rj3;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.tencent.p014mm.p136ui.C85875k4;
import gy3.C87412m;

/* renamed from: rj3.b */
public final class C77533b extends MetricAffectingSpan {
    public void updateDrawState(TextPaint textPaint) {
        C85875k4.m106191k0(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "paint");
        C85875k4.m106191k0(textPaint);
    }
}
