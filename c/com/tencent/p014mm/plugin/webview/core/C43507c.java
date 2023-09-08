package com.tencent.p014mm.plugin.webview.core;

import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.webview.core.c */
public final class C43507c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BaseWebViewController f117640d;

    public C43507c(BaseWebViewController baseWebViewController) {
        this.f117640d = baseWebViewController;
    }

    public final void run() {
        this.f117640d.mo67712d0().postUIDelayed((Runnable) ((C36570n) this.f117640d.f117541O).getValue(), 800);
    }
}
