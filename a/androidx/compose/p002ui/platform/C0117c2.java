package androidx.compose.p002ui.platform;

import gy3.C87412m;

/* renamed from: androidx.compose.ui.platform.c2 */
public final class C0117c2 {

    /* renamed from: a */
    public final String f552a;

    /* renamed from: b */
    public final Object f553b;

    public C0117c2(String str, Object obj) {
        C87412m.m108594g(str, "name");
        this.f552a = str;
        this.f553b = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0117c2)) {
            return false;
        }
        C0117c2 c2Var = (C0117c2) obj;
        return C87412m.m108589b(this.f552a, c2Var.f552a) && C87412m.m108589b(this.f553b, c2Var.f553b);
    }

    public int hashCode() {
        int hashCode = this.f552a.hashCode() * 31;
        Object obj = this.f553b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "ValueElement(name=" + this.f552a + ", value=" + this.f553b + ')';
    }
}
