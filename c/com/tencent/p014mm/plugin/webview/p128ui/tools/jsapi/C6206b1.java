package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.DialogInterface;
import java.util.Map;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.b1 */
public class C6206b1 implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C13851h1 f22906d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f22907e;

    public C6206b1(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f22907e = msgHandler;
        this.f22906d = h1Var;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f22907e.mo7210k5(this.f22906d, "share_weibo:no_weibo", (Map<String, Object>) null);
    }
}
