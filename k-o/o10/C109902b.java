package o10;

import android.graphics.Insets;

/* renamed from: o10.b */
public final class C109902b {

    /* renamed from: e */
    public static final C109902b f328853e = new C109902b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f328854a;

    /* renamed from: b */
    public final int f328855b;

    /* renamed from: c */
    public final int f328856c;

    /* renamed from: d */
    public final int f328857d;

    public C109902b(int i, int i2, int i3, int i4) {
        this.f328854a = i;
        this.f328855b = i2;
        this.f328856c = i3;
        this.f328857d = i4;
    }

    /* renamed from: a */
    public static C109902b m149394a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f328853e : new C109902b(i, i2, i3, i4);
    }

    /* renamed from: b */
    public static C109902b m149395b(Insets insets) {
        return m149394a(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: c */
    public Insets mo161216c() {
        return Insets.of(this.f328854a, this.f328855b, this.f328856c, this.f328857d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C109902b.class != obj.getClass()) {
            return false;
        }
        C109902b bVar = (C109902b) obj;
        return this.f328857d == bVar.f328857d && this.f328854a == bVar.f328854a && this.f328856c == bVar.f328856c && this.f328855b == bVar.f328855b;
    }

    public int hashCode() {
        return (((((this.f328854a * 31) + this.f328855b) * 31) + this.f328856c) * 31) + this.f328857d;
    }

    public String toString() {
        return "Insets{left=" + this.f328854a + ", top=" + this.f328855b + ", right=" + this.f328856c + ", bottom=" + this.f328857d + '}';
    }
}
