package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.r3 */
public enum C83454r3 {
    ;

    /* renamed from: a */
    public static void m102415a(int i, C83404p1 p1Var) {
        m102416b(MMApplicationContext.getResources().getString(i), p1Var);
    }

    /* renamed from: b */
    public static void m102416b(String str, C83404p1 p1Var) {
        Log.m105921e("MicroMsg.AppBrand.PrepareQuickAccess", "toast: %s, step:%s", str, p1Var.getClass().getName());
        if (p1Var.mo115519d()) {
            MMHandlerThread.postToMainThread(new r3$$a(str));
        }
    }
}
