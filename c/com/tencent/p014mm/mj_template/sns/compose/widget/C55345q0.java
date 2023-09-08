package com.tencent.p014mm.mj_template.sns.compose.widget;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import na0.C61630a;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.sns.compose.widget.MusicSearchPanelState$search$1", mo125469f = "MusicSearchPanel.kt", mo125470l = {506}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.q0 */
public final class C55345q0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f157618d;

    /* renamed from: e */
    public final /* synthetic */ C55341p0 f157619e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55345q0(C55341p0 p0Var, C15601d<? super C55345q0> dVar) {
        super(2, dVar);
        this.f157619e = p0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C55345q0(this.f157619e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C55345q0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f157618d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C61630a aVar2 = this.f157619e.f157611r;
            if (aVar2 != null) {
                this.f157618d = 1;
                if (aVar2.mo86581d(this) == aVar) {
                    return aVar;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f157619e.f157611r = null;
        return C13598b0.f38549a;
    }
}
