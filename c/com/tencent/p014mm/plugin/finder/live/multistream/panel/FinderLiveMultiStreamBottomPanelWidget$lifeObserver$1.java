package com.tencent.p014mm.plugin.finder.live.multistream.panel;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import kotlin.Metadata;
import pj1.C62312d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\u0005"}, mo182094d2 = {"com/tencent/mm/plugin/finder/live/multistream/panel/FinderLiveMultiStreamBottomPanelWidget$lifeObserver$1", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onPause", "onResume", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.multistream.panel.FinderLiveMultiStreamBottomPanelWidget$lifeObserver$1 */
public final class FinderLiveMultiStreamBottomPanelWidget$lifeObserver$1 implements C0124r {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveMultiStreamBottomPanelWidget f159476d;

    public FinderLiveMultiStreamBottomPanelWidget$lifeObserver$1(FinderLiveMultiStreamBottomPanelWidget finderLiveMultiStreamBottomPanelWidget) {
        this.f159476d = finderLiveMultiStreamBottomPanelWidget;
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public final void onPause() {
        C62312d q = this.f159476d.mo77678q();
        Iterator<C62312d.C62313a> it = q.f177132e.iterator();
        while (it.hasNext()) {
            q.mo87396e(it.next());
        }
        q.f177132e.clear();
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public final void onResume() {
        C62312d q = this.f159476d.mo77678q();
        q.getClass();
        Log.m105924i("MultiStreamAutoPlay", "checkAutoPlay");
        q.f177135h.removeCallbacks(q.f177136i);
        q.f177135h.postDelayed(q.f177136i, 0);
    }
}
