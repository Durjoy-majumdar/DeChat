package ak1;

/* renamed from: ak1.z */
public final class C54118z {

    /* renamed from: a */
    public long f151964a;

    /* renamed from: b */
    public boolean f151965b;

    public C54118z() {
        this(0, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54118z)) {
            return false;
        }
        C54118z zVar = (C54118z) obj;
        return this.f151964a == zVar.f151964a && this.f151965b == zVar.f151965b;
    }

    public int hashCode() {
        long j = this.f151964a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        boolean z = this.f151965b;
        if (z) {
            z = true;
        }
        return i + (z ? 1 : 0);
    }

    public String toString() {
        return "HellPair(time=" + this.f151964a + ", state=" + this.f151965b + ')';
    }

    public C54118z(long j, boolean z) {
        this.f151964a = j;
        this.f151965b = z;
    }
}
