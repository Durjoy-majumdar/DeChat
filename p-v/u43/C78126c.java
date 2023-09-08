package u43;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: u43.c */
public class C78126c extends C75790l {

    /* renamed from: d */
    public boolean f228936d = false;

    public C78126c(int i, String str, String str2, String str3, int i2, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("flag", "" + i);
        hashMap.put("passwd", str);
        hashMap.put("req_key", str3);
        hashMap.put("verify_code", str2);
        hashMap.put("pay_scene", "" + i2);
        hashMap.put("ignore_bind", str4);
        if ("0".equals(str4)) {
            this.f228936d = true;
        }
        setRequestData(hashMap);
        HashMap hashMap2 = new HashMap();
        if (C75133p0.f221064a) {
            hashMap2.put("uuid_for_bindcard", C75133p0.f221066c);
            hashMap2.put("bindcard_scene", "" + C75133p0.f221065b);
        }
        setWXRequestData(hashMap2);
    }

    public int getFuncId() {
        return 1506;
    }

    public int getTenpayCgicmd() {
        return 76;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/verifybind";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105918d("Micromsg.NetSceneTenpayBalanceSave", "errCode " + i + " errMsg: " + str);
        if (i == 0) {
            jSONObject.optString("req_key");
        }
    }
}
