package f80;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: f80.e */
public final class C107490e<T> {

    /* renamed from: a */
    public final T f321599a;

    /* renamed from: b */
    public C107491f f321600b;

    public C107490e(Object obj, C107491f fVar, int i, C8480h hVar) {
        fVar = (i & 2) != 0 ? C107491f.Created : fVar;
        C87412m.m108594g(fVar, "status");
        this.f321599a = obj;
        this.f321600b = fVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C107490e)) {
            return false;
        }
        C107490e eVar = (C107490e) obj;
        return C87412m.m108589b(this.f321599a, eVar.f321599a) && this.f321600b == eVar.f321600b;
    }

    public int hashCode() {
        T t = this.f321599a;
        return ((t == null ? 0 : t.hashCode()) * 31) + this.f321600b.hashCode();
    }

    public String toString() {
        return "CameraKitPreloadModel(preload=" + this.f321599a + ", status=" + this.f321600b + ')';
    }
}
