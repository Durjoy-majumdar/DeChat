package com.tencent.p014mm.plugin.finder.search;

import cm1.C0740i2;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import hp1.C8683r;
import kotlin.Metadata;
import o40.C61926c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/search/FinderFeedSearchUI$initContentView$7", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedUpdateEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$initContentView$7 */
public final class FinderFeedSearchUI$initContentView$7 extends IListener<FeedUpdateEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedSearchUI f16572d;

    /* renamed from: e */
    public final /* synthetic */ WxRecyclerAdapter<C0740i2> f16573e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFeedSearchUI$initContentView$7(FinderFeedSearchUI finderFeedSearchUI, WxRecyclerAdapter<C0740i2> wxRecyclerAdapter, C40008f fVar) {
        super(fVar);
        this.f16572d = finderFeedSearchUI;
        this.f16573e = wxRecyclerAdapter;
    }

    public boolean callback(IEvent iEvent) {
        FeedUpdateEvent feedUpdateEvent = (FeedUpdateEvent) iEvent;
        C87412m.m108594g(feedUpdateEvent, "event");
        C61926c.m72666K(0, new C8683r(feedUpdateEvent, this.f16572d, this.f16573e));
        return true;
    }
}
