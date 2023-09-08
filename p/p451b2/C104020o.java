package p451b2;

/* renamed from: b2.o */
public final class C104020o {

    /* renamed from: a */
    public final int f307648a;

    public /* synthetic */ C104020o(int i) {
        this.f307648a = i;
    }

    /* renamed from: a */
    public static String m138752a(int i) {
        boolean z = false;
        if (i == 0) {
            return "Normal";
        }
        if (i == 1) {
            z = true;
        }
        return z ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return (obj instanceof C104020o) && this.f307648a == ((C104020o) obj).f307648a;
    }

    public int hashCode() {
        return this.f307648a;
    }

    public String toString() {
        return m138752a(this.f307648a);
    }
}
