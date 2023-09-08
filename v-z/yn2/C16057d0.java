package yn2;

import com.tencent.p014mm.autogen.events.GetSnsTagListEvent;
import com.tencent.p014mm.plugin.sns.model.C43039l0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: yn2.d0 */
public class C16057d0 extends IStaticListener<GetSnsTagListEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTagListListener");
        GetSnsTagListEvent getSnsTagListEvent = (GetSnsTagListEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTagListListener");
        boolean z = false;
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.GetSnsTagListListener", "GetSnsTagListEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTagListListener");
        } else if (!(getSnsTagListEvent instanceof GetSnsTagListEvent)) {
            Log.m105922f("MicroMsg.GetSnsTagListListener", "mismatched event");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTagListListener");
        } else {
            z = true;
            if (getSnsTagListEvent.f9308d.f9309a == 0) {
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(new C43039l0(1));
            } else {
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(new C43039l0(getSnsTagListEvent.f9308d.f9309a));
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTagListListener");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTagListListener");
        return z;
    }
}
