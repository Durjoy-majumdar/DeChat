package p532g5;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53955u2;
import a14.C53973z1;
import d14.C45252f;
import d14.C45253g;
import d14.C45255r0;
import d14.C45256s0;
import e14.C58499p;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C24557d;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87411a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import p1104d1.C106969c;
import p1105d5.C106994f;
import p1166z0.C112545k;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C24725u1;
import p175j0.C60690y0;
import p436a1.C103274x;
import p632o5.C109954f;
import p632o5.C109956h;
import p632o5.C109963m;
import p835c1.C104231f;
import rx3.C13598b0;
import rx3.C13604l;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: g5.d */
public final class C59349d extends C106969c implements C24725u1 {

    /* renamed from: i */
    public final C0000n0 f169646i;

    /* renamed from: j */
    public C0000n0 f169647j;

    /* renamed from: n */
    public C53973z1 f169648n;

    /* renamed from: o */
    public final C60690y0 f169649o = C108500f2.m146996c(new C112545k(C112545k.f336973b), (C108497e2) null, 2, (Object) null);

    /* renamed from: p */
    public final C60690y0 f169650p = C108500f2.m146996c(Float.valueOf(1.0f), (C108497e2) null, 2, (Object) null);

    /* renamed from: q */
    public final C60690y0 f169651q = C108500f2.m146996c((Object) null, (C108497e2) null, 2, (Object) null);

    /* renamed from: r */
    public final C60690y0 f169652r = C108500f2.m146996c((Object) null, (C108497e2) null, 2, (Object) null);

    /* renamed from: s */
    public C59350a f169653s;

    /* renamed from: t */
    public boolean f169654t;

    /* renamed from: u */
    public final C60690y0 f169655u;

    /* renamed from: v */
    public final C60690y0 f169656v;

    /* renamed from: w */
    public final C60690y0 f169657w;

    /* renamed from: g5.d$a */
    public interface C59350a {

        /* renamed from: a */
        public static final /* synthetic */ int f169658a = 0;

        /* renamed from: g5.d$a$a */
        public static final class C59351a implements C59350a {

            /* renamed from: b */
            public static final C59351a f169659b = new C59351a();

            /* renamed from: a */
            public final boolean mo84460a(C59352b bVar, C59352b bVar2) {
                C87412m.m108594g(bVar2, "current");
                if (!C87412m.m108589b(bVar2.f169660a, C59353c.C59354a.f169663a)) {
                    return !C87412m.m108589b(bVar == null ? null : bVar.f169661b, bVar2.f169661b);
                }
            }
        }

        /* renamed from: a */
        boolean mo84460a(C59352b bVar, C59352b bVar2);
    }

    /* renamed from: g5.d$b */
    public static final class C59352b {

        /* renamed from: a */
        public final C59353c f169660a;

        /* renamed from: b */
        public final C109956h f169661b;

        /* renamed from: c */
        public final long f169662c;

