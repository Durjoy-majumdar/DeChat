package hq1;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import dj1.C45388s;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import sx3.C64197v;
import te3.C64561mp1;

/* renamed from: hq1.e */
public final class C60090e {

    /* renamed from: a */
    public final MMActivity f171460a;

    /* renamed from: b */
    public final C64561mp1 f171461b;

    /* renamed from: c */
    public final String f171462c = "Finder.FinderLiveAdReporter";

    /* renamed from: d */
    public boolean f171463d;

    /* renamed from: e */
    public long f171464e;

    /* renamed from: f */
    public long f171465f;

    /* renamed from: g */
    public long f171466g;

    /* renamed from: h */
    public long f171467h;

    /* renamed from: i */
    public final List<String> f171468i = C64197v.m75537f("dismatch", "duplicate", "quality");

    /* renamed from: j */
    public final String f171469j = "good";

    /* renamed from: k */
    public final JSONArray f171470k = new JSONArray();

    public C60090e(MMActivity mMActivity, C64561mp1 mp12) {
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(mp12, "wxaAdInfo");
        this.f171460a = mMActivity;
        this.f171461b = mp12;
    }

    /* renamed from: a */
    public final void mo84955a() {
        this.f171463d = true;
        this.f171464e = C31543z5.m39453c();
    }

    /* renamed from: b */
    public final void mo84956b() {
        mo84955a();
        mo84957c(2020);
    }

    /* renamed from: c */
    public final void mo84957c(int i) {
        try {
            String str = this.f171461b.f184372i;
            if (str == null) {
                str = "";
            }
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("weapp_extra_data");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            jSONObject.put("report_type", 2);
            jSONObject.put("report_link", this.f171461b.f184371h);
            jSONObject.put("press_interval", 0);
            jSONObject.put("click_pos", i);
            jSONObject.put("pos_x", 0);
            jSONObject.put("pos_y", 0);
            optJSONObject.put("exp_time", this.f171465f);
            optJSONObject.put("clk_time", C31543z5.m39453c());
            jSONObject.put("weapp_extra_data", optJSONObject.toString());
            String str2 = this.f171462c;
            Log.m105924i(str2, "reportNormalAction " + i);
            long j = this.f171467h;
            long j2 = this.f171466g;
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "json.toString()");
            new C45388s(j, j2, 1, jSONObject2).mo9225i().mo11397F(this.f171460a);
        } catch (Throwable th) {
            String str3 = this.f171462c;
            Log.printErrStackTrace(str3, th, "reportNormalAction " + i, new Object[0]);
        }
    }
}
