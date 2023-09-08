package nz3;

import gy3.C87412m;
import java.util.Iterator;
import sx3.C64184e0;
import vz3.C22826c;
import xy3.C26566c;
import xy3.C26571h;

/* renamed from: nz3.e */
public final class C25263e implements C26571h {

    /* renamed from: d */
    public final C22826c f71735d;

    public C25263e(C22826c cVar) {
        C87412m.m108594g(cVar, "fqNameToMatch");
        this.f71735d = cVar;
    }

    /* renamed from: b */
    public C26566c mo51476b(C22826c cVar) {
        C87412m.m108594g(cVar, "fqName");
        if (C87412m.m108589b(cVar, this.f71735d)) {
            return C25262d.f71734a;
        }
        return null;
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator<C26566c> iterator() {
        return C64184e0.f181906d;
    }

    /* renamed from: q */
    public boolean mo51479q(C22826c cVar) {
        return C26571h.C26574b.m34371b(this, cVar);
    }
}
