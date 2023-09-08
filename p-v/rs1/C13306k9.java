package rs1;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLikeFeedGridUI;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rs1.C13442s8;
import te3.C50119ke1;
import zc1.C66785b;

/* renamed from: rs1.k9 */
public final class C13306k9 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13146c9 f37760d;

    public C13306k9(C13146c9 c9Var) {
        this.f37760d = c9Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        C13442s8.C13443a.m12791e(C13442s8.f38060Q0, this.f37760d.getActivity(), intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
        intent.setClass(this.f37760d.getActivity(), FinderLikeFeedGridUI.class);
        intent.putExtra("finder_username", C66785b.f191882e.mo90662O5());
        this.f37760d.getActivity().startActivityForResult(intent, 2);
        C7335d c = C86312j.m106911c(C58417y0.class);
        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
        C58417y0 y0Var = (C58417y0) c;
        AppCompatActivity activity = this.f37760d.getActivity();
        C13146c9 c9Var = this.f37760d;
        long j = c9Var.f37429y;
        boolean z = c9Var.f37427w;
        C50119ke1 ke12 = c9Var.f37412e;
        C58417y0.ey0(y0Var, activity, j, z, 2, 2, false, ke12 != null ? (long) ke12.f136697n : 0, (String) null, (String) null, 384, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
