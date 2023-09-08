package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import java.util.Map;
import qo3.C77407n;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$g */
public class MsgHandler$$g implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ C13851h1 f22777a;

    /* renamed from: b */
    public final /* synthetic */ MsgHandler f22778b;

    public MsgHandler$$g(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f22778b = msgHandler;
        this.f22777a = h1Var;
    }

    public void onDismiss() {
        this.f22778b.mo7213m5(MsgHandler.f22662Z0, MsgHandler.f22666d1);
        this.f22778b.mo7210k5(this.f22777a, "chooseIdCard:cancel", (Map<String, Object>) null);
    }
}
