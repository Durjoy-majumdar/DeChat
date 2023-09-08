package jl0;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import kr0.C88267e;
import org.json.JSONObject;
import zt3.C119157j;

/* renamed from: jl0.e */
public class C9465e extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 903;
    public static final String NAME = "startHandoff";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        Log.m105924i("MicroMsg.JsApiStartHandoff", "invoke startHandoff");
        HashMap hashMap = new HashMap();
        int a = C9463c.m9140a("MicroMsg.JsApiStartHandoff", eVar.getAppId(), eVar.getRuntime().mo121254q1());
        if (a != 0) {
            hashMap.put("errCode", Integer.valueOf(a));
            int[] iArr = C9463c.f29537c;
            if (a < 5 && a > 1) {
                Context context = eVar.getContext();
                String string = eVar.getContext().getString(iArr[a]);
                ((C119157j) C119157j.f356862d).mo183895z(new C9462b(context, string));
            }
        } else {
            String optString = jSONObject.optString("path", "");
            int optInt = jSONObject.optInt("actionId", 0);
            if (!(optInt == 1 || optInt == 2)) {
                Log.m105920e("MicroMsg.JsApiStartHandoff", "  actionId from forehand is wrong!! it is not 1 or 2");
            }
            eVar.getRuntime().mo113181L1().mo109824b(optString, optInt + 2);
            Context context2 = eVar.getContext();
            ((C119157j) C119157j.f356862d).mo183895z(new C9460a(context2));
        }
        if (a == 0) {
            eVar.mo109647a(i, mo115109j("ok"));
        } else if (a == 2) {
            eVar.mo109647a(i, mo115112m("fail:invalid login", hashMap));
        } else if (a == 3) {
            eVar.mo109647a(i, mo115112m("fail:low version", hashMap));
        } else if (a != 4) {
            hashMap.put("errCode", 0);
            eVar.mo109647a(i, mo115112m("fail:unknown reason", hashMap));
        } else {
            eVar.mo109647a(i, mo115112m("fail:empty xclient data or pc not supported", hashMap));
        }
    }
}
