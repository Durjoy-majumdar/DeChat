package p544h2;

/* renamed from: h2.e */
public final class C32659e {

    /* renamed from: a */
    public final int f86670a;

    public /* synthetic */ C32659e(int i) {
        this.f86670a = i;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C32659e) && this.f86670a == ((C32659e) obj).f86670a;
    }

    public int hashCode() {
        return this.f86670a;
    }

    public String toString() {
        int i = this.f86670a;
        boolean z = false;
        if (i == 1) {
            return "Left";
        }
        if (i == 2) {
            return "Right";
        }
        if (i == 3) {
            return "Center";
        }
        if (i == 4) {
            return "Justify";
        }
        if (i == 5) {
            return "Start";
        }
        if (i == 6) {
            z = true;
        }
        return z ? "End" : "Invalid";
    }
}
