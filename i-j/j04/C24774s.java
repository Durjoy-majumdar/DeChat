package j04;

import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import n04.C25143j0;
import n04.C25176s0;
import qz3.C26065q;

/* renamed from: j04.s */
public interface C24774s {

    /* renamed from: j04.s$a */
    public static final class C24775a implements C24774s {

        /* renamed from: a */
        public static final C24775a f70663a = new C24775a();

        /* renamed from: a */
        public C25143j0 mo51754a(C26065q qVar, String str, C25176s0 s0Var, C25176s0 s0Var2) {
            C87412m.m108594g(qVar, TPReportKeys.Common.COMMON_PROTO);
            C87412m.m108594g(str, "flexibleId");
            C87412m.m108594g(s0Var, "lowerBound");
            C87412m.m108594g(s0Var2, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    /* renamed from: a */
    C25143j0 mo51754a(C26065q qVar, String str, C25176s0 s0Var, C25176s0 s0Var2);
}
