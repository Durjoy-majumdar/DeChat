package j53;

import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: j53.e */
public class C33517e extends C75790l {
    public C33517e(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("passwd", str);
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 1321;
    }

    public int getTenpayCgicmd() {
        return 0;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/closewalletlock";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.NetSceneCloseWalletLock", "alvinluo close wallet lock errCode: %d, errMsg: %s, json: %s", Integer.valueOf(i), str, jSONObject);
    }
}
