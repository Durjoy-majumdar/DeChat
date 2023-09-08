package my3;

/* renamed from: my3.m */
public final class C109649m extends C109648k implements C61591g<Long> {

    /* renamed from: g */
    public static final C109649m f328251g = new C109649m(1, 0);

    public C109649m(long j, long j2) {
        super(j, j2, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C109649m) {
            if (!isEmpty() || !((C109649m) obj).isEmpty()) {
                C109649m mVar = (C109649m) obj;
                if (!(this.f328248d == mVar.f328248d && this.f328249e == mVar.f328249e)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public Comparable mo59687f0() {
        return Long.valueOf(this.f328248d);
    }

    /* renamed from: g0 */
    public Comparable mo59688g0() {
        return Long.valueOf(this.f328249e);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.f328248d;
        long j2 = ((long) 31) * (j ^ (j >>> 32));
        long j3 = this.f328249e;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    public boolean isEmpty() {
        return this.f328248d > this.f328249e;
    }

    public String toString() {
        return this.f328248d + ".." + this.f328249e;
    }
}
