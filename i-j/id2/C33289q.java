package id2;

import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;
import p156gj.C87203t;

/* renamed from: id2.q */
public class C33289q extends C75790l {
    public C33289q(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(TPDownloadProxyEnum.USER_DEVICE_ID, C87203t.m108273i());
        hashMap.put("passwd", str);
        setRequestData(hashMap);
    }

    public int getTenpayCgicmd() {
        return 51;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
    }
}
