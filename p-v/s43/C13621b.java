package s43;

/* renamed from: s43.b */
public final class C13621b {

    /* renamed from: a */
    public final long f38589a;

    public C13621b(long j) {
        this.f38589a = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13621b) && this.f38589a == ((C13621b) obj).f38589a;
    }

    public int hashCode() {
        long j = this.f38589a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return "ConsumeSuccessResult(balance=" + this.f38589a + ')';
    }
}
