package ut1;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;
import pv2.C110259i;
import pv2.C110260j;
import tt1.C78101i;
import vt1.C78473a;

/* renamed from: ut1.d */
public class C78279d extends C75790l {
    public C78279d(int i) {
        HashMap hashMap = new HashMap();
        C110260j a = C110259i.m149874a();
        String str = a.f329808a;
        String str2 = a.f329809b;
        hashMap.put("cpu_id", str);
        hashMap.put("uid", str2);
        hashMap.put("soter_type", "" + i);
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 1597;
    }

    public int getTenpayCgicmd() {
        return 116;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/closetouchpay";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        if (i == 0) {
            ((C78101i) C86709a0.m107533q(C78101i.class)).mo108070G3(Integer.valueOf(jSONObject != null ? jSONObject.optInt("clear_rsa_key_level", 0) : 0));
        } else {
            Log.m105920e("MicroMsg.NetSceneTenpayCloseTouchPay", "do close fingerprint cgi failed!");
        }
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
        C78473a aVar = (C78473a) C86709a0.m107533q(C78473a.class);
        if (aVar.mo107880J3()) {
            C115669n.INSTANCE.mo160131h(13686, Integer.valueOf(i2), Integer.valueOf(i3));
        } else if (aVar.mo107883Zi()) {
            C115669n.INSTANCE.mo160131h(16994, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        if (i2 == 0 && i3 == 0) {
            aVar.mo107878Fg(false);
            aVar.W00(false);
            Log.m105920e("MicroMsg.NetSceneTenpayCloseTouchPay", "hy: do close fingerprint cgi success!");
            return;
        }
        Log.m105920e("MicroMsg.NetSceneTenpayCloseTouchPay", "hy: do close fingerprint cgi failed!");
    }
}
