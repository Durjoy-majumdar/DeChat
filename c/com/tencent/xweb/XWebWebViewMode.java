package com.tencent.xweb;

import android.content.SharedPreferences;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.util.XWebLog;
import com.tencent.xweb.util.XWebSharedPreferenceUtil;
import org.xwalk.core.XWalkEnvironment;

public class XWebWebViewMode {
    public static final String SP_KEY_WEBVIEW_MODE_FOR_APPBRAND = "SP_KEY_WEBVIEW_MODE_FOR_APPBRAND";
    public static final String SP_KEY_WEBVIEW_MODE_FOR_MM = "SP_KEY_WEBVIEW_MODE_FOR_MM";
    public static final String TAG = "XWebWebViewMode";
    private static XWebSdk.WebViewModeForAppBrand sWebViewModeForAppBrand;
    private static XWebSdk.WebViewModeForMM sWebViewModeForMM;

    public static XWebSdk.WebViewModeForAppBrand getWebViewModeCommandForAppBrand() {
        XWebSdk.WebViewModeForAppBrand webViewModeForAppBrand = sWebViewModeForAppBrand;
        if (webViewModeForAppBrand != null) {
            return webViewModeForAppBrand;
        }
        SharedPreferences sharedPreferencesForMultiProcess = XWebSharedPreferenceUtil.getSharedPreferencesForMultiProcess();
        if (sharedPreferencesForMultiProcess == null || !sharedPreferencesForMultiProcess.contains(SP_KEY_WEBVIEW_MODE_FOR_APPBRAND)) {
            XWebSdk.WebViewModeForAppBrand webViewModeForAppBrand2 = XWebSdk.WebViewModeForAppBrand.DISABLE_MULTI_PROCESS;
            sWebViewModeForAppBrand = webViewModeForAppBrand2;
            if (XWebChildProcessMonitor.checkDisableMultiProcess()) {
                XWebLog.m21911i(TAG, "getWebViewModeCommandForAppBrand, disable for child process crash");
                saveWebViewModeIfNeed(SP_KEY_WEBVIEW_MODE_FOR_APPBRAND, sWebViewModeForAppBrand.ordinal());
                return sWebViewModeForAppBrand;
            }
            int webViewModeForAppBrand3 = WebDebugCfg.getInst().getWebViewModeForAppBrand();
            if (webViewModeForAppBrand3 < 0) {
                webViewModeForAppBrand3 = CommandCfg.getInstance().getWebViewModeCommandForAppBrand();
            }
            if (webViewModeForAppBrand3 >= webViewModeForAppBrand2.ordinal() && webViewModeForAppBrand3 < XWebSdk.WebViewModeForAppBrand.values().length) {
                sWebViewModeForAppBrand = XWebSdk.WebViewModeForAppBrand.values()[webViewModeForAppBrand3];
            }
            XWebLog.m21911i(TAG, "getWebViewModeCommandForAppBrand, value:" + webViewModeForAppBrand3);
            saveWebViewModeIfNeed(SP_KEY_WEBVIEW_MODE_FOR_APPBRAND, sWebViewModeForAppBrand.ordinal());
            return sWebViewModeForAppBrand;
        }
        sWebViewModeForAppBrand = XWebSdk.WebViewModeForAppBrand.values()[sharedPreferencesForMultiProcess.getInt(SP_KEY_WEBVIEW_MODE_FOR_APPBRAND, XWebSdk.WebViewModeForAppBrand.DISABLE_MULTI_PROCESS.ordinal())];
        XWebLog.m21911i(TAG, "getWebViewModeCommandForAppBrand, already checked in mm process:" + sWebViewModeForAppBrand);
        return sWebViewModeForAppBrand;
    }

