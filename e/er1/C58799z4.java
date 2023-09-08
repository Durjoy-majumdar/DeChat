package er1;

import android.view.View;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: er1.z4 */
public final class C58799z4 {

    /* renamed from: a */
    public final View f168342a;

    /* renamed from: b */
    public final boolean f168343b;

    /* renamed from: c */
    public final C58683a5 f168344c;

    /* renamed from: d */
    public final C31686y4 f168345d;

    public C58799z4(View view, boolean z, C58683a5 a5Var, C31686y4 y4Var, int i, C8480h hVar) {
        a5Var = (i & 4) != 0 ? new C58683a5(0, 0, 0) : a5Var;
        y4Var = (i & 8) != 0 ? new C31686y4(1.0f, 1.0f, 1.0f) : y4Var;
        C87412m.m108594g(view, "view");
        C87412m.m108594g(a5Var, "lpHeight");
        C87412m.m108594g(y4Var, "alpha");
        this.f168342a = view;
        this.f168343b = z;
        this.f168344c = a5Var;
        this.f168345d = y4Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58799z4)) {
            return false;
        }
        C58799z4 z4Var = (C58799z4) obj;
        return C87412m.m108589b(this.f168342a, z4Var.f168342a) && this.f168343b == z4Var.f168343b && C87412m.m108589b(this.f168344c, z4Var.f168344c) && C87412m.m108589b(this.f168345d, z4Var.f168345d);
    }

    public int hashCode() {
        int hashCode = this.f168342a.hashCode() * 31;
        boolean z = this.f168343b;
        if (z) {
            z = true;
        }
        return ((((hashCode + (z ? 1 : 0)) * 31) + this.f168344c.hashCode()) * 31) + this.f168345d.hashCode();
    }

    public String toString() {
        return "InOutConf(view=" + this.f168342a + ", resetAfterFinish=" + this.f168343b + ", lpHeight=" + this.f168344c + ", alpha=" + this.f168345d + ')';
    }
}
