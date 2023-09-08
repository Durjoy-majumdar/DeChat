package p658q1;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p410k0.C108793e;
import p436a1.C103224b0;
import p560i2.C108319b;
import p560i2.C108329n;
import p560i2.C33177j;
import p560i2.C33181m;
import p631o1.C109854n0;
import p631o1.C109893x;
import rx3.C13598b0;

/* renamed from: q1.a0 */
public final class C110276a0 extends C109854n0 implements C109893x {

    /* renamed from: h */
    public final C110301j f329844h;

    /* renamed from: i */
    public C110311s f329845i;

    /* renamed from: j */
    public boolean f329846j;

    /* renamed from: n */
    public boolean f329847n;

    /* renamed from: o */
    public long f329848o = C33177j.f90050b;

    /* renamed from: p */
    public C32226l<? super C103224b0, C13598b0> f329849p;

    /* renamed from: q */
    public float f329850q;

    /* renamed from: r */
    public Object f329851r;

    /* renamed from: q1.a0$a */
    public static final class C110277a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110276a0 f329852d;

        /* renamed from: e */
        public final /* synthetic */ long f329853e;

        /* renamed from: f */
        public final /* synthetic */ float f329854f;

        /* renamed from: g */
        public final /* synthetic */ C32226l<C103224b0, C13598b0> f329855g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110277a(C110276a0 a0Var, long j, float f, C32226l<? super C103224b0, C13598b0> lVar) {
            super(0);
            this.f329852d = a0Var;
            this.f329853e = j;
            this.f329854f = f;
            this.f329855g = lVar;
        }

