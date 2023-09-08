package i31;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.datapreloader.FutureTask$cancel$2", mo125469f = "FutureTask.kt", mo125470l = {82}, mo125471m = "invokeSuspend")
/* renamed from: i31.b */
public final class C117132b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f350945d;

    /* renamed from: e */
    public final /* synthetic */ C117134d<Object, Object, C117139g<Object, Object>> f350946e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117132b(C117134d<Object, Object, C117139g<Object, Object>> dVar, C15601d<? super C117132b> dVar2) {
        super(2, dVar2);
        this.f350946e = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C117132b(this.f350946e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C117132b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f350945d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C117134d<Object, Object, C117139g<Object, Object>> dVar = this.f350946e;
            this.f350945d = 1;
            if (dVar.mo181072j(this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f350946e.mo181068b().mo10079a();
        return C13598b0.f38549a;
    }
}
