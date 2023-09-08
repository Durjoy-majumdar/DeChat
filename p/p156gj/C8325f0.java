package p156gj;

/* renamed from: gj.f0 */
public final class C8325f0 {

    /* renamed from: a */
    public final int f27283a;

    /* renamed from: b */
    public final int f27284b;

    public C8325f0(int i, int i2) {
        this.f27283a = i;
        this.f27284b = i2;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8325f0)) {
            return false;
        }
        C8325f0 f0Var = (C8325f0) obj;
        return this.f27283a == f0Var.f27283a && this.f27284b == f0Var.f27284b;
    }

    public int hashCode() {
        int i = this.f27284b;
        int i2 = this.f27283a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        return this.f27283a + "x" + this.f27284b;
    }
}
