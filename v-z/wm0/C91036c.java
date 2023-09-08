package wm0;

import android.content.Context;
import android.os.Bundle;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandProfileUI;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import kb0.C9576e;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: wm0.c */
public final class C91036c extends C82268c<C81879g> {
    @Deprecated
    public static final int CTRL_INDEX = 650;
    @Deprecated
    public static final String NAME = "openWeAppProfile";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        if (gVar != null && gVar.getContext() != null && jSONObject != null) {
            String optString = jSONObject.optString("username", (String) null);
            if (optString == null || !C9576e.m9260a(optString)) {
                gVar.mo109647a(i, mo115109j("fail:invalid data"));
                return;
            }
            int optInt = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            String optString2 = jSONObject.optString("sceneNote", (String) null);
            int optInt2 = jSONObject.optInt("exposeScene", 0);
            try {
                Context context = gVar.getContext();
                WxaExposedParams.C81632b bVar = new WxaExposedParams.C81632b();
                bVar.f239560d = optString;
                bVar.f239566j = optInt2;
                C13598b0 b0Var = C13598b0.f38549a;
                AppBrandProfileUI.m104017R7(context, optString, optInt, optString2, true, bVar.mo113977a(), new Bundle(), (ActivityStarterIpcDelegate) null);
                gVar.mo109647a(i, mo115109j("ok"));
            } catch (Exception e) {
                gVar.mo109647a(i, mo115109j("fail:internal error " + e.getMessage()));
            }
        }
    }
}
