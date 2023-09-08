package com.tencent.p014mm.plugin.wallet_core.utils;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TextAppearanceSpan;
import com.tencent.p014mm.p136ui.C85875k4;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan */
public class WcPayTextApppearanceSpan extends TextAppearanceSpan {

    /* renamed from: d */
    public Typeface f210885d = Typeface.DEFAULT;

    /* renamed from: e */
    public int f210886e = 0;

    public WcPayTextApppearanceSpan(String str, int i, int i2, ColorStateList colorStateList, ColorStateList colorStateList2) {
        super(str, i, i2, colorStateList, colorStateList2);
    }

    public void updateMeasureState(TextPaint textPaint) {
        super.updateMeasureState(textPaint);
        int i = this.f210886e;
        if (i == 1) {
            C85875k4.m106189j0(textPaint, 0.8f);
        } else if (i != 3) {
            this.f210886e = 0;
        } else {
            this.f210886e = 1;
        }
        textPaint.setTypeface(Typeface.create(this.f210885d, this.f210886e));
    }
}
