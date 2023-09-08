package yn2;

import com.tencent.p014mm.autogen.events.SnsfillEventInfoEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import et2.C97707a;
import f40.C86709a0;

/* renamed from: yn2.a1 */
public class C102874a1 extends IStaticListener<SnsfillEventInfoEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.SnsfillEventInfoListener");
        SnsfillEventInfoEvent snsfillEventInfoEvent = (SnsfillEventInfoEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.SnsfillEventInfoListener");
        boolean z = false;
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.SnsfillEventInfoListener", "SnsfillEventInfoEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.SnsfillEventInfoListener");
        } else if (!(snsfillEventInfoEvent instanceof SnsfillEventInfoEvent)) {
            Log.m105922f("MicroMsg.SnsfillEventInfoListener", "mismatched event");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.SnsfillEventInfoListener");
        } else {
            SnsfillEventInfoEvent.C92601b bVar = snsfillEventInfoEvent.f265221e;
            SnsfillEventInfoEvent.C92600a aVar = snsfillEventInfoEvent.f265220d;
            bVar.f265226a = C97707a.m126005c(aVar.f265225d, aVar.f265222a, aVar.f265224c);
            z = true;
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.SnsfillEventInfoListener");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.SnsfillEventInfoListener");
        return z;
    }
}
