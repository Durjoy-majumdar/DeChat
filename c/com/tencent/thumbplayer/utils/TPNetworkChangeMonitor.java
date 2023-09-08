package com.tencent.thumbplayer.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil;
import java.util.ArrayList;
import java.util.Locale;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;

public class TPNetworkChangeMonitor extends BroadcastReceiver {
    private static final String DETAIL_WIFI_NETTYPE = "wifi";
    public static final int NETSTATUS_INAVAILABLE = 1;
    public static final int NETSTATUS_MOBILE = 3;
    public static final int NETSTATUS_NONE = 0;
    public static final int NETSTATUS_WIFI = 2;
    public static final int NETWORK_SUBTYPE_2G = 2;
    public static final int NETWORK_SUBTYPE_3G = 3;
    public static final int NETWORK_SUBTYPE_4G = 4;
    public static final int NETWORK_SUBTYPE_UNKNOWN = 0;
    public static final int NETWORK_SUBTYPE_WIFI = 1;
    private static final String TAG = "TPNetworkChangeMonitor";
    private static final String UNKNOWN_STR = "unknown";
    private static int lastNetStatus = 0;
    private static String mDetailNetworkType = "unknown";
    private static String mLastDetailNetType;
    private static int mNetStatus;
    private static int mobileNetSubType;
    private ArrayList<OnNetStatusChangeListener> mListeners;
    private HandlerThread mNetworkChangeInformThread;

    public static class InstanceHolder {
        /* access modifiers changed from: private */
        public static TPNetworkChangeMonitor instance = new TPNetworkChangeMonitor();

        private InstanceHolder() {
        }
    }

    public interface OnNetStatusChangeListener {
        void onStatusChanged(int i, int i2, int i3, int i4);
    }

    private void dumpNetworkInfo() {
        TPLogUtil.m21893d(TAG, "-->updateNetStatus(), mNetStatus=" + mNetStatus + "[wifi: " + 2 + ", mobile: " + 3 + "], lastNetStatus=" + lastNetStatus + ", mDetailNetworkType=" + mDetailNetworkType + ", mobileNetSubType=" + mobileNetSubType + "[2G:" + 2 + " 3G:" + 3 + " 4G:" + 4 + "], currentDetailNetType=" + mDetailNetworkType + ", lastDetailNetType=" + mLastDetailNetType);
    }

    public static int getDetailNetSubType() {
        return mobileNetSubType;
    }

    private String getDetailNetworkType(NetworkInfo networkInfo) {
        String str = null;
        String typeName = networkInfo != null ? networkInfo.getTypeName() : null;
        TPLogUtil.m21893d(TAG, "getDetailNetworkType, typeName: " + typeName);
        if (typeName != null) {
            if (typeName.toLowerCase(Locale.getDefault()).equals("wifi")) {
                return "wifi";
            }
            String extraInfo = networkInfo.getExtraInfo();
            if (extraInfo != null) {
                str = extraInfo.toLowerCase(Locale.getDefault());
            }
            String str2 = "ctnet";
            if (str != null) {
                if (str.startsWith("cmwap")) {
                    return "cmwap";
                }
                if (str.startsWith("cmnet") || str.startsWith("epc.tmobile.com")) {
                    return "cmnet";
                }
                if (str.startsWith("uniwap")) {
                    return "uniwap";
                }
                if (str.startsWith("uninet")) {
                    return "uninet";
                }
                if (str.startsWith("wap")) {
                    return "wap";
                }
                if (str.startsWith("net")) {
                    return "net";
                }
                if (str.startsWith("ctwap")) {
                    return "ctwap";
                }
                if (!str.startsWith(str2)) {
                    if (str.startsWith("3gwap")) {
                        return "3gwap";
                    }
                    if (str.startsWith("3gnet")) {
                        return "3gnet";
                    }
                    if (str.startsWith("#777")) {
                        String defaultHost = Proxy.getDefaultHost();
                        if (defaultHost != null && defaultHost.length() > 0) {
                            str2 = "ctwap";
                        }
                    }
                }
                return str2;
            }
        }
        return "unknown";
    }

    public static TPNetworkChangeMonitor getInstance() {
        return InstanceHolder.instance;
    }

