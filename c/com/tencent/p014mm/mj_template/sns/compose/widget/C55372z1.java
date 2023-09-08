package com.tencent.p014mm.mj_template.sns.compose.widget;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.sns.compose.widget.SnsTemplateListState$onTemplateSelected$1", mo125469f = "SnsTemplateList.kt", mo125470l = {105}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.z1 */
public final class C55372z1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f157686d;

    /* renamed from: e */
    public final /* synthetic */ C55319n1 f157687e;

    /* renamed from: f */
    public final /* synthetic */ C55366y1 f157688f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55372z1(C55319n1 n1Var, C55366y1 y1Var, C15601d<? super C55372z1> dVar) {
        super(2, dVar);
        this.f157687e = n1Var;
        this.f157688f = y1Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C55372z1(this.f157687e, this.f157688f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C55372z1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f157686d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.SnsTemplate.SnsTemplateListState", "onTemplateSelected: " + this.f157687e.f157555a);
            C32227p<? super String, ? super C15601d<? super Boolean>, ? extends Object> pVar = this.f157688f.f157671g;
            String str = this.f157687e.f157555a;
            this.f157686d = 1;
            if (pVar.invoke(str, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f157688f.mo76622e(this.f157687e.f157555a);
        return C13598b0.f38549a;
    }
}
