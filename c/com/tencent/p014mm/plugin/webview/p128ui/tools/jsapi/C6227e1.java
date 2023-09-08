package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.model.gdpr.C1290b;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import t83.C13851h1;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.e1 */
public class C6227e1 implements C1290b {

    /* renamed from: a */
    public final /* synthetic */ C13851h1 f22969a;

    /* renamed from: b */
    public final /* synthetic */ JsapiPermissionWrapper f22970b;

    /* renamed from: c */
    public final /* synthetic */ MsgHandler f22971c;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.e1$a */
    public class C6228a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f22972d;

        public C6228a(int i) {
            this.f22972d = i;
        }

        public void run() {
            if (this.f22972d == 0) {
                C6227e1 e1Var = C6227e1.this;
                MsgHandler msgHandler = e1Var.f22971c;
                C13851h1 h1Var = e1Var.f22969a;
                JsapiPermissionWrapper jsapiPermissionWrapper = e1Var.f22970b;
                char[] cArr = MsgHandler.f22653Q0;
                msgHandler.mo7227t5(h1Var, jsapiPermissionWrapper);
                return;
            }
            Log.m105924i("MicroMsg.MsgHandler", "EU user failed");
            C6227e1 e1Var2 = C6227e1.this;
            e1Var2.f22971c.mo7210k5(e1Var2.f22969a, "add_contact:fail  EU user failed", (Map<String, Object>) null);
        }
    }

    public C6227e1(MsgHandler msgHandler, C13851h1 h1Var, JsapiPermissionWrapper jsapiPermissionWrapper) {
        this.f22971c = msgHandler;
        this.f22969a = h1Var;
        this.f22970b = jsapiPermissionWrapper;
    }

    /* renamed from: a */
    public void mo1216a(int i) {
        ((C119157j) C119157j.f356862d).mo183895z(new C6228a(i));
    }
}
