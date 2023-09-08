package ol0;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: ol0.l */
public class C117819l extends C117793b {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "eraseMapLines";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject2 == null) {
            Log.m105920e("MicroMsg.JsApiEraseMapLines", "data is null");
            fVar2.mo109647a(i2, mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiEraseMapLines", "data:%s", jSONObject2);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.JsApiEraseMapLines", "mapView is null, return");
            fVar2.mo109647a(i2, mo115109j("fail:mapview is null"));
        } else if (jSONObject2.has("lines")) {
            try {
                JSONArray jSONArray = new JSONArray(jSONObject2.optString("lines"));
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    JSONObject jSONObject3 = (JSONObject) jSONArray.get(i3);
                    String optString = jSONObject3.optString("id");
                    if (!Util.isNullOrNil(optString)) {
                        C118080q.C118093j jVar = null;
                        JSONObject optJSONObject = jSONObject3.optJSONObject("point");
                        if (optJSONObject != null) {
                            jVar = new C118080q.C118093j(Util.getDouble(optJSONObject.optString("latitude"), 0.0d), Util.getDouble(optJSONObject.optString("longitude"), 0.0d));
                        }
                        if (jVar != null) {
                            y.mo182801G(optString, jSONObject3.optInt(FirebaseAnalytics.C113379b.INDEX, 0), jVar, jSONObject3.optBoolean("clear", true));
                        }
                    }
                }
                mo182575w(fVar, i, mo115109j("ok"), true, y.mo182849h());
            } catch (JSONException e) {
                Log.printInfoStack("MicroMsg.JsApiEraseMapLines", "", e);
                mo182575w(fVar, i, mo115109j("fail:internal error"), false, y.mo182849h());
            }
        } else {
            Log.m105920e("MicroMsg.JsApiEraseMapLines", "data has not lines info");
            mo182575w(fVar, i, mo115109j("fail:invalid data"), false, y.mo182849h());
        }
    }
}
