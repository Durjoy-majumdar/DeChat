package tm3;

import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import gy3.C87412m;
import om3.C77020b;

/* renamed from: tm3.z */
public final class C78071z extends BaseStateAction {

    /* renamed from: a */
    public final C77020b f228837a;

    /* renamed from: b */
    public final int f228838b;

    public C78071z(C77020b bVar, int i) {
        C87412m.m108594g(bVar, "item");
        this.f228837a = bVar;
        this.f228838b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78071z)) {
            return false;
        }
        C78071z zVar = (C78071z) obj;
        return C87412m.m108589b(this.f228837a, zVar.f228837a) && this.f228838b == zVar.f228838b;
    }

    public int hashCode() {
        return (this.f228837a.hashCode() * 31) + this.f228838b;
    }

    public String toString() {
        return "SelectUserAction(item=" + this.f228837a + ", position=" + this.f228838b + ')';
    }
}
