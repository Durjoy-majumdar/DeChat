package w32;

import com.tencent.p014mm.plugin.luckymoney.model.C69224g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.net.URLEncoder;
import java.util.HashMap;

/* renamed from: w32.c */
public class C78509c extends C69224g2 {
    public C78509c(int i, long j, long j2, int i2, String str, String str2, String str3, String str4, String str5, String str6, int i3, String str7, String str8, int i4, int i5, String str9, String str10, int i6, String str11, String str12, String str13, int i7) {
        int i8 = i2;
        int i9 = i3;
        String str14 = str8;
        Log.m105925i("MicroMsg.NetSceneLivePrepareLuckyMoney", "NetScenePrepareLuckyMoney() uniqueId:%s, userConfiremJump:%s, unpayType:%s, cancelSendId:%s", str14, Integer.valueOf(i4), Integer.valueOf(i5), Util.nullAsNil(str9));
        this.f199185n = i;
        HashMap hashMap = new HashMap();
        if (i8 == 3) {
            hashMap.put("totalNum", "1");
        } else {
            hashMap.put("totalNum", i + "");
        }
        StringBuilder sb = new StringBuilder();
        long j3 = j;
        sb.append(j);
        sb.append("");
        hashMap.put("totalAmount", sb.toString());
        hashMap.put("perValue", j2 + "");
        hashMap.put("hbType", i8 + "");
        hashMap.put("wishing", URLEncoder.encode(Util.nullAsNil(str)));
        hashMap.put("sendUserName", str5);
        if (!Util.isNullOrNil(str8)) {
            hashMap.put("unique_id", str14);
        }
        hashMap.put("user_confirm_jump", String.valueOf(i4));
        hashMap.put("unpay_type", String.valueOf(i5));
        hashMap.put("cancel_sendid", str9);
        hashMap.put("expression_md5", str10);
        hashMap.put("expression_type", "" + i6);
        if (!Util.isNullOrNil(str2)) {
            hashMap.put("headImg", URLEncoder.encode(str2));
            hashMap.put("nickName", URLEncoder.encode(Util.nullAsNil(str6)));
            if (!Util.isNullOrNil(str4)) {
                hashMap.put("receiveNickName", URLEncoder.encode(str4));
            }
        }
        hashMap.put("inWay", i9 + "");
        if (i9 == 0 || i9 == 1 || i9 == 7) {
            hashMap.put("needSendToMySelf", "0");
        }
        hashMap.put("showSourceMac", URLEncoder.encode(str7));
        hashMap.put("exclusiveRecvUsername", str11);
        hashMap.put("liveid", str12);
        hashMap.put("liveattach", str13);
        if (i7 > 0) {
            hashMap.put("channellive_sender_flag", String.valueOf(i7));
        }
        hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, String.valueOf(23));
        setRequestData(hashMap);
    }

    public int getType() {
        return 4373;
    }

    /* renamed from: j1 */
    public String mo95311j1() {
        return "/cgi-bin/mmpay-bin/ftfhb/channelliverequestwxhb";
    }
}
