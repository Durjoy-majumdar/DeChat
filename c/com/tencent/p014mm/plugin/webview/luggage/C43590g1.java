package com.tencent.p014mm.plugin.webview.luggage;

import com.tencent.xweb.WebView;

/* renamed from: com.tencent.mm.plugin.webview.luggage.g1 */
public class C43590g1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LuggageWebViewLongClickHelper f117834d;

    public C43590g1(LuggageWebViewLongClickHelper luggageWebViewLongClickHelper) {
        this.f117834d = luggageWebViewLongClickHelper;
    }

    public void run() {
        LuggageWebViewLongClickHelper luggageWebViewLongClickHelper = this.f117834d;
        WebView.HitTestResult hitTestResult = luggageWebViewLongClickHelper.f117782d;
        if (hitTestResult != null) {
            luggageWebViewLongClickHelper.mo67865d(hitTestResult);
            return;
        }
        WebView.HitTestResult hitTestResult2 = luggageWebViewLongClickHelper.f117783e;
        if (hitTestResult2 != null) {
            luggageWebViewLongClickHelper.mo67864c(hitTestResult2);
        }
    }
}
