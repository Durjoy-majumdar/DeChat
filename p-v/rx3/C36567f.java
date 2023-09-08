package rx3;

import gy3.C87412m;
import my3.C61594j;

/* renamed from: rx3.f */
public final class C36567f implements Comparable<C36567f> {

    /* renamed from: h */
    public static final C36567f f97251h = new C36567f(1, 7, 10);

    /* renamed from: d */
    public final int f97252d;

    /* renamed from: e */
    public final int f97253e;

    /* renamed from: f */
    public final int f97254f;

    /* renamed from: g */
    public final int f97255g;

    public C36567f(int i, int i2, int i3) {
        this.f97252d = i;
        this.f97253e = i2;
        this.f97254f = i3;
        boolean z = false;
        if (new C61594j(0, 255).mo86532k(i) && new C61594j(0, 255).mo86532k(i2) && new C61594j(0, 255).mo86532k(i3)) {
            z = true;
        }
        if (z) {
            this.f97255g = (i << 16) + (i2 << 8) + i3;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    public int compareTo(Object obj) {
        C36567f fVar = (C36567f) obj;
        C87412m.m108594g(fVar, "other");
        return this.f97255g - fVar.f97255g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C36567f fVar = obj instanceof C36567f ? (C36567f) obj : null;
        return fVar != null && this.f97255g == fVar.f97255g;
    }

    public int hashCode() {
        return this.f97255g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f97252d);
        sb.append('.');
        sb.append(this.f97253e);
        sb.append('.');
        sb.append(this.f97254f);
        return sb.toString();
    }
}
