package p180jy;

import as2.C28125b;
import com.tencent.p014mm.autogen.events.SnsLuckyMoneyIDKeyReportEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: jy.d2 */
public class C33716d2 extends IStaticListener<SnsLuckyMoneyIDKeyReportEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsLuckyMoneyIDKeyReportListener");
        SnsLuckyMoneyIDKeyReportEvent snsLuckyMoneyIDKeyReportEvent = (SnsLuckyMoneyIDKeyReportEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsLuckyMoneyIDKeyReportListener");
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.SnsLuckyMoneyIDKeyReportListener", "SnsLuckyMoneyIDKeyReportEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsLuckyMoneyIDKeyReportListener");
        } else {
            if (snsLuckyMoneyIDKeyReportEvent instanceof SnsLuckyMoneyIDKeyReportEvent) {
                C28125b.m38099a(snsLuckyMoneyIDKeyReportEvent.f78993d.f78994a);
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsLuckyMoneyIDKeyReportListener");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsLuckyMoneyIDKeyReportListener");
        return false;
    }
}
