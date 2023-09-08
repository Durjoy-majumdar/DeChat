package com.tencent.p014mm.plugin.finder.preload.tabPreload;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004"}, mo182094d2 = {"com/tencent/mm/plugin/finder/preload/tabPreload/FinderPlayerPreloadCore$newPlaceHolderView$3", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onDestroy", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore$newPlaceHolderView$3 */
public final class FinderPlayerPreloadCore$newPlaceHolderView$3 implements C0124r {

    /* renamed from: d */
    public final /* synthetic */ AppCompatActivity f160332d;

    public FinderPlayerPreloadCore$newPlaceHolderView$3(AppCompatActivity appCompatActivity) {
        this.f160332d = appCompatActivity;
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void onDestroy() {
        Log.m105924i("FinderPlayerPreloadCore", "onDestroy: placeHolderView=" + FinderPlayerPreloadCore.f160329e);
        FinderPlayerPreloadCore.f160325a.mo78450a("LauncherUIDestroy");
        this.f160332d.getLifecycle().removeObserver(this);
    }
}
