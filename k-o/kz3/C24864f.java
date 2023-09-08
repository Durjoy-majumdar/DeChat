package kz3;

import d04.C24442a;
import fy3.C32226l;
import g04.C20770i;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import gz3.C24597k;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import n04.C25119f0;
import n04.C25122g1;
import n04.C25143j0;
import n04.C25144j1;
import n04.C25146k0;
import n04.C25153l0;
import n04.C25158m1;
import n04.C25164o1;
import n04.C25167p1;
import n04.C25176s0;
import n04.C25202z1;
import o04.C25323e;
import p04.C25416i;
import p04.C25417j;
import rx3.C13603j;
import rx3.C13604l;
import sx3.C26236u;
import sx3.C36907w;
import ty3.C26336h;
import vz3.C26408b;
import wy3.C22935h;
import wy3.C26446d1;
import wy3.C26447e;

/* renamed from: kz3.f */
public final class C24864f extends C25167p1 {

    /* renamed from: c */
    public static final C24859a f70863c;

    /* renamed from: d */
    public static final C24859a f70864d;

    /* renamed from: b */
    public final C24867h f70865b;

    /* renamed from: kz3.f$a */
    public static final class C24865a extends C87413o implements C32226l<C25323e, C25176s0> {

        /* renamed from: d */
        public final /* synthetic */ C26447e f70866d;

        /* renamed from: e */
        public final /* synthetic */ C24864f f70867e;

        /* renamed from: f */
        public final /* synthetic */ C25176s0 f70868f;

        /* renamed from: g */
        public final /* synthetic */ C24859a f70869g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24865a(C26447e eVar, C24864f fVar, C25176s0 s0Var, C24859a aVar) {
            super(1);
            this.f70866d = eVar;
            this.f70867e = fVar;
            this.f70868f = s0Var;
            this.f70869g = aVar;
        }

        public Object invoke(Object obj) {
            C26408b f;
            C26447e b;
            C25323e eVar = (C25323e) obj;
            C87412m.m108594g(eVar, "kotlinTypeRefiner");
            C26447e eVar2 = this.f70866d;
            if (!(eVar2 instanceof C26447e)) {
                eVar2 = null;
            }
            if (eVar2 == null || (f = C24442a.m30539f(eVar2)) == null || (b = eVar.mo52408b(f)) == null || C87412m.m108589b(b, this.f70866d)) {
                return null;
            }
            return (C25176s0) this.f70867e.mo51871h(this.f70868f, b, this.f70869g).f38555d;
        }
    }

    static {
        C24597k kVar = C24597k.COMMON;
        f70863c = C24863e.m31346b(kVar, false, (C26446d1) null, 3, (Object) null).mo51862b(C24860b.FLEXIBLE_LOWER_BOUND);
        f70864d = C24863e.m31346b(kVar, false, (C26446d1) null, 3, (Object) null).mo51862b(C24860b.FLEXIBLE_UPPER_BOUND);
    }

    public C24864f(C24867h hVar) {
        this.f70865b = hVar == null ? new C24867h(this) : hVar;
    }

