package com.tencent.p014mm.plugin.remittance.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.remittance.model.C70593j0;
import com.tencent.p014mm.plugin.wallet_core.utils.C72501h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C45628s0;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.remittance.model.g0 */
public class C70585g0 extends C75790l {

    /* renamed from: d */
    public String f204060d;

    /* renamed from: e */
    public C72501h f204061e;

    /* renamed from: f */
    public C72501h f204062f;

    /* renamed from: g */
    public String f204063g;

    /* renamed from: h */
    public String f204064h;

    /* renamed from: i */
    public C70586a f204065i;

    /* renamed from: com.tencent.mm.plugin.remittance.model.g0$a */
    public static class C70586a {

        /* renamed from: a */
        public String f204066a;

        /* renamed from: b */
        public String f204067b;

        /* renamed from: c */
        public C70593j0.C70602g f204068c;

        /* renamed from: d */
        public C70593j0.C70602g f204069d;

        /* renamed from: e */
        public C70593j0.C70602g f204070e;

        public String toString() {
            return "OpenMinimchGuide{title='" + this.f204066a + '\'' + ", content='" + this.f204067b + '\'' + ", content_link='" + this.f204068c + '\'' + ", left_btn='" + this.f204069d + '\'' + ", right_btn=" + this.f204070e + '}';
        }
    }

    public C70585g0(String str, String str2, int i, String str3, String str4, int i2, String str5, int i3) {
        this(str, str2, i, str3, str4, i2, "", str5, i3);
    }

    public int getFuncId() {
        return 1691;
    }

    public int getTenpayCgicmd() {
        return 0;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/transferoperation";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105918d("Micromsg.NetSceneTenpayRemittanceConfirm", "errCode " + i + " errMsg: " + str);
        if (i == 0) {
            JSONObject optJSONObject = jSONObject.optJSONObject("real_name_info");
            if (optJSONObject != null) {
                optJSONObject.optString("guide_flag", "0");
            }
            if (jSONObject.has("intercept_win")) {
                this.f204061e = C72501h.m84833a(jSONObject.optJSONObject("intercept_win"));
            }
            if (jSONObject.has("intercept_win_after")) {
                this.f204062f = C72501h.m84833a(jSONObject.optJSONObject("intercept_win_after"));
            }
            if (jSONObject.has("left_button_continue")) {
                this.f204063g = jSONObject.optString("left_button_continue");
            }
            if (jSONObject.has("half_page_info")) {
                this.f204064h = jSONObject.optString("half_page_info");
            }
            if (jSONObject.has("open_minimch_guide")) {
                JSONObject optJSONObject2 = jSONObject.optJSONObject("open_minimch_guide");
                C70586a aVar = new C70586a();
                if (optJSONObject2 == null) {
                    optJSONObject2 = new JSONObject();
                }
                aVar.f204066a = optJSONObject2.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                aVar.f204067b = optJSONObject2.optString("content");
                aVar.f204068c = C70593j0.m83117l1(optJSONObject2.optJSONObject("content_link"));
                aVar.f204069d = C70593j0.m83117l1(optJSONObject2.optJSONObject("left_btn"));
                aVar.f204070e = C70593j0.m83117l1(optJSONObject2.optJSONObject("right_btn"));
                this.f204065i = aVar;
            }
        }
    }

    public C70585g0(String str, String str2, int i, String str3, String str4, int i2, String str5, String str6, int i3) {
        this.f204063g = "";
        this.f204064h = "";
        this.f204060d = str3;
        HashMap hashMap = new HashMap();
        hashMap.put("trans_id", str2);
        hashMap.put(FirebaseAnalytics.C113379b.TRANSACTION_ID, str);
        hashMap.put("op", str3);
        hashMap.put("username", str4);
        hashMap.put("invalid_time", i2 + "");
        hashMap.put("total_fee", String.valueOf(i));
        hashMap.put("left_button_continue", str5);
        hashMap.put("group_username", str6);
        if (!Util.isNullOrNil(str6)) {
            if (C45628s0.m50735A(str6)) {
                hashMap.put("group_type", "2");
            } else {
                hashMap.put("group_type", "1");
            }
        }
        hashMap.put("recv_account_type", i3 + "");
        Log.m105925i("Micromsg.NetSceneTenpayRemittanceConfirm", "trans_id：%s, transaction_id:%s， total_fee：%s ，recv_channel_type：%s", str2, str, Integer.valueOf(i), Integer.valueOf(i3));
        setRequestData(hashMap);
    }
}
