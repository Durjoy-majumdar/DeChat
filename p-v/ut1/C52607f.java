package ut1;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONObject;
import p156gj.C87203t;
import st1.C48462m;

/* renamed from: ut1.f */
public class C52607f extends C75790l {
    public C52607f(String str, String str2, String str3, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("encrypted_open_info", URLEncoder.encode(str));
        hashMap.put("encrypted_rsa_sign", URLEncoder.encode(str2));
        hashMap.put("passwd", str3);
        setRequestData(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("device_type", C87203t.m108275k());
        hashMap2.put("open_scene", "" + i);
        setWXRequestData(hashMap2);
    }

    public int getFuncId() {
        return 1599;
    }

    public int getTenpayCgicmd() {
        return 119;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/androidopentouch";
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
        if (i2 == 0 && i3 == 0) {
            Log.m105924i("MicroMsg.NetSceneTenpayOpenTouch", "open fingerprintpay success");
            C48462m.m53818b(true);
            return;
        }
        Log.m105920e("MicroMsg.NetSceneTenpayOpenTouch", "open fingerprintpay failed");
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
    }
}
