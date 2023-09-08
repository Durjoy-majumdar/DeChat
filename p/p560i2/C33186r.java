package p560i2;

/* renamed from: i2.r */
public final class C33186r {

    /* renamed from: a */
    public final long f90064a;

    public /* synthetic */ C33186r(long j) {
        this.f90064a = j;
    }

    /* renamed from: a */
    public static final boolean m39977a(long j, long j2) {
        return j == j2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C33186r) && this.f90064a == ((C33186r) obj).f90064a;
    }

    public int hashCode() {
        long j = this.f90064a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        long j = this.f90064a;
        return m39977a(j, 0) ? "Unspecified" : m39977a(j, 4294967296L) ? "Sp" : m39977a(j, 8589934592L) ? "Em" : "Invalid";
    }
}
