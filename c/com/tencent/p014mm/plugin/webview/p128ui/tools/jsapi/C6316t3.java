package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import java.util.Map;
import t83.C13851h1;
import wd3.C78574s0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.t3 */
public class C6316t3 implements C78574s0 {

    /* renamed from: a */
    public final /* synthetic */ C13851h1 f23192a;

    /* renamed from: b */
    public final /* synthetic */ MsgHandler f23193b;

    public C6316t3(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f23193b = msgHandler;
        this.f23192a = h1Var;
    }

    /* renamed from: a */
    public void mo708a(int i) {
        if (i == -2) {
            this.f23193b.mo7210k5(this.f23192a, "quickly_add_contact:added", (Map<String, Object>) null);
        } else if (i == -1) {
            this.f23193b.mo7210k5(this.f23192a, "quickly_add_contact:fail", (Map<String, Object>) null);
        } else if (i == 0) {
            this.f23193b.mo7210k5(this.f23192a, "quickly_add_contact:cancel", (Map<String, Object>) null);
        } else if (i != 1) {
            this.f23193b.mo7210k5(this.f23192a, "quickly_add_contact:fail", (Map<String, Object>) null);
        } else {
            this.f23193b.mo7210k5(this.f23192a, "quickly_add_contact:ok", (Map<String, Object>) null);
        }
    }
}
