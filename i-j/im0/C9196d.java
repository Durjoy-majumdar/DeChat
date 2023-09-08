package im0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p225rc.C12969d;

/* renamed from: im0.d */
public final class C9196d extends C82268c<C81925i2> {
    private static final int CTRL_INDEX = 107;
    private static final String NAME = "showActionSheet";

    /* renamed from: g */
    public static C9197a f28935g;

    /* renamed from: im0.d$a */
    public interface C9197a {
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        C83780d1 l0 = i2Var.mo114341l0();
        if (l0 == null) {
            Log.m105928w("MicroMsg.JsApiShowActionSheet", "invoke JsApi JsApiShowActionSheet failed, current page view is null.");
            i2Var.mo109647a(i, mo115109j("fail"));
            return;
        }
        String a = C12969d.m12407a(jSONObject, "alertText");
        Log.m105924i("MicroMsg.JsApiShowActionSheet", "invoke, alertText: " + a);
        String optString = jSONObject.optString("itemList");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(optString);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add((String) jSONArray.get(i2));
            }
            i2Var.mo109673t(new C9192c(this, i2Var, l0, a, jSONObject, arrayList, i));
        } catch (Exception e) {
            Log.m105920e("MicroMsg.JsApiShowActionSheet", e.getMessage());
            i2Var.mo109647a(i, mo115109j("fail"));
        }
    }
}
