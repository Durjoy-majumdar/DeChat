package ol0;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: ol0.k */
public class C117816k extends C117793b {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "addMapVisualLayer";

    /* renamed from: ol0.k$a */
    public class C117817a implements C118080q.C118089f {

        /* renamed from: a */
        public final /* synthetic */ JSONObject f352332a;

        /* renamed from: b */
        public final /* synthetic */ C82381f f352333b;

        public C117817a(C117816k kVar, JSONObject jSONObject, C82381f fVar) {
            this.f352332a = jSONObject;
            this.f352333b = fVar;
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiAddMapVisualLayer", "data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiAddMapVisualLayer", "data:%s", jSONObject);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.JsApiAddMapVisualLayer", "mapView is null, return");
            fVar.mo109647a(i, mo115109j("fail:mapview is null"));
            return;
        }
        String optString = jSONObject.optString("layerId");
        if (TextUtils.isEmpty(optString)) {
            Log.m105920e("MicroMsg.JsApiAddMapVisualLayer", "layerId is empty");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        int optInt = jSONObject.optInt("interval", 0);
        double optDouble = jSONObject.optDouble("opacity", 1.0d);
        int optInt2 = jSONObject.optInt("zIndex", 0);
        String optString2 = jSONObject.optString(FirebaseAnalytics.C113379b.LEVEL);
        y.mo182836e(new C117817a(this, jSONObject, fVar));
        if (y.mo182869q(optString, optInt, optDouble, optInt2, optString2)) {
            Log.m105924i("MicroMsg.JsApiAddMapVisualLayer", "addMapVisualLayer ok");
            fVar.mo109647a(i, mo115109j("ok"));
            return;
        }
        Log.m105924i("MicroMsg.JsApiAddMapVisualLayer", "addMapVisualLayer fail");
        fVar.mo109647a(i, mo115109j("fail"));
    }
}
