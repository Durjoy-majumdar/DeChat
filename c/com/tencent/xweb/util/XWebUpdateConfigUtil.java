package com.tencent.xweb.util;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tencent.xweb.CommandCfgPlugin;
import com.tencent.xweb.DeprecatedOutsideXWebSdk;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.xwalk.core.XWalkEnvironment;

public class XWebUpdateConfigUtil {
    public static final String DOWNLOAD_CONFIG_URL = "https://dldir1v6.qq.com/weixin/android/wxweb/updateConfig.xml";
    public static final String DOWNLOAD_CONFIG_URL_THIRD_APP = "https://dldir1v6.qq.com/weixin/android/wxweb/updateConfig_public.xml";
    public static final String DOWNLOAD_EXP_CONFIG_URL = "https://dldir1v6.qq.com/weixin/android/wxweb/updateConfig_test.xml";
    public static final String DOWNLOAD_PLUGIN_UPDATE_CONFIG_URL = "https://dldir1v6.qq.com/weixin/android/wxweb/plugin/pluginUpdateConfig.xml";
    public static final String DOWNLOAD_PLUGIN_UPDATE_CONFIG_URL_THIRD_APP = "https://dldir1v6.qq.com/weixin/android/wxweb/plugin/pluginUpdateConfig_public.xml";
    public static final String DOWNLOAD_PLUGIN_UPDATE_EXP_CONFIG_URL = "https://dldir1v6.qq.com/weixin/android/wxweb/plugin/pluginUpdateConfig_exp.xml";
    public static final String DOWNLOAD_PLUGIN_UPDATE_TEST_CONFIG_URL = "https://dldir1v6.qq.com/weixin/android/wxweb/plugin/pluginUpdateConfig_test.xml";
    public static final String DOWNLOAD_URL_PREFIX_FOR_BASE_CONFIG = "https://dldir1v6.qq.com/weixin/android/wxweb/";
    public static final String DOWNLOAD_URL_PREFIX_FOR_PLUGIN_CONFIG = "https://dldir1v6.qq.com/weixin/android/wxweb/plugin/";
    private static final String SP_KEY_PLUGIN_TEST_CONFIG_URL = "XWEB_PLUGIN_TEST_CONFIG_URL";
    private static final String SP_KEY_TEST_CONFIG_URL = "XWEB_TEST_CONFIG_URL";
    public static final String TAG = "XWebUpdateConfigUtil";
    public static final int XWALK_PLUGIN_UPDATE_PERIOD_DEFAULT = 90000000;
    private static long sBaseConfigUpdatePeriod = 0;
    private static int sPluginConfigUpdatePeriod = -1;
    private static String sStrTempBaseConfigUrl;
    private static String sStrTempPluginConfigUrl;

    public static long getBaseConfigUpdatePeriod() {
        return sBaseConfigUpdatePeriod;
    }

    public static String getBaseConfigUrl() {
        String testBaseConfigUrl = getTestBaseConfigUrl();
        if (isValidConfigHost(testBaseConfigUrl)) {
            XWebLog.addInitializeLog(TAG, "use test config url : " + testBaseConfigUrl);
            return testBaseConfigUrl;
        }
        String tempBaseConfigUrl = getTempBaseConfigUrl();
        if (isValidConfigHost(tempBaseConfigUrl)) {
            XWebLog.addInitializeLog(TAG, "use temp config url : " + tempBaseConfigUrl);
            return tempBaseConfigUrl;
        }
        String str = XWalkEnvironment.getBuildConfigThirdPartyRelease() ? DOWNLOAD_CONFIG_URL_THIRD_APP : DOWNLOAD_CONFIG_URL;
        XWebLog.addInitializeLog(TAG, "use release config url = " + str);
        return str;
    }

    public static int getPluginConfigUpdatePeriod() {
        return sPluginConfigUpdatePeriod;
    }

    public static String getPluginConfigUrl() {
        String testPluginConfigUrl = getTestPluginConfigUrl();
        if (isValidConfigHost(testPluginConfigUrl)) {
            XWebLog.addInitializeLog(TAG, "plugin use test config url: " + testPluginConfigUrl);
            return testPluginConfigUrl;
        }
        String tempPluginConfigUrl = getTempPluginConfigUrl();
        if (isValidConfigHost(tempPluginConfigUrl)) {
            XWebLog.addInitializeLog(TAG, "plugin use temp config url: " + tempPluginConfigUrl);
            return tempPluginConfigUrl;
        }
        String str = XWalkEnvironment.getBuildConfigThirdPartyRelease() ? DOWNLOAD_PLUGIN_UPDATE_CONFIG_URL_THIRD_APP : DOWNLOAD_PLUGIN_UPDATE_CONFIG_URL;
        XWebLog.addInitializeLog(TAG, "plugin use release config url: " + str);
        return str;
    }

