package com.tencent.p014mm.plugin.vlog.p117ui;

import android.graphics.Bitmap;
import ei2.C31606c;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import te3.C64899zy;

/* renamed from: com.tencent.mm.plugin.vlog.ui.b */
public final class C30522b extends C87413o implements C32226l<Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C31606c f82235d;

    /* renamed from: e */
    public final /* synthetic */ C32228q<Boolean, C64899zy, Bitmap, C13598b0> f82236e;

    /* renamed from: f */
    public final /* synthetic */ C64899zy f82237f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30522b(C31606c cVar, C32228q<? super Boolean, ? super C64899zy, ? super Bitmap, C13598b0> qVar, C64899zy zyVar) {
        super(1);
        this.f82235d = cVar;
        this.f82236e = qVar;
        this.f82237f = zyVar;
    }

    public Object invoke(Object obj) {
        this.f82235d.destroy();
        C61926c.m72668M(new C30521a(this.f82236e, this.f82237f, (Bitmap) obj));
        return C13598b0.f38549a;
    }
}
