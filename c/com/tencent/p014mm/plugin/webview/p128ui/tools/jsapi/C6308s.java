package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import p008bq.C0364r0;
import p008bq.C67305d1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.s */
public class C6308s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C86009m1 f23164d;

    /* renamed from: e */
    public final /* synthetic */ String f23165e;

    /* renamed from: f */
    public final /* synthetic */ String f23166f;

    /* renamed from: g */
    public final /* synthetic */ MsgHandler f23167g;

    public C6308s(MsgHandler msgHandler, C86009m1 m1Var, String str, String str2) {
        this.f23167g = msgHandler;
        this.f23164d = m1Var;
        this.f23165e = str;
        this.f23166f = str2;
    }

    public void run() {
        String q = C86013q1.m106456q(this.f23164d.mo119976n());
        String BX = ((C0364r0) C86312j.m106911c(C0364r0.class)).mo405BX(((C67305d1) C86312j.m106911c(C67305d1.class)).rx0(), "", q);
        if (!C86013q1.m106450k(BX)) {
            C86013q1.m106442c(this.f23164d.mo119971i(), BX);
        }
        MsgHandler.m6140N3(this.f23167g, q, this.f23165e, this.f23166f);
    }
}
