package p268x1;

import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;

/* renamed from: x1.f */
public final class C112000f {
    /* renamed from: a */
    public static final Rect m152721a(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        TextPaint textPaint2 = textPaint;
        CharSequence charSequence2 = charSequence;
        int i3 = i;
        int i4 = i2;
        C87412m.m108594g(textPaint2, "<this>");
        C87412m.m108594g(charSequence2, MimeTypes.BASE_TYPE_TEXT);
        Class<MetricAffectingSpan> cls = MetricAffectingSpan.class;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (spanned.nextSpanTransition(i3 + -1, i4, cls) != i4) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint3 = new TextPaint();
                while (i3 < i4) {
                    int nextSpanTransition = spanned.nextSpanTransition(i3, i4, cls);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, nextSpanTransition, cls);
                    textPaint3.set(textPaint2);
                    C87412m.m108593f(metricAffectingSpanArr, "spans");
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint3);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        C111999e.m152720a(textPaint3, charSequence2, i3, nextSpanTransition, rect2);
                    } else {
                        textPaint3.getTextBounds(charSequence.toString(), i3, nextSpanTransition, rect2);
                    }
                    rect.right += rect2.width();
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            C111999e.m152720a(textPaint2, charSequence2, i3, i4, rect3);
        } else {
            textPaint2.getTextBounds(charSequence.toString(), i3, i4, rect3);
        }
        return rect3;
    }
}
