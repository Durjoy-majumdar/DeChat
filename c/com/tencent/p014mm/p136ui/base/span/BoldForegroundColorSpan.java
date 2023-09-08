package com.tencent.p014mm.p136ui.base.span;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import com.tencent.p014mm.p136ui.C85875k4;

/* renamed from: com.tencent.mm.ui.base.span.BoldForegroundColorSpan */
public class BoldForegroundColorSpan extends ForegroundColorSpan {
    public BoldForegroundColorSpan(int i) {
        super(i);
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        C85875k4.m106189j0(textPaint, 0.8f);
    }
}
