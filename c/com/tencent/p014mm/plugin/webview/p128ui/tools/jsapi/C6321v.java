package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import p008bq.C0364r0;
import p008bq.C67305d1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.v */
public class C6321v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C86009m1 f23203d;

    /* renamed from: e */
    public final /* synthetic */ String f23204e;

    /* renamed from: f */
    public final /* synthetic */ MsgHandler f23205f;

    public C6321v(MsgHandler msgHandler, C86009m1 m1Var, String str) {
        this.f23205f = msgHandler;
        this.f23203d = m1Var;
        this.f23204e = str;
    }

    public void run() {
        String q = C86013q1.m106456q(this.f23203d.mo119976n());
        String BX = ((C0364r0) C86312j.m106911c(C0364r0.class)).mo405BX(((C67305d1) C86312j.m106911c(C67305d1.class)).rx0(), "", q);
        if (!C86013q1.m106450k(BX)) {
            C86013q1.m106442c(this.f23203d.mo119971i(), BX);
        }
        MsgHandler msgHandler = this.f23205f;
        String str = this.f23204e;
        msgHandler.getClass();
        MMHandlerThread.postToMainThread(new C6337x(msgHandler, q, str));
    }
}
