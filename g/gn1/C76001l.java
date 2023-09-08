package gn1;

import android.content.Intent;
import android.view.MenuItem;
import bl3.C39818r;
import cc2.C67350b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2483o0;
import com.tencent.p014mm.plugin.finder.nearby.person.NearbyPersonV1UIC;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import ht1.C60200t1;
import ln1.C21448d;
import nj3.C11184p0;
import nj3.C76879j;
import ob0.C117747y;
import ob0.C89137b0;
import p601lv.C76726b;
import rs1.C13442s8;

/* renamed from: gn1.l */
public final class C76001l implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ NearbyPersonV1UIC f222856d;

    public C76001l(NearbyPersonV1UIC nearbyPersonV1UIC) {
        this.f222856d = nearbyPersonV1UIC;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            NearbyPersonV1UIC nearbyPersonV1UIC = this.f222856d;
            nearbyPersonV1UIC.f198105r = 4;
            nearbyPersonV1UIC.f198104q = false;
            C86709a0.m107535s().mo121142i().mo119676J(16386, Integer.valueOf(this.f222856d.f198105r));
            this.f222856d.mo94863l3();
        } else if (itemId == 2) {
            NearbyPersonV1UIC nearbyPersonV1UIC2 = this.f222856d;
            nearbyPersonV1UIC2.f198105r = 3;
            nearbyPersonV1UIC2.f198104q = false;
            C86709a0.m107535s().mo121142i().mo119676J(16386, Integer.valueOf(this.f222856d.f198105r));
            this.f222856d.mo94863l3();
        } else if (itemId == 3) {
            NearbyPersonV1UIC nearbyPersonV1UIC3 = this.f222856d;
            nearbyPersonV1UIC3.f198105r = 1;
            nearbyPersonV1UIC3.f198104q = false;
            C86709a0.m107535s().mo121142i().mo119676J(16386, Integer.valueOf(this.f222856d.f198105r));
            this.f222856d.mo94863l3();
        } else if (itemId == 4) {
            Intent intent = new Intent();
            intent.setClassName(this.f222856d.getActivity(), "com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI");
            intent.putExtra("k_say_hi_type", 2);
            this.f222856d.getActivity().startActivityForResult(intent, 2009);
            C2483o0.f12984a.mo2462l(2, ((C13442s8) C39818r.f106831a.mo62444c(this.f222856d.getActivity()).mo75002a(C13442s8.class)).mo12861q3());
            ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77239M5("NearbyPeopleBubble");
        } else if (itemId == 5) {
            this.f222856d.f222831e = ((C76726b) C86312j.m106911c(C76726b.class)).mo106909kq(2, 0.0f, 0.0f, 0, 0, "", "");
            C89137b0 d = C86709a0.m107524d();
            C67350b bVar = this.f222856d.f222831e;
            C87412m.m108592e(bVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            d.mo123460f((C117747y) bVar);
            NearbyPersonV1UIC nearbyPersonV1UIC4 = this.f222856d;
            nearbyPersonV1UIC4.f198100j = C76879j.m92723Q(nearbyPersonV1UIC4.getActivity(), nearbyPersonV1UIC4.getString(C0966R.string.a3h), nearbyPersonV1UIC4.getString(C0966R.string.h5h), true, true, new C75998h(nearbyPersonV1UIC4));
        }
        C21448d.f60723a.mo33623a(menuItem.getItemId());
    }
}
