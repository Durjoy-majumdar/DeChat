package com.tencent.p014mm.p136ui.widget;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/TextVerticalAlignSpan;", "Landroid/text/style/AbsoluteSizeSpan;", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.TextVerticalAlignSpan */
public final class TextVerticalAlignSpan extends AbsoluteSizeSpan {
    /* renamed from: a */
    public final void mo104347a(TextPaint textPaint, boolean z) {
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        if (fontMetrics != null) {
            float f = fontMetrics.descent - fontMetrics.ascent;
            if (!z) {
                super.updateDrawState(textPaint);
            } else {
                super.updateMeasureState(textPaint);
            }
            textPaint.setColor(0);
            Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
            if (fontMetrics2 != null) {
                textPaint.baselineShift = (int) ((((fontMetrics2.descent - fontMetrics2.ascent) - f) / ((float) 2)) / 0.0f);
            }
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "ds");
        mo104347a(textPaint, false);
    }

    public void updateMeasureState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "ds");
        mo104347a(textPaint, true);
    }
}
