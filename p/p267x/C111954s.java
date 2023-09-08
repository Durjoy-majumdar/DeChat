package p267x;

import a14.C53930o0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87413o;
import kotlin.ResultKt;
import p1165z.C112527l;
import p1165z.C112530o;
import p1166z0.C112539e;
import p175j0.C60667k2;
import p175j0.C60690y0;
import p190l1.C109119z;
import p759y.C112205c1;
import p759y.C112209d0;
import p759y.C112219f1;
import p759y.C112255l0;
import p759y.C112260m0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1", mo125469f = "Clickable.kt", mo125470l = {142}, mo125471m = "invokeSuspend")
/* renamed from: x.s */
public final class C111954s extends C91594j implements C32227p<C109119z, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f335154d;

    /* renamed from: e */
    public /* synthetic */ Object f335155e;

    /* renamed from: f */
    public final /* synthetic */ boolean f335156f;

    /* renamed from: g */
    public final /* synthetic */ C112527l f335157g;

    /* renamed from: h */
    public final /* synthetic */ C60690y0<C112530o> f335158h;

    /* renamed from: i */
    public final /* synthetic */ C60667k2<C32224a<Boolean>> f335159i;

    /* renamed from: j */
    public final /* synthetic */ C60667k2<C32224a<C13598b0>> f335160j;

    @C91590f(mo125468c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1", mo125469f = "Clickable.kt", mo125470l = {145}, mo125471m = "invokeSuspend")
    /* renamed from: x.s$a */
    public static final class C111955a extends C91594j implements C32228q<C112255l0, C112539e, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f335161d;

        /* renamed from: e */
        public /* synthetic */ Object f335162e;

        /* renamed from: f */
        public /* synthetic */ long f335163f;

        /* renamed from: g */
        public final /* synthetic */ boolean f335164g;

        /* renamed from: h */
        public final /* synthetic */ C112527l f335165h;

        /* renamed from: i */
        public final /* synthetic */ C60690y0<C112530o> f335166i;

        /* renamed from: j */
        public final /* synthetic */ C60667k2<C32224a<Boolean>> f335167j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111955a(boolean z, C112527l lVar, C60690y0<C112530o> y0Var, C60667k2<? extends C32224a<Boolean>> k2Var, C15601d<? super C111955a> dVar) {
            super(3, dVar);
            this.f335164g = z;
            this.f335165h = lVar;
            this.f335166i = y0Var;
            this.f335167j = k2Var;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            long j = ((C112539e) obj2).f336959a;
            C111955a aVar = new C111955a(this.f335164g, this.f335165h, this.f335166i, this.f335167j, (C15601d) obj3);
            aVar.f335162e = (C112255l0) obj;
            aVar.f335163f = j;
            return aVar.invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f335161d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C112255l0 l0Var = (C112255l0) this.f335162e;
                long j = this.f335163f;
                if (this.f335164g) {
                    C112527l lVar = this.f335165h;
                    C60690y0<C112530o> y0Var = this.f335166i;
                    C60667k2<C32224a<Boolean>> k2Var = this.f335167j;
                    this.f335161d = 1;
                    Object f = C53930o0.m60559f(new C111965x(l0Var, j, lVar, y0Var, k2Var, (C15601d<? super C111965x>) null), this);
                    if (f != aVar) {
                        f = C13598b0.f38549a;
                    }
                    if (f == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: x.s$b */
    public static final class C111956b extends C87413o implements C32226l<C112539e, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f335168d;

        /* renamed from: e */
        public final /* synthetic */ C60667k2<C32224a<C13598b0>> f335169e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111956b(boolean z, C60667k2<? extends C32224a<C13598b0>> k2Var) {
            super(1);
            this.f335168d = z;
            this.f335169e = k2Var;
        }

        public Object invoke(Object obj) {
            long j = ((C112539e) obj).f336959a;
            if (this.f335168d) {
                this.f335169e.getValue().invoke();
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111954s(boolean z, C112527l lVar, C60690y0<C112530o> y0Var, C60667k2<? extends C32224a<Boolean>> k2Var, C60667k2<? extends C32224a<C13598b0>> k2Var2, C15601d<? super C111954s> dVar) {
        super(2, dVar);
        this.f335156f = z;
        this.f335157g = lVar;
        this.f335158h = y0Var;
        this.f335159i = k2Var;
        this.f335160j = k2Var2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C111954s sVar = new C111954s(this.f335156f, this.f335157g, this.f335158h, this.f335159i, this.f335160j, dVar);
        sVar.f335155e = obj;
        return sVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C111954s) create((C109119z) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f335154d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C109119z zVar = (C109119z) this.f335155e;
            C111955a aVar2 = new C111955a(this.f335156f, this.f335157g, this.f335158h, this.f335159i, (C15601d<? super C111955a>) null);
            C111956b bVar = new C111956b(this.f335156f, this.f335160j);
            this.f335154d = 1;
            C32228q<C112255l0, C112539e, C15601d<? super C13598b0>, Object> qVar = C112205c1.f335940a;
            Object b = C112209d0.m153116b(zVar, new C112219f1(new C112260m0(zVar), aVar2, bVar, (C15601d<? super C112219f1>) null), this);
            if (b != aVar) {
                b = C13598b0.f38549a;
            }
            if (b == aVar) {
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
