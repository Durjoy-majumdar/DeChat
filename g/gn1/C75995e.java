package gn1;

import bh3.C113177k;
import com.tencent.p014mm.plugin.finder.nearby.person.NearbyPersonV1UIC;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;

/* renamed from: gn1.e */
public final class C75995e implements C113177k.C113181e {

    /* renamed from: a */
    public final /* synthetic */ NearbyPersonV1UIC f222850a;

    public C75995e(NearbyPersonV1UIC nearbyPersonV1UIC) {
        this.f222850a = nearbyPersonV1UIC;
    }

    public final void onOp(Boolean bool) {
        C87412m.m108593f(bool, LocaleUtil.ITALIAN);
        if (bool.booleanValue()) {
            this.f222850a.mo94858f3();
        } else {
            this.f222850a.mo94862k3();
        }
    }
}
