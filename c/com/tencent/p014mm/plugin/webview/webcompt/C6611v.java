package com.tencent.p014mm.plugin.webview.webcompt;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.webview.webcompt.v */
public final class C6611v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f23867d;

    public C6611v(String str) {
        this.f23867d = str;
    }

    public final void run() {
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) this.f23867d, 0).show();
    }
}
