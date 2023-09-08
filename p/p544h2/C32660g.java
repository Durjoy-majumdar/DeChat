package p544h2;

/* renamed from: h2.g */
public final class C32660g {

    /* renamed from: a */
    public final int f86671a;

    public /* synthetic */ C32660g(int i) {
        this.f86671a = i;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C32660g) && this.f86671a == ((C32660g) obj).f86671a;
    }

    public int hashCode() {
        return this.f86671a;
    }

    public String toString() {
        int i = this.f86671a;
        boolean z = false;
        if (i == 1) {
            return "Ltr";
        }
        if (i == 2) {
            return "Rtl";
        }
        if (i == 3) {
            return "Content";
        }
        if (i == 4) {
            return "ContentOrLtr";
        }
        if (i == 5) {
            z = true;
        }
        return z ? "ContentOrRtl" : "Invalid";
    }
}
