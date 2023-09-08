package com.tencent.p014mm.plugin.finder.feed;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderFeedUiActionEvent;
import com.tencent.p014mm.plugin.finder.feed.FinderFeedSnsAdHandler;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/FinderFeedSnsAdHandler$adFeedUiActionListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderFeedUiActionEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler$adFeedUiActionListener$1 */
public final class FinderFeedSnsAdHandler$adFeedUiActionListener$1 extends IListener<FinderFeedUiActionEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedSnsAdHandler f13041d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFeedSnsAdHandler$adFeedUiActionListener$1(FinderFeedSnsAdHandler finderFeedSnsAdHandler, C40008f fVar) {
        super(fVar);
        this.f13041d = finderFeedSnsAdHandler;
    }

    public boolean callback(IEvent iEvent) {
        RecyclerView recyclerView;
        FinderFeedUiActionEvent finderFeedUiActionEvent = (FinderFeedUiActionEvent) iEvent;
        C87412m.m108594g(finderFeedUiActionEvent, "event");
        FinderFeedSnsAdHandler finderFeedSnsAdHandler = this.f13041d;
        FinderFeedUiActionEvent.C1047a aVar = finderFeedUiActionEvent.f9202d;
        int i = aVar.f9205c;
        if (i == 10000) {
            long j = aVar.f9203a;
            Runnable runnable = finderFeedSnsAdHandler.f13033m;
            if (!(runnable == null || (recyclerView = finderFeedSnsAdHandler.f30362g) == null)) {
                recyclerView.removeCallbacks(runnable);
            }
            FinderFeedSnsAdHandler.C2502a aVar2 = new FinderFeedSnsAdHandler.C2502a(j);
            finderFeedSnsAdHandler.f13033m = aVar2;
            RecyclerView recyclerView2 = finderFeedSnsAdHandler.f30362g;
            if (recyclerView2 != null) {
                recyclerView2.postDelayed(aVar2, 1000);
            }
            finderFeedSnsAdHandler.mo2507k();
            return true;
        } else if (i == 40001) {
            long j2 = aVar.f9203a;
            if (j2 != finderFeedSnsAdHandler.f30358c) {
                return true;
            }
            finderFeedSnsAdHandler.mo2508l(j2, finderFeedSnsAdHandler.f30360e);
            return true;
        } else if (i == 30000) {
            FinderFeedSnsAdHandler.m2408f(finderFeedSnsAdHandler, aVar.f9203a, 3, 2, aVar.f9206d, aVar.f9207e);
            return true;
        } else if (i != 30001) {
            return true;
        } else {
            FinderFeedSnsAdHandler.m2408f(finderFeedSnsAdHandler, aVar.f9203a, 2, 2, aVar.f9206d, aVar.f9207e);
            return true;
        }
    }
}
