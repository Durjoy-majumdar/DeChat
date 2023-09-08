package p436a1;

/* renamed from: a1.l0 */
public final class C103246l0 {

    /* renamed from: a */
    public final int f304454a;

    public /* synthetic */ C103246l0(int i) {
        this.f304454a = i;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C103246l0) && this.f304454a == ((C103246l0) obj).f304454a;
    }

    public int hashCode() {
        return this.f304454a;
    }

    public String toString() {
        int i = this.f304454a;
        boolean z = false;
        if (i == 0) {
            return "NonZero";
        }
        if (i == 1) {
            z = true;
        }
        return z ? "EvenOdd" : "Unknown";
    }
}
