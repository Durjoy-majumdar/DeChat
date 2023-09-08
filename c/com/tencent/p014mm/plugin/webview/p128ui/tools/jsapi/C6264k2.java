package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import cc0.C92411b;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.k2 */
public class C6264k2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MsgHandler f23062d;

    public C6264k2(MsgHandler msgHandler) {
        this.f23062d = msgHandler;
    }

    public void run() {
        MsgHandler msgHandler = this.f23062d;
        C92411b bVar = msgHandler.f22684M;
        if (bVar != null) {
            bVar.mo126408b(msgHandler.f22685N);
        }
        MsgHandler msgHandler2 = this.f23062d;
        if (msgHandler2.f22685N == null) {
            Log.m105928w("MicroMsg.MsgHandler", "already callback");
            return;
        }
        msgHandler2.f22685N = null;
        msgHandler2.mo7210k5(msgHandler2.f22698e, "geo_location:fail_timeout", (Map<String, Object>) null);
    }
}
