package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Intent;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.h1 */
public class C6247h1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Intent f23023d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f23024e;

    public C6247h1(MsgHandler msgHandler, Intent intent) {
        this.f23024e = msgHandler;
        this.f23023d = intent;
    }

    public void run() {
        C88144b.m109792j(this.f23024e.f22697d, "scanner", ".ui.BaseScanUI", this.f23023d, false);
    }
}
