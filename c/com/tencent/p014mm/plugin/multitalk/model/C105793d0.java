package com.tencent.p014mm.plugin.multitalk.model;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import i82.C108409g;
import j82.C108656b;
import k82.C108957b;
import k82.C108963c;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: com.tencent.mm.plugin.multitalk.model.d0 */
public final class C105793d0 extends C87413o implements C32226l<C32226l<? super C15601d<? super C13598b0>, ? extends Object>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C105783b0 f314597d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105793d0(C105783b0 b0Var) {
        super(1);
        this.f314597d = b0Var;
    }

    public Object invoke(Object obj) {
        C108409g<C108957b, C108963c> a;
        C32226l lVar = (C32226l) obj;
        C87412m.m108594g(lVar, LocaleUtil.ITALIAN);
        C108656b bVar = this.f314597d.f314573a;
        if (!(bVar == null || (a = bVar.mo159679a()) == null)) {
            a.mo158936a(new C108957b.C108960c(lVar));
        }
        return C13598b0.f38549a;
    }
}
