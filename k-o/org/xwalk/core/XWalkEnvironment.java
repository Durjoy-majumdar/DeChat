package org.xwalk.core;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.xweb.DeprecatedOutsideXWebSdk;
import com.tencent.xweb.WebDebugCfg;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebBroadcastListener;
import com.tencent.xweb.XWebBroadcastListenerManager;
import com.tencent.xweb.XWebChildProcessMonitor;
import com.tencent.xweb.XWebCoreContentProvider;
import com.tencent.xweb.XWebFeature;
import com.tencent.xweb.XWebWebViewMode;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.internal.ConstValue;
import com.tencent.xweb.internal.IWebViewProvider;
import com.tencent.xweb.util.AbiUtil;
import com.tencent.xweb.util.ProcessUtil;
import com.tencent.xweb.util.WebViewExtensionListener;
import com.tencent.xweb.util.WebViewWrapperFactory;
import com.tencent.xweb.util.XWebChoreHandler;
import com.tencent.xweb.util.XWebCoreInfo;
import com.tencent.xweb.util.XWebFileUtil;
import com.tencent.xweb.util.XWebLog;
import com.tencent.xweb.util.XWebSharedPreferenceUtil;
import com.tencent.xweb.util.XWebUpdateConfigUtil;
import com.tencent.xweb.xwalk.plugin.XWalkPluginManager;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class XWalkEnvironment {
    public static final String CRASH_DUMP_FILE_SUFFIX = "xweb_sandbox_crash";
    public static final String CRASH_DUMP_FILE_SUFFIX_FOR_GPU = "xweb_gpu_crash";
    public static final String CRASH_DUMP_FILE_SUFFIX_FOR_RENDER_UNSANDBOX = "xweb_render_crash";
    public static final String EXTEND_BUNDLE_CUSTOM_DENSITY = "customDensity";
    public static final String LOCAL_TEST_ZIP_NAME = "runtime_package.zip";
    public static final String MODULE_APPBRAND = "appbrand";
    public static final String MODULE_MM = "mm";
    public static final String MODULE_TOOLS = "tools";
    public static final int MULTI_PROCESS_TYPE_DISABLE = 0;
    public static final int MULTI_PROCESS_TYPE_RENDERER = 1;
    public static final int MULTI_PROCESS_TYPE_RENDERER_AND_GPU = 2;
    public static final String PINUS_SO_NAME = "libxwebcore.so";
    public static final String RUNTIME_ABI_ARM32_STR = "armeabi-v7a";
    public static final String RUNTIME_ABI_ARM64_STR = "arm64-v8a";
    public static final int SDK_SUPPORT_INVOKE_NOTIFY_MIN_APKVERSION = 153;
    public static final int SDK_SUPPORT_INVOKE_RUNTIME_MIN_APKVERSION = 255;
    public static final int SDK_SUPPORT_MIN_APKVERSION = 2000;
    public static final int SDK_VERSION = 20230303;
    private static final String TAG = "XWalkEnvironment";
    public static final int TEST_APK_START_VERSION = 100000000;
    public static final String XWALK_SO_NAME = "libxwalkcore.so";
    public static boolean isTurnOnKVLog = false;
    private static int multiProcessType = 0;
    private static final Set<String> sAppInfos = new HashSet();
    private static Context sApplicationContext;
    private static boolean sEnableCheckCertificate;
    private static boolean sEnableSandbox = false;
    private static boolean sEnableV8Lite;
    private static Bundle sExtendBundle = new Bundle();
    private static int sForceDarkBehavior = 2;
    private static boolean sIsForceDarkMode = false;
    private static boolean sIsInited = false;
    private static String sLocaleString;
    private static String sPrivilegedServicesName;
    private static String sSandboxedServicesName;
    private static String sStrCurrentProcessName;
    private static boolean sUsingCustomContext = false;
    private static WebViewExtensionListener sWebViewExtensionListener;
    private static XWebCoreInfo sXWebCoreVersionInfo;
    private static final Bundle sXWebInitConfigBundle = new Bundle();
    private static final XWebBroadcastListener xwebBroadcastListener = new XWebBroadcastListener();

    public enum ForceDarkBehavior {
        FORCE_DARK_ONLY,
        MEDIA_QUERY_ONLY,
        PREFER_MEDIA_QUERY_OVER_FORCE_DARK
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void appendAppInfo(String str) {
        XWebLog.m21911i(TAG, "appendAppInfo:" + str);
        sAppInfos.add(str);
    }

    public static boolean containsAppInfo(String str) {
        XWebLog.m21911i(TAG, "containsAppInfo, strInfos:" + str);
        String[] split = str.split("&");
        if (!(split == null || split.length == 0)) {
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && !sAppInfos.contains(str2.trim())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Context convertContextToApplication(Context context) {
        return context instanceof Application ? context : context.getApplicationContext();
    }

    public static String dumpAppInfo() {
        String join = TextUtils.join(";", sAppInfos);
        XWebLog.m21911i(TAG, "dumpAppInfo:" + join);
        return join;
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static Context getApplicationContext() {
        return sApplicationContext;
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static int getAvailableVersion() {
        XWebCoreInfo xWebCoreInfo = sXWebCoreVersionInfo;
        if (xWebCoreInfo == null) {
            return -1;
        }
        return xWebCoreInfo.ver;
    }

    public static String getAvailableVersionDetail() {
        XWebCoreInfo xWebCoreInfo = sXWebCoreVersionInfo;
        return xWebCoreInfo != null ? xWebCoreInfo.verDetail : "";
    }

    public static boolean getBuildConfigForceXWebCore() {
        return false;
    }

    public static boolean getBuildConfigNeedTurnOffDynamicCode() {
        return false;
    }

    public static boolean getBuildConfigShouldEmbedXWebCore() {
        return false;
    }

    public static boolean getBuildConfigThirdPartyRelease() {
        return false;
    }

    public static boolean getBuildConfigXWebTestMode() {
        return false;
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static ContentResolver getContentResolver() {
        Context context = sApplicationContext;
        if (context != null) {
            return context.getContentResolver();
        }
        XWebLog.m21909e(TAG, "getContentResolver, sApplicationContext is null");
        return null;
    }

    public static float getCustomDensity() {
        float f;
        synchronized (sExtendBundle) {
            f = sExtendBundle.getFloat(EXTEND_BUNDLE_CUSTOM_DENSITY, 0.0f);
        }
        return f;
    }

    public static boolean getEnableCheckCertificate() {
        return sEnableCheckCertificate;
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static synchronized boolean getEnableSandbox() {
        boolean z;
        synchronized (XWalkEnvironment.class) {
            if (Build.VERSION.SDK_INT < 26) {
                XWebLog.m21911i(TAG, "getEnableSandbox, disable sandbox because android version below O");
                sEnableSandbox = false;
            }
            XWebLog.m21911i(TAG, "getEnableSandbox:" + sEnableSandbox);
            z = sEnableSandbox;
        }
        return z;
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static Bundle getExtendBundle() {
        return sExtendBundle;
    }

    private static boolean getFeatureSupport(int i) {
        IWebViewProvider webViewProvider = getWebViewProvider();
        if (webViewProvider != null) {
            Object execute = webViewProvider.execute(ConstValue.STR_CMD_FEATURE_SUPPORT, new Object[]{Integer.valueOf(i)});
            if (execute instanceof Boolean) {
                return ((Boolean) execute).booleanValue();
            }
        }
        return false;
    }

    public static int getForceDarkBehavior() {
        return sForceDarkBehavior;
    }

    public static boolean getForceDarkMode() {
        return sIsForceDarkMode;
    }

    public static Object getInitConfig(String str) {
        Object obj;
        Bundle bundle = sXWebInitConfigBundle;
        synchronized (bundle) {
            obj = bundle.get(str);
        }
        return obj;
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static int getInstalledNewstVersion(Context context) {
        return XWebCoreInfo.getInstalledNewestVersionForCurAbi(context);
    }

    public static int getInstalledNewstVersionForCurAbi() {
        return getInstalledNewstVersion(AbiUtil.getRuntimeAbi());
    }

    public static int getInstalledNewstVersionForPredownAbi() {
        String runtimeAbi = AbiUtil.getRuntimeAbi();
        String str = RUNTIME_ABI_ARM32_STR;
        if (str.equalsIgnoreCase(runtimeAbi)) {
            str = RUNTIME_ABI_ARM64_STR;
        }
        return getInstalledNewstVersion(str);
    }

    public static int getInstalledPluginVersion(Context context, String str) {
        if (context == null) {
            XWebLog.m21909e(TAG, "getInstalledPluginVersion, context is null");
            return -2;
        }
        SharedPreferences sharedPreferencesForPluginVersionInfo = XWebSharedPreferenceUtil.getSharedPreferencesForPluginVersionInfo(str);
        if (sharedPreferencesForPluginVersionInfo != null) {
            return sharedPreferencesForPluginVersionInfo.getInt(XWebSharedPreferenceUtil.SP_KEY_PLUGIN_AVAILABLE_VERSION, -1);
        }
        XWebLog.m21909e(TAG, "getInstalledPluginVersion, sp is null");
        return -3;
    }

    public static Locale getLocale() {
        String str = sLocaleString;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return Locale.forLanguageTag(sLocaleString);
    }

    public static String getLocaleString() {
        return sLocaleString;
    }

    public static String getModuleName() {
        String processName = getProcessName();
        return processName == null ? "" : processName.contains(XVFSFile.PATH_SEPARATOR) ? processName.substring(processName.lastIndexOf(XVFSFile.PATH_SEPARATOR) + 1).toLowerCase() : processName.contains(".") ? processName.substring(processName.lastIndexOf(".") + 1).toLowerCase() : processName;
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static synchronized int getMultiProcessType() {
        synchronized (XWalkEnvironment.class) {
            int i = multiProcessType;
            if (i < 0 || i > 2) {
                XWebLog.m21913w(TAG, "getMultiProcessType, MULTI_PROCESS_TYPE_DISABLE");
                return 0;
            }
            XWebLog.m21911i(TAG, "getMultiProcessType, multiProcessType:" + multiProcessType);
            int i2 = multiProcessType;
            return i2;
        }
    }

    public static String getPackageName() {
        Context context = sApplicationContext;
        if (context != null) {
            return context.getPackageName();
        }
        XWebLog.m21909e(TAG, "getPackageName, sApplicationContext is null");
        return "";
    }

    public static String getPrivilegedServicesName() {
        return sPrivilegedServicesName;
    }

    public static String getProcessName() {
        if (!TextUtils.isEmpty(sStrCurrentProcessName)) {
            return sStrCurrentProcessName;
        }
        Object initConfig = getInitConfig(ConstValue.INIT_CONFIG_KEY_PROCESSNAME);
        if (initConfig != null) {
            String obj = initConfig.toString();
            sStrCurrentProcessName = obj;
            return obj;
        }
        String safeGetProcessName = ProcessUtil.safeGetProcessName(getApplicationContext());
        sStrCurrentProcessName = safeGetProcessName;
        return safeGetProcessName;
    }

    public static String getSafeModuleName(String str) {
        try {
            String moduleName = getModuleName();
            if (!MODULE_TOOLS.equalsIgnoreCase(moduleName) && !MODULE_MM.equalsIgnoreCase(moduleName)) {
                if (!"support".equalsIgnoreCase(moduleName)) {
                    if (moduleName.startsWith(MODULE_APPBRAND)) {
                        XWebLog.m21911i(TAG, "getSafeModuleName, module = appbrand");
                        return MODULE_APPBRAND;
                    }
                    XWebLog.m21911i(TAG, "getSafeModuleName, unknown:" + moduleName + ", use defaultVal:" + str);
                    return str;
                }
            }
            XWebLog.m21911i(TAG, "getSafeModuleName, module = " + moduleName);
            return moduleName;
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "getSafeModuleName, use defaultVal:" + str + ", error", th);
            return str;
        }
    }

    public static String getSandboxedServicesName() {
        return sSandboxedServicesName;
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean getUsingCustomContext() {
        if (isCurrentSupportCustomContext()) {
            return getUsingCustomContextInternal();
        }
        return false;
    }

    public static boolean getUsingCustomContextInternal() {
        return sUsingCustomContext;
    }

    public static boolean getV8LiteMode() {
        return sEnableV8Lite;
    }

    public static WebViewExtensionListener getWebViewExtensionListener() {
        return sWebViewExtensionListener;
    }

    public static WebView.WebViewKind getWebViewKindFromAvailableVersion() {
        return getWebViewKindFromVersion(getAvailableVersion());
    }

    public static WebView.WebViewKind getWebViewKindFromInstalledNewstVersion(Context context) {
        return getWebViewKindFromVersion(getInstalledNewstVersion(context));
    }

    public static WebView.WebViewKind getWebViewKindFromVersion(int i) {
        if (!sIsInited) {
            XWebLog.m21913w(TAG, "getWebViewKindFromVersion, not init yet, version:" + i);
            return WebView.WebViewKind.WV_KIND_NONE;
        } else if (XWebFileUtil.isExtractedCoreDirFileExist(i, PINUS_SO_NAME)) {
            return WebView.WebViewKind.WV_KIND_PINUS;
        } else {
            XWebLog.m21913w(TAG, "getWebViewKindFromVersion, version:" + i + ", no pinus so file exist");
            return WebView.WebViewKind.WV_KIND_NONE;
        }
    }

    private static IWebViewProvider getWebViewProvider() {
        return WebViewWrapperFactory.getWebViewProvider(getWebViewKindFromAvailableVersion());
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static Bundle getXWebInitConfigBundle() {
        return sXWebInitConfigBundle;
    }

    public static boolean hasAvailableVersion() {
        return 2000 <= getAvailableVersion();
    }

    public static boolean hasInstalledAvailableVersion() {
        return 2000 <= getInstalledNewstVersionForCurAbi();
    }

    public static synchronized void init(Context context) {
        synchronized (XWalkEnvironment.class) {
            if (context == null) {
                XWebLog.m21913w(TAG, "init, invalid context");
            } else if (sApplicationContext != null) {
                XWebLog.m21913w(TAG, "init, already init");
            } else {
                XWebLog.m21913w(TAG, "init start, sdkVersion:20230303, stack:" + Log.getStackTraceString(new Exception("please ignore this exception")));
                sApplicationContext = convertContextToApplication(context);
                XWebLog.m21913w(TAG, "init, application context:" + sApplicationContext);
                XWebSharedPreferenceUtil.setApplicationContext(sApplicationContext);
                sXWebCoreVersionInfo = initCoreVersionInfo();
                XWebLog.m21911i(TAG, "init, coreInfo:" + sXWebCoreVersionInfo);
                showBuildConfigs();
                XWebChoreHandler.setDataDirSuffix();
                XWalkPluginManager.initPlugins();
                WebDebugCfg.getInst().load(context);
                isTurnOnKVLog();
                initProcessServices();
                initAppInfos();
                XWebChildProcessMonitor.init();
                XWebWebViewMode.init();
                XWebBroadcastListenerManager.registerListener(sApplicationContext, xwebBroadcastListener);
                XWebCoreContentProvider.onXWebInitFinished();
                sIsInited = true;
                XWebLog.m21913w(TAG, "init end, processName:" + getProcessName());
            }
        }
    }

    private static void initAppInfos() {
        if (getBuildConfigShouldEmbedXWebCore()) {
            appendAppInfo(ConstValue.APP_INFO_EMBED_XWEB);
        }
    }

    private static XWebCoreInfo initCoreVersionInfo() {
        XWebCoreInfo.resetUsingCoreVersionIfNeed();
        String runtimeAbi = AbiUtil.getRuntimeAbi();
        XWebCoreInfo versionInfoForAbi = XWebCoreInfo.getVersionInfoForAbi(runtimeAbi);
        int i = versionInfoForAbi.ver;
        if (i > 0 && !XWebFileUtil.isDownloadApkFileExist(i)) {
            XWebLog.m21911i(TAG, "initCoreVersionInfo, no apk in version(" + versionInfoForAbi.ver + ") dir");
            versionInfoForAbi = new XWebCoreInfo(-1, (String) null, runtimeAbi);
            XWebCoreInfo.setVersionInfo(versionInfoForAbi);
        }
        int i2 = versionInfoForAbi.ver;
        if (i2 > 0 && XWebFileUtil.isExtractedCoreDirFileExist(i2, XWALK_SO_NAME)) {
            XWebLog.m21911i(TAG, "initCoreVersionInfo, xwalk core version(" + versionInfoForAbi.ver + ") no longer support");
            versionInfoForAbi = new XWebCoreInfo(-1, (String) null, runtimeAbi);
            XWebCoreInfo.setVersionInfo(versionInfoForAbi);
        }
        int i3 = versionInfoForAbi.ver;
        if (i3 > 0) {
            XWebCoreInfo.saveUsingCoreVersion(i3);
        }
        return versionInfoForAbi;
    }

    private static void initProcessServices() {
        String safeModuleName = getSafeModuleName(MODULE_TOOLS);
        if (safeModuleName != null && safeModuleName.equalsIgnoreCase(MODULE_MM)) {
            setServicesName("com.tencent.xweb.pinus.sdk.process.PrivilegedProcessService", "com.tencent.xweb.pinus.sdk.process.SandboxedProcessService");
        } else if (safeModuleName != null && safeModuleName.equalsIgnoreCase(MODULE_APPBRAND)) {
            setServicesName("com.tencent.xweb.pinus.sdk.process.AppBrandPrivilegedProcessService", "com.tencent.xweb.pinus.sdk.process.AppBrandSandboxedProcessService");
        }
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean isCurrentSupportCustomContext() {
        if (WebView.getCurrentModuleWebCoreType() == WebView.WebViewKind.WV_KIND_PINUS) {
            return isCurrentVersionSupportCustomContext();
        }
        return false;
    }

    public static boolean isCurrentVersionSupportConfigureV8Lite() {
        return hasAvailableVersion() && getFeatureSupport(XWebFeature.INTERFACE_CONFIGURE_V8_LITE);
    }

    public static boolean isCurrentVersionSupportContentHeightChange() {
        return hasAvailableVersion() && getFeatureSupport(2014);
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean isCurrentVersionSupportCustomContext() {
        return hasAvailableVersion() && getFeatureSupport(1020);
    }

    public static boolean isCurrentVersionSupportCustomInputForAppbrand() {
        return hasAvailableVersion() && getFeatureSupport(1041);
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean isCurrentVersionSupportCustomTextAreaForAppbrand() {
        return hasAvailableVersion() && getFeatureSupport(1012);
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean isCurrentVersionSupportExtendPluginForAppbrand() {
        return hasAvailableVersion() && getAvailableVersion() >= 300;
    }

    public static boolean isCurrentVersionSupportForceDarkMode() {
        return hasAvailableVersion() && getFeatureSupport(1021);
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean isCurrentVersionSupportMapExtendPluginForAppbrand() {
        return hasAvailableVersion() && getFeatureSupport(1011);
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean isCurrentVersionSupportNativeView() {
        return hasAvailableVersion() && getFeatureSupport(1013);
    }

    public static boolean isCurrentVersionSupportScreenshotForSameLayer() {
        return hasAvailableVersion() && getFeatureSupport(2010);
    }

    public static boolean isCurrentVersionSupportSetWebContentsSize() {
        return hasAvailableVersion() && getFeatureSupport(XWebFeature.INTERFACE_SET_WEB_CONTENTS_SIZE);
    }

    public static boolean isInTestMode() {
        String testBaseConfigUrl = XWebUpdateConfigUtil.getTestBaseConfigUrl();
        return testBaseConfigUrl != null && !testBaseConfigUrl.isEmpty();
    }

    public static boolean isPinusWebViewCoreFromAvailableVersion() {
        return getWebViewKindFromAvailableVersion() == WebView.WebViewKind.WV_KIND_PINUS;
    }

    public static boolean isPinusWebViewCoreFromInstalledNewstVersion(Context context) {
        return getWebViewKindFromInstalledNewstVersion(context) == WebView.WebViewKind.WV_KIND_PINUS;
    }

    public static boolean isTestVersion(int i) {
        return i >= 100000000;
    }

    public static void isTurnOnKVLog() {
        try {
            isTurnOnKVLog = WebDebugCfg.getInst().getEnableLocalDebug();
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "isTurnOnKVLog error", th);
        }
    }

    public static void refreshVersionInfo() {
        sXWebCoreVersionInfo = XWebCoreInfo.getVersionInfoForAbi(AbiUtil.getRuntimeAbi());
    }

    public static void reset() {
        XWebLog.m21911i(TAG, "reset");
        sApplicationContext = null;
        sXWebCoreVersionInfo = null;
        sIsInited = false;
    }

    public static boolean setCoreVersionInfo(int i, String str, String str2) {
        return XWebCoreInfo.setVersionInfo(i, str, str2);
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setCustomDensity(float f) {
        XWebLog.m21911i(TAG, "setCustomDensity:" + f);
        synchronized (sExtendBundle) {
            sExtendBundle.putFloat(EXTEND_BUNDLE_CUSTOM_DENSITY, f);
        }
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setEnableCheckCertificate(boolean z) {
        sEnableCheckCertificate = z;
        IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(WebView.getCurrentModuleWebCoreType());
        if (webViewProvider != null) {
            webViewProvider.execute(ConstValue.STR_CMD_ENABLE_CHECK_CERTIFICATE, new Object[]{Boolean.valueOf(z)});
        }
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static synchronized void setEnableSandbox(boolean z) {
        synchronized (XWalkEnvironment.class) {
            if (Build.VERSION.SDK_INT < 26) {
                XWebLog.m21911i(TAG, "setEnableSandbox, disable sandbox because android version below O");
                sEnableSandbox = false;
            } else {
                XWebLog.m21911i(TAG, "setEnableSandbox:" + z);
                sEnableSandbox = z;
            }
        }
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setForceDarkBehavior(ForceDarkBehavior forceDarkBehavior) {
        if (forceDarkBehavior == ForceDarkBehavior.FORCE_DARK_ONLY) {
            sForceDarkBehavior = 0;
        } else if (forceDarkBehavior == ForceDarkBehavior.MEDIA_QUERY_ONLY) {
            sForceDarkBehavior = 1;
        } else if (forceDarkBehavior == ForceDarkBehavior.PREFER_MEDIA_QUERY_OVER_FORCE_DARK) {
            sForceDarkBehavior = 2;
        }
        XWebLog.m21911i(TAG, "setForceDarkBehavior, forceDarkBehavior:" + forceDarkBehavior);
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setForceDarkMode(boolean z) {
        sIsForceDarkMode = z;
        XWebLog.m21911i(TAG, "setForceDarkMode, forceDarkMode:" + z);
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setLocale(Locale locale) {
        if (locale != null) {
            XWebLog.m21911i(TAG, "setLocale, customize locale:" + locale.toLanguageTag());
            setLocaleString(locale.toLanguageTag());
            return;
        }
        XWebLog.m21913w(TAG, "setLocale, customize locale not set");
    }

    private static void setLocaleString(String str) {
        sLocaleString = str;
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static synchronized void setMultiProcessType(int i) {
        synchronized (XWalkEnvironment.class) {
            XWebLog.m21913w(TAG, "setMultiProcessType, multiProcessType:" + i);
            multiProcessType = i;
        }
    }

    private static void setServicesName(String str, String str2) {
        sPrivilegedServicesName = str;
        sSandboxedServicesName = str2;
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setUsingCustomContext(boolean z) {
        sUsingCustomContext = z;
        XWebLog.m21911i(TAG, "setUsingCustomContext, usingCustomContext:" + z);
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setV8LiteMode(boolean z) {
        sEnableV8Lite = z;
        XWebLog.m21911i(TAG, "setV8LiteMode " + z);
    }

    public static void setWebViewExtensionListener(WebViewExtensionListener webViewExtensionListener) {
        sWebViewExtensionListener = webViewExtensionListener;
    }

    private static void showBuildConfigs() {
        XWebLog.m21911i(TAG, "showBuildConfigs, SHOULD_EMBED_XWEB_CORE:" + getBuildConfigShouldEmbedXWebCore() + ", XWEB_TEST_MODE:" + getBuildConfigXWebTestMode() + ", FORCE_XWEB_CORE:" + getBuildConfigForceXWebCore() + ", NEED_TURN_OFF_DYNAMIC_CODE:" + getBuildConfigNeedTurnOffDynamicCode() + ", THIRD_PARD_RELEASE:" + getBuildConfigThirdPartyRelease());
    }

    public static void tryLoadLocalAssetRuntime(Context context) {
        IWebViewProvider xWebViewProvider = WebViewWrapperFactory.getXWebViewProvider();
        if (xWebViewProvider != null) {
            xWebViewProvider.execute(ConstValue.STR_CMD_TRY_LOAD_LOCAL_ASSET_RUNTIME, new Object[]{context});
        }
    }

    public static int getInstalledNewstVersion(String str) {
        return XWebCoreInfo.getVersionInfoForAbi(str).ver;
    }

    public static int getInitConfig(String str, int i) {
        int i2;
        Bundle bundle = sXWebInitConfigBundle;
        synchronized (bundle) {
            i2 = bundle.getInt(str, i);
        }
        return i2;
    }

    public static String getInitConfig(String str, String str2) {
        String string;
        Bundle bundle = sXWebInitConfigBundle;
        synchronized (bundle) {
            string = bundle.getString(str, str2);
        }
        return string;
    }

    public static boolean getInitConfig(String str, boolean z) {
        boolean z2;
        Bundle bundle = sXWebInitConfigBundle;
        synchronized (bundle) {
            z2 = bundle.getBoolean(str, z);
        }
        return z2;
    }
}
