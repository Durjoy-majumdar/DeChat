package gq0;

import android.view.ContextMenu;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: gq0.l0 */
public final class C8373l0 implements ContextMenu.ContextMenuInfo {

    /* renamed from: a */
    public final String f27360a;

    /* renamed from: b */
    public final String f27361b;

    /* renamed from: c */
    public final boolean f27362c;

    /* renamed from: d */
    public final String f27363d;

    public C8373l0(String str, String str2, boolean z) {
        C87412m.m108594g(str, "line1");
        this.f27360a = str;
        this.f27361b = str2;
        this.f27362c = z;
        if (str2 != null) {
            str = str + 10 + str2;
        }
        this.f27363d = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8373l0)) {
            return false;
        }
        C8373l0 l0Var = (C8373l0) obj;
        return C87412m.m108589b(this.f27360a, l0Var.f27360a) && C87412m.m108589b(this.f27361b, l0Var.f27361b) && this.f27362c == l0Var.f27362c;
    }

    public int hashCode() {
        int hashCode = this.f27360a.hashCode() * 31;
        String str = this.f27361b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f27362c;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }

    public String toString() {
        return "RawFunctionName2Show(line1=" + this.f27360a + ", line2=" + this.f27361b + ", needEllipsize=" + this.f27362c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8373l0(String str, String str2, boolean z, int i, C8480h hVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
    }
}
