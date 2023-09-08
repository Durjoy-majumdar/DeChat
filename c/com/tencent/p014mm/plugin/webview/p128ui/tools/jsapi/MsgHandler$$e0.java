package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import java.util.Map;
import qo3.C77407n;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$e0 */
public class MsgHandler$$e0 implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ C13851h1 f22769a;

    /* renamed from: b */
    public final /* synthetic */ MsgHandler f22770b;

    public MsgHandler$$e0(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f22770b = msgHandler;
        this.f22769a = h1Var;
    }

    public void onDismiss() {
        this.f22770b.mo7210k5(this.f22769a, "doChooseMedia:cancel", (Map<String, Object>) null);
    }
}
