package p284zb;

/* renamed from: zb.t */
public final class C16132t {

    /* renamed from: a */
    public final boolean f43322a;

    public C16132t() {
        this(false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16132t) && this.f43322a == ((C16132t) obj).f43322a;
    }

    public int hashCode() {
        boolean z = this.f43322a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "ServicePreloadExtraArgs(skipPreloadAdWorker=" + this.f43322a + ')';
    }

    public C16132t(boolean z) {
        this.f43322a = z;
    }
}
