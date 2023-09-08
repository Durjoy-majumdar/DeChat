package com.tencent.p014mm.plugin.finder.feed.model;

import com.tencent.p014mm.autogen.events.FeedStickyEvent;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import o40.C61926c;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo182094d2 = {"Lcom/tencent/mm/autogen/events/FeedStickyEvent;", "event", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/autogen/events/FeedStickyEvent;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$handleStickyEvent$1 */
public final class FinderProfileFeedLoader$handleStickyEvent$1 extends C87413o implements C32226l<FeedStickyEvent, C13598b0> {
    public static final FinderProfileFeedLoader$handleStickyEvent$1 INSTANCE = new FinderProfileFeedLoader$handleStickyEvent$1();

    public FinderProfileFeedLoader$handleStickyEvent$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((FeedStickyEvent) obj);
        return C13598b0.f38549a;
    }

    public final void invoke(FeedStickyEvent feedStickyEvent) {
        C87412m.m108594g(feedStickyEvent, "event");
        C61926c.m72668M(C27401.INSTANCE);
    }
}
