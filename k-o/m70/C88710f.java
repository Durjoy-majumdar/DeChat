package m70;

/* renamed from: m70.f */
public final class C88710f {

    /* renamed from: a */
    public final int f256062a;

    /* renamed from: b */
    public final int f256063b;

    /* renamed from: c */
    public final int f256064c;

    /* renamed from: d */
    public final int f256065d;

    /* renamed from: e */
    public final int f256066e;

    public C88710f(int i, int i2, int i3, int i4, int i5) {
        this.f256062a = i;
        this.f256063b = i2;
        this.f256064c = i3;
        this.f256065d = i4;
        this.f256066e = i5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C88710f)) {
            return false;
        }
        C88710f fVar = (C88710f) obj;
        return this.f256062a == fVar.f256062a && this.f256063b == fVar.f256063b && this.f256064c == fVar.f256064c && this.f256065d == fVar.f256065d && this.f256066e == fVar.f256066e;
    }

    public int hashCode() {
        return (((((((this.f256062a * 31) + this.f256063b) * 31) + this.f256064c) * 31) + this.f256065d) * 31) + this.f256066e;
    }

    public String toString() {
        return "CommonCoverViewPositionAndSize(x=" + this.f256062a + ", y=" + this.f256063b + ", width=" + this.f256064c + ", height=" + this.f256065d + ", zIndex=" + this.f256066e + ')';
    }
}
