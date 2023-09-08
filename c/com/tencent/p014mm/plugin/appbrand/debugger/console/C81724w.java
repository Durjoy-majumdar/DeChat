package com.tencent.p014mm.plugin.appbrand.debugger.console;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.w */
public final class C81724w implements Runnable {

    /* renamed from: d */
    public static final C81724w f239844d = new C81724w();

    public final void run() {
        boolean z = C81725x.f239845a;
        boolean z2 = C81725x.f239845a;
        Log.m105924i("MicroMsg.AppBrand.FloatConsolePrinter", "disable, curIsEnable: " + z2);
        if (z2) {
            C81725x.f239845a = false;
            C81725x.f239846b.mo76979c();
            C81725x.f239847c.mo114083b();
        }
    }
}
