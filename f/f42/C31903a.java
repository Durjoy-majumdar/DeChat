package f42;

import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;

/* renamed from: f42.a */
public final class C31903a {

    /* renamed from: c */
    public static final C31903a f84987c = new C31903a(new HashMap(), new HashMap());

    /* renamed from: a */
    public final Map<String, C7981b> f84988a;

    /* renamed from: b */
    public final Map<String, C7981b> f84989b;

    public C31903a(Map<String, C7981b> map, Map<String, C7981b> map2) {
        C87412m.m108594g(map, "plugins");
        C87412m.m108594g(map2, "publicServices");
        this.f84988a = map;
        this.f84989b = map2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31903a)) {
            return false;
        }
        C31903a aVar = (C31903a) obj;
        return C87412m.m108589b(this.f84988a, aVar.f84988a) && C87412m.m108589b(this.f84989b, aVar.f84989b);
    }

    public int hashCode() {
        return (this.f84988a.hashCode() * 31) + this.f84989b.hashCode();
    }

    public String toString() {
        return "MBBizConfigInfo(plugins=" + this.f84988a + ", publicServices=" + this.f84989b + ')';
    }
}
