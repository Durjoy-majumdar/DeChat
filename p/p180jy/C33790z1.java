package p180jy;

import com.tencent.p014mm.autogen.events.SnsFileCollectEvent;
import com.tencent.p014mm.plugin.sns.model.C30402f1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: jy.z1 */
public class C33790z1 extends IStaticListener<SnsFileCollectEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsFileCollectListener");
        SnsFileCollectEvent snsFileCollectEvent = (SnsFileCollectEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsFileCollectListener");
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.SnsFileCollectListener", "SnsFileCollectEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsFileCollectListener");
        } else {
            int i = C94866e1.f274866V;
            SnsMethodCalculate.markStartTimeMs("dumpSnsFile", "com.tencent.mm.plugin.sns.model.SnsCore");
            if (C94866e1.f274872x0) {
                SnsMethodCalculate.markEndTimeMs("dumpSnsFile", "com.tencent.mm.plugin.sns.model.SnsCore");
            } else {
                C94866e1.ky0().execute(new C30402f1());
                SnsMethodCalculate.markEndTimeMs("dumpSnsFile", "com.tencent.mm.plugin.sns.model.SnsCore");
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsFileCollectListener");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsFileCollectListener");
        return false;
    }
}
