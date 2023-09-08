package e80;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: e80.b */
public final class C107254b {

    /* renamed from: a */
    public int f320900a;

    /* renamed from: b */
    public int f320901b;

    /* renamed from: c */
    public boolean f320902c;

    /* renamed from: d */
    public boolean f320903d;

    /* renamed from: e */
    public boolean f320904e;

    /* renamed from: f */
    public boolean f320905f;

    public C107254b() {
        this(0, 0, (C107256d) null, (C107257e) null, false, false, false, false, 255, (C8480h) null);
    }

    public C107254b(int i, int i2, C107256d dVar, C107257e eVar, boolean z, boolean z2, boolean z3, boolean z4, int i3, C8480h hVar) {
        i = (i3 & 1) != 0 ? 30 : i;
        i2 = (i3 & 2) != 0 ? -1 : i2;
        z = (i3 & 16) != 0 ? true : z;
        z2 = (i3 & 32) != 0 ? false : z2;
        z3 = (i3 & 64) != 0 ? false : z3;
        z4 = (i3 & 128) != 0 ? false : z4;
        this.f320900a = i;
        this.f320901b = i2;
        this.f320902c = z;
        this.f320903d = z2;
        this.f320904e = z3;
        this.f320905f = z4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C107254b)) {
            return false;
        }
        C107254b bVar = (C107254b) obj;
        return this.f320900a == bVar.f320900a && this.f320901b == bVar.f320901b && C87412m.m108589b((Object) null, (Object) null) && C87412m.m108589b((Object) null, (Object) null) && this.f320902c == bVar.f320902c && this.f320903d == bVar.f320903d && this.f320904e == bVar.f320904e && this.f320905f == bVar.f320905f;
    }

    public int hashCode() {
        int i = ((((((this.f320900a * 31) + this.f320901b) * 31) + 0) * 31) + 0) * 31;
        boolean z = this.f320902c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (i + (z ? 1 : 0)) * 31;
        boolean z3 = this.f320903d;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f320904e;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f320905f;
        if (!z5) {
            z2 = z5;
        }
        return i4 + (z2 ? 1 : 0);
    }

    public String toString() {
        return "CameraKitCommonSetting(cameraFrameRate=" + this.f320900a + ", previewLimit=" + this.f320901b + ", pictureSetting=" + null + ", renderSetting=" + null + ", useBackCamera=" + this.f320902c + ", isUseTakePicture=" + this.f320903d + ", isUseFlash=" + this.f320904e + ", isUseAdjustExpo=" + this.f320905f + ')';
    }
}
