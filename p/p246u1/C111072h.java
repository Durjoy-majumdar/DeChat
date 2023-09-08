package p246u1;

/* renamed from: u1.h */
public final class C111072h {

    /* renamed from: a */
    public final int f332604a;

    public /* synthetic */ C111072h(int i) {
        this.f332604a = i;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C111072h) && this.f332604a == ((C111072h) obj).f332604a;
    }

    public int hashCode() {
        return this.f332604a;
    }

    public String toString() {
        int i = this.f332604a;
        boolean z = false;
        if (i == 0) {
            return "Button";
        }
        if (i == 1) {
            return "Checkbox";
        }
        if (i == 2) {
            return "Switch";
        }
        if (i == 3) {
            return "RadioButton";
        }
        if (i == 4) {
            return "Tab";
        }
        if (i == 5) {
            z = true;
        }
        return z ? "Image" : "Unknown";
    }
}
