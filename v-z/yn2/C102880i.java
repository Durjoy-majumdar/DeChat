package yn2;

import com.tencent.p014mm.autogen.events.ExtStartSnsServerAndCallbackOnFpSetSizeEvent;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: yn2.i */
public class C102880i extends IStaticListener<ExtStartSnsServerAndCallbackOnFpSetSizeEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener");
        ExtStartSnsServerAndCallbackOnFpSetSizeEvent extStartSnsServerAndCallbackOnFpSetSizeEvent = (ExtStartSnsServerAndCallbackOnFpSetSizeEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener");
        boolean z = false;
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener", "ExtStartSnsServerAndCallbackOnFpSetSizeEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener");
        } else if (!(extStartSnsServerAndCallbackOnFpSetSizeEvent instanceof ExtStartSnsServerAndCallbackOnFpSetSizeEvent)) {
            Log.m105922f("MicroMsg.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener", "mismatched event");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener");
        } else {
            C5431p1.C5432a dy02 = C94866e1.dy0();
            ExtStartSnsServerAndCallbackOnFpSetSizeEvent.C92504a aVar = extStartSnsServerAndCallbackOnFpSetSizeEvent.f264795d;
            dy02.mo6423t(aVar.f264796a, aVar.f264797b, new C102879h(this, extStartSnsServerAndCallbackOnFpSetSizeEvent));
            ExtStartSnsServerAndCallbackOnFpSetSizeEvent.C92504a aVar2 = extStartSnsServerAndCallbackOnFpSetSizeEvent.f264795d;
            dy02.mo6413d(1, aVar2.f264797b, aVar2.f264798c, aVar2.f264799d, 0);
            z = true;
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener");
        return z;
    }
}
