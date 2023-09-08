package com.tencent.p014mm.plugin.finder.loader;

import cm1.C0740i2;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderAtFeedUpdateEvent;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Iterator;
import kotlin.Metadata;
import tf1.C13908i;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/loader/FinderAtFeedLoader$updateAtFeedListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderAtFeedUpdateEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader$updateAtFeedListener$1 */
public final class FinderAtFeedLoader$updateAtFeedListener$1 extends IListener<FinderAtFeedUpdateEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderAtFeedLoader f15465d;

    /* renamed from: com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader$updateAtFeedListener$1$a */
    public /* synthetic */ class C3254a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15466a;

        static {
            int[] iArr = new int[C13908i.values().length];
            iArr[17] = 1;
            f15466a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderAtFeedLoader$updateAtFeedListener$1(FinderAtFeedLoader finderAtFeedLoader, C40008f fVar) {
        super(fVar);
        this.f15465d = finderAtFeedLoader;
    }

    public boolean callback(IEvent iEvent) {
        FinderAtFeedUpdateEvent finderAtFeedUpdateEvent = (FinderAtFeedUpdateEvent) iEvent;
        C87412m.m108594g(finderAtFeedUpdateEvent, "event");
        Log.m105924i(this.f15465d.f15434f, "hideAtFeedListener : null  feedid: null");
        Integer num = finderAtFeedUpdateEvent.f9187d != null ? 0 : null;
        if (C3254a.f15466a[this.f15465d.f15432d.ordinal()] == 1 && ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 4))) {
            FinderAtFeedLoader finderAtFeedLoader = this.f15465d;
            String str = finderAtFeedLoader.f15434f;
            Log.m105924i(str, "notifyAtFeedChange feedId:" + null + ", type:" + num);
            Iterator it = finderAtFeedLoader.getDataList().iterator();
            while (it.hasNext()) {
                C0740i2 i2Var = (C0740i2) it.next();
                if (i2Var instanceof BaseFinderFeed) {
                    ((BaseFinderFeed) i2Var).mo3513o().getId();
                }
            }
            if ((num == null || num.intValue() != 3) && num != null) {
                num.intValue();
            }
        }
        return true;
    }
}
