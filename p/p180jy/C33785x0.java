package p180jy;

import com.tencent.p014mm.autogen.events.GetAllNeedResendSnsEvent;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: jy.x0 */
public class C33785x0 extends IStaticListener<GetAllNeedResendSnsEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListener");
        GetAllNeedResendSnsEvent getAllNeedResendSnsEvent = (GetAllNeedResendSnsEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListener");
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.GetAllNeedResendSnsListener", "GetAllNeedResendSnsEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListener");
        } else {
            getAllNeedResendSnsEvent.f78810d.f78811a = C94866e1.Yx0().mo139825mI();
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListener");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListener");
        return false;
    }
}
