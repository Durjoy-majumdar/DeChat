package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import fp0.C87032c;
import fp0.C87041h;
import gy3.C87412m;
import ik0.C87744a;
import java.util.List;
import te3.C90437rw3;
import yq0.C91566l;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.h */
public final class C83560h implements C91566l.C91569b, C87744a.C87747b {

    /* renamed from: d */
    public static final C83560h f244111d = new C83560h();

    public C87744a Bq0(C81879g gVar) {
        C87412m.m108594g(gVar, "component");
        return new C87041h(gVar);
    }

    /* renamed from: e5 */
    public C91566l mo115879e5(C81879g gVar, C91566l.C91570c cVar, List<? extends C90437rw3> list) {
        C87412m.m108594g(gVar, "component");
        C87412m.m108594g(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        return new C87032c(gVar, cVar);
    }
}
