package p869y0;

import androidx.compose.p002ui.platform.C54172f1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import p1140p1.C110096b;
import p1140p1.C110098d;
import p1140p1.C110099e;
import p1140p1.C110100f;
import p410k0.C108793e;
import p559i1.C108317b;
import p618n1.C109667a;
import p618n1.C34727c;
import p631o1.C109831c;
import p631o1.C109834d;
import p631o1.C109847j0;
import p631o1.C109857o;
import p658q1.C110282c0;
import p658q1.C110289d0;
import p658q1.C110301j;
import p658q1.C110311s;
import p721v0.C65503j;
import p904j1.C108524d;
import p904j1.C108525e;
import rx3.C13598b0;

/* renamed from: y0.l */
public final class C112321l extends C54172f1 implements C110096b, C110098d<C112321l>, C110289d0, C109847j0 {

    /* renamed from: v */
    public static final C32226l<C112321l, C13598b0> f336330v = C112322a.f336345d;

    /* renamed from: e */
    public C112321l f336331e;

    /* renamed from: f */
    public final C108793e<C112321l> f336332f;

    /* renamed from: g */
    public C112306b0 f336333g;

    /* renamed from: h */
    public C112321l f336334h;

    /* renamed from: i */
    public C112317h f336335i;

    /* renamed from: j */
    public C108317b<C34727c> f336336j;

    /* renamed from: n */
    public C109831c f336337n;

    /* renamed from: o */
    public C112338v f336338o;

    /* renamed from: p */
    public final C112333s f336339p;

    /* renamed from: q */
    public C112344z f336340q;

    /* renamed from: r */
    public C110311s f336341r;

    /* renamed from: s */
    public boolean f336342s;

    /* renamed from: t */
    public C108524d f336343t;

    /* renamed from: u */
    public final C108793e<C108524d> f336344u;

    /* renamed from: y0.l$a */
    public static final class C112322a extends C87413o implements C32226l<C112321l, C13598b0> {

        /* renamed from: d */
        public static final C112322a f336345d = new C112322a();

        public C112322a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C112321l lVar = (C112321l) obj;
            C87412m.m108594g(lVar, "focusModifier");
            C112335u.m153257a(lVar);
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C112321l(p869y0.C112306b0 r2, fy3.C32226l<androidx.compose.p002ui.platform.C103618e1, rx3.C13598b0> r3, int r4, gy3.C8480h r5) {
        /*
            r1 = this;
            r4 = r4 & 2
            if (r4 == 0) goto L_0x0006
            fy3.l<androidx.compose.ui.platform.e1, rx3.b0> r3 = androidx.compose.p002ui.platform.C103612c1.f306063a
        L_0x0006:
            java.lang.String r4 = "initialFocus"
            gy3.C87412m.m108594g(r2, r4)
            java.lang.String r4 = "inspectorInfo"
            gy3.C87412m.m108594g(r3, r4)
            r1.<init>(r3)
            k0.e r3 = new k0.e
            r4 = 16
            y0.l[] r5 = new p869y0.C112321l[r4]
            r0 = 0
            r3.<init>(r5, r0)
            r1.f336332f = r3
            r1.f336333g = r2
            y0.t r2 = new y0.t
            r2.<init>()
            r1.f336339p = r2
            k0.e r2 = new k0.e
            j1.d[] r3 = new p904j1.C108524d[r4]
            r2.<init>(r3, r0)
            r1.f336344u = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p869y0.C112321l.<init>(y0.b0, fy3.l, int, gy3.h):void");
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: U */
    public void mo145808U(C110099e eVar) {
        C108793e<C112321l> eVar2;
        C108793e<C112321l> eVar3;
        int ordinal;
        C110311s sVar;
        C110301j jVar;
        C110282c0 c0Var;
        C66478i focusManager;
        C87412m.m108594g(eVar, "scope");
        C112321l lVar = (C112321l) eVar.mo161499a(C112323m.f336346a);
        if (!C87412m.m108589b(lVar, this.f336331e)) {
            if (lVar == null && !(((ordinal = this.f336333g.ordinal()) != 0 && ordinal != 2) || (sVar = this.f336341r) == null || (jVar = sVar.f329972h) == null || (c0Var = jVar.f329918j) == null || (focusManager = c0Var.getFocusManager()) == null)) {
                focusManager.mo90561b(true);
            }
            C112321l lVar2 = this.f336331e;
            if (!(lVar2 == null || (eVar3 = lVar2.f336332f) == null)) {
                eVar3.mo159869k(this);
            }
            if (!(lVar == null || (eVar2 = lVar.f336332f) == null)) {
                eVar2.mo159860b(this);
            }
        }
        this.f336331e = lVar;
        C112317h hVar = (C112317h) eVar.mo161499a(C112311e.f336315a);
        if (!C87412m.m108589b(hVar, this.f336335i)) {
            C112317h hVar2 = this.f336335i;
            if (hVar2 != null) {
                hVar2.mo164048f(this);
            }
            if (hVar != null) {
                hVar.mo164045b(this);
            }
        }
        this.f336335i = hVar;
        C112344z zVar = (C112344z) eVar.mo161499a(C112341y.f336370a);
        if (!C87412m.m108589b(zVar, this.f336340q)) {
            C112344z zVar2 = this.f336340q;
            if (zVar2 != null) {
                zVar2.mo164069e(this);
            }
            if (zVar != null) {
                zVar.mo164067b(this);
            }
        }
        this.f336340q = zVar;
        this.f336336j = (C108317b) eVar.mo161499a(C109667a.f328292a);
        this.f336337n = (C109831c) eVar.mo161499a(C109834d.f328759a);
        this.f336343t = (C108524d) eVar.mo161499a(C108525e.f324865a);
        this.f336338o = (C112338v) eVar.mo161499a(C112335u.f336362a);
        C112335u.m153257a(this);
    }

    /* renamed from: a */
    public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        return C65503j.C65506c.C65507a.m77190a(this, lVar);
    }

    /* renamed from: b */
    public final void mo164050b(C112306b0 b0Var) {
        C87412m.m108594g(b0Var, "value");
        this.f336333g = b0Var;
        C112317h hVar = this.f336335i;
        if (hVar != null) {
            hVar.mo164047e();
        }
    }

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public C110100f<C112321l> getKey() {
        return C112323m.f336346a;
    }

    public Object getValue() {
        return this;
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }

    public boolean isValid() {
        return this.f336331e != null;
    }

    /* renamed from: y */
    public void mo145809y(C109857o oVar) {
        C87412m.m108594g(oVar, "coordinates");
        boolean z = this.f336341r == null;
        this.f336341r = (C110311s) oVar;
        if (z) {
            C112335u.m153257a(this);
        }
        if (this.f336342s) {
            this.f336342s = false;
            C112308c0.m153192f(this);
        }
    }
}
