package com.tencent.p014mm.plugin.mmsight.p077ui;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.mmsight.ui.ImproveProgressHandlerAnimator$updateProgress$2", mo125469f = "ImproveProgressHandlerAnimator.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.mmsight.ui.h */
public final class C105532h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C105534i f313930d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105532h(C105534i iVar, C15601d<? super C105532h> dVar) {
        super(2, dVar);
        this.f313930d = iVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C105532h(this.f313930d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C105532h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C105534i iVar = this.f313930d;
        C105516a aVar = iVar.f313942k;
        if (aVar == null) {
            return null;
        }
        aVar.mo150364a(iVar.f313937f);
        return C13598b0.f38549a;
    }
}
