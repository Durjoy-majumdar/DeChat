package com.tencent.p014mm.mj_template.sns.compose.widget;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import p683s0.C36601l;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import ya0.C112430i;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.sns.compose.widget.SnsMoreTemplateWidgetKt$TabLayout$2$2$1$1$1", mo125469f = "SnsMoreTemplateWidget.kt", mo125470l = {204}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.d1 */
public final class C104661d1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f310797d;

    /* renamed from: e */
    public final /* synthetic */ C112430i f310798e;

    /* renamed from: f */
    public final /* synthetic */ int f310799f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104661d1(C112430i iVar, int i, C15601d<? super C104661d1> dVar) {
        super(2, dVar);
        this.f310798e = iVar;
        this.f310799f = i;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C104661d1(this.f310798e, this.f310799f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C104661d1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f310797d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C112430i iVar = this.f310798e;
            int i2 = this.f310799f;
            this.f310797d = 1;
            C36601l<C112430i, ?> lVar = C112430i.f336654g;
            if (iVar.mo164136d(i2, 0.0f, this) == aVar) {
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
