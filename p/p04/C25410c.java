package p04;

import fy3.C32226l;
import gy3.C87412m;
import java.util.Collection;
import java.util.List;
import sx3.C64186f0;
import ty3.C26333e;
import ty3.C26336h;
import vz3.C22826c;
import vz3.C22830f;
import wy3.C26445d0;
import wy3.C26448e0;
import wy3.C26469k;
import wy3.C26482m;
import wy3.C26484n0;
import xy3.C26571h;

/* renamed from: p04.c */
public final class C25410c implements C26448e0 {

    /* renamed from: d */
    public static final C25410c f71944d = new C25410c();

    /* renamed from: e */
    public static final C22830f f71945e = C22830f.m26796h("<Error module>");

    /* renamed from: f */
    public static final List<C26448e0> f71946f = C64186f0.f181907d;

    /* renamed from: g */
    public static final C26336h f71947g = C26333e.f73353f;

    static {
        C26333e eVar = C26333e.f73353f;
    }

    /* renamed from: B */
    public List<C26448e0> mo52618B() {
        return f71946f;
    }

    /* renamed from: J */
    public <T> T mo52619J(C26445d0<T> d0Var) {
        C87412m.m108594g(d0Var, "capability");
        return null;
    }

    /* renamed from: a */
    public C26469k mo36109a() {
        return this;
    }

    /* renamed from: b */
    public C26469k mo51892b() {
        return null;
    }

    /* renamed from: b0 */
    public C26484n0 mo52620b0(C22826c cVar) {
        C87412m.m108594g(cVar, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    public C26571h getAnnotations() {
        int i = C26571h.f73936P0;
        return C26571h.C26572a.f73937a;
    }

    public C22830f getName() {
        return f71945e;
    }

    /* renamed from: h0 */
    public <R, D> R mo52621h0(C26482m<R, D> mVar, D d) {
        C87412m.m108594g(mVar, "visitor");
        return null;
    }

    /* renamed from: k0 */
    public boolean mo52622k0(C26448e0 e0Var) {
        C87412m.m108594g(e0Var, "targetModule");
        return false;
    }

    /* renamed from: m */
    public C26336h mo52623m() {
        return f71947g;
    }

    /* renamed from: r */
    public Collection<C22826c> mo52624r(C22826c cVar, C32226l<? super C22830f, Boolean> lVar) {
        C87412m.m108594g(cVar, "fqName");
        C87412m.m108594g(lVar, "nameFilter");
        return C64186f0.f181907d;
    }
}
