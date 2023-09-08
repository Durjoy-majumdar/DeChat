package y50;

/* renamed from: y50.d */
public final class C38965d {

    /* renamed from: a */
    public final long f104980a;

    /* renamed from: b */
    public final boolean f104981b;

    public C38965d(long j, boolean z) {
        this.f104980a = j;
        this.f104981b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38965d)) {
            return false;
        }
        C38965d dVar = (C38965d) obj;
        return this.f104980a == dVar.f104980a && this.f104981b == dVar.f104981b;
    }

    public int hashCode() {
        long j = this.f104980a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        boolean z = this.f104981b;
        if (z) {
            z = true;
        }
        return i + (z ? 1 : 0);
    }

    public String toString() {
        return "CloseApplyLiveMicInfo(liveId=" + this.f104980a + ", enable=" + this.f104981b + ')';
    }
}
