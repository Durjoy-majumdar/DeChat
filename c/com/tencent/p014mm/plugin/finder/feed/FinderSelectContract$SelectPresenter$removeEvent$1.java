package com.tencent.p014mm.plugin.finder.feed;

import cm1.C0747l;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ActivityFeedRemoveEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C8478d0;
import gy3.C87412m;
import java.util.Iterator;
import kotlin.Metadata;
import o40.C61926c;
import te3.C52271zj0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/FinderSelectContract$SelectPresenter$removeEvent$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/ActivityFeedRemoveEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderSelectContract$SelectPresenter$removeEvent$1 */
public final class FinderSelectContract$SelectPresenter$removeEvent$1 extends IListener<ActivityFeedRemoveEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderSelectContract$SelectPresenter f13235d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderSelectContract$SelectPresenter$removeEvent$1(FinderSelectContract$SelectPresenter finderSelectContract$SelectPresenter, C40008f fVar) {
        super(fVar);
        this.f13235d = finderSelectContract$SelectPresenter;
    }

    public boolean callback(IEvent iEvent) {
        int i;
        ActivityFeedRemoveEvent activityFeedRemoveEvent = (ActivityFeedRemoveEvent) iEvent;
        C87412m.m108594g(activityFeedRemoveEvent, "event");
        FinderSelectContract$SelectPresenter finderSelectContract$SelectPresenter = this.f13235d;
        C8478d0 d0Var = new C8478d0();
        Iterator<C0747l> it = finderSelectContract$SelectPresenter.f13222h.iterator();
        while (it.hasNext()) {
            C0747l next = it.next();
            C52271zj0 zj02 = next.f1765d;
            if (zj02.f146005d != activityFeedRemoveEvent.f9022d.f9025c || (i = zj02.f146009h) <= 0) {
                d0Var.f27483d++;
            } else {
                zj02.f146009h = i - 1;
                finderSelectContract$SelectPresenter.f13224j.mo73081a();
                C61926c.m72668M(new C2857s(next, finderSelectContract$SelectPresenter, d0Var));
            }
        }
        return false;
    }
}
