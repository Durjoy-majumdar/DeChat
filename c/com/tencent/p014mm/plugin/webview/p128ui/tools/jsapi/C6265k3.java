package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.DialogInterface;
import java.util.Map;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.k3 */
public class C6265k3 implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C13851h1 f23063d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f23064e;

    public C6265k3(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f23064e = msgHandler;
        this.f23063d = h1Var;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f23064e.mo7210k5(this.f23063d, "makePhoneCall:dialog dismiss", (Map<String, Object>) null);
    }
}
