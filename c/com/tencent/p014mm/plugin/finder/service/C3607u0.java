package com.tencent.p014mm.plugin.finder.service;

import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.service.u0 */
public final class C3607u0 extends C87413o implements C32224a<String> {

    /* renamed from: d */
    public final /* synthetic */ Throwable f16686d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3607u0(Throwable th) {
        super(0);
        this.f16686d = th;
    }

    public Object invoke() {
        String message = this.f16686d.getMessage();
        return message == null ? "" : message;
    }
}
