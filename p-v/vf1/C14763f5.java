package vf1;

import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import ao1.C0143d;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTimelineUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import dp1.C58408t0;
import dp1.C58413v0;
import dp1.C58417y0;
import er1.C58684b;
import er1.C58739j4;
import er1.C58784w3;
import gy3.C87412m;
import ht1.C60200t1;
import ot1.C11767a;
import qo3.C77407n;
import rs1.C13442s8;
import te3.C49712hj1;
import te3.C64586nn1;
import zc1.C66785b;

/* renamed from: vf1.f5 */
public final class C14763f5 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C64586nn1 f40737d;

    /* renamed from: e */
    public final /* synthetic */ C55718s0 f40738e;

    /* renamed from: f */
    public final /* synthetic */ FinderTimelineUI f40739f;

    public C14763f5(C64586nn1 nn12, C55718s0 s0Var, FinderTimelineUI finderTimelineUI) {
        this.f40737d = nn12;
        this.f40738e = s0Var;
        this.f40739f = finderTimelineUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C58784w3 w3Var = C58784w3.f168295a;
        C64586nn1 nn12 = this.f40737d;
        C55718s0 s0Var = this.f40738e;
        FinderTimelineUI finderTimelineUI = this.f40739f;
        C58739j4 j4Var = C58739j4.f168176a;
        if (!(nn12 == null || s0Var == null)) {
            C58413v0 v0Var = C58413v0.f167346a;
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            C13442s8 f = aVar.mo12873f(finderTimelineUI);
            C49712hj1 hj12 = null;
            C58413v0.m67781i(v0Var, "2", s0Var, nn12, 2, f != null ? f.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            C58417y0 y0Var = (C58417y0) c;
            C13442s8 f2 = aVar.mo12873f(finderTimelineUI);
            if (f2 != null) {
                hj12 = f2.mo12861q3();
            }
            C58417y0.Nx0(y0Var, "2", 2, 2, 1, 1, 0, (String) null, (String) null, 0, hj12, 0, 0, 3520, (Object) null);
        }
        ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77239M5("TLCamera");
        if (Util.isNullOrNil(C66785b.f191882e.mo90662O5())) {
            FinderTimelineUI finderTimelineUI2 = this.f40739f;
            int i = FinderTimelineUI.f14865x;
            finderTimelineUI2.getClass();
            Log.m105924i("Finder.FinderTimelineUI", "need prepare user");
            C2479n0.C2480a value = C2479n0.f12958d.getValue();
            this.f40739f.getClass();
            return true;
        }
        FinderTimelineUI finderTimelineUI3 = this.f40739f;
        int i2 = FinderTimelineUI.f14865x;
        finderTimelineUI3.getClass();
        if (!C11767a.f34453a.mo11659a("post")) {
            C7335d c2 = C86312j.m106911c(C58684b.class);
            C87412m.m108593f(c2, "getService(ActivityRouter::class.java)");
            C58684b bVar = (C58684b) c2;
            C58408t0.f167336a.mo83266l(1, false);
            C0143d dVar = C0143d.f574a;
            AppCompatActivity context = finderTimelineUI3.getContext();
            C87412m.m108593f(context, "context");
            C77407n a = dVar.mo134a(context);
            a.f225771i = new C14783j5(finderTimelineUI3);
            a.f225782p = new C14787k5(finderTimelineUI3);
            a.f225761d = C14793l5.f40776a;
            a.mo107573q();
        }
        return true;
    }
}
