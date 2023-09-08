package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import fy3.C32229r;
import gy3.C87412m;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import pe3.C47465a;
import rx3.C13598b0;
import te3.C49335eu3;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.o */
public final class C2130o implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ C32229r<Integer, Integer, String, C49335eu3, C13598b0> f12100d;

    public C2130o(C32229r<? super Integer, ? super Integer, ? super String, C49335eu3, C13598b0> rVar) {
        this.f12100d = rVar;
    }

    /* renamed from: a */
    public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        C32229r<Integer, Integer, String, C49335eu3, C13598b0> rVar = this.f12100d;
        if (rVar == null) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        if (str == null) {
            str = "";
        }
        C47465a aVar = cVar.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type T of com.tencent.mm.plugin.brandservice.ui.timeline.preload.CGIExKt.runCGI");
        rVar.mo162I(valueOf, valueOf2, str, (C49335eu3) aVar);
        return 0;
    }
}
