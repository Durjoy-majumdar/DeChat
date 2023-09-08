package e80;

/* renamed from: e80.f */
public final class C107258f {

    /* renamed from: a */
    public int f320913a;

    /* renamed from: b */
    public int f320914b;

    public C107258f() {
        this(-1, -1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C107258f)) {
            return false;
        }
        C107258f fVar = (C107258f) obj;
        return this.f320913a == fVar.f320913a && this.f320914b == fVar.f320914b;
    }

    public int hashCode() {
        return (this.f320913a * 31) + this.f320914b;
    }

    public String toString() {
        return "CameraKitReportSetting(scene=" + this.f320913a + ", subScene=" + this.f320914b + ')';
    }

    public C107258f(int i, int i2) {
        this.f320913a = i;
        this.f320914b = i2;
    }
}
