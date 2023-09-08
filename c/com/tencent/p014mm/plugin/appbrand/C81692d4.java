package com.tencent.p014mm.plugin.appbrand;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.C83907r4;
import com.tencent.p014mm.sdk.platformtools.Log;
import kr0.C88267e;
import p958eb.C86474e;
import p958eb.C86476g;

/* renamed from: com.tencent.mm.plugin.appbrand.d4 */
public final class C81692d4 {
    /* renamed from: a */
    public static Bitmap m100243a(AppBrandRuntime appBrandRuntime) {
        if (appBrandRuntime instanceof AppBrandRuntimeWC) {
            return ((AppBrandRuntimeWC) appBrandRuntime).mo121249e1();
        }
        if (AppBrandRuntimeWCAccessible.isGame(appBrandRuntime)) {
            C86474e eVar = (C86474e) ((C88267e) appBrandRuntime.mo113047b0()).mo125517G0(C86474e.class);
            if (eVar != null) {
                return eVar.mo120910U().f235098n.mo123494c();
            }
            Log.printErrStackTrace("MicroMsg.AppBrand.RuntimeRestartHelper", new C86476g(), "hy: not game service", new Object[0]);
            return null;
        }
        C83820i0 currentPage = appBrandRuntime.mo113042Z().getCurrentPage();
        if (currentPage == null) {
            return null;
        }
        return C83907r4.m103302b(currentPage);
    }
}
