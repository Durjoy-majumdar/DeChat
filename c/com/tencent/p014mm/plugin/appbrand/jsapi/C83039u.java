package com.tencent.p014mm.plugin.appbrand.jsapi;

import gy3.C87412m;
import java.util.HashMap;
import p284zb.C91635f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.u */
public final class C83039u extends C82926s {
    public static final int CTRL_INDEX = 754;
    public static final String NAME = "onCopyUrl";

    /* renamed from: i */
    public final boolean f242768i;

    public C83039u(boolean z) {
        this.f242768i = z;
    }

    /* renamed from: s */
    public final void mo115295s(int i, C91635f fVar) {
        C87412m.m108594g(fVar, "service");
        HashMap hashMap = new HashMap();
        hashMap.put("webviewId", Integer.valueOf(i));
        hashMap.put("shortLinkEnable", Boolean.valueOf(this.f242768i));
        mo115194p(fVar);
        mo115165o(hashMap);
        mo115158h();
    }
}
