package c81;

import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import d81.C20448c;
import gy3.C87412m;
import kr0.C76629w0;
import te3.pa4;

/* renamed from: c81.r */
public final class C39924r implements C76629w0.C61144a {

    /* renamed from: a */
    public final /* synthetic */ int f107056a;

    /* renamed from: b */
    public final /* synthetic */ int f107057b;

    /* renamed from: c */
    public final /* synthetic */ String f107058c;

    /* renamed from: d */
    public final /* synthetic */ pa4 f107059d;

    public C39924r(int i, int i2, String str, pa4 pa4) {
        this.f107056a = i;
        this.f107057b = i2;
        this.f107058c = str;
        this.f107059d = pa4;
    }

    /* renamed from: a */
    public final void mo21208a(WxaAttributes wxaAttributes) {
        if (wxaAttributes != null) {
            Log.m105919d("SportScrollReportUIC", "report: report appBrand info.field_nickname:%s time:%s", wxaAttributes.field_nickname, Integer.valueOf(this.f107056a));
            C20448c cVar = C20448c.f57466a;
            int i = this.f107057b;
            String str = wxaAttributes.field_nickname;
            C87412m.m108593f(str, "appBrandInfo.field_nickname");
            cVar.mo31991a(i, 3, str, 2, 2, this.f107058c);
            return;
        }
        Log.m105919d("SportScrollReportUIC", "report: info is null appid:%s", this.f107059d.f139678d);
    }
}
