package rs1;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.wcdb.FileUtils;
import com.tencent.xweb.WCWebUpdater;
import di3.C7335d;
import di3.C86312j;
import dp1.C58413v0;
import dp1.C58417y0;
import er1.C58684b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import te3.C49712hj1;
import te3.C64586nn1;

/* renamed from: rs1.n9 */
public final class C13342n9 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13146c9 f37839d;

    public C13342n9(C13146c9 c9Var) {
        this.f37839d = c9Var;
    }

    public final void onClick(View view) {
        Class cls = FinderCommonFeatureService.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C49712hj1 hj12 = null;
        ((C58684b) C86312j.m106911c(C58684b.class)).dy0(this.f37839d.getActivity(), (Intent) null);
        C7335d c = C86312j.m106911c(C58417y0.class);
        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
        AppCompatActivity activity = this.f37839d.getActivity();
        C13146c9 c9Var = this.f37839d;
        C58417y0.ey0((C58417y0) c, activity, c9Var.f37429y, c9Var.f37427w, 2, 4, false, 0, (String) null, (String) null, FileUtils.S_IRWXU, (Object) null);
        C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("WxMessageEntry");
        C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("WxMessageEntry");
        if (!(R5 == null || G5 == null)) {
            C58413v0 v0Var = C58413v0.f167346a;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f37839d.getActivity());
            if (f != null) {
                hj12 = f.mo12861q3();
            }
            C58413v0.m67781i(v0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, G5, R5, 2, hj12, 0, (String) null, 0, 0, 480, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
