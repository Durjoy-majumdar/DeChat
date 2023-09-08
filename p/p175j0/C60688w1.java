package p175j0;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53965x0;
import f14.C58901s;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import p175j0.C60683t0;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: j0.w1 */
public final class C60688w1 implements C60683t0 {

    /* renamed from: d */
    public static final C60688w1 f172857d = new C60688w1();

    @C91590f(mo125468c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", mo125469f = "ActualAndroid.android.kt", mo125470l = {51}, mo125471m = "invokeSuspend")
    /* renamed from: j0.w1$a */
    public static final class C33488a extends C91594j implements C32227p<C0000n0, C15601d<? super R>, Object> {

        /* renamed from: d */
        public int f90680d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<Long, R> f90681e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33488a(C32226l<? super Long, ? extends R> lVar, C15601d<? super C33488a> dVar) {
            super(2, dVar);
            this.f90681e = lVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C33488a(this.f90681e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C33488a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f90680d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f90680d = 1;
                if (C53965x0.m60607b(16, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return this.f90681e.invoke(new Long(System.nanoTime()));
        }
    }

    /* renamed from: d */
    public <R> Object mo74976d(C32226l<? super Long, ? extends R> lVar, C15601d<? super R> dVar) {
        C53896h0 h0Var = C53872d1.f151117a;
        return C53895h.m60469g(C58901s.f168555a, new C33488a(lVar, (C15601d<? super C33488a>) null), dVar);
    }

    public <R> R fold(R r, C32227p<? super R, ? super C66212f.C66215b, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public <E extends C66212f.C66215b> E get(C66212f.C15602c<E> cVar) {
        C87412m.m108594g(cVar, "key");
        return C66212f.C66215b.C66216a.m78145a(this, cVar);
    }

    public C66212f.C15602c<?> getKey() {
        return C60683t0.C60684a.f172855d;
    }

    public C66212f minusKey(C66212f.C15602c<?> cVar) {
        C87412m.m108594g(cVar, "key");
        return C66212f.C66215b.C66216a.m78146b(this, cVar);
    }

    public C66212f plus(C66212f fVar) {
        C87412m.m108594g(fVar, "context");
        return C66212f.C66213a.m78144a(this, fVar);
    }
}
