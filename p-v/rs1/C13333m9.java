package rs1;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.xweb.WCWebUpdater;
import di3.C7335d;
import di3.C86312j;
import dp1.C58363h;
import dp1.C58413v0;
import dp1.C58417y0;
import er1.C58684b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import te3.C49712hj1;
import te3.C64586nn1;

/* renamed from: rs1.m9 */
public final class C13333m9 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13146c9 f37824d;

    public C13333m9(C13146c9 c9Var) {
        this.f37824d = c9Var;
    }

    public final void onClick(View view) {
        Class cls = FinderCommonFeatureService.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7335d c = C86312j.m106911c(C58684b.class);
        C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
        C49712hj1 hj12 = null;
        C58684b.cy0((C58684b) c, this.f37824d.getActivity(), (Intent) null, 2, (Object) null);
        C13146c9 c9Var = this.f37824d;
        String str = C13146c9.f37394Q;
        long i3 = c9Var.mo12652i3();
        C7335d c2 = C86312j.m106911c(C58417y0.class);
        C87412m.m108593f(c2, "getService(FinderReportLogic::class.java)");
        C58417y0 y0Var = (C58417y0) c2;
        AppCompatActivity activity = this.f37824d.getActivity();
        C13146c9 c9Var2 = this.f37824d;
        C58417y0.ey0(y0Var, activity, c9Var2.f37429y, c9Var2.f37427w, 2, 7, i3 > 0, i3, (String) null, (String) null, 384, (Object) null);
        C58363h.f167138b.mo70925c(1, 0, "");
        C58363h.f167142f.f167153g = this.f37824d.mo12652i3();
        C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("finder_wx_private_msg_entrance");
        C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("finder_wx_private_msg_entrance");
        if (!(R5 == null || G5 == null)) {
            C58413v0 v0Var = C58413v0.f167346a;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f37824d.getActivity());
            if (f != null) {
                hj12 = f.mo12861q3();
            }
            C58413v0.m67781i(v0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, G5, R5, 3, hj12, 0, (String) null, 0, 0, 480, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
