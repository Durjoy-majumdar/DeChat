package jl0;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import kr0.C88267e;
import org.json.JSONObject;
import zt3.C119157j;

/* renamed from: jl0.d */
public class C9464d extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 910;
    public static final String NAME = "checkHandoffEnabled";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        Log.m105924i("MicroMsg.JsApiCheckHandoffEnabled", "invoke JsApiCheckHandoffEnabled");
        HashMap hashMap = new HashMap();
        Boolean valueOf = Boolean.valueOf(jSONObject.optBoolean("showToast", true));
        int a = C9463c.m9140a("MicroMsg.JsApiCheckHandoffEnabled", eVar.getAppId(), eVar.getRuntime().mo121254q1());
        if (a != 0) {
            if (valueOf.booleanValue()) {
                int[] iArr = C9463c.f29537c;
                if (a < 5 && a > 1) {
                    Context context = eVar.getContext();
                    String string = eVar.getContext().getString(iArr[a]);
                    ((C119157j) C119157j.f356862d).mo183895z(new C9462b(context, string));
                }
            }
            hashMap.put("errCode", Integer.valueOf(a));
            hashMap.put("isEnabled", Boolean.FALSE);
        } else {
            hashMap.put("isEnabled", Boolean.TRUE);
        }
        eVar.mo109647a(i, mo115112m("ok", hashMap));
    }
}