    private static int getMobileNetworkSubType(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            switch (networkInfo.getSubtype()) {
                case 0:
                    break;
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return 2;
                case 13:
                    return 4;
                default:
                    return 3;
            }
        }
        return 0;
    }

    public static int getNetworkStatus() {
        return mNetStatus;
    }

    public static String getSimpleNetTypeDesc() {
        if (!TextUtils.isEmpty(mDetailNetworkType)) {
            if (TextUtils.equals(mDetailNetworkType, "wifi")) {
                return "wifi";
            }
            if (!"unknown".equals(mDetailNetworkType)) {
                int i = mobileNetSubType;
                if (i == 2) {
                    return "2G";
                }
                if (i == 3) {
                    return "3G";
                }
                if (i == 4) {
                    return "4G";
                }
            }
        }
        return "unknown";
    }

    private static boolean isMainThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static boolean isMobileNetwork() {
        return mNetStatus == 3;
    }

    public static boolean isNetStatusInited() {
        return mNetStatus != 0;
    }

    private boolean isNetworkActive(NetworkInfo networkInfo) {
        return networkInfo != null && (networkInfo.isConnected() || networkInfo.isConnectedOrConnecting());
    }

    public static boolean isNetworkAvailable() {
        return mNetStatus != 1;
    }

    public static boolean isNetworkNoneStatus(int i) {
        return i == 0;
    }

    private boolean isTheSameNet(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
        return (networkInfo == null || networkInfo2 == null || (networkInfo != networkInfo2 && ((!networkInfo.isConnected() && !networkInfo.isConnectedOrConnecting()) || (!networkInfo2.isConnected() && !networkInfo2.isConnectedOrConnecting())))) ? false : true;
    }

    public static boolean isWifiNetwork() {
        return mNetStatus == 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void notifyIfNetChanged() {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = mNetStatus     // Catch:{ all -> 0x008a }
            int r1 = lastNetStatus     // Catch:{ all -> 0x008a }
            r2 = 0
            if (r0 != r1) goto L_0x0015
            java.lang.String r0 = mDetailNetworkType     // Catch:{ all -> 0x008a }
            java.lang.String r1 = mLastDetailNetType     // Catch:{ all -> 0x008a }
            boolean r0 = android.text.TextUtils.equals(r0, r1)     // Catch:{ all -> 0x008a }
            if (r0 != 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r0 = 0
            goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            java.lang.String r1 = "TPNetworkChangeMonitor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r3.<init>()     // Catch:{ all -> 0x008a }
            java.lang.String r4 = "notifyIfNetChanged, isNetChanged: "
            r3.append(r4)     // Catch:{ all -> 0x008a }
            r3.append(r0)     // Catch:{ all -> 0x008a }
            java.lang.String r4 = ",  mListeners:  "
            r3.append(r4)     // Catch:{ all -> 0x008a }
            java.util.ArrayList<com.tencent.thumbplayer.utils.TPNetworkChangeMonitor$OnNetStatusChangeListener> r4 = r6.mListeners     // Catch:{ all -> 0x008a }
            r3.append(r4)     // Catch:{ all -> 0x008a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x008a }
            com.tencent.thumbplayer.utils.TPLogUtil.m21897i(r1, r3)     // Catch:{ all -> 0x008a }
            java.lang.String r1 = "TPNetworkChangeMonitor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r3.<init>()     // Catch:{ all -> 0x008a }
            java.lang.String r4 = "onNetworkStatusChanged oldNetStatus: "
            r3.append(r4)     // Catch:{ all -> 0x008a }
            int r4 = lastNetStatus     // Catch:{ all -> 0x008a }
            r3.append(r4)     // Catch:{ all -> 0x008a }
            java.lang.String r4 = ", netStatus: "
            r3.append(r4)     // Catch:{ all -> 0x008a }
            int r4 = mNetStatus     // Catch:{ all -> 0x008a }
            r3.append(r4)     // Catch:{ all -> 0x008a }
            java.lang.String r4 = ", mobileNetSubType"
            r3.append(r4)     // Catch:{ all -> 0x008a }
            int r4 = mobileNetSubType     // Catch:{ all -> 0x008a }
            r3.append(r4)     // Catch:{ all -> 0x008a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x008a }
            com.tencent.thumbplayer.utils.TPLogUtil.m21897i(r1, r3)     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x0088
            java.util.ArrayList<com.tencent.thumbplayer.utils.TPNetworkChangeMonitor$OnNetStatusChangeListener> r0 = r6.mListeners     // Catch:{ all -> 0x008a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x008a }
        L_0x006a:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x008a }
            if (r1 == 0) goto L_0x0080
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x008a }
            com.tencent.thumbplayer.utils.TPNetworkChangeMonitor$OnNetStatusChangeListener r1 = (com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.OnNetStatusChangeListener) r1     // Catch:{ all -> 0x008a }
            int r3 = lastNetStatus     // Catch:{ all -> 0x008a }
            int r4 = mNetStatus     // Catch:{ all -> 0x008a }
            int r5 = mobileNetSubType     // Catch:{ all -> 0x008a }
            r1.onStatusChanged(r3, r4, r2, r5)     // Catch:{ all -> 0x008a }
            goto L_0x006a
        L_0x0080:
            int r0 = mNetStatus     // Catch:{ all -> 0x008a }
            lastNetStatus = r0     // Catch:{ all -> 0x008a }
            java.lang.String r0 = mDetailNetworkType     // Catch:{ all -> 0x008a }
            mLastDetailNetType = r0     // Catch:{ all -> 0x008a }
        L_0x0088:
            monitor-exit(r6)
            return
        L_0x008a:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.notifyIfNetChanged():void");
    }

    private synchronized void registerReceiver(Context context, Handler handler) {
        if (context != null) {
            context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), (String) null, handler);
        }
    }

    private synchronized void unregisterReceiver(Context context) {
        if (context != null) {
            try {
                context.unregisterReceiver(this);
            } catch (Exception unused) {
                TPLogUtil.m21894e(TAG, "unregister receiver may throw illegal state exception ...");
            }
        }
        return;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f A[Catch:{ Exception -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005e A[Catch:{ Exception -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a A[Catch:{ Exception -> 0x0076 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateNetStatus(android.content.Context r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x000b
            java.lang.String r0 = "connectivity"
            java.lang.Object r8 = r8.getSystemService(r0)     // Catch:{ Exception -> 0x0076 }
            android.net.ConnectivityManager r8 = (android.net.ConnectivityManager) r8     // Catch:{ Exception -> 0x0076 }
            goto L_0x000c
        L_0x000b:
            r8 = 0
        L_0x000c:
            if (r8 == 0) goto L_0x0076
            r0 = 0
            android.net.NetworkInfo r1 = r8.getNetworkInfo(r0)     // Catch:{ Exception -> 0x0076 }
            r2 = 1
            android.net.NetworkInfo r3 = r8.getNetworkInfo(r2)     // Catch:{ Exception -> 0x0076 }
            android.net.NetworkInfo r8 = r8.getActiveNetworkInfo()     // Catch:{ Exception -> 0x0076 }
            r4 = 2
            r5 = 3
            if (r8 != 0) goto L_0x0036
            boolean r6 = r7.isNetworkActive(r1)     // Catch:{ Exception -> 0x0076 }
            if (r6 == 0) goto L_0x0029
            mNetStatus = r5     // Catch:{ Exception -> 0x0076 }
            goto L_0x004b
        L_0x0029:
            boolean r1 = r7.isNetworkActive(r3)     // Catch:{ Exception -> 0x0076 }
            if (r1 == 0) goto L_0x0033
            mNetStatus = r4     // Catch:{ Exception -> 0x0076 }
            r1 = r3
            goto L_0x004b
        L_0x0033:
            mNetStatus = r2     // Catch:{ Exception -> 0x0076 }
            goto L_0x004a
        L_0x0036:
            boolean r3 = r7.isNetworkActive(r8)     // Catch:{ Exception -> 0x0076 }
            if (r3 == 0) goto L_0x0048
            boolean r1 = r7.isNetworkActive(r1)     // Catch:{ Exception -> 0x0076 }
            if (r1 == 0) goto L_0x0044
            r1 = 3
            goto L_0x0045
        L_0x0044:
            r1 = 2
        L_0x0045:
            mNetStatus = r1     // Catch:{ Exception -> 0x0076 }
            goto L_0x004a
        L_0x0048:
            mNetStatus = r2     // Catch:{ Exception -> 0x0076 }
        L_0x004a:
            r1 = r8
        L_0x004b:
            int r8 = mNetStatus     // Catch:{ Exception -> 0x0076 }
            if (r8 == r2) goto L_0x005e
            if (r8 == r4) goto L_0x005b
            if (r8 == r5) goto L_0x0054
            goto L_0x0060
        L_0x0054:
            int r8 = getMobileNetworkSubType(r1)     // Catch:{ Exception -> 0x0076 }
            mobileNetSubType = r8     // Catch:{ Exception -> 0x0076 }
            goto L_0x0060
        L_0x005b:
            mobileNetSubType = r2     // Catch:{ Exception -> 0x0076 }
            goto L_0x0060
        L_0x005e:
            mobileNetSubType = r0     // Catch:{ Exception -> 0x0076 }
        L_0x0060:
            java.lang.String r8 = r7.getDetailNetworkType(r1)     // Catch:{ Exception -> 0x0076 }
            mDetailNetworkType = r8     // Catch:{ Exception -> 0x0076 }
            int r0 = lastNetStatus     // Catch:{ Exception -> 0x0076 }
            if (r0 != 0) goto L_0x0070
            int r0 = mNetStatus     // Catch:{ Exception -> 0x0076 }
            lastNetStatus = r0     // Catch:{ Exception -> 0x0076 }
            mLastDetailNetType = r8     // Catch:{ Exception -> 0x0076 }
        L_0x0070:
            r7.dumpNetworkInfo()     // Catch:{ Exception -> 0x0076 }
            r7.notifyIfNetChanged()     // Catch:{ Exception -> 0x0076 }
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.updateNetStatus(android.content.Context):void");
    }

    public synchronized void addOnNetStatusChangeListener(OnNetStatusChangeListener onNetStatusChangeListener) {
        ArrayList<OnNetStatusChangeListener> arrayList = this.mListeners;
        if (arrayList != null && !arrayList.contains(onNetStatusChangeListener)) {
            this.mListeners.add(onNetStatusChangeListener);
            TPLogUtil.m21893d(TAG, "add onNetStatus change listener: " + onNetStatusChangeListener + ", mListeners: " + this.mListeners.size());
        }
    }

    public synchronized void init(Context context) {
        TPCommonUtils.requireNotNull(context, "context can not be null!");
        if (this.mNetworkChangeInformThread == null) {
            this.mNetworkChangeInformThread = TPThreadPool.getInstance().obtainShareThread();
        }
        registerReceiver(context, new Handler(this.mNetworkChangeInformThread.getLooper()));
        updateNetStatus(context);
    }

    public boolean isCurrentUnicomWap() {
        return "3gwap".equals(mDetailNetworkType) || "uniwap".equals(mDetailNetworkType);
    }

    public boolean isNonUnicomMobileNetwork() {
        return "cmnet".equals(mDetailNetworkType) || "cmwap".equals(mDetailNetworkType) || "ctnet".equals(mDetailNetworkType) || "ctwap".equals(mDetailNetworkType);
    }

    public boolean isUnicomMobileNetwork() {
        return "3gnet".equals(mDetailNetworkType) || "cmnet".equals(mDetailNetworkType);
    }

    public void onReceive(Context context, Intent intent) {
        StringBuilder sb = new StringBuilder();
        sb.append("onReceive broadcast action and update net status,onReceive broadcast in ");
        sb.append(isMainThread() ? FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT : ScopedStorageUtil.WorkProfiles.PROFILE_WORK);
        sb.append(" thread.");
        TPLogUtil.m21893d(TAG, sb.toString());
        updateNetStatus(context);
    }

    public synchronized void release(Context context) {
        TPCommonUtils.requireNotNull(context, "context can not be null!");
        unregisterReceiver(context);
        TPThreadPool.getInstance().recycle(this.mNetworkChangeInformThread, (Handler) null);
        this.mNetworkChangeInformThread = null;
    }

    public synchronized void removeOnNetStatusChangeListener(OnNetStatusChangeListener onNetStatusChangeListener) {
        ArrayList<OnNetStatusChangeListener> arrayList = this.mListeners;
        if (arrayList != null) {
            arrayList.remove(onNetStatusChangeListener);
            TPLogUtil.m21893d(TAG, "remove netStatusChangeListener, listener: " + onNetStatusChangeListener + ", mListeners: " + this.mListeners.size());
        }
    }

    private TPNetworkChangeMonitor() {
        this.mListeners = null;
        this.mListeners = new ArrayList<>();
    }

    public static String getDetailNetworkType() {
        return mDetailNetworkType;
    }
}
