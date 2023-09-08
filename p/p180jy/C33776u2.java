package p180jy;

import com.tencent.p014mm.autogen.events.TrigerAdReportEvent;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: jy.u2 */
public class C33776u2 extends IStaticListener<TrigerAdReportEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.TrigerAdReportListener");
        TrigerAdReportEvent trigerAdReportEvent = (TrigerAdReportEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.TrigerAdReportListener");
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.TrigerAdReportListener", "TrigerAdReportEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.TrigerAdReportListener");
        } else {
            Log.m105924i("MicroMsg.TrigerAdReportListener", "triger snslogmgr try report");
            C94866e1.Zx0().mo59224D();
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.TrigerAdReportListener");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.TrigerAdReportListener");
        return false;
    }
}
