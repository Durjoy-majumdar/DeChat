package com.tencent.p014mm.plugin.scanner.p101ui;

import android.os.Build;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.scanner.ui.i */
public final class C30390i {
    /* renamed from: a */
    public static final void m39055a(boolean z, boolean z2, String str, int i, int i2) {
        C87412m.m108594g(str, "processInfo");
        C115669n.INSTANCE.mo160131h(25634, Integer.valueOf(z ? 1 : 2), Integer.valueOf(z2 ? 1 : 2), str, Integer.valueOf(i), BuildInfo.REV, 0, 0, 0, "", "", 0, 0, 0, "", 0, 0, 0, 0, 0, 0, Build.FINGERPRINT, Integer.valueOf(i2));
    }
}
