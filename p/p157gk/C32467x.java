package p157gk;

import gy3.C87412m;
import java.util.List;

/* renamed from: gk.x */
public final class C32467x {

    /* renamed from: a */
    public final String f86263a;

    /* renamed from: b */
    public final List<Integer> f86264b;

    public C32467x(String str, List<Integer> list) {
        C87412m.m108594g(str, "labelName");
        C87412m.m108594g(list, "labelId");
        this.f86263a = str;
        this.f86264b = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32467x)) {
            return false;
        }
        C32467x xVar = (C32467x) obj;
        return C87412m.m108589b(this.f86263a, xVar.f86263a) && C87412m.m108589b(this.f86264b, xVar.f86264b);
    }

    public int hashCode() {
        return (this.f86263a.hashCode() * 31) + this.f86264b.hashCode();
    }

    public String toString() {
        return "SearchBarConnectListItem(labelName=" + this.f86263a + ", labelId=" + this.f86264b + ')';
    }
}
