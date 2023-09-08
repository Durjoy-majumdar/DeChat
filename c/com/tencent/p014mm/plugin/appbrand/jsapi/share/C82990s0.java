package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.message.OnAppBrandAppMessageRetransmitEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import f40.C86709a0;
import gy3.C87412m;
import sx3.C110823p;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.s0 */
public final class C82990s0 extends IStaticListener<OnAppBrandAppMessageRetransmitEvent> {
    public boolean callback(IEvent iEvent) {
        C68070l.C68072b bVar;
        OnAppBrandAppMessageRetransmitEvent onAppBrandAppMessageRetransmitEvent = (OnAppBrandAppMessageRetransmitEvent) iEvent;
        C87412m.m108594g(onAppBrandAppMessageRetransmitEvent, "event");
        if (!C86709a0.m107522a() || (bVar = onAppBrandAppMessageRetransmitEvent.f195352d) == null) {
            return false;
        }
        String str = bVar.f195589j2;
        if (str == null || str.length() == 0) {
            return true;
        }
        String str2 = bVar.f195589j2;
        C87412m.m108593f(str2, "appMsgContent.appbrandShareActionId");
        C82970i0 i0Var = new C82970i0();
        if (C110823p.m151009y(new Integer[]{2, 3}, Integer.valueOf(bVar.f195581h2))) {
            i0Var.f242601b = 1;
            i0Var.f242602c = bVar.f195570f;
            i0Var.f242603d = bVar.f195569e2;
            C80995a aVar = (C80995a) bVar.mo93555w(C80995a.class);
            i0Var.f242604e = aVar != null ? aVar.f237913v : null;
        } else {
            i0Var.f242601b = 0;
            i0Var.f242602c = bVar.f195570f;
            i0Var.f242604e = bVar.f195646y;
        }
        C82972j0.m101772b(str2, i0Var);
        return true;
    }
}
