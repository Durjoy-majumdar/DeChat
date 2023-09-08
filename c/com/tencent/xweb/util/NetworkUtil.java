package com.tencent.xweb.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import org.xwalk.core.XWalkEnvironment;

public class NetworkUtil {
    private static final int NON_NETWORK = 0;
    private static final int OTHER = 4;
    private static final String TAG = "NetworkUtil";
    private static final int WIFI = 1;
    private static final int _3G = 2;
    private static final int _4G = 3;

    public static int getCurrentNetWorkStatus(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return 0;
        }
        if (activeNetworkInfo.getType() == 1) {
            return 1;
        }
        if (activeNetworkInfo.getSubtype() >= 13) {
            return 3;
        }
        return (activeNetworkInfo.getSubtype() < 5 || activeNetworkInfo.getSubtype() >= 13) ? 4 : 2;
    }

    public static boolean isNetworkAvailable() {
        if (getCurrentNetWorkStatus(XWalkEnvironment.getApplicationContext()) != 0) {
            return true;
        }
        XWebLog.m21913w(TAG, "no network");
        return false;
    }

    public static boolean isWifiAvailable() {
        return getCurrentNetWorkStatus(XWalkEnvironment.getApplicationContext()) == 1;
    }
}
