package j04;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import k04.C24857c;
import m04.C21479h;
import m04.C24959e;
import m04.C24980n;
import sx3.C64187h0;
import sx3.C64197v;
import vy3.C26406r;
import vz3.C22826c;
import vz3.C22830f;
import w04.C26412a;
import wy3.C22941m0;
import wy3.C26448e0;
import wy3.C26465i0;

/* renamed from: j04.a */
public abstract class C24730a implements C22941m0 {

    /* renamed from: a */
    public final C24980n f70561a;

    /* renamed from: b */
    public final C24776u f70562b;

    /* renamed from: c */
    public final C26448e0 f70563c;

    /* renamed from: d */
    public C24763k f70564d;

    /* renamed from: e */
    public final C21479h<C22826c, C26465i0> f70565e;

    /* renamed from: j04.a$a */
    public static final class C24731a extends C87413o implements C32226l<C22826c, C26465i0> {

        /* renamed from: d */
        public final /* synthetic */ C24730a f70566d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24731a(C24730a aVar) {
            super(1);
            this.f70566d = aVar;
        }

        public Object invoke(Object obj) {
            C22826c cVar = (C22826c) obj;
            C87412m.m108594g(cVar, "fqName");
            C26406r rVar = (C26406r) this.f70566d;
            rVar.getClass();
            InputStream c = rVar.f70562b.mo37234c(cVar);
            C24857c a = c != null ? C24857c.f70843s.mo51861a(cVar, rVar.f70561a, rVar.f70563c, c, false) : null;
            if (a == null) {
                return null;
            }
            C24763k kVar = this.f70566d.f70564d;
            if (kVar != null) {
                a.mo51752J0(kVar);
                return a;
            }
            C87412m.m108603p("components");
            throw null;
        }
    }

    public C24730a(C24980n nVar, C24776u uVar, C26448e0 e0Var) {
        C87412m.m108594g(nVar, "storageManager");
        C87412m.m108594g(uVar, "finder");
        C87412m.m108594g(e0Var, "moduleDescriptor");
        this.f70561a = nVar;
        this.f70562b = uVar;
        this.f70563c = e0Var;
        this.f70565e = nVar.mo52004e(new C24731a(this));
    }

    /* renamed from: a */
    public List<C26465i0> mo36112a(C22826c cVar) {
        C87412m.m108594g(cVar, "fqName");
        return C64197v.m75538g(this.f70565e.invoke(cVar));
    }

    /* renamed from: b */
    public boolean mo36114b(C22826c cVar) {
        Object obj;
        C87412m.m108594g(cVar, "fqName");
        Object obj2 = ((C24959e.C24971l) this.f70565e).f71130e.get(cVar);
        if ((obj2 == null || obj2 == C24959e.C24973n.COMPUTING) ? false : true) {
            obj = this.f70565e.invoke(cVar);
        } else {
            C26406r rVar = (C26406r) this;
            InputStream c = rVar.f70562b.mo37234c(cVar);
            obj = c != null ? C24857c.f70843s.mo51861a(cVar, rVar.f70561a, rVar.f70563c, c, false) : null;
        }
        return obj == null;
    }

    /* renamed from: c */
    public void mo36115c(C22826c cVar, Collection<C26465i0> collection) {
        C87412m.m108594g(cVar, "fqName");
        C87412m.m108594g(collection, "packageFragments");
        C26412a.m34008a(collection, this.f70565e.invoke(cVar));
    }

    /* renamed from: r */
    public Collection<C22826c> mo36113r(C22826c cVar, C32226l<? super C22830f, Boolean> lVar) {
        C87412m.m108594g(cVar, "fqName");
        C87412m.m108594g(lVar, "nameFilter");
        return C64187h0.f181908d;
    }
}
