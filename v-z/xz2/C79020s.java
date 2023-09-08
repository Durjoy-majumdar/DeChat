package xz2;

import com.tencent.xweb.WCWebUpdater;
import gy3.C87412m;
import java.util.List;
import p261wl.C38166b;
import p261wl.C38174i;
import qy2.C77456r;
import uz2.C65488a0;

/* renamed from: xz2.s */
public final class C79020s {
    /* renamed from: a */
    public static final C65488a0 m95585a(List<? extends C65488a0> list) {
        C87412m.m108594g(list, "<this>");
        for (C65488a0 a0Var : list) {
            C79019r rVar = C79019r.f232026a;
            String str = a0Var.f188439d;
            boolean z = true;
            if (C79019r.f232027b.get(str) == null) {
                if (str != null) {
                    C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C77456r.class);
                    C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
                    while (true) {
                        if (bVar.hasNext()) {
                            if (((C38174i) bVar.next()).hasKey(str)) {
                                continue;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = false;
                continue;
            }
            if (z) {
                return a0Var;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m95586b(C65488a0 a0Var) {
        C87412m.m108594g(a0Var, "<this>");
        return C87412m.m108589b(a0Var.f188439d, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY) || C87412m.m108589b(a0Var.f188439d, "7");
    }
}
