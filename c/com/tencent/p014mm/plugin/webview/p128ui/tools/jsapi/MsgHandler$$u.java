package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import java.util.Map;
import t83.C13851h1;
import wd3.C78574s0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$u */
public class MsgHandler$$u implements C78574s0 {

    /* renamed from: a */
    public final /* synthetic */ C13851h1 f22863a;

    /* renamed from: b */
    public final /* synthetic */ MsgHandler f22864b;

    public MsgHandler$$u(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f22864b = msgHandler;
        this.f22863a = h1Var;
    }

    /* renamed from: a */
    public void mo708a(int i) {
        if (i == -2) {
            this.f22864b.mo7210k5(this.f22863a, "add_contact:added", (Map<String, Object>) null);
        } else if (i == -1) {
            this.f22864b.mo7210k5(this.f22863a, "add_contact:fail", (Map<String, Object>) null);
        } else if (i == 0) {
            this.f22864b.mo7210k5(this.f22863a, "add_contact:cancel", (Map<String, Object>) null);
        } else if (i != 1) {
            this.f22864b.mo7210k5(this.f22863a, "add_contact:fail", (Map<String, Object>) null);
        } else {
            this.f22864b.mo7210k5(this.f22863a, "add_contact:ok", (Map<String, Object>) null);
        }
    }
}
