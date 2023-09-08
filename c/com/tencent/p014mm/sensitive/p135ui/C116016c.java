package com.tencent.p014mm.sensitive.p135ui;

import android.app.Activity;
import bh3.C113177k;
import fy3.C32226l;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.sensitive.ui.c */
public final class C116016c extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C113177k.C113179b f347993d;

    /* renamed from: e */
    public final /* synthetic */ C113177k.C113178a f347994e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f347995f;

    /* renamed from: g */
    public final /* synthetic */ Activity f347996g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116016c(C113177k.C113179b bVar, C113177k.C113178a aVar, C32226l<? super Boolean, C13598b0> lVar, Activity activity) {
        super(1);
        this.f347993d = bVar;
        this.f347994e = aVar;
        this.f347995f = lVar;
        this.f347996g = activity;
    }

    public Object invoke(Object obj) {
        C61926c.m72668M(new C116015b(((Boolean) obj).booleanValue(), this.f347993d, this.f347994e, this.f347995f, this.f347996g));
        return C13598b0.f38549a;
    }
}
