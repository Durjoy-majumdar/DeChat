package pf1;

import c30.C104289g;
import gy3.C87412m;
import o40.C61926c;

/* renamed from: pf1.j */
public class C11906j extends C11918p {

    /* renamed from: f */
    public final C104289g f34783f;

    /* renamed from: g */
    public String f34784g;

    /* renamed from: h */
    public String f34785h = "";

    /* renamed from: i */
    public long f34786i;

    /* renamed from: j */
    public String f34787j = "";

    /* renamed from: k */
    public long f34788k;

    public C11906j(C104289g gVar) {
        C87412m.m108594g(gVar, "data");
        this.f34783f = gVar;
        this.f34784g = gVar.optString("url");
        String optString = gVar.optString("uxinfo");
        C87412m.m108593f(optString, "data.optString(Constants…r.AdInfoKeys.KEY_UX_INFO)");
        this.f34785h = optString;
        this.f34786i = gVar.optLong("aid");
        String optString2 = gVar.optString("ad_posid");
        C87412m.m108593f(optString2, "data.optString(Constants…er.AdInfoKeys.KEY_POS_ID)");
        this.f34787j = optString2;
        this.f34788k = C61926c.m72671P(gVar.optString("canvas_id"));
    }
}
