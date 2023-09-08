package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.DialogInterface;
import di3.C86312j;
import java.util.Map;
import p158gt.C8451i;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.i0 */
public class C6251i0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ String f23032d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23033e;

    /* renamed from: f */
    public final /* synthetic */ MsgHandler f23034f;

    public C6251i0(MsgHandler msgHandler, String str, C13851h1 h1Var) {
        this.f23034f = msgHandler;
        this.f23032d = str;
        this.f23033e = h1Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        ((C8451i) C86312j.m106911c(C8451i.class)).mo9372SO(this.f23032d);
        this.f23034f.mo7210k5(this.f23033e, "send_service_app_msg:fail", (Map<String, Object>) null);
    }
}
