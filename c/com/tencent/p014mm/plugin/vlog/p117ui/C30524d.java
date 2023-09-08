package com.tencent.p014mm.plugin.vlog.p117ui;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.vlog.model.C96553q;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import te3.C64899zy;

/* renamed from: com.tencent.mm.plugin.vlog.ui.d */
public final class C30524d extends C87413o implements C32226l<C96553q, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32228q<Boolean, C64899zy, Bitmap, C13598b0> f82240d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30524d(C32228q<? super Boolean, ? super C64899zy, ? super Bitmap, C13598b0> qVar) {
        super(1);
        this.f82240d = qVar;
    }

    public Object invoke(Object obj) {
        C96553q qVar = (C96553q) obj;
        C87412m.m108594g(qVar, LocaleUtil.ITALIAN);
        C61926c.m72668M(new C30523c(this.f82240d, qVar));
        return C13598b0.f38549a;
    }
}
