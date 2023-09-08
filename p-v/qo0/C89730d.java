package qo0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import gy3.C87412m;
import p830xc.C91165a;

/* renamed from: qo0.d */
public final class C89730d {
    /* renamed from: a */
    public static final AppBrandRuntime m112186a(C91165a aVar) {
        C87412m.m108594g(aVar, "<this>");
        if (aVar instanceof C81823b) {
            C82381f g = ((C81823b) aVar).mo62544g();
            if (g instanceof C81879g) {
                AppBrandRuntime runtime = ((C81879g) g).getRuntime();
                C87412m.m108593f(runtime, "component.runtime");
                return runtime;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
