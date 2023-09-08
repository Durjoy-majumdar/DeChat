package p670qx;

import com.tencent.p014mm.autogen.events.KindaNotifyEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import java.util.HashMap;
import p655px.C35707c;
import zt3.C119157j;

/* renamed from: qx.r */
public class C36165r extends IStaticListener<KindaNotifyEvent> {
    public boolean callback(IEvent iEvent) {
        KindaNotifyEvent.C28768a aVar;
        HashMap hashMap;
        String str;
        KindaNotifyEvent kindaNotifyEvent = (KindaNotifyEvent) iEvent;
        if (kindaNotifyEvent == null || (aVar = kindaNotifyEvent.f78850d) == null || (hashMap = aVar.f78852b) == null || hashMap.get("url") == null || !(hashMap.get("url") instanceof String) || (str = (String) hashMap.get("url")) == null) {
            return false;
        }
        if (!str.equalsIgnoreCase("floatPay") && !str.equalsIgnoreCase("jointPay")) {
            return false;
        }
        ((C119157j) C119157j.f356862d).mo183876g(new C35707c(), "SIRWorker");
        return false;
    }
}
