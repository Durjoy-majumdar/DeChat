package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import com.tencent.p014mm.autogen.events.SnsAdEggCardEncoreEvent;
import com.tencent.p014mm.plugin.sns.p104ad.widget.shakead.ShakeCoverView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.c */
public class C94623c implements ShakeCoverView.C94772d {
    public C94623c(C94625d dVar) {
    }

    /* renamed from: a */
    public void mo130195a() {
        SnsMethodCalculate.markStartTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent$1");
        SnsAdEggCardEncoreEvent snsAdEggCardEncoreEvent = new SnsAdEggCardEncoreEvent();
        snsAdEggCardEncoreEvent.f265113d.f265114a = 1;
        snsAdEggCardEncoreEvent.publish();
        SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent$1");
    }
}
