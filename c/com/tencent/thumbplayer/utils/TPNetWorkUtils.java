package com.tencent.thumbplayer.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseIntArray;

public class TPNetWorkUtils {
    public static final int NETWORK_CLASS_2_G = 1;
    public static final int NETWORK_CLASS_3_G = 2;
    public static final int NETWORK_CLASS_4_G = 3;
    public static final int NETWORK_CLASS_5_G = 4;
    public static final int NETWORK_CLASS_UNKNOWN = -1;
    public static final int NETWORK_CLASS_WIFI = 0;
    private static final String TAG = "TPNetWorkUtils";
    private static int isNetworkAvailable = -1;
    private static boolean isNetworkChange = false;
    private static String mAppPackageName = null;
    private static int mNetWorkClass = -1;
    private static final SparseIntArray mNetworkTypeArray;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        mNetworkTypeArray = sparseIntArray;
        sparseIntArray.put(1, 1);
        sparseIntArray.put(2, 1);
        sparseIntArray.put(4, 1);
        sparseIntArray.put(7, 1);
        sparseIntArray.put(11, 1);
        sparseIntArray.put(3, 2);
        sparseIntArray.put(5, 2);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(8, 2);
        sparseIntArray.put(9, 2);
        sparseIntArray.put(10, 2);
        sparseIntArray.put(12, 2);
        sparseIntArray.put(14, 2);
        sparseIntArray.put(15, 2);
        sparseIntArray.put(13, 3);
    }

    private static boolean checkPermission(Context context, String str) {
        boolean z = true;
        if (!hasMarshmallow()) {
            return true;
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if ("android.permission.WRITE_SETTINGS".equals(str)) {
            return Settings.System.canWrite(context);
        }
        try {
            if (context.checkSelfPermission(str) != 0) {
                z = false;
            }
            return z;
        } catch (Exception e) {
            TPLogUtil.m21894e(TAG, e.getMessage());
            return false;
        }
    }

    private static int get5GNetworkTypeIfNeed(Context context) {
        int i = 0;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                TPLogUtil.m21894e(TAG, "get5GNetworkTypeIfNeed TelephonyManager is null");
                return 0;
            } else if (context.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
                TPLogUtil.m21894e(TAG, "get5GNetworkTypeIfNeed no permission");
                return 0;
            } else if (Build.VERSION.SDK_INT < 29) {
                TPLogUtil.m21894e(TAG, "get5GNetworkTypeIfNeed less api 29");
                return 0;
            } else {
                int networkType = telephonyManager.getNetworkType();
                if (networkType != 13) {
                    try {
                        TPLogUtil.m21897i(TAG, "get5GNetworkTypeIfNeed not NETWORK_TYPE_LTE");
                        return networkType;
                    } catch (Throwable th) {
                        Throwable th4 = th;
                        i = networkType;
                        th = th4;
                        TPLogUtil.m21894e(TAG, th.getMessage());
                        return i;
                    }
                } else {
                    ServiceState serviceState = telephonyManager.getServiceState();
                    if (serviceState == null) {
                        TPLogUtil.m21894e(TAG, "get5GNetworkTypeIfNeed serviceState is null");
                        return networkType;
                    }
                    int intValue = ((Integer) TPPrimaryReflectUtil.invokeMethod(serviceState, "android.telephony.ServiceState", "getNrState", new Class[0], new Object[0])).intValue();
                    if (intValue != 2 && intValue != 3) {
                        return networkType;
                    }
                    i = 20;
                    TPLogUtil.m21897i(TAG, "get5GNetworkTypeIfNeed networkType is 20, 5G");
                    return 20;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            TPLogUtil.m21894e(TAG, th.getMessage());
            return i;
        }
    }

    private static int getActualNetWorkClass(Context context, int i) {
        return Build.VERSION.SDK_INT >= 29 ? getNetWorkClassAPI29(context) : getNetWorkClassByType(context, i);
    }

    private static ConnectivityManager getConnectivityManager(Context context) {
        if (context == null) {
            return null;
        }
        return (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
    }

    public static int getNetWorkClass(Context context) {
        int i = mNetWorkClass;
        if (i > 0 && !isNetworkChange) {
            return i;
        }
        if (context == null) {
            return -1;
        }
        int netWorkClassByContext = getNetWorkClassByContext(context);
        mNetWorkClass = netWorkClassByContext;
        return netWorkClassByContext;
    }

    private static int getNetWorkClassAPI29(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                return getNetWorkClassByType(context, telephonyManager.getDataNetworkType());
            }
            TPLogUtil.m21894e(TAG, "getNetWorkClassAPI29 fail: no phone permission");
            return -1;
        } catch (Throwable th) {
            TPLogUtil.m21894e(TAG, th.getMessage());
            return -1;
        }
    }

    private static int getNetWorkClassByContext(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
                return -1;
            }
            int type = activeNetworkInfo.getType();
            return type != 0 ? type != 1 ? -1 : 0 : getActualNetWorkClass(context, activeNetworkInfo.getSubtype());
        } catch (Throwable th) {
            TPLogUtil.m21894e(TAG, th.getMessage());
            return -1;
        }
    }

    private static int getNetWorkClassByType(Context context, int i) {
        if (get5GNetworkTypeIfNeed(context) == 20) {
            TPLogUtil.m21897i(TAG, "get5GNetworkTypeIfNeed netWorkType==4");
            return 4;
        }
        Integer valueOf = Integer.valueOf(mNetworkTypeArray.get(i));
        if (valueOf == null) {
            return -1;
        }
        return valueOf.intValue();
    }

    private static NetworkInfo getNetworkInfo(Context context) {
        ConnectivityManager connectivityManager = getConnectivityManager(context);
        if (connectivityManager == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    private static boolean hasMarshmallow() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean isNetworkAvailable(Context context) {
        int i = isNetworkAvailable;
        if (i != -1 && !isNetworkChange) {
            return i == 1;
        }
        if (context != null) {
            try {
                NetworkInfo networkInfo = getNetworkInfo(context);
                isNetworkAvailable = 0;
                if (networkInfo != null && networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    isNetworkAvailable = 1;
                }
            } catch (Exception e) {
                TPLogUtil.m21894e(TAG, e.getMessage());
            }
        }
        return isNetworkAvailable == 1;
    }

    public static void onNetworkChange(Context context) {
        isNetworkChange = true;
        isNetworkAvailable(context);
        getNetWorkClass(context);
        isNetworkChange = false;
    }
}
