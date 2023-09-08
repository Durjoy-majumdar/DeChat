package com.tencent.p014mm.plugin.finder.feed;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderCommentErrorEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$commentErrorListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderCommentErrorEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$commentErrorListener$1 */
public final class FinderCommentDrawerPresenter$commentErrorListener$1 extends IListener<FinderCommentErrorEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderCommentDrawerPresenter f13023d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderCommentDrawerPresenter$commentErrorListener$1(FinderCommentDrawerPresenter finderCommentDrawerPresenter, C40008f fVar) {
        super(fVar);
        this.f13023d = finderCommentDrawerPresenter;
    }

    public boolean callback(IEvent iEvent) {
        FinderCommentErrorEvent finderCommentErrorEvent = (FinderCommentErrorEvent) iEvent;
        C87412m.m108594g(finderCommentErrorEvent, "event");
        FinderCommentErrorEvent.C1043a aVar = finderCommentErrorEvent.f9188d;
        if (aVar.f9189a != -4013) {
            C61926c.m72668M(new C2646h(this.f13023d));
            return false;
        } else if (Util.isNullOrNil(aVar.f9190b)) {
            return false;
        } else {
            C61926c.m72668M(new C2644g(this.f13023d, finderCommentErrorEvent));
            return false;
        }
    }
}
