package id2;

import com.tencent.p014mm.network.C114799u;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;
import p156gj.C87203t;

/* renamed from: id2.k */
public class C46218k extends C75790l {
    public C46218k(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("passwd", str);
        hashMap.put(TPDownloadProxyEnum.USER_DEVICE_ID, C87203t.m108273i());
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 566;
    }

    public int getTenpayCgicmd() {
        return 47;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/offlineclose";
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
    }
}
