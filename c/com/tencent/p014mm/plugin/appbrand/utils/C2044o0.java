package com.tencent.p014mm.plugin.appbrand.utils;

import gy3.C87412m;
import p206nj.C117627q;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.o0 */
public final class C2044o0 {
    /* renamed from: a */
    public static final String m1995a(String str) {
        C87412m.m108594g(str, "<this>");
        if (str.length() > 1024) {
            str = str.substring(0, 1024);
            C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        if (!C112550d0.m153801u(str, ",", false)) {
            return str;
        }
        String b = C117627q.m165909b(str, "UTF-8");
        return b == null ? "" : b;
    }
}
