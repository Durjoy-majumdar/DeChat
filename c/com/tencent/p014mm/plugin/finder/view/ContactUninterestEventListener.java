package com.tencent.p014mm.plugin.finder.view;

import cm1.C0740i2;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.autogen.events.FinderUninterestEvent;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import vq1.C65866w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/ContactUninterestEventListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderUninterestEvent;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lcm1/i2;", "feedLoader", "<init>", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.ContactUninterestEventListener */
public final class ContactUninterestEventListener extends IListener<FinderUninterestEvent> {

    /* renamed from: d */
    public final BaseFeedLoader<C0740i2> f17608d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactUninterestEventListener(BaseFeedLoader<C0740i2> baseFeedLoader) {
        super(C40008f.f107254d);
        C87412m.m108594g(baseFeedLoader, "feedLoader");
        this.f17608d = baseFeedLoader;
    }

    public boolean callback(IEvent iEvent) {
        FinderUninterestEvent finderUninterestEvent = (FinderUninterestEvent) iEvent;
        C87412m.m108594g(finderUninterestEvent, "event");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f17608d.getListOfType(BaseFinderFeed.class));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) it.next();
            LinkedList<FinderCommentInfo> e = C65866w.f189407h.mo89906e(baseFinderFeed.mo3513o().getFeedObject());
            FinderCommentInfo finderCommentInfo = null;
            for (FinderCommentInfo finderCommentInfo2 : e) {
                if (C87412m.m108589b(finderCommentInfo2.username, finderUninterestEvent.f9262d.f9263a)) {
                    finderCommentInfo = finderCommentInfo2;
                }
            }
            if (finderCommentInfo != null) {
                e.remove(finderCommentInfo);
                FinderItem o = baseFinderFeed.mo3513o();
                o.setFriendLikeCount(o.getFriendLikeCount() - 1);
                if (baseFinderFeed.mo3513o().getFeedObject().msgEventFlag == 1 && finderCommentInfo.unreadFlag == 1 && baseFinderFeed.mo3513o().getFeedObject().incFriendLikeCount > 0) {
                    baseFinderFeed.mo3513o().getFeedObject().incFriendLikeCount--;
                    Log.m105924i("Finder.ContactUninterestEventListener", "FinderUninterestEvent " + finderUninterestEvent.f9262d.f9263a + ", " + baseFinderFeed.mo3513o().getFeedObject().incFriendLikeCount);
                }
                FeedUpdateEvent feedUpdateEvent = new FeedUpdateEvent();
                FeedUpdateEvent.C1041a aVar = feedUpdateEvent.f9173d;
                aVar.f9175b = 4;
                aVar.f9174a = baseFinderFeed.getItemId();
                feedUpdateEvent.publish();
            }
        }
        return true;
    }
}