        public Object invoke() {
            C110276a0 a0Var = this.f329852d;
            long j = this.f329853e;
            float f = this.f329854f;
            C32226l<C103224b0, C13598b0> lVar = this.f329855g;
            a0Var.getClass();
            C109854n0.C109855a.C109856a aVar = C109854n0.C109855a.f328783a;
            if (lVar == null) {
                aVar.mo161174d(a0Var.f329845i, j, f);
            } else {
                aVar.mo161175i(a0Var.f329845i, j, f, lVar);
            }
            return C13598b0.f38549a;
        }
    }

    public C110276a0(C110301j jVar, C110311s sVar) {
        C87412m.m108594g(jVar, "layoutNode");
        C87412m.m108594g(sVar, "outerWrapper");
        this.f329844h = jVar;
        this.f329845i = sVar;
        int i = C33177j.f90051c;
    }

    /* renamed from: G */
    public int mo161154G(int i) {
        mo161680t0();
        return this.f329845i.mo161154G(i);
    }

    /* renamed from: K */
    public C109854n0 mo161155K(long j) {
        j$$i j__i;
        j$$i j__i2 = j$$i.NotUsed;
        C110301j s = this.f329844h.mo161723s();
        if (s != null) {
            C110301j jVar = this.f329844h;
            if (jVar.f329891E == j__i2 || jVar.f329894H) {
                int ordinal = s.f329920o.ordinal();
                if (ordinal == 0) {
                    j__i = j$$i.InMeasureBlock;
                } else if (ordinal == 1) {
                    j__i = j$$i.InLayoutBlock;
                } else {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block.Parents state is " + s.f329920o);
                }
                jVar.getClass();
                jVar.f329891E = j__i;
            } else {
                throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + this.f329844h.f329891E + ". Parent state " + s.f329920o + '.').toString());
            }
        } else {
            C110301j jVar2 = this.f329844h;
            jVar2.getClass();
            jVar2.f329891E = j__i2;
        }
        mo161681v0(j);
        return this;
    }

    /* renamed from: S */
    public int mo161156S(int i) {
        mo161680t0();
        return this.f329845i.mo161156S(i);
    }

    /* renamed from: V */
    public int mo161157V(int i) {
        mo161680t0();
        return this.f329845i.mo161157V(i);
    }

    /* renamed from: Y */
    public int mo161158Y(int i) {
        mo161680t0();
        return this.f329845i.mo161158Y(i);
    }

    /* renamed from: c */
    public Object mo161166c() {
        return this.f329851r;
    }

    /* renamed from: c0 */
    public int mo161167c0() {
        return this.f329845i.mo161167c0();
    }

    /* renamed from: i0 */
    public int mo161168i0() {
        return this.f329845i.mo161168i0();
    }

    /* renamed from: j0 */
    public void mo161160j0(long j, float f, C32226l<? super C103224b0, C13598b0> lVar) {
        this.f329848o = j;
        this.f329850q = f;
        this.f329849p = lVar;
        C110311s sVar = this.f329845i;
        C110311s sVar2 = sVar.f329973i;
        if (sVar2 != null && sVar2.f329984w) {
            C109854n0.C109855a.C109856a aVar = C109854n0.C109855a.f328783a;
            if (lVar == null) {
                aVar.mo161174d(sVar, j, f);
            } else {
                aVar.mo161175i(sVar, j, f, lVar);
            }
        } else {
            this.f329847n = true;
            C110301j jVar = this.f329844h;
            jVar.f329931z.f329956g = false;
            C110292f0 snapshotObserver = C110310r.m150081a(jVar).getSnapshotObserver();
            C110301j jVar2 = this.f329844h;
            C110277a aVar2 = new C110277a(this, j, f, lVar);
            snapshotObserver.getClass();
            C87412m.m108594g(jVar2, "node");
            snapshotObserver.mo161693a(jVar2, snapshotObserver.f329872d, aVar2);
        }
    }

    /* renamed from: t0 */
    public final void mo161680t0() {
        this.f329844h.mo161712N(false);
        C110301j s = this.f329844h.mo161723s();
        if (s != null) {
            C110301j jVar = this.f329844h;
            if (jVar.f329892F == j$$i.NotUsed) {
                int ordinal = s.f329920o.ordinal();
                j$$i j__i = ordinal != 0 ? ordinal != 1 ? s.f329892F : j$$i.InLayoutBlock : j$$i.InMeasureBlock;
                C87412m.m108594g(j__i, "<set-?>");
                jVar.f329892F = j__i;
            }
        }
    }

    /* renamed from: v0 */
    public final boolean mo161681v0(long j) {
        C110282c0 a = C110310r.m150081a(this.f329844h);
        C110301j s = this.f329844h.mo161723s();
        C110301j jVar = this.f329844h;
        boolean z = true;
        jVar.f329894H = jVar.f329894H || (s != null && s.f329894H);
        if (jVar.f329909X || !C108319b.m146691b(this.f328782g, j)) {
            C110301j jVar2 = this.f329844h;
            jVar2.f329931z.f329955f = false;
            C108793e<C110301j> u = jVar2.mo161726u();
            int i = u.f325786f;
            if (i > 0) {
                T[] tArr = u.f325784d;
                int i2 = 0;
                do {
                    ((C110301j) tArr[i2]).f329931z.f329952c = false;
                    i2++;
                } while (i2 < i);
            }
            this.f329846j = true;
            long j2 = this.f329845i.f328781f;
            mo161171s0(j);
            C110301j jVar3 = this.f329844h;
            j$$g j__g = j$$g.Measuring;
            jVar3.f329920o = j__g;
            jVar3.f329909X = false;
            C110292f0 snapshotObserver = C110310r.m150081a(jVar3).getSnapshotObserver();
            C110305m mVar = new C110305m(jVar3, j);
            snapshotObserver.getClass();
            snapshotObserver.mo161693a(jVar3, snapshotObserver.f329870b, mVar);
            if (jVar3.f329920o == j__g) {
                jVar3.f329910Y = true;
                jVar3.f329920o = j$$g.Idle;
            }
            if (C33181m.m39965a(this.f329845i.f328781f, j2)) {
                C110311s sVar = this.f329845i;
                if (sVar.f328779d == this.f328779d && sVar.f328780e == this.f328780e) {
                    z = false;
                }
            }
            C110311s sVar2 = this.f329845i;
            mo161170n0(C108329n.m146743a(sVar2.f328779d, sVar2.f328780e));
            return z;
        }
        a.mo144668j(this.f329844h);
        this.f329844h.mo161713O();
        return false;
    }
}
