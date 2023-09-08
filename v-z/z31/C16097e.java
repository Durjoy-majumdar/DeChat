package z31;

import gy3.C8480h;
import gy3.C87412m;
import java.util.HashSet;

/* renamed from: z31.e */
public final class C16097e {

    /* renamed from: a */
    public final String f43248a;

    /* renamed from: b */
    public final HashSet<String> f43249b;

    public C16097e(String str, HashSet<String> hashSet, int i, C8480h hVar) {
        hashSet = (i & 2) != 0 ? new HashSet<>() : hashSet;
        C87412m.m108594g(str, "key");
        C87412m.m108594g(hashSet, "set");
        this.f43248a = str;
        this.f43249b = hashSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16097e)) {
            return false;
        }
        C16097e eVar = (C16097e) obj;
        return C87412m.m108589b(this.f43248a, eVar.f43248a) && C87412m.m108589b(this.f43249b, eVar.f43249b);
    }

    public int hashCode() {
        return (this.f43248a.hashCode() * 31) + this.f43249b.hashCode();
    }

    public String toString() {
        return "ReportUniqueInfo(key=" + this.f43248a + ", set=" + this.f43249b + ')';
    }
}
