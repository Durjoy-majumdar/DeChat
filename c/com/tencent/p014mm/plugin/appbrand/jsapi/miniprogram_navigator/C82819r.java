package com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator;

import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.os.PersistableBundle;
import android.text.TextUtils;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82794c;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPreInitTask;
import com.tencent.p014mm.plugin.appbrand.launching.C83316f1;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hp3.C87581a;
import lp3.C88629c;
import lp3.C88643g;
import nr3.C89060f;
import org.json.JSONObject;
import wx3.C15601d;
import wx3.C66212f;
import zd2.C91667a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.r */
public class C82819r extends C82807l {

    /* renamed from: b */
    public static final C82819r f242212b = new C82819r();

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.r$a */
    public class C82820a implements C87581a<AppBrandInitConfigLU, Void> {

        /* renamed from: a */
        public final /* synthetic */ C81879g f242213a;

        /* renamed from: b */
        public final /* synthetic */ LaunchParcel f242214b;

        /* renamed from: c */
        public final /* synthetic */ JSONObject f242215c;

        public C82820a(C82819r rVar, C81879g gVar, LaunchParcel launchParcel, JSONObject jSONObject) {
            this.f242213a = gVar;
            this.f242214b = launchParcel;
            this.f242215c = jSONObject;
        }

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            new AppBrandPreInitTask(this.f242213a.getContext(), this.f242214b, false, new C82818q(this, C88643g.m110545c())).mo115494v();
            return null;
        }
    }

    /* renamed from: a */
    public int mo115045a(HalfScreenConfig halfScreenConfig) {
        if (halfScreenConfig != null && halfScreenConfig.mo76931c()) {
            return halfScreenConfig.f157932C == HalfScreenConfig.C55455e.EMBED ? 3 : 2;
        }
        return 0;
    }

    /* renamed from: c */
    public C88629c<AppBrandInitConfigLU> mo115047c(C81879g gVar, LaunchParcel launchParcel, JSONObject jSONObject) {
        if (gVar.getRuntime() == null || gVar.getRuntime().f238117P || gVar.getRuntime().mo113064k0()) {
            Log.m105921e("MicroMsg.MiniProgramNavigatorWC", "prepareInitConfig but component not working, targetAppId:%s", launchParcel.f243731e);
            return C89060f.m111323b(null);
        }
        if (C83316f1.f243478a.mo115610d()) {
            Log.m105925i("MicroMsg.MiniProgramNavigatorWC", "prepareInitConfig %s->%s, force versionType=2", gVar.getAppId(), launchParcel.f243731e);
            launchParcel.f243733g = 2;
        }
        C84072q1.m103586a(gVar.getAppId()).f245460d = launchParcel.f243731e;
        C84072q1.m103586a(gVar.getAppId()).f245461e = launchParcel.f243735i;
        String optString = jSONObject.optString("adUxInfo", (String) null);
        if (!TextUtils.isEmpty(optString)) {
            if (launchParcel.f243744u == null) {
                launchParcel.f243744u = new PersistableBundle();
            }
            launchParcel.f243744u.putString("adUxInfo", optString);
        }
        C91667a.m115207c("AppBrandRuntime", "navigateToMiniProgram", optString, "data");
        return C89060f.m111322a().mo123062e(new C82820a(this, gVar, launchParcel, jSONObject));
    }

    /* renamed from: d */
    public boolean mo114796d(C81879g gVar, LaunchParcel launchParcel, C82794c.C82796b bVar) {
        C87412m.m108594g(gVar, "service");
        C87412m.m108594g(launchParcel, "args");
        C87412m.m108594g(bVar, "callback");
        C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C82824v(gVar, launchParcel, bVar, (C15601d<? super C82824v>) null), 3, (Object) null);
        return true;
    }
}
