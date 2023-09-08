package p194lc;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: lc.w */
public final class C88468w {
    /* renamed from: a */
    public static final boolean m110319a(AppBrandRuntime appBrandRuntime, String str) {
        C87412m.m108594g(appBrandRuntime, "runtime");
        C87412m.m108594g(str, "routeUrl");
        return m110320a(appBrandRuntime, str, false);
    }

    /* renamed from: b */
    public static final void m110321b(AppBrandRuntime appBrandRuntime, boolean z, String str, boolean z2, String str2) {
        Log.m105924i("MicroMsg.SkylineRuntimeBoot", "use skyline?" + z2 + ", reason:" + str2 + ", appId:" + appBrandRuntime.f238147j + ", preloadTabSiblings:" + z + ", url:" + str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m110320a(com.tencent.p014mm.plugin.appbrand.AppBrandRuntime r7, java.lang.String r8, boolean r9) {
        /*
            java.lang.String r0 = "runtime"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "routeUrl"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.Class<lc.b0> r0 = p194lc.C88435b0.class
            r1 = 0
            com.tencent.mm.plugin.appbrand.jsapi.m r0 = r7.mo113021O(r0, r1)
            lc.b0 r0 = (p194lc.C88435b0) r0
            r2 = 1
            if (r0 == 0) goto L_0x0056
            int r3 = r8.length()
            if (r3 != 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r3 == 0) goto L_0x0024
            goto L_0x002a
        L_0x0024:
            boolean r3 = r0.mo122836a()
            if (r3 != 0) goto L_0x002c
        L_0x002a:
            r0 = 0
            goto L_0x0052
        L_0x002c:
            r3 = 2
            int r4 = r0.f255447i
            if (r3 != r4) goto L_0x0032
            goto L_0x0048
        L_0x0032:
            lc.b0$b r0 = r0.f255444f
            if (r0 == 0) goto L_0x0039
            java.util.List<java.lang.String> r0 = r0.f92265b
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            if (r0 == 0) goto L_0x0045
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r3 = 0
            goto L_0x0046
        L_0x0045:
            r3 = 1
        L_0x0046:
            if (r3 == 0) goto L_0x004a
        L_0x0048:
            r0 = 1
            goto L_0x0052
        L_0x004a:
            java.lang.String r3 = p225rc.C89925n.m112488a(r8)
            boolean r0 = r0.contains(r3)
        L_0x0052:
            if (r0 != 0) goto L_0x0056
            r0 = 1
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = "config.isEnabled == false"
            m110321b(r7, r9, r8, r1, r0)
            return r1
        L_0x005f:
            com.tencent.mm.plugin.appbrand.config.a r0 = r7.mo113008F()
            if (r0 != 0) goto L_0x0066
            return r1
        L_0x0066:
            java.lang.String r3 = p225rc.C89925n.m112488a(r8)
            com.tencent.mm.plugin.appbrand.config.a$e r3 = r0.mo113984c(r3)
            java.lang.String r3 = r3.f239664n
            java.lang.String r4 = "skyline"
            boolean r3 = u24.C90599h.m113509b(r4, r3)
            if (r3 == 0) goto L_0x0080
            java.lang.String r0 = "page.renderer=skyline"
            m110321b(r7, r9, r8, r2, r0)
            return r2
        L_0x0080:
            java.lang.String r3 = p225rc.C89925n.m112488a(r8)
            com.tencent.mm.plugin.appbrand.config.a$e r3 = r0.mo113984c(r3)
            java.lang.String r3 = r3.f239664n
            java.lang.String r5 = "webview"
            boolean r3 = u24.C90599h.m113509b(r5, r3)
            if (r3 == 0) goto L_0x009a
            java.lang.String r0 = "page.renderer=webview"
            m110321b(r7, r9, r8, r1, r0)
            return r1
        L_0x009a:
            if (r9 == 0) goto L_0x00e6
            com.tencent.mm.plugin.appbrand.config.a$i r3 = r0.mo113985d()
            if (r3 == 0) goto L_0x00aa
            boolean r3 = r3.mo113990a(r8)
            if (r3 != r2) goto L_0x00aa
            r3 = 1
            goto L_0x00ab
        L_0x00aa:
            r3 = 0
        L_0x00ab:
            if (r3 == 0) goto L_0x00e6
            com.tencent.mm.plugin.appbrand.config.a$i r3 = r0.mo113985d()
            java.util.ArrayList<com.tencent.mm.plugin.appbrand.config.a$j> r3 = r3.f239644g
            java.lang.String r5 = "appConfig.tabBar.items"
            gy3.C87412m.m108593f(r3, r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x00bc:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00e6
            java.lang.Object r5 = r3.next()
            com.tencent.mm.plugin.appbrand.config.a$j r5 = (com.tencent.p014mm.plugin.appbrand.config.C81634a.C81644j) r5
            java.lang.String r5 = r5.f239645a
            java.lang.String r6 = "it.url"
            gy3.C87412m.m108593f(r5, r6)
            java.lang.String r5 = p225rc.C89925n.m112488a(r5)
            com.tencent.mm.plugin.appbrand.config.a$e r5 = r0.mo113984c(r5)
            java.lang.String r5 = r5.f239664n
            boolean r5 = u24.C90599h.m113509b(r4, r5)
            if (r5 == 0) goto L_0x00bc
            java.lang.String r0 = "tryPreloadTabSiblings"
            m110321b(r7, r9, r8, r2, r0)
            return r2
        L_0x00e6:
            com.tencent.mm.plugin.appbrand.config.a$g r0 = r0.f239619y
            java.lang.String r0 = r0.f239630a
            boolean r0 = u24.C90599h.m113509b(r0, r4)
            if (r0 == 0) goto L_0x00f6
            java.lang.String r0 = "app.renderer=skyline"
            m110321b(r7, r9, r8, r2, r0)
            return r2
        L_0x00f6:
            java.lang.String r0 = "default"
            m110321b(r7, r9, r8, r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p194lc.C88468w.m110320a(com.tencent.mm.plugin.appbrand.AppBrandRuntime, java.lang.String, boolean):boolean");
    }
}
