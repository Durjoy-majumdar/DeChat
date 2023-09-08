package gk0;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.xweb.internal.ConstValue;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;
import te3.C48677a8;
import te3.C52225z7;
import zp0.C16377l;

/* renamed from: gk0.t0 */
public class C45931t0 extends C82268c<C83780d1> {
    public static final int CTRL_INDEX = 208;
    public static final String NAME = "requestAuthUserAutoFillData";

    /* renamed from: g */
    public C87231a1 f123930g;

    /* renamed from: w */
    public static void m51191w(C45931t0 t0Var, C83780d1 d1Var, C52225z7 z7Var) {
        t0Var.getClass();
        ((C16377l) d1Var.mo109668l(C16377l.class)).mo14840YQ("/cgi-bin/mmbiz-bin/wxaapp/autofill/authinfo", d1Var.getAppId(), z7Var, C48677a8.class).mo123061d(new C45930s0(t0Var));
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        C83780d1 d1Var = (C83780d1) fVar;
        if (jSONObject2 == null) {
            Log.m105920e("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData data is invalid");
            d1Var.mo109647a(i2, mo115109j("fail:data is invalid"));
            return;
        }
        LinkedList<String> linkedList = new LinkedList<>();
        JSONArray optJSONArray = jSONObject2.optJSONArray("fields");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                linkedList.add(optJSONArray.optString(i3));
            }
        }
        String optString = jSONObject2.optString("wording");
        int optInt = jSONObject2.optInt("authStatus", 2);
        int optInt2 = jSONObject2.optInt(ConstValue.INIT_CONFIG_KEY_CLIENT_VERSION, 0);
        String appId = d1Var.getAppId();
        Log.m105925i("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData appId:%s, clientVersion:%s", appId, Integer.valueOf(optInt2));
        Log.m105925i("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData wording:%s, authStatus:%d, fieldIds:%s", optString, Integer.valueOf(optInt), optJSONArray);
        C52225z7 z7Var = new C52225z7();
        z7Var.f145732e = linkedList;
        z7Var.f145731d = appId;
        z7Var.f145734g = optInt;
        z7Var.f145736i = optInt2;
        if (optInt2 == 1) {
            MMHandlerThread.postToMainThread(new C87247k0(this, d1Var, i, z7Var, optString));
            return;
        }
        LinkedList linkedList2 = new LinkedList();
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("authGroupList");
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                linkedList2.add("  " + optJSONArray2.optString(i4));
            }
        }
        if (linkedList.size() == 0) {
            Log.m105920e("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData fields is empty");
            d1Var.mo109647a(i2, mo115109j("fail:fields is empty"));
        } else if (TextUtils.isEmpty(optString)) {
            Log.m105920e("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData wording is empty");
            d1Var.mo109647a(i2, mo115109j("fail:wording is empty"));
        } else {
            if (jSONObject2.optJSONArray("authGroupList") != null) {
                Log.m105925i("MicroMsg.JsApiRequestAuthUserAutoFillData", "authGroupList:%s", jSONObject2.optJSONArray("authGroupList").toString());
            }
            MMHandlerThread.postToMainThread(new C45924l0(this, d1Var, i, z7Var, optInt, optString, linkedList2));
        }
    }
}
