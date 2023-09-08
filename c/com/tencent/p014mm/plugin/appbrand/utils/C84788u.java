package com.tencent.p014mm.plugin.appbrand.utils;

import com.tencent.p014mm.plugin.appbrand.report.C84112f0;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gy3.C87412m;
import p1031sb.C90157d;
import p823sg.C77710q;
import sx3.C110818d0;
import sx3.C64197v;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.u */
public final class C84788u {
    /* renamed from: a */
    public static final String m104467a(int i) {
        C90157d dVar = C90157d.C90158a.f258859a;
        if (dVar != null) {
            return ((C84112f0) dVar).mo116785b(Util.nowMilliSecond());
        }
        String a = C77710q.m93738a(i);
        C87412m.m108593f(a, "getString(uin)");
        return C110818d0.m150921S(C64197v.m75537f(a, String.valueOf(Util.nowMilliSecond())), "_", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
    }

    /* renamed from: b */
    public static final boolean m104468b(String str) {
        return !(str == null || str.length() == 0);
    }
}
