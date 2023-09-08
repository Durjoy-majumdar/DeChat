package ci2;

import gy3.C87412m;

/* renamed from: ci2.a */
public final class C28564a {

    /* renamed from: a */
    public String f78424a;

    /* renamed from: b */
    public long f78425b;

    /* renamed from: c */
    public long f78426c;

    /* renamed from: d */
    public float f78427d;

    public C28564a(String str, long j, long j2, float f) {
        C87412m.m108594g(str, "path");
        this.f78424a = str;
        this.f78425b = j;
        this.f78426c = j2;
        this.f78427d = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28564a)) {
            return false;
        }
        C28564a aVar = (C28564a) obj;
        return C87412m.m108589b(this.f78424a, aVar.f78424a) && this.f78425b == aVar.f78425b && this.f78426c == aVar.f78426c && C87412m.m108589b(Float.valueOf(this.f78427d), Float.valueOf(aVar.f78427d));
    }

    public int hashCode() {
        long j = this.f78425b;
        long j2 = this.f78426c;
        return (((((this.f78424a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Float.floatToIntBits(this.f78427d);
    }

    public String toString() {
        return "EditRenderScript(path=" + this.f78424a + ", startMs=" + this.f78425b + ", endMS=" + this.f78426c + ", playRate=" + this.f78427d + ')';
    }
}
