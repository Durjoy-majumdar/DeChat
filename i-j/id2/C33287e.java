package id2;

import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: id2.e */
public class C33287e extends C75790l {
    public C33287e(String str, int i, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("req_key", str);
        hashMap.put("pay_scene", "" + i);
        hashMap.put("pay_channel", "" + i2);
        setRequestData(hashMap);
    }

    public int getTenpayCgicmd() {
        return 1385;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/offlinecancelpay";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105925i("NetSceneOfflineCancelPay", "onGYNetEnd errCode:%d, errMsg:%s", Integer.valueOf(i), str);
    }
}
