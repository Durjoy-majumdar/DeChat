package org.webrtc;

import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;
import org.webrtc.NetworkMonitorAutoDetect;

public final /* synthetic */ class NetworkMonitorAutoDetect$WifiDirectManagerDelegate$$a implements WifiP2pManager.GroupInfoListener {

    /* renamed from: a */
    public final /* synthetic */ NetworkMonitorAutoDetect.WifiDirectManagerDelegate f352423a;

    public /* synthetic */ NetworkMonitorAutoDetect$WifiDirectManagerDelegate$$a(NetworkMonitorAutoDetect.WifiDirectManagerDelegate wifiDirectManagerDelegate) {
        this.f352423a = wifiDirectManagerDelegate;
    }

    public final void onGroupInfoAvailable(WifiP2pGroup wifiP2pGroup) {
        this.f352423a.lambda$new$0(wifiP2pGroup);
    }
}
