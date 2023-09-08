package gn1;

import android.content.DialogInterface;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.nearby.NearbyHomeUIC;
import com.tencent.p014mm.plugin.finder.nearby.person.NearbyPersonV1UIC;
import f40.C86709a0;
import ln1.C21448d;
import vc1.C37715b;

/* renamed from: gn1.c */
public final class C8362c implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ NearbyPersonV1UIC f27326d;

    public C8362c(NearbyPersonV1UIC nearbyPersonV1UIC) {
        this.f27326d = nearbyPersonV1UIC;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C21448d.f60723a.mo33624b(4);
        C86709a0.m107535s().mo121142i().mo119676J(4104, Boolean.TRUE);
        NearbyHomeUIC nearbyHomeUIC = (NearbyHomeUIC) C39818r.f106831a.mo62444c(this.f27326d.getActivity()).mo75002a(NearbyHomeUIC.class);
        nearbyHomeUIC.getClass();
        if (C37715b.f99914a.mo61298a()) {
            nearbyHomeUIC.mo3545f3(1006);
        } else {
            nearbyHomeUIC.mo3545f3(1001);
        }
    }
}
