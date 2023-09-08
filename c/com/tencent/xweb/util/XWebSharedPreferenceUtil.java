package com.tencent.xweb.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.xweb.ISharedPreferenceProvider;
import org.xwalk.core.XWalkEnvironment;

public class XWebSharedPreferenceUtil {
    public static final String SP_KEY_FILE_READER_DOWNLOAD_LIMITER_POSTFIX_COUNT = "_download_count";
    public static final String SP_KEY_FILE_READER_DOWNLOAD_LIMITER_POSTFIX_DATE = "_download_date";
    public static final String SP_KEY_FILE_READER_POSTFIX_COUNT = "_count";
    public static final String SP_KEY_FILE_READER_POSTFIX_REPORT_UV_DATE = "_report_uv_date";
    public static final String SP_KEY_FILE_READER_POSTFIX_TIME = "_time";
    public static final String SP_KEY_PLUGIN_AVAILABLE_VERSION = "availableVersion";
    public static final String SP_KEY_PLUGIN_LAST_ENV_INFO = "lastEnvInfo";
    public static final String SP_KEY_PLUGIN_LAST_REPORT_DATE = "lastReportDate";
    public static final String SP_KEY_PLUGIN_LAST_REPORT_VERSION = "lastReportVersion";
    public static final String SP_KEY_PLUGIN_PATCH_DOWNLOAD_COUNT_PREFIX = "patchDownloadCount_";
    public static final String SP_KEY_PLUGIN_SUPPORT_FORMATS = "supportFormats";
    public static final String SP_KEY_PLUGIN_UPDATE_CONFIG_LAST_FETCH_TIME = "nLastFetchPluginConfigTime";
    public static final String SP_KEY_PLUGIN_UPDATE_PROCESS_ID = "nUpdatingProcessId";
    public static final String SP_NAME_FILE_READER_RECORD = "xwalk_reader_record";
    private static final String SP_NAME_FREQUENT_LIMITER = "FREQUENT_LIMITER";
    private static final String SP_NAME_PLUGIN_UPDATE_INFO = "xwalk_plugin_update_info";
    private static final String SP_NAME_PLUGIN_VERSION_INFO_PREFIX = "xwalk_plugin_version_info_";
    private static final String SP_NAME_REPORT_DAILY = "REPORT_DAILY";
    private static final String SP_NAME_UPDATE_CONFIG = "UPDATEINFOTAG";
    private static final String SP_NAME_UPDATE_LOG = "UPDATELOG";
    public static final String SP_NAME_VERSION_INFO = "XWALKINFOS";
    private static final String SP_NAME_XWALK_CORE = "libxwalkcore";
    private static final String SP_NAME_XWEB_CMDCFG = "XWEB.CMDCFG";
    private static final String SP_NAME_XWEB_CMDCFG_LATEST = "XWEB.CMDCFG.LATEST";
    private static final String SP_NAME_XWEB_CMDCFG_PLUGIN = "XWEB.CMDCFG.PLUGIN";
    private static final String SP_NAME_XWEB_CMDCFG_PLUGIN_LATEST = "XWEB.CMDCFG.PLUGIN.LATEST";
    private static final String SP_NAME_XWEB_DEBUG = "xweb_debug";
    private static final String SP_NAME_XWEB_MULTI_PROCESS = "xweb_multi_process";
    private static final String SP_NAME_XWEB_UPDATING_TAG = "XWEB_UPDATING_TAG";
    private static final String SP_NAME_XWEB_USER_INFO = "XWEB_USER_INFO";
    private static final String SP_NAME_XWEB_USING_CORE_VERSION = "xweb_using_core_version";
    private static final String SP_NAME_XWEB_VALUE_CHANGED = "xweb_value_changed";
    public static final String TAG = "XWebSharedPreferenceUtil";
    private static Context sApplicationContext;
    private static ISharedPreferenceProvider sSPProvider;

    public static Context getApplicationContext() {
        return sApplicationContext;
    }

