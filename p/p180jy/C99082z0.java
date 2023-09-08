package p180jy;

import com.tencent.p014mm.autogen.events.GetSnsResumeEvent;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: jy.z0 */
public class C99082z0 extends IStaticListener<GetSnsResumeEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.GetSnsResumeListener");
        GetSnsResumeEvent getSnsResumeEvent = (GetSnsResumeEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.GetSnsResumeListener");
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.GetSnsResumeListener", "GetSnsResumeEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.GetSnsResumeListener");
        } else {
            getSnsResumeEvent.f264895d.f264896a = C94866e1.Kx0().mo133243f();
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.GetSnsResumeListener");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.GetSnsResumeListener");
        return false;
    }
}
