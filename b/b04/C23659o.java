package b04;

import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import n04.C25122g1;
import n04.C25143j0;
import n04.C25144j1;
import n04.C25146k0;
import n04.C25164o1;
import n04.C25174r1;
import n04.C25176s0;
import n04.C25202z1;
import o04.C25323e;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C64186f0;
import sx3.C64197v;
import ty3.C22558j;
import ty3.C26336h;
import wy3.C22935h;
import wy3.C26446d1;
import wy3.C26448e0;

/* renamed from: b04.o */
public final class C23659o implements C25144j1 {

    /* renamed from: a */
    public final long f67846a;

    /* renamed from: b */
    public final C26448e0 f67847b;

    /* renamed from: c */
    public final Set<C25143j0> f67848c;

    /* renamed from: d */
    public final C25176s0 f67849d = C25146k0.m31958d(C25122g1.f71558f, this, false);

    /* renamed from: e */
    public final C13601g f67850e = C36568h.m40985a(new C23660a(this));

    /* renamed from: b04.o$a */
    public static final class C23660a extends C87413o implements C32224a<List<C25176s0>> {

        /* renamed from: d */
        public final /* synthetic */ C23659o f67851d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23660a(C23659o oVar) {
            super(0);
            this.f67851d = oVar;
        }

        public Object invoke() {
            boolean z = true;
            C25176s0 s = this.f67851d.mo37092m().mo53319k("Comparable").mo36111s();
            C87412m.m108593f(s, "builtIns.comparable.defaultType");
            List h = C64197v.m75539h(C25174r1.m32017d(s, C26236u.m33719b(new C25164o1(C25202z1.IN_VARIANCE, this.f67851d.f67849d)), (C25122g1) null, 2, (Object) null));
            C23659o oVar = this.f67851d;
            C26448e0 e0Var = oVar.f67847b;
            C87412m.m108594g(e0Var, "<this>");
            C25176s0[] s0VarArr = new C25176s0[4];
            C26336h m = e0Var.mo52623m();
            m.getClass();
            C25176s0 t = m.mo53327t(C22558j.INT);
            if (t != null) {
                s0VarArr[0] = t;
                C26336h m2 = e0Var.mo52623m();
                m2.getClass();
                C25176s0 t2 = m2.mo53327t(C22558j.LONG);
                if (t2 != null) {
                    s0VarArr[1] = t2;
                    C26336h m3 = e0Var.mo52623m();
                    m3.getClass();
                    C25176s0 t3 = m3.mo53327t(C22558j.BYTE);
                    if (t3 != null) {
                        s0VarArr[2] = t3;
                        C26336h m4 = e0Var.mo52623m();
                        m4.getClass();
                        C25176s0 t4 = m4.mo53327t(C22558j.SHORT);
                        if (t4 != null) {
                            s0VarArr[3] = t4;
                            List f = C64197v.m75537f(s0VarArr);
                            if (!f.isEmpty()) {
                                Iterator it = f.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    if (!(!oVar.f67848c.contains((C25143j0) it.next()))) {
                                        z = false;
                                        break;
                                    }
                                }
                            }
                            if (!z) {
                                C25176s0 s2 = this.f67851d.mo37092m().mo53319k("Number").mo36111s();
                                if (s2 != null) {
                                    h.add(s2);
                                } else {
                                    C26336h.m33836a(55);
                                    throw null;
                                }
                            }
                            return h;
                        }
                        C26336h.m33836a(57);
                        throw null;
                    }
                    C26336h.m33836a(56);
                    throw null;
                }
                C26336h.m33836a(59);
                throw null;
            }
            C26336h.m33836a(58);
            throw null;
        }
    }

    public C23659o(long j, C26448e0 e0Var, Set set, C8480h hVar) {
        C25122g1.f71557e.getClass();
        this.f67846a = j;
        this.f67847b = e0Var;
        this.f67848c = set;
    }

    public List<C26446d1> getParameters() {
        return C64186f0.f181907d;
    }

    /* renamed from: m */
    public C26336h mo37092m() {
        return this.f67847b.mo52623m();
    }

    /* renamed from: n */
    public C25144j1 mo37093n(C25323e eVar) {
        C87412m.m108594g(eVar, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: o */
    public C22935h mo37094o() {
        return null;
    }

    /* renamed from: p */
    public boolean mo37095p() {
        return false;
    }

    /* renamed from: r */
    public Collection<C25143j0> mo37096r() {
        return (List) this.f67850e.getValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IntegerLiteralType");
        sb.append('[' + C110818d0.m150921S(this.f67848c, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C28227p.f77767d, 30, (Object) null) + ']');
        return sb.toString();
    }
}
