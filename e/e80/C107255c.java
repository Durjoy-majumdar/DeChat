package e80;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: e80.c */
public final class C107255c {

    /* renamed from: a */
    public C107253a f320906a;

    /* renamed from: b */
    public C107262j f320907b;

    /* renamed from: c */
    public boolean f320908c;

    /* renamed from: d */
    public int f320909d;

    /* renamed from: e */
    public int f320910e;

    /* renamed from: f */
    public boolean f320911f;

    /* renamed from: g */
    public int f320912g;

    public C107255c() {
        this((C107253a) null, (C107262j) null, false, 0, 0, false, 0, 127, (C8480h) null);
    }

    public C107255c(C107253a aVar, C107262j jVar, boolean z, int i, int i2, boolean z2, int i3, int i4, C8480h hVar) {
        C107253a aVar2 = (i4 & 1) != 0 ? new C107253a(0, false, false, 7, (C8480h) null) : aVar;
        C107262j jVar2 = (i4 & 2) != 0 ? new C107262j((C107261i) null, (C107261i) null, (C107261i) null, 0, false, 31, (C8480h) null) : jVar;
        boolean z3 = (i4 & 4) != 0 ? true : z;
        int i5 = (i4 & 8) != 0 ? -1 : i;
        int i6 = 0;
        int i7 = (i4 & 16) != 0 ? 0 : i2;
        boolean z4 = (i4 & 32) != 0 ? false : z2;
        i6 = (i4 & 64) == 0 ? i3 : i6;
        C87412m.m108594g(aVar2, "deviceInfo");
        C87412m.m108594g(jVar2, "sizeParameter");
        this.f320906a = aVar2;
        this.f320907b = jVar2;
        this.f320908c = z3;
        this.f320909d = i5;
        this.f320910e = i7;
        this.f320911f = z4;
        this.f320912g = i6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C107255c)) {
            return false;
        }
        C107255c cVar = (C107255c) obj;
        return C87412m.m108589b(this.f320906a, cVar.f320906a) && C87412m.m108589b(this.f320907b, cVar.f320907b) && this.f320908c == cVar.f320908c && this.f320909d == cVar.f320909d && this.f320910e == cVar.f320910e && this.f320911f == cVar.f320911f && this.f320912g == cVar.f320912g;
    }

    public int hashCode() {
        int hashCode = ((this.f320906a.hashCode() * 31) + this.f320907b.hashCode()) * 31;
        boolean z = this.f320908c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (((((hashCode + (z ? 1 : 0)) * 31) + this.f320909d) * 31) + this.f320910e) * 31;
        boolean z3 = this.f320911f;
        if (!z3) {
            z2 = z3;
        }
        return ((i + (z2 ? 1 : 0)) * 31) + this.f320912g;
    }

    public String toString() {
        return "CameraKitInfo(deviceInfo=" + this.f320906a + ", sizeParameter=" + this.f320907b + ", isBackCamera=" + this.f320908c + ", cameraId=" + this.f320909d + ", rotate=" + this.f320910e + ", isPreviewing=" + this.f320911f + ", frameRate=" + this.f320912g + ')';
    }
}
