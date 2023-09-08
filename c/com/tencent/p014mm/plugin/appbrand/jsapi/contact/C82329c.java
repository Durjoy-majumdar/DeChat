package com.tencent.p014mm.plugin.appbrand.jsapi.contact;

import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.c */
public class C82329c implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ String[] f241290d;

    public C82329c(C82327b bVar, String[] strArr) {
        this.f241290d = strArr;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107142f(0, this.f241290d[0]);
        e0Var.mo107142f(1, this.f241290d[1]);
    }
}
