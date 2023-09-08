package v53;

import com.tencent.p014mm.plugin.appbrand.jsapi.advertise.JsApiOpenAdCanvas;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: v53.x */
public class C78356x extends C75790l {

    /* renamed from: d */
    public int f229614d;

    /* renamed from: e */
    public String f229615e;

    /* renamed from: f */
    public String f229616f;

    public C78356x(String str, int i, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("passwd", str);
        hashMap.put("req_key", str2);
        if (i == 6) {
            hashMap.put("time_stamp", "" + System.currentTimeMillis());
        }
        setRequestData(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("check_pwd_scene", i + "");
        if (C75133p0.f221064a) {
            hashMap2.put("uuid_for_bindcard", C75133p0.f221066c);
            hashMap2.put("bindcard_scene", "" + C75133p0.f221065b);
        }
        setWXRequestData(hashMap2);
        this.f229614d = i;
    }

    public int getFuncId() {
        return JsApiOpenAdCanvas.CTRL_INDEX;
    }

    public int getTenpayCgicmd() {
        return 18;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/checkpwd";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105918d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + i + " errMsg: " + str);
        int i2 = this.f229614d;
        if (i2 == 6 || i2 == 8 || i2 == 18 || i2 == 1) {
            this.f229615e = jSONObject.optString("usertoken");
            this.f229616f = jSONObject.optString("token_type");
        }
    }
}
