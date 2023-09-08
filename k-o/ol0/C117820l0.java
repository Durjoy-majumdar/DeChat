package ol0;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;
import pl0.C118080q;
import zi0.C91755a;
import zi0.C91759b;

/* renamed from: ol0.l0 */
public class C117820l0 extends C117793b {
    public static final int CTRL_INDEX = 993;
    public static final String NAME = "setMapLocMarkerIcon";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Class cls = C91759b.class;
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiSetMapLocMarkerIcon", "data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiSetMapLocMarkerIcon", "data:%s", jSONObject);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.JsApiSetMapLocMarkerIcon", "mapView is null, return");
            fVar.mo109647a(i, mo115109j("fail:mapview is null"));
            return;
        }
        String optString = jSONObject.optString("iconPath");
        Log.m105925i("MicroMsg.JsApiSetMapLocMarkerIcon", "iconPath:%s", optString);
        if (TextUtils.isEmpty(optString)) {
            Log.m105920e("MicroMsg.JsApiSetMapLocMarkerIcon", "iconPath is null, return");
            fVar.mo109647a(i, mo115109j("fail:iconPath is null"));
            return;
        }
        if (!Util.isNullOrNil(optString) && fVar.mo109668l(cls) != null) {
            y.mo182815N(((C91759b) fVar.mo109668l(cls)).mo115838nO(fVar, optString), (C91755a) fVar.mo109668l(C91755a.class));
        }
        fVar.mo109647a(i, mo115109j("ok"));
    }
}
