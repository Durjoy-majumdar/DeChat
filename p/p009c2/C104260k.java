package p009c2;

/* renamed from: c2.k */
public final class C104260k {

    /* renamed from: a */
    public final int f308592a;

    public /* synthetic */ C104260k(int i) {
        this.f308592a = i;
    }

    /* renamed from: a */
    public static String m139149a(int i) {
        boolean z = false;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Default";
        }
        if (i == 2) {
            return "Go";
        }
        if (i == 3) {
            return "Search";
        }
        if (i == 4) {
            return "Send";
        }
        if (i == 5) {
            return "Previous";
        }
        if (i == 6) {
            return "Next";
        }
        if (i == 7) {
            z = true;
        }
        return z ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return (obj instanceof C104260k) && this.f308592a == ((C104260k) obj).f308592a;
    }

    public int hashCode() {
        return this.f308592a;
    }

    public String toString() {
        return m139149a(this.f308592a);
    }
}
