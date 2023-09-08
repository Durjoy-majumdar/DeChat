package com.tencent.qqvideo.proxy.httpproxy;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.tencent.qqvideo.proxy.api.IUtils;
import com.tencent.qqvideo.proxy.common.ConfigStorage;
import com.tencent.qqvideo.proxy.common.VcSystemInfo;
import j20.C117292a;
import org.json.JSONObject;

public class HttpproxyFacade {
    private static String TAG = "TV_Httpproxy";
    private static final String dev_type = "2";
    private static Context mContext;
    private static HttpproxyFacade mInstance;
    private static boolean mbHttpProxyExist;
    private IUtils mUtils = null;

    private HttpproxyFacade() {
    }

    public static void idKeyReport(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                HttpproxyFacade instance = instance();
                if (instance.mUtils != null) {
                    instance.mUtils.idKeyReport(str, str2, str3);
                }
            }
        } catch (Throwable unused) {
            print(6, TAG, "idKeyReport exception");
        }
    }

    public static synchronized HttpproxyFacade instance() {
        HttpproxyFacade httpproxyFacade;
        synchronized (HttpproxyFacade.class) {
            if (mInstance == null) {
                mInstance = new HttpproxyFacade();
            }
            httpproxyFacade = mInstance;
        }
        return httpproxyFacade;
    }

    public static boolean isLoadSuccess() {
        return mbHttpProxyExist;
    }

    public static synchronized void javaUtilLog(String str) {
        synchronized (HttpproxyFacade.class) {
            IUtils iUtils = instance().mUtils;
            if (iUtils != null) {
                iUtils.javaUtilLog(4, TAG, str);
            }
        }
    }

    public static void jsonReport(String str) {
        try {
            String deviceID = VcSystemInfo.getDeviceID(mContext);
            String osVersion = VcSystemInfo.getOsVersion();
            int netWorkType = VcSystemInfo.getNetWorkType(mContext);
            String str2 = "";
            WifiInfo wifiInfo = (WifiInfo) C117292a.m165363i((WifiManager) mContext.getSystemService("wifi"), "com/tencent/qqvideo/proxy/httpproxy/HttpproxyFacade", "jsonReport", "(Ljava/lang/String;)V", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;");
            if (wifiInfo.getBSSID() != null) {
                str2 = String.valueOf(WifiManager.calculateSignalLevel(wifiInfo.getRssi(), 5));
            }
            String httpProxyVersion = ConfigStorage.getHttpProxyVersion();
            String configVersion = ConfigStorage.getConfigVersion();
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put("dev_id", deviceID);
            jSONObject.put("dev_type", "2");
            jSONObject.put("os_ver", osVersion);
            jSONObject.put("net_type", netWorkType);
            jSONObject.put("net_stren", str2);
            jSONObject.put("config_ver", configVersion);
            jSONObject.put("proxy_ver", httpProxyVersion);
            String replace = jSONObject.toString().replace(",", ";");
            if (!TextUtils.isEmpty(replace)) {
                HttpproxyFacade instance = instance();
                if (instance.mUtils != null) {
                    int i = 2000;
                    if (replace.length() <= 1000) {
                        instance.mUtils.httpproxyReport(replace);
                        return;
                    }
                    int length = replace.length();
                    if (length <= 2000) {
                        i = length;
                    }
                    String substring = replace.substring(0, 1000);
                    String substring2 = replace.substring(1000, i);
                    instance.mUtils.httpproxyReport(substring, substring2);
                }
            }
        } catch (Throwable unused) {
            print(6, TAG, "reportMTA exception");
        }
    }

    public static void kvReport(String str) {
        try {
            String httpProxyVersionCode = ConfigStorage.getHttpProxyVersionCode();
            String configVersion = ConfigStorage.getConfigVersion();
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("DownloadResult");
            String optString2 = jSONObject.optString("OptimalCDN");
            String optString3 = jSONObject.optString("VideoRate");
            String optString4 = jSONObject.optString("VideoTotalFileLength");
            String optString5 = jSONObject.optString("VideoContentLength");
            String optString6 = jSONObject.optString("DownloadTotalFlow");
            String optString7 = jSONObject.optString("DownloadCostTime");
            String optString8 = jSONObject.optString("DownloadAverageSpeed");
            String optString9 = jSONObject.optString("DownloadMaxSpeed");
            String optString10 = jSONObject.optString("DownloadMinSpeed");
            IUtils iUtils = instance().mUtils;
            if (iUtils != null) {
                iUtils.kvReport(optString, optString2, httpProxyVersionCode, configVersion, optString3, optString4, optString5, optString6, optString7, optString8, optString9, optString10);
            }
        } catch (Throwable unused) {
            print(6, TAG, "kvReport exception");
        }
    }

    public static void print(int i, String str, String str2) {
        IUtils iUtils = instance().mUtils;
        if (iUtils != null) {
            iUtils.javaUtilLog(i, str, str2);
        }
    }

    public static void setContext(Context context) {
        mContext = context;
    }

    public native String buildPlayURL(int i);

    public native int cleanStorage();

    public native void deinit();

    public native int getCurrentOffset(int i);

    public native int getLocalServerPort();

    public native int getTotalOffset(int i);

    public native String getVersion();

    public native int init(String str, String str2);

    public native int preLoad(int i, int i2);

    public native void pushEvent(int i);

    public native void setCookie(String str);

    public native int setMaxStorageSize(long j);

    public native void setNetWorkState(int i);

    public native void setPlayerState(int i);

    public native void setRemainTime(int i, int i2);

    public void setUtils(IUtils iUtils) {
        this.mUtils = iUtils;
    }

    public native int startPlay(String str, int i, String str2, long j, int i2);

    public native void stopPlay(int i);
}