    private static SharedPreferences getMMKVSharedPreferences(String str, boolean z) {
        ISharedPreferenceProvider iSharedPreferenceProvider = sSPProvider;
        if (iSharedPreferenceProvider != null) {
            SharedPreferences sharedPreferences = null;
            try {
                sharedPreferences = iSharedPreferenceProvider.getSharedPreference(XWalkEnvironment.getApplicationContext(), str, 4, z);
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "getMMKVSharedPreferences, SPProvider get sp error", th);
            }
            if (sharedPreferences != null) {
                return sharedPreferences;
            }
            XWebLog.m21913w(TAG, "getMMKVSharedPreferences, get null from SPProvider");
            WXWebReporter.idkeyReport(176, 1);
        } else {
            WXWebReporter.idkeyReport(177, 1);
        }
        return safeGetProcessSharedPreferences(str);
    }

    public static SharedPreferences getMMKVSharedPreferencesForCommandCfgPlugin() {
        return getMMKVSharedPreferences(SP_NAME_XWEB_CMDCFG_PLUGIN);
    }

    public static SharedPreferences getMMKVSharedPreferencesForCommandCfgPluginLatest() {
        return getMMKVSharedPreferences(SP_NAME_XWEB_CMDCFG_PLUGIN_LATEST);
    }

    public static SharedPreferences getMMKVSharedPreferencesForEmbedInstall(String str) {
        return getMMKVSharedPreferences("XWEB_EMBED_INSTALL_" + str);
    }

    public static SharedPreferences getMMKVSharedPreferencesForFrequentLimiter() {
        return getMMKVSharedPreferences(SP_NAME_FREQUENT_LIMITER);
    }

    public static SharedPreferences getMMKVSharedPreferencesForLog() {
        return getMMKVSharedPreferencesTransportOld(SP_NAME_UPDATE_LOG);
    }

    public static SharedPreferences getMMKVSharedPreferencesForSchduler(String str) {
        return getMMKVSharedPreferences("xweb_scheduler_" + str);
    }

    public static SharedPreferences getMMKVSharedPreferencesForUpdatingTag() {
        return getMMKVSharedPreferences(SP_NAME_XWEB_UPDATING_TAG);
    }

    public static SharedPreferences getMMKVSharedPreferencesForXWebUserInfo() {
        return getMMKVSharedPreferences(SP_NAME_XWEB_USER_INFO);
    }

    public static SharedPreferences getMMKVSharedPreferencesForXWebValueChanged() {
        return getMMKVSharedPreferences(SP_NAME_XWEB_VALUE_CHANGED);
    }

    public static SharedPreferences getMMKVSharedPreferencesTransportOld(String str) {
        return getMMKVSharedPreferences(str, true);
    }

    public static SharedPreferences getSharedPreferencesForCommandCfg() {
        return getMMKVSharedPreferencesTransportOld(SP_NAME_XWEB_CMDCFG);
    }

    public static SharedPreferences getSharedPreferencesForCommandCfgLatest() {
        return getMMKVSharedPreferencesTransportOld(SP_NAME_XWEB_CMDCFG_LATEST);
    }

    public static SharedPreferences getSharedPreferencesForFileReaderRecord() {
        return safeGetProcessSharedPreferences(SP_NAME_FILE_READER_RECORD);
    }

    public static SharedPreferences getSharedPreferencesForMultiProcess() {
        return safeGetProcessSharedPreferences(SP_NAME_XWEB_MULTI_PROCESS);
    }

    public static SharedPreferences getSharedPreferencesForPluginUpdateInfo() {
        return safeGetProcessSharedPreferences(SP_NAME_PLUGIN_UPDATE_INFO);
    }

    public static SharedPreferences getSharedPreferencesForPluginVersionInfo(String str) {
        return safeGetProcessSharedPreferences(SP_NAME_PLUGIN_VERSION_INFO_PREFIX + str);
    }

    public static SharedPreferences getSharedPreferencesForReportDaily() {
        return getMMKVSharedPreferencesTransportOld(SP_NAME_REPORT_DAILY);
    }

    public static SharedPreferences getSharedPreferencesForUpdateConfig() {
        return safeGetProcessSharedPreferences(SP_NAME_UPDATE_CONFIG);
    }

    public static SharedPreferences getSharedPreferencesForUsingCoreVersion() {
        return safeGetProcessSharedPreferences(SP_NAME_XWEB_USING_CORE_VERSION);
    }

    public static SharedPreferences getSharedPreferencesForVersionInfo() {
        return safeGetProcessSharedPreferences(SP_NAME_VERSION_INFO);
    }

    public static SharedPreferences getSharedPreferencesForWebDebug() {
        return safeGetProcessSharedPreferences(SP_NAME_XWEB_DEBUG);
    }

    public static SharedPreferences getSharedPreferencesForXWalkCore() {
        return safeGetProcessSharedPreferences(SP_NAME_XWALK_CORE);
    }

    private static SharedPreferences safeGetProcessSharedPreferences(String str) {
        Context context = sApplicationContext;
        if (context != null) {
            return context.getSharedPreferences(str, 4);
        }
        XWebLog.m21913w(TAG, "safeGetProcessSharedPreferences, application context is null");
        return null;
    }

    public static void setApplicationContext(Context context) {
        if (context != null) {
            sApplicationContext = XWalkEnvironment.convertContextToApplication(context);
            XWebLog.m21911i(TAG, "setApplicationContext:" + sApplicationContext);
        }
    }

    public static synchronized void setSharedPreferenceProvider(ISharedPreferenceProvider iSharedPreferenceProvider) {
        synchronized (XWebSharedPreferenceUtil.class) {
            if (iSharedPreferenceProvider != null) {
                sSPProvider = iSharedPreferenceProvider;
            }
        }
    }

    public static SharedPreferences getMMKVSharedPreferences(String str) {
        return getMMKVSharedPreferences(str, false);
    }
}
