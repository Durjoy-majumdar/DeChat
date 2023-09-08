package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.plugin.wallet_core.utils.C72501h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fr3.C75790l;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.remittance.model.i0 */
public class C70592i0 extends C75790l {

    /* renamed from: A */
    public int f204140A;

    /* renamed from: B */
    public int f204141B;

    /* renamed from: C */
    public String f204142C;

    /* renamed from: D */
    public C72501h f204143D;

    /* renamed from: E */
    public BusiRemittanceResp f204144E;

    /* renamed from: F */
    public boolean f204145F = false;

    /* renamed from: G */
    public String f204146G;

    /* renamed from: d */
    public String f204147d;

    /* renamed from: e */
    public String f204148e;

    /* renamed from: f */
    public double f204149f;

    /* renamed from: g */
    public String f204150g;

    /* renamed from: h */
    public int f204151h;

    /* renamed from: i */
    public String f204152i;

    /* renamed from: j */
    public String f204153j = "";

    /* renamed from: n */
    public String f204154n = "";

    /* renamed from: o */
    public String f204155o = "";

    /* renamed from: p */
    public String f204156p = "";

    /* renamed from: q */
    public int f204157q;

    /* renamed from: r */
    public String f204158r = "";

    /* renamed from: s */
    public String f204159s = "";

    /* renamed from: t */
    public int f204160t;

    /* renamed from: u */
    public String f204161u;

    /* renamed from: v */
    public String f204162v;

    /* renamed from: w */
    public int f204163w;

    /* renamed from: x */
    public String f204164x;

    /* renamed from: y */
    public String f204165y;

    /* renamed from: z */
    public int f204166z;

    public C70592i0(String str, int i, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("transfer_url", URLEncoder.encode(str));
        if (str2 != null && str2.length() > 0) {
            hashMap.put("qq_extend_info", URLEncoder.encode(str2));
        }
        setRequestData(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("channel", i + "");
        hashMap2.put("qrcode_sender_username", str3);
        setWXRequestData(hashMap2);
    }

    public int getFuncId() {
        return 1515;
    }

    public int getTenpayCgicmd() {
        return 0;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/transferscanqrcode";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        try {
            Log.m105918d("Micromsg.NetSceneTenpayRemittanceGetUsername", "errCode " + i + " errMsg: " + str);
            if (i == 0) {
                Log.m105919d("Micromsg.NetSceneTenpayRemittanceGetUsername", "json %s", jSONObject.toString());
                this.f204147d = jSONObject.optString("user_name", "");
                this.f204148e = jSONObject.optString("true_name");
                this.f204149f = jSONObject.optDouble("fee") / 100.0d;
                this.f204150g = jSONObject.optString("desc");
                this.f204151h = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                this.f204152i = URLEncoder.encode(jSONObject.optString("transfer_qrcode_id"));
                this.f204153j = jSONObject.optString("f2f_pay_desc");
                this.f204154n = jSONObject.optString("rcvr_desc");
                this.f204155o = jSONObject.optString("payer_desc");
                this.f204156p = jSONObject.optString("rcvr_ticket");
                this.f204157q = jSONObject.optInt("busi_type", 0);
                this.f204158r = jSONObject.optString("mch_name");
                this.f204159s = jSONObject.optString("mch_photo");
                this.f204162v = jSONObject.optString("mch_type", "");
                this.f204160t = jSONObject.optInt("mch_time", 0);
                this.f204161u = jSONObject.optString("receiver_openid");
                this.f204163w = jSONObject.optInt("get_pay_wifi");
                this.f204165y = jSONObject.optString("receiver_true_name");
                this.f204164x = jSONObject.optString("mch_info_string");
                this.f204166z = jSONObject.optInt("amount_remind_bit");
                this.f204140A = jSONObject.optInt("action_type");
                this.f204141B = jSONObject.optInt("retcode");
                this.f204142C = jSONObject.optString("jump_url");
                if (jSONObject.has("intercept_win")) {
                    this.f204143D = C72501h.m84833a(jSONObject.optJSONObject("intercept_win"));
                }
                this.f204145F = jSONObject.optBoolean("payer_desc_required", false);
                this.f204146G = jSONObject.optString("payer_desc_placeholder");
                this.f204144E = new BusiRemittanceResp(jSONObject);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("Micromsg.NetSceneTenpayRemittanceGetUsername", e, "", new Object[0]);
        }
    }
}
