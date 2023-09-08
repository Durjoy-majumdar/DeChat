package com.tencent.p014mm.plugin.finder.service;

import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.service.s0 */
public final class C3606s0 extends C87413o implements C32224a<String> {

    /* renamed from: d */
    public final /* synthetic */ Throwable f16685d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3606s0(Throwable th) {
        super(0);
        this.f16685d = th;
    }

    public Object invoke() {
        String message = this.f16685d.getMessage();
        return message == null ? "" : message;
    }
}
