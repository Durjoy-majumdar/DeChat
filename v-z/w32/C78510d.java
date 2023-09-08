package w32;

import com.tencent.p014mm.plugin.luckymoney.model.C69267u1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.net.URLEncoder;
import java.util.HashMap;

/* renamed from: w32.d */
public class C78510d extends C69267u1 {
    public C78510d(String str, int i, int i2, String str2, long j, String str3, String str4, String str5, String str6, int i3) {
        HashMap hashMap = new HashMap();
        hashMap.put("sendId", str);
        hashMap.put("limit", i + "");
        hashMap.put("offset", i2 + "");
        if (!Util.isNullOrNil(str2)) {
            hashMap.put("nativeUrl", URLEncoder.encode(str2));
        }
        hashMap.put("befortTimestamp", j + "");
        hashMap.put("ver", str3);
        hashMap.put("processContent", str4);
        hashMap.put("liveid", str5);
        hashMap.put("liveattach", str6);
        if (i3 > 0) {
            hashMap.put("channellive_sender_flag", String.valueOf(i3));
        }
        Log.m105925i("MicroMsg.NetSceneLiveQryLuckyMoneyDetail", "sendId: %s, limit: %s，offet: %s, nativeUrl: %s，processContent: %s", str, Integer.valueOf(i), Integer.valueOf(i2), str2, str4);
        setRequestData(hashMap);
    }

    public int getType() {
        return 4339;
    }

    /* renamed from: j1 */
    public String mo95311j1() {
        return "/cgi-bin/mmpay-bin/ftfhb/channelliveqrydetailwxhb";
    }

    public C78510d(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, int i3) {
        HashMap hashMap = new HashMap();
        hashMap.put("sendId", str);
        hashMap.put("limit", i + "");
        hashMap.put("offset", i2 + "");
        if (!Util.isNullOrNil(str2)) {
            hashMap.put("nativeUrl", URLEncoder.encode(str2));
        }
        hashMap.put("ver", str3);
        hashMap.put("processContent", str4);
        hashMap.put("liveid", str5);
        hashMap.put("liveattach", str6);
        if (i3 > 0) {
            hashMap.put("channellive_sender_flag", String.valueOf(i3));
        }
        Log.m105925i("MicroMsg.NetSceneLiveQryLuckyMoneyDetail", "sendId: %s, limit: %s，offet: %s, nativeUrl: %s，processContent: %s", str, Integer.valueOf(i), Integer.valueOf(i2), str2, str4);
        setRequestData(hashMap);
    }
}
