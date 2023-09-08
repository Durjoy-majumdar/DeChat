package w32;

import com.tencent.p014mm.plugin.luckymoney.model.C69237j2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import f40.C86709a0;
import java.net.URLEncoder;
import java.util.HashMap;

/* renamed from: w32.e */
public class C78511e extends C69237j2 {
    public C78511e(int i, int i2, String str, String str2, int i3, String str3, String str4, String str5, String str6, int i4) {
        this.f199242h = i;
        this.f199243i = i2;
        this.f199244j = str;
        this.f199245n = str2;
        HashMap hashMap = new HashMap();
        hashMap.put("msgType", i + "");
        hashMap.put(AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID, i2 + "");
        hashMap.put("sendId", str);
        hashMap.put("inWay", i3 + "");
        hashMap.put("ver", str3);
        C86709a0.m107528h();
        long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REALNAME_DISCLAIMER_QUERY_EXPIRED_TIME_LONG_SYNC, 0L)).longValue();
        if (longValue > 0) {
            if (System.currentTimeMillis() < longValue) {
                hashMap.put("agreeDuty", "0");
            } else {
                StringBuilder sb = new StringBuilder();
                C86709a0.m107528h();
                sb.append((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_DISCLAIMER_NEED_AGERR_INT_SYNC, 1));
                sb.append("");
                hashMap.put("agreeDuty", sb.toString());
            }
        }
        if (!Util.isNullOrNil(str2)) {
            hashMap.put("nativeUrl", URLEncoder.encode(str2));
        }
        hashMap.put("group_name", str4);
        hashMap.put("liveid", str5);
        hashMap.put("liveattach", str6);
        if (i4 > 0) {
            hashMap.put("channellive_sender_flag", String.valueOf(i4));
        }
        Log.m105924i("MicroMsg.NetSceneLiveReceiveLuckyMoney", "NetSceneReceiveLuckyMoney request");
        setRequestData(hashMap);
    }

    public int getType() {
        return 4717;
    }

    /* renamed from: j1 */
    public String mo95311j1() {
        return "/cgi-bin/mmpay-bin/ftfhb/channellivereceivewxhb";
    }
}
