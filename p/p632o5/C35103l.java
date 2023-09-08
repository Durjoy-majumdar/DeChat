package p632o5;

import gy3.C87412m;
import hy3.C33145a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import rx3.C13604l;
import sx3.C36903g0;
import sx3.C90364q0;

/* renamed from: o5.l */
public final class C35103l implements Iterable<C13604l<? extends String, ? extends C35105b>>, C33145a {

    /* renamed from: e */
    public static final C35103l f94179e = new C35103l();

    /* renamed from: d */
    public final Map<String, C35105b> f94180d;

    /* renamed from: o5.l$a */
    public static final class C35104a {

        /* renamed from: a */
        public final Map<String, C35105b> f94181a;

        public C35104a(C35103l lVar) {
            C87412m.m108594g(lVar, "parameters");
            this.f94181a = C90364q0.m113155n(lVar.f94180d);
        }
    }

    /* renamed from: o5.l$b */
    public static final class C35105b {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35105b)) {
                return false;
            }
            ((C35105b) obj).getClass();
            return C87412m.m108589b((Object) null, (Object) null) && C87412m.m108589b((Object) null, (Object) null);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Entry(value=null, cacheKey=null)";
        }
    }

    public C35103l(Map<String, C35105b> map) {
        this.f94180d = map;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C35103l) && C87412m.m108589b(this.f94180d, ((C35103l) obj).f94180d));
    }

    /* renamed from: f */
    public final Map<String, String> mo59859f() {
        if (this.f94180d.isEmpty()) {
            return C36903g0.f97931d;
        }
        Map<String, C35105b> map = this.f94180d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C35105b> value : map.entrySet()) {
            ((C35105b) value.getValue()).getClass();
        }
        return linkedHashMap;
    }

    public int hashCode() {
        return this.f94180d.hashCode();
    }

    public Iterator<C13604l<String, C35105b>> iterator() {
        Map<String, C35105b> map = this.f94180d;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(new C13604l((String) next.getKey(), (C35105b) next.getValue()));
        }
        return arrayList.iterator();
    }

    public String toString() {
        return "Parameters(map=" + this.f94180d + ')';
    }

    public C35103l() {
        this(C36903g0.f97931d);
    }
}
