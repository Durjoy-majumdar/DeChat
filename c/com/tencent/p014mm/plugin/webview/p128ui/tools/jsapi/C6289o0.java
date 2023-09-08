package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.DialogInterface;
import java.util.Map;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.o0 */
public class C6289o0 implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C13851h1 f23115d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f23116e;

    public C6289o0(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f23116e = msgHandler;
        this.f23115d = h1Var;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f23116e.mo7210k5(this.f23115d, "share_weibo:not_bind_qq", (Map<String, Object>) null);
    }
}