        public C59352b(C59353c cVar, C109956h hVar, long j, C8480h hVar2) {
            this.f169660a = cVar;
            this.f169661b = hVar;
            this.f169662c = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C59352b)) {
                return false;
            }
            C59352b bVar = (C59352b) obj;
            return C87412m.m108589b(this.f169660a, bVar.f169660a) && C87412m.m108589b(this.f169661b, bVar.f169661b) && C112545k.m153755a(this.f169662c, bVar.f169662c);
        }

        public int hashCode() {
            long j = this.f169662c;
            int i = C112545k.f336975d;
            return (((this.f169660a.hashCode() * 31) + this.f169661b.hashCode()) * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "Snapshot(state=" + this.f169660a + ", request=" + this.f169661b + ", size=" + C112545k.m153760f(this.f169662c) + ')';
        }
    }

    /* renamed from: g5.d$c */
    public static abstract class C59353c {

        /* renamed from: g5.d$c$a */
        public static final class C59354a extends C59353c {

            /* renamed from: a */
            public static final C59354a f169663a = new C59354a();

            /* renamed from: a */
            public C106969c mo84464a() {
                return null;
            }
        }

        /* renamed from: g5.d$c$b */
        public static final class C59355b extends C59353c {

            /* renamed from: a */
            public final C106969c f169664a;

            /* renamed from: b */
            public final C109954f f169665b;

            public C59355b(C106969c cVar, C109954f fVar) {
                C87412m.m108594g(fVar, "result");
                this.f169664a = cVar;
                this.f169665b = fVar;
            }

            /* renamed from: a */
            public C106969c mo84464a() {
                return this.f169664a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C59355b)) {
                    return false;
                }
                C59355b bVar = (C59355b) obj;
                return C87412m.m108589b(this.f169664a, bVar.f169664a) && C87412m.m108589b(this.f169665b, bVar.f169665b);
            }

            public int hashCode() {
                C106969c cVar = this.f169664a;
                return ((cVar == null ? 0 : cVar.hashCode()) * 31) + this.f169665b.hashCode();
            }

            public String toString() {
                return "Error(painter=" + this.f169664a + ", result=" + this.f169665b + ')';
            }
        }

        /* renamed from: g5.d$c$c */
        public static final class C59356c extends C59353c {

            /* renamed from: a */
            public final C106969c f169666a;

            public C59356c(C106969c cVar) {
                this.f169666a = cVar;
            }

            /* renamed from: a */
            public C106969c mo84464a() {
                return this.f169666a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C59356c) && C87412m.m108589b(this.f169666a, ((C59356c) obj).f169666a);
            }

            public int hashCode() {
                C106969c cVar = this.f169666a;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            public String toString() {
                return "Loading(painter=" + this.f169666a + ')';
            }
        }

        /* renamed from: g5.d$c$d */
        public static final class C59357d extends C59353c {

            /* renamed from: a */
            public final C106969c f169667a;

            /* renamed from: b */
            public final C109963m f169668b;

            public C59357d(C106969c cVar, C109963m mVar) {
                C87412m.m108594g(cVar, "painter");
                C87412m.m108594g(mVar, "result");
                this.f169667a = cVar;
                this.f169668b = mVar;
            }

            /* renamed from: a */
            public C106969c mo84464a() {
                return this.f169667a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C59357d)) {
                    return false;
                }
                C59357d dVar = (C59357d) obj;
                return C87412m.m108589b(this.f169667a, dVar.f169667a) && C87412m.m108589b(this.f169668b, dVar.f169668b);
            }

            public int hashCode() {
                return (this.f169667a.hashCode() * 31) + this.f169668b.hashCode();
            }

            public String toString() {
                return "Success(painter=" + this.f169667a + ", result=" + this.f169668b + ')';
            }
        }

        /* renamed from: a */
        public abstract C106969c mo84464a();
    }

    @C91590f(mo125468c = "coil.compose.ImagePainter$onRemembered$1", mo125469f = "ImagePainter.kt", mo125470l = {410}, mo125471m = "invokeSuspend")
    /* renamed from: g5.d$d */
    public static final class C59358d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f169669d;

        /* renamed from: e */
        public /* synthetic */ Object f169670e;

        /* renamed from: f */
        public final /* synthetic */ C59349d f169671f;

        /* renamed from: g5.d$d$a */
        public static final class C59359a extends C87413o implements C32224a<C109956h> {

            /* renamed from: d */
            public final /* synthetic */ C59349d f169672d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C59359a(C59349d dVar) {
                super(0);
                this.f169672d = dVar;
            }

            public Object invoke() {
                return (C109956h) ((C108494d2) this.f169672d.f169656v).getValue();
            }
        }

        /* renamed from: g5.d$d$b */
        public static final class C59360b extends C87413o implements C32224a<C112545k> {

            /* renamed from: d */
            public final /* synthetic */ C59349d f169673d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C59360b(C59349d dVar) {
                super(0);
                this.f169673d = dVar;
            }

            public Object invoke() {
                return new C112545k(((C112545k) ((C108494d2) this.f169673d.f169649o).getValue()).f336976a);
            }
        }

        /* renamed from: g5.d$d$c */
        public /* synthetic */ class C59361c extends C87411a implements C32228q {

            /* renamed from: n */
            public static final C59361c f169674n = new C59361c();

            public C59361c() {
                super(3, C24557d.NO_RECEIVER, C13604l.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                C15601d dVar = (C15601d) obj3;
                return new C13604l((C109956h) obj, new C112545k(((C112545k) obj2).f336976a));
            }
        }

        /* renamed from: g5.d$d$d */
        public static final class C59362d implements C45253g<C13604l<? extends C109956h, ? extends C112545k>> {

            /* renamed from: d */
            public final /* synthetic */ C8479f0 f169675d;

            /* renamed from: e */
            public final /* synthetic */ C59349d f169676e;

            /* renamed from: f */
            public final /* synthetic */ C0000n0 f169677f;

            public C59362d(C8479f0 f0Var, C59349d dVar, C0000n0 n0Var) {
                this.f169675d = f0Var;
                this.f169676e = dVar;
                this.f169677f = n0Var;
            }

            public Object emit(C13604l<? extends C109956h, ? extends C112545k> lVar, C15601d<? super C13598b0> dVar) {
                C13604l lVar2 = lVar;
                C109956h hVar = (C109956h) lVar2.f38555d;
                long j = ((C112545k) lVar2.f38556e).f336976a;
                C59352b bVar = (C59352b) this.f169675d.f27484d;
                C59352b bVar2 = new C59352b((C59353c) ((C108494d2) this.f169676e.f169655u).getValue(), hVar, j, (C8480h) null);
                this.f169675d.f27484d = bVar2;
                if (hVar.f328990G.f328968b == null) {
                    if ((j != C112545k.f336974c) && (C112545k.m153758d(j) <= 0.5f || C112545k.m153756b(j) <= 0.5f)) {
                        ((C108494d2) this.f169676e.f169655u).setValue(C59353c.C59354a.f169663a);
                        return C13598b0.f38549a;
                    }
                }
                C59349d dVar2 = this.f169676e;
                C0000n0 n0Var = this.f169677f;
                if (dVar2.f169653s.mo84460a(bVar, bVar2)) {
                    C53973z1 z1Var = dVar2.f169648n;
                    if (z1Var != null) {
                        C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                    }
                    dVar2.f169648n = C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C107735e(dVar2, bVar2, (C15601d<? super C107735e>) null), 3, (Object) null);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59358d(C59349d dVar, C15601d<? super C59358d> dVar2) {
            super(2, dVar2);
            this.f169671f = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C59358d dVar2 = new C59358d(this.f169671f, dVar);
            dVar2.f169670e = obj;
            return dVar2;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C59358d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f169669d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8479f0 f0Var = new C8479f0();
                C45252f f = C108500f2.m146999f(new C59359a(this.f169671f));
                C45252f f2 = C108500f2.m146999f(new C59360b(this.f169671f));
                C59361c cVar = C59361c.f169674n;
                C59362d dVar = new C59362d(f0Var, this.f169671f, (C0000n0) this.f169670e);
                this.f169669d = 1;
                Object a = C58499p.m67934a(dVar, new C45252f[]{f, f2}, C45256s0.f122599d, new C45255r0(cVar, (C15601d<? super C45255r0>) null), this);
                if (a != aVar) {
                    a = C13598b0.f38549a;
                }
                if (a == aVar) {
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

    public C59349d(C0000n0 n0Var, C109956h hVar, C106994f fVar) {
        C87412m.m108594g(n0Var, "parentScope");
        C87412m.m108594g(hVar, "request");
        C87412m.m108594g(fVar, "imageLoader");
        this.f169646i = n0Var;
        int i = C112545k.f336975d;
        int i2 = C59350a.f169658a;
        this.f169653s = C59350a.C59351a.f169659b;
        this.f169655u = C108500f2.m146996c(C59353c.C59354a.f169663a, (C108497e2) null, 2, (Object) null);
        this.f169656v = C108500f2.m146996c(hVar, (C108497e2) null, 2, (Object) null);
        this.f169657w = C108500f2.m146996c(fVar, (C108497e2) null, 2, (Object) null);
    }

    /* renamed from: a */
    public boolean mo84456a(float f) {
        ((C108494d2) this.f169650p).setValue(Float.valueOf(f));
        return true;
    }

    /* renamed from: b */
    public void mo51625b() {
        mo51627d();
    }

    /* renamed from: c */
    public void mo51626c() {
        if (!this.f169654t) {
            C0000n0 n0Var = this.f169647j;
            if (n0Var != null) {
                C53930o0.m60556c(n0Var, (CancellationException) null);
            }
            C66212f coroutineContext = this.f169646i.getCoroutineContext();
            int i = C53973z1.f151221b0;
            C0000n0 a = C53930o0.m60554a(coroutineContext.plus(new C53955u2((C53973z1) coroutineContext.get(C53973z1.C0004b.f3d))));
            this.f169647j = a;
            C53895h.m60466d(a, (C66212f) null, (C53934p0) null, new C59358d(this, (C15601d<? super C59358d>) null), 3, (Object) null);
        }
    }

    /* renamed from: d */
    public void mo51627d() {
        C0000n0 n0Var = this.f169647j;
        if (n0Var != null) {
            C53930o0.m60556c(n0Var, (CancellationException) null);
        }
        this.f169647j = null;
        C53973z1 z1Var = this.f169648n;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f169648n = null;
    }

    /* renamed from: e */
    public boolean mo84457e(C103274x xVar) {
        ((C108494d2) this.f169651q).setValue(xVar);
        return true;
    }

    /* renamed from: h */
    public long mo84458h() {
        C106969c cVar = (C106969c) ((C108494d2) this.f169652r).getValue();
        C112545k kVar = cVar == null ? null : new C112545k(cVar.mo84458h());
        return kVar == null ? C112545k.f336974c : kVar.f336976a;
    }

    /* renamed from: i */
    public void mo84459i(C104231f fVar) {
        C87412m.m108594g(fVar, "<this>");
        long e = fVar.mo145819e();
        ((C108494d2) this.f169649o).setValue(new C112545k(e));
        C106969c cVar = (C106969c) ((C108494d2) this.f169652r).getValue();
        if (cVar != null) {
            cVar.mo157379g(fVar, fVar.mo145819e(), ((Number) ((C108494d2) this.f169650p).getValue()).floatValue(), (C103274x) ((C108494d2) this.f169651q).getValue());
        }
    }
}
