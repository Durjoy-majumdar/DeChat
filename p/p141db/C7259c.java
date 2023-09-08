package p141db;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: db.c */
public class C7259c extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "logInJava";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        try {
            int i2 = jSONObject.getInt(FirebaseAnalytics.C113379b.LEVEL);
            String string = jSONObject.getString("logs");
            if (i2 == 0) {
                Log.m105918d("MicroMsg.JsApiLogInJava", string);
            } else if (i2 == 1) {
                Log.m105924i("MicroMsg.JsApiLogInJava", string);
            } else if (i2 == 2) {
                Log.m105928w("MicroMsg.JsApiLogInJava", string);
            } else if (i2 != 3) {
                Log.m105918d("MicroMsg.JsApiLogInJava", string);
            } else {
                Log.m105920e("MicroMsg.JsApiLogInJava", string);
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.JsApiLogInJava", e.toString());
        }
    }
}
