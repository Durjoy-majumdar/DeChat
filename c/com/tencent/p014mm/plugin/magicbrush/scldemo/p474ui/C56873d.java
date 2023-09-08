package com.tencent.p014mm.plugin.magicbrush.scldemo.p474ui;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import p175j0.C60690y0;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.magicbrush.scldemo.ui.MagicBrushSclDemoSelectorUI$getLayoutView$1$1$2$1", mo125469f = "MagicBrushSclDemoSelectorUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.magicbrush.scldemo.ui.d */
public final class C56873d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C60690y0<Boolean> f162918d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56873d(C60690y0<Boolean> y0Var, C15601d<? super C56873d> dVar) {
        super(2, dVar);
        this.f162918d = y0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C56873d(this.f162918d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C56873d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        this.f162918d.setValue(Boolean.TRUE);
        return C13598b0.f38549a;
    }
}
