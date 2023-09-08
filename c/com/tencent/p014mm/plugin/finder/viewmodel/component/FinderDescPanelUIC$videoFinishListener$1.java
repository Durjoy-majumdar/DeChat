package com.tencent.p014mm.plugin.finder.viewmodel.component;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedMegaVideoAnimPlayEvent;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import jq3.C60905o;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/viewmodel/component/FinderDescPanelUIC$videoFinishListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedMegaVideoAnimPlayEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC$videoFinishListener$1 */
public final class FinderDescPanelUIC$videoFinishListener$1 extends IListener<FeedMegaVideoAnimPlayEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderDescPanelUIC f18646d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderDescPanelUIC$videoFinishListener$1(FinderDescPanelUIC finderDescPanelUIC, C40008f fVar) {
        super(fVar);
        this.f18646d = finderDescPanelUIC;
    }

    public boolean callback(IEvent iEvent) {
        WeakReference<C60905o> weakReference;
        C60905o oVar;
        FeedMegaVideoAnimPlayEvent feedMegaVideoAnimPlayEvent = (FeedMegaVideoAnimPlayEvent) iEvent;
        C87412m.m108594g(feedMegaVideoAnimPlayEvent, "event");
        FinderDescPanelUIC finderDescPanelUIC = this.f18646d;
        if (finderDescPanelUIC.f18624h && feedMegaVideoAnimPlayEvent.f9160d.f9164d && (weakReference = finderDescPanelUIC.f18629p) != null && (oVar = weakReference.get()) != null) {
            Object obj = oVar.f173503E;
            BaseFinderFeed baseFinderFeed = obj instanceof BaseFinderFeed ? (BaseFinderFeed) obj : null;
            if (baseFinderFeed != null && feedMegaVideoAnimPlayEvent.f9160d.f9161a == baseFinderFeed.mo3513o().getExpectId()) {
                Log.m105924i("Finder.DescPanelUIC", "video finish, startTimer");
                FinderDescPanelUIC finderDescPanelUIC2 = this.f18646d;
                finderDescPanelUIC2.f18622f = true;
                this.f18646d.f18628o.sendMessage(finderDescPanelUIC2.f18628o.obtainMessage(1, oVar));
                this.f18646d.f18624h = false;
            }
        }
        return true;
    }
}
