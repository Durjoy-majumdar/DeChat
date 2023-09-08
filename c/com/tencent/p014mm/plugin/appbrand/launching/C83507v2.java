package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import org.json.JSONException;
import org.json.JSONObject;
import sx3.C110823p;
import wi0.C38164x;
import wi0.C91000y;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.v2 */
public final class C83507v2 {
    /* renamed from: a */
    public static final void m102476a(C83515w2 w2Var) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        Class cls = C91000y.class;
        C87412m.m108594g(w2Var, "<this>");
        boolean z = false;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_appbrand_opconfig_exptinfo_update_by_multi_source, 0) == 1) {
            String str = w2Var.field_opConfig;
            if (str == null || str.length() == 0) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(w2Var.field_opConfig);
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.AppBrand.LaunchWxaAppCacheStorageKt", "tryUpdateOrApplyLatestExptInfo for appId:" + w2Var.field_appId + ", parse original opConfig failed " + e);
                    jSONObject = new JSONObject();
                }
            }
            try {
                String optString = jSONObject.optString("expt_info");
                if (optString == null || optString.length() == 0) {
                    z = true;
                }
                if (!z && ((C91000y) C81161g2.Bx0(cls)).mo125063Yt(w2Var.field_appId, optString, C91000y.C91001a.Launch)) {
                    return;
                }
            } catch (Exception e2) {
                Log.m105920e("MicroMsg.AppBrand.LaunchWxaAppCacheStorageKt", "tryUpdateOrApplyLatestExptInfo(" + w2Var.field_appId + ") try updateExptInfo failed " + e2);
            }
            C38164x qq = ((C91000y) C81161g2.Bx0(cls)).mo125064qq(w2Var.field_appId);
            if (qq != null) {
                String str2 = "tryUpdateOrApplyLatestExptInfo(" + w2Var.field_appId + ')';
                IAutoDBItem.MAutoDBInfo mAutoDBInfo = C38164x.f100831t;
                JSONObject optJSONObject = jSONObject.optJSONObject("expt_info");
                long j = 0;
                if (optJSONObject == null) {
                    Log.m105920e("Luggage.WeDataExptInfo", "optIssueTimestamp(tryApplyOverrideToOpConfig), it is null");
                } else if (optJSONObject instanceof C38164x) {
                    j = ((C38164x) optJSONObject).field_issueTimestampMs;
                } else {
                    try {
                        Object obj = optJSONObject.get("expt_ext_info_json");
                        if (obj instanceof String) {
                            jSONObject3 = new JSONObject((String) obj);
                        } else if (obj instanceof JSONObject) {
                            jSONObject3 = (JSONObject) obj;
                        } else {
                            throw new JSONException("expt_ext_info_json type error");
                        }
                        j = jSONObject3.getLong("issue_time");
                    } catch (Exception e3) {
                        Log.m105920e("Luggage.WeDataExptInfo", "optIssueTimestamp(" + "tryApplyOverrideToOpConfig" + "), json parse failed " + e3);
                    }
                }
                long j2 = qq.field_issueTimestampMs;
                if (j2 == -1 || j2 > j) {
                    try {
                        jSONObject.put("expt_info", new JSONObject(qq.field_exptInfo));
                        StringBuilder sb = new StringBuilder();
                        sb.append("applyOverrideToOpConfig(");
                        sb.append(str2);
                        sb.append("), this.timestamp(");
                        sb.append(qq.field_issueTimestampMs);
                        sb.append(") vs other.timestamp:");
                        sb.append(j);
                        sb.append(" check ok, do replace, this.source=");
                        C91000y.C91001a aVar = (C91000y.C91001a) C110823p.m150982H(C91000y.C91001a.values(), qq.field_source);
                        if (aVar == null) {
                            aVar = C91000y.C91001a.Unknown;
                        }
                        sb.append(aVar);
                        Log.m105924i("Luggage.WeDataExptInfo", sb.toString());
                        jSONObject2 = JSONObject.class.cast(jSONObject);
                    } catch (Exception e4) {
                        Log.m105920e("Luggage.WeDataExptInfo", "applyOverrideToOpConfig(" + str2 + ", replace expt_info failed " + e4);
                    }
                    JSONObject jSONObject4 = jSONObject2;
                }
                jSONObject2 = jSONObject;
                JSONObject jSONObject42 = jSONObject2;
            }
            if (jSONObject.length() > 0) {
                w2Var.field_opConfig = jSONObject.toString();
            }
        }
    }
}
