package p543h0;

import gy3.C24560g0;
import gy3.C8480h;
import gy3.C87412m;
import p175j0.C108500f2;
import p175j0.C108504h;
import p175j0.C60667k2;
import p436a1.C103272w;
import rx3.C90109v;

/* renamed from: h0.k */
public final class C107962k implements C107924a {

    /* renamed from: a */
    public final long f323314a;

    /* renamed from: b */
    public final long f323315b;

    /* renamed from: c */
    public final long f323316c;

    /* renamed from: d */
    public final long f323317d;

    public C107962k(long j, long j2, long j3, long j4, C8480h hVar) {
        this.f323314a = j;
        this.f323315b = j2;
        this.f323316c = j3;
        this.f323317d = j4;
    }

    /* renamed from: a */
    public C60667k2<C103272w> mo158351a(boolean z, C108504h hVar, int i) {
        hVar.mo51557H(-2133647540);
        C60667k2<C103272w> e = C108500f2.m146998e(new C103272w(z ? this.f323315b : this.f323317d), hVar, 0);
        hVar.mo51565P();
        return e;
    }

    /* renamed from: b */
    public C60667k2<C103272w> mo158352b(boolean z, C108504h hVar, int i) {
        hVar.mo51557H(-655254499);
        C60667k2<C103272w> e = C108500f2.m146998e(new C103272w(z ? this.f323314a : this.f323316c), hVar, 0);
        hVar.mo51565P();
        return e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C87412m.m108589b(C24560g0.m30725a(C107962k.class), C24560g0.m30725a(obj.getClass()))) {
            return false;
        }
        C107962k kVar = (C107962k) obj;
        return C103272w.m136781c(this.f323314a, kVar.f323314a) && C103272w.m136781c(this.f323315b, kVar.f323315b) && C103272w.m136781c(this.f323316c, kVar.f323316c) && C103272w.m136781c(this.f323317d, kVar.f323317d);
    }

    public int hashCode() {
        long j = this.f323314a;
        int i = C103272w.f304516h;
        return (((((C90109v.m112737a(j) * 31) + C90109v.m112737a(this.f323315b)) * 31) + C90109v.m112737a(this.f323316c)) * 31) + C90109v.m112737a(this.f323317d);
    }
}
