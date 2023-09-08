package ol0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: ol0.t */
public class C117837t extends C117793b {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "getMapSkew";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiGetMapSkew", "data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiGetMapSkew", "data:%s", jSONObject);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.JsApiGetMapSkew", "mapView is null, return");
            fVar.mo109647a(i, mo115109j("fail:mapview is null"));
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("skew", Float.valueOf(y.mo182871r()));
        Log.m105925i("MicroMsg.JsApiGetMapSkew", "getMapSkew ok, values:%s", hashMap.toString());
        mo182575w(fVar, i, mo115112m("ok", hashMap), true, y.mo182849h());
    }
}
