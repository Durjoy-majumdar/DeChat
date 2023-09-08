package com.tencent.thumbplayer.config;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.thumbplayer.api.TPPlayerMgr;
import com.tencent.thumbplayer.core.config.TPPlayerCoreConfig;
import com.tencent.thumbplayer.datatransport.config.TPProxyConfig;
import com.tencent.thumbplayer.utils.TPLogUtil;
import org.json.JSONException;
import org.json.JSONObject;

public class TPPlayerConfig {
    private static String DOT = "\\.";
    public static final boolean ISOTT = false;
    private static final String LOCAL_SERVER_BUFFER_SIZE_KEY = "key_localserver_buffer_size";
    private static final String LOCAL_SERVER_SEND_SOCKET_BUFFER_SIZE_KEY = "key_localserver_send_socket_buffer_size";
    private static final String TAG = "TPPlayerConfig";
    public static final String VERSION = "2.33.0.1206";
    private static String appVersion = "";
    private static String appVersionName = null;
    public static String beacon_log_host = "";
    public static String beacon_policy_host = "";
    private static long buildNum = -1;
    private static String host_config = "";
    public static int localserver_buffer_size = 0;
    public static int localserver_send_socket_buffer_size = 0;
    private static String mAbUserId = "";
    private static boolean mEnableDataReport = true;
    private static boolean mEnablePlayerReport = true;
    private static String mGuid = "";
    private static String mOutNetIp = "";
    private static int mPlatform = -1;
    private static int mProxyServiceType = -1;
    private static boolean mUseP2P = true;
    private static boolean mUserIsVip = false;
    private static String mUserUin = null;
    private static String mUserUpc = "";
    private static int mUserUpcState;

    public static String getAbUserId() {
        return TextUtils.isEmpty(mAbUserId) ? "" : mAbUserId;
    }

    public static String getAppBigVersion(Context context) {
        if (!TextUtils.isEmpty(appVersion)) {
            return appVersion;
        }
        String appVersionName2 = getAppVersionName(context);
        if (!TextUtils.isEmpty(appVersionName2)) {
            String[] split = appVersionName2.split(DOT);
            if (split != null && split.length == 4) {
                appVersionName2 = appVersionName2.substring(0, appVersionName2.lastIndexOf("."));
            }
        } else {
            appVersionName2 = "0.0.0";
        }
        appVersion = appVersionName2;
        return appVersionName2;
    }

