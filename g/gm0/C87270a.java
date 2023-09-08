package gm0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: gm0.a */
public final class C87270a {

    /* renamed from: a */
    public String f252991a = "";

    /* renamed from: b */
    public long f252992b;

    /* renamed from: c */
    public long f252993c;

    /* renamed from: d */
    public final JSONObject f252994d = new JSONObject();

    /* renamed from: a */
    public final void mo121668a(C81925i2 i2Var) {
        C87412m.m108594g(i2Var, "receiver");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", this.f252991a);
        jSONObject.put("startTime", this.f252992b);
        jSONObject.put("endTime", this.f252993c);
        jSONObject.put(TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, this.f252994d);
        Log.m105924i("MicroMsg.AppBrand.EventOnNewPerformanceMetric", "dispatch " + jSONObject);
        i2Var.mo109652f("onNewPerformanceMetric", jSONObject.toString(), 0);
    }

    /* renamed from: b */
    public final void mo121669b(String str, Object obj) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(obj, "value");
        this.f252994d.put(str, obj);
    }
}
