package com.tencent.xweb;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.xweb.FileReaderHelper;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.internal.ConstValue;
import com.tencent.xweb.internal.IWebViewProvider;
import com.tencent.xweb.util.FileUtils;
import com.tencent.xweb.util.WebViewWrapperFactory;
import com.tencent.xweb.util.XWebLog;
import com.tencent.xweb.util.XWebSharedPreferenceUtil;
import com.tencent.xweb.util.XWebUpdateConfigUtil;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import com.tencent.xweb.xwalk.plugin.XWalkPluginManager;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import org.xwalk.core.XWalkEnvironment;

public class WebDebugCfg {
    private static final String TAG = "WebDebugCfg";
    private static final String keyABTestWebView = "ABTestWebView";
    private static final String keyEnableCheckStorage = "bEnableCheckStorage";
    private static final String keyEnableCheckThread = "bEnableCheckThread";
    private static final String keyEnableLocalDebug = "bEnableLocalDebug";
    private static final String keyEnableRemoteDebug = "bEnableRemoteDebug";
    private static final String keyHardCodeWebView = "HardCodeWebView";
    private static final String keyIgnoreCrashWatch = "bIgnoreCrashWatch";
    private static final String keyShowFps = "bShowFps";
    private static final String keyShowSavePage = "bShowSavePage";
    private static final String keyShowVersion = "bShowVersion";
    private static final String keyWebViewModeForAppBrand = "WebViewModeForAppBrand";
    private static final String keyWebViewModeForMM = "WebViewModeForMM";
    private static WebDebugCfg sInstance;
    private Context mContext;
    private WebView.WebViewKind mWebViewKind = WebView.WebViewKind.WV_KIND_NONE;

    public static WebDebugCfg getInst() {
        if (sInstance == null) {
            sInstance = new WebDebugCfg();
        }
        return sInstance;
    }

    public void cleanTestSetting() {
        SharedPreferences sharedPreferencesForWebDebug = XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug();
        if (sharedPreferencesForWebDebug != null) {
            sharedPreferencesForWebDebug.edit().clear().commit();
        }
    }

    public boolean getDisableFileReaderCache() {
        SharedPreferences sharedPreferencesForWebDebug = XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug();
        if (sharedPreferencesForWebDebug == null) {
            return false;
        }
        return sharedPreferencesForWebDebug.getBoolean("fr_disable_cache", false);
    }

    public boolean getDisableFileReaderCrashDetect() {
        SharedPreferences sharedPreferencesForWebDebug = XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug();
        if (sharedPreferencesForWebDebug == null) {
            return false;
        }
        return sharedPreferencesForWebDebug.getBoolean("fr_disable_crash_detect", false);
    }

    public boolean getDisableFileReaderEncry() {
        SharedPreferences sharedPreferencesForWebDebug = XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug();
        if (sharedPreferencesForWebDebug == null) {
            return true;
        }
        return sharedPreferencesForWebDebug.getBoolean("fr_disable_encry", true);
    }

    public boolean getEnableCheckStorage() {
        return XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().getBoolean(keyEnableCheckStorage, false);
    }

    public boolean getEnableCheckThread() {
        return XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().getBoolean(keyEnableCheckThread, false);
    }

    public boolean getEnableLocalDebug() {
        return XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().getBoolean(keyEnableLocalDebug, false);
    }

    public boolean getEnableRemoteDebug() {
        return XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().getBoolean(keyEnableRemoteDebug, false);
    }

