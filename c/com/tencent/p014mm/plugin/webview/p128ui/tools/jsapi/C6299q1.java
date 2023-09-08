package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.autogen.events.ECardJsApiCheckEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.q1 */
public class C6299q1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ECardJsApiCheckEvent f23134d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23135e;

    /* renamed from: f */
    public final /* synthetic */ MsgHandler f23136f;

    public C6299q1(MsgHandler msgHandler, ECardJsApiCheckEvent eCardJsApiCheckEvent, C13851h1 h1Var) {
        this.f23136f = msgHandler;
        this.f23134d = eCardJsApiCheckEvent;
        this.f23135e = h1Var;
    }

    public void run() {
        Log.m105924i("MicroMsg.MsgHandler", "run ecard jsapi check callback");
        if (this.f23134d.f9050e.f9064a == 0) {
            this.f23136f.mo7210k5(this.f23135e, "openECard:ok", (Map<String, Object>) null);
        } else {
            this.f23136f.mo7210k5(this.f23135e, "openECard:fail", (Map<String, Object>) null);
        }
    }
}