    public static XWebSdk.WebViewModeForMM getWebViewModeCommandForMM() {
        XWebSdk.WebViewModeForMM webViewModeForMM = sWebViewModeForMM;
        if (webViewModeForMM != null) {
            return webViewModeForMM;
        }
        SharedPreferences sharedPreferencesForMultiProcess = XWebSharedPreferenceUtil.getSharedPreferencesForMultiProcess();
        if (sharedPreferencesForMultiProcess == null || !sharedPreferencesForMultiProcess.contains(SP_KEY_WEBVIEW_MODE_FOR_MM)) {
            sWebViewModeForMM = XWebSdk.WebViewModeForMM.values()[CommandCfg.getInstance().getMMWebViewDowngradeMode()];
            if (!XWebSdk.supportMultiProcess(XWalkEnvironment.getApplicationContext())) {
                XWebLog.m21911i(TAG, "getWebViewModeCommandForMM, disable for core version is low");
                saveWebViewModeIfNeed(SP_KEY_WEBVIEW_MODE_FOR_MM, sWebViewModeForMM.ordinal());
                return sWebViewModeForMM;
            } else if (XWebChildProcessMonitor.checkDisableMultiProcess()) {
                XWebLog.m21911i(TAG, "getWebViewModeCommandForMM, disable for child process crash");
                saveWebViewModeIfNeed(SP_KEY_WEBVIEW_MODE_FOR_MM, sWebViewModeForMM.ordinal());
                return sWebViewModeForMM;
            } else {
                int webViewModeForMM2 = WebDebugCfg.getInst().getWebViewModeForMM();
                if (webViewModeForMM2 < 0) {
                    webViewModeForMM2 = CommandCfg.getInstance().getWebViewModeCommandForMM();
                }
                if (webViewModeForMM2 >= XWebSdk.WebViewModeForMM.NOT_IN_MM.ordinal() && webViewModeForMM2 < XWebSdk.WebViewModeForMM.values().length) {
                    sWebViewModeForMM = XWebSdk.WebViewModeForMM.values()[webViewModeForMM2];
                }
                XWebLog.m21911i(TAG, "getWebViewModeCommandForMM, value:" + webViewModeForMM2);
                saveWebViewModeIfNeed(SP_KEY_WEBVIEW_MODE_FOR_MM, sWebViewModeForMM.ordinal());
                return sWebViewModeForMM;
            }
        } else {
            sWebViewModeForMM = XWebSdk.WebViewModeForMM.values()[sharedPreferencesForMultiProcess.getInt(SP_KEY_WEBVIEW_MODE_FOR_MM, CommandCfg.getInstance().getMMWebViewDowngradeMode())];
            XWebLog.m21911i(TAG, "getWebViewModeCommandForMM, already checked in mm process:" + sWebViewModeForMM);
            return sWebViewModeForMM;
        }
    }

    public static synchronized void init() {
        synchronized (XWebWebViewMode.class) {
            SharedPreferences sharedPreferencesForMultiProcess = XWebSharedPreferenceUtil.getSharedPreferencesForMultiProcess();
            if (sharedPreferencesForMultiProcess != null && XWalkEnvironment.getPackageName().equalsIgnoreCase(XWalkEnvironment.getProcessName())) {
                XWebLog.m21911i(TAG, "init, remove webview mode");
                sharedPreferencesForMultiProcess.edit().remove(SP_KEY_WEBVIEW_MODE_FOR_MM).apply();
                sharedPreferencesForMultiProcess.edit().remove(SP_KEY_WEBVIEW_MODE_FOR_APPBRAND).apply();
            }
        }
    }

    private static synchronized void saveWebViewModeIfNeed(String str, int i) {
        SharedPreferences sharedPreferencesForMultiProcess;
        synchronized (XWebWebViewMode.class) {
            if (XWalkEnvironment.getPackageName().equalsIgnoreCase(XWalkEnvironment.getProcessName()) && (sharedPreferencesForMultiProcess = XWebSharedPreferenceUtil.getSharedPreferencesForMultiProcess()) != null) {
                XWebLog.m21911i(TAG, "saveWebViewModeIfNeed, key:" + str + ", value:" + i);
                sharedPreferencesForMultiProcess.edit().putInt(str, i).apply();
            }
        }
    }
}