    public static int getPluginUpdatePeriod() {
        int pluginConfigUpdatePeriod = getPluginConfigUpdatePeriod();
        if (pluginConfigUpdatePeriod > 0) {
            XWebLog.addInitializeLog(TAG, "getPluginUpdatePeriod, use temp period:" + pluginConfigUpdatePeriod);
            return pluginConfigUpdatePeriod;
        }
        int cmdPluginUpdatePeriod = CommandCfgPlugin.getInstance().getCmdPluginUpdatePeriod();
        if (cmdPluginUpdatePeriod > 0) {
            XWebLog.addInitializeLog(TAG, "getPluginUpdatePeriod, use cmd period:" + cmdPluginUpdatePeriod);
            return cmdPluginUpdatePeriod;
        }
        XWebLog.addInitializeLog(TAG, "getPluginUpdatePeriod, use default period:90000000");
        return XWALK_PLUGIN_UPDATE_PERIOD_DEFAULT;
    }

    public static String getTempBaseConfigUrl() {
        return sStrTempBaseConfigUrl;
    }

    public static String getTempPluginConfigUrl() {
        return sStrTempPluginConfigUrl;
    }

    public static String getTestBaseConfigUrl() {
        SharedPreferences sharedPreferencesForWebDebug = XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug();
        if (sharedPreferencesForWebDebug == null) {
            XWebLog.m21909e(TAG, "getTestBaseConfigUrl, sp is null");
            return "";
        }
        String string = sharedPreferencesForWebDebug.getString(SP_KEY_TEST_CONFIG_URL, "");
        return (string == null || string.trim().isEmpty()) ? "" : string;
    }

    public static String getTestPluginConfigUrl() {
        SharedPreferences sharedPreferencesForWebDebug = XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug();
        if (sharedPreferencesForWebDebug == null) {
            XWebLog.m21909e(TAG, "getTestPluginConfigUrl, sp is null");
            return "";
        }
        String string = sharedPreferencesForWebDebug.getString(SP_KEY_PLUGIN_TEST_CONFIG_URL, "");
        return (string == null || string.trim().isEmpty()) ? "" : string;
    }

    public static boolean isValidConfigHost(String str) {
        if (str != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str.trim())) {
            XWebLog.m21911i(TAG, "isValidConfigHost, url:" + str);
            try {
                URI uri = new URI(str.trim());
                if (!uri.getScheme().equals(C113600ck.f339986i)) {
                    return false;
                }
                return uri.getHost().equals("dldir1.qq.com") || uri.getHost().equals("dldir1v6.qq.com");
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "isValidConfigHost error", th);
            }
        }
        return false;
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setBaseConfigUpdatePeriod(long j) {
        sBaseConfigUpdatePeriod = j;
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setPluginConfigUpdatePeriod(int i) {
        sPluginConfigUpdatePeriod = i;
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setTempBaseConfigUrl(String str) {
        sStrTempBaseConfigUrl = str;
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setTempPluginConfigUrl(String str) {
        sStrTempPluginConfigUrl = str;
    }

    public static boolean setTestBaseConfigUrl(String str) {
        SharedPreferences sharedPreferencesForWebDebug = XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug();
        if (sharedPreferencesForWebDebug == null) {
            XWebLog.m21909e(TAG, "setTestBaseConfigUrl, sp is null");
            return false;
        }
        SharedPreferences.Editor edit = sharedPreferencesForWebDebug.edit();
        if (str == null || str.trim().isEmpty()) {
            edit.remove(SP_KEY_TEST_CONFIG_URL);
        } else {
            edit.putString(SP_KEY_TEST_CONFIG_URL, str.trim());
        }
        return edit.commit();
    }

    public static boolean setTestPluginConfigUrl(String str) {
        SharedPreferences sharedPreferencesForWebDebug = XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug();
        if (sharedPreferencesForWebDebug == null) {
            XWebLog.m21909e(TAG, "setTestPluginConfigUrl, sp is null");
            return false;
        }
        SharedPreferences.Editor edit = sharedPreferencesForWebDebug.edit();
        if (str == null || str.trim().isEmpty()) {
            edit.remove(SP_KEY_PLUGIN_TEST_CONFIG_URL);
        } else {
            edit.putString(SP_KEY_PLUGIN_TEST_CONFIG_URL, str.trim());
        }
        return edit.commit();
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean setTempBaseConfigUrl(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                if (new Date().after(new SimpleDateFormat("yyyyMMdd").parse(str2))) {
                    XWebLog.m21913w(TAG, "today is after end date, set temp update config failed");
                    return false;
                }
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "setTempUpdateConfigUrl, error", th);
                return false;
            }
        }
        sStrTempBaseConfigUrl = str;
        return true;
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setTempPluginConfigUrl(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                if (new Date().after(new SimpleDateFormat("yyyyMMdd").parse(str2))) {
                    XWebLog.m21913w(TAG, "today is after end date, set temp plugin update config failed");
                    return;
                }
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "setTempPluginConfigUrl, error", th);
                return;
            }
        }
        sStrTempPluginConfigUrl = str;
    }
}
