package vf1;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTimelineUI;
import di3.C7335d;
import di3.C86312j;
import dp1.C58413v0;
import dp1.C58417y0;
import er1.C58684b;
import er1.C58739j4;
import er1.C58784w3;
import gy3.C87412m;
import ht1.C60200t1;
import rs1.C13442s8;
import te3.C64586nn1;

/* renamed from: vf1.g5 */
public final class C14768g5 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C64586nn1 f40745d;

    /* renamed from: e */
    public final /* synthetic */ C55718s0 f40746e;

    /* renamed from: f */
    public final /* synthetic */ FinderTimelineUI f40747f;

    public C14768g5(C64586nn1 nn12, C55718s0 s0Var, FinderTimelineUI finderTimelineUI) {
        this.f40745d = nn12;
        this.f40746e = s0Var;
        this.f40747f = finderTimelineUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C58784w3 w3Var = C58784w3.f168295a;
        C64586nn1 nn12 = this.f40745d;
        C55718s0 s0Var = this.f40746e;
        FinderTimelineUI finderTimelineUI = this.f40747f;
        C58739j4 j4Var = C58739j4.f168176a;
        if (!(nn12 == null || s0Var == null)) {
            C58413v0 v0Var = C58413v0.f167346a;
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            C13442s8 f = aVar.mo12873f(finderTimelineUI);
            C58413v0.m67781i(v0Var, "2", s0Var, nn12, 2, f != null ? f.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            C58417y0 y0Var = (C58417y0) c;
            String str = s0Var.field_tipsId;
            C13442s8 f2 = aVar.mo12873f(finderTimelineUI);
            C58417y0.Nx0(y0Var, "2", 1, 2, 1, 2, 0, str, (String) null, 0, f2 != null ? f2.mo12861q3() : null, 0, 0, 3456, (Object) null);
        }
        ((C58684b) C86312j.m106911c(C58684b.class)).Yx0(this.f40747f, (Intent) null);
        ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77239M5("TLPersonalCenter");
        return true;
    }
}
