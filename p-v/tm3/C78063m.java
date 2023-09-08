package tm3;

import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import gy3.C87412m;
import om3.C77020b;

/* renamed from: tm3.m */
public final class C78063m extends BaseStateAction {

    /* renamed from: a */
    public final C77020b f228807a;

    /* renamed from: b */
    public final MvvmList<C77020b> f228808b;

    public C78063m(C77020b bVar, MvvmList<C77020b> mvvmList) {
        C87412m.m108594g(bVar, "item");
        this.f228807a = bVar;
        this.f228808b = mvvmList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78063m)) {
            return false;
        }
        C78063m mVar = (C78063m) obj;
        return C87412m.m108589b(this.f228807a, mVar.f228807a) && C87412m.m108589b(this.f228808b, mVar.f228808b);
    }

    public int hashCode() {
        int hashCode = this.f228807a.hashCode() * 31;
        MvvmList<C77020b> mvvmList = this.f228808b;
        return hashCode + (mvvmList == null ? 0 : mvvmList.hashCode());
    }

    public String toString() {
        return "SearchMoreClickAction(item=" + this.f228807a + ", searchMvvmList=" + this.f228808b + ')';
    }
}
