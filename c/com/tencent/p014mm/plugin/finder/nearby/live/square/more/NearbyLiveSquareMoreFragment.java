package com.tencent.p014mm.plugin.finder.nearby.live.square.more;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment;
import com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC;
import com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import gy3.C87412m;
import kotlin.Metadata;
import ln1.C10585g;
import rm1.C13087a;
import vc1.C37715b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/square/more/NearbyLiveSquareMoreFragment;", "Lcom/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareFragment;", "<init>", "()V", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.live.square.more.NearbyLiveSquareMoreFragment */
public final class NearbyLiveSquareMoreFragment extends NearbyLiveSquareFragment {
    /* renamed from: R */
    public int mo2203R() {
        return 80;
    }

    /* renamed from: U */
    public String mo3553U() {
        return C37715b.f99914a.mo61298a() ? "8002" : "1004";
    }

    /* renamed from: X */
    public int mo3555X() {
        return 3;
    }

    public void onPause() {
        super.onPause();
        if (getActivity() != null) {
            NearbyLiveSquareTabFragment d3 = ((NearbyLiveSquareUIC) mo82247K(NearbyLiveSquareUIC.class)).mo3605d3();
            C10585g.f31933a.mo10848f(d3);
            C13087a.f37254a.mo12582c(d3);
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("NearbyLiveSquareUIC", "onResume()");
        C10585g gVar = C10585g.f31933a;
        C10585g.f31936d = C31543z5.m39453c();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        mo2202O();
    }
}
