package com.tencent.kinda.framework.widget.tools;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.tencent.kinda.gen.FontStyle;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

public class KindaFontUtil {
    private static final String TAG = "KindaFontUtil";
    private static Typeface[] typefaces;

    public static class KindaTypefaceSpan extends MetricAffectingSpan {
        private String fontName;
        private FontStyle fontStyle;

        public KindaTypefaceSpan(String str, FontStyle fontStyle2) {
            if (str == null) {
                this.fontName = "";
            } else {
                this.fontName = str;
            }
            this.fontStyle = fontStyle2;
        }

        private void updateKindaFont(TextPaint textPaint) {
            Typeface typeface = KindaFontUtil.getTypeface(this.fontName);
            if (typeface != null) {
                textPaint.setTypeface(typeface);
                return;
            }
            FontStyle fontStyle2 = this.fontStyle;
            if (fontStyle2 == FontStyle.MEDIUM) {
                C85875k4.m106189j0(textPaint, 0.8f);
                return;
            }
            int i = 0;
            int i2 = fontStyle2 == FontStyle.BOLD ? 1 : 0;
            Typeface typeface2 = textPaint.getTypeface();
            if (typeface2 != null) {
                i = typeface2.getStyle();
            }
            int i3 = i2 | i;
            Typeface defaultFromStyle = typeface2 == null ? Typeface.defaultFromStyle(i3) : Typeface.create(typeface2, i3);
            int i4 = i3 & (~defaultFromStyle.getStyle());
            if ((i4 & 1) != 0) {
                textPaint.setFakeBoldText(true);
            }
            if ((i4 & 2) != 0) {
                textPaint.setTextSkewX(-0.25f);
            }
            textPaint.setTypeface(defaultFromStyle);
        }

        public void updateDrawState(TextPaint textPaint) {
            updateKindaFont(textPaint);
        }

        public void updateMeasureState(TextPaint textPaint) {
            updateKindaFont(textPaint);
        }
    }

    public static Typeface getTypeface(String str) {
        int i;
        Typeface[] typefaceArr = typefaces;
        if (typefaceArr == null || typefaceArr.length == 0) {
            typefaces = new Typeface[9];
        }
        if (str.equalsIgnoreCase("WeChat-Sans-SS-Light")) {
            i = 2;
        } else if (str.equalsIgnoreCase("WeChat-Sans-SS-Medium")) {
            i = 0;
        } else if (str.equalsIgnoreCase("WeChat-Sans-SS-Regular")) {
            i = 3;
        } else if (str.equalsIgnoreCase("WeChat-Sans-SS-Bold")) {
            i = 1;
        } else if (str.equalsIgnoreCase("WeChat-Sans-Std-Medium")) {
            i = 4;
        } else if (str.equalsIgnoreCase("WeChat-Sans-Std-Light")) {
            i = 6;
        } else if (str.equalsIgnoreCase("WeChat-Sans-Std-Bold")) {
            i = 5;
        } else if (!str.equalsIgnoreCase("WeChat-Sans-Std-Regular")) {
            return null;
        } else {
            i = 7;
        }
        if (i >= 9) {
            return null;
        }
        Typeface typeface = typefaces[i];
        if (typeface != null) {
            return typeface;
        }
        try {
            typefaces[i] = Typeface.createFromAsset(MMApplicationContext.getContext().getAssets(), C75228t.m90273v(i));
            return typefaces[i];
        } catch (Exception e) {
            Log.m105921e(TAG, "setTypeface() Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            return null;
        }
    }
}
