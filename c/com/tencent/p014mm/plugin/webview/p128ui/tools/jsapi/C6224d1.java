package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Intent;
import android.os.Bundle;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.d1 */
public class C6224d1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Intent f22957d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f22958e;

    public C6224d1(MsgHandler msgHandler, Intent intent) {
        this.f22958e = msgHandler;
        this.f22957d = intent;
    }

    public void run() {
        C88144b.m109791i(this.f22958e.f22697d, "webview", ".ui.tools.WebViewUI", this.f22957d, (Bundle) null);
    }
}
