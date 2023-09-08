package zy3;

import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import m04.C24959e;
import m04.C24975g;
import m04.C24980n;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C36903g0;
import ty3.C26336h;
import vz3.C22826c;
import vz3.C22830f;
import wy3.C22936j0;
import wy3.C26435a0;
import wy3.C26445d0;
import wy3.C26448e0;
import wy3.C26469k;
import wy3.C26482m;
import wy3.C26484n0;
import wy3.C26523z;
import wy3.C38411y;
import wz3.C26526a;
import xy3.C26571h;
import zy3.C26735e0;

/* renamed from: zy3.b0 */
public final class C26729b0 extends C23594m implements C26448e0 {

    /* renamed from: f */
    public final C24980n f74311f;

    /* renamed from: g */
    public final C26336h f74312g;

    /* renamed from: h */
    public final Map<C26445d0<?>, Object> f74313h;

    /* renamed from: i */
    public final C26735e0 f74314i;

    /* renamed from: j */
    public C23597x f74315j;

    /* renamed from: n */
    public C22936j0 f74316n;

    /* renamed from: o */
    public boolean f74317o;

    /* renamed from: p */
    public final C24975g<C22826c, C26484n0> f74318p;

    /* renamed from: q */
    public final C13601g f74319q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26729b0(C22830f fVar, C24980n nVar, C26336h hVar, C26526a aVar, Map<C26445d0<?>, Object> map, C22830f fVar2, int i, C8480h hVar2) {
        super(C26571h.C26572a.f73937a, fVar);
        map = (i & 16) != 0 ? C36903g0.f97931d : map;
        C87412m.m108594g(fVar, "moduleName");
        C87412m.m108594g(nVar, "storageManager");
        C87412m.m108594g(hVar, "builtIns");
        C87412m.m108594g(map, "capabilities");
        int i2 = C26571h.f73936P0;
        this.f74311f = nVar;
        this.f74312g = hVar;
        if (fVar.f65638e) {
            this.f74313h = map;
            C26735e0.f74331a.getClass();
            C26735e0 e0Var = (C26735e0) mo52619J(C26735e0.C26736a.f74333b);
            this.f74314i = e0Var == null ? C26735e0.C26737b.f74334b : e0Var;
            this.f74317o = true;
            this.f74318p = nVar.mo52007h(new C26724a0(this));
            this.f74319q = C36568h.m40985a(new C23599z(this));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + fVar);
    }

    /* renamed from: B */
    public List<C26448e0> mo52618B() {
        C23597x xVar = this.f74315j;
        if (xVar != null) {
            return xVar.mo37075a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Dependencies of module ");
        String str = getName().f65637d;
        C87412m.m108593f(str, "name.toString()");
        sb.append(str);
        sb.append(" were not set");
        throw new AssertionError(sb.toString());
    }

    /* renamed from: J */
    public <T> T mo52619J(C26445d0<T> d0Var) {
        C87412m.m108594g(d0Var, "capability");
        T t = this.f74313h.get(d0Var);
        if (t == null) {
            return null;
        }
        return t;
    }

    /* renamed from: U */
    public void mo53716U() {
        C13598b0 b0Var;
        if (!this.f74317o) {
            C26445d0<C26435a0> d0Var = C26523z.f73809a;
            C26435a0 a0Var = (C26435a0) mo52619J(C26523z.f73809a);
            if (a0Var != null) {
                a0Var.mo53419a(this);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                throw new C38411y("Accessing invalid module descriptor " + this);
            }
        }
    }

    /* renamed from: b */
    public C26469k mo51892b() {
        return null;
    }

    /* renamed from: b0 */
    public C26484n0 mo52620b0(C22826c cVar) {
        C87412m.m108594g(cVar, "fqName");
        mo53716U();
        return (C26484n0) ((C24959e.C24972m) this.f74318p).invoke(cVar);
    }

    /* renamed from: h0 */
    public <R, D> R mo52621h0(C26482m<R, D> mVar, D d) {
        C87412m.m108594g(mVar, "visitor");
        return mVar.mo53451e(this, d);
    }

    /* renamed from: k0 */
    public boolean mo52622k0(C26448e0 e0Var) {
        C87412m.m108594g(e0Var, "targetModule");
        if (C87412m.m108589b(this, e0Var)) {
            return true;
        }
        C23597x xVar = this.f74315j;
        C87412m.m108591d(xVar);
        return C110818d0.m150903D(xVar.mo37077c(), e0Var) || mo52618B().contains(e0Var) || e0Var.mo52618B().contains(this);
    }

    /* renamed from: m */
    public C26336h mo52623m() {
        return this.f74312g;
    }

    /* renamed from: r */
    public Collection<C22826c> mo52624r(C22826c cVar, C32226l<? super C22830f, Boolean> lVar) {
        C87412m.m108594g(cVar, "fqName");
        C87412m.m108594g(lVar, "nameFilter");
        mo53716U();
        mo53716U();
        return ((C23593l) ((C36570n) this.f74319q).getValue()).mo36113r(cVar, lVar);
    }
}
