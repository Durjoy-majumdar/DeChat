package com.tencent.p014mm.plugin.finder.newloader;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedPostProgressEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;
import on1.C11533k;
import on1.C11535l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/newloader/FinderDefaultLoaderActions$feedProgressListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedPostProgressEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$feedProgressListener$1 */
public final class FinderDefaultLoaderActions$feedProgressListener$1 extends IListener<FeedPostProgressEvent> {

    /* renamed from: d */
    public final /* synthetic */ C11533k f15826d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderDefaultLoaderActions$feedProgressListener$1(C11533k kVar, C40008f fVar) {
        super(fVar);
        this.f15826d = kVar;
    }

    public boolean callback(IEvent iEvent) {
        FeedPostProgressEvent feedPostProgressEvent = (FeedPostProgressEvent) iEvent;
        C87412m.m108594g(feedPostProgressEvent, "event");
        Log.m105924i("Finder.DefaultLoaderActions", "feedProgressListener localId:" + feedPostProgressEvent.f154751d.f154752a + ", progress:" + feedPostProgressEvent.f154751d.f154753b);
        C11533k kVar = this.f15826d;
        long j = feedPostProgressEvent.f154751d.f154752a;
        kVar.getClass();
        if (j <= 0) {
            return true;
        }
        Log.m105924i("Finder.DefaultLoaderActions", "updateProgressByLocalId localId:" + j);
        C61926c.m72668M(new C11535l(kVar, j));
        return true;
    }
}
