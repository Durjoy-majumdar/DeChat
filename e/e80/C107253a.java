package e80;

import gy3.C8480h;

/* renamed from: e80.a */
public final class C107253a {

    /* renamed from: a */
    public int f320897a;

    /* renamed from: b */
    public boolean f320898b;

    /* renamed from: c */
    public boolean f320899c;

    public C107253a() {
        this(0, false, false, 7, (C8480h) null);
    }

    public C107253a(int i, boolean z, boolean z2, int i2, C8480h hVar) {
        i = (i2 & 1) != 0 ? 0 : i;
        z = (i2 & 2) != 0 ? true : z;
        z2 = (i2 & 4) != 0 ? true : z2;
        this.f320897a = i;
        this.f320898b = z;
        this.f320899c = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C107253a)) {
            return false;
        }
        C107253a aVar = (C107253a) obj;
        return this.f320897a == aVar.f320897a && this.f320898b == aVar.f320898b && this.f320899c == aVar.f320899c;
    }

    public int hashCode() {
        int i = this.f320897a * 31;
        boolean z = this.f320898b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (i + (z ? 1 : 0)) * 31;
        boolean z3 = this.f320899c;
        if (!z3) {
            z2 = z3;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        return "CameraDeviceInfo(cameraCount=" + this.f320897a + ", hasBackCamera=" + this.f320898b + ", hasFrontCamera=" + this.f320899c + ')';
    }
}
