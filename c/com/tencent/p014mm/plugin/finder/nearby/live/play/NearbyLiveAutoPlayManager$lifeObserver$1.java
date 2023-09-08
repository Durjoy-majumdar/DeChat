package com.tencent.p014mm.plugin.finder.nearby.live.play;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import bl3.C39818r;
import com.tencent.p014mm.sdk.platformtools.Log;
import fm1.C8137c;
import kotlin.Metadata;
import o40.C61926c;
import pm1.C62381d;
import pm1.C62403s;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\u0005"}, mo182094d2 = {"com/tencent/mm/plugin/finder/nearby/live/play/NearbyLiveAutoPlayManager$lifeObserver$1", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onResume", "onPause", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.live.play.NearbyLiveAutoPlayManager$lifeObserver$1 */
public final class NearbyLiveAutoPlayManager$lifeObserver$1 implements C0124r {

    /* renamed from: d */
    public final /* synthetic */ C62381d f160212d;

    public NearbyLiveAutoPlayManager$lifeObserver$1(C62381d dVar) {
        this.f160212d = dVar;
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public final void onPause() {
        String r = this.f160212d.mo87439r();
        Log.m105924i(r, "page onPause context: " + this.f160212d.f177285a);
        NearbyLivePlayerViewRecycler nearbyLivePlayerViewRecycler = (NearbyLivePlayerViewRecycler) C39818r.f106831a.mo62446e(C8137c.class).mo75002a(NearbyLivePlayerViewRecycler.class);
        nearbyLivePlayerViewRecycler.getClass();
        C61926c.m72668M(new C62403s(nearbyLivePlayerViewRecycler));
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public final void onResume() {
        String r = this.f160212d.mo87439r();
        Log.m105924i(r, "page onResume context: " + this.f160212d.f177285a + " isOnUserVisibleFocused: " + this.f160212d.f177297m + " isSwitchLiveAutoPlay: $");
        C62381d dVar = this.f160212d;
        if (dVar.f177297m) {
            dVar.mo11215b();
        }
    }
}
