package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.c */
public final class C82699c implements C82729j0 {

    /* renamed from: d */
    public static final C82699c f241991d = new C82699c();

    /* renamed from: e */
    public static final C13601g f241992e = C36568h.m40985a(C1731a.f11432d);

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.c$a */
    public static final class C1731a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C1731a f11432d = new C1731a();

        public C1731a() {
            super(0);
        }

        public Object invoke() {
            C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
            boolean z = true;
            if (hVar != null) {
                z = hVar.mo58784wf(C32735h.C32737c.clicfg_appbrand_android_use_audio_focus_service, true);
            }
            Boolean valueOf = Boolean.valueOf(z);
            boolean booleanValue = valueOf.booleanValue();
            Log.m105924i("MicroMsg.AppBrandAudioFocusServiceFactory", "useAudioFocusService#get, " + booleanValue);
            return valueOf;
        }
    }

    /* renamed from: i2 */
    public C82724i0 mo56770i2(AppBrandRuntime appBrandRuntime) {
        C87412m.m108594g(appBrandRuntime, "runtime");
        C82724i0 i0Var = (C82724i0) appBrandRuntime.mo113032U(C82724i0.class);
        if (i0Var != null) {
            return i0Var;
        }
        C29514a aVar = new C29514a();
        appBrandRuntime.mo113059i(aVar);
        return aVar;
    }
}
