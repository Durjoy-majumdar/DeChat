package p180jy;

import com.tencent.p014mm.autogen.events.ActiveStatusChangedForDataReportEvent;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94869f2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import fs2.C32163a;
import hd0.C98398h0;
import hd0.C98438x;

/* renamed from: jy.a */
public class C99070a extends IStaticListener<ActiveStatusChangedForDataReportEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ActiveStatusChangedForDataReportListener");
        ActiveStatusChangedForDataReportEvent activeStatusChangedForDataReportEvent = (ActiveStatusChangedForDataReportEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ActiveStatusChangedForDataReportListener");
        C94869f2 hy02 = C94866e1.hy0();
        if ("SnsTimeLineUI".equals(activeStatusChangedForDataReportEvent.f236120d.f236122b)) {
            boolean z = activeStatusChangedForDataReportEvent.f236120d.f236121a;
            hy02.f274922i = z;
            Log.m105919d("MicroMsg.ActiveStatusChangedForDataReportListener", "set isInSnsTimeline:%b", Boolean.valueOf(z));
            if ((hy02.f274922i && !C32163a.m39640a()) || hy02.f274921h) {
                hy02.mo131036v();
            }
            C98438x yx02 = C98398h0.yx0();
            boolean z2 = hy02.f274922i;
            yx02.f288724f = z2;
            if (z2) {
                yx02.mo137776g();
            }
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ActiveStatusChangedForDataReportListener");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ActiveStatusChangedForDataReportListener");
        return false;
    }
}
