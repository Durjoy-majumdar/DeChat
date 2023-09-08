package com.tencent.p014mm.plugin.finder.view;

import gy3.C87412m;
import java.util.Map;
import q31.C118148a;
import rx3.C13604l;
import sx3.C36903g0;
import sx3.C90363p0;
import te3.C49098d51;

/* renamed from: com.tencent.mm.plugin.finder.view.f2 */
public final class C4052f2 implements C118148a {

    /* renamed from: a */
    public final /* synthetic */ C49098d51 f18166a;

    public C4052f2(C49098d51 d512) {
        this.f18166a = d512;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public final Map<String, Object> mo37b(String str) {
        if (!C87412m.m108589b(str, "view_clk")) {
            return C36903g0.f97931d;
        }
        int i = 1;
        if (this.f18166a.f132119e == 1) {
            i = 0;
        }
        return C90363p0.m113143b(new C13604l("live_reserve_action_type", Integer.valueOf(i)));
    }
}
