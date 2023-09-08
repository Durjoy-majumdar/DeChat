package bo1;

import android.content.Context;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import bo1.C54505r;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import di3.C86301e;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import ei3.C86522b;
import gy3.C87412m;
import ht1.C60188n4;
import ht1.C60200t1;
import it1.C60625c;
import je1.C60798d2;
import ky2.C10432i;
import rs1.C13442s8;
import te3.C49712hj1;
import up1.C37521f;
import vp1.C65834e;

@C86522b
/* renamed from: bo1.p */
public final class C54504p extends C86301e implements C60188n4 {
    /* renamed from: Fv */
    public boolean mo75337Fv() {
        C37521f.f99374d.getClass();
        return C37521f.f99339Y6.mo60266n().intValue() == 1;
    }

    public boolean Gf0() {
        C37521f.f99374d.getClass();
        return C37521f.f99451l7.mo60266n().intValue() == 1;
    }

    /* renamed from: Ki */
    public void mo75339Ki(long j, String str, int i, C49712hj1 hj12, Context context, boolean z, String str2) {
        C49712hj1 hj13;
        C65834e eVar;
        int i2;
        long j2 = j;
        int i3 = i;
        Context context2 = context;
        if (mo75337Fv() && k90()) {
            C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C54505r.class);
            C87412m.m108593f(a, "UICProvider.of(FinderCom…ePreloadCore::class.java)");
            C54505r rVar = (C54505r) a;
            C65834e eVar2 = C65834e.f189316a;
            FinderItem e = eVar2.mo89871e(j2);
            if (hj12 != null || context2 == null) {
                hj13 = hj12;
            } else {
                C13442s8 f = C13442s8.f38060Q0.mo12873f(context2);
                hj13 = f != null ? f.mo12861q3() : null;
            }
            if (e == null || e.getTimestamps() <= 0 || C31543z5.m39453c() < e.getTimestamps() + (((long) e.getFeedObject().urlValidDuration) * 1000) || !rVar.mo75344e3() || rVar.mo75342c3(j2, i3, 6)) {
                eVar = eVar2;
                i2 = 6;
            } else {
                rVar.mo75347i3(j2, i3, 6);
                eVar2.mo89875i(j2);
                eVar = eVar2;
                i2 = 6;
                rVar.mo75345f3(j, str == null ? "" : str, i, hj13, z, str2, (C54505r.C54506a) null, 6);
            }
            if (e == null && rVar.mo75344e3() && !rVar.mo75342c3(j2, i3, i2)) {
                rVar.mo75347i3(j2, i3, i2);
                eVar.mo89875i(j2);
                rVar.mo75345f3(j, str == null ? "" : str, i, hj13, z, str2, (C54505r.C54506a) null, 6);
            }
        }
    }

    /* renamed from: cJ */
    public void mo75340cJ(long j, String str, int i, C49712hj1 hj12, String str2, Context context, C60188n4.C60189a aVar) {
        long j2 = j;
        int i2 = i;
        String str3 = str == null ? "" : str;
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C54505r.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…ePreloadCore::class.java)");
        C54505r rVar = (C54505r) a;
        if (!rVar.mo75342c3(j2, i2, 6) && context != null) {
            rVar.mo75347i3(j2, i2, 6);
            C60798d2 d2Var = new C60798d2(j, str2 == null ? "" : str2, str3, i, hj12);
            C60625c.m70894l(d2Var, context, (String) null, 0, 6, (Object) null);
            d2Var.mo9225i().mo123062e(new C54503o(rVar, i, j, aVar));
        }
    }

    public boolean k90() {
        return ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF() && ((((C75592q0.m90781k() & 34359738368L) > 0 ? 1 : ((C75592q0.m90781k() & 34359738368L) == 0 ? 0 : -1)) != 0) ^ true) && !((C10432i) C86312j.m106911c(C10432i.class)).mo10750e();
    }
}
