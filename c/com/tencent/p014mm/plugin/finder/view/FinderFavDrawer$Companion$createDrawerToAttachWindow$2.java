package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004"}, mo182094d2 = {"com/tencent/mm/plugin/finder/view/FinderFavDrawer$Companion$createDrawerToAttachWindow$2", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onDestroy", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderFavDrawer$Companion$createDrawerToAttachWindow$2 */
public final class FinderFavDrawer$Companion$createDrawerToAttachWindow$2 implements C0124r {

    /* renamed from: d */
    public final /* synthetic */ FinderFavDrawer f17729d;

    /* renamed from: e */
    public final /* synthetic */ Context f17730e;

    public FinderFavDrawer$Companion$createDrawerToAttachWindow$2(FinderFavDrawer finderFavDrawer, Context context) {
        this.f17729d = finderFavDrawer;
        this.f17730e = context;
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void onDestroy() {
        this.f17729d.mo9498f();
        ((MMFragmentActivity) this.f17730e).getLifecycle().removeObserver(this);
    }
}
