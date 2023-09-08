package v53;

import fr3.C75790l;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: v53.c0 */
public class C52766c0 extends C75790l {

    /* renamed from: d */
    public String f147431d;

    public C52766c0(String str, int i, String str2, String str3, String str4, String str5) {
        HashMap hashMap = new HashMap();
        hashMap.put("passwd", str);
        hashMap.put("check_pwd_scene", i + "");
        hashMap.put("package", URLEncoder.encode(str2));
        hashMap.put("sign", str3);
        hashMap.put("sign_type", str4);
        hashMap.put("busi_id", str5);
        setRequestData(hashMap);
    }

    public boolean callbackUIWhenWalletError() {
        return true;
    }

    public int getFuncId() {
        return 2704;
    }

    public int getTenpayCgicmd() {
        return 2704;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/getpaypwdtoken";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        this.f147431d = jSONObject.optString("usertoken", "");
    }

    public C52766c0(String str, int i, String str2, String str3, String str4, String str5, int i2, String str6, String str7) {
        HashMap hashMap = new HashMap();
        hashMap.put("passwd", str);
        hashMap.put("check_pwd_scene", i + "");
        hashMap.put("package", URLEncoder.encode(str2));
        hashMap.put("sign", str3);
        hashMap.put("sign_type", str4);
        hashMap.put("busi_id", str5);
        hashMap.put("use_touch", i2 + "");
        setRequestData(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("soter_req", str6);
        hashMap2.put("fingerData", str7);
        setWXRequestData(hashMap2);
    }
}
