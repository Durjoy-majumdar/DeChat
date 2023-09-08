package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.y0 */
public class C81392y0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f238897d;

    /* renamed from: e */
    public final /* synthetic */ C81376w0 f238898e;

    public C81392y0(C81376w0 w0Var, String str) {
        this.f238898e = w0Var;
        this.f238897d = str;
    }

    public void run() {
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) this.f238897d, 1).show();
        this.f238898e.quit();
    }
}
