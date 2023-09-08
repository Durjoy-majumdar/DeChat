package com.tencent.p014mm.plugin.vlog.p117ui;

import android.graphics.Bitmap;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C64899zy;

/* renamed from: com.tencent.mm.plugin.vlog.ui.a */
public final class C30521a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32228q<Boolean, C64899zy, Bitmap, C13598b0> f82232d;

    /* renamed from: e */
    public final /* synthetic */ C64899zy f82233e;

    /* renamed from: f */
    public final /* synthetic */ Bitmap f82234f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30521a(C32228q<? super Boolean, ? super C64899zy, ? super Bitmap, C13598b0> qVar, C64899zy zyVar, Bitmap bitmap) {
        super(0);
        this.f82232d = qVar;
        this.f82233e = zyVar;
        this.f82234f = bitmap;
    }

    public Object invoke() {
        this.f82232d.invoke(Boolean.TRUE, this.f82233e, this.f82234f);
        return C13598b0.f38549a;
    }
}
