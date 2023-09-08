package p658q1;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedHashMap;
import java.util.Map;
import p1166z0.C112538d;
import p1166z0.C112539e;
import p1166z0.C112540f;
import p1166z0.C112541g;
import p1166z0.C112545k;
import p1166z0.C112546l;
import p190l1.C109117x;
import p190l1.C109118y;
import p241t0.C110849h;
import p241t0.C110865n;
import p246u1.C111075k;
import p246u1.C111078m;
import p246u1.C111079n;
import p246u1.C111090t;
import p436a1.C103222a1;
import p436a1.C103224b0;
import p436a1.C103227c0;
import p436a1.C103241i0;
import p436a1.C103252o0;
import p436a1.C103256p0;
import p436a1.C103259q0;
import p436a1.C103262s;
import p436a1.C103266t0;
import p560i2.C108322d;
import p560i2.C108329n;
import p560i2.C33177j;
import p560i2.C33181m;
import p560i2.C33183o;
import p631o1.C109827a0;
import p631o1.C109849k0;
import p631o1.C109852m0;
import p631o1.C109854n0;
import p631o1.C109857o;
import p631o1.C109861p;
import p631o1.C109893x;
import p631o1.C109899z;
import p631o1.C61911a;
import p721v0.C65503j;
import rx3.C13598b0;
import sx3.C110821n;
import sx3.C64197v;

/* renamed from: q1.s */
public abstract class C110311s extends C109854n0 implements C109893x, C109857o, C110289d0, C32226l<C103262s, C13598b0> {

    /* renamed from: C */
    public static final C32226l<C110311s, C13598b0> f329965C = C110315d.f329989d;

    /* renamed from: D */
    public static final C32226l<C110311s, C13598b0> f329966D = C110314c.f329988d;

    /* renamed from: E */
    public static final C103259q0 f329967E = new C103259q0();

    /* renamed from: F */
    public static final C110316e<C110296g0, C109117x, C109118y> f329968F = new C110312a();

    /* renamed from: G */
    public static final C110316e<C111078m, C111078m, C111079n> f329969G = new C110313b();

    /* renamed from: A */
    public boolean f329970A;

    /* renamed from: B */
    public C110281b0 f329971B;

    /* renamed from: h */
    public final C110301j f329972h;

    /* renamed from: i */
    public C110311s f329973i;

    /* renamed from: j */
    public boolean f329974j;

    /* renamed from: n */
    public C32226l<? super C103224b0, C13598b0> f329975n;

    /* renamed from: o */
    public C108322d f329976o;

    /* renamed from: p */
    public C33183o f329977p;

    /* renamed from: q */
    public float f329978q = 0.8f;

    /* renamed from: r */
    public boolean f329979r;

    /* renamed from: s */
    public C109899z f329980s;

    /* renamed from: t */
    public Map<C61911a, Integer> f329981t;

    /* renamed from: u */
    public long f329982u;

    /* renamed from: v */
    public float f329983v;

    /* renamed from: w */
    public boolean f329984w;

    /* renamed from: x */
    public C112538d f329985x;

    /* renamed from: y */
    public final C110309q<?, ?>[] f329986y;

    /* renamed from: z */
    public final C32224a<C13598b0> f329987z;

    /* renamed from: q1.s$a */
    public static final class C110312a implements C110316e<C110296g0, C109117x, C109118y> {
        /* renamed from: a */
        public void mo161763a(C110301j jVar, long j, C62573f<C109117x> fVar, boolean z, boolean z2) {
            C87412m.m108594g(jVar, "layoutNode");
            C87412m.m108594g(fVar, "hitTestResult");
            jVar.mo161727v(j, fVar, z, z2);
        }

        /* renamed from: b */
        public boolean mo161764b(C110309q qVar) {
            C110296g0 g0Var = (C110296g0) qVar;
            C87412m.m108594g(g0Var, "entity");
            ((C109118y) g0Var.f329962e).mo160325t0().getClass();
            return false;
        }

        /* renamed from: c */
        public int mo161765c() {
            return 1;
        }

        /* renamed from: d */
        public boolean mo161766d(C110301j jVar) {
            C87412m.m108594g(jVar, "parentLayoutNode");
            return true;
        }

        /* renamed from: e */
        public Object mo161767e(C110309q qVar) {
            C110296g0 g0Var = (C110296g0) qVar;
            C87412m.m108594g(g0Var, "entity");
            return ((C109118y) g0Var.f329962e).mo160325t0();
        }
    }

    /* renamed from: q1.s$b */
    public static final class C110313b implements C110316e<C111078m, C111078m, C111079n> {
        /* renamed from: a */
        public void mo161763a(C110301j jVar, long j, C62573f<C111078m> fVar, boolean z, boolean z2) {
            C87412m.m108594g(jVar, "layoutNode");
            C87412m.m108594g(fVar, "hitTestResult");
            jVar.f329896J.f329845i.mo161747N0(C110311s.f329969G, jVar.f329896J.f329845i.mo161739E0(j), fVar, true, z2);
        }

        /* renamed from: b */
        public boolean mo161764b(C110309q qVar) {
            C87412m.m108594g((C111078m) qVar, "entity");
            return false;
        }

        /* renamed from: c */
        public int mo161765c() {
            return 2;
        }

