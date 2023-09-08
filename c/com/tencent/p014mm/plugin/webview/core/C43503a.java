package com.tencent.p014mm.plugin.webview.core;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.webview.core.a */
public final class C43503a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BaseWebViewController f117635d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43503a(BaseWebViewController baseWebViewController) {
        super(0);
        this.f117635d = baseWebViewController;
    }

    public Object invoke() {
        this.f117635d.f117553a.clearView();
        this.f117635d.f117553a.destroy();
        try {
            this.f117635d.onDestroy();
        } catch (Exception e) {
            String X = this.f117635d.mo67703X();
            Log.m105920e(X, "destroy ex:" + e);
        }
        return C13598b0.f38549a;
    }
}
