package com.tencent.p014mm.plugin.webview.core;

import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.widget.ScrollView;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.webview.core.g0 */
public final class C43513g0 implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    public final /* synthetic */ ScrollView f117649a;

    /* renamed from: b */
    public final /* synthetic */ MMWebView f117650b;

    /* renamed from: c */
    public final /* synthetic */ float f117651c;

    public C43513g0(ScrollView scrollView, MMWebView mMWebView, float f) {
        this.f117649a = scrollView;
        this.f117650b = mMWebView;
        this.f117651c = f;
    }

    public final void onScrollChanged() {
        int scrollX = this.f117649a.getScrollX();
        int scrollY = this.f117649a.getScrollY() + 2;
        if (this.f117650b.isXWalkKernel()) {
            this.f117650b.evaluateJavascript(Util.safeFormatString("window.document.scrollingElement.scrollTop = %d;", Integer.valueOf((int) (((float) scrollY) / this.f117651c))), (ValueCallback<String>) null);
            return;
        }
        this.f117650b.getView().scrollTo(scrollX, scrollY);
    }
}
