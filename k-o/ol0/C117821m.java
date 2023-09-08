package ol0;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: ol0.m */
public class C117821m extends C117793b {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "executeMapVisualLayerCommand";

    /* renamed from: ol0.m$a */
    public static class C117822a extends C82919r2 {
        private static final int CTRL_INDEX = -2;
        private static final String NAME = "onMapVisualLayerEvent";
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiExecuteMapVisualLayerCommand", "data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiExecuteMapVisualLayerCommand", "data:%s", jSONObject);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.JsApiExecuteMapVisualLayerCommand", "mapView is null, return");
            fVar.mo109647a(i, mo115109j("fail:mapview is null"));
            return;
        }
        String optString = jSONObject.optString("layerId");
        if (TextUtils.isEmpty(optString)) {
            Log.m105920e("MicroMsg.JsApiExecuteMapVisualLayerCommand", "layerId is empty");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        String optString2 = jSONObject.optString("command");
        if (TextUtils.isEmpty(optString2)) {
            Log.m105920e("MicroMsg.JsApiExecuteMapVisualLayerCommand", "command is empty");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        String g = y.mo182843g(optString, optString2);
        if (TextUtils.isEmpty(g) || !g.contains("success")) {
            Log.m105924i("MicroMsg.JsApiExecuteMapVisualLayerCommand", "executeMapVisualLayerCommand fail");
            fVar.mo109647a(i, mo115109j("fail"));
            return;
        }
        Log.m105924i("MicroMsg.JsApiExecuteMapVisualLayerCommand", "executeMapVisualLayerCommand ok");
        HashMap hashMap = new HashMap();
        hashMap.put("data", g);
        fVar.mo109647a(i, mo115112m("ok", hashMap));
    }
}
