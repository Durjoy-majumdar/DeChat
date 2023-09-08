package com.tencent.p014mm.plugin.finder.gallery;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedPostProgressEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/gallery/FinderGalleryFragment$feedProgressListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedPostProgressEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment$feedProgressListener$1 */
public final class FinderGalleryFragment$feedProgressListener$1 extends IListener<FeedPostProgressEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderGalleryFragment f159155d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderGalleryFragment$feedProgressListener$1(FinderGalleryFragment finderGalleryFragment, C40008f fVar) {
        super(fVar);
        this.f159155d = finderGalleryFragment;
    }

    public boolean callback(IEvent iEvent) {
        FeedPostProgressEvent feedPostProgressEvent = (FeedPostProgressEvent) iEvent;
        C87412m.m108594g(feedPostProgressEvent, "event");
        int i = FinderGalleryFragment.f159143y;
        Log.m105924i("Finder.FinderGalleryFragment", "feedProgressListener localId:" + feedPostProgressEvent.f154751d.f154752a + ", progress:" + feedPostProgressEvent.f154751d.f154753b);
        FinderGalleryLoader finderGalleryLoader = this.f159155d.f159148v;
        if (finderGalleryLoader != null) {
            finderGalleryLoader.updateProgressByLocalId(feedPostProgressEvent.f154751d.f154752a);
            return true;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }
}
