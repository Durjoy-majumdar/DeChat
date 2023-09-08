package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import d62.C75339i;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.j2 */
public class C69237j2 extends C69196b2 {

    /* renamed from: A */
    public int f199223A;

    /* renamed from: B */
    public C69209e1 f199224B;

    /* renamed from: C */
    public String f199225C = null;

    /* renamed from: D */
    public String f199226D = null;

    /* renamed from: E */
    public String f199227E = null;

    /* renamed from: F */
    public String f199228F = null;

    /* renamed from: G */
    public String f199229G = null;

    /* renamed from: H */
    public long f199230H = 0;

    /* renamed from: I */
    public int f199231I = 0;

    /* renamed from: J */
    public int f199232J;

    /* renamed from: K */
    public int f199233K = 0;

    /* renamed from: L */
    public int f199234L = 0;

    /* renamed from: M */
    public String f199235M;

    /* renamed from: N */
    public int f199236N;

    /* renamed from: P */
    public String f199237P;

    /* renamed from: Q */
    public C69256o2 f199238Q;

    /* renamed from: R */
    public boolean f199239R;

    /* renamed from: S */
    public String f199240S;

    /* renamed from: T */
    public long f199241T;

    /* renamed from: h */
    public int f199242h;

    /* renamed from: i */
    public int f199243i;

    /* renamed from: j */
    public String f199244j;

    /* renamed from: n */
    public String f199245n;

    /* renamed from: o */
    public String f199246o;

    /* renamed from: p */
    public boolean f199247p = false;

    /* renamed from: q */
    public String f199248q;

    /* renamed from: r */
    public long f199249r;

    /* renamed from: s */
    public int f199250s;

    /* renamed from: t */
    public int f199251t;

    /* renamed from: u */
    public String f199252u;

    /* renamed from: v */
    public String f199253v;

    /* renamed from: w */
    public String f199254w;

    /* renamed from: x */
    public int f199255x;

    /* renamed from: y */
    public int f199256y;

    /* renamed from: z */
    public String f199257z;

    public C69237j2(int i, int i2, String str, String str2, int i3, String str3, String str4) {
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
        Log.m105924i("MicroMsg.NetSceneReceiveLuckyMoney", "NetSceneReceiveLuckyMoney request");
        setRequestData(hashMap);
    }

    public int getType() {
        return 1581;
    }

    /* renamed from: j1 */
    public String mo95311j1() {
        return "/cgi-bin/mmpay-bin/receivewxhb";
    }

    /* renamed from: m1 */
    public void mo95392m1() {
        C86709a0.m107528h();
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LUCKY_MONEY_HONGBAO_LOCAL_SWITCH_INT, 0)).intValue();
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_hongbao_emoji_all_switch, 0);
        if (Util.isEqual(intValue, 1) || Util.isEqual(Qe, 1)) {
            this.f199234L = 1;
            this.f199233K = 1;
        }
        Log.m105925i("MicroMsg.NetSceneReceiveLuckyMoney", "localSwitch() showRecNormalExpression:%s showYearExpression:%s", Integer.valueOf(this.f199234L), Integer.valueOf(this.f199233K));
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        C69256o2 o2Var;
        Log.m105925i("MicroMsg.NetSceneReceiveLuckyMoney", "errCode: %s, errMsg: %s ，json：%s", Integer.valueOf(i), str, jSONObject.toString());
        this.f199246o = jSONObject.optString("sendNick");
        this.f199248q = jSONObject.optString("sendHeadImg");
        this.f199250s = jSONObject.optInt("hbStatus");
        this.f199251t = jSONObject.optInt("receiveStatus");
        this.f199252u = jSONObject.optString("statusMess");
        this.f199254w = jSONObject.optString("wishing");
        this.f199255x = jSONObject.optInt("isSender");
        this.f199249r = jSONObject.optLong("sceneAmount");
        jSONObject.optLong("sceneRecTimeStamp");
        this.f199256y = jSONObject.optInt("hbType");
        jSONObject.optString("watermark");
        this.f199253v = jSONObject.optString("externMess");
        this.f199257z = jSONObject.optString("sendUserName");
        if (Util.isNullOrNil(this.f199246o)) {
            this.f199247p = true;
        }
        if (!Util.isNullOrNil(this.f199257z) && Util.isNullOrNil(this.f199246o)) {
            this.f199246o = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(this.f199257z);
        }
        C69232i1.m81584h(jSONObject.optJSONObject("operationTail"));
        this.f199224B = C69232i1.m81583g(jSONObject.optJSONObject("new_year_cover_config"));
        this.f199231I = jSONObject.optInt("scenePicSwitch");
        JSONObject optJSONObject = jSONObject.optJSONObject("agree_duty");
        if (optJSONObject != null) {
            this.f199225C = optJSONObject.optString("agreed_flag", "-1");
            this.f199226D = optJSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
            this.f199227E = optJSONObject.optString("service_protocol_wording", "");
            this.f199228F = optJSONObject.optString("service_protocol_url", "");
            this.f199229G = optJSONObject.optString("button_wording", "");
            this.f199230H = optJSONObject.optLong("delay_expired_time", 0);
        }
        if (this.f199230H > 0) {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_REALNAME_DISCLAIMER_QUERY_EXPIRED_TIME_LONG_SYNC, Long.valueOf(System.currentTimeMillis() + (this.f199230H * 1000)));
        }
        Log.m105924i("MicroMsg.NetSceneReceiveLuckyMoney", "scenePicSwitch:" + this.f199231I);
        this.f199232J = jSONObject.optInt("preStrainFlag", 1);
        Log.m105924i("MicroMsg.NetSceneReceiveLuckyMoney", "preStrainFlag:" + this.f199232J);
        int optInt = jSONObject.optInt("showYearExpression");
        this.f199233K = optInt;
        Log.m105925i("MicroMsg.NetSceneReceiveLuckyMoney", "showYearExpression:%s", Integer.valueOf(optInt));
        int optInt2 = jSONObject.optInt("showRecNormalExpression");
        this.f199234L = optInt2;
        Log.m105925i("MicroMsg.NetSceneReceiveLuckyMoney", "showRecNormalExpression:%s", Integer.valueOf(optInt2));
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_NEWYEAR_HONGBAO_IMAGE_PRESTRAIN_FLAG_INT_SYNC, Integer.valueOf(this.f199232J));
        this.f199237P = jSONObject.optString("timingIdentifier");
        jSONObject.optString("effectResource");
        this.f199239R = jSONObject.optBoolean("enable_set_status", false);
        this.f199235M = jSONObject.optString("expression_md5");
        this.f199236N = jSONObject.optInt("expression_type");
        this.f199223A = jSONObject.optInt("not_show_avatar", 0);
        Log.m105925i("MicroMsg.NetSceneReceiveLuckyMoney", "expressionmd5:%s expressiontype:%s enableSetStatus:%s", this.f199235M, Integer.valueOf(this.f199236N), Boolean.valueOf(this.f199239R));
        JSONObject optJSONObject2 = jSONObject.optJSONObject("showSourceRec");
        if (optJSONObject2 == null) {
            o2Var = null;
        } else {
            C69256o2 o2Var2 = new C69256o2();
            o2Var2.f199291a = C69232i1.m81578b(optJSONObject2);
            o2Var = o2Var2;
        }
        this.f199238Q = o2Var;
        mo95392m1();
    }

    public C69237j2() {
    }
}
