package yn2;

import com.tencent.p014mm.autogen.events.RemoveSnsTaskEvent;
import com.tencent.p014mm.plugin.sns.model.C30415u0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: yn2.q0 */
public class C39115q0 extends IStaticListener<RemoveSnsTaskEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListener");
        RemoveSnsTaskEvent removeSnsTaskEvent = (RemoveSnsTaskEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListener");
        boolean z = false;
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.RemoveSnsTaskEventListener", "RemoveSnsTaskEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListener");
        } else if (!(removeSnsTaskEvent instanceof RemoveSnsTaskEvent)) {
            Log.m105922f("MicroMsg.RemoveSnsTaskEventListener", "mismatched event");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListener");
        } else {
            if (removeSnsTaskEvent.f78916d.f78917a == 0) {
                Log.m105918d("MicroMsg.RemoveSnsTaskEventListener", "start clean");
                C30415u0.f82031e = true;
                C30415u0 u0Var = new C30415u0();
                SnsMethodCalculate.markStartTimeMs("cleanSnsTask", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                u0Var.f82034b = System.currentTimeMillis();
                if (u0Var.f82033a) {
                    SnsMethodCalculate.markEndTimeMs("cleanSnsTask", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                } else {
                    new C30415u0.C30417b().mo119143f("");
                    SnsMethodCalculate.markEndTimeMs("cleanSnsTask", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                }
            } else {
                Log.m105918d("MicroMsg.RemoveSnsTaskEventListener", "stop clean");
                C30415u0.f82031e = false;
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListener");
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListener");
        return z;
    }
}
