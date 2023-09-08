package iz3;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import iz3.C24656l;
import java.util.Collection;
import java.util.List;
import jz3.C24821j;
import m04.C24957a;
import m04.C24959e;
import mz3.C25068t;
import rx3.C13599c;
import sx3.C64186f0;
import sx3.C64197v;
import vz3.C22826c;
import w04.C26412a;
import wy3.C22941m0;
import wy3.C26465i0;

/* renamed from: iz3.g */
public final class C24649g implements C22941m0 {

    /* renamed from: a */
    public final C24651h f70286a;

    /* renamed from: b */
    public final C24957a<C22826c, C24821j> f70287b;

    /* renamed from: iz3.g$a */
    public static final class C24650a extends C87413o implements C32224a<C24821j> {

        /* renamed from: d */
        public final /* synthetic */ C24649g f70288d;

        /* renamed from: e */
        public final /* synthetic */ C25068t f70289e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24650a(C24649g gVar, C25068t tVar) {
            super(0);
            this.f70288d = gVar;
            this.f70289e = tVar;
        }

        public Object invoke() {
            return new C24821j(this.f70288d.f70286a, this.f70289e);
        }
    }

    public C24649g(C24643c cVar) {
        C87412m.m108594g(cVar, "components");
        C24651h hVar = new C24651h(cVar, C24656l.C24657a.f70302a, new C13599c(null));
        this.f70286a = hVar;
        this.f70287b = hVar.f70290a.f70256a.mo52002c();
    }

    /* renamed from: a */
    public List<C24821j> mo36112a(C22826c cVar) {
        C87412m.m108594g(cVar, "fqName");
        return C64197v.m75538g(mo51480d(cVar));
    }

    /* renamed from: b */
    public boolean mo36114b(C22826c cVar) {
        C87412m.m108594g(cVar, "fqName");
        return this.f70286a.f70290a.f70257b.mo37220a(cVar, true) == null;
    }

    /* renamed from: c */
    public void mo36115c(C22826c cVar, Collection<C26465i0> collection) {
        C87412m.m108594g(cVar, "fqName");
        C87412m.m108594g(collection, "packageFragments");
        C26412a.m34008a(collection, mo51480d(cVar));
    }

    /* renamed from: d */
    public final C24821j mo51480d(C22826c cVar) {
        C25068t a = this.f70286a.f70290a.f70257b.mo37220a(cVar, true);
        if (a == null) {
            return null;
        }
        return (C24821j) ((C24959e.C24963d) this.f70287b).mo52012c(cVar, new C24650a(this, a));
    }

    /* renamed from: r */
    public Collection mo36113r(C22826c cVar, C32226l lVar) {
        C87412m.m108594g(cVar, "fqName");
        C87412m.m108594g(lVar, "nameFilter");
        C24821j d = mo51480d(cVar);
        List list = d != null ? (List) d.f70777q.invoke() : null;
        return list == null ? C64186f0.f181907d : list;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f70286a.f70290a.f70270o;
    }
}
