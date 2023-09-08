package eo0;

import android.util.Size;
import android.view.Surface;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.utils.C84752i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import js0.C88020k;
import org.json.JSONArray;
import org.json.JSONObject;
import vk0.C90816h;

/* renamed from: eo0.f */
public class C86629f extends C86622a {
    private static final int CTRL_INDEX = 807;
    public static final String NAME = "updateXWebCamera";

    /* renamed from: z */
    public boolean mo121051z(C82381f fVar, Surface surface, C90816h hVar, JSONObject jSONObject) {
        boolean z;
        Log.m105924i("MicroMsg.JsApiUpdateXWebCamera", "update xweb camera view");
        if (hVar == null) {
            Log.m105928w("MicroMsg.JsApiUpdateXWebCamera", "the camera view is null");
            return false;
        }
        int optInt = jSONObject.optInt("cameraId");
        String optString = jSONObject.optString(V2TXJSAdapterConstants.PUSHER_KEY_DEVICE_POSITION, "back");
        String optString2 = jSONObject.optString("flash", "auto");
        boolean optBoolean = jSONObject.optBoolean("needOutput", false);
        hVar.setAppId(fVar.getAppId());
        hVar.mo22099m(optString, false);
        hVar.setFlash(optString2);
        hVar.setNeedOutput(optBoolean);
        if (surface != null) {
            hVar.setCustomSurface(surface);
            Log.m105924i("MicroMsg.JsApiUpdateXWebCamera", "set a new surface when update camera");
            z = true;
        } else {
            z = false;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("position");
        int k = C88020k.m109560k(optJSONObject, "width", 0);
        int k2 = C88020k.m109560k(optJSONObject, "height", 0);
        Log.m105919d("MicroMsg.JsApiUpdateXWebCamera", "onUpdateView cameraId: %d, devicePosition: %s,flash: %s,width： %d,height： %d", Integer.valueOf(optInt), optString, optString2, Integer.valueOf(k), Integer.valueOf(k2));
        boolean x = (k == 0 || k2 == 0) ? false : hVar.mo22125x(k, k2, false);
        if (fVar instanceof C83780d1) {
            int[] a = C84752i2.m104413a((C83780d1) fVar);
            hVar.setDisplayScreenSize(new Size(a[0], a[1]));
        }
        String optString3 = jSONObject.optString("mode");
        if (!Util.isNullOrNil(optString3)) {
            hVar.setMode(optString3);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("scanArea");
        if (optJSONArray != null && optJSONArray.length() == 4) {
            Log.m105925i("MicroMsg.JsApiUpdateXWebCamera", "scanAreaArray:%s, scanAreaArray.length:%d", optJSONArray, Integer.valueOf(optJSONArray.length()));
            hVar.mo22097j(C88020k.m109553d(optJSONArray.optInt(0)), C88020k.m109553d(optJSONArray.optInt(1)), C88020k.m109553d(optJSONArray.optInt(2)), C88020k.m109553d(optJSONArray.optInt(3)));
        }
        hVar.setScanFreq(jSONObject.optInt("scanFreq"));
        if (x || z) {
            hVar.release();
            hVar.mo22088a();
        } else {
            hVar.mo22102p();
        }
        return true;
    }
}
