package oz3;

import gy3.C87412m;
import java.util.Map;
import jz3.C24821j;
import m04.C24979m;
import wy3.C26521y0;
import wy3.C26524z0;

/* renamed from: oz3.r */
public final class C25401r implements C26521y0 {

    /* renamed from: b */
    public final C24821j f71940b;

    public C25401r(C24821j jVar) {
        C87412m.m108594g(jVar, "packageFragment");
        this.f71940b = jVar;
    }

    /* renamed from: a */
    public C26524z0 mo37215a() {
        return C26524z0.f73810a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f71940b);
        sb.append(": ");
        C24821j jVar = this.f71940b;
        sb.append(((Map) C24979m.m31587a(jVar.f70775o, jVar, C24821j.f70772s[0])).keySet());
        return sb.toString();
    }
}
