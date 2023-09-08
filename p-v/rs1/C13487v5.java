package rs1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: rs1.v5 */
public final class C13487v5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13298k5 f38216d;

    /* renamed from: e */
    public final /* synthetic */ View f38217e;

    public C13487v5(C13298k5 k5Var, View view) {
        this.f38216d = k5Var;
        this.f38217e = view;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC$showRetryTips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f38216d.mo12753l3(true);
        View view2 = this.f38217e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC$showRetryTips$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC$showRetryTips$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f38216d.mo12751j3();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC$showRetryTips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
