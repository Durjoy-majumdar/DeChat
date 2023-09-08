package p180jy;

import android.os.Looper;
import com.tencent.p014mm.autogen.events.StatusNotifyFunctionEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import f40.C86709a0;

/* renamed from: jy.q2 */
public class C33762q2 extends IStaticListener<StatusNotifyFunctionEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.StatusNotifyFunctionListener");
        StatusNotifyFunctionEvent statusNotifyFunctionEvent = (StatusNotifyFunctionEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.StatusNotifyFunctionListener");
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.StatusNotifyFunctionListener", "StatusNotifyFunctionEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.StatusNotifyFunctionListener");
        } else {
            int i = statusNotifyFunctionEvent.f79014d.f79015a;
            if (i != 9 && i == 7) {
                new MMHandler(Looper.getMainLooper()).post(new C33758p2(this, statusNotifyFunctionEvent));
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.StatusNotifyFunctionListener");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.StatusNotifyFunctionListener");
        return false;
    }
}
