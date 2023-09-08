package ek0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.address.AddressSelectorContract;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13598b0;
import sx3.C64197v;

/* renamed from: ek0.f */
public final class C7725f extends C87413o implements C32226l<AddressSelectorContract.SelectResponse, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C81879g f26163d;

    /* renamed from: e */
    public final /* synthetic */ int f26164e;

    /* renamed from: f */
    public final /* synthetic */ C7727h f26165f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7725f(C81879g gVar, int i, C7727h hVar) {
        super(1);
        this.f26163d = gVar;
        this.f26164e = i;
        this.f26165f = hVar;
    }

    public Object invoke(Object obj) {
        AddressSelectorContract.SelectResponse selectResponse = (AddressSelectorContract.SelectResponse) obj;
        C87412m.m108594g(selectResponse, "response");
        C81879g gVar = this.f26163d;
        int i = this.f26164e;
        C7727h hVar = this.f26165f;
        JSONObject jSONObject = new JSONObject();
        this.f26165f.getClass();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("postcode", String.valueOf(selectResponse.f11051e));
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        jSONObject2.put("code", jSONArray);
        jSONObject2.put("value", jSONArray2);
        int i2 = 0;
        for (T next : selectResponse.f11050d) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                AddressSelectorContract.AddressNode addressNode = (AddressSelectorContract.AddressNode) next;
                String str = addressNode.f11045d;
                int i4 = addressNode.f11046e;
                jSONArray2.put(i2, str);
                jSONArray.put(i2, String.valueOf(i4));
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        JSONObject put = jSONObject.put("value", jSONObject2);
        hVar.getClass();
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
        }
        if (put == null) {
            put = new JSONObject();
        }
        try {
            put.put("errno", 0);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
        }
        gVar.mo109647a(i, hVar.mo115115p("ok", put));
        return C13598b0.f38549a;
    }
}
