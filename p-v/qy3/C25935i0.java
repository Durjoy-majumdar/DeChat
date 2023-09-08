package qy3;

import cz3.C24410d;
import ey3.C116796a;
import fy3.C32224a;
import gy3.C24560g0;
import gy3.C24566n;
import gy3.C24575y;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import n04.C25143j0;
import n04.C25158m1;
import n04.C25187v1;
import ny3.C25236e;
import ny3.C25247p;
import ny3.C25249q;
import ny3.C89104m;
import py3.C25503a;
import qy3.C25968n0;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C13603j;
import rx3.C36568h;
import rx3.C48096k;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64186f0;
import sx3.C64197v;
import wy3.C22935h;
import wy3.C26443c1;
import wy3.C26446d1;
import wy3.C26447e;

/* renamed from: qy3.i0 */
public final class C25935i0 implements C24566n {

    /* renamed from: h */
    public static final /* synthetic */ C89104m<Object>[] f72291h;

    /* renamed from: d */
    public final C25143j0 f72292d;

    /* renamed from: e */
    public final C25968n0.C25969a<Type> f72293e;

    /* renamed from: f */
    public final C25968n0.C25969a f72294f;

    /* renamed from: g */
    public final C25968n0.C25969a f72295g;

    /* renamed from: qy3.i0$a */
    public static final class C25936a extends C87413o implements C32224a<List<? extends C25247p>> {

        /* renamed from: d */
        public final /* synthetic */ C25935i0 f72296d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<Type> f72297e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25936a(C25935i0 i0Var, C32224a<? extends Type> aVar) {
            super(0);
            this.f72296d = i0Var;
            this.f72297e = aVar;
        }

        public Object invoke() {
            C25247p pVar;
            List<C25158m1> I0 = this.f72296d.f72292d.mo37079I0();
            if (I0.isEmpty()) {
                return C64186f0.f181907d;
            }
            C13601g b = C36568h.m40986b(C13602i.PUBLICATION, new C25933h0(this.f72296d));
            C32224a<Type> aVar = this.f72297e;
            C25935i0 i0Var = this.f72296d;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(I0, 10));
            int i = 0;
            for (T next : I0) {
                int i2 = i + 1;
                C25931g0 g0Var = null;
                if (i >= 0) {
                    C25158m1 m1Var = (C25158m1) next;
                    if (m1Var.mo52296b()) {
                        pVar = C25247p.f71705c;
                    } else {
                        C25143j0 type = m1Var.getType();
                        C87412m.m108593f(type, "typeProjection.type");
                        if (aVar != null) {
                            g0Var = new C25931g0(i0Var, i, b);
                        }
                        C25935i0 i0Var2 = new C25935i0(type, g0Var);
                        int ordinal = m1Var.mo52295a().ordinal();
                        if (ordinal == 0) {
                            pVar = new C25247p(C25249q.INVARIANT, i0Var2);
                        } else if (ordinal == 1) {
                            pVar = new C25247p(C25249q.IN, i0Var2);
                        } else if (ordinal == 2) {
                            pVar = new C25247p(C25249q.OUT, i0Var2);
                        } else {
                            throw new C13603j();
                        }
                    }
                    arrayList.add(pVar);
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            return arrayList;
        }
    }

    /* renamed from: qy3.i0$b */
    public static final class C25937b extends C87413o implements C32224a<C25236e> {

        /* renamed from: d */
        public final /* synthetic */ C25935i0 f72298d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25937b(C25935i0 i0Var) {
            super(0);
            this.f72298d = i0Var;
        }

        public Object invoke() {
            C25935i0 i0Var = this.f72298d;
            return i0Var.mo52821c(i0Var.f72292d);
        }
    }

    static {
        Class<C25935i0> cls = C25935i0.class;
        f72291h = new C89104m[]{C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "arguments", "getArguments()Ljava/util/List;"))};
    }

    public C25935i0(C25143j0 j0Var, C32224a<? extends Type> aVar) {
        C87412m.m108594g(j0Var, "type");
        this.f72292d = j0Var;
        C25968n0.C25969a<Type> aVar2 = null;
        C25968n0.C25969a<Type> aVar3 = aVar instanceof C25968n0.C25969a ? aVar : null;
        if (aVar3 != null) {
            aVar2 = aVar3;
        } else if (aVar != null) {
            aVar2 = C25968n0.m33137c(aVar);
        }
        this.f72293e = aVar2;
        this.f72294f = C25968n0.m33137c(new C25937b(this));
        this.f72295g = C25968n0.m33137c(new C25936a(this, aVar));
    }

    /* renamed from: c */
    public final C25236e mo52821c(C25143j0 j0Var) {
        C25143j0 type;
        C22935h o = j0Var.mo37081K0().mo37094o();
        if (o instanceof C26447e) {
            Class<?> h = C25987u0.m33177h((C26447e) o);
            if (h == null) {
                return null;
            }
            if (h.isArray()) {
                C25158m1 m1Var = (C25158m1) C110818d0.m150940l0(j0Var.mo37079I0());
                if (m1Var == null || (type = m1Var.getType()) == null) {
                    return new C25943l(h);
                }
                C25236e c = mo52821c(type);
                if (c != null) {
                    return new C25943l(Array.newInstance(C116796a.m164750b(C25503a.m32926a(c)), 0).getClass());
                }
                throw new C118215l0("Cannot determine classifier for array element type: " + this);
            } else if (C25187v1.m32087g(j0Var)) {
                return new C25943l(h);
            } else {
                Class<?> cls = C24410d.f69858b.get(h);
                if (cls != null) {
                    h = cls;
                }
                return new C25943l(h);
            }
        } else if (o instanceof C26446d1) {
            return new C25939j0((C25942k0) null, (C26446d1) o);
        } else {
            if (!(o instanceof C26443c1)) {
                return null;
            }
            throw new C48096k("An operation is not implemented: Type alias classifiers are not yet supported");
        }
    }

    /* renamed from: d */
    public Type mo51284d() {
        C25968n0.C25969a<Type> aVar = this.f72293e;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C25935i0) && C87412m.m108589b(this.f72292d, ((C25935i0) obj).f72292d);
    }

    public List<C25247p> getArguments() {
        C25968n0.C25969a aVar = this.f72295g;
        C89104m<Object> mVar = f72291h[1];
        Object invoke = aVar.invoke();
        C87412m.m108593f(invoke, "<get-arguments>(...)");
        return (List) invoke;
    }

    public int hashCode() {
        return this.f72292d.hashCode();
    }

    /* renamed from: j */
    public C25236e mo52347j() {
        C25968n0.C25969a aVar = this.f72294f;
        C89104m<Object> mVar = f72291h[0];
        return (C25236e) aVar.invoke();
    }

    public String toString() {
        return C25974p0.f72353a.mo52840d(this.f72292d);
    }
}
