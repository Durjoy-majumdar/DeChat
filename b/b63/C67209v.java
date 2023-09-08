package b63;

import com.tencent.p014mm.autogen.mmdata.rpt.WCPayUnderAgeActionReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: b63.v */
public class C67209v {

    /* renamed from: a */
    public String f192980a;

    /* renamed from: b */
    public String f192981b;

    /* renamed from: c */
    public String f192982c;

    /* renamed from: a */
    public static void m79539a(int i) {
        WCPayUnderAgeActionReportStruct wCPayUnderAgeActionReportStruct = new WCPayUnderAgeActionReportStruct();
        wCPayUnderAgeActionReportStruct.f10094d = (long) i;
        wCPayUnderAgeActionReportStruct.mo86054n();
    }

    /* renamed from: b */
    public static C67209v m79540b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("under_age_dialog");
            if (jSONObject2 == null) {
                return null;
            }
            C67209v vVar = new C67209v();
            vVar.f192980a = jSONObject2.optString("wording");
            vVar.f192981b = jSONObject2.optString("btn_cancel");
            vVar.f192982c = jSONObject2.optString("btn_confirm");
            return vVar;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.UnderAgeDialog", "parseUnderAgeDialogFromJson Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            return null;
        }
    }
}
