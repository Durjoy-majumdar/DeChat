package com.tencent.p014mm.plugin.webview.core;

/* renamed from: com.tencent.mm.plugin.webview.core.d */
public final class C30578d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BaseWebViewController f82354d;

    public C30578d(BaseWebViewController baseWebViewController) {
        this.f82354d = baseWebViewController;
    }

    public final void run() {
        BaseWebViewController baseWebViewController = this.f82354d;
        int i = baseWebViewController.f117572j0;
        String currentUrl = baseWebViewController.getCurrentUrl();
        if (currentUrl == null) {
            currentUrl = "";
        }
        baseWebViewController.mo67686O(i, currentUrl);
    }
}
