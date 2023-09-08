package com.tencent.p014mm.plugin.finder.p056ui;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import p277yf.C15996c;
import ql1.C12874a;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C36570n;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.ui.FinderLiveNormalOccupyUI5$MyAdapter$onBindViewHolder$1", mo125469f = "FinderLiveNormalOccupyUI5.kt", mo125470l = {135}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.finder.ui.g1 */
public final class C3829g1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f17361d;

    /* renamed from: e */
    public final /* synthetic */ C13604l<String, String> f17362e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3829g1(C13604l<String, String> lVar, C15601d<? super C3829g1> dVar) {
        super(2, dVar);
        this.f17362e = lVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C3829g1(this.f17362e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C3829g1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f17361d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C12874a aVar2 = C12874a.f36849a;
            C13604l<String, String> lVar = this.f17362e;
            this.f17361d = 1;
            if (((C15996c) ((C36570n) C12874a.f36851c).getValue()).mo14622b((String) lVar.f38556e, (String) lVar.f38555d, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
