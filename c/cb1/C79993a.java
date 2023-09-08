package cb1;

import com.tencent.p014mm.autogen.events.ExtCallEvent;
import com.tencent.p014mm.plugin.extqlauncher.provider.ExtControlProviderQLauncher;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: cb1.a */
public class C79993a extends IStaticListener<ExtCallEvent> {
    public boolean callback(IEvent iEvent) {
        ExtCallEvent extCallEvent = (ExtCallEvent) iEvent;
        if (!(extCallEvent instanceof ExtCallEvent)) {
            Log.m105922f("MicroMsg.ExtCallEventListener", "mismatched event");
            return false;
        }
        ExtCallEvent.C80716a aVar = extCallEvent.f236189d;
        ExtControlProviderQLauncher extControlProviderQLauncher = new ExtControlProviderQLauncher(aVar.f236193c, aVar.f236191a, aVar.f236192b);
        ExtCallEvent.C80717b bVar = extCallEvent.f236190e;
        ExtCallEvent.C80716a aVar2 = extCallEvent.f236189d;
        bVar.f236196a = extControlProviderQLauncher.query(aVar2.f236194d, (String[]) null, (String) null, aVar2.f236195e, (String) null);
        return true;
    }
}
