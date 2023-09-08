package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import java.util.Map;
import qo3.C77407n;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$b0 */
public class MsgHandler$$b0 implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ C13851h1 f22755a;

    /* renamed from: b */
    public final /* synthetic */ MsgHandler f22756b;

    public MsgHandler$$b0(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f22756b = msgHandler;
        this.f22755a = h1Var;
    }

    public void onDismiss() {
        this.f22756b.mo7210k5(this.f22755a, "chooseImage:cancel", (Map<String, Object>) null);
    }
}
