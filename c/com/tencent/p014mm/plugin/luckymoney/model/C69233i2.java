package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WCWebUpdater;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.i2 */
public class C69233i2 extends C69196b2 {

    /* renamed from: h */
    public String f199204h;

    /* renamed from: i */
    public String f199205i;

    /* renamed from: j */
    public String f199206j;

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.i2$a */
    public static class C69234a {

        /* renamed from: a */
        public String f199207a;

        /* renamed from: b */
        public String f199208b;

        /* renamed from: c */
        public long f199209c;

        /* renamed from: d */
        public long f199210d;
    }

    public C69233i2(int i, String str, String str2, String str3, String str4, String str5, int i2, String str6, int i3, String str7, int i4, int i5, String str8, C69234a aVar) {
        C69234a aVar2 = aVar;
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        int i6 = i;
        sb.append(i);
        sb.append("");
        hashMap.put("amount", sb.toString());
        hashMap.put("wishing", URLEncoder.encode(Util.nullAsNil(str)));
        String str9 = str4;
        hashMap.put("sendUserName", str4);
        if (!Util.isNullOrNil(str3)) {
            String str10 = str3;
            hashMap.put("username", str3);
        }
        if (!Util.isNullOrNil(str2)) {
            hashMap.put("headImg", URLEncoder.encode(str2));
        }
        if (!Util.isNullOrNil(str5)) {
            hashMap.put("nickName", URLEncoder.encode(Util.nullAsNil(str5)));
        }
        StringBuilder sb4 = new StringBuilder();
        int i7 = i2;
        sb4.append(i2);
        sb4.append("");
        hashMap.put("inWay", sb4.toString());
        hashMap.put("imageId", "");
        hashMap.put("imageAesKey", "");
        hashMap.put("imageLength", "0");
        String str11 = str6;
        hashMap.put("expressionurl", str6);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("");
        int i8 = i3;
        sb5.append(i3);
        hashMap.put("expressiontype", sb5.toString());
        if (aVar2 != null) {
            hashMap.put("voice_url", aVar2.f199207a);
            hashMap.put("voice_aeskey", aVar2.f199208b);
            hashMap.put("voice_file_length", aVar2.f199209c + "");
            hashMap.put("voice_playtime", aVar2.f199210d + "");
            hashMap.put("voice_format", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
        }
        if (!Util.isNullOrNil(str7)) {
            hashMap.put("unique_id", str7);
        }
        hashMap.put("user_confirm_jump", "" + i4);
        hashMap.put("unpay_type", "" + i5);
        if (!Util.isNullOrNil(str8)) {
            hashMap.put("cancel_sendid", str8);
        }
        setRequestData(hashMap);
    }

    public int getType() {
        return 1643;
    }

    /* renamed from: j1 */
    public String mo95311j1() {
        return "/cgi-bin/mmpay-bin/yearrequestwxhb";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        this.f199204h = jSONObject.optString("sendId");
        this.f199205i = jSONObject.optString("reqkey");
        this.f199206j = jSONObject.optString("sendMsgXml");
    }
}
