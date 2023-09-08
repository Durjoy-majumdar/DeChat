package zy3;

import d04.C24442a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collection;
import java.util.List;
import l04.C24920n;
import n04.C25143j0;
import n04.C25144j1;
import n04.C25153l0;
import n04.C25187v1;
import n04.C25198y1;
import o04.C25323e;
import ty3.C26336h;
import vz3.C22830f;
import wy3.C22935h;
import wy3.C26443c1;
import wy3.C26446d1;
import wy3.C26469k;
import wy3.C26482m;
import wy3.C26483n;
import wy3.C26505s;
import wy3.C26521y0;
import xy3.C26571h;

/* renamed from: zy3.f */
public abstract class C26738f extends C26758n implements C26443c1 {

    /* renamed from: h */
    public final C26505s f74335h;

    /* renamed from: i */
    public List<? extends C26446d1> f74336i;

    /* renamed from: j */
    public final C26740b f74337j = new C26740b(this);

    /* renamed from: zy3.f$a */
    public static final class C26739a extends C87413o implements C32226l<C25198y1, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C26738f f74338d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26739a(C26738f fVar) {
            super(1);
            this.f74338d = fVar;
        }

        public Object invoke(Object obj) {
            C25198y1 y1Var = (C25198y1) obj;
            C87412m.m108593f(y1Var, "type");
            boolean z = false;
            if (!C25153l0.m31968a(y1Var)) {
                C26738f fVar = this.f74338d;
                C22935h o = y1Var.mo37081K0().mo37094o();
                if ((o instanceof C26446d1) && !C87412m.m108589b(((C26446d1) o).mo51892b(), fVar)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: zy3.f$b */
    public static final class C26740b implements C25144j1 {

        /* renamed from: a */
        public final /* synthetic */ C26738f f74339a;

        public C26740b(C26738f fVar) {
            this.f74339a = fVar;
        }

        public List<C26446d1> getParameters() {
            List<? extends C26446d1> list = ((C24920n) this.f74339a).f71007w;
            if (list != null) {
                return list;
            }
            C87412m.m108603p("typeConstructorParameters");
            throw null;
        }

        /* renamed from: m */
        public C26336h mo37092m() {
            return C24442a.m30538e(this.f74339a);
        }

        /* renamed from: n */
        public C25144j1 mo37093n(C25323e eVar) {
            C87412m.m108594g(eVar, "kotlinTypeRefiner");
            return this;
        }

        /* renamed from: o */
        public C22935h mo37094o() {
            return this.f74339a;
        }

        /* renamed from: p */
        public boolean mo37095p() {
            return true;
        }

        /* renamed from: r */
        public Collection<C25143j0> mo37096r() {
            Collection<C25143j0> r = ((C24920n) this.f74339a).mo51919E0().mo37081K0().mo37096r();
            C87412m.m108593f(r, "declarationDescriptor.un…pe.constructor.supertypes");
            return r;
        }

        public String toString() {
            return "[typealias " + this.f74339a.getName().mo35995b() + ']';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26738f(C26469k kVar, C26571h hVar, C22830f fVar, C26521y0 y0Var, C26505s sVar) {
        super(kVar, hVar, fVar, y0Var);
        C87412m.m108594g(kVar, "containingDeclaration");
        C87412m.m108594g(hVar, "annotations");
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(y0Var, "sourceElement");
        C87412m.m108594g(sVar, "visibilityImpl");
        this.f74335h = sVar;
    }

    /* renamed from: P */
    public boolean mo51792P() {
        return false;
    }

    /* renamed from: U */
    public C26483n mo53719U() {
        return this;
    }

    /* renamed from: Y */
    public boolean mo51795Y() {
        return C25187v1.m32083c(((C24920n) this).mo51919E0(), new C26739a(this));
    }

    /* renamed from: a */
    public C22935h mo36109a() {
        return this;
    }

    /* renamed from: a */
    public C26469k m34806a() {
        return this;
    }

    public C26505s getVisibility() {
        return this.f74335h;
    }

    /* renamed from: h0 */
    public <R, D> R mo52621h0(C26482m<R, D> mVar, D d) {
        C87412m.m108594g(mVar, "visitor");
        return mVar.mo53455i(this, d);
    }

    public boolean isExternal() {
        return false;
    }

    /* renamed from: l */
    public C25144j1 mo36110l() {
        return this.f74337j;
    }

    /* renamed from: t */
    public List<C26446d1> mo51805t() {
        List<? extends C26446d1> list = this.f74336i;
        if (list != null) {
            return list;
        }
        C87412m.m108603p("declaredTypeParametersImpl");
        throw null;
    }

    public String toString() {
        return "typealias " + getName().mo35995b();
    }

    /* renamed from: v0 */
    public boolean mo51808v0() {
        return false;
    }
}
