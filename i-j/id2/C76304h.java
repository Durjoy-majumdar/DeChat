package id2;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.wechat.aff.ting.TingClientProto;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: id2.h */
public class C76304h extends C76305i {
    public C76304h(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("buss_type", str);
        hashMap.put(FirebaseAnalytics.C113379b.METHOD, str2);
        hashMap.put("network", NetStatusUtil.isWifi(MMApplicationContext.getContext()) ? "wifi" : NetStatusUtil.is3G(MMApplicationContext.getContext()) ? "3g" : NetStatusUtil.is2G(MMApplicationContext.getContext()) ? "2g" : NetStatusUtil.isWap(MMApplicationContext.getContext()) ? "wap" : NetStatusUtil.is4G(MMApplicationContext.getContext()) ? "4g" : "unknown");
        hashMap.put("transactionid", str3);
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return TingClientProto.TingScene.TingScene_FinderProfileSinger_VALUE;
    }

    public int getTenpayCgicmd() {
        return 122;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/datareport";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
    }
}
