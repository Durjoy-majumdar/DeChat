package j53;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.util.HashMap;
import ob0.C11385n;
import org.json.JSONObject;

/* renamed from: j53.r */
public class C46433r extends C75790l {
    public C46433r(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("passwd", str);
        setRequestData(hashMap);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.callback = nVar;
        return super.doScene(gVar, nVar);
    }

    public int getFuncId() {
        return 1304;
    }

    public int getTenpayCgicmd() {
        return 0;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/touchlockauthen";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = str;
        objArr[2] = jSONObject != null ? jSONObject.toString() : "null";
        Log.m105927v("MicroMsg.NetSceneTouchLockVerifyByPwd", "alvinluo errCode: %d, errMsg: %s, json: %s", objArr);
    }
}
