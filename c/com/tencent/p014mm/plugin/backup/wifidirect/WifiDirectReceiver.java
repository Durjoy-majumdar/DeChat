package com.tencent.p014mm.plugin.backup.wifidirect;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pInfo;
import android.net.wifi.p2p.WifiP2pManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.net.InetAddress;
import kotlin.Metadata;
import p385u2.C111105a;
import sv0.C22399a;
import sv0.C22400b;
import sv0.C22411f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/backup/wifidirect/WifiDirectReceiver;", "Landroid/content/BroadcastReceiver;", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.backup.wifidirect.WifiDirectReceiver */
public final class WifiDirectReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public final C22400b f50141a;

    /* renamed from: b */
    public final WifiP2pManager f50142b;

    /* renamed from: c */
    public final WifiP2pManager.Channel f50143c;

    /* renamed from: d */
    public String f50144d = "";

    /* renamed from: com.tencent.mm.plugin.backup.wifidirect.WifiDirectReceiver$a */
    public static final class C18150a implements WifiP2pManager.ConnectionInfoListener {

        /* renamed from: a */
        public final /* synthetic */ WifiDirectReceiver f50145a;

        public C18150a(WifiDirectReceiver wifiDirectReceiver) {
            this.f50145a = wifiDirectReceiver;
        }

        public final void onConnectionInfoAvailable(WifiP2pInfo wifiP2pInfo) {
            InetAddress inetAddress;
            String hostAddress;
            WifiDirectReceiver wifiDirectReceiver = this.f50145a;
            C22400b bVar = wifiDirectReceiver.f50141a;
            String str = wifiDirectReceiver.f50144d;
            bVar.getClass();
            C87412m.m108594g(str, "wifiDeviceName");
            if (!(wifiP2pInfo == null || (inetAddress = wifiP2pInfo.groupOwnerAddress) == null || (hostAddress = inetAddress.getHostAddress()) == null || C87412m.m108589b(hostAddress, bVar.f63511k))) {
                bVar.f63511k = hostAddress;
                C22399a aVar = bVar.f63508h;
                if (aVar != null) {
                    aVar.mo17691a(hostAddress, str);
                }
            }
            Log.m105924i("MicroMsg.WifiDirectReceiver", "p2p onConnectionInfoAvailable:" + wifiP2pInfo);
        }
    }

    public WifiDirectReceiver(C22400b bVar, WifiP2pManager wifiP2pManager, WifiP2pManager.Channel channel) {
        C87412m.m108594g(bVar, "wifiDirectCore");
        C87412m.m108594g(channel, "channel");
        this.f50141a = bVar;
        this.f50142b = wifiP2pManager;
        this.f50143c = channel;
    }

    public void onReceive(Context context, Intent intent) {
        WifiP2pDevice wifiP2pDevice;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        String action = intent.getAction();
        Log.m105924i("MicroMsg.WifiDirectReceiver", "p2p action: " + action);
        if (action != null) {
            boolean z = true;
            boolean z2 = false;
            switch (action.hashCode()) {
                case -1772632330:
                    if (action.equals("android.net.wifi.p2p.CONNECTION_STATE_CHANGE") && this.f50142b != null) {
                        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                        C87412m.m108591d(networkInfo);
                        if (networkInfo.isConnected()) {
                            this.f50142b.requestConnectionInfo(this.f50143c, new C18150a(this));
                            return;
                        }
                        Log.m105925i("MicroMsg.WifiDirectReceiver", "p2p networkInfo disconnect:%s", networkInfo.getReason());
                        return;
                    }
                    return;
                case -1566767901:
                    if (action.equals("android.net.wifi.p2p.THIS_DEVICE_CHANGED") && (wifiP2pDevice = (WifiP2pDevice) intent.getParcelableExtra("wifiP2pDevice")) != null) {
                        String str = wifiP2pDevice.deviceName;
                        C87412m.m108593f(str, "device.deviceName");
                        this.f50144d = str;
                        Log.m105925i("MicroMsg.WifiDirectReceiver", "p2p deivceName:%s, deviceAddress:%s, isGroupOwner:%b, status:%d ", wifiP2pDevice.deviceName, wifiP2pDevice.deviceAddress, Boolean.valueOf(wifiP2pDevice.isGroupOwner()), Integer.valueOf(wifiP2pDevice.status));
                        return;
                    }
                    return;
                case -1394739139:
                    if (action.equals("android.net.wifi.p2p.PEERS_CHANGED") && this.f50142b != null) {
                        C22400b bVar = this.f50141a;
                        Context context2 = bVar.f63501a;
                        C87412m.m108594g(context2, "context");
                        if (C111105a.m151499a(context2, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                            z = false;
                        }
                        if (z) {
                            bVar.f63503c.requestPeers(bVar.f63504d, new C22411f(bVar));
                            return;
                        }
                        return;
                    }
                    return;
                case 1695662461:
                    if (action.equals("android.net.wifi.p2p.STATE_CHANGED")) {
                        int intExtra = intent.getIntExtra("wifi_p2p_state", -1);
                        Object[] objArr = new Object[2];
                        objArr[0] = Integer.valueOf(intExtra);
                        if (intExtra == 2) {
                            z2 = true;
                        }
                        objArr[1] = Boolean.valueOf(z2);
                        Log.m105925i("MicroMsg.WifiDirectReceiver", "p2p state: %s, enable:%b", objArr);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
