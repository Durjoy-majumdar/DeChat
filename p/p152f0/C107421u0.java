package p152f0;

import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import p1166z0.C112539e;
import p190l1.C109111s;
import p190l1.C109119z;
import p759y.C112209d0;
import p759y.C112242j;
import p759y.C112262n;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;

/* renamed from: f0.u0 */
public final class C107421u0 {

    /* renamed from: f0.u0$a */
    public static final class C107422a extends C87413o implements C32226l<C112539e, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107351i1 f321427d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107422a(C107351i1 i1Var) {
            super(1);
            this.f321427d = i1Var;
        }

        public Object invoke(Object obj) {
            this.f321427d.mo157797a(((C112539e) obj).f336959a);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f0.u0$b */
    public static final class C107423b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107351i1 f321428d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107423b(C107351i1 i1Var) {
            super(0);
            this.f321428d = i1Var;
        }

        public Object invoke() {
            this.f321428d.onStop();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f0.u0$c */
    public static final class C107424c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107351i1 f321429d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107424c(C107351i1 i1Var) {
            super(0);
            this.f321429d = i1Var;
        }

        public Object invoke() {
            this.f321429d.onCancel();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f0.u0$d */
    public static final class C107425d extends C87413o implements C32227p<C109111s, C112539e, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107351i1 f321430d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107425d(C107351i1 i1Var) {
            super(2);
            this.f321430d = i1Var;
        }

        public Object invoke(Object obj, Object obj2) {
            long j = ((C112539e) obj2).f336959a;
            C87412m.m108594g((C109111s) obj, "<anonymous parameter 0>");
            this.f321430d.mo157800d(j);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final Object m145521a(C109119z zVar, C107351i1 i1Var, C15601d<? super C13598b0> dVar) {
        C107422a aVar = new C107422a(i1Var);
        C107423b bVar = new C107423b(i1Var);
        C107424c cVar = new C107424c(i1Var);
        C107425d dVar2 = new C107425d(i1Var);
        float f = C112242j.f336066a;
        Object b = C112209d0.m153116b(zVar, new C112262n(aVar, cVar, bVar, dVar2, (C15601d<? super C112262n>) null), dVar);
        C15911a aVar2 = C15911a.COROUTINE_SUSPENDED;
        if (b != aVar2) {
            b = C13598b0.f38549a;
        }
        return b == aVar2 ? b : C13598b0.f38549a;
    }
}
