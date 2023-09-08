package p503e1;

import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import p1104d1.C106969c;
import p1166z0.C112545k;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108501g;
import p175j0.C108504h;
import p175j0.C108509q;
import p175j0.C108512u;
import p175j0.C24661b2;
import p175j0.C24665d;
import p175j0.C24715p;
import p175j0.C24721r;
import p175j0.C24724t1;
import p175j0.C33487v1;
import p175j0.C60647d0;
import p175j0.C60651e0;
import p175j0.C60655g0;
import p175j0.C60690y0;
import p415q0.C110261c;
import p436a1.C103274x;
import p560i2.C33183o;
import p835c1.C104230e;
import p835c1.C104231f;
import rx3.C13598b0;

/* renamed from: e1.p */
public final class C107128p extends C106969c {

    /* renamed from: i */
    public final C60690y0 f320675i = C108500f2.m146996c(new C112545k(C112545k.f336973b), (C108497e2) null, 2, (Object) null);

    /* renamed from: j */
    public final C60690y0 f320676j = C108500f2.m146996c(Boolean.FALSE, (C108497e2) null, 2, (Object) null);

    /* renamed from: n */
    public final C107089i f320677n;

    /* renamed from: o */
    public C108509q f320678o;

    /* renamed from: p */
    public final C60690y0 f320679p;

    /* renamed from: q */
    public float f320680q;

    /* renamed from: r */
    public C103274x f320681r;

    /* renamed from: e1.p$a */
    public static final class C107129a extends C87413o implements C32226l<C60651e0, C60647d0> {

        /* renamed from: d */
        public final /* synthetic */ C108509q f320682d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107129a(C108509q qVar) {
            super(1);
            this.f320682d = qVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C60651e0) obj, "$this$DisposableEffect");
            return new C107127o(this.f320682d);
        }
    }

    /* renamed from: e1.p$b */
    public static final class C107130b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107128p f320683d;

        /* renamed from: e */
        public final /* synthetic */ String f320684e;

        /* renamed from: f */
        public final /* synthetic */ float f320685f;

        /* renamed from: g */
        public final /* synthetic */ float f320686g;

        /* renamed from: h */
        public final /* synthetic */ C32229r<Float, Float, C108504h, Integer, C13598b0> f320687h;

        /* renamed from: i */
        public final /* synthetic */ int f320688i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107130b(C107128p pVar, String str, float f, float f2, C32229r<? super Float, ? super Float, ? super C108504h, ? super Integer, C13598b0> rVar, int i) {
            super(2);
            this.f320683d = pVar;
            this.f320684e = str;
            this.f320685f = f;
            this.f320686g = f2;
            this.f320687h = rVar;
            this.f320688i = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            this.f320683d.mo157558j(this.f320684e, this.f320685f, this.f320686g, this.f320687h, (C108504h) obj, this.f320688i | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: e1.p$c */
    public static final class C107131c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107128p f320689d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107131c(C107128p pVar) {
            super(0);
            this.f320689d = pVar;
        }

        public Object invoke() {
            ((C108494d2) this.f320689d.f320679p).setValue(Boolean.TRUE);
            return C13598b0.f38549a;
        }
    }

    public C107128p() {
        int i = C112545k.f336975d;
        C107089i iVar = new C107089i();
        iVar.f320598e = new C107131c(this);
        this.f320677n = iVar;
        this.f320679p = C108500f2.m146996c(Boolean.TRUE, (C108497e2) null, 2, (Object) null);
        this.f320680q = 1.0f;
    }

    /* renamed from: a */
    public boolean mo84456a(float f) {
        this.f320680q = f;
        return true;
    }

    /* renamed from: e */
    public boolean mo84457e(C103274x xVar) {
        this.f320681r = xVar;
        return true;
    }

    /* renamed from: h */
    public long mo84458h() {
        return ((C112545k) ((C108494d2) this.f320675i).getValue()).f336976a;
    }

    /* renamed from: i */
    public void mo84459i(C104231f fVar) {
        C87412m.m108594g(fVar, "<this>");
        C107089i iVar = this.f320677n;
        C103274x xVar = this.f320681r;
        if (xVar == null) {
            xVar = (C103274x) ((C108494d2) iVar.f320599f).getValue();
        }
        if (!((Boolean) ((C108494d2) this.f320676j).getValue()).booleanValue() || fVar.getLayoutDirection() != C33183o.Rtl) {
            iVar.mo157549e(fVar, this.f320680q, xVar);
        } else {
            long f0 = fVar.mo145820f0();
            C104230e B = fVar.mo145815B();
            long e = B.mo145834e();
            B.mo145835i().mo142944c();
            B.mo145836j().mo145839b(-1.0f, 1.0f, f0);
            iVar.mo157549e(fVar, this.f320680q, xVar);
            B.mo145835i().mo142943b();
            B.mo145837k(e);
        }
        if (((Boolean) ((C108494d2) this.f320679p).getValue()).booleanValue()) {
            ((C108494d2) this.f320679p).setValue(Boolean.FALSE);
        }
    }

    /* renamed from: j */
    public final void mo157558j(String str, float f, float f2, C32229r<? super Float, ? super Float, ? super C108504h, ? super Integer, C13598b0> rVar, C108504h hVar, int i) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(rVar, "content");
        C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> qVar = C24715p.f70494a;
        C108504h z = hVar.mo51623z(1264894527);
        C107089i iVar = this.f320677n;
        iVar.getClass();
        C107081b bVar = iVar.f320595b;
        bVar.getClass();
        bVar.f320534i = str;
        bVar.mo157547c();
        if (!(iVar.f320600g == f)) {
            iVar.f320600g = f;
            iVar.f320596c = true;
            iVar.f320598e.invoke();
        }
        if (!(iVar.f320601h == f2)) {
            iVar.f320601h = f2;
            iVar.f320596c = true;
            iVar.f320598e.invoke();
        }
        C24721r b = C108501g.m147001b(z, 0);
        C108509q qVar2 = this.f320678o;
        if (qVar2 == null || qVar2.mo51665i()) {
            qVar2 = C108512u.m147055a(new C107088h(this.f320677n.f320595b), b);
        }
        this.f320678o = qVar2;
        qVar2.mo51662f(C110261c.m149879c(-1916507005, true, new C107132q(rVar, this)));
        C60655g0.m70930a(qVar2, new C107129a(qVar2), z, 8);
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C107130b(this, str, f, f2, rVar, i));
        }
    }
}
