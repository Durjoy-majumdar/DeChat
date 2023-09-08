package do1;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2486q;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2490t;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ft1.C59319a;
import gy3.C87412m;
import je1.C9342n1;
import o40.C11348f;
import o40.C61937h;
import te3.C48736am1;
import te3.C49335eu3;
import te3.C64858yi1;

/* renamed from: do1.i */
public final class C7411i implements C9342n1.C9347e {

    /* renamed from: a */
    public final /* synthetic */ boolean f25566a;

    /* renamed from: b */
    public final /* synthetic */ C58341h f25567b;

    public C7411i(boolean z, C58341h hVar) {
        this.f25566a = z;
        this.f25567b = hVar;
    }

    /* renamed from: a */
    public void mo3671a() {
    }

    /* renamed from: b */
    public boolean mo3672b(int i, int i2, C49335eu3 eu32) {
        C87412m.m108594g(eu32, "resp");
        return false;
    }

    /* renamed from: c */
    public boolean mo3673c() {
        return false;
    }

    /* renamed from: d */
    public void mo3674d(C9342n1.C9345c cVar) {
        C9342n1.C9345c cVar2 = cVar;
        Class cls = FinderCommonFeatureService.class;
        C87412m.m108594g(cVar2, "request");
        C2490t.f13006a.getClass();
        C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("FinderEntrance");
        boolean z = true;
        if (G5 != null) {
            C64858yi1 yi12 = G5.f158585F;
            long j = yi12.f186549g;
            int i = yi12.f186555p;
            if (i == cVar2.f145379q && j != 0) {
                long j2 = cVar2.f145380r;
                if (j2 != 0) {
                    C11348f.C11349a.m11178b(C59319a.f169618b, "finderEnterPreloadWrongRedDotRequest", j == j2, (C11348f.C11352b) null, false, false, new C2486q(j, cVar, i, G5), 28, (Object) null);
                }
            }
        }
        if (this.f25566a) {
            cVar2.f145378p = 0;
        } else {
            cVar2.f145378p = 1;
        }
        C48736am1 am12 = new C48736am1();
        FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0();
        am12.f130632g = Nx0.mo77227G5("TLRecommendTab") != null;
        am12.f130631f = Nx0.mo77227G5("TLFollow") != null;
        am12.f130630e = Nx0.mo77227G5("finder_tl_hot_tab") != null;
        if (Nx0.mo77227G5("FinderEntrance") == null) {
            z = false;
        }
        am12.f130629d = z;
        am12.f130635j = 0;
        cVar2.f145364J = am12;
        String str = this.f25567b.f167027c;
        StringBuilder sb = new StringBuilder();
        sb.append("fetchEnterLoad: [onBuildRequest] scene_status = ");
        C48736am1 am13 = cVar2.f145364J;
        sb.append(am13 != null ? C61937h.m72703b(am13) : null);
        Log.m105924i(str, sb.toString());
    }
}
