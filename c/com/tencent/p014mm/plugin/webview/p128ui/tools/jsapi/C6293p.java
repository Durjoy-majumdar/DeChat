package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Intent;
import android.os.Bundle;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.p */
public class C6293p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Intent f23123d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f23124e;

    public C6293p(MsgHandler msgHandler, Intent intent) {
        this.f23124e = msgHandler;
        this.f23123d = intent;
    }

    public void run() {
        C88144b.m109791i(this.f23124e.f22697d, "webview", ".ui.tools.WebViewUI", this.f23123d, (Bundle) null);
    }
}
