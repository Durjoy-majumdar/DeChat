package rs1;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.finder.p056ui.FinderManagementUI;
import di3.C7335d;
import di3.C86312j;
import er1.C58684b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: rs1.g9 */
public final class C13246g9 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13146c9 f37607d;

    public C13246g9(C13146c9 c9Var) {
        this.f37607d = c9Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7335d c = C86312j.m106911c(C58684b.class);
        C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
        C58684b bVar = (C58684b) c;
        AppCompatActivity activity = this.f37607d.getActivity();
        C87412m.m108594g(activity, "context");
        Intent intent = new Intent();
        intent.putExtra("KEY_SOURCE", 0);
        intent.setClass(activity, FinderManagementUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderManagementUi", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/Integer;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderManagementUi", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/Integer;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