    /* renamed from: d */
    public C25158m1 mo37099d(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "key");
        return new C25164o1(mo51872i(j0Var, new C24859a(C24597k.COMMON, (C24860b) null, false, (Set) null, (C25176s0) null, 30, (C8480h) null)));
    }

    /* renamed from: g */
    public final C25158m1 mo51870g(C26446d1 d1Var, C24859a aVar, C25143j0 j0Var) {
        C25202z1 z1Var = C25202z1.INVARIANT;
        C87412m.m108594g(d1Var, "parameter");
        C87412m.m108594g(aVar, "attr");
        C87412m.m108594g(j0Var, "erasedUpperBound");
        int ordinal = aVar.f70845b.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (!d1Var.mo53423o().f71661e) {
                return new C25164o1(z1Var, C24442a.m30538e(d1Var).mo53323o());
            }
            List<C26446d1> parameters = j0Var.mo37081K0().getParameters();
            C87412m.m108593f(parameters, "erasedUpperBound.constructor.parameters");
            return parameters.isEmpty() ^ true ? new C25164o1(C25202z1.OUT_VARIANCE, j0Var) : C24863e.m31345a(d1Var, aVar);
        } else if (ordinal == 2) {
            return new C25164o1(z1Var, j0Var);
        } else {
            throw new C13603j();
        }
    }

    /* renamed from: h */
    public final C13604l<C25176s0, Boolean> mo51871h(C25176s0 s0Var, C26447e eVar, C24859a aVar) {
        if (s0Var.mo37081K0().getParameters().isEmpty()) {
            return new C13604l<>(s0Var, Boolean.FALSE);
        }
        if (C26336h.m33842z(s0Var)) {
            C25158m1 m1Var = s0Var.mo37079I0().get(0);
            C25202z1 a = m1Var.mo52295a();
            C25143j0 type = m1Var.getType();
            C87412m.m108593f(type, "componentTypeProjection.type");
            return new C13604l<>(C25146k0.m31961g(s0Var.mo37080J0(), s0Var.mo37081K0(), C26236u.m33719b(new C25164o1(a, mo51872i(type, aVar))), s0Var.mo37082L0(), (C25323e) null, 16, (Object) null), Boolean.FALSE);
        } else if (C25153l0.m31968a(s0Var)) {
            return new C13604l<>(C25417j.m32698c(C25416i.ERROR_RAW_TYPE, s0Var.mo37081K0().toString()), Boolean.FALSE);
        } else {
            C20770i t0 = eVar.mo53430t0(this);
            C87412m.m108593f(t0, "declaration.getMemberScope(this)");
            C25122g1 J0 = s0Var.mo37080J0();
            C25144j1 l = eVar.mo36110l();
            C87412m.m108593f(l, "declaration.typeConstructor");
            List<C26446d1> parameters = eVar.mo36110l().getParameters();
            C87412m.m108593f(parameters, "declaration.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(parameters, 10));
            for (C26446d1 d1Var : parameters) {
                C87412m.m108593f(d1Var, "parameter");
                C25143j0 a2 = this.f70865b.mo51877a(d1Var, true, aVar);
                C87412m.m108593f(a2, "typeParameterUpperBoundE…eter, isRaw = true, attr)");
                arrayList.add(mo51870g(d1Var, aVar, a2));
            }
            return new C13604l<>(C25146k0.m31963i(J0, l, arrayList, s0Var.mo37082L0(), t0, new C24865a(eVar, this, s0Var, aVar)), Boolean.TRUE);
        }
    }

    /* renamed from: i */
    public final C25143j0 mo51872i(C25143j0 j0Var, C24859a aVar) {
        C22935h o = j0Var.mo37081K0().mo37094o();
        if (o instanceof C26446d1) {
            C25143j0 a = this.f70865b.mo51877a((C26446d1) o, true, aVar);
            C87412m.m108593f(a, "typeParameterUpperBoundE…tion, isRaw = true, attr)");
            return mo51872i(a, aVar);
        } else if (o instanceof C26447e) {
            C22935h o2 = C25119f0.m31894d(j0Var).mo37081K0().mo37094o();
            if (o2 instanceof C26447e) {
                C13604l<C25176s0, Boolean> h = mo51871h(C25119f0.m31893c(j0Var), (C26447e) o, f70863c);
                C25176s0 s0Var = (C25176s0) h.f38555d;
                boolean booleanValue = ((Boolean) h.f38556e).booleanValue();
                C13604l<C25176s0, Boolean> h2 = mo51871h(C25119f0.m31894d(j0Var), (C26447e) o2, f70864d);
                C25176s0 s0Var2 = (C25176s0) h2.f38555d;
                return (booleanValue || ((Boolean) h2.f38556e).booleanValue()) ? new C24866g(s0Var, s0Var2) : C25146k0.m31957c(s0Var, s0Var2);
            }
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + o2 + "\" while for lower it's \"" + o + '\"').toString());
        } else {
            throw new IllegalStateException(("Unexpected declaration kind: " + o).toString());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24864f(C24867h hVar, int i, C8480h hVar2) {
        this((i & 1) != 0 ? null : hVar);
    }
}
