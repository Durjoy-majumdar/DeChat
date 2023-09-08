package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.app.Activity;
import com.tencent.p014mm.autogen.events.FeedPostProgressEvent;
import com.tencent.p014mm.plugin.finder.gallery.FinderGalleryFragment;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/viewmodel/component/FinderImmersiveVideoUIC$feedProgressListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedPostProgressEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveVideoUIC$feedProgressListener$1 */
public final class FinderImmersiveVideoUIC$feedProgressListener$1 extends IListener<FeedPostProgressEvent> {

    /* renamed from: p */
    public final /* synthetic */ FinderImmersiveVideoUIC f74786p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderImmersiveVideoUIC$feedProgressListener$1(FinderImmersiveVideoUIC finderImmersiveVideoUIC, Activity activity) {
        super((MMFinderUI) activity);
        this.f74786p = finderImmersiveVideoUIC;
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
    }

    public boolean callback(IEvent iEvent) {
        FeedPostProgressEvent feedPostProgressEvent = (FeedPostProgressEvent) iEvent;
        C87412m.m108594g(feedPostProgressEvent, "event");
        int i = FinderGalleryFragment.f159143y;
        Log.m105924i("Finder.FinderGalleryFragment", "feedProgressListener localId:" + feedPostProgressEvent.f154751d.f154752a + ", progress:" + feedPostProgressEvent.f154751d.f154753b);
        this.f74786p.f18734g.updateProgressByLocalId(feedPostProgressEvent.f154751d.f154752a);
        return true;
    }
}
