package fr3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C45119n;
import org.json.JSONObject;

/* renamed from: fr3.n */
public class C75792n extends C75790l implements C45119n {

    /* renamed from: d */
    public String f222399d;

    public int getFuncId() {
        return 1694;
    }

    public int getTenpayCgicmd() {
        return 127;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/payauthnative";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.NetSceneTenpayNativeAuthen", "errCode: %d, errMsg: %s", Integer.valueOf(i), str);
        Log.m105919d("MicroMsg.NetSceneTenpayNativeAuthen", "json: %s", jSONObject.toString());
        jSONObject.optString("reqkey");
        jSONObject.optString("appid");
        jSONObject.optString("appsource");
        jSONObject.optString("productid");
        this.f222399d = jSONObject.optString("retcode");
        jSONObject.optString("retmsg");
        JSONObject optJSONObject = jSONObject.optJSONObject("wallet_mix_sp_genprepay_resp");
        if (optJSONObject != null) {
            optJSONObject.optString("pay_gate_url");
            throw null;
        }
    }
}
