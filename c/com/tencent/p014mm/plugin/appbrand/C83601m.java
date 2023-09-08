package com.tencent.p014mm.plugin.appbrand;

import android.app.Activity;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83588k;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPluginUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.XWebSdk;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.appbrand.m */
public final class C83601m {

    /* renamed from: com.tencent.mm.plugin.appbrand.m$a */
    public static final class C83602a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRuntime f244169d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83602a(AppBrandRuntime appBrandRuntime) {
            super(0);
            this.f244169d = appBrandRuntime;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
            if (com.tencent.p014mm.plugin.appbrand.C29611p4.m38833a() != false) goto L_0x006c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0068, code lost:
            if (r0 == false) goto L_0x006b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r4 = this;
                com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r4.f244169d
                java.lang.String r0 = r0.f238147j
                java.lang.String r1 = "wxb1320569c2a2b6d2"
                boolean r0 = gy3.C87412m.m108589b(r1, r0)
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x002f
                com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r4.f244169d
                boolean r3 = r0 instanceof com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC
                if (r3 == 0) goto L_0x0018
                com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r0
                goto L_0x0019
            L_0x0018:
                r0 = 0
            L_0x0019:
                if (r0 == 0) goto L_0x0025
                r3 = 1190(0x4a6, float:1.668E-42)
                int r0 = r0.mo113208k1()
                if (r3 != r0) goto L_0x0025
                r0 = 1
                goto L_0x0026
            L_0x0025:
                r0 = 0
            L_0x0026:
                if (r0 == 0) goto L_0x002f
                boolean r0 = com.tencent.p014mm.plugin.appbrand.C29611p4.m38833a()
                if (r0 == 0) goto L_0x002f
                goto L_0x006c
            L_0x002f:
                com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r4.f244169d
                java.lang.Class<lc.b0> r3 = p194lc.C88435b0.class
                com.tencent.mm.plugin.appbrand.jsapi.m r0 = r0.mo113021O(r3, r2)
                lc.b0 r0 = (p194lc.C88435b0) r0
                if (r0 == 0) goto L_0x0043
                boolean r0 = r0.mo122836a()
                if (r0 != r1) goto L_0x0043
                r0 = 1
                goto L_0x0044
            L_0x0043:
                r0 = 0
            L_0x0044:
                if (r0 == 0) goto L_0x006b
                com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r4.f244169d
                com.tencent.mm.plugin.appbrand.config.a r0 = r0.mo113008F()
                if (r0 == 0) goto L_0x0067
                com.tencent.mm.plugin.appbrand.config.a$g r0 = r0.f239619y
                if (r0 == 0) goto L_0x0067
                java.lang.String[] r0 = r0.f239631b
                int r3 = r0.length
                if (r3 != r1) goto L_0x0062
                java.lang.String r3 = "skyline"
                boolean r0 = u24.C90595a.m113498b(r0, r3)
                if (r0 == 0) goto L_0x0062
                r0 = 1
                goto L_0x0063
            L_0x0062:
                r0 = 0
            L_0x0063:
                if (r0 != r1) goto L_0x0067
                r0 = 1
                goto L_0x0068
            L_0x0067:
                r0 = 0
            L_0x0068:
                if (r0 == 0) goto L_0x006b
                goto L_0x006c
            L_0x006b:
                r1 = 0
            L_0x006c:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.C83601m.C83602a.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.m$b */
    public static final class C83603b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C83603b f244170d = new C83603b();

        public C83603b() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(XWebSdk.isXWebView() && XWebSdk.hasXWebFeature(2003));
        }
    }

    /* renamed from: a */
    public static final boolean m102633a(C81820e3 e3Var, AppBrandRuntime appBrandRuntime) {
        boolean z;
        C87412m.m108594g(e3Var, "container");
        C87412m.m108594g(appBrandRuntime, "rt");
        boolean z2 = false;
        if (appBrandRuntime instanceof C83588k) {
            return false;
        }
        if (e3Var instanceof C81895h2) {
            z = true;
        } else if (e3Var instanceof AppBrandRuntimeContainerWC) {
            Activity w = ((AppBrandRuntimeContainerWC) e3Var).mo120548w();
            if (w == null) {
                Log.m105920e("MicroMsg.AppBrandPersistentRuntimeConfig", "canKeepPersistent, container.activity == NULL");
                return false;
            }
            z = w instanceof AppBrandPluginUI;
        } else {
            z = false;
        }
        if (!z || !AppBrandRuntimeWCAccessible.isGame(appBrandRuntime)) {
            C83603b bVar = C83603b.f244170d;
            C83602a aVar = new C83602a(appBrandRuntime);
            if (z && (((Boolean) bVar.invoke()).booleanValue() || ((Boolean) aVar.invoke()).booleanValue())) {
                z2 = true;
            }
            Log.m105924i("MicroMsg.AppBrandPersistentRuntimeConfig", "canKeepPersistent, containerUI[" + e3Var + "], return " + z2 + " for appId:" + appBrandRuntime.f238147j);
            return z2;
        }
        Log.m105924i("MicroMsg.AppBrandPersistentRuntimeConfig", "canKeepPersistent, containerUI[" + e3Var + "], isGame:true");
        return true;
    }
}
