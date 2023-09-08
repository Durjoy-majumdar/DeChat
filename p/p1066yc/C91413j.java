package p1066yc;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.pip.C84059t;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;

/* renamed from: yc.j */
public final class C91413j {
    /* renamed from: a */
    public static boolean m114705a(C82870p pVar, C82381f fVar, JSONObject jSONObject, int i) {
        if (!pVar.mo114779e().contains("operate")) {
            return false;
        }
        String optString = jSONObject.optString("type");
        if (Util.isNullOrNil(optString) || !optString.equalsIgnoreCase("exitPictureInPicture")) {
            return false;
        }
        AppBrandRuntime runtime = fVar instanceof C82554k ? ((C82554k) fVar).getRuntime() : null;
        if (runtime == null) {
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            fVar.mo109647a(i, pVar.mo115115p("fail:internal error", jSONObject2));
            return true;
        }
        C84059t tVar = runtime.f238119Q0;
        if (tVar == null) {
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
            }
            fVar.mo109647a(i, pVar.mo115115p("fail:internal error", jSONObject3));
            return true;
        }
        int ordinal = tVar.mo116711h(jSONObject.optInt("viewId")).ordinal();
        if (ordinal == 1) {
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1107008, "fail:exiting picture in picture mode now");
            }
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("errno", 1107008);
            } catch (Exception e3) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
            }
            fVar.mo109647a(i, pVar.mo115115p("fail:exiting picture in picture mode now", jSONObject4));
            return true;
        } else if (ordinal != 2) {
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            JSONObject jSONObject5 = new JSONObject();
            try {
                jSONObject5.put("errno", 0);
            } catch (Exception e4) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e4);
            }
            fVar.mo109647a(i, pVar.mo115115p("ok", jSONObject5));
            return true;
        } else {
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1107007, "fail:not in picture in picture mode now");
            }
            JSONObject jSONObject6 = new JSONObject();
            try {
                jSONObject6.put("errno", 1107007);
            } catch (Exception e5) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e5);
            }
            fVar.mo109647a(i, pVar.mo115115p("fail:not in picture in picture mode now", jSONObject6));
            return true;
        }
    }
}
