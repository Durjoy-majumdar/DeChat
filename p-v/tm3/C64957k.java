package tm3;

import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import gy3.C87412m;
import java.util.HashMap;
import java.util.List;
import om3.C77020b;

/* renamed from: tm3.k */
public final class C64957k extends BaseStateAction {

    /* renamed from: a */
    public final C78064o f187037a;

    /* renamed from: b */
    public final HashMap<Integer, Object> f187038b;

    /* renamed from: c */
    public List<C77020b> f187039c;

    public C64957k(C78064o oVar, HashMap<Integer, Object> hashMap, List<C77020b> list) {
        C87412m.m108594g(oVar, "queryActionResult");
        C87412m.m108594g(hashMap, "resultMap");
        C87412m.m108594g(list, "itemList");
        this.f187037a = oVar;
        this.f187038b = hashMap;
        this.f187039c = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64957k)) {
            return false;
        }
        C64957k kVar = (C64957k) obj;
        return C87412m.m108589b(this.f187037a, kVar.f187037a) && C87412m.m108589b(this.f187038b, kVar.f187038b) && C87412m.m108589b(this.f187039c, kVar.f187039c);
    }

    public int hashCode() {
        return (((this.f187037a.hashCode() * 31) + this.f187038b.hashCode()) * 31) + this.f187039c.hashCode();
    }

    public String toString() {
        return "SearchEndAction(queryActionResult=" + this.f187037a + ", resultMap=" + this.f187038b + ", itemList=" + this.f187039c + ')';
    }
}
