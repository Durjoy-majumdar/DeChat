package j53;

import b63.C67210w;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: j53.q */
public class C76393q extends C75790l {
    public C76393q(C67210w wVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put("verify_code", wVar.f192985c);
        hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, wVar.f192986d);
        setPayInfo(wVar.f192996n, hashMap, hashMap2);
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }

    public int getFuncId() {
        return 470;
    }

    public int getTenpayCgicmd() {
        return 11;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/resetpwdverify";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
    }
}
