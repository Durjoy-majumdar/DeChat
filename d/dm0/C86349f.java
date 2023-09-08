package dm0;

import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import org.json.JSONObject;
import p1044ub.C90630c;
import p284zb.C91635f;
import te3.C49895it3;
import te3.C64430ht3;
import te3.C64815ws2;
import zp0.C16377l;

/* renamed from: dm0.f */
public final class C86349f extends C82268c<C91635f> {
    private static final int CTRL_INDEX = 245;
    private static final String NAME = "reportPageData";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C91635f fVar2 = (C91635f) fVar;
        AppBrandInitConfigLU l1 = fVar2.getRuntime().mo113036W();
        AppBrandSysConfigLU o1 = fVar2.getRuntime().mo113051d0();
        AppBrandStatObject n1 = fVar2.getRuntime().mo121253n1();
        String appId = fVar2.getAppId();
        C64430ht3 ht32 = new C64430ht3();
        C64815ws2 ws22 = new C64815ws2();
        ht32.f183556d = ws22;
        if (o1 != null) {
            ws22.f186203d = o1.f261062e;
            ws22.f186204e = l1.f234839s;
            ws22.f186205f = o1.f261072r.f238585d;
            ht32.f183556d.f186206g = o1.f261072r.pkgVersion;
            ICommLibReader k = fVar2.mo114272k();
            if (k != null) {
                ht32.f183556d.f186211o = k.mo113371a();
            }
        }
        if (n1 != null) {
            C64815ws2 ws23 = ht32.f183556d;
            ws23.f186207h = n1.f245533f;
            ws23.f186208i = n1.f245531d;
        }
        ht32.f183556d.f186209j = 1;
        C90630c F0 = fVar2.mo114341l0();
        if (F0 != null) {
            ht32.f183556d.f186210n = F0.mo116162Q0();
        }
        ht32.f183557e = jSONObject.toString();
        ((C16377l) fVar2.mo109668l(C16377l.class)).mo14840YQ("/cgi-bin/mmbiz-bin/wxabusiness/reportwxaappexpose", appId, ht32, C49895it3.class).mo123061d(new C86348e(this, fVar2, i, appId)).mo123065b(new C86347d(this, fVar2, i));
    }
}
