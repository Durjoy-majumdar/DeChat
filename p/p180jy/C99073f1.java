package p180jy;

import com.tencent.p014mm.autogen.events.OnlineVideoEvent;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94869f2;
import com.tencent.p014mm.plugin.sns.model.C94881h2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;

/* renamed from: jy.f1 */
public class C99073f1 extends IStaticListener<OnlineVideoEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.OnlineVideoListener");
        OnlineVideoEvent onlineVideoEvent = (OnlineVideoEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.OnlineVideoListener");
        C94869f2 hy02 = C94866e1.hy0();
        if (hy02.f274914a == null) {
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.OnlineVideoListener");
        } else if (!Util.isEqual(hy02.f274914a.f275255b, onlineVideoEvent.f264965d.f264968c)) {
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.OnlineVideoListener");
        } else {
            OnlineVideoEvent.C92538a aVar = onlineVideoEvent.f264965d;
            if (aVar.f264967b != 0) {
                hy02.mo131039y();
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.OnlineVideoListener");
            } else {
                int i = aVar.f264966a;
                if (i == 1) {
                    Log.m105925i("MicroMsg.OnlineVideoListener", "Moov ready: %s", aVar.f264968c);
                    hy02.f274914a.f275263j = onlineVideoEvent.f264965d.f264969d;
                    hy02.f274914a.f275264k = onlineVideoEvent.f264965d.f264970e;
                } else if (i == 5) {
                    hy02.f274914a.f275261h = onlineVideoEvent.f264965d.f264969d;
                    hy02.f274914a.f275262i = onlineVideoEvent.f264965d.f264970e;
                }
                int i2 = onlineVideoEvent.f264965d.f264966a;
                if (i2 == 4 || i2 == 6) {
                    SnsMethodCalculate.markStartTimeMs("downloadVideoFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                    C86709a0.m107528h();
                    C86709a0.m107525e().postToWorker(new C94881h2(hy02));
                    SnsMethodCalculate.markEndTimeMs("downloadVideoFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.OnlineVideoListener");
            }
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.OnlineVideoListener");
        return false;
    }
}
