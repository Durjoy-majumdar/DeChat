package com.tencent.mars.ilink.comm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.tencent.mars.ilink.xlog.Log;
import j20.C117292a;
import java.util.List;

public class NetworkSignalUtil {
    private static final String INVALID_WIFI_BSSID = "02:00:00:00:00:00";
    private static final String INVALID_WIFI_SSID = "<unknown ssid>";
    private static final String TAG = "MicroMsg.NetworkSignalUtil";
    private static Receiver connectivereceiver = null;
    private static Context context = null;
    /* access modifiers changed from: private */
    public static MarsWifiInfo curwifiinfo = new MarsWifiInfo();
    private static boolean isinited = false;
    private static NetworkCallbackImpl24 netcallback = null;
    private static long strength = 10000;

    public static class MarsWifiInfo {
        public String bssid = "02:00:00:00:00:00";
        public int ipaddr = 0;
        public int networkId = 0;
        private int rssi = 0;
        public int sig = 0;
        public String ssid = "<unknown ssid>";

        public void fill(int i, String str, String str2, int i2, int i3) {
            this.rssi = i;
            this.bssid = str;
            this.ssid = str2;
            this.networkId = i2;
            this.ipaddr = i3;
            int calculateSignalLevel = WifiManager.calculateSignalLevel(i, 10);
            if (calculateSignalLevel > 10) {
                calculateSignalLevel = 10;
            }
            if (calculateSignalLevel < 0) {
                calculateSignalLevel = 0;
            }
            this.sig = calculateSignalLevel * 10;
        }

        public void reset() {
            this.ssid = "<unknown ssid>";
            this.bssid = "02:00:00:00:00:00";
            this.rssi = 0;
            this.networkId = 0;
            this.ipaddr = 0;
            this.sig = 0;
        }

        public void updateRssi(int i) {
            this.rssi = i;
            int calculateSignalLevel = WifiManager.calculateSignalLevel(i, 10);
            if (calculateSignalLevel > 10) {
                calculateSignalLevel = 10;
            }
            if (calculateSignalLevel < 0) {
                calculateSignalLevel = 0;
            }
            this.sig = calculateSignalLevel * 10;
        }
    }

    public static class NetworkCallbackImpl24 extends ConnectivityManager.NetworkCallback {
        private NetworkCallbackImpl24() {
        }

        public void onAvailable(Network network) {
            Log.m160928i("MicroMsg.NetworkSignalUtil", "network available (from network callback)");
            NetworkSignalUtil.updateWiFiInfo();
        }
    }

    public static class Receiver extends BroadcastReceiver {
        private Receiver() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            action.getClass();
            char c = 65535;
            switch (action.hashCode()) {
                case -1172645946:
                    if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                        c = 0;
                        break;
                    }
                    break;
                case -385684331:
                    if (action.equals("android.net.wifi.RSSI_CHANGED")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1878357501:
                    if (action.equals("android.net.wifi.SCAN_RESULTS")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    Log.m160922d("MicroMsg.NetworkSignalUtil", "ConnectivityManager.CONNECTIVITY_ACTION going to update wifiinfo");
                    NetworkSignalUtil.updateWiFiInfo();
                    return;
                case 1:
                    Log.m160922d("MicroMsg.NetworkSignalUtil", "WifiManager.RSSI_CHANGED_ACTION");
                    NetworkSignalUtil.curwifiinfo.updateRssi(intent.getIntExtra("newRssi", 0));
                    return;
                case 2:
                    Log.m160922d("MicroMsg.NetworkSignalUtil", "WifiManager.SCAN_RESULTS_AVAILABLE_ACTION");
                    return;
                default:
                    return;
            }
        }
    }

    public static void InitNetworkSignalUtil(Context context2) {
        if (!isinited) {
            context = context2;
            if (Build.VERSION.SDK_INT >= 24) {
                NetworkRequest.Builder builder = new NetworkRequest.Builder();
                builder.addTransportType(0);
                builder.addTransportType(1);
                netcallback = new NetworkCallbackImpl24();
                try {
                    ((ConnectivityManager) context.getSystemService("connectivity")).registerNetworkCallback(builder.build(), netcallback);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.NetworkSignalUtil", e, "registerNetworkCallback exception", new Object[0]);
                }
            }
            connectivereceiver = new Receiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            intentFilter.addAction("android.net.wifi.RSSI_CHANGED");
            if (Build.VERSION.SDK_INT < 24) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            context.registerReceiver(connectivereceiver, intentFilter);
            updateWiFiInfo();
            isinited = true;
        }
    }

    public static String getBSSID() {
        return curwifiinfo.bssid;
    }

    public static long getGSMSignalStrength() {
        return strength;
    }

    public static long getNetworkSignalStrength(boolean z) {
        return 0;
    }

    public static String getSSID() {
        return curwifiinfo.ssid;
    }

    public static long getWifiSignalStrength() {
        return (long) curwifiinfo.sig;
    }

    /* access modifiers changed from: private */
    public static void updateWiFiInfo() {
        Log.m160922d("MicroMsg.NetworkSignalUtil", "update wifiinfo!");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            curwifiinfo.reset();
        } else if (activeNetworkInfo.getType() != 1) {
            curwifiinfo.reset();
        } else {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager == null) {
                curwifiinfo.reset();
                return;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 29 && context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
                Log.m160924e("MicroMsg.NetworkSignalUtil", "access_fine_location perm not granted.");
            } else if (i >= 27) {
                try {
                    if (context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 || context.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        WifiInfo wifiInfo = (WifiInfo) C117292a.m165363i(wifiManager, "com/tencent/mars/ilink/comm/NetworkSignalUtil", "updateWiFiInfo", "()V", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;");
                        curwifiinfo.fill(wifiInfo.getRssi(), wifiInfo.getBSSID(), wifiInfo.getSSID(), wifiInfo.getNetworkId(), wifiInfo.getIpAddress());
                        return;
                    }
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.NetworkSignalUtil", th, "get wifi info failed directly", new Object[0]);
                }
                try {
                    WifiInfo wifiInfo2 = (WifiInfo) C117292a.m165363i(wifiManager, "com/tencent/mars/ilink/comm/NetworkSignalUtil", "updateWiFiInfo", "()V", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;");
                    for (WifiConfiguration wifiConfiguration : (List) C117292a.m165363i(wifiManager, "com/tencent/mars/ilink/comm/NetworkSignalUtil", "updateWiFiInfo", "()V", "android/net/wifi/WifiManager", "getConfiguredNetworks", "()Ljava/util/List;")) {
                        if (wifiConfiguration.networkId == wifiInfo2.getNetworkId()) {
                            curwifiinfo.fill(wifiInfo2.getRssi(), wifiInfo2.getBSSID(), wifiInfo2.getSSID(), wifiInfo2.getNetworkId(), wifiInfo2.getIpAddress());
                            return;
                        }
                    }
                } catch (Throwable th4) {
                    Log.printErrStackTrace("MicroMsg.NetworkSignalUtil", th4, "get wifi info failed from configurations", new Object[0]);
                }
            } else {
                WifiInfo wifiInfo3 = (WifiInfo) C117292a.m165363i(wifiManager, "com/tencent/mars/ilink/comm/NetworkSignalUtil", "updateWiFiInfo", "()V", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;");
                if (wifiInfo3 != null) {
                    curwifiinfo.fill(wifiInfo3.getRssi(), wifiInfo3.getBSSID(), wifiInfo3.getSSID(), wifiInfo3.getNetworkId(), wifiInfo3.getIpAddress());
                }
            }
        }
    }
}
