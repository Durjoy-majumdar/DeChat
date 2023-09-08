package oz3;

import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import j04.C24774s;
import kz3.C24866g;
import n04.C25143j0;
import n04.C25146k0;
import n04.C25176s0;
import p04.C25416i;
import p04.C25417j;
import qz3.C26065q;
import tz3.C26349a;

/* renamed from: oz3.i */
public final class C25381i implements C24774s {

    /* renamed from: a */
    public static final C25381i f71923a = new C25381i();

    /* renamed from: a */
    public C25143j0 mo51754a(C26065q qVar, String str, C25176s0 s0Var, C25176s0 s0Var2) {
        C87412m.m108594g(qVar, TPReportKeys.Common.COMMON_PROTO);
        C87412m.m108594g(str, "flexibleId");
        C87412m.m108594g(s0Var, "lowerBound");
        C87412m.m108594g(s0Var2, "upperBound");
        if (C87412m.m108589b(str, "kotlin.jvm.PlatformType")) {
            return qVar.mo53572g(C26349a.f73459g) ? new C24866g(s0Var, s0Var2) : C25146k0.m31957c(s0Var, s0Var2);
        }
        return C25417j.m32698c(C25416i.ERROR_FLEXIBLE_TYPE, str, s0Var.toString(), s0Var2.toString());
    }
}
