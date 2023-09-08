package li3;

/* renamed from: li3.d */
public final class C10532d {

    /* renamed from: a */
    public final int f31804a;

    /* renamed from: b */
    public final int f31805b;

    public C10532d(int i, int i2) {
        this.f31804a = i;
        this.f31805b = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10532d) {
                C10532d dVar = (C10532d) obj;
                if (this.f31804a == dVar.f31804a) {
                    if (this.f31805b == dVar.f31805b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f31804a * 31) + this.f31805b;
    }

    public String toString() {
        return "Size(width=" + this.f31804a + ", height=" + this.f31805b + ')';
    }
}
