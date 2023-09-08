package u43;

import b63.C67176b;
import b63.C67196n0;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.wallet_core.model.C72192a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C45119n;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.tenpay.model.ITenpaySave;
import fr3.C75790l;
import java.math.RoundingMode;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: u43.d */
public class C78127d extends C75790l implements ITenpaySave, C45119n {

    /* renamed from: d */
    public String f228937d;

    /* renamed from: e */
    public boolean f228938e;

    /* renamed from: f */
    public String f228939f;

    /* renamed from: g */
    public double f228940g;

    /* renamed from: h */
    public double f228941h;

    /* renamed from: i */
    public C67176b f228942i;

    /* renamed from: j */
    public int f228943j;

    /* renamed from: n */
    public String f228944n;

    /* renamed from: o */
    public String f228945o;

    /* renamed from: p */
    public String f228946p;

    /* renamed from: q */
    public String f228947q;

    /* renamed from: r */
    public String f228948r;

    /* renamed from: s */
    public String f228949s;

    /* renamed from: t */
    public boolean f228950t;

    /* renamed from: u */
    public C78128a f228951u;

    /* renamed from: v */
    public String f228952v;

    /* renamed from: w */
    public ITenpaySave.RetryPayInfo f228953w;

    /* renamed from: u43.d$a */
    public static class C78128a {

        /* renamed from: a */
        public String f228954a;

        /* renamed from: b */
        public String f228955b;

        /* renamed from: c */
        public String f228956c;

        /* renamed from: d */
        public String f228957d;
    }

    public int getFuncId() {
        return 1503;
    }

    public ITenpaySave.RetryPayInfo getRetryPayInfo() {
        return this.f228953w;
    }

    public int getTenpayCgicmd() {
        return 75;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/genprefetch";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105918d("Micromsg.NetSceneTenpayBalanceFetch", "errCode " + i + " errMsg: " + str);
        if (i == 0) {
            this.f228937d = jSONObject.optString("req_key");
            this.f228938e = "1".equals(jSONObject.optString("should_alert"));
            this.f228939f = jSONObject.optString("alert_msg");
            this.f228940g = C75228t.m90250i(jSONObject.optString("charge_fee", "0"), "100", 2, RoundingMode.HALF_UP);
            this.f228941h = C75228t.m90250i(jSONObject.optString("total_fee", "0"), "100", 2, RoundingMode.HALF_UP);
            JSONObject optJSONObject = jSONObject.optJSONObject("first_fetch_info");
            if (optJSONObject != null) {
                Log.m105924i("Micromsg.NetSceneTenpayBalanceFetch", "getBalanceFetchInfo(), first_fetch_info is valid");
                C67196n0.m79476c(optJSONObject, false);
            } else {
                Log.m105920e("Micromsg.NetSceneTenpayBalanceFetch", "getBalanceFetchInfo(), first_fetch_info is null");
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("need_charge_fee_info");
            if (optJSONObject2 != null) {
                Log.m105924i("Micromsg.NetSceneTenpayBalanceFetch", "getBalanceFetchInfo(), need_charge_fee_info is valid");
                this.f228942i = C67196n0.m79476c(optJSONObject2, false);
            } else {
                Log.m105920e("Micromsg.NetSceneTenpayBalanceFetch", "getBalanceFetchInfo(), need_charge_fee_info is null");
            }
            this.f228943j = jSONObject.optInt("operation", 0);
            Log.m105924i("Micromsg.NetSceneTenpayBalanceFetch", "charge_fee:" + this.f228940g + " total_fee:" + this.f228941h + " operation:" + this.f228943j);
            if (jSONObject.has("real_name_info")) {
                JSONObject optJSONObject3 = jSONObject.optJSONObject("real_name_info");
                Log.m105925i("Micromsg.NetSceneTenpayBalanceFetch", "get real_name_info %s", optJSONObject3.toString());
                this.f228944n = optJSONObject3.optString("guide_flag");
                this.f228945o = optJSONObject3.optString("guide_wording");
                this.f228946p = optJSONObject3.optString("left_button_wording");
                this.f228947q = optJSONObject3.optString("right_button_wording");
                this.f228948r = optJSONObject3.optString("upload_credit_url");
            }
            boolean optBoolean = jSONObject.optBoolean("need_large_account_tip");
            this.f228950t = optBoolean;
            if (optBoolean && jSONObject.has("large_account_tip")) {
                Log.m105924i("Micromsg.NetSceneTenpayBalanceFetch", "get large_account_tip");
                C78128a aVar = new C78128a();
                JSONObject optJSONObject4 = jSONObject.optJSONObject("large_account_tip");
                aVar.f228954a = optJSONObject4.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                aVar.f228955b = optJSONObject4.optString("content");
                aVar.f228956c = optJSONObject4.optString("button_name");
                aVar.f228957d = optJSONObject4.optString("button_jump_url");
                Log.m105919d("Micromsg.NetSceneTenpayBalanceFetch", "parseLargeAccountTipDialog() title:%s content:%s button_name:%s button_jump_url:%s", Util.nullAsNil(aVar.f228954a), Util.nullAsNil(aVar.f228955b), Util.nullAsNil(aVar.f228956c), Util.nullAsNil(aVar.f228957d));
                this.f228951u = aVar;
            }
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(this.f228950t);
            objArr[1] = Boolean.valueOf(this.f228951u == null);
            Log.m105925i("Micromsg.NetSceneTenpayBalanceFetch", "needLargeAccountTip:%s accountTipDialog:%s", objArr);
            ITenpaySave.RetryPayInfo retryPayInfo = new ITenpaySave.RetryPayInfo();
            this.f228953w = retryPayInfo;
            retryPayInfo.mo104873a(jSONObject);
            this.f228949s = jSONObject.optString("charge_checkout_wording");
            JSONObject optJSONObject5 = jSONObject.optJSONObject("fetch_alert_dialog");
            if (optJSONObject5 != null) {
                optJSONObject5.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                optJSONObject5.optString("content");
                optJSONObject5.optString("content_not_enough");
                ArrayList arrayList = new ArrayList();
                JSONArray optJSONArray = optJSONObject5.optJSONArray("show_infos");
                if (optJSONArray != null) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        C72192a a = C72192a.m84570a(optJSONArray.optJSONObject(i2));
                        if (a != null) {
                            arrayList.add(a);
                        }
                    }
                }
            }
            JSONObject optJSONObject6 = jSONObject.optJSONObject("cashier_v2");
            if (optJSONObject6 != null) {
                this.f228952v = optJSONObject6.toString();
            }
        }
    }
}
