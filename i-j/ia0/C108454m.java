package ia0;

import gy3.C8480h;

/* renamed from: ia0.m */
public final class C108454m {

    /* renamed from: a */
    public int f324768a;

    /* renamed from: b */
    public int f324769b;

    /* renamed from: c */
    public int f324770c;

    /* renamed from: d */
    public int f324771d;

    public C108454m() {
        this(0, 0, 0, 0, 15, (C8480h) null);
    }

    public C108454m(int i, int i2, int i3, int i4, int i5, C8480h hVar) {
        i = (i5 & 1) != 0 ? 0 : i;
        i2 = (i5 & 2) != 0 ? 0 : i2;
        i3 = (i5 & 4) != 0 ? 0 : i3;
        i4 = (i5 & 8) != 0 ? 0 : i4;
        this.f324768a = i;
        this.f324769b = i2;
        this.f324770c = i3;
        this.f324771d = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C108454m)) {
            return false;
        }
        C108454m mVar = (C108454m) obj;
        return this.f324768a == mVar.f324768a && this.f324769b == mVar.f324769b && this.f324770c == mVar.f324770c && this.f324771d == mVar.f324771d;
    }

    public int hashCode() {
        return (((((this.f324768a * 31) + this.f324769b) * 31) + this.f324770c) * 31) + this.f324771d;
    }

    public String toString() {
        return "VideoFrameInfo(width=" + this.f324768a + ", height=" + this.f324769b + ", rowStride=" + this.f324770c + ", pixelStride=" + this.f324771d + ')';
    }
}
