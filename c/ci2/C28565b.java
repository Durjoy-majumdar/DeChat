package ci2;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: ci2.b */
public final class C28565b {

    /* renamed from: a */
    public String f78428a;

    /* renamed from: b */
    public long f78429b;

    public C28565b() {
        this((String) null, 0, 3, (C8480h) null);
    }

    public C28565b(String str, long j, int i, C8480h hVar) {
        str = (i & 1) != 0 ? "" : str;
        j = (i & 2) != 0 ? 0 : j;
        C87412m.m108594g(str, "path");
        this.f78428a = str;
        this.f78429b = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28565b)) {
            return false;
        }
        C28565b bVar = (C28565b) obj;
        return C87412m.m108589b(this.f78428a, bVar.f78428a) && this.f78429b == bVar.f78429b;
    }

    public int hashCode() {
        long j = this.f78429b;
        return (this.f78428a.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "TTSInfo(path=" + this.f78428a + ", durationMs=" + this.f78429b + ')';
    }
}
