package zn0;

import android.content.Context;
import ao0.C79605a;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: zn0.e */
public class C91810e extends C82268c {
    public static final int CTRL_INDEX = 315;
    public static final String NAME = "stopWifi";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105924i("MicroMsg.JsApiStopWifi", "invoke registerHotspotHelper");
        Context context = fVar.getContext();
        if (context == null) {
            Log.m105920e("MicroMsg.JsApiStopWifi", "mContext is null, invoke fail!");
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", 12010);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:context is null");
            }
            hashMap.put("errno", 4);
            fVar.mo109647a(i, mo115114o("fail:context is null", hashMap));
        } else if (!C91807d.f262895g) {
            Log.m105920e("MicroMsg.JsApiStopWifi", "not invoke startWifi");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("errCode", 12000);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1505001, "fail:not invoke startWifi");
            }
            hashMap2.put("errno", 1505001);
            fVar.mo109647a(i, mo115114o("fail:not invoke startWifi", hashMap2));
        } else {
            C79605a.m96670a(context);
            C91807d.f262895g = false;
            HashMap hashMap3 = new HashMap();
            hashMap3.put("errCode", 0);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap3.put("errno", 0);
            fVar.mo109647a(i, mo115114o("ok", hashMap3));
        }
    }
}
