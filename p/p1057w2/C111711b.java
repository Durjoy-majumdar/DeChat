package p1057w2;

import android.graphics.Insets;

/* renamed from: w2.b */
public final class C111711b {

    /* renamed from: e */
    public static final C111711b f334387e = new C111711b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f334388a;

    /* renamed from: b */
    public final int f334389b;

    /* renamed from: c */
    public final int f334390c;

    /* renamed from: d */
    public final int f334391d;

    public C111711b(int i, int i2, int i3, int i4) {
        this.f334388a = i;
        this.f334389b = i2;
        this.f334390c = i3;
        this.f334391d = i4;
    }

    /* renamed from: a */
    public static C111711b m152275a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f334387e : new C111711b(i, i2, i3, i4);
    }

    /* renamed from: b */
    public static C111711b m152276b(Insets insets) {
        return m152275a(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: c */
    public Insets mo163385c() {
        return Insets.of(this.f334388a, this.f334389b, this.f334390c, this.f334391d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C111711b.class != obj.getClass()) {
            return false;
        }
        C111711b bVar = (C111711b) obj;
        return this.f334391d == bVar.f334391d && this.f334388a == bVar.f334388a && this.f334390c == bVar.f334390c && this.f334389b == bVar.f334389b;
    }

    public int hashCode() {
        return (((((this.f334388a * 31) + this.f334389b) * 31) + this.f334390c) * 31) + this.f334391d;
    }

    public String toString() {
        return "Insets{left=" + this.f334388a + ", top=" + this.f334389b + ", right=" + this.f334390c + ", bottom=" + this.f334391d + '}';
    }
}
