package com.tencent.p014mm.plugin.finder.feed.model;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedPostProgressEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/model/FinderProfileMusicLoader$feedProgressListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedPostProgressEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileMusicLoader$feedProgressListener$1 */
public final class FinderProfileMusicLoader$feedProgressListener$1 extends IListener<FeedPostProgressEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileMusicLoader f158711d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfileMusicLoader$feedProgressListener$1(FinderProfileMusicLoader finderProfileMusicLoader, C40008f fVar) {
        super(fVar);
        this.f158711d = finderProfileMusicLoader;
    }

    public boolean callback(IEvent iEvent) {
        FeedPostProgressEvent feedPostProgressEvent = (FeedPostProgressEvent) iEvent;
        C87412m.m108594g(feedPostProgressEvent, "event");
        FinderProfileMusicLoader finderProfileMusicLoader = this.f158711d;
        String tag = finderProfileMusicLoader.getTAG();
        Log.m105924i(tag, "feedProgressListener localId:" + feedPostProgressEvent.f154751d.f154752a + ", progress:" + feedPostProgressEvent.f154751d.f154753b);
        long j = feedPostProgressEvent.f154751d.f154752a;
        if (j <= 0) {
            return true;
        }
        C61926c.m72668M(new C55773k0(finderProfileMusicLoader, j));
        return true;
    }
}
