package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.plugin.appbrand.appcache.C81247g3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81298o0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81301p0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81364t3;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPluginPkgInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashSet;
import java.util.List;
import p1044ub.C90630c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.appbrand.page.k3 */
public final class C83842k3 implements C29613m3 {

    /* renamed from: a */
    public final C83745a<?> f244717a;

    /* renamed from: b */
    public final WxaRuntimeModulePluginListMap f244718b;

    /* renamed from: c */
    public final String f244719c = "Luggage.FULL.IWxaPageSeparatedPluginsInjectHelper.IMPL";

    /* renamed from: d */
    public final C13601g f244720d = C36568h.m40985a(new C83843a(this));

    /* renamed from: e */
    public final HashSet<String> f244721e = new HashSet<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.page.k3$a */
    public static final class C83843a extends C87413o implements C32224a<C81298o0> {

        /* renamed from: d */
        public final /* synthetic */ C83842k3 f244722d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83843a(C83842k3 k3Var) {
            super(0);
            this.f244722d = k3Var;
        }

        public Object invoke() {
            C82381f Z = this.f244722d.f244717a.mo124764Z();
            C87412m.m108591d(Z);
            C81301p0 k = C81247g3.m99555k(((C90630c) Z).getRuntime(), false);
            C87412m.m108592e(k, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.IWxaPkgRuntimeReader");
            return k;
        }
    }

    public C83842k3(C83745a<?> aVar, WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap) {
        C87412m.m108594g(aVar, "renderer");
        C87412m.m108594g(wxaRuntimeModulePluginListMap, "separatedPluginsMap");
        this.f244717a = aVar;
        this.f244718b = wxaRuntimeModulePluginListMap;
    }

    /* renamed from: a */
    public void mo56848a(String str, boolean z) {
        C87412m.m108594g(str, "moduleName");
        String str2 = this.f244719c;
        Log.m105924i(str2, "injectPlugins moduleName(" + str + ") useLazyCodeLoading(" + z + ") hash(" + hashCode() + ')');
        List<WxaPluginPkgInfo> b = this.f244718b.mo113464b(str);
        if (b == null) {
            String i = C81412d0.m99875i(str);
            if (C87412m.m108589b(i, str)) {
                b = null;
            } else {
                WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap = this.f244718b;
                C87412m.m108593f(i, "fixedName");
                b = wxaRuntimeModulePluginListMap.mo113464b(i);
            }
        }
        if (b == null || b.isEmpty()) {
            String str3 = this.f244719c;
            Log.m105924i(str3, "injectPlugins, try with module(" + str + "), get empty pluginList");
            return;
        }
        for (WxaPluginPkgInfo a : b) {
            String a2 = C81364t3.f238855j.mo113652a(str, a);
            if (z) {
                if (((C81298o0) ((C36570n) this.f244720d).getValue()).mo113501d(a2 + "/common.app.js")) {
                    C83745a<?> aVar = this.f244717a;
                    mo116328b(aVar, a2 + "/common.app.js");
                    C83745a<?> aVar2 = this.f244717a;
                    mo116328b(aVar2, a2 + "/webview.app.js");
                }
            }
            C83745a<?> aVar3 = this.f244717a;
            mo116328b(aVar3, a2 + "/pageframe.js");
        }
    }

    /* renamed from: b */
    public final void mo116328b(C83745a<?> aVar, String str) {
        if (!this.f244721e.contains(str)) {
            String str2 = this.f244719c;
            Log.m105924i(str2, "inner evaluateScriptFile fileName(" + str + ") hash(" + hashCode() + ')');
            aVar.mo116066m0(str, aVar.mo116065l0().mo116116a(str));
            this.f244721e.add(str);
        }
    }
}
