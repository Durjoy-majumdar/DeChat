package rs1;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.finder.p056ui.FinderFollowListUI;
import com.tencent.wcdb.FileUtils;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import rs1.C13442s8;

/* renamed from: rs1.j9 */
public final class C13290j9 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13146c9 f37723d;

    public C13290j9(C13146c9 c9Var) {
        this.f37723d = c9Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        C13442s8.C13443a.m12791e(C13442s8.f38060Q0, this.f37723d.getActivity(), intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
        intent.setClass(this.f37723d.getActivity(), FinderFollowListUI.class);
        AppCompatActivity activity = this.f37723d.getActivity();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        AppCompatActivity appCompatActivity = activity;
        C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C7335d c = C86312j.m106911c(C58417y0.class);
        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
        AppCompatActivity activity2 = this.f37723d.getActivity();
        C13146c9 c9Var = this.f37723d;
        C58417y0.ey0((C58417y0) c, activity2, c9Var.f37429y, c9Var.f37427w, 2, 1, false, 0, (String) null, (String) null, FileUtils.S_IRWXU, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
