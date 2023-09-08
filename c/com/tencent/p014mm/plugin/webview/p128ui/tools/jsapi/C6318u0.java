package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Intent;
import android.os.Bundle;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.u0 */
public class C6318u0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Intent f23198d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f23199e;

    public C6318u0(MsgHandler msgHandler, Intent intent) {
        this.f23199e = msgHandler;
        this.f23198d = intent;
    }

    public void run() {
        C88144b.m109791i(this.f23199e.f22697d, "webview", ".ui.tools.WebViewUI", this.f23198d, (Bundle) null);
    }
}
