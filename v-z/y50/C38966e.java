package y50;

/* renamed from: y50.e */
public final class C38966e {

    /* renamed from: a */
    public final long f104982a;

    public C38966e(long j) {
        this.f104982a = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38966e) && this.f104982a == ((C38966e) obj).f104982a;
    }

    public int hashCode() {
        long j = this.f104982a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return "CloseLiveInfo(liveId=" + this.f104982a + ')';
    }
}
