package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$networkReceiver$1", "Landroid/content/BroadcastReceiver;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC$networkReceiver$1 */
public final class FinderHomeUIC$networkReceiver$1 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ FinderHomeUIC f18673a;

    public FinderHomeUIC$networkReceiver$1(FinderHomeUIC finderHomeUIC) {
        this.f18673a = finderHomeUIC;
    }

    public void onReceive(Context context, Intent intent) {
        boolean isMobile = NetStatusUtil.isMobile(MMApplicationContext.getContext());
        Log.m105924i("Finder.HomeUIC", "on network change callback， oldIsMobileData = " + this.f18673a.f18656p + ", nowIsMobileData = " + isMobile);
        FinderHomeUIC finderHomeUIC = this.f18673a;
        boolean z = finderHomeUIC.f18656p;
        if (z != isMobile && !z) {
            finderHomeUIC.mo5127c3(false);
        }
        this.f18673a.f18656p = isMobile;
    }
}
