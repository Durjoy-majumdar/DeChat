package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import f40.C86709a0;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.r1 */
public class C69261r1 extends C69255o1 {

    /* renamed from: A */
    public long f199312A = 0;

    /* renamed from: B */
    public C69249n f199313B;

    /* renamed from: h */
    public String f199314h;

    /* renamed from: i */
    public String f199315i;

    /* renamed from: j */
    public int f199316j;

    /* renamed from: n */
    public String f199317n;

    /* renamed from: o */
    public String f199318o;

    /* renamed from: p */
    public String f199319p;

    /* renamed from: q */
    public int f199320q;

    /* renamed from: r */
    public int f199321r;

    /* renamed from: s */
    public String f199322s;

    /* renamed from: t */
    public String f199323t;

    /* renamed from: u */
    public int f199324u;

    /* renamed from: v */
    public String f199325v;

    /* renamed from: w */
    public String f199326w;

    /* renamed from: x */
    public int f199327x;

    /* renamed from: y */
    public int f199328y;

    /* renamed from: z */
    public String f199329z = null;

    public C69261r1() {
    }

    /* renamed from: k1 */
    public int mo95404k1() {
        return 0;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.NetSceneLuckyMoneyBusiBase", "errCode：%s errMsg：%s json：%s", Integer.valueOf(i), str, jSONObject.toString());
        this.f199329z = jSONObject.toString();
        this.f199317n = jSONObject.optString("spidLogo");
        this.f199318o = jSONObject.optString("spidWishing");
        this.f199319p = jSONObject.optString("spidName");
        this.f199317n = jSONObject.optString("spidLogo");
        this.f199320q = jSONObject.optInt("hbStatus");
        this.f199321r = jSONObject.optInt("receiveStatus");
        this.f199322s = jSONObject.optString("statusMess");
        jSONObject.optString("hintMess");
        this.f199323t = jSONObject.optString("watermark");
        this.f199315i = jSONObject.optString("sendId");
        this.f199324u = jSONObject.optInt("focusFlag");
        this.f199325v = jSONObject.optString("focusWording");
        this.f199326w = jSONObject.optString("focusAppidUserName");
        this.f199327x = jSONObject.optInt("isFocus");
        this.f199328y = jSONObject.optInt("hbType");
        this.f199313B = new C69249n();
        JSONObject optJSONObject = jSONObject.optJSONObject("atomicFunc");
        if (optJSONObject != null) {
            this.f199313B.f199277d = optJSONObject.optInt("enable");
            this.f199313B.f199279f = optJSONObject.optString("fissionContent");
            this.f199313B.f199278e = optJSONObject.optString("fissionUrl");
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("agree_duty");
        if (optJSONObject2 != null) {
            optJSONObject2.optString("agreed_flag", "-1");
            optJSONObject2.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
            optJSONObject2.optString("service_protocol_wording", "");
            optJSONObject2.optString("service_protocol_url", "");
            optJSONObject2.optString("button_wording", "");
            this.f199312A = optJSONObject2.optLong("delay_expired_time", 0);
        }
        if (this.f199312A > 0) {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_REALNAME_DISCLAIMER_QUERY_EXPIRED_TIME_LONG_SYNC, Long.valueOf(System.currentTimeMillis() + (this.f199312A * 1000)));
        }
        C69232i1.m81584h(jSONObject.optJSONObject("operationTail"));
    }

    public C69261r1(String str, String str2, int i, String str3) {
        Log.m105925i("MicroMsg.NetSceneLuckyMoneyBusiBase", "sendId:%s nativeUrl:%s way:%s", str, str2, Integer.valueOf(i));
        this.f199314h = str2;
        this.f199315i = str;
        this.f199316j = i;
        HashMap hashMap = new HashMap();
        hashMap.put("sendId", str);
        if (!Util.isNullOrNil(str2)) {
            hashMap.put("nativeUrl", URLEncoder.encode(str2));
        }
        hashMap.put("way", i + "");
        hashMap.put(AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID, "2");
        hashMap.put("package", str3);
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
        setRequestData(hashMap);
    }
}
