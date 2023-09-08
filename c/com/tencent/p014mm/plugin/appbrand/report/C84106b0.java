package com.tencent.p014mm.plugin.appbrand.report;

import com.tencent.p014mm.plugin.appbrand.page.C40502j2;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.xweb.XWebSdk;
import java.util.Locale;

/* renamed from: com.tencent.mm.plugin.appbrand.report.b0 */
public enum C84106b0 {
    Sys,
    XWalk,
    Skyline,
    Invalid;

    /* renamed from: a */
    public static C84106b0 m103652a(C83928t1 t1Var) {
        boolean z;
        boolean z2;
        C84106b0 b0Var = Invalid;
        if (t1Var == null) {
            z = XWebSdk.isSysWebView();
            z2 = XWebSdk.isXWebView();
        } else if (t1Var.mo116168W0()) {
            return Skyline;
        } else {
            C40502j2 M1 = t1Var.mo116525M1();
            if (M1 == null) {
                return b0Var;
            }
            boolean isSysKernel = M1.isSysKernel();
            z2 = M1.isXWalkKernel();
            z = isSysKernel;
        }
        boolean[] zArr = {z, z2, false};
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            if (zArr[i2]) {
                i++;
            }
        }
        if (i == 1) {
            return z2 ? XWalk : Sys;
        }
        if (!BuildInfo.DEBUG) {
            return b0Var;
        }
        throw new IllegalStateException(String.format(Locale.US, "WebViewType invalid sys[%B] xw[%B] x5[%B]", new Object[]{Boolean.valueOf(z), Boolean.valueOf(z2), false}));
    }
}
