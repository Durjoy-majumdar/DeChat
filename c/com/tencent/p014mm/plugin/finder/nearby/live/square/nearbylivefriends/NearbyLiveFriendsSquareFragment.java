package com.tencent.p014mm.plugin.finder.nearby.live.square.nearbylivefriends;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment;
import com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import rm1.C13087a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/square/nearbylivefriends/NearbyLiveFriendsSquareFragment;", "Lcom/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareFragment;", "<init>", "()V", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.live.square.nearbylivefriends.NearbyLiveFriendsSquareFragment */
public final class NearbyLiveFriendsSquareFragment extends NearbyLiveSquareFragment {
    /* renamed from: U */
    public String mo3553U() {
        return "1001";
    }

    public void onAttach(Context context) {
        C87412m.m108594g(context, "context");
        Bundle bundle = new Bundle();
        bundle.putInt("key_use_dark_style", 0);
        if (getArguments() == null) {
            setArguments(bundle);
        } else {
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.putAll(bundle);
            }
        }
        super.onAttach(context);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.NearbyLiveFriendsSquareFragment).mo86179qs(this, C76986a.PeopleNearby).mo86172oE(this, true).Mn0(this, 40, 24184);
    }

    public void onPause() {
        super.onPause();
        if (getActivity() != null) {
            C13087a.f37254a.mo12582c(((NearbyLiveSquareUIC) mo82247K(NearbyLiveSquareUIC.class)).mo3605d3());
        }
    }
}
