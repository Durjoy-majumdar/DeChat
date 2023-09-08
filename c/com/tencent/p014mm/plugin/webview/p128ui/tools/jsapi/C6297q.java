package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.q */
public class C6297q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MsgHandler f23132d;

    public C6297q(MsgHandler msgHandler) {
        this.f23132d = msgHandler;
    }

    public void run() {
        try {
            MsgHandler.m6308o0(this.f23132d, new C13851h1(), (JsapiPermissionWrapper) null);
        } catch (Exception e) {
            Log.m105925i("MicroMsg.MsgHandler", "openCunstomWebview, close window exception : %s", e.getMessage());
        }
    }
}
