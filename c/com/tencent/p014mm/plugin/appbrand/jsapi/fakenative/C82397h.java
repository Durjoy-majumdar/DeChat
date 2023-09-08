package com.tencent.p014mm.plugin.appbrand.jsapi.fakenative;

import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.h */
public class C82397h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C82398i f241461d;

    public C82397h(C82398i iVar) {
        this.f241461d = iVar;
    }

    public void run() {
        C89779i0 i0Var = this.f241461d.f241463h;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f241461d.f241463h = null;
        }
    }
}
