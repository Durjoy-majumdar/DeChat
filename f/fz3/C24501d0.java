package fz3;

import gy3.C8480h;
import gy3.C87412m;
import java.util.Map;
import rx3.C36568h;
import sx3.C36903g0;
import vz3.C22826c;

/* renamed from: fz3.d0 */
public final class C24501d0 {

    /* renamed from: a */
    public final C24507k0 f70026a;

    /* renamed from: b */
    public final C24507k0 f70027b;

    /* renamed from: c */
    public final Map<C22826c, C24507k0> f70028c;

    /* renamed from: d */
    public final boolean f70029d;

    public C24501d0(C24507k0 k0Var, C24507k0 k0Var2, Map<C22826c, C24507k0> map, int i, C8480h hVar) {
        k0Var2 = (i & 2) != 0 ? null : k0Var2;
        map = (i & 4) != 0 ? C36903g0.f97931d : map;
        C87412m.m108594g(k0Var, "globalLevel");
        C87412m.m108594g(map, "userDefinedLevelForSpecificAnnotation");
        this.f70026a = k0Var;
        this.f70027b = k0Var2;
        this.f70028c = map;
        C36568h.m40985a(new C24499c0(this));
        C24507k0 k0Var3 = C24507k0.IGNORE;
        this.f70029d = k0Var == k0Var3 && k0Var2 == k0Var3 && map.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24501d0)) {
            return false;
        }
        C24501d0 d0Var = (C24501d0) obj;
        return this.f70026a == d0Var.f70026a && this.f70027b == d0Var.f70027b && C87412m.m108589b(this.f70028c, d0Var.f70028c);
    }

    public int hashCode() {
        int hashCode = this.f70026a.hashCode() * 31;
        C24507k0 k0Var = this.f70027b;
        return ((hashCode + (k0Var == null ? 0 : k0Var.hashCode())) * 31) + this.f70028c.hashCode();
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f70026a + ", migrationLevel=" + this.f70027b + ", userDefinedLevelForSpecificAnnotation=" + this.f70028c + ')';
    }
}
