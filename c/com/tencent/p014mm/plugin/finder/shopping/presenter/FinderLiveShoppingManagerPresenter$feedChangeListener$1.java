package com.tencent.p014mm.plugin.finder.shopping.presenter;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderMiniWindowEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/shopping/presenter/FinderLiveShoppingManagerPresenter$feedChangeListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderMiniWindowEvent;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.shopping.presenter.FinderLiveShoppingManagerPresenter$feedChangeListener$1 */
public final class FinderLiveShoppingManagerPresenter$feedChangeListener$1 extends IListener<FinderMiniWindowEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveShoppingManagerPresenter f160926d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveShoppingManagerPresenter$feedChangeListener$1(FinderLiveShoppingManagerPresenter finderLiveShoppingManagerPresenter, C40008f fVar) {
        super(fVar);
        this.f160926d = finderLiveShoppingManagerPresenter;
    }

    public boolean callback(IEvent iEvent) {
        FinderMiniWindowEvent finderMiniWindowEvent = (FinderMiniWindowEvent) iEvent;
        C87412m.m108594g(finderMiniWindowEvent, "event");
        String str = this.f160926d.f160920b;
        Log.m105924i(str, "FinderMiniWindowEvent change isLive:" + finderMiniWindowEvent.f154804d.f154805a + ",isAnchor:" + finderMiniWindowEvent.f154804d.f154806b);
        FinderMiniWindowEvent.C55133a aVar = finderMiniWindowEvent.f154804d;
        if (aVar.f154805a != 1 || aVar.f154806b != 1) {
            return false;
        }
        this.f160926d.mo78779b(3);
        this.f160926d.f160919a.finish();
        return false;
    }
}
