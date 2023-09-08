package p968gb;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import gy3.C87412m;
import java.util.Map;
import p1006mb.C88720a;
import p284zb.C91635f;
import tm0.C90555t0;

/* renamed from: gb.b */
public final class C87171b extends C90555t0<C91635f> {
    /* renamed from: c */
    public void mo121608c(C81879g gVar, Map map) {
        C91635f fVar = (C91635f) gVar;
        C87412m.m108594g(fVar, "component");
        C87412m.m108594g(map, "outRes");
        int a = C88720a.m110688a(fVar);
        if (a > 0) {
            map.put("statusBarHeight", Integer.valueOf(a));
        }
    }
}
