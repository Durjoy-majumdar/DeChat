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

/* renamed from: com.tencent.mm.plugin.luckymoney.model.k2 */
public class C69240k2 extends C69237j2 {
    public C69240k2(int i, int i2, String str, String str2, int i3, String str3) {
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
        hashMap.put("union_source", "0");
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
        Log.m105924i("MicroMsg.NetSceneReceiveLuckyMoneyUnion", "NetSceneReceiveLuckyMoneyUnion request");
        setRequestData(hashMap);
    }

    public int getType() {
        return 4536;
    }

    /* renamed from: j1 */
    public String mo95311j1() {
        return "/cgi-bin/mmpay-bin/unionhb/receiveunionhb";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        C69256o2 o2Var;
        Log.m105925i("MicroMsg.NetSceneReceiveLuckyMoneyUnion", "errCode: %s, errMsg: %s ，json：%s", Integer.valueOf(i), str, jSONObject.toString());
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
        C69232i1.m81584h(jSONObject.optJSONObject("operationTail"));
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
        Log.m105924i("MicroMsg.NetSceneReceiveLuckyMoneyUnion", "scenePicSwitch:" + this.f199231I);
        this.f199232J = jSONObject.optInt("preStrainFlag", 1);
        Log.m105924i("MicroMsg.NetSceneReceiveLuckyMoneyUnion", "preStrainFlag:" + this.f199232J);
        int optInt = jSONObject.optInt("showYearExpression");
        this.f199233K = optInt;
        Log.m105925i("MicroMsg.NetSceneReceiveLuckyMoneyUnion", "showYearExpression:%s", Integer.valueOf(optInt));
        int optInt2 = jSONObject.optInt("showRecNormalExpression");
        this.f199234L = optInt2;
        Log.m105925i("MicroMsg.NetSceneReceiveLuckyMoneyUnion", "showRecNormalExpression:%s", Integer.valueOf(optInt2));
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_NEWYEAR_HONGBAO_IMAGE_PRESTRAIN_FLAG_INT_SYNC, Integer.valueOf(this.f199232J));
        this.f199237P = jSONObject.optString("timingIdentifier");
        jSONObject.optString("effectResource");
        this.f199235M = jSONObject.optString("expression_md5");
        int optInt3 = jSONObject.optInt("expression_type");
        this.f199236N = optInt3;
        Log.m105925i("MicroMsg.NetSceneReceiveLuckyMoneyUnion", "expressionmd5:%s expressiontype:%s", this.f199235M, Integer.valueOf(optInt3));
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
}
