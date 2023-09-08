package h03;

/* renamed from: h03.i */
public final class C107998i {

    /* renamed from: a */
    public int f323426a;

    /* renamed from: b */
    public int f323427b;

    /* renamed from: c */
    public int f323428c;

    public C107998i(int i, int i2, int i3) {
        this.f323426a = i;
        this.f323427b = i2;
        this.f323428c = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C107998i)) {
            return false;
        }
        C107998i iVar = (C107998i) obj;
        return this.f323426a == iVar.f323426a && this.f323427b == iVar.f323427b && this.f323428c == iVar.f323428c;
    }

    public int hashCode() {
        return (((this.f323426a * 31) + this.f323427b) * 31) + this.f323428c;
    }

    public String toString() {
        return "MultiMediaInfo(width=" + this.f323426a + ", height=" + this.f323427b + ", rotate=" + this.f323428c + ')';
    }
}
