package com.tencent.p014mm.plugin.webview.core;

import com.tencent.p014mm.plugin.webview.core.C43510e0;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.webview.core.d0 */
public final class C43509d0 implements C5854i {

    /* renamed from: d */
    public final /* synthetic */ C43510e0.C43511a f117641d;

    public C43509d0(C43510e0.C43511a aVar) {
        this.f117641d = aVar;
    }

    public void close() {
        C43510e0.C43511a aVar = this.f117641d;
        aVar.f117647f = null;
        if (aVar.f117645d) {
            C43510e0 e0Var = C43510e0.f117642a;
            if (e0Var.mo67794b(aVar.f117646e).size() < C43510e0.f117644c) {
                e0Var.mo67794b(aVar.f117646e).add(aVar);
                Log.m105924i("MicroMsg.WebViewUIConnectionPool", "detach with reuse service");
                return;
            }
        }
        try {
            MMApplicationContext.getContext().unbindService(aVar);
        } catch (IllegalArgumentException unused) {
        }
        C43510e0 e0Var2 = C43510e0.f117642a;
        Log.m105924i("MicroMsg.WebViewUIConnectionPool", "detach unbind service");
    }

    /* renamed from: m */
    public C43791l mo6903m() {
        C43791l lVar = this.f117641d.f117648g;
        C87412m.m108591d(lVar);
        return lVar;
    }
}
