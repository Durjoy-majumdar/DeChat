package com.tencent.p014mm.plugin.finder.viewmodel.component;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.sdk.platformtools.Log;
import gr1.C59670o2;
import gy3.C8478d0;
import kotlin.Metadata;
import rs1.C36471cb;
import rs1.C63546db;
import sx3.C64175a0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004"}, mo182094d2 = {"com/tencent/mm/plugin/finder/viewmodel/component/FinderVideoRecycler$make$1", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onDestroy", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$make$1 */
public final class FinderVideoRecycler$make$1 implements C0124r {

    /* renamed from: d */
    public final /* synthetic */ FinderVideoRecycler f162571d;

    /* renamed from: e */
    public final /* synthetic */ AppCompatActivity f162572e;

    /* renamed from: f */
    public final /* synthetic */ String f162573f;

    public FinderVideoRecycler$make$1(FinderVideoRecycler finderVideoRecycler, AppCompatActivity appCompatActivity, String str) {
        this.f162571d = finderVideoRecycler;
        this.f162572e = appCompatActivity;
        this.f162573f = str;
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void onDestroy() {
        Log.m105924i("Finder.VideoRecycler", "onDestroy activityCount:" + this.f162571d.f162534q);
        FinderVideoRecycler finderVideoRecycler = this.f162571d;
        int i = finderVideoRecycler.f162534q + -1;
        finderVideoRecycler.f162534q = i;
        if (i == 0) {
            finderVideoRecycler.mo80079i3();
        } else {
            AppCompatActivity appCompatActivity = this.f162572e;
            C64175a0.m75511s(finderVideoRecycler.f162529i, new C36471cb(appCompatActivity));
            C8478d0 d0Var = new C8478d0();
            finderVideoRecycler.mo80074d3(new C63546db(appCompatActivity, d0Var, finderVideoRecycler));
            C59670o2 o2Var = finderVideoRecycler.f162538u;
            FinderThumbPlayerProxy finderThumbPlayerProxy = o2Var instanceof FinderThumbPlayerProxy ? (FinderThumbPlayerProxy) o2Var : null;
            boolean z = false;
            if (finderThumbPlayerProxy != null && finderThumbPlayerProxy.getContextTag() == appCompatActivity.hashCode()) {
                z = true;
            }
            if (z) {
                finderVideoRecycler.f162538u = null;
                Log.m105924i("Finder.VideoRecycler", "[removeByContext] simpleName=" + appCompatActivity.getClass().getSimpleName() + " remove recentFocusView.");
            }
            Log.m105924i("Finder.VideoRecycler", "[removeByContext] simpleName=" + appCompatActivity.getClass().getSimpleName() + " context:" + appCompatActivity.hashCode() + " removeCount=" + d0Var.f27483d + " videoCount=" + finderVideoRecycler.mo80078g3((Class<? extends C59670o2>) null));
        }
        this.f162571d.f162533p.remove(this.f162573f);
        this.f162572e.getLifecycle().removeObserver(this);
    }
}
