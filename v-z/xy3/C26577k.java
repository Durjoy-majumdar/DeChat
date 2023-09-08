package xy3;

import b04.C23649g;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import n04.C25143j0;
import n04.C25176s0;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import ty3.C26336h;
import vz3.C22826c;
import vz3.C22830f;
import wy3.C26521y0;

/* renamed from: xy3.k */
public final class C26577k implements C26566c {

    /* renamed from: a */
    public final C26336h f73939a;

    /* renamed from: b */
    public final C22826c f73940b;

    /* renamed from: c */
    public final Map<C22830f, C23649g<?>> f73941c;

    /* renamed from: d */
    public final C13601g f73942d = C36568h.m40986b(C13602i.PUBLICATION, new C26578a(this));

    /* renamed from: xy3.k$a */
    public static final class C26578a extends C87413o implements C32224a<C25176s0> {

        /* renamed from: d */
        public final /* synthetic */ C26577k f73943d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26578a(C26577k kVar) {
            super(0);
            this.f73943d = kVar;
        }

        public Object invoke() {
            C26577k kVar = this.f73943d;
            return kVar.f73939a.mo53318j(kVar.f73940b).mo36111s();
        }
    }

    public C26577k(C26336h hVar, C22826c cVar, Map<C22830f, ? extends C23649g<?>> map) {
        C87412m.m108594g(hVar, "builtIns");
        C87412m.m108594g(cVar, "fqName");
        C87412m.m108594g(map, "allValueArguments");
        this.f73939a = hVar;
        this.f73940b = cVar;
        this.f73941c = map;
    }

    /* renamed from: a */
    public Map<C22830f, C23649g<?>> mo51296a() {
        return this.f73941c;
    }

    /* renamed from: d */
    public C22826c mo51298d() {
        return this.f73940b;
    }

    public C26521y0 getSource() {
        return C26521y0.f73808a;
    }

    public C25143j0 getType() {
        Object value = this.f73942d.getValue();
        C87412m.m108593f(value, "<get-type>(...)");
        return (C25143j0) value;
    }
}
