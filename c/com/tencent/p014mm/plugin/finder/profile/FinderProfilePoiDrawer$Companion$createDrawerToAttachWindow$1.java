package com.tencent.p014mm.plugin.finder.profile;

import android.content.Context;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderProfileUI;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004"}, mo182094d2 = {"com/tencent/mm/plugin/finder/profile/FinderProfilePoiDrawer$Companion$createDrawerToAttachWindow$1", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onDestroy", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.profile.FinderProfilePoiDrawer$Companion$createDrawerToAttachWindow$1 */
public final class FinderProfilePoiDrawer$Companion$createDrawerToAttachWindow$1 implements C0124r {

    /* renamed from: d */
    public final /* synthetic */ FinderProfilePoiDrawer f16118d;

    /* renamed from: e */
    public final /* synthetic */ Context f16119e;

    public FinderProfilePoiDrawer$Companion$createDrawerToAttachWindow$1(FinderProfilePoiDrawer finderProfilePoiDrawer, Context context) {
        this.f16118d = finderProfilePoiDrawer;
        this.f16119e = context;
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void onDestroy() {
        this.f16118d.mo9498f();
        ((FinderProfileUI) this.f16119e).getLifecycle().removeObserver(this);
    }
}
