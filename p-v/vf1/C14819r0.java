package vf1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.FinderHalfScreenContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderHorizontalVideoHalfFeedUI;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: vf1.r0 */
public final class C14819r0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderHorizontalVideoHalfFeedUI f40813d;

    /* renamed from: e */
    public final /* synthetic */ View f40814e;

    public C14819r0(FinderHorizontalVideoHalfFeedUI finderHorizontalVideoHalfFeedUI, View view) {
        this.f40813d = finderHorizontalVideoHalfFeedUI;
        this.f40814e = view;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$showRetryTips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderHorizontalVideoHalfFeedUI finderHorizontalVideoHalfFeedUI = this.f40813d;
        int i = FinderHorizontalVideoHalfFeedUI.f14411w;
        finderHorizontalVideoHalfFeedUI.mo2991W7(true);
        View view2 = this.f40814e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$showRetryTips$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$showRetryTips$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        FinderHalfScreenContract$Presenter finderHalfScreenContract$Presenter = this.f40813d.f14412s;
        if (finderHalfScreenContract$Presenter != null) {
            finderHalfScreenContract$Presenter.requestRefresh();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$showRetryTips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("presenter");
        throw null;
    }
}
