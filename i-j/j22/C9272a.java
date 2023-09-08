package j22;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di0.C86297n;
import di0.C86299o;
import di3.C86312j;
import kr0.C76630x0;
import org.json.JSONObject;

/* renamed from: j22.a */
public class C9272a extends C4770c {

    /* renamed from: j22.a$a */
    public class C9273a implements C86297n {
        public C9273a() {
        }

        /* renamed from: a */
        public void mo1541a(int i, String str) {
            C4770c.C4771a aVar = C9272a.this.f19815f;
            aVar.mo5689a("fail errCode: " + i + "  errMsg: " + str);
        }

        public void onSuccess() {
            C9272a.this.f19815f.mo5690b();
        }
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105918d("LiteAppJsApiPreRenderMiniProgram", "Invoke prerenderMiniProgram");
        if (jSONObject == null) {
            this.f19815f.mo5689a("data is null");
            return;
        }
        C86299o oVar = new C86299o();
        AppBrandLaunchReferrer appBrandLaunchReferrer = new AppBrandLaunchReferrer();
        oVar.f250947s = appBrandLaunchReferrer;
        appBrandLaunchReferrer.f239397e = jSONObject.optString("referrerAppId");
        int i = 2;
        oVar.f250947s.f239396d = 2;
        oVar.f250930b = jSONObject.optString("targetAppId");
        oVar.f250934f = jSONObject.optString("path");
        String optString = jSONObject.optString("envVersion");
        optString.getClass();
        if (!optString.equals("trial")) {
            i = !optString.equals("develop") ? 0 : 1;
        }
        oVar.f250931c = i;
        oVar.f250939k = 1055;
        if (Util.isNullOrNil(oVar.f250930b) || Util.isNullOrNil(oVar.f250934f)) {
            this.f19815f.mo5689a("fail");
        } else {
            ((C76630x0) C86312j.m106911c(C76630x0.class)).y20(oVar, new C9273a());
        }
    }
}
