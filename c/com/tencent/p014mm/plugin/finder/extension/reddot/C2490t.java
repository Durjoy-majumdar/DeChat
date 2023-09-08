package com.tencent.p014mm.plugin.finder.extension.reddot;

import gy3.C87412m;
import te3.C64858yi1;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.t */
public final class C2490t {

    /* renamed from: a */
    public static final C2490t f13006a = new C2490t();

    /* renamed from: b */
    public static int f13007b = -1;

    /* renamed from: c */
    public static long f13008c;

    /* renamed from: d */
    public static String f13009d = "";

    /* renamed from: a */
    public final void mo2469a(C55718s0 s0Var) {
        if (s0Var == null) {
            f13007b = -1;
            f13008c = 0;
            f13009d = "";
            return;
        }
        C64858yi1 yi12 = s0Var.f158585F;
        f13007b = yi12.f186555p;
        f13008c = yi12.f186549g;
        String str = s0Var.field_tipsId;
        C87412m.m108593f(str, "ctrInfo.field_tipsId");
        f13009d = str;
    }
}
