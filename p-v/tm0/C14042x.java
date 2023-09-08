package tm0;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import org.json.JSONObject;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C90364q0;

/* renamed from: tm0.x */
public final class C14042x extends C82016a0<C82381f> {
    private static final int CTRL_INDEX = 1063;
    private static final String NAME = "openSystemSetting";

    /* renamed from: g */
    public static final C13601g<Map<String, C32226l<Context, Boolean>>> f39393g = C36568h.m40985a(C14043a.f39394d);

    /* renamed from: tm0.x$a */
    public static final class C14043a extends C87413o implements C32224a<Map<String, ? extends C32226l<? super Context, ? extends Boolean>>> {

        /* renamed from: d */
        public static final C14043a f39394d = new C14043a();

        public C14043a() {
            super(0);
        }

        public Object invoke() {
            return C90364q0.m113147f(new C13604l("appAuthorize", C14040v.f39391d), new C13604l("systemBluetooth", C14041w.f39392d));
        }
    }

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        if (fVar == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOpenSystemSetting", "invoke, env is null");
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            String p = mo115115p("fail:internal error", jSONObject2);
            C87412m.m108593f(p, "makeReturnJson(AppBrandE…s.General.INTERNAL_ERROR)");
            return p;
        }
        Context context = fVar.getContext();
        if (context == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOpenSystemSetting", "invoke, context is null");
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
            }
            String p2 = mo115115p("fail:internal error", jSONObject3);
            C87412m.m108593f(p2, "makeReturnJson(AppBrandE…s.General.INTERNAL_ERROR)");
            return p2;
        } else if (jSONObject == null || !jSONObject.has("type")) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOpenSystemSetting", "invoke, data is illegal, data: " + jSONObject);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
            }
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("errno", 101);
            } catch (Exception e3) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
            }
            String p3 = mo115115p("fail:jsapi invalid request data", jSONObject4);
            C87412m.m108593f(p3, "makeReturnJson(AppBrandE…ral.INVALID_REQUEST_DATA)");
            return p3;
        } else {
            String optString = jSONObject.optString("type");
            Log.m105924i("MicroMsg.AppBrand.JsApiOpenSystemSetting", "invoke, openType: " + optString);
            C32226l lVar = (C32226l) ((Map) ((C36570n) f39393g).getValue()).get(optString);
            if (lVar == null) {
                Log.m105928w("MicroMsg.AppBrand.JsApiOpenSystemSetting", "invoke, openAction is null");
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
                }
                JSONObject jSONObject5 = new JSONObject();
                try {
                    jSONObject5.put("errno", 101);
                } catch (Exception e4) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e4);
                }
                String p4 = mo115115p("fail:jsapi invalid request data", jSONObject5);
                C87412m.m108593f(p4, "makeReturnJson(AppBrandE…ral.INVALID_REQUEST_DATA)");
                return p4;
            } else if (!((Boolean) lVar.invoke(context)).booleanValue()) {
                Log.m105924i("MicroMsg.AppBrand.JsApiOpenSystemSetting", "invoke, open fail");
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 102101, "fail:settings page not found");
                }
                JSONObject jSONObject6 = new JSONObject();
                try {
                    jSONObject6.put("errno", 102101);
                } catch (Exception e5) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e5);
                }
                String p5 = mo115115p("fail:settings page not found", jSONObject6);
                C87412m.m108593f(p5, "makeReturnJson(AppBrandE….SETTINGS_PAGE_NOT_FOUND)");
                return p5;
            } else {
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                JSONObject jSONObject7 = new JSONObject();
                try {
                    jSONObject7.put("errno", 0);
                } catch (Exception e6) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e6);
                }
                String p6 = mo115115p("ok", jSONObject7);
                C87412m.m108593f(p6, "makeReturnJson(AppBrandErrors.General.OK)");
                return p6;
            }
        }
    }
}
