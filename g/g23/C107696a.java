package g23;

/* renamed from: g23.a */
public final class C107696a {

    /* renamed from: a */
    public int f322204a;

    /* renamed from: b */
    public int f322205b;

    /* renamed from: c */
    public int f322206c;

    /* renamed from: d */
    public int f322207d;

    /* renamed from: e */
    public int f322208e;

    /* renamed from: f */
    public int f322209f;

    /* renamed from: g */
    public int f322210g;

    public C107696a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f322204a = i;
        this.f322205b = i2;
        this.f322206c = i3;
        this.f322207d = i4;
        this.f322208e = i5;
        this.f322209f = i6;
        this.f322210g = i7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C107696a)) {
            return false;
        }
        C107696a aVar = (C107696a) obj;
        return this.f322204a == aVar.f322204a && this.f322205b == aVar.f322205b && this.f322206c == aVar.f322206c && this.f322207d == aVar.f322207d && this.f322208e == aVar.f322208e && this.f322209f == aVar.f322209f && this.f322210g == aVar.f322210g;
    }

    public int hashCode() {
        return (((((((((((this.f322204a * 31) + this.f322205b) * 31) + this.f322206c) * 31) + this.f322207d) * 31) + this.f322208e) * 31) + this.f322209f) * 31) + this.f322210g;
    }

    public String toString() {
        return "MaterialCacheInfo(width=" + this.f322204a + ", height=" + this.f322205b + ", rotate=" + this.f322206c + ", cropLeft=" + this.f322207d + ", cropTop=" + this.f322208e + ", cropRight=" + this.f322209f + ", cropBottom=" + this.f322210g + ')';
    }
}
