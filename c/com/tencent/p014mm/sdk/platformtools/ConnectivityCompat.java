package com.tencent.p014mm.sdk.platformtools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Base64;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.tav.core.ExportErrorStatus;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import di3.C7335d;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import z04.C112550d0;
import z04.C112551y;
import z04.C119027c;

@Metadata(mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0005¢\u0006\u0002\u0010\u0002¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat;", "", "()V", "Companion", "MixedSignalStrength", "NetworkCallbackImpl24", "Receiver", "Supervisor", "WiFiInfo", "WiFiScanResult", "libcompatible_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.platformtools.ConnectivityCompat */
public final class ConnectivityCompat {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final int GET_WIFI_SCAN_RESULT_THRESHOLD = 2;
    public static final String INVALID_WIFI_BSSID = "02:00:00:00:00:00";
    public static final String INVALID_WIFI_SSID = "<unknown ssid>";
    public static final String MMKV_CONFIG_NAME = "connectivity_compat";
    public static final String MMKV_KEY_SCAN_RESULT_UPDATE_TIME_STAMP = "wifi_scan_result_update_timestamp";
    public static final String MMKV_KEY_WIFI_BSSID = "connectivity_compat_key_wifi_bssid";
    public static final String MMKV_KEY_WIFI_IPADDR = "connectivity_compat_key_wifi_idaddr";
    public static final String MMKV_KEY_WIFI_LAST_GET_TIME = "connectivity_compat_key_wifi_last_get_time";
    public static final String MMKV_KEY_WIFI_NETWORKID = "connectivity_compat_key_wifi_networkid";
    public static final String MMKV_KEY_WIFI_RSSI = "connectivity_compat_key_wifi_rssi";
    public static final String MMKV_KEY_WIFI_SCAN_RESULTS = "connectivity_compat_key_wifi_scan_results";
    public static final String MMKV_KEY_WIFI_SCAN_THRESHOLD = "connectivity_compat_key_wifi_scan_threshold";
    public static final String MMKV_KEY_WIFI_SSID = "connectivity_compat_key_wifi_ssid";
    public static final String MMKV_KEY_WIFI_TOUCH_TIME = "connectivity_compat_key_wifi_touch_time";
    public static final String MMKV_KEY_WIFI_UPDATE_TIME_STAMP = "wifi_info_update_timestamp";
    private static final long REALTIME_WIFI_INFO_TOUCH_INTERVAL = 60;
    public static final String TAG = "MicroMsg.ConnectivityCompat";
    /* access modifiers changed from: private */
    public static Receiver connectivityReceiver;
    /* access modifiers changed from: private */
    public static final MixedSignalStrength mixedSignalStrength = new MixedSignalStrength();
    /* access modifiers changed from: private */
    public static NetworkCallbackImpl24 networkCallbackImpl24;
    /* access modifiers changed from: private */
    public static PhoneStateListener phoneListener;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bL\u0010MJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0003J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0012J\u0006\u0010\u0017\u001a\u00020\u0016J\u0012\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u0010H\u0007J\u0012\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u0010H\u0007J\u0012\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0010H\u0007J\u0012\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0010H\u0007J\u0012\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u0010H\u0007J\u0006\u0010\u001e\u001a\u00020\u0012J\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u001f\u001a\u00020\u0010J\u0012\u0010#\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u0010H\u0007J\u0012\u0010$\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0010H\u0007J\u0012\u0010%\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0010H\u0007J\b\u0010&\u001a\u00020\u0002H\u0007J\u0006\u0010'\u001a\u00020\u0012R\u0016\u0010+\u001a\u0004\u0018\u00010(8BX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u00101\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b1\u0010/R\u0014\u00102\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b2\u0010/R\u0014\u00103\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b3\u0010/R\u0014\u00104\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b4\u0010/R\u0014\u00105\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b5\u0010/R\u0014\u00106\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b6\u0010/R\u0014\u00107\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b7\u0010/R\u0014\u00108\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b8\u0010/R\u0014\u00109\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b9\u0010/R\u0014\u0010:\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b:\u0010/R\u0014\u0010;\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b;\u0010/R\u0014\u0010<\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b<\u0010/R\u0014\u0010>\u001a\u00020=8\u0002XT¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b@\u0010/R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006N"}, mo182094d2 = {"Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$Companion;", "", "", "ssid", "removeSsidQuote", "", "ipInt", "getIPStrByInt", "Landroid/content/Context;", "gContext", "Landroid/net/wifi/WifiManager;", "wm", "Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$WiFiInfo;", "acquireWiFiInfo27", "acquireWiFiInfo29", "acquireWiFiInfo", "", "touchRealtimeWifiInfo", "Lrx3/b0;", "registerReceiver", "unregisterReceiver", "initSignalStrengthListener", "Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$MixedSignalStrength;", "getSignalStrength", "realtime", "getCompatMixStrength", "getWiFiRssi", "getWiFiSsid", "getWiFiBssid", "getWiFiIpAddress", "startScanWiFi", "onlyFromCache", "", "Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$WiFiScanResult;", "getWiFiScanResults", "getNetworkId", "getFormattedWiFiBssid", "getFormattedWiFiSsid", "getFormattedWiFiSsidFromCache", "clearSensitiveWiFiInfoCache", "Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$Supervisor;", "getSupervisor", "()Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$Supervisor;", "supervisor", "GET_WIFI_SCAN_RESULT_THRESHOLD", "I", "INVALID_WIFI_BSSID", "Ljava/lang/String;", "INVALID_WIFI_SSID", "MMKV_CONFIG_NAME", "MMKV_KEY_SCAN_RESULT_UPDATE_TIME_STAMP", "MMKV_KEY_WIFI_BSSID", "MMKV_KEY_WIFI_IPADDR", "MMKV_KEY_WIFI_LAST_GET_TIME", "MMKV_KEY_WIFI_NETWORKID", "MMKV_KEY_WIFI_RSSI", "MMKV_KEY_WIFI_SCAN_RESULTS", "MMKV_KEY_WIFI_SCAN_THRESHOLD", "MMKV_KEY_WIFI_SSID", "MMKV_KEY_WIFI_TOUCH_TIME", "MMKV_KEY_WIFI_UPDATE_TIME_STAMP", "", "REALTIME_WIFI_INFO_TOUCH_INTERVAL", "J", "TAG", "Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$Receiver;", "connectivityReceiver", "Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$Receiver;", "mixedSignalStrength", "Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$MixedSignalStrength;", "Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$NetworkCallbackImpl24;", "networkCallbackImpl24", "Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$NetworkCallbackImpl24;", "Landroid/telephony/PhoneStateListener;", "phoneListener", "Landroid/telephony/PhoneStateListener;", "<init>", "()V", "libcompatible_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.sdk.platformtools.ConnectivityCompat$Companion */
    public static final class Companion {
        private byte _hellAccFlag_;

        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final WiFiInfo acquireWiFiInfo() {
            WiFiInfo wiFiInfo = new WiFiInfo();
            Context context = MMApplicationContext.getContext();
            Object systemService = MMApplicationContext.getContext().getApplicationContext().getSystemService("wifi");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            if (((WifiManager) systemService).getWifiState() != 3) {
                Log.m105924i(ConnectivityCompat.TAG, "not wifi currently, return empty wifi info");
                return new WiFiInfo();
            }
            Object systemService2 = context.getApplicationContext().getSystemService("wifi");
            C87412m.m108592e(systemService2, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            WifiManager wifiManager = (WifiManager) systemService2;
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                return acquireWiFiInfo29(context, wifiManager);
            }
            if (i >= 27) {
                return acquireWiFiInfo27(context, wifiManager);
            }
            WifiInfo wifiInfo = (WifiInfo) C117292a.m165363i(wifiManager, "com/tencent/mm/sdk/platformtools/ConnectivityCompat$Companion", "acquireWiFiInfo", "()Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$WiFiInfo;", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;");
            if (wifiInfo != null) {
                int rssi = wifiInfo.getRssi();
                String bssid = wifiInfo.getBSSID();
                String ssid = wifiInfo.getSSID();
                C87412m.m108593f(ssid, TPDownloadProxyEnum.USER_SSID);
                wiFiInfo.fill(rssi, bssid, ssid, wifiInfo.getNetworkId(), wifiInfo.getIpAddress());
            }
            return wiFiInfo;
        }

        private final WiFiInfo acquireWiFiInfo27(Context context, WifiManager wifiManager) {
            WifiInfo wifiInfo;
            Context context2 = context;
            WiFiInfo wiFiInfo = new WiFiInfo();
            try {
                if ((context2.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 || context2.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) && (wifiInfo = (WifiInfo) C117292a.m165363i(wifiManager, "com/tencent/mm/sdk/platformtools/ConnectivityCompat$Companion", "acquireWiFiInfo27", "(Landroid/content/Context;Landroid/net/wifi/WifiManager;)Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$WiFiInfo;", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;")) != null) {
                    int rssi = wifiInfo.getRssi();
                    String bssid = wifiInfo.getBSSID();
                    String ssid = wifiInfo.getSSID();
                    C87412m.m108593f(ssid, TPDownloadProxyEnum.USER_SSID);
                    wiFiInfo.fill(rssi, bssid, ssid, wifiInfo.getNetworkId(), wifiInfo.getIpAddress());
                }
                return wiFiInfo;
            } catch (Throwable th) {
                Log.printErrStackTrace(ConnectivityCompat.TAG, th, "get wifi info failed from configurations", new Object[0]);
            }
            return wiFiInfo;
        }

        private final WiFiInfo acquireWiFiInfo29(Context context, WifiManager wifiManager) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
                return acquireWiFiInfo27(context, wifiManager);
            }
            Log.m105920e(ConnectivityCompat.TAG, "acquireWiFiInfo29(): access_fine_location perm not granted.");
            return new WiFiInfo();
        }

        public static /* synthetic */ int getCompatMixStrength$default(Companion companion, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.getCompatMixStrength(z);
        }

        public static /* synthetic */ String getFormattedWiFiBssid$default(Companion companion, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.getFormattedWiFiBssid(z);
        }

        public static /* synthetic */ String getFormattedWiFiSsid$default(Companion companion, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.getFormattedWiFiSsid(z);
        }

        /* access modifiers changed from: private */
        public final String getIPStrByInt(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(i & 255);
            sb.append('.');
            sb.append((i >> 8) & 255);
            sb.append('.');
            sb.append((i >> 16) & 255);
            sb.append('.');
            sb.append((i >> 24) & 255);
            return sb.toString();
        }

        public static /* synthetic */ int getNetworkId$default(Companion companion, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.getNetworkId(z);
        }

        /* access modifiers changed from: private */
        public final Supervisor getSupervisor() {
            Class cls = Supervisor.class;
            if (C86312j.m106916h(cls)) {
                return (Supervisor) C86312j.m106911c(cls);
            }
            return null;
        }

        public static /* synthetic */ String getWiFiBssid$default(Companion companion, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.getWiFiBssid(z);
        }

        public static /* synthetic */ int getWiFiIpAddress$default(Companion companion, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.getWiFiIpAddress(z);
        }

        public static /* synthetic */ int getWiFiRssi$default(Companion companion, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.getWiFiRssi(z);
        }

        public static /* synthetic */ String getWiFiSsid$default(Companion companion, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.getWiFiSsid(z);
        }

        private final String removeSsidQuote(String str) {
            if (Util.isNullOrNil(str) || C87412m.m108589b(str, ConnectivityCompat.INVALID_WIFI_SSID)) {
                return "";
            }
            if (!C112551y.m153819s(str, FastJsonResponse.QUOTE, false) || !C112551y.m153808h(str, FastJsonResponse.QUOTE, false, 2, (Object) null)) {
                return str;
            }
            String substring = str.substring(1, str.length() - 1);
            C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        private final boolean touchRealtimeWifiInfo() {
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV(ConnectivityCompat.MMKV_CONFIG_NAME);
            if (Util.secondsToNow(mmkv.getLong(ConnectivityCompat.MMKV_KEY_WIFI_TOUCH_TIME, -1)) <= 60) {
                return false;
            }
            mmkv.putLong(ConnectivityCompat.MMKV_KEY_WIFI_TOUCH_TIME, Util.nowSecond());
            Companion companion = ConnectivityCompat.Companion;
            WiFiInfo acquireWiFiInfo = companion.acquireWiFiInfo();
            Log.m105924i(ConnectivityCompat.TAG, "updated new wifi info (via touch realtime info): " + acquireWiFiInfo);
            acquireWiFiInfo.saveMMKV();
            if (companion.getSupervisor() != null) {
                Supervisor supervisor = companion.getSupervisor();
                C87412m.m108591d(supervisor);
                supervisor.report(Supervisor.API.GET_CONNECTION_INFO, false, true);
            }
            return true;
        }

        public final void clearSensitiveWiFiInfoCache() {
            MultiProcessMMKV.getMMKV(ConnectivityCompat.MMKV_CONFIG_NAME).putLong(ConnectivityCompat.MMKV_KEY_WIFI_UPDATE_TIME_STAMP, System.currentTimeMillis());
        }

        public final int getCompatMixStrength() {
            return getCompatMixStrength$default(this, false, 1, (Object) null);
        }

        public final synchronized int getCompatMixStrength(boolean z) {
            try {
                if (NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                    return Math.abs(ConnectivityCompat.Companion.getWiFiRssi(z));
                }
                if (ConnectivityCompat.phoneListener == null) {
                    Log.m105920e(ConnectivityCompat.TAG, "getStrength phone Listener has not been inited");
                }
                return Math.abs(ConnectivityCompat.mixedSignalStrength.nowStrength());
            } catch (Exception e) {
                Log.printErrStackTrace(ConnectivityCompat.TAG, e, "", new Object[0]);
                return 0;
            }
        }

        public final String getFormattedWiFiBssid() {
            return getFormattedWiFiBssid$default(this, false, 1, (Object) null);
        }

        public final String getFormattedWiFiBssid(boolean z) {
            String wiFiBssid = getWiFiBssid(z);
            if (C87412m.m108589b(wiFiBssid, ConnectivityCompat.INVALID_WIFI_BSSID)) {
                return "";
            }
            Locale locale = Locale.ENGLISH;
            C87412m.m108593f(locale, "ENGLISH");
            String lowerCase = wiFiBssid.toLowerCase(locale);
            C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }

        public final String getFormattedWiFiSsid() {
            return getFormattedWiFiSsid$default(this, false, 1, (Object) null);
        }

        public final String getFormattedWiFiSsid(boolean z) {
            return removeSsidQuote(getWiFiSsid(z));
        }

        public final String getFormattedWiFiSsidFromCache() {
            String string = MultiProcessMMKV.getMMKV(ConnectivityCompat.MMKV_CONFIG_NAME).getString(ConnectivityCompat.MMKV_KEY_WIFI_SSID, ConnectivityCompat.INVALID_WIFI_SSID);
            C87412m.m108591d(string);
            return removeSsidQuote(string);
        }

        public final int getNetworkId() {
            return getNetworkId$default(this, false, 1, (Object) null);
        }

        public final int getNetworkId(boolean z) {
            int i = MultiProcessMMKV.getMMKV(ConnectivityCompat.MMKV_CONFIG_NAME).getInt(ConnectivityCompat.MMKV_KEY_WIFI_NETWORKID, -1);
            if (!z && getSupervisor() == null) {
                return i;
            }
            int networkId = acquireWiFiInfo().getNetworkId();
            if (getSupervisor() != null) {
                boolean z2 = true;
                if (i != networkId) {
                    Log.m105929w(ConnectivityCompat.TAG, "check_consistence(networkId), cached: %d, realtime: %d", Integer.valueOf(i), Integer.valueOf(networkId));
                } else {
                    Log.m105919d(ConnectivityCompat.TAG, "check_consistence(networkId), cached: %d, realtime: %d", Integer.valueOf(i), Integer.valueOf(networkId));
                }
                Supervisor supervisor = getSupervisor();
                C87412m.m108591d(supervisor);
                Supervisor.API api = Supervisor.API.GET_CONNECTION_INFO;
                if (i == networkId || z) {
                    z2 = false;
                }
                supervisor.report(api, z2, z);
            }
            return z ? networkId : i;
        }

        public final MixedSignalStrength getSignalStrength() {
            return ConnectivityCompat.mixedSignalStrength;
        }

        public final String getWiFiBssid() {
            return getWiFiBssid$default(this, false, 1, (Object) null);
        }

        public final String getWiFiBssid(boolean z) {
            String string = MultiProcessMMKV.getMMKV(ConnectivityCompat.MMKV_CONFIG_NAME).getString(ConnectivityCompat.MMKV_KEY_WIFI_BSSID, ConnectivityCompat.INVALID_WIFI_BSSID);
            C87412m.m108591d(string);
            if (C87412m.m108589b(string, ConnectivityCompat.INVALID_WIFI_BSSID) && touchRealtimeWifiInfo()) {
                string = MultiProcessMMKV.getMMKV(ConnectivityCompat.MMKV_CONFIG_NAME).getString(ConnectivityCompat.MMKV_KEY_WIFI_BSSID, ConnectivityCompat.INVALID_WIFI_BSSID);
                C87412m.m108591d(string);
            }
            if (!z && getSupervisor() == null) {
                return string;
            }
            String bssid = acquireWiFiInfo().getBssid();
            if (getSupervisor() != null) {
                boolean z2 = false;
                if (!C87412m.m108589b(string, bssid)) {
                    Log.m105929w(ConnectivityCompat.TAG, "check_consistence(bssid), cached: %s, realtime: %s, stack: %s", string, bssid, MMStack.getStack(true));
                } else {
                    Log.m105919d(ConnectivityCompat.TAG, "check_consistence(bssid), cached: %s, realtime: %s, stack: %s", string, bssid, MMStack.getStack(true));
                }
                Supervisor supervisor = getSupervisor();
                C87412m.m108591d(supervisor);
                Supervisor.API api = Supervisor.API.GET_CONNECTION_INFO;
                if (!C87412m.m108589b(string, bssid) && !z) {
                    z2 = true;
                }
                supervisor.report(api, z2, z);
            }
            return z ? bssid : string;
        }

        public final int getWiFiIpAddress() {
            return getWiFiIpAddress$default(this, false, 1, (Object) null);
        }

        public final int getWiFiIpAddress(boolean z) {
            boolean z2 = false;
            int i = MultiProcessMMKV.getMMKV(ConnectivityCompat.MMKV_CONFIG_NAME).getInt(ConnectivityCompat.MMKV_KEY_WIFI_IPADDR, 0);
            if (!z && getSupervisor() == null) {
                return i == 0 ? acquireWiFiInfo().getIpaddr() : i;
            }
            int ipaddr = acquireWiFiInfo().getIpaddr();
            if (getSupervisor() != null) {
                if (i != ipaddr) {
                    Log.m105929w(ConnectivityCompat.TAG, "check_consistence(ipaddr), cached: %s, realtime: %s, stack: %s", getIPStrByInt(i), getIPStrByInt(ipaddr), MMStack.getStack(true));
                } else {
                    Log.m105919d(ConnectivityCompat.TAG, "check_consistence(ipaddr), cached: %s, realtime: %s, stack: %s", getIPStrByInt(i), getIPStrByInt(ipaddr), MMStack.getStack(true));
                }
                Supervisor supervisor = getSupervisor();
                C87412m.m108591d(supervisor);
                Supervisor.API api = Supervisor.API.GET_CONNECTION_INFO;
                if (i != ipaddr && !z) {
                    z2 = true;
                }
                supervisor.report(api, z2, z);
            }
            return z ? ipaddr : i;
        }

        public final int getWiFiRssi() {
            return getWiFiRssi$default(this, false, 1, (Object) null);
        }

        public final int getWiFiRssi(boolean z) {
            boolean z2 = false;
            int i = MultiProcessMMKV.getMMKV(ConnectivityCompat.MMKV_CONFIG_NAME).getInt(ConnectivityCompat.MMKV_KEY_WIFI_RSSI, 0);
            if (!z && getSupervisor() == null) {
                return i == 0 ? acquireWiFiInfo().getRssi() : i;
            }
            int rssi = acquireWiFiInfo().getRssi();
            if (getSupervisor() != null) {
                int i2 = i + 8;
                int i3 = i - 8;
                if ((rssi > i2) || (rssi < i3)) {
                    Log.m105928w(ConnectivityCompat.TAG, "check_consistence(rssi), cached: " + i + ", realtime: " + rssi + ", stack: " + MMStack.getStack(true));
                } else {
                    Log.m105918d(ConnectivityCompat.TAG, "check_consistence(rssi), cached: " + i + ", realtime: " + rssi + ", stack: " + MMStack.getStack(true));
                }
                Supervisor supervisor = getSupervisor();
                C87412m.m108591d(supervisor);
                Supervisor.API api = Supervisor.API.GET_CONNECTION_INFO;
                if (((rssi > i2) || (rssi < i3)) && !z) {
                    z2 = true;
                }
                supervisor.report(api, z2, z);
            }
            return z ? rssi : i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
            if (r0 != false) goto L_0x004e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.WiFiScanResult> getWiFiScanResults(boolean r15) {
            /*
                r14 = this;
                r0 = 1
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.MMStack.getStack(r0)
                r3 = 0
                r1[r3] = r2
                java.lang.String r2 = "MicroMsg.ConnectivityCompat"
                java.lang.String r4 = "getWiFiScanResults(), stack: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r4, r1)
                java.lang.String r1 = "connectivity_compat"
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r1)
                java.lang.String r5 = "connectivity_compat_key_wifi_last_get_time"
                r6 = 0
                long r6 = r4.getLong(r5, r6)
                java.lang.String r4 = "connectivity_compat_key_wifi_scan_results"
                if (r15 != 0) goto L_0x00d3
                long r6 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r6)
                r8 = 600(0x258, double:2.964E-321)
                int r15 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r15 <= 0) goto L_0x00d3
                android.content.Context r15 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x00d3 }
                if (r15 == 0) goto L_0x003d
                java.lang.String r6 = "android.permission.ACCESS_FINE_LOCATION"
                int r6 = r15.checkCallingOrSelfPermission(r6)     // Catch:{ Exception -> 0x00d3 }
                if (r6 != 0) goto L_0x003d
                r6 = 1
                goto L_0x003e
            L_0x003d:
                r6 = 0
            L_0x003e:
                if (r6 != 0) goto L_0x004e
                if (r15 == 0) goto L_0x004b
                java.lang.String r6 = "android.permission.ACCESS_COARSE_LOCATION"
                int r15 = r15.checkCallingOrSelfPermission(r6)     // Catch:{ Exception -> 0x00d3 }
                if (r15 != 0) goto L_0x004b
                goto L_0x004c
            L_0x004b:
                r0 = 0
            L_0x004c:
                if (r0 == 0) goto L_0x00d3
            L_0x004e:
                java.lang.String r15 = "real getWiFiScanResults."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r15)     // Catch:{ Exception -> 0x00d3 }
                java.util.LinkedList r15 = new java.util.LinkedList     // Catch:{ Exception -> 0x00d3 }
                r15.<init>()     // Catch:{ Exception -> 0x00d3 }
                java.util.HashSet r0 = new java.util.HashSet     // Catch:{ Exception -> 0x00d3 }
                r0.<init>()     // Catch:{ Exception -> 0x00d3 }
                android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x00d3 }
                android.content.Context r3 = r3.getApplicationContext()     // Catch:{ Exception -> 0x00d3 }
                java.lang.String r6 = "wifi"
                java.lang.Object r3 = r3.getSystemService(r6)     // Catch:{ Exception -> 0x00d3 }
                java.lang.String r6 = "null cannot be cast to non-null type android.net.wifi.WifiManager"
                gy3.C87412m.m108592e(r3, r6)     // Catch:{ Exception -> 0x00d3 }
                r7 = r3
                android.net.wifi.WifiManager r7 = (android.net.wifi.WifiManager) r7     // Catch:{ Exception -> 0x00d3 }
                java.lang.String r8 = "com/tencent/mm/sdk/platformtools/ConnectivityCompat$Companion"
                java.lang.String r9 = "getWiFiScanResults"
                java.lang.String r10 = "(Z)Ljava/util/List;"
                java.lang.String r11 = "android/net/wifi/WifiManager"
                java.lang.String r12 = "getScanResults"
                java.lang.String r13 = "()Ljava/util/List;"
                java.lang.Object r3 = j20.C117292a.m165363i(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00d3 }
                java.util.List r3 = (java.util.List) r3     // Catch:{ Exception -> 0x00d3 }
                if (r3 == 0) goto L_0x00c0
                java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x00d3 }
            L_0x008b:
                boolean r6 = r3.hasNext()     // Catch:{ Exception -> 0x00d3 }
                if (r6 == 0) goto L_0x00c0
                java.lang.Object r6 = r3.next()     // Catch:{ Exception -> 0x00d3 }
                android.net.wifi.ScanResult r6 = (android.net.wifi.ScanResult) r6     // Catch:{ Exception -> 0x00d3 }
                com.tencent.mm.sdk.platformtools.ConnectivityCompat$WiFiScanResult r7 = new com.tencent.mm.sdk.platformtools.ConnectivityCompat$WiFiScanResult     // Catch:{ Exception -> 0x00d3 }
                r7.<init>()     // Catch:{ Exception -> 0x00d3 }
                java.lang.String r8 = r6.SSID     // Catch:{ Exception -> 0x00d3 }
                java.lang.String r9 = "it.SSID"
                gy3.C87412m.m108593f(r8, r9)     // Catch:{ Exception -> 0x00d3 }
                r7.setSsid(r8)     // Catch:{ Exception -> 0x00d3 }
                java.lang.String r8 = r6.BSSID     // Catch:{ Exception -> 0x00d3 }
                java.lang.String r9 = "it.BSSID"
                gy3.C87412m.m108593f(r8, r9)     // Catch:{ Exception -> 0x00d3 }
                r7.setBssid(r8)     // Catch:{ Exception -> 0x00d3 }
                int r6 = r6.level     // Catch:{ Exception -> 0x00d3 }
                r7.setLevel(r6)     // Catch:{ Exception -> 0x00d3 }
                r15.add(r7)     // Catch:{ Exception -> 0x00d3 }
                java.lang.String r6 = r7.toStr()     // Catch:{ Exception -> 0x00d3 }
                r0.add(r6)     // Catch:{ Exception -> 0x00d3 }
                goto L_0x008b
            L_0x00c0:
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r15 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r1)     // Catch:{ Exception -> 0x00d3 }
                r15.putStringSet(r4, r0)     // Catch:{ Exception -> 0x00d3 }
                long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()     // Catch:{ Exception -> 0x00d3 }
                r15.putLong(r5, r6)     // Catch:{ Exception -> 0x00d3 }
                java.lang.String r15 = "get scan results from system api now"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r15)     // Catch:{ Exception -> 0x00d3 }
            L_0x00d3:
                java.util.LinkedList r15 = new java.util.LinkedList
                r15.<init>()
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r1)
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                java.util.Set r0 = r0.getStringSet(r4, r1)
                gy3.C87412m.m108591d(r0)
                java.util.Iterator r0 = r0.iterator()
            L_0x00ec:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x010c
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                com.tencent.mm.sdk.platformtools.ConnectivityCompat$WiFiScanResult r2 = new com.tencent.mm.sdk.platformtools.ConnectivityCompat$WiFiScanResult
                r2.<init>()
                java.lang.String r3 = "it"
                gy3.C87412m.m108593f(r1, r3)
                boolean r1 = r2.fromStr(r1)
                if (r1 == 0) goto L_0x00ec
                r15.add(r2)
                goto L_0x00ec
            L_0x010c:
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion.getWiFiScanResults(boolean):java.util.List");
        }

        public final String getWiFiSsid() {
            return getWiFiSsid$default(this, false, 1, (Object) null);
        }

        public final String getWiFiSsid(boolean z) {
            String string = MultiProcessMMKV.getMMKV(ConnectivityCompat.MMKV_CONFIG_NAME).getString(ConnectivityCompat.MMKV_KEY_WIFI_SSID, ConnectivityCompat.INVALID_WIFI_SSID);
            C87412m.m108591d(string);
            if (C87412m.m108589b(string, ConnectivityCompat.INVALID_WIFI_SSID) && touchRealtimeWifiInfo()) {
                string = MultiProcessMMKV.getMMKV(ConnectivityCompat.MMKV_CONFIG_NAME).getString(ConnectivityCompat.MMKV_KEY_WIFI_SSID, ConnectivityCompat.INVALID_WIFI_SSID);
                C87412m.m108591d(string);
            }
            if (!z && getSupervisor() == null) {
                return string;
            }
            String ssid = acquireWiFiInfo().getSsid();
            if (getSupervisor() != null) {
                boolean z2 = true;
                if (!C87412m.m108589b(string, ssid)) {
                    Log.m105928w(ConnectivityCompat.TAG, "check_consistence(ssid), cached: " + string + ", realtime: " + ssid + ", stack: " + MMStack.getStack(true));
                } else {
                    Log.m105918d(ConnectivityCompat.TAG, "check_consistence(ssid), cached: " + string + ", realtime: " + ssid + ", stack: " + MMStack.getStack(true));
                }
                Supervisor supervisor = getSupervisor();
                C87412m.m108591d(supervisor);
                Supervisor.API api = Supervisor.API.GET_CONNECTION_INFO;
                if (C87412m.m108589b(string, ssid) || z) {
                    z2 = false;
                }
                supervisor.report(api, z2, z);
            }
            return z ? ssid : string;
        }

        public final void initSignalStrengthListener() {
            if (ConnectivityCompat.phoneListener == null) {
                Object systemService = MMApplicationContext.getContext().getSystemService("phone");
                C87412m.m108592e(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                TelephonyManager telephonyManager = (TelephonyManager) systemService;
                ConnectivityCompat.phoneListener = new ConnectivityCompat$Companion$initSignalStrengthListener$1(telephonyManager.getPhoneType());
                PhoneStateListener access$getPhoneListener$cp = ConnectivityCompat.phoneListener;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(256);
                aVar.mo10233c(access$getPhoneListener$cp);
                C117292a.m165358d(telephonyManager, aVar.mo10232b(), "com/tencent/mm/sdk/platformtools/ConnectivityCompat$Companion", "initSignalStrengthListener", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
                telephonyManager.listen((PhoneStateListener) aVar.mo10231a(0), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(telephonyManager, "com/tencent/mm/sdk/platformtools/ConnectivityCompat$Companion", "initSignalStrengthListener", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
            }
        }

        public final void registerReceiver() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                ConnectivityCompat.networkCallbackImpl24 = new NetworkCallbackImpl24();
                Object systemService = MMApplicationContext.getContext().getSystemService("connectivity");
                C87412m.m108592e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                NetworkRequest build = new NetworkRequest.Builder().removeCapability(14).build();
                NetworkCallbackImpl24 access$getNetworkCallbackImpl24$cp = ConnectivityCompat.networkCallbackImpl24;
                C87412m.m108591d(access$getNetworkCallbackImpl24$cp);
                ((ConnectivityManager) systemService).registerNetworkCallback(build, access$getNetworkCallbackImpl24$cp);
            }
            if (ConnectivityCompat.connectivityReceiver == null) {
                ConnectivityCompat.connectivityReceiver = new Receiver();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
                intentFilter.addAction("android.net.wifi.RSSI_CHANGED");
                if (i < 24) {
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                }
                MMApplicationContext.getContext().registerReceiver(ConnectivityCompat.connectivityReceiver, intentFilter);
            } else {
                Log.m105928w(ConnectivityCompat.TAG, "connectivity compat receiver has been registered, check " + MMStack.getCaller());
            }
            WiFiInfo acquireWiFiInfo = acquireWiFiInfo();
            Log.m105925i(ConnectivityCompat.TAG, "initialized new wifi info %s", acquireWiFiInfo.toString());
            acquireWiFiInfo.saveMMKV();
        }

        public final void startScanWiFi() {
            int i = MultiProcessMMKV.getMMKV(ConnectivityCompat.MMKV_CONFIG_NAME).getInt(ConnectivityCompat.MMKV_KEY_WIFI_SCAN_THRESHOLD, 0);
            Log.m105929w(ConnectivityCompat.TAG, "startScanWiFi(), threshold = " + i + "/2, stack: %s", MMStack.getStack(true));
            MultiProcessMMKV.getMMKV(ConnectivityCompat.MMKV_CONFIG_NAME).putInt(ConnectivityCompat.MMKV_KEY_WIFI_SCAN_THRESHOLD, 2);
            Context context = MMApplicationContext.getContext();
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
                Log.m105920e(ConnectivityCompat.TAG, "startScanWiFi(): access_fine_location perm not granted.");
                return;
            }
            Object systemService = context.getApplicationContext().getSystemService("wifi");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            ((Boolean) C117292a.m165363i((WifiManager) systemService, "com/tencent/mm/sdk/platformtools/ConnectivityCompat$Companion", "startScanWiFi", "()V", "android/net/wifi/WifiManager", "startScan", "()Z")).booleanValue();
            Supervisor supervisor = getSupervisor();
            if (supervisor != null) {
                supervisor.report(Supervisor.API.START_SCAN_WIFI, false, true);
            }
        }

        public final void unregisterReceiver() {
            Receiver access$getConnectivityReceiver$cp = ConnectivityCompat.connectivityReceiver;
            if (access$getConnectivityReceiver$cp != null) {
                MMApplicationContext.getContext().unregisterReceiver(access$getConnectivityReceiver$cp);
                Log.m105924i(ConnectivityCompat.TAG, "unregister connectivity receiver");
            }
            if (ConnectivityCompat.networkCallbackImpl24 != null) {
                Object systemService = MMApplicationContext.getContext().getSystemService("connectivity");
                C87412m.m108592e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                NetworkCallbackImpl24 access$getNetworkCallbackImpl24$cp = ConnectivityCompat.networkCallbackImpl24;
                C87412m.m108591d(access$getNetworkCallbackImpl24$cp);
                ((ConnectivityManager) systemService).unregisterNetworkCallback(access$getNetworkCallbackImpl24$cp);
                Log.m105924i(ConnectivityCompat.TAG, "unregister network callback(api >= 24)");
            }
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$MixedSignalStrength;", "", "()V", "cdmaDbm", "", "getCdmaDbm", "()I", "setCdmaDbm", "(I)V", "gsmSignalStrength", "getGsmSignalStrength", "setGsmSignalStrength", "phoneType", "getPhoneType", "setPhoneType", "isGsm", "", "nowStrength", "libcompatible_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.platformtools.ConnectivityCompat$MixedSignalStrength */
    public static final class MixedSignalStrength {
        private int cdmaDbm;
        private int gsmSignalStrength = 99;
        private int phoneType;

        public final int getCdmaDbm() {
            return this.cdmaDbm;
        }

        public final int getGsmSignalStrength() {
            return this.gsmSignalStrength;
        }

        public final int getPhoneType() {
            return this.phoneType;
        }

        public final boolean isGsm() {
            return this.phoneType == 1;
        }

        public final int nowStrength() {
            return Math.abs(isGsm() ? this.cdmaDbm : (this.gsmSignalStrength * 2) + ExportErrorStatus.APPEND_VIDEO_SAMPLE_SWAP_BUFFERS);
        }

        public final void setCdmaDbm(int i) {
            this.cdmaDbm = i;
        }

        public final void setGsmSignalStrength(int i) {
            this.gsmSignalStrength = i;
        }

        public final void setPhoneType(int i) {
            this.phoneType = i;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$NetworkCallbackImpl24;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Lrx3/b0;", "onAvailable", "onLost", "<init>", "()V", "libcompatible_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.sdk.platformtools.ConnectivityCompat$NetworkCallbackImpl24 */
    public static final class NetworkCallbackImpl24 extends ConnectivityManager.NetworkCallback {
        public void onAvailable(Network network) {
            C87412m.m108594g(network, "network");
            Log.m105924i(ConnectivityCompat.TAG, "network available (from network callback)");
            Companion companion = ConnectivityCompat.Companion;
            companion.clearSensitiveWiFiInfoCache();
            WiFiInfo access$acquireWiFiInfo = companion.acquireWiFiInfo();
            Log.m105924i(ConnectivityCompat.TAG, "updated new wifi info (api >= 24): " + access$acquireWiFiInfo);
            access$acquireWiFiInfo.saveMMKV();
            if (companion.getSupervisor() != null) {
                Supervisor access$getSupervisor = companion.getSupervisor();
                C87412m.m108591d(access$getSupervisor);
                access$getSupervisor.report(Supervisor.API.GET_CONNECTION_INFO, false, true);
            }
        }

        public void onLost(Network network) {
            C87412m.m108594g(network, "network");
            Log.m105924i(ConnectivityCompat.TAG, "network lost (from network callback)");
            ConnectivityCompat.Companion.clearSensitiveWiFiInfoCache();
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$Receiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lrx3/b0;", "onReceive", "", "lastSsid", "Ljava/lang/String;", "<init>", "()V", "libcompatible_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.sdk.platformtools.ConnectivityCompat$Receiver */
    public static final class Receiver extends BroadcastReceiver {
        private String lastSsid;

        public void onReceive(Context context, Intent intent) {
            String action = intent != null ? intent.getAction() : null;
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -1172645946) {
                    if (hashCode != -385684331) {
                        if (hashCode == 1878357501 && action.equals("android.net.wifi.SCAN_RESULTS")) {
                            Log.m105924i(ConnectivityCompat.TAG, "scan results available, invalid last get time");
                            MultiProcessMMKV.getMMKV(ConnectivityCompat.MMKV_CONFIG_NAME).putInt(ConnectivityCompat.MMKV_KEY_WIFI_LAST_GET_TIME, 0);
                            MultiProcessMMKV.getMMKV(ConnectivityCompat.MMKV_CONFIG_NAME).putLong(ConnectivityCompat.MMKV_KEY_SCAN_RESULT_UPDATE_TIME_STAMP, System.currentTimeMillis());
                        }
                    } else if (action.equals("android.net.wifi.RSSI_CHANGED")) {
                        int intExtra = intent.getIntExtra("newRssi", 0);
                        Log.m105924i(ConnectivityCompat.TAG, "new rssi available, rssi: " + intExtra);
                        MultiProcessMMKV.getMMKV(ConnectivityCompat.MMKV_CONFIG_NAME).putInt(ConnectivityCompat.MMKV_KEY_WIFI_RSSI, intExtra);
                    }
                } else if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    Log.m105924i(ConnectivityCompat.TAG, "connectivity action updated");
                    Companion companion = ConnectivityCompat.Companion;
                    companion.clearSensitiveWiFiInfoCache();
                    WiFiInfo access$acquireWiFiInfo = companion.acquireWiFiInfo();
                    Log.m105924i(ConnectivityCompat.TAG, "updated new wifi info (api < 24): " + access$acquireWiFiInfo);
                    access$acquireWiFiInfo.saveMMKV();
                    if (companion.getSupervisor() != null) {
                        Supervisor access$getSupervisor = companion.getSupervisor();
                        C87412m.m108591d(access$getSupervisor);
                        access$getSupervisor.report(Supervisor.API.GET_CONNECTION_INFO, false, true);
                    }
                }
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\tJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$Supervisor;", "Ldi3/d;", "Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$Supervisor$API;", "api", "", "diff", "realtime", "Lrx3/b0;", "report", "API", "libcompatible_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.sdk.platformtools.ConnectivityCompat$Supervisor */
    public interface Supervisor extends C7335d {

        @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$Supervisor$API;", "", "text", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getText", "()Ljava/lang/String;", "GET_CONNECTION_INFO", "GET_CONFIGURED_NETWORKS", "GET_SCAN_RESULTS", "START_SCAN_WIFI", "libcompatible_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
        /* renamed from: com.tencent.mm.sdk.platformtools.ConnectivityCompat$Supervisor$API */
        public enum API {
            GET_CONNECTION_INFO("WifiManager#getConnectionInfo"),
            GET_CONFIGURED_NETWORKS("WifiManager#getConfiguredNetworks"),
            GET_SCAN_RESULTS("WifiManager#getScanResults"),
            START_SCAN_WIFI("WifiManager#startScan");
            
            private final String text;

            private API(String str) {
                this.text = str;
            }

            public final String getText() {
                return this.text;
            }
        }

        void report(API api, boolean z, boolean z2);
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\tJ\b\u0010\f\u001a\u00020\u0004H\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\r\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011¨\u0006\u001f"}, mo182094d2 = {"Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$WiFiInfo;", "", "", "rssi", "", "bssid", "ssid", "networkId", "ipaddr", "Lrx3/b0;", "fill", "saveMMKV", "toString", "I", "getRssi", "()I", "setRssi", "(I)V", "Ljava/lang/String;", "getBssid", "()Ljava/lang/String;", "setBssid", "(Ljava/lang/String;)V", "getSsid", "setSsid", "getNetworkId", "setNetworkId", "getIpaddr", "setIpaddr", "<init>", "()V", "libcompatible_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.sdk.platformtools.ConnectivityCompat$WiFiInfo */
    public static final class WiFiInfo {
        private String bssid = ConnectivityCompat.INVALID_WIFI_BSSID;
        private int ipaddr;
        private int networkId;
        private int rssi;
        private String ssid = ConnectivityCompat.INVALID_WIFI_SSID;

        public final void fill(int i, String str, String str2, int i2, int i3) {
            C87412m.m108594g(str2, TPDownloadProxyEnum.USER_SSID);
            this.rssi = i;
            if (str == null) {
                str = ConnectivityCompat.INVALID_WIFI_BSSID;
            }
            this.bssid = str;
            this.ssid = str2;
            this.networkId = i2;
            this.ipaddr = i3;
        }

        public final String getBssid() {
            return this.bssid;
        }

        public final int getIpaddr() {
            return this.ipaddr;
        }

        public final int getNetworkId() {
            return this.networkId;
        }

        public final int getRssi() {
            return this.rssi;
        }

        public final String getSsid() {
            return this.ssid;
        }

        public final void saveMMKV() {
            MultiProcessMMKV.getMMKV(ConnectivityCompat.MMKV_CONFIG_NAME).putInt(ConnectivityCompat.MMKV_KEY_WIFI_RSSI, this.rssi);
            MultiProcessMMKV.getMMKV(ConnectivityCompat.MMKV_CONFIG_NAME).putString(ConnectivityCompat.MMKV_KEY_WIFI_SSID, this.ssid);
            MultiProcessMMKV.getMMKV(ConnectivityCompat.MMKV_CONFIG_NAME).putString(ConnectivityCompat.MMKV_KEY_WIFI_BSSID, this.bssid);
            MultiProcessMMKV.getMMKV(ConnectivityCompat.MMKV_CONFIG_NAME).putInt(ConnectivityCompat.MMKV_KEY_WIFI_NETWORKID, this.networkId);
            MultiProcessMMKV.getMMKV(ConnectivityCompat.MMKV_CONFIG_NAME).putInt(ConnectivityCompat.MMKV_KEY_WIFI_IPADDR, this.ipaddr);
        }

        public final void setBssid(String str) {
            C87412m.m108594g(str, "<set-?>");
            this.bssid = str;
        }

        public final void setIpaddr(int i) {
            this.ipaddr = i;
        }

        public final void setNetworkId(int i) {
            this.networkId = i;
        }

        public final void setRssi(int i) {
            this.rssi = i;
        }

        public final void setSsid(String str) {
            C87412m.m108594g(str, "<set-?>");
            this.ssid = str;
        }

        public String toString() {
            String format = String.format("rssi(%d), bssid(%s), ssid(%s), networkId(%d), ipaddr(%s)", Arrays.copyOf(new Object[]{Integer.valueOf(this.rssi), this.bssid, this.ssid, Integer.valueOf(this.networkId), ConnectivityCompat.Companion.getIPStrByInt(this.ipaddr)}, 5));
            C87412m.m108593f(format, "format(this, *args)");
            return format;
        }
    }

    @Metadata(mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\u0004J\b\u0010\u0016\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$WiFiScanResult;", "", "()V", "bssid", "", "getBssid", "()Ljava/lang/String;", "setBssid", "(Ljava/lang/String;)V", "level", "", "getLevel", "()I", "setLevel", "(I)V", "ssid", "getSsid", "setSsid", "fromStr", "", "str", "toStr", "toString", "libcompatible_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.platformtools.ConnectivityCompat$WiFiScanResult */
    public static final class WiFiScanResult {
        private String bssid = ConnectivityCompat.INVALID_WIFI_BSSID;
        private int level;
        private String ssid = ConnectivityCompat.INVALID_WIFI_SSID;

        public final boolean fromStr(String str) {
            C87412m.m108594g(str, "str");
            try {
                List U = C112550d0.m153785U(str, new String[]{","}, false, 0, 6, (Object) null);
                this.level = Integer.parseInt((String) U.get(0));
                this.bssid = (String) U.get(1);
                byte[] decode = Base64.decode((String) U.get(2), 2);
                C87412m.m108593f(decode, "decode(this[2], Base64.NO_WRAP)");
                this.ssid = new String(decode, C119027c.f356488a);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        public final String getBssid() {
            return this.bssid;
        }

        public final int getLevel() {
            return this.level;
        }

        public final String getSsid() {
            return this.ssid;
        }

        public final void setBssid(String str) {
            C87412m.m108594g(str, "<set-?>");
            this.bssid = str;
        }

        public final void setLevel(int i) {
            this.level = i;
        }

        public final void setSsid(String str) {
            C87412m.m108594g(str, "<set-?>");
            this.ssid = str;
        }

        public final String toStr() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.level);
            sb.append(',');
            sb.append(this.bssid);
            sb.append(',');
            byte[] bytes = this.ssid.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            sb.append(Base64.encodeToString(bytes, 2));
            return sb.toString();
        }

        public String toString() {
            return "ssid(" + this.ssid + "), bssid(" + this.bssid + "), level(" + this.level + ')';
        }
    }
}
