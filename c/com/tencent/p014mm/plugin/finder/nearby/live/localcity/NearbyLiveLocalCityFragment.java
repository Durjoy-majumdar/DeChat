package com.tencent.p014mm.plugin.finder.nearby.live.localcity;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.nearby.base.AbsNearByFragment;
import di3.C86312j;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.Set;
import kotlin.Metadata;
import l31.C61212e;
import ln1.C10585g;
import o31.C11345b;
import o31.C76986a;
import om1.C11503a;
import om1.C11505c;
import rm1.C13087a;
import rs1.C13442s8;
import sx3.C110826x0;
import te3.C51942x91;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/localcity/NearbyLiveLocalCityFragment;", "Lcom/tencent/mm/plugin/finder/nearby/base/AbsNearByFragment;", "<init>", "()V", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.live.localcity.NearbyLiveLocalCityFragment */
public final class NearbyLiveLocalCityFragment extends AbsNearByFragment {

    /* renamed from: r */
    public C51942x91 f15652r;

    /* renamed from: s */
    public boolean f15653s = true;

    public NearbyLiveLocalCityFragment() {
        super(C0966R.string.f361089h70, 1006);
    }

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C110826x0.m151017e(C13442s8.class, C11505c.class);
    }

    /* renamed from: O */
    public void mo2202O() {
        super.mo2202O();
        if (this.f15652r == null) {
            C51942x91 x912 = new C51942x91();
            this.f15652r = x912;
            x912.f144531d = 88889;
            C13087a aVar = C13087a.f37254a;
            C10585g gVar = C10585g.f31933a;
            aVar.mo12580a(C10585g.f31934b, this, "8003" + '-' + C31543z5.m39453c(), "");
        }
        C10585g.f31933a.mo10847e(this);
        C13087a.f37254a.mo12581b(this);
    }

    /* renamed from: P */
    public void mo3550P() {
        super.mo3550P();
        C10585g.f31933a.mo10848f(this);
        C13087a.f37254a.mo12582c(this);
    }

    /* renamed from: R */
    public int mo2203R() {
        return 112;
    }

    /* renamed from: T */
    public String mo3552T() {
        C51942x91 x912 = this.f15652r;
        return String.valueOf(x912 != null ? Integer.valueOf(x912.f144531d) : null);
    }

    /* renamed from: U */
    public String mo3553U() {
        return "8003";
    }

    /* renamed from: V */
    public String mo3554V() {
        StringBuilder sb = new StringBuilder();
        sb.append(112);
        sb.append('-');
        C51942x91 x912 = this.f15652r;
        sb.append(x912 != null ? Integer.valueOf(x912.f144531d) : "");
        return sb.toString();
    }

    /* renamed from: X */
    public int mo3555X() {
        return 3;
    }

    /* renamed from: Z */
    public void mo3557Z() {
        C11503a aVar = ((C11505c) mo82247K(C11505c.class)).f33803e;
        if (aVar != null) {
            aVar.mo3569J0(false);
        } else {
            C87412m.m108603p("liveFriendsPresenter");
            throw null;
        }
    }

    /* renamed from: a0 */
    public void mo3558a0() {
        C11503a aVar = ((C11505c) mo82247K(C11505c.class)).f33803e;
        if (aVar != null) {
            aVar.mo3569J0(true);
        } else {
            C87412m.m108603p("liveFriendsPresenter");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.NearbyLiveLocalCityFragment).mo86179qs(this, C76986a.PeopleNearby).mo86172oE(this, true).Mn0(this, 40, 24184);
    }

    public void onDestroy() {
        super.onDestroy();
        C13087a.f37255b = "";
        C13087a.f37257d = "";
        C13087a.f37258e = 0;
        C13087a.f37256c = "";
        C13087a.f37259f = true;
        C13087a.f37263j = false;
        C13087a.f37260g = "";
        C13087a.f37261h = -1;
        C13087a.f37262i = -1;
    }

    public void onPause() {
        super.onPause();
        if (getActivity() != null) {
            C13087a.f37254a.mo12582c(this);
        }
        C13087a.f37263j = true;
    }

    public void onResume() {
        super.onResume();
        if (!this.f15653s && getActivity() != null) {
            C13087a.f37254a.mo12581b(this);
        }
        this.f15653s = false;
        C13087a.f37263j = false;
    }
}
