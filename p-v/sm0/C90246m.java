package sm0;

import fl0.C86918c;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Map;
import sx3.C36903g0;

/* renamed from: sm0.m */
public final class C90246m {

    /* renamed from: a */
    public final C86918c f259057a;

    /* renamed from: b */
    public final Map<String, Object> f259058b;

    public C90246m(C86918c cVar, Map<String, ? extends Object> map) {
        C87412m.m108594g(cVar, "errors");
        C87412m.m108594g(map, "resultPack");
        this.f259057a = cVar;
        this.f259058b = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C90246m)) {
            return false;
        }
        C90246m mVar = (C90246m) obj;
        return C87412m.m108589b(this.f259057a, mVar.f259057a) && C87412m.m108589b(this.f259058b, mVar.f259058b);
    }

    public int hashCode() {
        return (this.f259057a.hashCode() * 31) + this.f259058b.hashCode();
    }

    public String toString() {
        return "SmCryptoOperateResult(errors=" + this.f259057a + ", resultPack=" + this.f259058b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C90246m(C86918c cVar, Map map, int i, C8480h hVar) {
        this(cVar, (i & 2) != 0 ? C36903g0.f97931d : map);
    }
}
