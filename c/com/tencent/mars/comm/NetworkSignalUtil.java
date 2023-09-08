package com.tencent.mars.comm;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;

public class NetworkSignalUtil {
    public static final String TAG = "MicroMsg.NetworkSignalUtil";
    private static final int WIFI_STRENGTH_MAX_LEVEL = 10;

    @Deprecated
    public static void InitNetworkSignalUtil(Context context) {
        ConnectivityCompat.Companion.initSignalStrengthListener();
    }

    private static long calWifiStrengthInNum(int i) {
        int calculateSignalLevel = WifiManager.calculateSignalLevel(i, 10);
        Log.m105926v(TAG, "Wifi Signal:" + calculateSignalLevel);
        return (long) (Math.max(Math.min(calculateSignalLevel, 10), 0) * 10);
    }

    public static long getGSMSignalStrength() {
        ConnectivityCompat.MixedSignalStrength signalStrength = ConnectivityCompat.Companion.getSignalStrength();
        int gsmSignalStrength = signalStrength.isGsm() ? signalStrength.getGsmSignalStrength() : (signalStrength.getCdmaDbm() + 113) / 2;
        if (signalStrength.isGsm() && gsmSignalStrength == 99) {
            return -1;
        }
        long j = (long) (((float) gsmSignalStrength) * 3.2258065f);
        if (j > 100) {
            j = 100;
        }
        if (j < 0) {
            return 0;
        }
        return j;
    }

    public static long getWifiSignalStrength() {
        long calWifiStrengthInNum = calWifiStrengthInNum(ConnectivityCompat.Companion.getWiFiRssi());
        Log.m105918d(TAG, "getWifiSignalStrength " + calWifiStrengthInNum);
        return calWifiStrengthInNum;
    }
}
