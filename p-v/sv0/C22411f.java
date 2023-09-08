package sv0;

import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pDeviceList;
import android.net.wifi.p2p.WifiP2pManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: sv0.f */
public final class C22411f implements WifiP2pManager.PeerListListener {

    /* renamed from: a */
    public final /* synthetic */ C22400b f63526a;

    /* renamed from: sv0.f$a */
    public static final class C22412a extends C87413o implements C32227p<String, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C22400b f63527d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22412a(C22400b bVar) {
            super(2);
            this.f63527d = bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            C87412m.m108594g(str2, "wifiDeviceName");
            C22399a aVar = this.f63527d.f63508h;
            if (aVar == null) {
                return null;
            }
            aVar.mo17691a(str, str2);
            return C13598b0.f38549a;
        }
    }

    public C22411f(C22400b bVar) {
        this.f63526a = bVar;
    }

    public final void onPeersAvailable(WifiP2pDeviceList wifiP2pDeviceList) {
        for (WifiP2pDevice next : wifiP2pDeviceList.getDeviceList()) {
            Log.m105925i("MicroMsg.WifiDirectCore", "requestPeers deviceName:%s, wifiDeviceName:%s", next.deviceName, this.f63526a.f63512l);
            if (C87412m.m108589b(next.deviceName, this.f63526a.f63512l)) {
                C22400b bVar = this.f63526a;
                bVar.mo35548a(next, new C22412a(bVar));
            }
            Log.m105924i("MicroMsg.WifiDirectCore", "onPeersAvailable deivce:" + next.deviceName + ' ' + next.deviceAddress + ' ' + next.isGroupOwner() + " :" + next.status);
        }
    }
}
