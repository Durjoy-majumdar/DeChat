package xa1;

import com.tencent.p014mm.autogen.events.ExtGetWifiListEvent;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: xa1.c */
public class C102579c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ExtGetWifiListEvent f302052d;

    public C102579c(C102580d dVar, ExtGetWifiListEvent extGetWifiListEvent) {
        this.f302052d = extGetWifiListEvent;
    }

    public void run() {
        ExtGetWifiListEvent.C92497b bVar;
        Log.m105924i("MicroMsg.ExtControlProviderOpenApi", "getWifiList run");
        ExtGetWifiListEvent extGetWifiListEvent = this.f302052d;
        if (extGetWifiListEvent != null && (bVar = extGetWifiListEvent.f264770e) != null) {
            bVar.getClass();
        }
    }
}
