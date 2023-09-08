package rs1;

import android.view.View;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import dp1.C58413v0;
import dp1.C58417y0;
import gy3.C87412m;
import te3.C64586nn1;
import zp3.C23555k;

/* renamed from: rs1.z8 */
public final class C13571z8 extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ C13146c9 f38497a;

    public C13571z8(C13146c9 c9Var) {
        this.f38497a = c9Var;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        Class cls = FinderCommonFeatureService.class;
        C87412m.m108594g(view, "view");
        if (z) {
            ((C58417y0) C86312j.m106911c(C58417y0.class)).vy0(5, 1, "");
            C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("CreateFinderEntrance");
            C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("CreateFinderEntrance");
            C13146c9 c9Var = this.f38497a;
            if (G5 != null && R5 != null) {
                C58413v0 v0Var = C58413v0.f167346a;
                C13442s8 f = C13442s8.f38060Q0.mo12873f(c9Var.getActivity());
                C58413v0.m67781i(v0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, G5, R5, 1, f != null ? f.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
                return;
            }
            return;
        }
    }
}
