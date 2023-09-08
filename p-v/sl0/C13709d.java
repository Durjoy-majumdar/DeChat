package sl0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fl0.C86920e;
import gy3.C87412m;
import org.json.JSONObject;
import sp0.C13761v;
import sp0.C13762w;
import sp0.C90275c0;

/* renamed from: sl0.d */
public final class C13709d extends C82268c<C82381f> {
    private static final int CTRL_INDEX = -2;
    private static final String NAME = "bindSocketToNetwork";

    /* renamed from: sl0.d$a */
    public static final class C13710a implements C13761v {

        /* renamed from: a */
        public final /* synthetic */ C82381f f38789a;

        /* renamed from: b */
        public final /* synthetic */ int f38790b;

        /* renamed from: c */
        public final /* synthetic */ C13709d f38791c;

        public C13710a(C82381f fVar, int i, C13709d dVar) {
            this.f38789a = fVar;
            this.f38790b = i;
            this.f38791c = dVar;
        }

        /* renamed from: a */
        public final void mo13086a(boolean z) {
            Log.m105924i("MicroMsg.JsApiBindSocketToNetwork", "invoke, success: " + z);
            this.f38789a.mo109647a(this.f38790b, this.f38791c.mo115111l((String) null, z ? C86920e.f252311a : C86920e.f252314d, (JSONObject) null));
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (fVar != null) {
            if (jSONObject == null) {
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errno", 101);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                fVar.mo109647a(i, mo115115p("fail:jsapi invalid request data", jSONObject2));
                return;
            }
            Log.m105924i("MicroMsg.JsApiBindSocketToNetwork", "invoke, data: " + jSONObject);
            if (!C87412m.m108589b("wifi", jSONObject.optString("networkType"))) {
                Log.m105920e("MicroMsg.JsApiBindSocketToNetwork", "invoke, not bind to wifi is denied now");
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("errno", 101);
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
                }
                fVar.mo109647a(i, mo115115p("fail:jsapi invalid request data", jSONObject3));
                return;
            }
            int optInt = jSONObject.optInt("socketFd", -1);
            if (!(optInt >= 0)) {
                Log.m105920e("MicroMsg.JsApiBindSocketToNetwork", "invoke, socketFd is invalid");
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
                }
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("errno", 101);
                } catch (Exception e3) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
                }
                fVar.mo109647a(i, mo115115p("fail:jsapi invalid request data", jSONObject4));
                return;
            }
            C13710a aVar = new C13710a(fVar, i, this);
            Log.m105924i("MicroMsg.BindSocketToNetworkLogic", "bindSocketToWifi, socketFd: " + optInt);
            C90275c0.C90278c.f259161h.mo124499b(new C13762w(aVar, optInt));
        }
    }
}
