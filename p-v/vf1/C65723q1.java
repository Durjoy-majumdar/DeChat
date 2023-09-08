package vf1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveBizListUI;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: vf1.q1 */
public final class C65723q1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveBizListUI f189080d;

    public C65723q1(FinderLiveBizListUI finderLiveBizListUI) {
        this.f189080d = finderLiveBizListUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizListUI$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizListUI$initViews$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizListUI$initViews$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        FinderLiveBizListUI finderLiveBizListUI = this.f189080d;
        int i = FinderLiveBizListUI.f158960v;
        finderLiveBizListUI.getClass();
        finderLiveBizListUI.mo77423N7(new C65726s1(finderLiveBizListUI));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizListUI$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
