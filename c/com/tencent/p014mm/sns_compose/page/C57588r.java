package com.tencent.p014mm.sns_compose.page;

import com.tencent.p014mm.sns_compose.page.C57573j;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import lh3.C99474g;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.sns_compose.page.WithTaViewModel$applyEvents$1", mo125469f = "WithTaViewModel.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.sns_compose.page.r */
public final class C57588r extends C91594j implements C32227p<C99474g, C15601d<? super Boolean>, Object> {

    /* renamed from: d */
    public /* synthetic */ Object f164902d;

    /* renamed from: e */
    public final /* synthetic */ C57573j f164903e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57588r(C57573j jVar, C15601d<? super C57588r> dVar) {
        super(2, dVar);
        this.f164903e = jVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C57588r rVar = new C57588r(this.f164903e, dVar);
        rVar.f164902d = obj;
        return rVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C57588r) create((C99474g) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        return Boolean.valueOf(!C87412m.m108589b(((C57573j.C57574a) this.f164903e).f164864a.f291655d, ((C99474g) this.f164902d).f291655d));
    }
}
