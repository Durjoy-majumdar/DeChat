package p180jy;

import android.os.CancellationSignal;
import com.tencent.p014mm.autogen.events.SnsCleanStorageEvent;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import mr2.C99960a;

/* renamed from: jy.v1 */
public class C33779v1 extends IStaticListener<SnsCleanStorageEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsCleanStorageEventListener");
        SnsCleanStorageEvent snsCleanStorageEvent = (SnsCleanStorageEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsCleanStorageEventListener");
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.SnsCleanStorageEventListener", "SnsCleanStorageEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsCleanStorageEventListener");
        } else {
            if (snsCleanStorageEvent != null) {
                Log.m105924i("MicroMsg.SnsCleanStorageEventListener", "receive SnsCleanStorageEvent.");
                SnsCleanStorageEvent.C28827a aVar = snsCleanStorageEvent.f78986d;
                long j = aVar.f78987a;
                long j2 = aVar.f78990d;
                long j3 = aVar.f78989c;
                long j4 = aVar.f78991e;
                long j5 = aVar.f78992f;
                C94866e1.Sx0();
                C99960a.m130597b((CancellationSignal) aVar.f78988b, j, j3, j2, j5, j4);
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsCleanStorageEventListener");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsCleanStorageEventListener");
        return false;
    }
}
