package p180jy;

import com.tencent.p014mm.autogen.events.ResendSnsEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f40.C86709a0;

/* renamed from: jy.t1 */
public class C33772t1 extends IStaticListener<ResendSnsEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ResendSnsListener");
        ResendSnsEvent resendSnsEvent = (ResendSnsEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ResendSnsListener");
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.ResendSnsListener", "ResendSnsEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ResendSnsListener");
        } else {
            long j = (long) resendSnsEvent.f78937d.f78938a;
            Log.m105925i("MicroMsg.ResendSnsListener", "try resend msg for SnsInfoId:%d", Long.valueOf(j));
            MMHandlerThread.postToMainThread(new C33769s1(this, j));
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ResendSnsListener");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ResendSnsListener");
        return false;
    }
}
