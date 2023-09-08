package p451b2;

/* renamed from: b2.p */
public final class C104021p {

    /* renamed from: a */
    public final int f307649a;

    public /* synthetic */ C104021p(int i) {
        this.f307649a = i;
    }

    /* renamed from: a */
    public static String m138753a(int i) {
        boolean z = false;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "All";
        }
        if (i == 2) {
            return "Weight";
        }
        if (i == 3) {
            z = true;
        }
        return z ? "Style" : "Invalid";
    }

    public boolean equals(Object obj) {
        return (obj instanceof C104021p) && this.f307649a == ((C104021p) obj).f307649a;
    }

    public int hashCode() {
        return this.f307649a;
    }

    public String toString() {
        return m138753a(this.f307649a);
    }
}
