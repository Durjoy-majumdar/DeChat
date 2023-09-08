package p1116h1;

/* renamed from: h1.a */
public final class C108008a {

    /* renamed from: a */
    public final int f323452a;

    public /* synthetic */ C108008a(int i) {
        this.f323452a = i;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C108008a) && this.f323452a == ((C108008a) obj).f323452a;
    }

    public int hashCode() {
        return this.f323452a;
    }

    public String toString() {
        int i = this.f323452a;
        boolean z = false;
        if (i == 1) {
            return "Touch";
        }
        if (i == 2) {
            z = true;
        }
        return z ? "Keyboard" : "Error";
    }
}
