package v53;

import b63.C67210w;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: v53.i0 */
public class C78346i0 extends C75790l {

    /* renamed from: d */
    public String f229581d;

    public C78346i0(C67210w wVar, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("verify_code", wVar.f192985c);
        hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, wVar.f192986d);
        hashMap.put("passwd", wVar.f192984b);
        hashMap.put("relation_key", str);
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 1604;
    }

    public int getTenpayCgicmd() {
        return 124;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/webankverifysms";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        if (jSONObject != null && i == 0) {
            jSONObject.optString("token_type");
            this.f229581d = jSONObject.optString("usertoken");
        }
    }
}
