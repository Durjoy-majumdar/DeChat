package p180jy;

import com.tencent.p014mm.autogen.events.ResendSnsByUpdateXmlEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f40.C86709a0;
import java.util.ArrayList;

/* renamed from: jy.q1 */
public class C33761q1 extends IStaticListener<ResendSnsByUpdateXmlEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListener");
        ResendSnsByUpdateXmlEvent resendSnsByUpdateXmlEvent = (ResendSnsByUpdateXmlEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListener");
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.ResendSnsByUpdateXmlListener", "ResendSnsByUpdateXmlEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListener");
        } else {
            ResendSnsByUpdateXmlEvent.C28806a aVar = resendSnsByUpdateXmlEvent.f78934d;
            ArrayList arrayList = aVar.f78935a;
            String str = aVar.f78936b;
            Log.m105924i("MicroMsg.ResendSnsByUpdateXmlListener", "ResendSnsByUpdateXmlEvent, try resend sns");
            MMHandlerThread.postToMainThread(new C33757p1(this, arrayList, str));
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListener");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListener");
        return false;
    }
}
