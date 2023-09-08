package c13;

import gy3.C87412m;

/* renamed from: c13.f */
public final class C28475f {

    /* renamed from: a */
    public final String f78271a;

    /* renamed from: b */
    public final long f78272b;

    /* renamed from: c */
    public long f78273c;

    /* renamed from: d */
    public final boolean f78274d;

    public C28475f(String str, long j, long j2, boolean z) {
        C87412m.m108594g(str, "mediaId");
        this.f78271a = str;
        this.f78272b = j;
        this.f78273c = j2;
        this.f78274d = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28475f)) {
            return false;
        }
        C28475f fVar = (C28475f) obj;
        return C87412m.m108589b(this.f78271a, fVar.f78271a) && this.f78272b == fVar.f78272b && this.f78273c == fVar.f78273c && this.f78274d == fVar.f78274d;
    }

    public int hashCode() {
        long j = this.f78272b;
        long j2 = this.f78273c;
        int hashCode = ((((this.f78271a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z = this.f78274d;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "FileInfo(mediaId=" + this.f78271a + ", totalLen=" + this.f78272b + ", finishedLen=" + this.f78273c + ", isUpload=" + this.f78274d + ')';
    }
}
