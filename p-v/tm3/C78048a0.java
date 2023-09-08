package tm3;

import com.tencent.p014mm.sdk.statecenter.IStateActionResult;
import gy3.C87412m;

/* renamed from: tm3.a0 */
public final class C78048a0 implements IStateActionResult {

    /* renamed from: a */
    public final C78050b f228786a;

    /* renamed from: b */
    public final C78049a f228787b;

    /* renamed from: tm3.a0$a */
    public enum C78049a {
        Success,
        MaxLimit
    }

    /* renamed from: tm3.a0$b */
    public enum C78050b {
        Add,
        Remove
    }

    public C78048a0(C78050b bVar, C78049a aVar) {
        C87412m.m108594g(bVar, "operation");
        C87412m.m108594g(aVar, "retCode");
        this.f228786a = bVar;
        this.f228787b = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78048a0)) {
            return false;
        }
        C78048a0 a0Var = (C78048a0) obj;
        return this.f228786a == a0Var.f228786a && this.f228787b == a0Var.f228787b;
    }

    public int hashCode() {
        return (this.f228786a.hashCode() * 31) + this.f228787b.hashCode();
    }

    public String toString() {
        return "SelectUserActionResult(operation=" + this.f228786a + ", retCode=" + this.f228787b + ')';
    }
}
