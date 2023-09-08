package er1;

/* renamed from: er1.k5 */
public final class C58743k5 {

    /* renamed from: a */
    public final long f168200a;

    /* renamed from: b */
    public int f168201b;

    /* renamed from: c */
    public int f168202c;

    public C58743k5(long j, int i, int i2) {
        this.f168200a = j;
        this.f168201b = i;
        this.f168202c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58743k5)) {
            return false;
        }
        C58743k5 k5Var = (C58743k5) obj;
        return this.f168200a == k5Var.f168200a && this.f168201b == k5Var.f168201b && this.f168202c == k5Var.f168202c;
    }

    public int hashCode() {
        long j = this.f168200a;
        return (((((int) (j ^ (j >>> 32))) * 31) + this.f168201b) * 31) + this.f168202c;
    }

    public String toString() {
        return "PlayTimeCostRecord(clickTime=" + this.f168200a + ", clickToPlayTimeCost=" + this.f168201b + ", selectToPlayTimeCost=" + this.f168202c + ')';
    }
}
