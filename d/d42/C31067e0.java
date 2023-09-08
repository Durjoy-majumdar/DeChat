package d42;

import e42.C7594e;
import e42.C86431j;
import gy3.C87412m;
import java.util.Collection;

/* renamed from: d42.e0 */
public final class C31067e0<T extends C7594e> {

    /* renamed from: a */
    public Collection<? extends C86431j<T>> f83320a;

    /* renamed from: b */
    public Collection<String> f83321b;

    public C31067e0(Collection<? extends C86431j<T>> collection, Collection<String> collection2) {
        C87412m.m108594g(collection, "mbJsApiSet");
        C87412m.m108594g(collection2, "appBrandJsApi");
        this.f83320a = collection;
        this.f83321b = collection2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31067e0)) {
            return false;
        }
        C31067e0 e0Var = (C31067e0) obj;
        return C87412m.m108589b(this.f83320a, e0Var.f83320a) && C87412m.m108589b(this.f83321b, e0Var.f83321b);
    }

    public int hashCode() {
        return (this.f83320a.hashCode() * 31) + this.f83321b.hashCode();
    }

    public String toString() {
        return "MagicBushJsApiGroup(mbJsApiSet=" + this.f83320a + ", appBrandJsApi=" + this.f83321b + ')';
    }
}
