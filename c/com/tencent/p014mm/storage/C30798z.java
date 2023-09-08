package com.tencent.p014mm.storage;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WebViewUtilities;
import gy3.C87412m;

/* renamed from: com.tencent.mm.storage.z */
public final class C30798z {

    /* renamed from: a */
    public static final C30798z f82801a = new C30798z();

    /* renamed from: a */
    public final void mo57722a(C19623o0 o0Var, int i, int i2, int i3, int i4, int i5, long j, String str, String str2, String str3) {
        C19623o0 o0Var2 = o0Var;
        C87412m.m108594g(o0Var, "info");
        if (o0Var.mo25758F2()) {
            C115669n.INSTANCE.mo160131h(20800, 2, Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(o0Var.mo25776z2()), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Long.valueOf(j), str, str2, WebViewUtilities.doUrlEncode(Util.nullAsNil(str3)));
        }
    }

    /* renamed from: b */
    public final void mo57723b(int i, int i2, int i3, int i4, int i5, long j, String str, String str2, String str3) {
        C115669n.INSTANCE.mo160131h(20800, 1, 0, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Long.valueOf(j), str, str2, WebViewUtilities.doUrlEncode(Util.nullAsNil(str3)));
    }
}
