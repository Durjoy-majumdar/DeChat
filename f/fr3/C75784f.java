package fr3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.tenpay.model.C75160b;
import java.util.Map;
import org.json.JSONObject;
import sf0.C90188n0;

/* renamed from: fr3.f */
public class C75784f extends C75160b {

    /* renamed from: d */
    public JSONObject f222380d;

    /* renamed from: e */
    public int f222381e = 0;

    public C75784f(Map<String, String> map) {
        Log.m105924i("MicroMsg.NetSceneDelayQueryOrder", "NetSceneDelayQueryOrder call");
        setRequestData(map);
    }

    public int getFuncId() {
        return 1525;
    }

    public int getTenpayCgicmd() {
        return 1525;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/payorderquery";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        super.onGYNetEnd(i, str, jSONObject);
        if (C90188n0.f258925S) {
            try {
                jSONObject = new JSONObject("{\"retcode\":268447844,\"retmsg\":\"系统麻烦请稍后再试\",\"can_pay_retry\":1,\"show_retmsg_type\":1}");
            } catch (Exception unused) {
            }
        }
        Log.m105924i("MicroMsg.NetSceneDelayQueryOrder", "errCode = " + i + "errMsg=" + str);
        this.f222380d = jSONObject;
        if (jSONObject != null) {
            Log.m105919d("MicroMsg.NetSceneDelayQueryOrder", "ret json: %s", jSONObject.toString());
            jSONObject.optInt("can_pay_retry");
            this.f222381e = jSONObject.optInt("show_retmsg_type");
        }
    }
}
