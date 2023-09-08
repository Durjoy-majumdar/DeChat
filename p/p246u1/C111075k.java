package p246u1;

import androidx.compose.p002ui.platform.C54173h1;
import gy3.C87412m;
import hy3.C33145a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: u1.k */
public final class C111075k implements C111064a0, Iterable<Map.Entry<? extends C111096z<?>, ? extends Object>>, C33145a {

    /* renamed from: d */
    public final Map<C111096z<?>, Object> f332624d = new LinkedHashMap();

    /* renamed from: e */
    public boolean f332625e;

    /* renamed from: f */
    public boolean f332626f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C111075k)) {
            return false;
        }
        C111075k kVar = (C111075k) obj;
        return C87412m.m108589b(this.f332624d, kVar.f332624d) && this.f332625e == kVar.f332625e && this.f332626f == kVar.f332626f;
    }

    /* renamed from: f */
    public <T> void mo162814f(C111096z<T> zVar, T t) {
        C87412m.m108594g(zVar, "key");
        this.f332624d.put(zVar, t);
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = ((this.f332624d.hashCode() * 31) + (this.f332625e ? 1231 : 1237)) * 31;
        if (!this.f332626f) {
            i = 1237;
        }
        return hashCode + i;
    }

    /* renamed from: i */
    public final <T> boolean mo162823i(C111096z<T> zVar) {
        C87412m.m108594g(zVar, "key");
        return this.f332624d.containsKey(zVar);
    }

    public Iterator<Map.Entry<C111096z<?>, Object>> iterator() {
        return ((LinkedHashMap) this.f332624d).entrySet().iterator();
    }

    /* renamed from: k */
    public final <T> T mo162825k(C111096z<T> zVar) {
        C87412m.m108594g(zVar, "key");
        T t = ((LinkedHashMap) this.f332624d).get(zVar);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Key not present: " + zVar + " - consider getOrElse or getOrNull");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (this.f332625e) {
            sb.append(str);
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.f332626f) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : ((LinkedHashMap) this.f332624d).entrySet()) {
            Object value = entry.getValue();
            sb.append(str);
            sb.append(((C111096z) entry.getKey()).f332684a);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return C54173h1.m60886a(this, (String) null) + "{ " + sb + " }";
    }
}
