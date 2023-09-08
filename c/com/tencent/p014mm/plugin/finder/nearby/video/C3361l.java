package com.tencent.p014mm.plugin.finder.nearby.video;

import bh3.C113177k;
import com.tencent.p014mm.plugin.finder.utils.FinderLbsLogic;
import di3.C86312j;
import dp1.C58417y0;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.nearby.video.l */
public final class C3361l extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C3352j f15822d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3361l(C3352j jVar) {
        super(0);
        this.f15822d = jVar;
    }

    public Object invoke() {
        FinderLbsLogic finderLbsLogic = FinderLbsLogic.f17479a;
        if (!finderLbsLogic.mo4229a() || ((C113177k) C86312j.m106911c(C113177k.class)).w00(C113177k.C113179b.LOCAION, C113177k.C113178a.FINDER)) {
            ((C58417y0) C86312j.m106911c(C58417y0.class)).Hx0(this.f15822d.f15805e, 2);
            finderLbsLogic.mo4230b(this.f15822d.f15805e);
        } else {
            this.f15822d.f15807g.checkAndShowBusinessPermissionDialog();
        }
        return C13598b0.f38549a;
    }
}
