package qj1;

import a14.C0000n0;
import cl1.C0680q1;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveAdVideoPlugin$mount$1$1", mo125469f = "FinderLiveAdVideoPlugin.kt", mo125470l = {82}, mo125471m = "invokeSuspend")
/* renamed from: qj1.p */
public final class C12591p extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f36115d;

    /* renamed from: e */
    public final /* synthetic */ C62898o f36116e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12591p(C62898o oVar, C15601d<? super C12591p> dVar) {
        super(2, dVar);
        this.f36116e = oVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C12591p(this.f36116e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C12591p) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f36115d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f36115d = 1;
            if (((C0680q1) this.f36116e.mo87696x0(C0680q1.class)).mo644c3(this) == aVar) {
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
