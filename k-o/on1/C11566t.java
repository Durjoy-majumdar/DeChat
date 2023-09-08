package on1;

import a14.C0000n0;
import cm1.C0740i2;
import fy3.C32227p;
import kotlin.ResultKt;
import on1.C11537n;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.newloader.Loader$loadFirstScreen$1", mo125469f = "Loader.kt", mo125470l = {86, 87}, mo125471m = "invokeSuspend")
/* renamed from: on1.t */
public final class C11566t extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f33937d;

    /* renamed from: e */
    public final /* synthetic */ C11548q<C0740i2> f33938e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11566t(C11548q<C0740i2> qVar, C15601d<? super C11566t> dVar) {
        super(2, dVar);
        this.f33938e = qVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C11566t(this.f33938e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C11566t) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f33937d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C11545o<T> oVar = this.f33938e.f33888f;
            if (oVar != null) {
                this.f33937d = 1;
                obj = oVar.mo11470c(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return C13598b0.f38549a;
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C11575y yVar = (C11575y) obj;
        if (yVar != null) {
            C11548q<C0740i2> qVar = this.f33938e;
            C11537n.C11539b bVar = new C11537n.C11539b(yVar);
            this.f33937d = 2;
            if (qVar.mo11509l3(bVar, this) == aVar) {
                return aVar;
            }
        }
        return C13598b0.f38549a;
    }
}
