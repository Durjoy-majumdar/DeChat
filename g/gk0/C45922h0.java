package gk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.internal.ConstValue;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;
import te3.C51947xa2;
import te3.C52093ya2;
import zp0.C16377l;

/* renamed from: gk0.h0 */
public class C45922h0 extends C82268c<C83780d1> {
    public static final int CTRL_INDEX = 204;
    public static final String NAME = "getUserAutoFillData";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C83780d1 d1Var = (C83780d1) fVar;
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData data is invalid");
            d1Var.mo109647a(i, mo115109j("fail:data is invalid"));
            return;
        }
        LinkedList<String> linkedList = new LinkedList<>();
        JSONArray optJSONArray = jSONObject.optJSONArray("fields");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                linkedList.add(optJSONArray.optString(i2));
            }
        }
        if (linkedList.size() == 0) {
            Log.m105920e("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData fields is empty");
            d1Var.mo109647a(i, mo115109j("fail:fields is empty"));
            return;
        }
        String appId = d1Var.getAppId();
        int optInt = jSONObject.optInt(ConstValue.INIT_CONFIG_KEY_CLIENT_VERSION, 0);
        Log.m105925i("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData appId:%s, clientVersion:%s data:%s", appId, Integer.valueOf(optInt), jSONObject.toString());
        C51947xa2 xa22 = new C51947xa2();
        xa22.f144563f = linkedList;
        xa22.f144561d = appId;
        xa22.f144562e = jSONObject.optBoolean("getAllInfo", false);
        xa22.f144564g = 1;
        xa22.f144565h = optInt;
        ((C16377l) d1Var.mo109668l(C16377l.class)).mo14840YQ("/cgi-bin/mmbiz-bin/wxaapp/autofill/getinfo", appId, xa22, C52093ya2.class).mo123061d(new C45921g0(this, d1Var, i));
    }
}
