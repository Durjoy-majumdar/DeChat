package ni3;

/* renamed from: ni3.f */
public final class C88950f {

    /* renamed from: a */
    public final long f256526a;

    /* renamed from: b */
    public final long f256527b;

    public C88950f(long j, long j2) {
        this.f256526a = j;
        this.f256527b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C88950f)) {
            return false;
        }
        C88950f fVar = (C88950f) obj;
        return this.f256526a == fVar.f256526a && this.f256527b == fVar.f256527b;
    }

    public int hashCode() {
        long j = this.f256526a;
        long j2 = this.f256527b;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Range(offset=" + this.f256526a + ", length=" + this.f256527b + ')';
    }
}
