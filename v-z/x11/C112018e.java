package x11;

import gy3.C8480h;

/* renamed from: x11.e */
public final class C112018e {

    /* renamed from: a */
    public final int f335321a;

    /* renamed from: b */
    public final int f335322b;

    /* renamed from: c */
    public final int f335323c;

    /* renamed from: d */
    public final boolean f335324d;

    /* renamed from: e */
    public final int f335325e;

    public C112018e(int i, int i2, int i3, boolean z, int i4) {
        this.f335321a = i;
        this.f335322b = i2;
        this.f335323c = i3;
        this.f335324d = z;
        this.f335325e = i4;
    }

    /* renamed from: a */
    public static C112018e m152742a(C112018e eVar, int i, int i2, int i3, boolean z, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = eVar.f335321a;
        }
        if ((i5 & 2) != 0) {
            i2 = eVar.f335322b;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = eVar.f335323c;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            z = eVar.f335324d;
        }
        boolean z2 = z;
        if ((i5 & 16) != 0) {
            i4 = eVar.f335325e;
        }
        int i8 = i4;
        eVar.getClass();
        return new C112018e(i, i6, i7, z2, i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C112018e)) {
            return false;
        }
        C112018e eVar = (C112018e) obj;
        return this.f335321a == eVar.f335321a && this.f335322b == eVar.f335322b && this.f335323c == eVar.f335323c && this.f335324d == eVar.f335324d && this.f335325e == eVar.f335325e;
    }

    public int hashCode() {
        int i = ((((this.f335321a * 31) + this.f335322b) * 31) + this.f335323c) * 31;
        boolean z = this.f335324d;
        if (z) {
            z = true;
        }
        return ((i + (z ? 1 : 0)) * 31) + this.f335325e;
    }

    public String toString() {
        return "RenderInfo(width=" + this.f335321a + ", height=" + this.f335322b + ", rotate=" + this.f335323c + ", mirror=" + this.f335324d + ", scaleType=" + this.f335325e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C112018e(int i, int i2, int i3, boolean z, int i4, int i5, C8480h hVar) {
        this(i, i2, i3, (i5 & 8) != 0 ? false : z, (i5 & 16) != 0 ? 0 : i4);
    }
}
