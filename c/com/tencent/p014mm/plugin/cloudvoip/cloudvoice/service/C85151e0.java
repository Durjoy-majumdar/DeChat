package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import p576jp.C33610c;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0 */
public class C85151e0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C85152f0 f248103d;

    public C85151e0(C85152f0 f0Var) {
        this.f248103d = f0Var;
    }

    public void run() {
        C105181w wVar = this.f248103d.f248104a;
        if (wVar.f312382o != C33610c.C33611a.ReasonManual) {
            wVar.f312382o = C33610c.C33611a.ReasonInterrupted;
        }
    }
}
