package p158gt;

/* renamed from: gt.x */
public final class C32529x {

    /* renamed from: a */
    public final int f86383a;

    /* renamed from: b */
    public final int f86384b;

    public C32529x(int i, int i2) {
        this.f86383a = i;
        this.f86384b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32529x)) {
            return false;
        }
        C32529x xVar = (C32529x) obj;
        return this.f86383a == xVar.f86383a && this.f86384b == xVar.f86384b;
    }

    public int hashCode() {
        return (this.f86383a * 31) + this.f86384b;
    }

    public String toString() {
        return "ImgBaseInfo(width=" + this.f86383a + ", height=" + this.f86384b + ')';
    }
}
