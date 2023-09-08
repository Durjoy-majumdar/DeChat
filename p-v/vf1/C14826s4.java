package vf1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.feed.FinderRingtoneTimelineContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderRingtoneTimelineUI;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kf1.C10069z8;
import tf1.C13913l;

/* renamed from: vf1.s4 */
public final class C14826s4 implements C13913l {

    /* renamed from: a */
    public final /* synthetic */ FinderRingtoneTimelineUI f40822a;

    /* renamed from: b */
    public final /* synthetic */ FinderRingtoneTimelineLoader f40823b;

    public C14826s4(FinderRingtoneTimelineUI finderRingtoneTimelineUI, FinderRingtoneTimelineLoader finderRingtoneTimelineLoader) {
        this.f40822a = finderRingtoneTimelineUI;
        this.f40823b = finderRingtoneTimelineLoader;
    }

    public void call(int i) {
        FinderRingtoneTimelineContract$Presenter finderRingtoneTimelineContract$Presenter = this.f40822a.f14781s;
        if (finderRingtoneTimelineContract$Presenter != null) {
            finderRingtoneTimelineContract$Presenter.f13212v = this.f40823b.getInitPos();
            C10069z8 z8Var = this.f40822a.f14782t;
            if (z8Var != null) {
                RecyclerView.LayoutManager layoutManager = z8Var.getRecyclerView().getLayoutManager();
                if (layoutManager != null) {
                    FinderLinearLayoutManager finderLinearLayoutManager = (FinderLinearLayoutManager) layoutManager;
                    int initPos = this.f40823b.getInitPos();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    aVar.mo10233c(Integer.valueOf(initPos));
                    C117292a.m165358d(finderLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI$initData$3$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    finderLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                    C117292a.m165359e(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI$initData$3$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    return;
                }
                return;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
        C87412m.m108603p("presenter");
        throw null;
    }
}
