package p180jy;

import com.tencent.p014mm.autogen.events.DumpSnsEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;

/* renamed from: jy.i */
public class C33731i extends IStaticListener<DumpSnsEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.DumpSnsListener");
        DumpSnsEvent dumpSnsEvent = (DumpSnsEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.DumpSnsListener");
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.DumpSnsListener", "DumpSnsEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.DumpSnsListener");
        } else {
            C86709a0.m107528h();
            String str = C86709a0.m107535s().f251807e;
            C86709a0.m107528h();
            String str2 = C86709a0.m107535s().f251805c;
            Log.m105925i("MicroMsg.DumpSnsListener", "dump %s", str2);
            C86013q1.m106447h(str2 + "sns.dump");
            C86013q1.m106442c(str + "SnsMicroMsg.db", str2 + "sns.dump");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.DumpSnsListener");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.DumpSnsListener");
        return false;
    }
}
