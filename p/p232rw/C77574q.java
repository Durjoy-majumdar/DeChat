package p232rw;

import gy3.C87412m;

/* renamed from: rw.q */
public final class C77574q {

    /* renamed from: a */
    public final C77576s f226142a;

    /* renamed from: b */
    public final String f226143b;

    /* renamed from: c */
    public final String f226144c;

    /* renamed from: d */
    public final long f226145d;

    public C77574q(C77576s sVar, String str, String str2, long j) {
        C87412m.m108594g(sVar, "type");
        this.f226142a = sVar;
        this.f226143b = str;
        this.f226144c = str2;
        this.f226145d = j;
    }

    /* renamed from: a */
    public final boolean mo107739a() {
        return this.f226142a == C77576s.Photo;
    }

    /* renamed from: b */
    public final boolean mo107740b() {
        return this.f226142a == C77576s.Video;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77574q)) {
            return false;
        }
        C77574q qVar = (C77574q) obj;
        return this.f226142a == qVar.f226142a && C87412m.m108589b(this.f226143b, qVar.f226143b) && C87412m.m108589b(this.f226144c, qVar.f226144c) && this.f226145d == qVar.f226145d;
    }

    public int hashCode() {
        int hashCode = this.f226142a.hashCode() * 31;
        String str = this.f226143b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f226144c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        long j = this.f226145d;
        return ((hashCode2 + i) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "MediaOptModel(type=" + this.f226142a + ", path=" + this.f226143b + ", thumb=" + this.f226144c + ", durationMs=" + this.f226145d + ')';
    }
}
