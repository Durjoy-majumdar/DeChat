package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.webview.model.C96651n;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import java.util.Map;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$g0 */
public class MsgHandler$$g0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C96651n f22779d;

    /* renamed from: e */
    public final /* synthetic */ String f22780e;

    /* renamed from: f */
    public final /* synthetic */ C13851h1 f22781f;

    /* renamed from: g */
    public final /* synthetic */ String f22782g;

    /* renamed from: h */
    public final /* synthetic */ MsgHandler f22783h;

    public MsgHandler$$g0(MsgHandler msgHandler, C96651n nVar, String str, C13851h1 h1Var, String str2) {
        this.f22783h = msgHandler;
        this.f22779d = nVar;
        this.f22780e = str;
        this.f22781f = h1Var;
        this.f22782g = str2;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C6080m.Cx0().mo134808h(this.f22779d);
        C6080m.Cx0().mo134805e(this.f22780e);
        MsgHandler msgHandler = this.f22783h;
        C13851h1 h1Var = this.f22781f;
        msgHandler.mo7210k5(h1Var, this.f22782g + ":fail", (Map<String, Object>) null);
    }
}
