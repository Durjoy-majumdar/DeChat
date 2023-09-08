package q51;

import gy3.C87412m;
import ob0.C47350c;
import ob0.C89132b;
import p821rk.C48038k;
import p821rk.C48039l;

/* renamed from: q51.a */
public final class C47754a extends C89132b<C48039l> {
    public C47754a(String str, String str2, String str3, String str4) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "stockId");
        C87412m.m108594g(str3, "uxInfo");
        C87412m.m108594g(str4, "compId");
        C48038k kVar = new C48038k();
        kVar.f128850d = str;
        kVar.f128851e = str2;
        kVar.f128852f = str3;
        kVar.f128853g = str4;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = kVar;
        bVar.f127067b = new C48039l();
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        bVar.f127068c = "/cgi-bin/mmoc-bin/adplayinfo/send_ad_coupon";
        bVar.f127069d = 4743;
        mo123453j(bVar.mo72403a());
    }
}
