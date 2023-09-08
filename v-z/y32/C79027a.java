package y32;

import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;
import z32.C79304a;

/* renamed from: y32.a */
public class C79027a extends C75790l {

    /* renamed from: d */
    public int f232033d = 0;

    public C79027a(int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("flag", "" + i);
        hashMap.put("passwd", str);
        hashMap.put("req_key", "" + str2);
        this.f232033d = i;
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 1697;
    }

    public int getTenpayCgicmd() {
        return 1697;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/snspaymanage";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105924i("MicroMsg.NetSceneSnsPayManage", " errCode: " + i + " errMsg :" + str);
        if (i != 0) {
            Log.m105920e("MicroMsg.NetSceneSnsPayManage", "onGYNetEnd() NetSceneSnsPayManage is false!");
        } else if (this.f232033d == 1) {
            C79304a.m96008d(1);
            Log.m105924i("MicroMsg.NetSceneSnsPayManage", "onGYNetEnd() setIsOpenSnsPay with 1");
        } else {
            C79304a.m96008d(0);
            Log.m105924i("MicroMsg.NetSceneSnsPayManage", "onGYNetEnd() setIsOpenSnsPay with 0");
        }
    }
}
