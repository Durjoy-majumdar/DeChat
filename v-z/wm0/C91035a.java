package wm0;

import android.app.Activity;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.p026ui.privacy.AppBrandPrivacyPageContainerUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.privacy.manage.AppBrandPrivacyManagePage;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: wm0.a */
public final class C91035a extends C82268c<C81879g> {
    @Deprecated
    public static final int CTRL_INDEX = 1158;
    @Deprecated
    public static final String NAME = "openWeAppAuthManageList";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        AppBrandRuntime runtime;
        C81879g gVar = (C81879g) fVar;
        if (gVar != null && (runtime = gVar.getRuntime()) != null && runtime.mo113026R() != null && jSONObject != null) {
            AppBrandPrivacyManagePage.C84576a aVar = AppBrandPrivacyManagePage.f246784e;
            AppBrandRuntime runtime2 = gVar.getRuntime();
            Activity R = runtime2 != null ? runtime2.mo113026R() : null;
            C87412m.m108591d(R);
            aVar.mo117264a(R, AppBrandPrivacyPageContainerUI.class);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            gVar.mo109647a(i, mo115115p("ok", jSONObject2));
        }
    }
}
