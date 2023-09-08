package d50;

import gy3.C8480h;

/* renamed from: d50.f */
public final class C58112f {

    /* renamed from: a */
    public boolean f166226a;

    /* renamed from: b */
    public boolean f166227b;

    /* renamed from: c */
    public boolean f166228c;

    /* renamed from: d */
    public int f166229d;

    /* renamed from: e */
    public boolean f166230e;

    public C58112f() {
        this(false, false, false, 0, false, 31, (C8480h) null);
    }

    public C58112f(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, C8480h hVar) {
        z = (i2 & 1) != 0 ? false : z;
        z2 = (i2 & 2) != 0 ? true : z2;
        z3 = (i2 & 4) != 0 ? false : z3;
        i = (i2 & 8) != 0 ? 1080 : i;
        z4 = (i2 & 16) != 0 ? true : z4;
        this.f166226a = z;
        this.f166227b = z2;
        this.f166228c = z3;
        this.f166229d = i;
        this.f166230e = z4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58112f)) {
            return false;
        }
        C58112f fVar = (C58112f) obj;
        return this.f166226a == fVar.f166226a && this.f166227b == fVar.f166227b && this.f166228c == fVar.f166228c && this.f166229d == fVar.f166229d && this.f166230e == fVar.f166230e;
    }

    public int hashCode() {
        boolean z = this.f166226a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f166227b;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f166228c;
        if (z4) {
            z4 = true;
        }
        int i3 = (((i2 + (z4 ? 1 : 0)) * 31) + this.f166229d) * 31;
        boolean z5 = this.f166230e;
        if (!z5) {
            z2 = z5;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public String toString() {
        return "LiveRenderModel(useCamera2=" + this.f166226a + ", defaultFrontCamera=" + this.f166227b + ", useCPUCrop=" + this.f166228c + ", resolution=" + this.f166229d + ", frontMirror=" + this.f166230e + ')';
    }
}
