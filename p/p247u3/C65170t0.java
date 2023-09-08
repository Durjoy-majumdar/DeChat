package p247u3;

import a14.C0000n0;
import d14.C58042h;
import d14.C58080r;
import fy3.C32227p;
import gy3.C87412m;
import k14.C60942d;
import k14.C99088c;
import kotlin.ResultKt;
import p247u3.C65173u0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$3", mo125469f = "PageFetcherSnapshot.kt", mo125470l = {595, 223}, mo125471m = "invokeSuspend")
/* renamed from: u3.t0 */
public final class C65170t0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f187619d;

    /* renamed from: e */
    public Object f187620e;

    /* renamed from: f */
    public Object f187621f;

    /* renamed from: g */
    public int f187622g;

    /* renamed from: h */
    public final /* synthetic */ C65125q0 f187623h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65170t0(C65125q0 q0Var, C15601d dVar) {
        super(2, dVar);
        this.f187623h = q0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C87412m.m108594g(dVar, "completion");
        return new C65170t0(this.f187623h, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C65170t0) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX INFO: finally extract failed */
    public final Object invokeSuspend(Object obj) {
        C65173u0.C65174a<Key, Value> aVar;
        C60942d dVar;
        C65125q0 q0Var;
        C15911a aVar2 = C15911a.COROUTINE_SUSPENDED;
        int i = this.f187622g;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            q0Var = this.f187623h;
            aVar = q0Var.f187458e;
            C99088c cVar = aVar.f187640a;
            this.f187619d = aVar;
            this.f187620e = cVar;
            this.f187621f = q0Var;
            this.f187622g = 1;
            C60942d dVar2 = (C60942d) cVar;
            Object b = dVar2.mo85908b((Object) null, this);
            dVar = dVar2;
            if (b == aVar2) {
                return aVar2;
            }
        } else if (i == 1) {
            q0Var = (C65125q0) this.f187621f;
            aVar = (C65173u0.C65174a) this.f187619d;
            ResultKt.throwOnFailure(obj);
            dVar = (C99088c) this.f187620e;
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            C65173u0<Key, Value> u0Var = aVar.f187641b;
            C58080r rVar = new C58080r(new C65179v0(u0Var, (C15601d) null), C58042h.m67195d(u0Var.f187636i));
            dVar.mo85909c((Object) null);
            C65069i0 i0Var = C65069i0.APPEND;
            this.f187619d = null;
            this.f187620e = null;
            this.f187621f = null;
            this.f187622g = 2;
            if (q0Var.mo89300b(rVar, i0Var, this) == aVar2) {
                return aVar2;
            }
            return C13598b0.f38549a;
        } catch (Throwable th) {
            dVar.mo85909c((Object) null);
            throw th;
        }
    }
}
