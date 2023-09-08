package hb2;

/* renamed from: hb2.r */
public final class C59835r {

    /* renamed from: a */
    public long f170836a;

    /* renamed from: b */
    public long f170837b;

    /* renamed from: c */
    public long f170838c;

    public C59835r() {
        this(0, 0, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59835r)) {
            return false;
        }
        C59835r rVar = (C59835r) obj;
        return this.f170836a == rVar.f170836a && this.f170837b == rVar.f170837b && this.f170838c == rVar.f170838c;
    }

    public int hashCode() {
        long j = this.f170836a;
        long j2 = this.f170837b;
        long j3 = this.f170838c;
        return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "OnlineUserObj(pcu=" + this.f170836a + ", fcu=" + this.f170837b + ", mcu=" + this.f170838c + ')';
    }

    public C59835r(long j, long j2, long j3) {
        this.f170836a = j;
        this.f170837b = j2;
        this.f170838c = j3;
    }
}