    public FileReaderHelper.UseOfficeReader getForceUseOfficeReader(String str) {
        try {
            SharedPreferences sharedPreferencesForWebDebug = XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug();
            if (sharedPreferencesForWebDebug == null) {
                return FileReaderHelper.UseOfficeReader.none;
            }
            return CommandCfgPlugin.convertUseOfficeReader(sharedPreferencesForWebDebug.getString("force_use_office_reader_" + str.toLowerCase(), ""));
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "getForceUseOfficeReader error", th);
            return FileReaderHelper.UseOfficeReader.none;
        }
    }

    public boolean getHasConfig() {
        String testBaseConfigUrl = XWebUpdateConfigUtil.getTestBaseConfigUrl();
        return testBaseConfigUrl != null && !testBaseConfigUrl.isEmpty();
    }

    public boolean getIgnoreCrash() {
        return XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().getBoolean(keyIgnoreCrashWatch, false);
    }

    public boolean getShowFps() {
        return XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().getBoolean(keyShowFps, false);
    }

    public boolean getShowSavePage() {
        return XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().getBoolean(keyShowSavePage, false);
    }

    public boolean getShowVersion() {
        return XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().getBoolean(keyShowVersion, false);
    }

    public WebView.WebViewKind getWebViewKind(String str) {
        if (str == null || str.isEmpty() || this.mContext == null) {
            return WebView.WebViewKind.WV_KIND_NONE;
        }
        SharedPreferences sharedPreferencesForWebDebug = XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug();
        if (sharedPreferencesForWebDebug == null) {
            return WebView.WebViewKind.WV_KIND_NONE;
        }
        String string = sharedPreferencesForWebDebug.getString(keyHardCodeWebView + str, "");
        if (string != null && !string.isEmpty()) {
            XWebLog.m21911i(TAG, "has hardcode type:" + string);
        }
        if (string == null || string.isEmpty() || string.equals(WebView.WebViewKind.WV_KIND_NONE.toString())) {
            string = sharedPreferencesForWebDebug.getString(keyABTestWebView + str, "");
            if (string != null && !string.isEmpty()) {
                XWebLog.m21911i(TAG, "has abtest type:" + string);
            }
        }
        if (string == null || string.isEmpty()) {
            this.mWebViewKind = WebView.WebViewKind.WV_KIND_NONE;
        } else {
            try {
                this.mWebViewKind = WebView.WebViewKind.valueOf(string);
            } catch (Throwable unused) {
                this.mWebViewKind = WebView.WebViewKind.WV_KIND_NONE;
            }
        }
        return this.mWebViewKind;
    }

    public WebView.WebViewKind getWebViewKindTest(String str, boolean z) {
        String str2;
        if (str == null || str.isEmpty() || this.mContext == null) {
            return WebView.WebViewKind.WV_KIND_NONE;
        }
        SharedPreferences sharedPreferencesForWebDebug = XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug();
        if (sharedPreferencesForWebDebug == null) {
            return WebView.WebViewKind.WV_KIND_NONE;
        }
        if (z) {
            str2 = sharedPreferencesForWebDebug.getString(keyABTestWebView + str, "");
        } else {
            str2 = sharedPreferencesForWebDebug.getString(keyHardCodeWebView + str, "");
        }
        if (str2 == null || str2.isEmpty()) {
            this.mWebViewKind = WebView.WebViewKind.WV_KIND_NONE;
        } else {
            try {
                this.mWebViewKind = WebView.WebViewKind.valueOf(str2);
            } catch (Throwable unused) {
                this.mWebViewKind = WebView.WebViewKind.WV_KIND_NONE;
            }
        }
        return this.mWebViewKind;
    }

    public int getWebViewModeForAppBrand() {
        return XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().getInt(keyWebViewModeForAppBrand, -1);
    }

    public int getWebViewModeForMM() {
        return XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().getInt(keyWebViewModeForMM, -1);
    }

    public void load(Context context) {
        if (this.mContext == null) {
            XWebLog.m21913w(TAG, "load start");
            Context convertContextToApplication = XWalkEnvironment.convertContextToApplication(context);
            this.mContext = convertContextToApplication;
            XWebSharedPreferenceUtil.setApplicationContext(convertContextToApplication);
            XWebLog.m21913w(TAG, "load end");
        }
    }

    public void setABTestWebViewKind(String str, WebView.WebViewKind webViewKind) {
        if (this.mContext != null && str != null && !str.isEmpty()) {
            SharedPreferences.Editor edit = XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().edit();
            edit.putString(keyABTestWebView + str, webViewKind.toString()).commit();
        }
    }

    public void setDisableFileReaderCache(boolean z) {
        SharedPreferences.Editor edit;
        int availableVersion;
        SharedPreferences sharedPreferencesForWebDebug = XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug();
        if (sharedPreferencesForWebDebug != null && (edit = sharedPreferencesForWebDebug.edit()) != null) {
            edit.putBoolean("fr_disable_cache", z);
            edit.commit();
            if (z) {
                for (XWalkPlugin next : XWalkPluginManager.getAllPlugins()) {
                    if ((next instanceof XWalkReaderBasePlugin) && (availableVersion = next.getAvailableVersion(true)) >= 0) {
                        String privateCacheDir = next.getPrivateCacheDir(availableVersion);
                        if (!privateCacheDir.isEmpty()) {
                            FileUtils.deleteAll(privateCacheDir);
                        }
                    }
                }
            }
        }
    }

    public void setDisableFileReaderCrashDetect(boolean z) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferencesForWebDebug = XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug();
        if (sharedPreferencesForWebDebug != null && (edit = sharedPreferencesForWebDebug.edit()) != null) {
            edit.putBoolean("fr_disable_crash_detect", z);
            edit.commit();
        }
    }

    public void setDisableFileReaderEncry(boolean z) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferencesForWebDebug = XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug();
        if (sharedPreferencesForWebDebug != null && (edit = sharedPreferencesForWebDebug.edit()) != null) {
            edit.putBoolean("fr_disable_encry", z);
            edit.commit();
        }
    }

    public void setEnableCheckStorage(boolean z) {
        XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().edit().putBoolean(keyEnableCheckStorage, z).commit();
    }

    public void setEnableCheckThread(boolean z) {
        XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().edit().putBoolean(keyEnableCheckThread, z).commit();
    }

    public void setEnableLocalDebug(boolean z) {
        XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().edit().putBoolean(keyEnableLocalDebug, z).commit();
        XWalkEnvironment.isTurnOnKVLog();
    }

    public void setEnableRemoteDebug(boolean z) {
        XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().edit().putBoolean(keyEnableRemoteDebug, z).commit();
    }

    public boolean setForceUseOfficeReader(String str, FileReaderHelper.UseOfficeReader useOfficeReader) {
        boolean z;
        SharedPreferences sharedPreferencesForWebDebug;
        SharedPreferences.Editor edit;
        try {
            String[] strArr = FileReaderHelper.OFFICE_READER_FORMATS;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if (strArr[i].equalsIgnoreCase(str)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z || (sharedPreferencesForWebDebug = XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug()) == null || (edit = sharedPreferencesForWebDebug.edit()) == null) {
                return false;
            }
            edit.putString("force_use_office_reader_" + str.toLowerCase(), useOfficeReader.toString());
            return edit.commit();
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "setForceUseOfficeReader error", th);
            return false;
        }
    }

    public void setHasConfig(boolean z) {
        if (z) {
            XWebUpdateConfigUtil.setTestBaseConfigUrl(XWebUpdateConfigUtil.DOWNLOAD_EXP_CONFIG_URL);
            SharedPreferences.Editor edit = XWebSharedPreferenceUtil.getSharedPreferencesForUpdateConfig().edit();
            edit.putLong("nLastFetchConfigTime", 0);
            edit.commit();
            IWebViewProvider xWebViewProvider = WebViewWrapperFactory.getXWebViewProvider();
            if (xWebViewProvider != null) {
                xWebViewProvider.execute(ConstValue.STR_CMD_CLEAR_SCHEDULER, (Object[]) null);
                return;
            }
            return;
        }
        XWebUpdateConfigUtil.setTestBaseConfigUrl("");
        SharedPreferences.Editor edit2 = XWebSharedPreferenceUtil.getSharedPreferencesForUpdateConfig().edit();
        edit2.putLong("nLastFetchConfigTime", 0);
        edit2.commit();
        IWebViewProvider xWebViewProvider2 = WebViewWrapperFactory.getXWebViewProvider();
        if (xWebViewProvider2 != null) {
            xWebViewProvider2.execute(ConstValue.STR_CMD_CLEAR_SCHEDULER, (Object[]) null);
        }
    }

    public void setIgnoreCrash(boolean z) {
        XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().edit().putBoolean(keyIgnoreCrashWatch, z).commit();
    }

    public void setPinusDebugMode(boolean z, boolean z2, Context context) {
        WebDebugCfg inst = getInst();
        WebView.WebViewKind webViewKind = WebView.WebViewKind.WV_KIND_PINUS;
        inst.setWebViewKind(XWalkEnvironment.MODULE_APPBRAND, webViewKind);
        getInst().setWebViewKind(XWalkEnvironment.MODULE_TOOLS, webViewKind);
        getInst().setWebViewKind(XWalkEnvironment.MODULE_MM, webViewKind);
        IWebViewProvider xWebViewProvider = WebViewWrapperFactory.getXWebViewProvider();
        if (xWebViewProvider == null) {
            return;
        }
        if (z2) {
            xWebViewProvider.execute(ConstValue.STR_CMD_SET_DEBUG_MODE_REPLACE_NOW, new Object[]{context});
        } else if (z) {
            xWebViewProvider.execute(ConstValue.STR_CMD_SET_DEBUG_MODE_REPLACE, (Object[]) null);
        } else {
            xWebViewProvider.execute(ConstValue.STR_CMD_SET_DEBUG_MODE_NO_REPLACE, (Object[]) null);
        }
    }

    public void setShowFps(boolean z) {
        XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().edit().putBoolean(keyShowFps, z).commit();
    }

    public void setShowSavePage(boolean z) {
        XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().edit().putBoolean(keyShowSavePage, z).commit();
    }

    public void setShowVersion(boolean z) {
        XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().edit().putBoolean(keyShowVersion, z).commit();
    }

    public void setWebViewKind(String str, WebView.WebViewKind webViewKind) {
        if (this.mContext != null && str != null && !str.isEmpty()) {
            SharedPreferences.Editor edit = XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().edit();
            edit.putString(keyHardCodeWebView + str, webViewKind.toString()).commit();
        }
    }

    public void setWebViewModeForAppBrand(int i) {
        if (i < 0 || i >= XWebSdk.WebViewModeForAppBrand.values().length) {
            XWebLog.m21913w(TAG, "setWebViewModeForAppBrand, clear appbrand webview mode");
            XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().edit().remove(keyWebViewModeForAppBrand).commit();
            return;
        }
        XWebSdk.WebViewModeForAppBrand webViewModeForAppBrand = XWebSdk.WebViewModeForAppBrand.values()[i];
        XWebLog.m21913w(TAG, "setWebViewModeForAppBrand, set appbrand webview mode:" + webViewModeForAppBrand);
        if (webViewModeForAppBrand != null) {
            XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().edit().putInt(keyWebViewModeForAppBrand, webViewModeForAppBrand.ordinal()).commit();
        }
    }

    public void setWebViewModeForMM(int i) {
        if (i < 0 || i >= XWebSdk.WebViewModeForMM.values().length) {
            XWebLog.m21913w(TAG, "setWebViewModeForMM, clear mm webview mode");
            XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().edit().remove(keyWebViewModeForMM).commit();
            return;
        }
        XWebSdk.WebViewModeForMM webViewModeForMM = XWebSdk.WebViewModeForMM.values()[i];
        XWebLog.m21913w(TAG, "setWebViewModeForMM, set mm webview mode:" + webViewModeForMM);
        if (webViewModeForMM != null) {
            XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().edit().putInt(keyWebViewModeForMM, webViewModeForMM.ordinal()).commit();
        }
    }

    public String setForceUseOfficeReader(String[] strArr, FileReaderHelper.UseOfficeReader useOfficeReader) {
        SharedPreferences sharedPreferencesForWebDebug;
        SharedPreferences.Editor edit;
        if (strArr == null || strArr.length == 0 || (sharedPreferencesForWebDebug = XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug()) == null || (edit = sharedPreferencesForWebDebug.edit()) == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            for (String str2 : FileReaderHelper.OFFICE_READER_FORMATS) {
                if (str2.equalsIgnoreCase(str)) {
                    edit.putString("force_use_office_reader_" + str.toLowerCase(), useOfficeReader.toString());
                    sb.append(str2);
                    sb.append(",");
                }
            }
        }
        if (edit.commit()) {
            return sb.toString();
        }
        return "";
    }
}
