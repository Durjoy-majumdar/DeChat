package p968gb;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import java.util.HashMap;
import java.util.Map;
import p1006mb.C88720a;
import p284zb.C91635f;
import tm0.C90551r;

/* renamed from: gb.c */
public final class C87172c extends C90551r<C91635f> {
    public C87172c() {
        super(new C87168a());
    }

    /* renamed from: v */
    public Map mo121609v(C82381f fVar) {
        C91635f fVar2 = (C91635f) fVar;
        Map<String, Object> x = super.mo121609v(fVar2);
        int a = C88720a.m110688a(fVar2);
        if (a > 0) {
            ((HashMap) x).put("statusBarHeight", Integer.valueOf(a));
        }
        return x;
    }

    /* renamed from: x */
    public Map mo121610x(C81879g gVar) {
        C91635f fVar = (C91635f) gVar;
        Map<String, Object> x = super.mo121609v(fVar);
        int a = C88720a.m110688a(fVar);
        if (a > 0) {
            ((HashMap) x).put("statusBarHeight", Integer.valueOf(a));
        }
        return x;
    }
}
