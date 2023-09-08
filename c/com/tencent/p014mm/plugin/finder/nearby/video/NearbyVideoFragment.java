package com.tencent.p014mm.plugin.finder.nearby.video;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.nearby.base.AbsNearByFragment;
import di3.C86312j;
import java.util.Set;
import kotlin.Metadata;
import l31.C61212e;
import ln1.C10585g;
import o31.C11345b;
import o31.C76986a;
import rs1.C13442s8;
import sx3.C110826x0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/video/NearbyVideoFragment;", "Lcom/tencent/mm/plugin/finder/nearby/base/AbsNearByFragment;", "<init>", "()V", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFragment */
public final class NearbyVideoFragment extends AbsNearByFragment {
    public NearbyVideoFragment() {
        super(C0966R.string.f361091h72, 1002);
    }

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C110826x0.m151017e(C13442s8.class, C3350i.class);
    }

    /* renamed from: O */
    public void mo2202O() {
        super.mo2202O();
        C10585g.f31933a.mo10847e(this);
    }

    /* renamed from: P */
    public void mo3550P() {
        super.mo3550P();
        C10585g.f31933a.mo10848f(this);
    }

    /* renamed from: R */
    public int mo2203R() {
        return 15;
    }

    /* renamed from: U */
    public String mo3553U() {
        return "1002";
    }

    /* renamed from: V */
    public String mo3554V() {
        return "15-1002";
    }

    /* renamed from: X */
    public int mo3555X() {
        return 3;
    }

    /* renamed from: Y */
    public boolean mo3556Y() {
        return false;
    }

    /* renamed from: Z */
    public void mo3557Z() {
        NearbyVideoPresenter nearbyVideoPresenter = ((C3350i) mo82247K(C3350i.class)).f15800d;
        if (nearbyVideoPresenter != null) {
            nearbyVideoPresenter.onActionbarClick(false);
        }
    }

    /* renamed from: a0 */
    public void mo3558a0() {
        NearbyVideoPresenter nearbyVideoPresenter = ((C3350i) mo82247K(C3350i.class)).f15800d;
        if (nearbyVideoPresenter != null) {
            nearbyVideoPresenter.onActionbarClick(true);
        }
    }

    /* renamed from: d0 */
    public void mo3559d0() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.NearbyVideoFragment).mo86179qs(this, C76986a.PeopleNearby).mo86172oE(this, true).Mn0(this, 40, 24184);
    }
}
