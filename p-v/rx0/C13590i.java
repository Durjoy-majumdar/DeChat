package rx0;

/* renamed from: rx0.i */
public final class C13590i {

    /* renamed from: a */
    public final int f38534a;

    /* renamed from: b */
    public final int f38535b;

    public C13590i(int i, int i2) {
        this.f38534a = i;
        this.f38535b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13590i)) {
            return false;
        }
        C13590i iVar = (C13590i) obj;
        return this.f38534a == iVar.f38534a && this.f38535b == iVar.f38535b;
    }

    public int hashCode() {
        return (this.f38534a * 31) + this.f38535b;
    }

    public String toString() {
        return "LocResult(posX=" + this.f38534a + ", posY=" + this.f38535b + ')';
    }
}
