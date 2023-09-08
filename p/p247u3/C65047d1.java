package p247u3;

import a14.C0000n0;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import kotlin.ResultKt;
import p247u3.C65145q1;
import rx3.C13598b0;
import rx3.C13603j;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.paging.PagedList$Companion$create$resolvedInitialPage$1", mo125469f = "PagedList.kt", mo125470l = {183}, mo125471m = "invokeSuspend")
/* renamed from: u3.d1 */
public final class C65047d1 extends C91594j implements C32227p<C0000n0, C15601d<? super C65145q1.C65150b.C65152b<Object, Object>>, Object> {

    /* renamed from: d */
    public int f187228d;

    /* renamed from: e */
    public final /* synthetic */ C65145q1 f187229e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0 f187230f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65047d1(C65145q1 q1Var, C8479f0 f0Var, C15601d dVar) {
        super(2, dVar);
        this.f187229e = q1Var;
        this.f187230f = f0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C87412m.m108594g(dVar, "completion");
        return new C65047d1(this.f187229e, this.f187230f, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C65047d1) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f187228d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f187228d = 1;
            obj = this.f187229e.mo72456d((C65145q1.C65146a.C65149c) this.f187230f.f27484d, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C65145q1.C65150b bVar = (C65145q1.C65150b) obj;
        if (bVar instanceof C65145q1.C65150b.C65152b) {
            return (C65145q1.C65150b.C65152b) bVar;
        }
        if (bVar instanceof C65145q1.C65150b.C65151a) {
            throw ((C65145q1.C65150b.C65151a) bVar).f187561a;
        }
        throw new C13603j();
    }
}
