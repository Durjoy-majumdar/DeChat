package p82;

import gy3.C8480h;

/* renamed from: p82.e */
public final class C110201e {

    /* renamed from: a */
    public final int f329678a;

    /* renamed from: b */
    public final int f329679b;

    /* renamed from: c */
    public final int f329680c;

    /* renamed from: d */
    public final boolean f329681d;

    /* renamed from: e */
    public final boolean f329682e;

    public C110201e(int i, int i2, int i3, boolean z, boolean z2) {
        this.f329678a = i;
        this.f329679b = i2;
        this.f329680c = i3;
        this.f329681d = z;
        this.f329682e = z2;
    }

    /* renamed from: a */
    public static C110201e m149794a(C110201e eVar, int i, int i2, int i3, boolean z, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = eVar.f329678a;
        }
        if ((i4 & 2) != 0) {
            i2 = eVar.f329679b;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = eVar.f329680c;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            z = eVar.f329681d;
        }
        boolean z3 = z;
        if ((i4 & 16) != 0) {
            z2 = eVar.f329682e;
        }
        boolean z4 = z2;
        eVar.getClass();
        return new C110201e(i, i5, i6, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C110201e)) {
            return false;
        }
        C110201e eVar = (C110201e) obj;
        return this.f329678a == eVar.f329678a && this.f329679b == eVar.f329679b && this.f329680c == eVar.f329680c && this.f329681d == eVar.f329681d && this.f329682e == eVar.f329682e;
    }

    public int hashCode() {
        int i = ((((this.f329678a * 31) + this.f329679b) * 31) + this.f329680c) * 31;
        boolean z = this.f329681d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (i + (z ? 1 : 0)) * 31;
        boolean z3 = this.f329682e;
        if (!z3) {
            z2 = z3;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        return "RenderInfo(width=" + this.f329678a + ", height=" + this.f329679b + ", rotate=" + this.f329680c + ", mirror=" + this.f329681d + ", centerCrop=" + this.f329682e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C110201e(int i, int i2, int i3, boolean z, boolean z2, int i4, C8480h hVar) {
        this(i, i2, i3, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? true : z2);
    }
}
