package com.tencent.p014mm.plugin.webview.webcompt;

import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;
import t83.C48590l;
import t83.C48613w0;

/* renamed from: com.tencent.mm.plugin.webview.webcompt.o */
public final class C44450o extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C44408c f120545d;

    /* renamed from: e */
    public final /* synthetic */ String f120546e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<String, C13598b0> f120547f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44450o(C44408c cVar, String str, C32226l<? super String, C13598b0> lVar) {
        super(0);
        this.f120545d = cVar;
        this.f120546e = str;
        this.f120547f = lVar;
    }

    public Object invoke() {
        C48590l lVar = this.f120545d.f120409a.get();
        if (lVar != null) {
            String str = this.f120546e;
            C30623n nVar = new C30623n(this.f120547f);
            if (MMHandlerThread.isMainThread()) {
                lVar.f129996a.evaluateJavascript(str, nVar);
            } else {
                MMHandlerThread.postToMainThread(new C48613w0(lVar, str, nVar));
            }
        }
        return C13598b0.f38549a;
    }
}
