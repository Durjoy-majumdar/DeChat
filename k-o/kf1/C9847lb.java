package kf1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import j20.C117292a;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;

/* renamed from: kf1.lb */
public final class C9847lb implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C60905o f30422d;

    /* renamed from: e */
    public final /* synthetic */ RefreshLoadMoreLayout f30423e;

    /* renamed from: f */
    public final /* synthetic */ FinderTimelinePresenter f30424f;

    public C9847lb(C60905o oVar, RefreshLoadMoreLayout refreshLoadMoreLayout, FinderTimelinePresenter finderTimelinePresenter) {
        this.f30422d = oVar;
        this.f30423e = refreshLoadMoreLayout;
        this.f30424f = finderTimelinePresenter;
    }

    public final void run() {
        View D = this.f30422d.mo85812D(C0966R.C0970id.kaj);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = D;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$openPersonalizedSetting$2$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$openPersonalizedSetting$2$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View loadMoreFooter = this.f30423e.getLoadMoreFooter();
        if (loadMoreFooter != null) {
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            C117292a.m165358d(loadMoreFooter, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$openPersonalizedSetting$2$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            loadMoreFooter.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(loadMoreFooter, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$openPersonalizedSetting$2$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f30423e.mo82498t();
        this.f30423e.mo82438D(false);
        this.f30424f.f13261V = true;
    }
}
