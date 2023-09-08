package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import kr0.C88267e;
import o40.C61926c;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.j3 */
public final class C1704j3 extends C82268c<C81879g> {
    @Deprecated
    public static final int CTRL_INDEX = 1083;
    @Deprecated
    public static final String NAME = "highlightBottomBanner";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        Log.m105924i("MicroMsg.JsApiHighlightBottomBanner", "hideLaunchAppBtnForSinglePage");
        if (gVar != null) {
            C83928t1 M0 = gVar instanceof C88267e ? ((C88267e) gVar).mo114341l0() : gVar instanceof C83928t1 ? (C83928t1) gVar : null;
            if (jSONObject == null || M0 == null || M0.f245024h1 == null || M0.getRuntime() == null) {
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errno", 4);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                gVar.mo109647a(i, mo115115p("fail:internal error", jSONObject2));
            } else if (!jSONObject.has("shouldHighlight")) {
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("errno", 101);
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
                }
                gVar.mo109647a(i, mo115115p("fail:jsapi invalid request data", jSONObject3));
            } else {
                C61926c.m72668M(new C82542i3(M0, jSONObject, "shouldHighlight"));
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("errno", 0);
                } catch (Exception e3) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
                }
                gVar.mo109647a(i, mo115115p("ok", jSONObject4));
            }
        }
    }
}
