package zy3;

import fy3.C32224a;
import g04.C20768h;
import g04.C20770i;
import g04.C24526b;
import gy3.C24560g0;
import gy3.C24575y;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import m04.C21480i;
import m04.C24979m;
import m04.C24980n;
import ny3.C89104m;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C36907w;
import vz3.C22826c;
import wy3.C22940l0;
import wy3.C26448e0;
import wy3.C26465i0;
import wy3.C26469k;
import wy3.C26482m;
import wy3.C26484n0;
import xy3.C26571h;

/* renamed from: zy3.u */
public class C26782u extends C23594m implements C26484n0 {

    /* renamed from: n */
    public static final /* synthetic */ C89104m<Object>[] f74503n;

    /* renamed from: f */
    public final C26729b0 f74504f;

    /* renamed from: g */
    public final C22826c f74505g;

    /* renamed from: h */
    public final C21480i f74506h;

    /* renamed from: i */
    public final C21480i f74507i;

    /* renamed from: j */
    public final C20770i f74508j;

    /* renamed from: zy3.u$a */
    public static final class C23595a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C26782u f67733d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23595a(C26782u uVar) {
            super(0);
            this.f67733d = uVar;
        }

        public Object invoke() {
            C26729b0 b0Var = this.f67733d.f74504f;
            b0Var.mo53716U();
            return Boolean.valueOf(C22940l0.m26960b((C23593l) ((C36570n) b0Var.f74319q).getValue(), this.f67733d.f74505g));
        }
    }

    /* renamed from: zy3.u$b */
    public static final class C23596b extends C87413o implements C32224a<List<? extends C26465i0>> {

        /* renamed from: d */
        public final /* synthetic */ C26782u f67734d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23596b(C26782u uVar) {
            super(0);
            this.f67734d = uVar;
        }

        public Object invoke() {
            C26729b0 b0Var = this.f67734d.f74504f;
            b0Var.mo53716U();
            return C22940l0.m26961c((C23593l) ((C36570n) b0Var.f74319q).getValue(), this.f67734d.f74505g);
        }
    }

    /* renamed from: zy3.u$c */
    public static final class C26783c extends C87413o implements C32224a<C20770i> {

        /* renamed from: d */
        public final /* synthetic */ C26782u f74509d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26783c(C26782u uVar) {
            super(0);
            this.f74509d = uVar;
        }

        public Object invoke() {
            if (this.f74509d.isEmpty()) {
                return C20770i.C20773b.f58684b;
            }
            List<C26465i0> A = this.f74509d.mo53458A();
            ArrayList arrayList = new ArrayList(C36907w.m41090l(A, 10));
            for (C26465i0 n : A) {
                arrayList.add(n.mo51753n());
            }
            C26782u uVar = this.f74509d;
            List f0 = C110818d0.m150934f0(arrayList, new C26756l0(uVar.f74504f, uVar.f74505g));
            C24526b.C24527a aVar = C24526b.f70088d;
            return aVar.mo51210a("package view scope for " + this.f74509d.f74505g + " in " + this.f74509d.f74504f.getName(), f0);
        }
    }

    static {
        Class<C26782u> cls = C26782u.class;
        f74503n = new C89104m[]{C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "fragments", "getFragments()Ljava/util/List;")), C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "empty", "getEmpty()Z"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26782u(C26729b0 b0Var, C22826c cVar, C24980n nVar) {
        super(C26571h.C26572a.f73937a, cVar.mo35979g());
        C87412m.m108594g(b0Var, "module");
        C87412m.m108594g(cVar, "fqName");
        C87412m.m108594g(nVar, "storageManager");
        int i = C26571h.f73936P0;
        this.f74504f = b0Var;
        this.f74505g = cVar;
        this.f74506h = nVar.mo52006g(new C23596b(this));
        this.f74507i = nVar.mo52006g(new C23595a(this));
        this.f74508j = new C20768h(nVar, new C26783c(this));
    }

    /* renamed from: A */
    public List<C26465i0> mo53458A() {
        return (List) C24979m.m31587a(this.f74506h, this, f74503n[0]);
    }

    /* renamed from: G0 */
    public C26448e0 mo53459G0() {
        return this.f74504f;
    }

    /* renamed from: b */
    public C26469k mo51892b() {
        if (this.f74505g.mo35975d()) {
            return null;
        }
        C26729b0 b0Var = this.f74504f;
        C22826c e = this.f74505g.mo35976e();
        C87412m.m108593f(e, "fqName.parent()");
        return b0Var.mo52620b0(e);
    }

    /* renamed from: d */
    public C22826c mo53460d() {
        return this.f74505g;
    }

    public boolean equals(Object obj) {
        C26484n0 n0Var = obj instanceof C26484n0 ? (C26484n0) obj : null;
        return n0Var != null && C87412m.m108589b(this.f74505g, n0Var.mo53460d()) && C87412m.m108589b(this.f74504f, n0Var.mo53459G0());
    }

    /* renamed from: h0 */
    public <R, D> R mo52621h0(C26482m<R, D> mVar, D d) {
        C87412m.m108594g(mVar, "visitor");
        return mVar.mo53448b(this, d);
    }

    public int hashCode() {
        return (this.f74504f.hashCode() * 31) + this.f74505g.hashCode();
    }

    public boolean isEmpty() {
        return ((Boolean) C24979m.m31587a(this.f74507i, this, f74503n[1])).booleanValue();
    }

    /* renamed from: n */
    public C20770i mo53462n() {
        return this.f74508j;
    }
}
