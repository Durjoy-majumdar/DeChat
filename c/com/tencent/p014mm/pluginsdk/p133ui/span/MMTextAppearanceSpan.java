package com.tencent.p014mm.pluginsdk.p133ui.span;

import android.content.res.ColorStateList;
import android.text.TextPaint;
import android.text.style.TextAppearanceSpan;
import com.tencent.p014mm.p136ui.C85875k4;

/* renamed from: com.tencent.mm.pluginsdk.ui.span.MMTextAppearanceSpan */
public class MMTextAppearanceSpan extends TextAppearanceSpan {
    public MMTextAppearanceSpan(String str, int i, int i2, ColorStateList colorStateList, ColorStateList colorStateList2) {
        super(str, i, i2, colorStateList, colorStateList2);
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        C85875k4.m106189j0(textPaint, 0.1f);
    }
}
