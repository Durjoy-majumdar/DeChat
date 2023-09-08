package p869y0;

/* renamed from: y0.c */
public final class C112307c {

    /* renamed from: a */
    public final int f336314a;

    public /* synthetic */ C112307c(int i) {
        this.f336314a = i;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C112307c) && this.f336314a == ((C112307c) obj).f336314a;
    }

    public int hashCode() {
        return this.f336314a;
    }

    public String toString() {
        int i = this.f336314a;
        boolean z = false;
        if (i == 1) {
            return "Next";
        }
        if (i == 2) {
            return "Previous";
        }
        if (i == 3) {
            return "Left";
        }
        if (i == 4) {
            return "Right";
        }
        if (i == 5) {
            return "Up";
        }
        if (i == 6) {
            return "Down";
        }
        if (i == 7) {
            return "In";
        }
        if (i == 8) {
            z = true;
        }
        return z ? "Out" : "Invalid FocusDirection";
    }
}
