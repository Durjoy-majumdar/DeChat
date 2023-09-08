package com.tencent.p014mm.storage;

import di3.C86312j;
import p227rn.C22240c0;

/* renamed from: com.tencent.mm.storage.f0 */
public final class C72962f0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f212658d;

    /* renamed from: e */
    public final /* synthetic */ int f212659e;

    /* renamed from: f */
    public final /* synthetic */ int f212660f;

    public C72962f0(String str, int i, int i2) {
        this.f212658d = str;
        this.f212659e = i;
        this.f212660f = i2;
    }

    public final void run() {
        if (((C22240c0) C86312j.m106911c(C22240c0.class)).mo35407eG()) {
            C19601c0.f55446a.mo25723l(this.f212658d, this.f212659e, this.f212660f, 0);
        } else {
            C19601c0.f55446a.mo25722k(this.f212658d, this.f212659e, this.f212660f, 0);
        }
    }
}
