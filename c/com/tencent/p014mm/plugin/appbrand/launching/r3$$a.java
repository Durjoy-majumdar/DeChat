package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.r3$$a */
public final /* synthetic */ class r3$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f11801d;

    public /* synthetic */ r3$$a(String str) {
        this.f11801d = str;
    }

    public final void run() {
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) this.f11801d, 0).show();
    }
}
