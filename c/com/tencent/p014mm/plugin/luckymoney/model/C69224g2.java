package com.tencent.p014mm.plugin.luckymoney.model;

import b63.C67175a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import java.net.URLEncoder;
import java.util.HashMap;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONObject;
import p740wo.C53193b;
import sf0.C48374j0;
import te3.C64727tg2;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.g2 */
public class C69224g2 extends C69196b2 {

    /* renamed from: h */
    public String f199182h;

    /* renamed from: i */
    public String f199183i;

    /* renamed from: j */
    public String f199184j;

    /* renamed from: n */
    public int f199185n;

    /* renamed from: o */
    public String f199186o;

    public C69224g2() {
    }

    /* renamed from: m1 */
    public static boolean m81567m1(C117747y yVar) {
        try {
            JSONObject jSONObject = new JSONObject(C48374j0.m53717f(((C64727tg2) ((C47350c) yVar.getReqResp()).f127056b.f127083a).f185557d));
            return jSONObject.has("showmess") && Util.isEqual(jSONObject.optJSONObject("showmess").optInt("return_to_session", 0), 1);
        } catch (Exception e) {
            Log.m105925i("MicroMsg.NetScenePrepareLuckyMoney", "ifReturnByReturnToSession() Exception：%s", e.getMessage());
        }
    }

    /* renamed from: n1 */
    public static C67175a m81568n1(C69224g2 g2Var, JSONObject jSONObject) {
        C67175a aVar = new C67175a();
        aVar.f192844a = jSONObject.optString("retmsg");
        JSONObject optJSONObject = jSONObject.optJSONObject("showmess");
        aVar.f192845b = optJSONObject.optString("left_button_wording");
        aVar.f192846c = optJSONObject.optString("right_button_wording");
        aVar.f192847d = optJSONObject.optString("right_button_url");
        if (g2Var != null) {
            jSONObject.optInt("return_to_session", 0);
        }
        return aVar;
    }

    public int getType() {
        return 1575;
    }

    /* renamed from: j1 */
    public String mo95311j1() {
        return "/cgi-bin/mmpay-bin/requestwxhb";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.NetScenePrepareLuckyMoney", "errCode: %s, errMsg: %s ，json：%s", Integer.valueOf(i), str, jSONObject.toString());
        this.f199182h = jSONObject.optString("sendId");
        this.f199183i = jSONObject.optString("reqkey");
        this.f199184j = jSONObject.optString("sendMsgXml");
        jSONObject.optString("guide_flag", "0");
        jSONObject.optString("guide_wording");
        jSONObject.optString("left_button_wording", "");
        jSONObject.optString("right_button_wording", "");
        jSONObject.optString("upload_credit_url", "");
        this.f199186o = jSONObject.optString("id_sign", "");
        if (jSONObject.has("showmess")) {
            Log.m105924i("MicroMsg.NetScenePrepareLuckyMoney", "has alert item");
            m81568n1(this, jSONObject);
        }
    }

    public C69224g2(int i, long j, long j2, int i2, String str, String str2, String str3, String str4, String str5, String str6, int i3, String str7) {
        this(i, j, j2, i2, str, str2, str3, str4, str5, str6, i3, str7, "", 0, 0, "", "", 0, "");
    }

    public C69224g2(int i, long j, long j2, int i2, String str, String str2, String str3, String str4, String str5, String str6, int i3, String str7, String str8, int i4, int i5, String str9, String str10, int i6, String str11) {
        int i7 = i2;
        String str12 = str3;
        int i8 = i3;
        String str13 = str8;
        Log.m105925i("MicroMsg.NetScenePrepareLuckyMoney", "NetScenePrepareLuckyMoney() uniqueId:%s, userConfiremJump:%s, unpayType:%s, cancelSendId:%s", str13, Integer.valueOf(i4), Integer.valueOf(i5), Util.nullAsNil(str9));
        this.f199185n = i;
        HashMap hashMap = new HashMap();
        if (i7 == 3) {
            hashMap.put("totalNum", "1");
        } else {
            hashMap.put("totalNum", i + "");
        }
        hashMap.put("totalAmount", j + "");
        hashMap.put("perValue", j2 + "");
        hashMap.put("hbType", i7 + "");
        hashMap.put("wishing", URLEncoder.encode(Util.nullAsNil(str)));
        hashMap.put("sendUserName", str5);
        if (!Util.isNullOrNil(str8)) {
            hashMap.put("unique_id", str13);
        }
        hashMap.put("user_confirm_jump", String.valueOf(i4));
        hashMap.put("unpay_type", String.valueOf(i5));
        hashMap.put("cancel_sendid", str9);
        hashMap.put("expression_md5", str10);
        hashMap.put("expression_type", "" + i6);
        if (!Util.isNullOrNil(str3)) {
            hashMap.put("username", str12);
            if (C72996z1.m85820U5(str3)) {
                int p1 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(str12);
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
        hashMap.put("inWay", i8 + "");
        if (i8 == 0 || i8 == 1 || i8 == 7) {
            hashMap.put("needSendToMySelf", "0");
        }
        hashMap.put("showSourceMac", URLEncoder.encode(str7));
        hashMap.put("exclusiveRecvUsername", str11);
        setRequestData(hashMap);
    }
}
