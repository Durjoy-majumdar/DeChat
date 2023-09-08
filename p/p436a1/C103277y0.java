package p436a1;

/* renamed from: a1.y0 */
public final class C103277y0 {

    /* renamed from: a */
    public final int f304521a;

    public /* synthetic */ C103277y0(int i) {
        this.f304521a = i;
    }

    /* renamed from: a */
    public static String m136797a(int i) {
        boolean z = false;
        if (i == 0) {
            return "Miter";
        }
        if (i == 1) {
            return "Round";
        }
        if (i == 2) {
            z = true;
        }
        return z ? "Bevel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return (obj instanceof C103277y0) && this.f304521a == ((C103277y0) obj).f304521a;
    }

    public int hashCode() {
        return this.f304521a;
    }

    public String toString() {
        return m136797a(this.f304521a);
    }
}
