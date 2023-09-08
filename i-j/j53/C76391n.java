package j53;

import b63.C67210w;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.C1641d;
import com.tencent.p014mm.wallet_core.model.C45119n;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: j53.n */
public class C76391n extends C75790l implements C45119n {
    public C76391n(C67210w wVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put("flag", wVar.f192983a);
        hashMap.put("passwd", wVar.f192984b);
        hashMap.put("rpasswd", wVar.f192984b);
        hashMap.put("verify_code", wVar.f192985c);
        hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, wVar.f192986d);
        setPayInfo(wVar.f192996n, hashMap, hashMap2);
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }

    public int getFuncId() {
        return C1641d.CTRL_INDEX;
    }

    public int getTenpayCgicmd() {
        return 20;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/resetpwd";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
    }
}
