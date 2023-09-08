package yn0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C40478h;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import jk0.C87983g;
import org.json.JSONObject;

/* renamed from: yn0.m */
public final class C91532m extends C87983g<C81879g> {
    @Deprecated
    public static final int CTRL_INDEX = -2;
    @Deprecated
    public static final String NAME = "sendToHTMLVConsoleView";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "data");
        return jSONObject.optInt("htmlId");
    }

    /* renamed from: C */
    public void mo114531v(C81879g gVar, JSONObject jSONObject, int i, C40482o oVar) {
        if (gVar != null && jSONObject != null) {
            try {
                View x = mo122432x(gVar, jSONObject);
                String optString = jSONObject.optString("data");
                C87412m.m108592e(x, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.webview.HTMLWebViewContract.IView");
                ((C40478h) x).getController().mo74062v(optString);
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errno", 0);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                gVar.mo114838E(i, mo115115p("ok", jSONObject2), oVar);
            } catch (IllegalArgumentException e2) {
                String str = "fail:" + e2.getMessage();
                if (str == null) {
                    str = "";
                }
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, str);
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("errno", 0);
                } catch (Exception e3) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
                }
                gVar.mo114838E(i, mo115115p(str, jSONObject3), oVar);
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        mo114531v((C81879g) fVar, jSONObject, i, (C40482o) null);
    }
}
