package ip2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import qs2.C101271i0;

/* renamed from: ip2.c */
public final class C87788c {
    /* renamed from: a */
    public static final String m109226a(C101271i0 i0Var) {
        String str;
        SnsMethodCalculate.markStartTimeMs("validUxInfo", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.PageDataExKt");
        if (i0Var == null || (str = i0Var.mo140744k()) == null) {
            str = i0Var != null ? i0Var.mo140745l() : null;
            if (str == null) {
                str = "";
            }
        }
        SnsMethodCalculate.markEndTimeMs("validUxInfo", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.PageDataExKt");
        return str;
    }
}
