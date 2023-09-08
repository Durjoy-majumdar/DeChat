package gk0;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.internal.ConstValue;
import org.json.JSONObject;
import te3.C48663a40;
import te3.C48806b40;
import zp0.C16377l;

/* renamed from: gk0.c */
public class C45920c extends C82268c<C83780d1> {
    public static final int CTRL_INDEX = 206;
    public static final String NAME = "deleteUserAutoFillData";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C83780d1 d1Var = (C83780d1) fVar;
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData data is invalid");
            d1Var.mo109647a(i, mo115109j("fail:data is invalid"));
            return;
        }
        String optString = jSONObject.optString("groupKey");
        int optInt = jSONObject.optInt("groupId", 0);
        if (TextUtils.isEmpty(optString)) {
            Log.m105920e("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData groupKey is invalid");
            d1Var.mo109647a(i, mo115109j("fail:groupKey is invalid"));
            return;
        }
        String appId = d1Var.getAppId();
        int optInt2 = jSONObject.optInt(ConstValue.INIT_CONFIG_KEY_CLIENT_VERSION, 0);
        Log.m105925i("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData appId:%s, clientVersion:%s, groupId:%d, groupKey:%s", appId, Integer.valueOf(optInt2), Integer.valueOf(optInt), optString);
        C48663a40 a402 = new C48663a40();
        a402.f130301e = optString;
        a402.f130300d = appId;
        a402.f130302f = optInt;
        a402.f130303g = 1;
        a402.f130305i = optInt2;
        ((C16377l) d1Var.mo109668l(C16377l.class)).mo14840YQ("/cgi-bin/mmbiz-bin/wxaapp/autofill/deleteinfo", appId, a402, C48806b40.class).mo123061d(new C45919b(this, d1Var, i));
    }
}
