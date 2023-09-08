package rs1;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderFavFeedUI;
import com.tencent.xweb.WCWebUpdater;
import di3.C7335d;
import di3.C86312j;
import dp1.C58413v0;
import dp1.C58417y0;
import er1.C58684b;
import er1.C58739j4;
import er1.C58784w3;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rs1.C13442s8;
import te3.C50119ke1;
import te3.C64586nn1;

/* renamed from: rs1.l9 */
public final class C13322l9 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13146c9 f37797d;

    public C13322l9(C13146c9 c9Var) {
        this.f37797d = c9Var;
    }

    public final void onClick(View view) {
        Class cls = C58417y0.class;
        Class cls2 = FinderCommonFeatureService.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77246R5("Personal_Center_FavList_Entrance");
        C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77227G5("Personal_Center_FavList_Entrance");
        C58784w3 w3Var = C58784w3.f168295a;
        C13146c9 c9Var = this.f37797d;
        C58739j4 j4Var = C58739j4.f168176a;
        if (!(R5 == null || G5 == null)) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            C58417y0 y0Var = (C58417y0) c;
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            C13442s8 f = aVar.mo12873f(c9Var.getActivity());
            C58417y0.Nx0(y0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, 6, 2, 0, 0, 0, (String) null, (String) null, 0, f != null ? f.mo12861q3() : null, 0, 0, 3520, (Object) null);
            C58413v0 v0Var = C58413v0.f167346a;
            C13442s8 f2 = aVar.mo12873f(c9Var.getActivity());
            C58413v0.m67781i(v0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, G5, R5, 2, f2 != null ? f2.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
        }
        ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77239M5("Personal_Center_FavList_Entrance");
        Intent intent = new Intent();
        C13442s8.C13443a.m12791e(C13442s8.f38060Q0, this.f37797d.getActivity(), intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
        AppCompatActivity activity = this.f37797d.getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity = (MMActivity) activity;
        ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
        intent.setClass(mMActivity, FinderFavFeedUI.class);
        mMActivity.startActivityForResult(intent, 1);
        C7335d c2 = C86312j.m106911c(cls);
        C87412m.m108593f(c2, "getService(FinderReportLogic::class.java)");
        C58417y0 y0Var2 = (C58417y0) c2;
        AppCompatActivity activity2 = this.f37797d.getActivity();
        C13146c9 c9Var2 = this.f37797d;
        long j = c9Var2.f37429y;
        boolean z = c9Var2.f37427w;
        C50119ke1 ke12 = c9Var2.f37412e;
        C58417y0.ey0(y0Var2, activity2, j, z, 2, 3, false, ke12 != null ? (long) ke12.f136698o : 0, (String) null, (String) null, 384, (Object) null);
        this.f37797d.mo12643G3(false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
