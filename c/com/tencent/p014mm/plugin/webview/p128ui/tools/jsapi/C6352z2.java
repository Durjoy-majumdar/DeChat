package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.DialogInterface;
import java.util.Map;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.z2 */
public class C6352z2 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13851h1 f23262d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f23263e;

    public C6352z2(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f23263e = msgHandler;
        this.f23262d = h1Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f23263e.mo7210k5(this.f23262d, "makePhoneCall:cancel", (Map<String, Object>) null);
    }
}
