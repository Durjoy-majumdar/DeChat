package com.tencent.p014mm.plugin.webview.luggage;

import p828wa.C53104i;
import p828wa.C53106j;

/* renamed from: com.tencent.mm.plugin.webview.luggage.n$$e */
public class n$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C43658n f117973d;

    public n$$e(C43658n nVar) {
        this.f117973d = nVar;
    }

    public void run() {
        C53104i peek = C53106j.this.f148204d.peek();
        if (peek != null && (peek instanceof C43658n)) {
            ((C43658n) peek).mo67936m();
        }
    }
}
