package p522fo;

import e42.C86431j;
import gy3.C87412m;
import java.util.Collection;
import p150eo.C86596j;

/* renamed from: fo.b */
public final class C32140b<T extends C86596j> {

    /* renamed from: a */
    public final Collection<C86431j<T>> f85453a;

    /* renamed from: b */
    public final Collection<String> f85454b;

    public C32140b(Collection<? extends C86431j<T>> collection, Collection<String> collection2) {
        C87412m.m108594g(collection, "mbJsApiSet");
        C87412m.m108594g(collection2, "appBrandJsApi");
        this.f85453a = collection;
        this.f85454b = collection2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32140b)) {
            return false;
        }
        C32140b bVar = (C32140b) obj;
        return C87412m.m108589b(this.f85453a, bVar.f85453a) && C87412m.m108589b(this.f85454b, bVar.f85454b);
    }

    public int hashCode() {
        return (this.f85453a.hashCode() * 31) + this.f85454b.hashCode();
    }

    public String toString() {
        return "MagicBrandServiceJsApiGroup(mbJsApiSet=" + this.f85453a + ", appBrandJsApi=" + this.f85454b + ')';
    }
}
