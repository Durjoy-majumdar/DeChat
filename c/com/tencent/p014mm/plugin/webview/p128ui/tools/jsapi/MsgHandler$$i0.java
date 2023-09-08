package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.DialogInterface;
import java.util.Map;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$i0 */
public class MsgHandler$$i0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13851h1 f22795d;

    /* renamed from: e */
    public final /* synthetic */ String f22796e;

    /* renamed from: f */
    public final /* synthetic */ MsgHandler f22797f;

    public MsgHandler$$i0(MsgHandler msgHandler, C13851h1 h1Var, String str) {
        this.f22797f = msgHandler;
        this.f22795d = h1Var;
        this.f22796e = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        MsgHandler msgHandler = this.f22797f;
        C13851h1 h1Var = this.f22795d;
        msgHandler.mo7210k5(h1Var, this.f22796e + ":cancel", (Map<String, Object>) null);
    }
}
