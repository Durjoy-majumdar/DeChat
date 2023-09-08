package xa1;

import com.tencent.p014mm.autogen.events.ExtConnectWifiEvent;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: xa1.e */
public class C102581e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ExtConnectWifiEvent f302054d;

    public C102581e(C102582f fVar, ExtConnectWifiEvent extConnectWifiEvent) {
        this.f302054d = extConnectWifiEvent;
    }

    public void run() {
        ExtConnectWifiEvent.C92491b bVar;
        Log.m105924i("MicroMsg.ExtControlProviderOpenApi", "connectWifi run");
        ExtConnectWifiEvent extConnectWifiEvent = this.f302054d;
        if (extConnectWifiEvent != null && (bVar = extConnectWifiEvent.f264747e) != null) {
            bVar.getClass();
        }
    }
}
