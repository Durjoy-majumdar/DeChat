package gk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.internal.ConstValue;
import org.json.JSONObject;
import te3.C52176yv3;
import te3.C52314zv3;
import zp0.C16377l;

/* renamed from: gk0.v0 */
public class C45933v0 extends C82268c<C83780d1> {
    public static final int CTRL_INDEX = 205;
    public static final String NAME = "setUserAutoFillData";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C83780d1 d1Var = (C83780d1) fVar;
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiSetUserAutoFillData", "setUserAutoFillData data is invalid");
            d1Var.mo109647a(i, mo115109j("fail:data is invalid"));
            return;
        }
        String optString = jSONObject.optString("dataList");
        String appId = d1Var.getAppId();
        int optInt = jSONObject.optInt(ConstValue.INIT_CONFIG_KEY_CLIENT_VERSION, 0);
        Log.m105925i("MicroMsg.JsApiSetUserAutoFillData", "setUserAutoFillData appId:%s, clientVersion:%s, dataList:%s", appId, Integer.valueOf(optInt), optString);
        C52176yv3 yv32 = new C52176yv3();
        yv32.f145538d = appId;
        yv32.f145539e = optString;
        yv32.f145540f = 1;
        yv32.f145541g = optInt;
        ((C16377l) d1Var.mo109668l(C16377l.class)).mo14840YQ("/cgi-bin/mmbiz-bin/wxaapp/autofill/saveinfo", appId, yv32, C52314zv3.class).mo123061d(new C45932u0(this, d1Var, i));
    }
}
