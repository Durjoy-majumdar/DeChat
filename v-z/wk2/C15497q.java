package wk2;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kj2.C117407d;
import org.json.JSONObject;
import t83.C13851h1;
import t83.C13855j;
import xk2.C15805b;

/* renamed from: wk2.q */
public final class C15497q extends C15805b {

    /* renamed from: f */
    public static final C15497q f42032f = new C15497q();

    /* renamed from: g */
    public static final String f42033g = "reportKV";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Log.m105919d("MicroMsg.JsApiReportKV", "ScanJsApi-Call:reportKV %s", h1Var.f38983a);
        try {
            JSONObject jSONObject = new JSONObject(h1Var.f38983a);
            int optInt = jSONObject.optInt("logid", 0);
            String optString = jSONObject.optString("msg", "");
            C87412m.m108593f(optString, "paramsObj.optString(\"msg\", \"\")");
            C117407d.INSTANCE.kvStat(optInt, optString);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.JsApiReportKV", e, "ScanJsApi-Call:reportKV exception", new Object[0]);
        }
        return true;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f42033g;
    }
}
