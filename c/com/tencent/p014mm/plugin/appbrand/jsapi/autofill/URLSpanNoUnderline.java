package com.tencent.p014mm.plugin.appbrand.jsapi.autofill;

import android.text.TextPaint;
import android.text.style.URLSpan;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.autofill.URLSpanNoUnderline */
public class URLSpanNoUnderline extends URLSpan {
    public URLSpanNoUnderline(String str) {
        super(str);
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
