package com.tencent.p014mm.plugin.finder.viewmodel.component;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMegaVideoBtnAnimUIC$lifecycleObserver$1", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onResume", "onPause", "onDestroy", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC$lifecycleObserver$1 */
public final class FinderFeedMegaVideoBtnAnimUIC$lifecycleObserver$1 implements C0124r {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedMegaVideoBtnAnimUIC f162503d;

    public FinderFeedMegaVideoBtnAnimUIC$lifecycleObserver$1(FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC) {
        this.f162503d = finderFeedMegaVideoBtnAnimUIC;
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void onDestroy() {
        this.f162503d.f162501j.dead();
        this.f162503d.getActivity().getLifecycle().removeObserver(this);
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public final void onPause() {
        this.f162503d.f162501j.dead();
        this.f162503d.f162500i = false;
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public final void onResume() {
        this.f162503d.f162501j.alive();
        this.f162503d.f162500i = true;
    }
}
