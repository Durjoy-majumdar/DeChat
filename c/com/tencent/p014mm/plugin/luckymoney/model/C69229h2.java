package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import java.net.URLEncoder;
import java.util.HashMap;
import p740wo.C53193b;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.h2 */
public class C69229h2 extends C69224g2 {
    public C69229h2(int i, long j, long j2, int i2, String str, String str2, String str3, String str4, String str5, String str6, int i3, String str7, String str8, int i4, int i5, String str9, String str10, int i6) {
        String str11 = str3;
        int i7 = i3;
        String str12 = str8;
        this.f199185n = i;
        HashMap hashMap = new HashMap();
        hashMap.put("totalNum", i + "");
        StringBuilder sb = new StringBuilder();
        long j3 = j;
        sb.append(j);
        sb.append("");
        hashMap.put("totalAmount", sb.toString());
        StringBuilder sb4 = new StringBuilder();
        long j4 = j2;
        sb4.append(j2);
        sb4.append("");
        hashMap.put("perValue", sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        int i8 = i2;
        sb5.append(i2);
        sb5.append("");
        hashMap.put("hbType", sb5.toString());
        hashMap.put("wishing", URLEncoder.encode(Util.nullAsNil(str)));
        hashMap.put("sendUserName", str5);
        if (!Util.isNullOrNil(str8)) {
            hashMap.put("unique_id", str12);
        }
        hashMap.put("user_confirm_jump", String.valueOf(i4));
        hashMap.put("unpay_type", String.valueOf(i5));
        hashMap.put("cancel_sendid", str9);
        hashMap.put("expression_md5", str10);
        hashMap.put("expression_type", "" + i6);
        if (!Util.isNullOrNil(str3)) {
            hashMap.put("username", str11);
            if (C72996z1.m85820U5(str3)) {
                int p1 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(str11);
                hashMap.put("chatroomUserCnt", p1 + "");
            }
        }
        if (!Util.isNullOrNil(str2)) {
            hashMap.put("headImg", URLEncoder.encode(str2));
            hashMap.put("nickName", URLEncoder.encode(Util.nullAsNil(str6)));
            if (!Util.isNullOrNil(str4)) {
                hashMap.put("receiveNickName", URLEncoder.encode(str4));
            }
        }
        hashMap.put("inWay", i7 + "");
        if (i7 == 0 || i7 == 1 || i7 == 7) {
            hashMap.put("needSendToMySelf", "0");
        }
        hashMap.put("showSourceMac", URLEncoder.encode(str7));
        hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "20");
        hashMap.put("union_source", "0");
        Log.m105925i("MicroMsg.NetScenePrepareLuckyMoneyUnion", "NetScenePrepareLuckyMoneyUnion request :uniqueId:%s, userConfiremJump:%s, unpayType:%s, cancelSendId:%s", str12, Integer.valueOf(i4), Integer.valueOf(i5), Util.nullAsNil(str9));
        setRequestData(hashMap);
    }

    public int getType() {
        return 4915;
    }

    /* renamed from: j1 */
    public String mo95311j1() {
        return "/cgi-bin/mmpay-bin/unionhb/requestunionhb";
    }
}
