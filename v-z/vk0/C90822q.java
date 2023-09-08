package vk0;

import android.util.Size;
import android.view.View;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import jk0.C87981f;
import js0.C88020k;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: vk0.q */
public class C90822q extends C87981f {
    private static final int CTRL_INDEX = 331;
    public static final String NAME = "updateCamera";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.optInt("cameraId");
    }

    /* renamed from: E */
    public boolean mo22381E(C82520h hVar, int i, View view, JSONObject jSONObject) {
        int[] gq;
        Log.m105925i("MicroMsg.JsApiUpdateCamera", "onUpdateView : cameraId=%d", Integer.valueOf(i));
        if (!(view instanceof CoverViewContainer)) {
            Log.m105929w("MicroMsg.JsApiUpdateCamera", "the view(%s) is not a instance of CoverViewContainer", Integer.valueOf(i));
            return false;
        }
        View view2 = (View) ((CoverViewContainer) view).mo114736d(View.class);
        if (view2 == null || !(view2 instanceof C90815g)) {
            Log.m105929w("MicroMsg.JsApiUpdateCamera", "the camera view(%s) is null", Integer.valueOf(i));
            return false;
        }
        C90815g gVar = (C90815g) view2;
        int optInt = jSONObject.optInt("cameraId");
        String optString = jSONObject.optString(V2TXJSAdapterConstants.PUSHER_KEY_DEVICE_POSITION, "back");
        String optString2 = jSONObject.optString("flash", "auto");
        boolean optBoolean = jSONObject.optBoolean("needOutput", false);
        gVar.setAppId(hVar.getAppId());
        gVar.mo22099m(optString, false);
        gVar.setFlash(optString2);
        gVar.setNeedOutput(optBoolean);
        JSONObject optJSONObject = jSONObject.optJSONObject("position");
        int k = C88020k.m109560k(optJSONObject, "width", 0);
        int k2 = C88020k.m109560k(optJSONObject, "height", 0);
        Log.m105919d("MicroMsg.JsApiUpdateCamera", "onUpdateView cameraId: %d, devicePosition: %s,flash: %s,width： %d,height： %d", Integer.valueOf(optInt), optString, optString2, Integer.valueOf(k), Integer.valueOf(k2));
        boolean x = (k == 0 || k2 == 0) ? false : gVar.mo22125x(k, k2, false);
        C90814f fVar = (C90814f) hVar.mo109668l(C90814f.class);
        if (fVar != null && (gq = fVar.mo120814gq(hVar)) != null && gq.length == 2 && gq[0] > 0 && gq[1] > 0) {
            gVar.setDisplayScreenSize(new Size(gq[0], gq[1]));
            Log.m105925i("MicroMsg.JsApiUpdateCamera", "onUpdateView screen width: %d, screen height: %d", Integer.valueOf(gq[0]), Integer.valueOf(gq[1]));
        }
        String optString3 = jSONObject.optString("mode");
        if (!Util.isNullOrNil(optString3)) {
            gVar.setMode(optString3);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("scanArea");
        if (optJSONArray != null && optJSONArray.length() == 4) {
            Log.m105925i("MicroMsg.JsApiUpdateCamera", "scanAreaArray:%s, scanAreaArray.length:%d", optJSONArray, Integer.valueOf(optJSONArray.length()));
            gVar.mo22097j(C88020k.m109553d(optJSONArray.optInt(0)), C88020k.m109553d(optJSONArray.optInt(1)), C88020k.m109553d(optJSONArray.optInt(2)), C88020k.m109553d(optJSONArray.optInt(3)));
        }
        gVar.setScanFreq(jSONObject.optInt("scanFreq"));
        if (x) {
            gVar.release();
            gVar.mo22088a();
        } else {
            gVar.mo22102p();
        }
        return true;
    }
}
