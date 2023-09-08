package com.tencent.p014mm.plugin.vlog.p117ui;

import android.graphics.Bitmap;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C64899zy;

/* renamed from: com.tencent.mm.plugin.vlog.ui.h */
public final class C30527h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32228q<Boolean, C64899zy, Bitmap, C13598b0> f82244d;

    /* renamed from: e */
    public final /* synthetic */ C64899zy f82245e;

    /* renamed from: f */
    public final /* synthetic */ Bitmap f82246f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30527h(C32228q<? super Boolean, ? super C64899zy, ? super Bitmap, C13598b0> qVar, C64899zy zyVar, Bitmap bitmap) {
        super(0);
        this.f82244d = qVar;
        this.f82245e = zyVar;
        this.f82246f = bitmap;
    }

    public Object invoke() {
        this.f82244d.invoke(Boolean.TRUE, this.f82245e, this.f82246f);
        return C13598b0.f38549a;
    }
}
