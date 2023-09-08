package p436a1;

/* renamed from: a1.x0 */
public final class C103275x0 {

    /* renamed from: a */
    public final int f304520a;

    public /* synthetic */ C103275x0(int i) {
        this.f304520a = i;
    }

    /* renamed from: a */
    public static String m136789a(int i) {
        boolean z = false;
        if (i == 0) {
            return "Butt";
        }
        if (i == 1) {
            return "Round";
        }
        if (i == 2) {
            z = true;
        }
        return z ? "Square" : "Unknown";
    }

    public boolean equals(Object obj) {
        return (obj instanceof C103275x0) && this.f304520a == ((C103275x0) obj).f304520a;
    }

    public int hashCode() {
        return this.f304520a;
    }

    public String toString() {
        return m136789a(this.f304520a);
    }
}
