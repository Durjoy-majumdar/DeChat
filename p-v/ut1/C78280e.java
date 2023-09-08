package ut1;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: ut1.e */
public class C78280e extends C75790l {

    /* renamed from: d */
    public String f229305d = "";

    /* renamed from: e */
    public String f229306e = "";

    /* renamed from: f */
    public String f229307f = "";

    public C78280e(String str) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_cert_info is empty");
        } else {
            Log.m105924i("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_cert_info is not empty");
        }
        hashMap.put("encrypted_cert_info", URLEncoder.encode(str));
        hashMap.put("ver", "0x1.0");
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 1598;
    }

    public int getTenpayCgicmd() {
        return 118;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/getopentouchcert";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f229305d = jSONObject.optString("encrypted_device_info");
            this.f229306e = jSONObject.optString("encrypted_rsa_sign");
            this.f229307f = jSONObject.optString("cert");
            if (TextUtils.isEmpty(this.f229305d)) {
                Log.m105920e("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_device_info is empty");
            } else {
                Log.m105924i("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_device_info is not empty");
            }
            if (TextUtils.isEmpty(this.f229306e)) {
                Log.m105920e("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_rsa_sign is empty");
            } else {
                Log.m105924i("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_rsa_sign is not empty");
            }
            if (TextUtils.isEmpty(this.f229307f)) {
                Log.m105920e("MicroMsg.NetSceneTenpayGetOpenTouchCert", "cert is empty");
            } else {
                Log.m105924i("MicroMsg.NetSceneTenpayGetOpenTouchCert", "cert is not empty");
            }
        }
    }
}