        /* renamed from: d */
        public boolean mo161766d(C110301j jVar) {
            C111075k c;
            C87412m.m108594g(jVar, "parentLayoutNode");
            C111078m d = C111090t.m151491d(jVar);
            boolean z = false;
            if (!(d == null || (c = d.mo162827c()) == null || !c.f332626f)) {
                z = true;
            }
            return !z;
        }

        /* renamed from: e */
        public Object mo161767e(C110309q qVar) {
            C111078m mVar = (C111078m) qVar;
            C87412m.m108594g(mVar, "entity");
            return mVar;
        }
    }

    /* renamed from: q1.s$c */
    public static final class C110314c extends C87413o implements C32226l<C110311s, C13598b0> {

        /* renamed from: d */
        public static final C110314c f329988d = new C110314c();

        public C110314c() {
            super(1);
        }

        public Object invoke(Object obj) {
            C110311s sVar = (C110311s) obj;
            C87412m.m108594g(sVar, "wrapper");
            C110281b0 b0Var = sVar.f329971B;
            if (b0Var != null) {
                b0Var.invalidate();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q1.s$d */
    public static final class C110315d extends C87413o implements C32226l<C110311s, C13598b0> {

        /* renamed from: d */
        public static final C110315d f329989d = new C110315d();

        public C110315d() {
            super(1);
        }

        public Object invoke(Object obj) {
            C110311s sVar = (C110311s) obj;
            C87412m.m108594g(sVar, "wrapper");
            if (sVar.isValid()) {
                sVar.mo161758a1();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q1.s$e */
    public interface C110316e<T extends C110309q<T, M>, C, M extends C65503j> {
        /* renamed from: a */
        void mo161763a(C110301j jVar, long j, C62573f<C> fVar, boolean z, boolean z2);

        /* renamed from: b */
        boolean mo161764b(T t);

        /* renamed from: c */
        int mo161765c();

        /* renamed from: d */
        boolean mo161766d(C110301j jVar);

        /* renamed from: e */
        C mo161767e(T t);
    }

    /* renamed from: q1.s$f */
    public static final class C110317f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110311s f329990d;

        /* renamed from: e */
        public final /* synthetic */ T f329991e;

        /* renamed from: f */
        public final /* synthetic */ C110316e<T, C, M> f329992f;

        /* renamed from: g */
        public final /* synthetic */ long f329993g;

        /* renamed from: h */
        public final /* synthetic */ C62573f<C> f329994h;

        /* renamed from: i */
        public final /* synthetic */ boolean f329995i;

        /* renamed from: j */
        public final /* synthetic */ boolean f329996j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110317f(C110311s sVar, T t, C110316e<T, C, M> eVar, long j, C62573f<C> fVar, boolean z, boolean z2) {
            super(0);
            this.f329990d = sVar;
            this.f329991e = t;
            this.f329992f = eVar;
            this.f329993g = j;
            this.f329994h = fVar;
            this.f329995i = z;
            this.f329996j = z2;
        }

        public Object invoke() {
            this.f329990d.mo161745L0(this.f329991e.f329963f, this.f329992f, this.f329993g, this.f329994h, this.f329995i, this.f329996j);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q1.s$g */
    public static final class C110318g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110311s f329997d;

        /* renamed from: e */
        public final /* synthetic */ T f329998e;

        /* renamed from: f */
        public final /* synthetic */ C110316e<T, C, M> f329999f;

        /* renamed from: g */
        public final /* synthetic */ long f330000g;

        /* renamed from: h */
        public final /* synthetic */ C62573f<C> f330001h;

        /* renamed from: i */
        public final /* synthetic */ boolean f330002i;

        /* renamed from: j */
        public final /* synthetic */ boolean f330003j;

        /* renamed from: n */
        public final /* synthetic */ float f330004n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110318g(C110311s sVar, T t, C110316e<T, C, M> eVar, long j, C62573f<C> fVar, boolean z, boolean z2, float f) {
            super(0);
            this.f329997d = sVar;
            this.f329998e = t;
            this.f329999f = eVar;
            this.f330000g = j;
            this.f330001h = fVar;
            this.f330002i = z;
            this.f330003j = z2;
            this.f330004n = f;
        }

        public Object invoke() {
            this.f329997d.mo161746M0(this.f329998e.f329963f, this.f329999f, this.f330000g, this.f330001h, this.f330002i, this.f330003j, this.f330004n);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q1.s$h */
    public static final class C110319h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110311s f330005d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110319h(C110311s sVar) {
            super(0);
            this.f330005d = sVar;
        }

        public Object invoke() {
            C110311s sVar = this.f330005d.f329973i;
            if (sVar != null) {
                sVar.mo161748P0();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q1.s$i */
    public static final class C110320i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110311s f330006d;

        /* renamed from: e */
        public final /* synthetic */ T f330007e;

        /* renamed from: f */
        public final /* synthetic */ C110316e<T, C, M> f330008f;

        /* renamed from: g */
        public final /* synthetic */ long f330009g;

        /* renamed from: h */
        public final /* synthetic */ C62573f<C> f330010h;

        /* renamed from: i */
        public final /* synthetic */ boolean f330011i;

        /* renamed from: j */
        public final /* synthetic */ boolean f330012j;

        /* renamed from: n */
        public final /* synthetic */ float f330013n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110320i(C110311s sVar, T t, C110316e<T, C, M> eVar, long j, C62573f<C> fVar, boolean z, boolean z2, float f) {
            super(0);
            this.f330006d = sVar;
            this.f330007e = t;
            this.f330008f = eVar;
            this.f330009g = j;
            this.f330010h = fVar;
            this.f330011i = z;
            this.f330012j = z2;
            this.f330013n = f;
        }

        public Object invoke() {
            this.f330006d.mo161756Y0(this.f330007e.f329963f, this.f330008f, this.f330009g, this.f330010h, this.f330011i, this.f330012j, this.f330013n);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q1.s$j */
    public static final class C110321j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<C103224b0, C13598b0> f330014d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110321j(C32226l<? super C103224b0, C13598b0> lVar) {
            super(0);
            this.f330014d = lVar;
        }

        public Object invoke() {
            this.f330014d.invoke(C110311s.f329967E);
            return C13598b0.f38549a;
        }
    }

    public C110311s(C110301j jVar) {
        C87412m.m108594g(jVar, "layoutNode");
        this.f329972h = jVar;
        this.f329976o = jVar.f329927v;
        this.f329977p = jVar.f329929x;
        int i = C33177j.f90051c;
        this.f329982u = C33177j.f90050b;
        this.f329986y = new C110309q[6];
        this.f329987z = new C110319h(this);
    }

    /* renamed from: A0 */
    public final float mo161735A0(long j, long j2) {
        if (((float) mo161168i0()) >= C112545k.m153758d(j2) && ((float) mo161167c0()) >= C112545k.m153756b(j2)) {
            return Float.POSITIVE_INFINITY;
        }
        long y0 = mo161761y0(j2);
        float d = C112545k.m153758d(y0);
        float b = C112545k.m153756b(y0);
        float c = C112539e.m153738c(j);
        float max = Math.max(0.0f, c < 0.0f ? -c : c - ((float) mo161168i0()));
        float d2 = C112539e.m153739d(j);
        long a = C112540f.m153745a(max, Math.max(0.0f, d2 < 0.0f ? -d2 : d2 - ((float) mo161167c0())));
        if ((d > 0.0f || b > 0.0f) && C112539e.m153738c(a) <= d && C112539e.m153739d(a) <= b) {
            return (C112539e.m153738c(a) * C112539e.m153738c(a)) + (C112539e.m153739d(a) * C112539e.m153739d(a));
        }
        return Float.POSITIVE_INFINITY;
    }

    /* renamed from: B0 */
    public final void mo161736B0(C103262s sVar) {
        C87412m.m108594g(sVar, "canvas");
        C110281b0 b0Var = this.f329971B;
        if (b0Var != null) {
            b0Var.mo144756g(sVar);
            return;
        }
        long j = this.f329982u;
        float f = (float) ((int) (j >> 32));
        float a = (float) C33177j.m39962a(j);
        sVar.mo142945d(f, a);
        C110285d dVar = (C110285d) this.f329986y[0];
        if (dVar == null) {
            mo161698U0(sVar);
        } else {
            dVar.mo161689c(sVar);
        }
        sVar.mo142945d(-f, -a);
    }

    /* renamed from: C0 */
    public final void mo161737C0(C103262s sVar, C103241i0 i0Var) {
        C87412m.m108594g(sVar, "canvas");
        C87412m.m108594g(i0Var, "paint");
        long j = this.f328781f;
        sVar.mo142947f(new C112541g(0.5f, 0.5f, ((float) ((int) (j >> 32))) - 0.5f, ((float) C33181m.m39966b(j)) - 0.5f), i0Var);
    }

    /* renamed from: D0 */
    public final C110311s mo161738D0(C110311s sVar) {
        C87412m.m108594g(sVar, "other");
        C110301j jVar = sVar.f329972h;
        C110301j jVar2 = this.f329972h;
        if (jVar == jVar2) {
            C110311s sVar2 = jVar2.f329896J.f329845i;
            C110311s sVar3 = this;
            while (sVar3 != sVar2 && sVar3 != sVar) {
                sVar3 = sVar3.f329973i;
                C87412m.m108591d(sVar3);
            }
            return sVar3 == sVar ? sVar : this;
        }
        while (jVar.f329919n > jVar2.f329919n) {
            jVar = jVar.mo161723s();
            C87412m.m108591d(jVar);
        }
        while (jVar2.f329919n > jVar.f329919n) {
            jVar2 = jVar2.mo161723s();
            C87412m.m108591d(jVar2);
        }
        while (jVar != jVar2) {
            jVar = jVar.mo161723s();
            jVar2 = jVar2.mo161723s();
            if (jVar != null) {
                if (jVar2 == null) {
                }
            }
            throw new IllegalArgumentException("layouts are not part of the same hierarchy");
        }
        return jVar2 == this.f329972h ? this : jVar == sVar.f329972h ? sVar : jVar.f329895I;
    }

    /* renamed from: E */
    public long mo161176E(long j) {
        if (mo161183y()) {
            C109857o c = C109861p.m149327c(this);
            return mo161178U(c, C112539e.m153741f(C110310r.m150081a(this.f329972h).mo144623c(j), C109861p.m149328d(c)));
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    /* renamed from: E0 */
    public long mo161739E0(long j) {
        long j2 = this.f329982u;
        float c = C112539e.m153738c(j);
        int i = C33177j.f90051c;
        long a = C112540f.m153745a(c - ((float) ((int) (j2 >> 32))), C112539e.m153739d(j) - ((float) C33177j.m39962a(j2)));
        C110281b0 b0Var = this.f329971B;
        return b0Var != null ? b0Var.mo144747a(a, true) : a;
    }

    /* renamed from: F0 */
    public final int mo161740F0(C61911a aVar) {
        int w0;
        C87412m.m108594g(aVar, "alignmentLine");
        if ((this.f329980s != null) && (w0 = mo161699w0(aVar)) != Integer.MIN_VALUE) {
            return w0 + C33177j.m39962a(mo161165a0());
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: G0 */
    public final C109899z mo161741G0() {
        C109899z zVar = this.f329980s;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    /* renamed from: H0 */
    public abstract C109827a0 mo161696H0();

    /* renamed from: I0 */
    public final long mo161742I0() {
        return this.f329976o.mo143036g0(this.f329972h.f329930y.mo144729e());
    }

    /* renamed from: J0 */
    public final Object mo161743J0(C110302j0<C109852m0> j0Var) {
        if (j0Var != null) {
            return ((C109852m0) j0Var.f329962e).mo142900j0(mo161696H0(), mo161743J0((C110302j0) j0Var.f329963f));
        }
        C110311s K0 = mo161744K0();
        if (K0 != null) {
            return K0.mo161166c();
        }
        return null;
    }

    /* renamed from: K0 */
    public C110311s mo161744K0() {
        return null;
    }

    /* renamed from: L0 */
    public final <T extends C110309q<T, M>, C, M extends C65503j> void mo161745L0(T t, C110316e<T, C, M> eVar, long j, C62573f<C> fVar, boolean z, boolean z2) {
        if (t == null) {
            mo161697O0(eVar, j, fVar, z, z2);
            return;
        }
        C e = eVar.mo161767e(t);
        C110317f fVar2 = new C110317f(this, t, eVar, j, fVar, z, z2);
        fVar.getClass();
        fVar.mo87584i(e, -1.0f, z2, fVar2);
    }

    /* renamed from: M0 */
    public final <T extends C110309q<T, M>, C, M extends C65503j> void mo161746M0(T t, C110316e<T, C, M> eVar, long j, C62573f<C> fVar, boolean z, boolean z2, float f) {
        if (t == null) {
            mo161697O0(eVar, j, fVar, z, z2);
            return;
        }
        C e = eVar.mo161767e(t);
        C110318g gVar = new C110318g(this, t, eVar, j, fVar, z, z2, f);
        fVar.mo87584i(e, f, z2, gVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0022, code lost:
        r0 = r9.f329971B;
     */
    /* renamed from: N0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends p658q1.C110309q<T, M>, C, M extends p721v0.C65503j> void mo161747N0(p658q1.C110311s.C110316e<T, C, M> r16, long r17, p658q1.C62573f<C> r19, boolean r20, boolean r21) {
        /*
            r15 = this;
            r9 = r15
            r3 = r17
            r5 = r19
            java.lang.String r0 = "hitTestSource"
            r2 = r16
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "hitTestResult"
            gy3.C87412m.m108594g(r5, r0)
            q1.q<?, ?>[] r0 = r9.f329986y
            int r1 = r16.mo161765c()
            r1 = r0[r1]
            boolean r0 = p1166z0.C112540f.m153746b(r17)
            r6 = 1
            r7 = 0
            if (r0 != 0) goto L_0x0022
            goto L_0x0031
        L_0x0022:
            q1.b0 r0 = r9.f329971B
            if (r0 == 0) goto L_0x0033
            boolean r8 = r9.f329974j
            if (r8 == 0) goto L_0x0033
            boolean r0 = r0.mo144748b(r3)
            if (r0 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r0 = 0
            goto L_0x0034
        L_0x0033:
            r0 = 1
        L_0x0034:
            if (r0 != 0) goto L_0x007b
            if (r20 == 0) goto L_0x0119
            long r10 = r15.mo161742I0()
            float r8 = r15.mo161735A0(r3, r10)
            boolean r0 = java.lang.Float.isInfinite(r8)
            if (r0 != 0) goto L_0x004e
            boolean r0 = java.lang.Float.isNaN(r8)
            if (r0 != 0) goto L_0x004e
            r0 = 1
            goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            if (r0 == 0) goto L_0x0119
            int r0 = r5.f177722f
            int r10 = sx3.C64197v.m75536e(r19)
            if (r0 != r10) goto L_0x005a
            goto L_0x006a
        L_0x005a:
            long r10 = p658q1.C62576g.m73547a(r8, r7)
            long r12 = r19.mo87582f()
            int r0 = p658q1.C62572c.m73542a(r12, r10)
            if (r0 <= 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r6 = 0
        L_0x006a:
            if (r6 == 0) goto L_0x0119
            r7 = 0
            r0 = r15
            r2 = r16
            r3 = r17
            r5 = r19
            r6 = r20
            r0.mo161746M0(r1, r2, r3, r5, r6, r7, r8)
            goto L_0x0119
        L_0x007b:
            if (r1 != 0) goto L_0x0082
            r15.mo161697O0(r16, r17, r19, r20, r21)
            goto L_0x0119
        L_0x0082:
            float r0 = p1166z0.C112539e.m153738c(r17)
            float r8 = p1166z0.C112539e.m153739d(r17)
            r10 = 0
            int r11 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00a7
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 < 0) goto L_0x00a7
            int r10 = r15.mo161168i0()
            float r10 = (float) r10
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a7
            int r0 = r15.mo161167c0()
            float r0 = (float) r0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a7
            r0 = 1
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            if (r0 == 0) goto L_0x00ba
            r0 = r15
            r2 = r16
            r3 = r17
            r5 = r19
            r6 = r20
            r7 = r21
            r0.mo161745L0(r1, r2, r3, r5, r6, r7)
            goto L_0x0119
        L_0x00ba:
            if (r20 != 0) goto L_0x00c1
            r0 = 2139095040(0x7f800000, float:Infinity)
            r8 = 2139095040(0x7f800000, float:Infinity)
            goto L_0x00ca
        L_0x00c1:
            long r10 = r15.mo161742I0()
            float r0 = r15.mo161735A0(r3, r10)
            r8 = r0
        L_0x00ca:
            boolean r0 = java.lang.Float.isInfinite(r8)
            if (r0 != 0) goto L_0x00d8
            boolean r0 = java.lang.Float.isNaN(r8)
            if (r0 != 0) goto L_0x00d8
            r0 = 1
            goto L_0x00d9
        L_0x00d8:
            r0 = 0
        L_0x00d9:
            if (r0 == 0) goto L_0x0109
            int r0 = r5.f177722f
            int r10 = sx3.C64197v.m75536e(r19)
            if (r0 != r10) goto L_0x00e6
            r10 = r21
            goto L_0x00f8
        L_0x00e6:
            r10 = r21
            long r11 = p658q1.C62576g.m73547a(r8, r10)
            long r13 = r19.mo87582f()
            int r0 = p658q1.C62572c.m73542a(r13, r11)
            if (r0 <= 0) goto L_0x00f7
            goto L_0x00f8
        L_0x00f7:
            r6 = 0
        L_0x00f8:
            if (r6 == 0) goto L_0x010b
            r0 = r15
            r2 = r16
            r3 = r17
            r5 = r19
            r6 = r20
            r7 = r21
            r0.mo161746M0(r1, r2, r3, r5, r6, r7, r8)
            goto L_0x0119
        L_0x0109:
            r10 = r21
        L_0x010b:
            r0 = r15
            r2 = r16
            r3 = r17
            r5 = r19
            r6 = r20
            r7 = r21
            r0.mo161756Y0(r1, r2, r3, r5, r6, r7, r8)
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p658q1.C110311s.mo161747N0(q1.s$e, long, q1.f, boolean, boolean):void");
    }

    /* renamed from: O0 */
    public <T extends C110309q<T, M>, C, M extends C65503j> void mo161697O0(C110316e<T, C, M> eVar, long j, C62573f<C> fVar, boolean z, boolean z2) {
        C87412m.m108594g(eVar, "hitTestSource");
        C87412m.m108594g(fVar, "hitTestResult");
        C110311s K0 = mo161744K0();
        if (K0 != null) {
            K0.mo161747N0(eVar, K0.mo161739E0(j), fVar, z, z2);
        }
    }

    /* renamed from: P0 */
    public void mo161748P0() {
        C110281b0 b0Var = this.f329971B;
        if (b0Var != null) {
            b0Var.invalidate();
            return;
        }
        C110311s sVar = this.f329973i;
        if (sVar != null) {
            sVar.mo161748P0();
        }
    }

    /* renamed from: Q */
    public long mo161177Q(long j) {
        return C110310r.m150081a(this.f329972h).mo144632e(mo161182v(j));
    }

    /* renamed from: Q0 */
    public final boolean mo161749Q0() {
        if (this.f329971B != null && this.f329978q <= 0.0f) {
            return true;
        }
        C110311s sVar = this.f329973i;
        if (sVar != null) {
            return sVar.mo161749Q0();
        }
        return false;
    }

    /* renamed from: R0 */
    public final void mo161750R0(C32226l<? super C103224b0, C13598b0> lVar) {
        C110301j jVar;
        C110282c0 c0Var;
        boolean z = (this.f329975n == lVar && C87412m.m108589b(this.f329976o, this.f329972h.f329927v) && this.f329977p == this.f329972h.f329929x) ? false : true;
        this.f329975n = lVar;
        C110301j jVar2 = this.f329972h;
        this.f329976o = jVar2.f329927v;
        this.f329977p = jVar2.f329929x;
        if (!mo161183y() || lVar == null) {
            C110281b0 b0Var = this.f329971B;
            if (b0Var != null) {
                b0Var.destroy();
                this.f329972h.f329900N = true;
                ((C110319h) this.f329987z).invoke();
                if (mo161183y() && (c0Var = jVar.f329918j) != null) {
                    c0Var.mo144671m((jVar = this.f329972h));
                }
            }
            this.f329971B = null;
            this.f329970A = false;
        } else if (this.f329971B == null) {
            C110281b0 q = C110310r.m150081a(this.f329972h).mo144687q(this, this.f329987z);
            q.mo144763i(this.f328781f);
            q.mo144753e(this.f329982u);
            this.f329971B = q;
            mo161758a1();
            this.f329972h.f329900N = true;
            ((C110319h) this.f329987z).invoke();
        } else if (z) {
            mo161758a1();
        }
    }

    /* renamed from: S0 */
    public final void mo161751S0() {
        C110849h i;
        if (C110290e.m149956a(this.f329986y, 5)) {
            C110849h g = C110865n.m151144g(C110865n.f331650b.mo159371a(), (C32226l<Object, C13598b0>) null);
            try {
                i = g.mo162465i();
                for (T t = this.f329986y[5]; t != null; t = t.f329963f) {
                    ((C109849k0) ((C110302j0) t).f329962e).mo161162k0(this.f328781f);
                }
                C13598b0 b0Var = C13598b0.f38549a;
                g.mo162466o(i);
                g.mo162424c();
            } catch (Throwable th) {
                g.mo162424c();
                throw th;
            }
        }
    }

    /* renamed from: T0 */
    public void mo161752T0() {
        C110281b0 b0Var = this.f329971B;
        if (b0Var != null) {
            b0Var.invalidate();
        }
    }

    /* renamed from: U */
    public long mo161178U(C109857o oVar, long j) {
        C87412m.m108594g(oVar, "sourceCoordinates");
        C110311s sVar = (C110311s) oVar;
        C110311s D0 = mo161738D0(sVar);
        while (sVar != D0) {
            j = sVar.mo161757Z0(j);
            sVar = sVar.f329973i;
            C87412m.m108591d(sVar);
        }
        return mo161760v0(D0, j);
    }

    /* renamed from: U0 */
    public void mo161698U0(C103262s sVar) {
        C87412m.m108594g(sVar, "canvas");
        C110311s K0 = mo161744K0();
        if (K0 != null) {
            K0.mo161736B0(sVar);
        }
    }

    /* renamed from: V0 */
    public final void mo161753V0(C112538d dVar, boolean z, boolean z2) {
        C87412m.m108594g(dVar, "bounds");
        C110281b0 b0Var = this.f329971B;
        if (b0Var != null) {
            if (this.f329974j) {
                if (z2) {
                    long I0 = mo161742I0();
                    float d = C112545k.m153758d(I0) / 2.0f;
                    float b = C112545k.m153756b(I0) / 2.0f;
                    long j = this.f328781f;
                    dVar.mo164254a(-d, -b, ((float) ((int) (j >> 32))) + d, ((float) C33181m.m39966b(j)) + b);
                } else if (z) {
                    long j2 = this.f328781f;
                    dVar.mo164254a(0.0f, 0.0f, (float) ((int) (j2 >> 32)), (float) C33181m.m39966b(j2));
                }
                if (dVar.mo164255b()) {
                    return;
                }
            }
            b0Var.mo144762h(dVar, false);
        }
        long j3 = this.f329982u;
        int i = C33177j.f90051c;
        float f = (float) ((int) (j3 >> 32));
        dVar.f336951a += f;
        dVar.f336953c += f;
        float a = (float) C33177j.m39962a(j3);
        dVar.f336952b += a;
        dVar.f336954d += a;
    }

    /* renamed from: W0 */
    public final void mo161754W0(C109899z zVar) {
        C110301j s;
        C87412m.m108594g(zVar, "value");
        C109899z zVar2 = this.f329980s;
        if (zVar != zVar2) {
            this.f329980s = zVar;
            if (!(zVar2 != null && zVar.getWidth() == zVar2.getWidth() && zVar.getHeight() == zVar2.getHeight())) {
                int width = zVar.getWidth();
                int height = zVar.getHeight();
                C110281b0 b0Var = this.f329971B;
                if (b0Var != null) {
                    b0Var.mo144763i(C108329n.m146743a(width, height));
                } else {
                    C110311s sVar = this.f329973i;
                    if (sVar != null) {
                        sVar.mo161748P0();
                    }
                }
                C110301j jVar = this.f329972h;
                C110282c0 c0Var = jVar.f329918j;
                if (c0Var != null) {
                    c0Var.mo144671m(jVar);
                }
                mo161170n0(C108329n.m146743a(width, height));
                for (T t = this.f329986y[0]; t != null; t = t.f329963f) {
                    ((C110285d) t).f329861j = true;
                }
            }
            Map<C61911a, Integer> map = this.f329981t;
            if ((!(map == null || map.isEmpty()) || (!zVar.mo145550d().isEmpty())) && !C87412m.m108589b(zVar.mo145550d(), this.f329981t)) {
                C110311s K0 = mo161744K0();
                if (C87412m.m108589b(K0 != null ? K0.f329972h : null, this.f329972h)) {
                    C110301j s2 = this.f329972h.mo161723s();
                    if (s2 != null) {
                        s2.mo161706F();
                    }
                    C110301j jVar2 = this.f329972h;
                    C110307o oVar = jVar2.f329931z;
                    if (oVar.f329952c) {
                        C110301j s3 = jVar2.mo161723s();
                        if (s3 != null) {
                            s3.mo161712N(false);
                        }
                    } else if (oVar.f329953d && (s = jVar2.mo161723s()) != null) {
                        s.mo161711M(false);
                    }
                } else {
                    this.f329972h.mo161706F();
                }
                this.f329972h.f329931z.f329951b = true;
                Map map2 = this.f329981t;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.f329981t = map2;
                }
                map2.clear();
                map2.putAll(zVar.mo145550d());
            }
        }
    }

    /* renamed from: X */
    public C112541g mo161179X(C109857o oVar, boolean z) {
        C87412m.m108594g(oVar, "sourceCoordinates");
        if (!mo161183y()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        } else if (oVar.mo161183y()) {
            C110311s sVar = (C110311s) oVar;
            C110311s D0 = mo161738D0(sVar);
            C112538d dVar = this.f329985x;
            if (dVar == null) {
                dVar = new C112538d(0.0f, 0.0f, 0.0f, 0.0f);
                this.f329985x = dVar;
            }
            dVar.f336951a = 0.0f;
            dVar.f336952b = 0.0f;
            dVar.f336953c = (float) ((int) (oVar.mo161181b() >> 32));
            dVar.f336954d = (float) C33181m.m39966b(oVar.mo161181b());
            while (sVar != D0) {
                sVar.mo161753V0(dVar, z, false);
                if (dVar.mo164255b()) {
                    return C112541g.f336960e;
                }
                sVar = sVar.f329973i;
                C87412m.m108591d(sVar);
            }
            mo161759t0(D0, dVar, z);
            return new C112541g(dVar.f336951a, dVar.f336952b, dVar.f336953c, dVar.f336954d);
        } else {
            throw new IllegalStateException(("LayoutCoordinates " + oVar + " is not attached!").toString());
        }
    }

    /* renamed from: X0 */
    public final boolean mo161755X0() {
        C110296g0 g0Var = (C110296g0) this.f329986y[1];
        if (g0Var != null && g0Var.mo161695c()) {
            return true;
        }
        C110311s K0 = mo161744K0();
        return K0 != null && K0.mo161755X0();
    }

    /* renamed from: Y0 */
    public final <T extends C110309q<T, M>, C, M extends C65503j> void mo161756Y0(T t, C110316e<T, C, M> eVar, long j, C62573f<C> fVar, boolean z, boolean z2, float f) {
        T t2 = t;
        C110316e<T, C, M> eVar2 = eVar;
        C62573f<C> fVar2 = fVar;
        boolean z3 = z2;
        float f2 = f;
        if (t2 == null) {
            mo161697O0(eVar, j, fVar, z, z2);
        } else if (eVar2.mo161764b(t2)) {
            C e = eVar2.mo161767e(t2);
            C110320i iVar = new C110320i(this, t, eVar, j, fVar, z, z2, f);
            fVar.getClass();
            if (fVar2.f177722f == C64197v.m75536e(fVar)) {
                fVar2.mo87584i(e, f2, z3, iVar);
                if (fVar2.f177722f + 1 == C64197v.m75536e(fVar)) {
                    fVar.mo87588k();
                    return;
                }
                return;
            }
            long f3 = fVar.mo87582f();
            int i = fVar2.f177722f;
            fVar2.f177722f = C64197v.m75536e(fVar);
            fVar2.mo87584i(e, f2, z3, iVar);
            if (fVar2.f177722f + 1 < C64197v.m75536e(fVar) && C62572c.m73542a(f3, fVar.mo87582f()) > 0) {
                int i2 = fVar2.f177722f + 1;
                int i3 = i + 1;
                Object[] objArr = fVar2.f177720d;
                C110821n.m150963j(objArr, objArr, i3, i2, fVar2.f177723g);
                long[] jArr = fVar2.f177721e;
                int i4 = fVar2.f177723g;
                C87412m.m108594g(jArr, "<this>");
                System.arraycopy(jArr, i2, jArr, i3, i4 - i2);
                fVar2.f177722f = ((fVar2.f177723g + i) - fVar2.f177722f) - 1;
            }
            fVar.mo87588k();
            fVar2.f177722f = i;
        } else {
            mo161756Y0(t2.f329963f, eVar, j, fVar, z, z2, f);
        }
    }

    /* renamed from: Z0 */
    public long mo161757Z0(long j) {
        C110281b0 b0Var = this.f329971B;
        if (b0Var != null) {
            j = b0Var.mo144747a(j, false);
        }
        long j2 = this.f329982u;
        float c = C112539e.m153738c(j);
        int i = C33177j.f90051c;
        return C112540f.m153745a(c + ((float) ((int) (j2 >> 32))), C112539e.m153739d(j) + ((float) C33177j.m39962a(j2)));
    }

    /* renamed from: a */
    public final C109857o mo161180a() {
        if (mo161183y()) {
            return this.f329972h.f329896J.f329845i.f329973i;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    /* renamed from: a1 */
    public final void mo161758a1() {
        C110311s sVar;
        C110281b0 b0Var = this.f329971B;
        boolean z = false;
        if (b0Var != null) {
            C32226l<? super C103224b0, C13598b0> lVar = this.f329975n;
            if (lVar != null) {
                C103259q0 q0Var = f329967E;
                q0Var.f304462d = 1.0f;
                q0Var.f304463e = 1.0f;
                q0Var.f304464f = 1.0f;
                q0Var.f304465g = 0.0f;
                q0Var.f304466h = 0.0f;
                q0Var.f304467i = 0.0f;
                long j = C103227c0.f304432a;
                q0Var.f304468j = j;
                q0Var.f304469n = j;
                q0Var.f304470o = 0.0f;
                q0Var.f304471p = 0.0f;
                q0Var.f304472q = 0.0f;
                q0Var.f304473r = 8.0f;
                q0Var.f304474s = C103222a1.f304424b;
                q0Var.f304475t = C103252o0.f304457a;
                q0Var.f304476u = false;
                C108322d dVar = this.f329972h.f329927v;
                C87412m.m108594g(dVar, "<set-?>");
                q0Var.f304477v = dVar;
                C110310r.m150081a(this.f329972h).getSnapshotObserver().mo161693a(this, f329965C, new C110321j(lVar));
                float f = q0Var.f304462d;
                float f2 = q0Var.f304463e;
                float f3 = q0Var.f304464f;
                float f4 = q0Var.f304465g;
                float f5 = q0Var.f304466h;
                float f6 = q0Var.f304467i;
                long j2 = q0Var.f304468j;
                long j3 = q0Var.f304469n;
                float f7 = q0Var.f304470o;
                float f8 = q0Var.f304471p;
                float f9 = q0Var.f304472q;
                float f15 = q0Var.f304473r;
                long j4 = q0Var.f304474s;
                C103266t0 t0Var = q0Var.f304475t;
                float f16 = f;
                C103259q0 q0Var2 = q0Var;
                boolean z2 = q0Var.f304476u;
                C110301j jVar = this.f329972h;
                b0Var.mo144749c(f16, f2, f3, f4, f5, f6, f7, f8, f9, f15, j4, t0Var, z2, (C103256p0) null, j2, j3, jVar.f329929x, jVar.f329927v);
                sVar = this;
                sVar.f329974j = q0Var2.f304476u;
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            sVar = this;
            if (sVar.f329975n == null) {
                z = true;
            }
            if (!z) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        sVar.f329978q = f329967E.f304464f;
        C110301j jVar2 = sVar.f329972h;
        C110282c0 c0Var = jVar2.f329918j;
        if (c0Var != null) {
            c0Var.mo144671m(jVar2);
        }
    }

    /* renamed from: b */
    public final long mo161181b() {
        return this.f328781f;
    }

    /* renamed from: c */
    public Object mo161166c() {
        return mo161743J0((C110302j0) this.f329986y[3]);
    }

    public Object invoke(Object obj) {
        C103262s sVar = (C103262s) obj;
        C87412m.m108594g(sVar, "canvas");
        C110301j jVar = this.f329972h;
        if (jVar.f329887A) {
            C110310r.m150081a(jVar).getSnapshotObserver().mo161693a(this, f329966D, new C110322t(this, sVar));
            this.f329970A = false;
        } else {
            this.f329970A = true;
        }
        return C13598b0.f38549a;
    }

    public boolean isValid() {
        return this.f329971B != null;
    }

    /* renamed from: j0 */
    public void mo161160j0(long j, float f, C32226l<? super C103224b0, C13598b0> lVar) {
        mo161750R0(lVar);
        long j2 = this.f329982u;
        int i = C33177j.f90051c;
        if (!(j2 == j)) {
            this.f329982u = j;
            C110281b0 b0Var = this.f329971B;
            if (b0Var != null) {
                b0Var.mo144753e(j);
            } else {
                C110311s sVar = this.f329973i;
                if (sVar != null) {
                    sVar.mo161748P0();
                }
            }
            C110311s K0 = mo161744K0();
            if (!C87412m.m108589b(K0 != null ? K0.f329972h : null, this.f329972h)) {
                this.f329972h.mo161706F();
            } else {
                C110301j s = this.f329972h.mo161723s();
                if (s != null) {
                    s.mo161706F();
                }
            }
            C110301j jVar = this.f329972h;
            C110282c0 c0Var = jVar.f329918j;
            if (c0Var != null) {
                c0Var.mo144671m(jVar);
            }
        }
        this.f329983v = f;
    }

    /* renamed from: t0 */
    public final void mo161759t0(C110311s sVar, C112538d dVar, boolean z) {
        if (sVar != this) {
            C110311s sVar2 = this.f329973i;
            if (sVar2 != null) {
                sVar2.mo161759t0(sVar, dVar, z);
            }
            long j = this.f329982u;
            int i = C33177j.f90051c;
            float f = (float) ((int) (j >> 32));
            dVar.f336951a -= f;
            dVar.f336953c -= f;
            float a = (float) C33177j.m39962a(j);
            dVar.f336952b -= a;
            dVar.f336954d -= a;
            C110281b0 b0Var = this.f329971B;
            if (b0Var != null) {
                b0Var.mo144762h(dVar, true);
                if (this.f329974j && z) {
                    long j2 = this.f328781f;
                    dVar.mo164254a(0.0f, 0.0f, (float) ((int) (j2 >> 32)), (float) C33181m.m39966b(j2));
                }
            }
        }
    }

    /* renamed from: v */
    public long mo161182v(long j) {
        if (mo161183y()) {
            for (C110311s sVar = this; sVar != null; sVar = sVar.f329973i) {
                j = sVar.mo161757Z0(j);
            }
            return j;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    /* renamed from: v0 */
    public final long mo161760v0(C110311s sVar, long j) {
        if (sVar == this) {
            return j;
        }
        C110311s sVar2 = this.f329973i;
        return (sVar2 == null || C87412m.m108589b(sVar, sVar2)) ? mo161739E0(j) : mo161739E0(sVar2.mo161760v0(sVar, j));
    }

    /* renamed from: w0 */
    public abstract int mo161699w0(C61911a aVar);

    /* renamed from: y */
    public final boolean mo161183y() {
        if (!this.f329979r || this.f329972h.mo161701A()) {
            return this.f329979r;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: y0 */
    public final long mo161761y0(long j) {
        return C112546l.m153761a(Math.max(0.0f, (C112545k.m153758d(j) - ((float) mo161168i0())) / 2.0f), Math.max(0.0f, (C112545k.m153756b(j) - ((float) mo161167c0())) / 2.0f));
    }

    /* renamed from: z0 */
    public void mo161762z0() {
        for (T t : this.f329986y) {
            while (t != null) {
                t.mo161694b();
                t = t.f329963f;
            }
        }
        this.f329979r = false;
        mo161750R0(this.f329975n);
        C110301j s = this.f329972h.mo161723s();
        if (s != null) {
            s.mo161729x();
        }
    }
}
