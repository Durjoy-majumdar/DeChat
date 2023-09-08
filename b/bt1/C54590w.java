package bt1;

import gy3.C8480h;
import gy3.C87412m;
import te3.C64446ig1;
import te3.C64636pq2;

/* renamed from: bt1.w */
public final class C54590w {

    /* renamed from: a */
    public final boolean f153076a;

    /* renamed from: b */
    public final int f153077b;

    /* renamed from: c */
    public final C64636pq2 f153078c;

    /* renamed from: d */
    public final String f153079d;

    /* renamed from: e */
    public final int f153080e;

    /* renamed from: f */
    public String f153081f;

    /* renamed from: g */
    public C64446ig1 f153082g;

    public C54590w(boolean z, int i, C64636pq2 pq22, String str, int i2, String str2, C64446ig1 ig12, int i3, C8480h hVar) {
        str = (i3 & 8) != 0 ? "" : str;
        i2 = (i3 & 16) != 0 ? 0 : i2;
        str2 = (i3 & 32) != 0 ? "" : str2;
        ig12 = (i3 & 64) != 0 ? null : ig12;
        C87412m.m108594g(str, "videoPathBeforeCut");
        C87412m.m108594g(str2, "shortTitle");
        this.f153076a = z;
        this.f153077b = i;
        this.f153078c = pq22;
        this.f153079d = str;
        this.f153080e = i2;
        this.f153081f = str2;
        this.f153082g = ig12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54590w)) {
            return false;
        }
        C54590w wVar = (C54590w) obj;
        return this.f153076a == wVar.f153076a && this.f153077b == wVar.f153077b && C87412m.m108589b(this.f153078c, wVar.f153078c) && C87412m.m108589b(this.f153079d, wVar.f153079d) && this.f153080e == wVar.f153080e && C87412m.m108589b(this.f153081f, wVar.f153081f) && C87412m.m108589b(this.f153082g, wVar.f153082g);
    }

    public int hashCode() {
        boolean z = this.f153076a;
        if (z) {
            z = true;
        }
        int i = (((z ? 1 : 0) * true) + this.f153077b) * 31;
        C64636pq2 pq22 = this.f153078c;
        int i2 = 0;
        int hashCode = (((((((i + (pq22 == null ? 0 : pq22.hashCode())) * 31) + this.f153079d.hashCode()) * 31) + this.f153080e) * 31) + this.f153081f.hashCode()) * 31;
        C64446ig1 ig12 = this.f153082g;
        if (ig12 != null) {
            i2 = ig12.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "UploadData(ok=" + this.f153076a + ", type=" + this.f153077b + ", localFinderContent=" + this.f153078c + ", videoPathBeforeCut=" + this.f153079d + ", watermarkFlag=" + this.f153080e + ", shortTitle=" + this.f153081f + ", originalDesc=" + this.f153082g + ')';
    }
}
