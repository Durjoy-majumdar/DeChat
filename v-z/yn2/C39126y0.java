package yn2;

import com.tencent.p014mm.autogen.events.SnsSyncEvent;
import com.tencent.p014mm.plugin.sns.model.C94886k0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import jr2.C99019x;
import os2.C100421x;

/* renamed from: yn2.y0 */
public class C39126y0 extends IStaticListener<SnsSyncEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.SnsSyncListener");
        SnsSyncEvent snsSyncEvent = (SnsSyncEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.SnsSyncListener");
        boolean z = true;
        if (!(snsSyncEvent instanceof SnsSyncEvent)) {
            Log.m105922f("MicroMsg.SnsSyncListener", "mismatched event");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.SnsSyncListener");
        } else if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.SnsSyncListener", "SnsSyncEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.SnsSyncListener");
        } else {
            if (snsSyncEvent.f79001d.f79002a == 2) {
                boolean z2 = Util.isNullOrNil((String) C86709a0.m107535s().mo121142i().mo119684e(68377, (Object) null)) && ((C100421x) C99019x.m128969a()).mo139896kD() == 0;
                Log.m105925i("MicroMsg.SnsSyncListener", "Strategy 3 isNotExistSnsNew %b", Boolean.valueOf(z2));
                if (z2) {
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123460f(new C94886k0(256));
                }
            } else {
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(new C94886k0(256));
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.SnsSyncListener");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.SnsSyncListener");
            return z;
        }
        z = false;
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.SnsSyncListener");
        return z;
    }
}