    public static String getAppVersionName(Context context) {
        if (!TextUtils.isEmpty(appVersionName)) {
            return appVersionName;
        }
        if (context == null) {
            return "";
        }
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            appVersionName = str;
            return str == null ? "" : str;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static long getBuildNumber(Context context) {
        long j = buildNum;
        if (-1 != j) {
            return j;
        }
        try {
            long longVersionCode = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode();
            buildNum = longVersionCode;
            return longVersionCode;
        } catch (Throwable unused) {
            TPLogUtil.m21894e(TAG, "getLongVersionCode less api 28");
            return buildNum;
        }
    }

    public static String getGuid() {
        return mGuid;
    }

    public static boolean getMediaDrmReuseEnable() {
        return TPPlayerCoreConfig.getMediaDrmReuseEnable();
    }

    public static boolean getNewReportEnable() {
        return TPPlayerCoreConfig.getCoreEventProcessEnable();
    }

    public static String getOutNetIp() {
        return mOutNetIp;
    }

    public static int getPlatform() {
        return mPlatform;
    }

    public static String getProxyConfigDir() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(host_config)) {
                jSONObject.put(TPPlayerMgr.PLYAER_HOST_KEY, new JSONObject(host_config));
            }
            int i = localserver_buffer_size;
            if (i > 0) {
                jSONObject.put(LOCAL_SERVER_BUFFER_SIZE_KEY, i);
            }
            int i2 = localserver_send_socket_buffer_size;
            if (i2 > 0) {
                jSONObject.put(LOCAL_SERVER_SEND_SOCKET_BUFFER_SIZE_KEY, i2);
            }
        } catch (JSONException e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        }
        return jSONObject.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r2 = mPlatform;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getProxyServiceType() {
        /*
            int r0 = mProxyServiceType
            r1 = -1
            if (r0 != r1) goto L_0x000a
            int r2 = mPlatform
            if (r2 == r1) goto L_0x000a
            return r2
        L_0x000a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.config.TPPlayerConfig.getProxyServiceType():int");
    }

    public static String getUserUin() {
        return mUserUin;
    }

    public static String getUserUpc() {
        return mUserUpc;
    }

    public static int getUserUpcState() {
        return mUserUpcState;
    }

    public static int getVideoMediaCodecCoexistMaxCnt() {
        return TPPlayerCoreConfig.getVideoMediaCodecCoexistMaxCnt();
    }

    public static String getWidevineProvisioningServerUrl() {
        return TPPlayerCoreConfig.getWidevineProvisioningServerUrl();
    }

    public static boolean isDataReportEnable() {
        return mEnableDataReport;
    }

    public static boolean isPlayerReportEnable() {
        return mEnablePlayerReport;
    }

    public static boolean isUserIsVip() {
        return mUserIsVip;
    }

    public static void parseHostConfig(String str) {
        if (TextUtils.isEmpty(str)) {
            TPLogUtil.m21899w(TAG, "parseHostConfig, config is null.");
            return;
        }
        host_config = str;
        TPLogUtil.m21897i(TAG, "parseHostConfig:" + str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(TPPlayerMgr.PLYAER_HOST_KEY)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(TPPlayerMgr.PLYAER_HOST_KEY);
                if (jSONObject2.has(TPPlayerMgr.BEACON_POLICY_HOST_KEY)) {
                    beacon_policy_host = jSONObject2.getString(TPPlayerMgr.BEACON_POLICY_HOST_KEY);
                }
                if (jSONObject2.has(TPPlayerMgr.BEACON_LOG_HOST_KEY)) {
                    beacon_log_host = jSONObject2.getString(TPPlayerMgr.BEACON_LOG_HOST_KEY);
                }
            }
            if (jSONObject.has(TPPlayerMgr.PROXY_HOST_KEY)) {
                TPProxyConfig.setInitConfig(TPProxyConfig.getDefaultServiceType(), jSONObject.getString(TPPlayerMgr.PROXY_HOST_KEY));
            }
        } catch (Throwable th) {
            TPLogUtil.m21899w(TAG, "parseHostConfig exception: " + th.toString());
        }
    }

    public static void setAbUserId(String str) {
        mAbUserId = str;
    }

    public static void setDataReportEnable(boolean z) {
        mEnableDataReport = z;
    }

    public static void setDebugEnable(boolean z) {
        TPLogUtil.setDebugEnable(z);
    }

    public static void setGuid(String str) {
        mGuid = str;
    }

    public static void setMediaDrmReuseEnable(boolean z) {
        TPPlayerCoreConfig.setMediaDrmReuseEnable(z);
    }

    public static void setNewReportEnable(boolean z) {
        TPPlayerCoreConfig.setCoreEventProcessEnable(z);
    }

    public static void setOutNetIp(String str) {
        mOutNetIp = str;
    }

    public static void setPlatform(int i) {
        mPlatform = i;
    }

    public static void setPlayerReportEnable(boolean z) {
        mEnablePlayerReport = z;
    }

    public static void setProxyServiceType(int i) {
        mProxyServiceType = i;
    }

    public static void setUserIsVip(boolean z) {
        mUserIsVip = z;
    }

    public static void setUserUin(String str) {
        mUserUin = str;
    }

    public static void setUserUpc(String str) {
        mUserUpc = str;
    }

    public static void setUserUpcState(int i) {
        mUserUpcState = i;
    }

    public static void setVideoMediaCodecCoexistMaxCnt(int i) {
        TPPlayerCoreConfig.setVideoMediaCodecCoexistMaxCnt(i);
    }

    public static void setVideoMediaCodecStuckCheck(boolean z) {
    }

    public static void setWidevineProvisioningServerUrl(String str) {
        TPPlayerCoreConfig.setWidevineProvisioningServerUrl(str);
    }
}
