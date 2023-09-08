package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.webkit.JavascriptInterface;

/* renamed from: com.tencent.mm.plugin.appbrand.page.b3 */
public class C83767b3 extends MutableContextWrapper {
    public C83767b3(Context context) {
        super(context);
    }

    @JavascriptInterface
    public float getPixelRatio() {
        return getResources().getDisplayMetrics().density;
    }

    @JavascriptInterface
    public float getWidth() {
        return (float) Math.ceil((double) (((float) getResources().getDisplayMetrics().widthPixels) / getPixelRatio()));
    }
}
