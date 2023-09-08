package zp0;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import z04.C112551y;

/* renamed from: zp0.a */
public final class C39425a {
    /* renamed from: a */
    public static final boolean m42111a(String str, String str2) {
        boolean z = true;
        if (!(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_app_brand_cgi_valid_check, 1) == 1)) {
            return true;
        }
        String nullAs = Util.nullAs(str, "");
        C87412m.m108591d(nullAs);
        String nullAs2 = Util.nullAs(str2, "");
        C87412m.m108591d(nullAs2);
        if ((str == null && str2 == null) || (C112551y.m153811k(nullAs) && (C112551y.m153811k(nullAs2) || !C112551y.m153808h(nullAs2, "@app", false, 2, (Object) null) || nullAs2.length() < 5))) {
            z = false;
        }
        if (!z) {
            Log.m105920e("MicroMsg.AppBrandCgiArgsCheckUtil", "isValidCgiArgs: invalid cgi args appId [" + str + "] userName [" + str2 + "] stack [" + android.util.Log.getStackTraceString(new Throwable()) + ']');
            C115669n.INSTANCE.mo175911u(369, 34);
        }
        return z;
    }
}
