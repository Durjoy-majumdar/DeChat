package p190l1;

/* renamed from: l1.r */
public final class C109110r {

    /* renamed from: a */
    public final long f326716a;

    public /* synthetic */ C109110r(long j) {
        this.f326716a = j;
    }

    /* renamed from: a */
    public static final boolean m148153a(long j, long j2) {
        return j == j2;
    }

    /* renamed from: b */
    public static String m148154b(long j) {
        return "PointerId(value=" + j + ')';
    }

    public boolean equals(Object obj) {
        return (obj instanceof C109110r) && this.f326716a == ((C109110r) obj).f326716a;
    }

    public int hashCode() {
        long j = this.f326716a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return m148154b(this.f326716a);
    }
}
