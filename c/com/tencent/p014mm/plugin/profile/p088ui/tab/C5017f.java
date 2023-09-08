package com.tencent.p014mm.plugin.profile.p088ui.tab;

import gy3.C87412m;
import java.util.Map;
import q31.C118148a;
import rx3.C13604l;
import sx3.C36903g0;
import sx3.C90363p0;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.f */
public final class C5017f implements C118148a {

    /* renamed from: a */
    public final /* synthetic */ boolean f20330a;

    public C5017f(boolean z) {
        this.f20330a = z;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public final Map<String, Object> mo37b(String str) {
        return C87412m.m108589b(str, "view_clk") ? C90363p0.m113143b(new C13604l("live_reserve_action_type", Integer.valueOf(this.f20330a ? 1 : 0))) : C36903g0.f97931d;
    }
}
