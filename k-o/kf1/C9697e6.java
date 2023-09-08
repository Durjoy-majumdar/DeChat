package kf1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.C2829n;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: kf1.e6 */
public final class C9697e6 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C2829n f30103d;

    /* renamed from: e */
    public final /* synthetic */ View f30104e;

    public C9697e6(C2829n nVar, View view) {
        this.f30103d = nVar;
        this.f30104e = view;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$showRetryTips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f30103d.mo2934i(true);
        View view2 = this.f30104e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$showRetryTips$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$showRetryTips$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f30103d.requestRefresh();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$showRetryTips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
