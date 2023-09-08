package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.r2 */
public class C6306r2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Intent f23160d;

    public C6306r2(MsgHandler msgHandler, Intent intent) {
        this.f23160d = intent;
    }

    public void run() {
        C88144b.m109791i(MMApplicationContext.getContext(), "voip_cs", ".ui.VoipCSMainUI", this.f23160d, (Bundle) null);
    }
}
