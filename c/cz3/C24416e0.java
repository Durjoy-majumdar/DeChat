package cz3;

import fy3.C32226l;
import gy3.C87412m;
import java.util.Collection;
import mz3.C25048a;
import mz3.C25055g;
import mz3.C25068t;
import sx3.C64186f0;
import vz3.C22826c;
import vz3.C22830f;

/* renamed from: cz3.e0 */
public final class C24416e0 extends C24439x implements C25068t {

    /* renamed from: a */
    public final C22826c f69864a;

    public C24416e0(C22826c cVar) {
        C87412m.m108594g(cVar, "fqName");
        this.f69864a = cVar;
    }

    /* renamed from: B */
    public boolean mo51018B() {
        return false;
    }

    /* renamed from: b */
    public C25048a mo51023b(C22826c cVar) {
        C87412m.m108594g(cVar, "fqName");
        return null;
    }

    /* renamed from: d */
    public C22826c mo51048d() {
        return this.f69864a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C24416e0) && C87412m.m108589b(this.f69864a, ((C24416e0) obj).f69864a);
    }

    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return C64186f0.f181907d;
    }

    public int hashCode() {
        return this.f69864a.hashCode();
    }

    /* renamed from: k */
    public Collection<C25068t> mo51051k() {
        return C64186f0.f181907d;
    }

    /* renamed from: n */
    public Collection<C25055g> mo51052n(C32226l<? super C22830f, Boolean> lVar) {
        C87412m.m108594g(lVar, "nameFilter");
        return C64186f0.f181907d;
    }

    public String toString() {
        return C24416e0.class.getName() + ": " + this.f69864a;
    }
}
