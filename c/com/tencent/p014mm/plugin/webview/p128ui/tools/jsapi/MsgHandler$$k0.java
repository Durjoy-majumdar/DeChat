package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.webview.model.C96651n;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import java.util.Map;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$k0 */
public class MsgHandler$$k0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C96651n f22814d;

    /* renamed from: e */
    public final /* synthetic */ String f22815e;

    /* renamed from: f */
    public final /* synthetic */ C13851h1 f22816f;

    /* renamed from: g */
    public final /* synthetic */ String f22817g;

    /* renamed from: h */
    public final /* synthetic */ MsgHandler f22818h;

    public MsgHandler$$k0(MsgHandler msgHandler, C96651n nVar, String str, C13851h1 h1Var, String str2) {
        this.f22818h = msgHandler;
        this.f22814d = nVar;
        this.f22815e = str;
        this.f22816f = h1Var;
        this.f22817g = str2;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C6080m.Cx0().mo134808h(this.f22814d);
        C6080m.Cx0().mo134805e(this.f22815e);
        MsgHandler.m6127L3(this.f22818h);
        MsgHandler msgHandler = this.f22818h;
        C13851h1 h1Var = this.f22816f;
        msgHandler.mo7210k5(h1Var, this.f22817g + ":cancel", (Map<String, Object>) null);
    }
}
