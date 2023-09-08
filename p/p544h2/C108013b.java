package p544h2;

import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import p436a1.C103257q;
import p436a1.C103272w;
import p544h2.C108015h;
import rx3.C90109v;

/* renamed from: h2.b */
public final class C108013b implements C108015h {

    /* renamed from: b */
    public final long f323456b;

    public C108013b(long j, C8480h hVar) {
        this.f323456b = j;
        if (!(j != C103272w.f304515g)) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextDrawStyle.Unspecified instead.".toString());
        }
    }

    /* renamed from: a */
    public long mo158403a() {
        return this.f323456b;
    }

    /* renamed from: b */
    public C108015h mo158404b(C32224a<? extends C108015h> aVar) {
        C87412m.m108594g(aVar, "other");
        return !C87412m.m108589b(this, C108015h.C108018b.f323463b) ? this : (C108015h) aVar.invoke();
    }

    /* renamed from: c */
    public C103257q mo158405c() {
        return null;
    }

    /* renamed from: d */
    public C108015h mo158406d(C108015h hVar) {
        return C108015h.C108016a.m146336a(this, hVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C108013b) && C103272w.m136781c(this.f323456b, ((C108013b) obj).f323456b);
    }

    public int hashCode() {
        long j = this.f323456b;
        int i = C103272w.f304516h;
        return C90109v.m112737a(j);
    }

    public String toString() {
        return "ColorStyle(value=" + C103272w.m136787i(this.f323456b) + ')';
    }
}
