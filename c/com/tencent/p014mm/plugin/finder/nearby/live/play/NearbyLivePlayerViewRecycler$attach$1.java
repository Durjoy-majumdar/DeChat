package com.tencent.p014mm.plugin.finder.nearby.live.play;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Metadata;
import pm1.C62405v;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004"}, mo182094d2 = {"com/tencent/mm/plugin/finder/nearby/live/play/NearbyLivePlayerViewRecycler$attach$1", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onDestroy", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePlayerViewRecycler$attach$1 */
public final class NearbyLivePlayerViewRecycler$attach$1 implements C0124r {

    /* renamed from: d */
    public final /* synthetic */ NearbyLivePlayerViewRecycler f160220d;

    /* renamed from: e */
    public final /* synthetic */ AppCompatActivity f160221e;

    public NearbyLivePlayerViewRecycler$attach$1(NearbyLivePlayerViewRecycler nearbyLivePlayerViewRecycler, AppCompatActivity appCompatActivity) {
        this.f160220d = nearbyLivePlayerViewRecycler;
        this.f160221e = appCompatActivity;
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void onDestroy() {
        Log.m105924i("NearbyLivePlayerViewRecycler", "onDestroy activityCount:" + this.f160220d.f160218i);
        NearbyLivePlayerViewRecycler nearbyLivePlayerViewRecycler = this.f160220d;
        int i = nearbyLivePlayerViewRecycler.f160218i + -1;
        nearbyLivePlayerViewRecycler.f160218i = i;
        if (i == 0) {
            nearbyLivePlayerViewRecycler.f160219j.clear();
            nearbyLivePlayerViewRecycler.f160216g = true;
            nearbyLivePlayerViewRecycler.f160215f.post(new C62405v(nearbyLivePlayerViewRecycler));
        }
        this.f160220d.f160219j.remove(Integer.valueOf(this.f160221e.hashCode()));
        this.f160221e.getLifecycle().removeObserver(this);
    }
}
