package com.tencent.xweb;

import android.content.Context;
import android.os.Bundle;
import com.tencent.xweb.LibraryLoader;
import com.tencent.xweb.WebView;
import com.tencent.xweb.downloader.IFileDownloaderProxy;
import com.tencent.xweb.downloader.WXFileDownloaderBridge;
import com.tencent.xweb.internal.ConstValue;
import com.tencent.xweb.internal.IWebViewProvider;
import com.tencent.xweb.internal.IXWebUpdateListener;
import com.tencent.xweb.util.ChromiumVersionUtil;
import com.tencent.xweb.util.IXWebLogClient;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.WebViewExtensionListener;
import com.tencent.xweb.util.WebViewWrapperFactory;
import com.tencent.xweb.util.XWebFileUtil;
import com.tencent.xweb.util.XWebGrayValueUtil;
import com.tencent.xweb.util.XWebLog;
import com.tencent.xweb.util.XWebSharedPreferenceUtil;
import com.tencent.xweb.util.XWebUpdateConfigUtil;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.xwalk.core.XWalkEnvironment;

public class XWebSdk extends XWebSdkInternal {
    private static final String TAG = "XWebSdk";

    public enum WebViewModeForMM {
        NOT_IN_MM,
        DISABLE_MULTI_PROCESS,
        RENDER_SANDBOX,
        RENDER_UNSANDBOX,
        GPU_RENDER_SANDBOX,
        GPU_RENDER_UNSANDBOX
    }

    public enum WebViewModeForAppBrand {
        DISABLE_MULTI_PROCESS,
        RENDER_UNSANDBOX,
        GPU_RENDER_UNSANDBOX,
        RENDER_SANDBOX,
        GPU_RENDER_SANDBOX
    }

    public static void appendAppInfo(String str) {
        XWalkEnvironment.appendAppInfo(str);
    }

    public static void bindNativeTrans(long j) {
        XWebSdkInternal.bindNativeTransInternal(j);
    }

    public static void checkConfigUpdate(Context context) {
        WCWebUpdater.checkConfigUpdate(context);
    }

    public static void checkNeedDownload() {
        WCWebUpdater.checkNeedDownload();
    }

    public static void clearAllWebViewCache(boolean z) {
        XWebSdkInternal.clearAllWebViewCacheInternal(z);
    }

    public static void forceKillGpuProcess() {
        XWebSdkInternal.forceKillGpuProcessInternal();
    }

    public static void forceKillRenderProcess() {
        XWebSdkInternal.forceKillRenderProcessInternal();
    }

    public static long getApplicationStartTime() {
        return XWebSdkInternal.getApplicationStartTime();
    }

    public static int getAvailableVersion() {
        return XWalkEnvironment.getAvailableVersion();
    }

    public static boolean getBuildConfigNeedTurnOffDynamicCode() {
        return XWalkEnvironment.getBuildConfigNeedTurnOffDynamicCode();
    }

    public static boolean getBuildConfigShouldEmbedXWebCore() {
        return XWalkEnvironment.getBuildConfigShouldEmbedXWebCore();
    }

    public static String getConfigValue(String str) {
        return CommandCfg.getInstance().getCmd(str);
    }

    public static boolean getConfigValueAsBoolean(String str, String str2, boolean z) {
        return CommandCfg.getInstance().getCmdAsBoolean(str, str2, z);
    }

    public static int getConfigValueAsInt(String str, String str2, int i) {
        return CommandCfg.getInstance().getCmdAsInt(str, str2, i);
    }

    public static String getCurrentVersionDir(Context context) {
        return XWebFileUtil.getCurrentVersionDir(context);
    }

    public static boolean getDowngradeToSys() {
        return XWebChildProcessMonitor.getShouldSwitchToSys();
    }

    public static boolean getEnableRemoteDebug() {
        return XWebPreferences.getBooleanValue(IXWebPreferences.REMOTE_DEBUGGING);
    }

    public static boolean getEnableSandbox() {
        return XWalkEnvironment.getEnableSandbox();
    }

    public static Bundle getExtendBundle() {
        return XWalkEnvironment.getExtendBundle();
    }

    public static int getInstalledNewstVersion(Context context) {
        return XWalkEnvironment.getInstalledNewstVersion(context);
    }

    public static int getMultiProcessType() {
        return XWalkEnvironment.getMultiProcessType();
    }

    public static String getNewestVersionDir(Context context) {
        return XWebFileUtil.getNewestVersionDir(context);
    }

    public static String getPluginConfigValue(String str) {
        return CommandCfgPlugin.getInstance().getCmd(str);
    }

    public static String getPredownloadVersionDir(Context context) {
        return XWebFileUtil.getPredownloadVersionDir(context);
    }

    public static int getRenderSandboxProcessMemory() {
        return XWebSdkInternal.getRenderSandboxProcessMemoryInternal();
    }

    public static boolean getUsingCustomContext() {
        return XWalkEnvironment.getUsingCustomContext();
    }

    public static boolean getV8LiteMode() {
        return XWalkEnvironment.getV8LiteMode();
    }

    public static int getWebViewCount() {
        return WebViewCounter.getCount();
    }

    public static WebViewModeForAppBrand getWebViewModeCommandForAppBrand() {
        return XWebWebViewMode.getWebViewModeCommandForAppBrand();
    }

    public static WebViewModeForMM getWebViewModeCommandForMM() {
        return XWebWebViewMode.getWebViewModeCommandForMM();
    }

    public static Bundle getXWebInitConfigBundle() {
        return XWalkEnvironment.getXWebInitConfigBundle();
    }

    public static int getXWebSdkVersion() {
        return XWalkEnvironment.SDK_VERSION;
    }

    public static boolean hasWebViewCoreInited() {
        return WebView.hasInited();
    }

    public static boolean hasXWebFeature(int i) {
        return XWebSdkInternal.hasXWebFeatureInternal(i);
    }

    public static void initWebviewCore(Context context, WebView.WebViewKind webViewKind, String str, WebView.PreInitCallback preInitCallback) {
        WebView.initWebviewCore(context, webViewKind, str, preInitCallback);
    }

    public static synchronized void initXWebEnvironment(Context context, XWebEnvironmentConfig xWebEnvironmentConfig) {
        synchronized (XWebSdk.class) {
            XWebSdkInternal.initXWebEnvironmentInternal(context, xWebEnvironmentConfig);
        }
    }

    public static boolean isBusy() {
        return WCWebUpdater.isBusy();
    }

    public static boolean isCurrentSupportCustomContext() {
        return XWalkEnvironment.isCurrentSupportCustomContext();
    }

    public static boolean isCurrentVersionSupportCustomContext() {
        return XWalkEnvironment.isCurrentVersionSupportCustomContext();
    }

    public static boolean isCurrentVersionSupportCustomInputForAppbrand() {
        return XWalkEnvironment.isCurrentVersionSupportCustomInputForAppbrand();
    }

    public static boolean isCurrentVersionSupportCustomTextAreaForAppbrand() {
        return XWalkEnvironment.isCurrentVersionSupportCustomTextAreaForAppbrand();
    }

    public static boolean isCurrentVersionSupportExtendPluginForAppbrand() {
        return XWalkEnvironment.isCurrentVersionSupportExtendPluginForAppbrand();
    }

    public static boolean isCurrentVersionSupportMapExtendPluginForAppbrand() {
        return XWalkEnvironment.isCurrentVersionSupportMapExtendPluginForAppbrand();
    }

    public static boolean isCurrentVersionSupportNativeView() {
        return XWalkEnvironment.isCurrentVersionSupportNativeView();
    }

    public static boolean isSysWebView() {
        return WebView.isSys();
    }

    public static boolean isXWebApplicationContextReady() {
        return XWalkEnvironment.getApplicationContext() != null;
    }

    public static boolean isXWebChildProcessCrashDumpFiles(File file) {
        return XWebCrashMonitor.isXWebChildProcessCrashDumpFiles(file);
    }

    public static boolean isXWebCoreInited() {
        return WebView.isXWebCoreInited();
    }

    public static boolean isXWebView() {
        return WebView.isXWeb();
    }

    public static boolean needCheckUpdate(boolean z) {
        return WCWebUpdater.needCheckUpdate(z);
    }

    public static boolean needRebootProcess() {
        return WebView.needRebootProcess();
    }

    public static boolean needSwitchToTools(String str) {
        return UrlDispatcher.needSwitchToTools(str);
    }

    public static boolean needUseXWeb(String str) {
        return UrlDispatcher.needUseXWeb(str);
    }

    public static void onReportXWebCrash(File file) {
        XWebCrashMonitor.onReportXWebCrash(file);
    }

    public static void preInitGpuProcess() {
        XWebSdkInternal.preInitGpuProcessInternal();
    }

    public static void preInitRenderProcess() {
        XWebSdkInternal.preInitRenderProcessInternal();
    }

    public static void registerBroadcastListener(Context context, IXWebBroadcastListener iXWebBroadcastListener) {
        XWebBroadcastListenerManager.registerListener(context, iXWebBroadcastListener);
    }

    public static void runCommand(Bundle bundle) {
        IWebViewProvider xWebViewProvider = WebViewWrapperFactory.getXWebViewProvider();
        if (xWebViewProvider != null) {
            xWebViewProvider.execute(ConstValue.STR_CMD_RUN_XWEB_COMMAND, new Object[]{bundle});
        }
    }

    public static int safeGetChromiumVersion() {
        return ChromiumVersionUtil.safeGetChromiumVersion();
    }

    public static void setAppBrandId(String str) {
        XWebSdkInternal.setAppBrandIdInternal(str);
    }

    public static void setApplicationStartTime(long j) {
        XWebSdkInternal.setApplicationStartTime(j);
    }

    public static void setBaseConfigUpdatePeriod(long j) {
        XWebUpdateConfigUtil.setBaseConfigUpdatePeriod(j);
    }

    public static void setCustomDensity(float f) {
        XWalkEnvironment.setCustomDensity(f);
    }

    @Deprecated
    public static synchronized void setEmbedInstallLibDir(String str) {
        synchronized (XWebSdk.class) {
            XWebEmbedSetting.setEmbedInstallLibDir(str);
        }
    }

    public static void setEnableCheckCertificate(boolean z) {
        XWalkEnvironment.setEnableCheckCertificate(z);
    }

    public static void setEnableRemoteDebug(boolean z) {
        XWebPreferences.setValue(IXWebPreferences.REMOTE_DEBUGGING, z);
    }

    public static void setEnableSandbox(boolean z) {
        XWalkEnvironment.setEnableSandbox(z);
    }

    public static void setFileDownloaderProxy(IFileDownloaderProxy iFileDownloaderProxy) {
        WXFileDownloaderBridge.setFileDownloaderProxy(iFileDownloaderProxy);
    }

    public static synchronized void setForbidDownloadCode(boolean z) {
        synchronized (XWebSdk.class) {
            XWebEmbedSetting.setForbidDownloadCode(z);
        }
    }

    public static void setForceCheckUpdate() {
        IWebViewProvider xWebViewProvider = WebViewWrapperFactory.getXWebViewProvider();
        if (xWebViewProvider != null) {
            xWebViewProvider.execute(ConstValue.STR_CMD_SET_FORCE_CHECK_UPDATE, new Object[0]);
        }
    }

    public static void setForceDarkBehavior(XWalkEnvironment.ForceDarkBehavior forceDarkBehavior) {
        XWalkEnvironment.setForceDarkBehavior(forceDarkBehavior);
    }

    public static void setForceDarkMode(boolean z) {
        XWalkEnvironment.setForceDarkMode(z);
    }

    public static boolean setGrayValueByUserId(int i) {
        return XWebGrayValueUtil.setGrayValueByUserId(i);
    }

    public static boolean setIpType(int i) {
        return XWebSdkInternal.setIpTypeInternal(i);
    }

    public static synchronized void setIsEmbedDirReady(boolean z) {
        synchronized (XWebSdk.class) {
            XWebEmbedSetting.setIsEmbedDirReady(z);
        }
    }

    public static void setLibraryLoader(LibraryLoader.ILibraryLoader iLibraryLoader) {
        LibraryLoader.setLibraryLoader(iLibraryLoader);
    }

    public static void setLocale(Locale locale) {
        XWalkEnvironment.setLocale(locale);
    }

    public static void setLogInterface(IXWebLogClient iXWebLogClient) {
        XWebLog.setLogClient(iXWebLogClient);
    }

    public static void setMultiProcessType(int i) {
        XWalkEnvironment.setMultiProcessType(i);
    }

    public static void setPluginConfigUpdatePeriod(int i) {
        XWebUpdateConfigUtil.setPluginConfigUpdatePeriod(i);
    }

    public static void setReportInterface(WebViewReporterInterface webViewReporterInterface) {
        WXWebReporter.setReporterCallback(webViewReporterInterface);
    }

    public static void setSharedPreferenceProvider(ISharedPreferenceProvider iSharedPreferenceProvider) {
        XWebSharedPreferenceUtil.setSharedPreferenceProvider(iSharedPreferenceProvider);
    }

    public static synchronized void setSoLibDirs(List<File> list) {
        synchronized (XWebSdk.class) {
            XWebEmbedSetting.setSoLibDirs(list);
        }
    }

    public static void setTempBaseConfigUrl(String str) {
        XWebUpdateConfigUtil.setTempBaseConfigUrl(str);
    }

    public static void setTempPluginConfigUrl(String str) {
        XWebUpdateConfigUtil.setTempPluginConfigUrl(str);
    }

    public static void setUsingCustomContext(boolean z) {
        XWalkEnvironment.setUsingCustomContext(z);
    }

    public static void setV8LiteMode(boolean z) {
        XWalkEnvironment.setV8LiteMode(z);
    }

    public static void setWaitForXWeb(boolean z) {
        XWebSdkInternal.setWaitForXWebInternal(z);
    }

    public static void setWebViewExtensionListener(WebViewExtensionListener webViewExtensionListener) {
        XWalkEnvironment.setWebViewExtensionListener(webViewExtensionListener);
    }

    public static void setXWebReportRequestIpInterface(XWebReportRequestIpInterface xWebReportRequestIpInterface) {
        XWebRuntimeToSdkHelper.setXWebReportRequestIpInterface(xWebReportRequestIpInterface);
    }

    public static void setXWebUpdateListener(IXWebUpdateListener iXWebUpdateListener) {
        XWebSdkInternal.setXWebUpdateListenerInternal(iXWebUpdateListener);
    }

    public static void startCheck(Context context, HashMap<String, String> hashMap) {
        WCWebUpdater.startCheck(context, hashMap);
    }

    public static void startMemoryDump(XWebMemoryDumpInterface xWebMemoryDumpInterface) {
        XWebRuntimeToSdkHelper.setXWebMemoryDumpInterface(xWebMemoryDumpInterface);
        IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(WebView.getCurrentModuleWebCoreType());
        if (webViewProvider != null) {
            webViewProvider.invokeRuntimeChannel(ConstValue.INVOKE_RUNTIME_ID_ASYC_MEMORY_DUMP, new Object[]{""});
        }
    }

    public static boolean supportMultiProcess(Context context) {
        return XWalkEnvironment.isPinusWebViewCoreFromInstalledNewstVersion(context) && getInstalledNewstVersion(context) >= CommandCfg.getInstance().getSupportMultiProcessMinApkVersion();
    }

    public static void tryStartDownload() {
        WCWebUpdater.tryStartDownload();
    }

    public static void unregisterBroadcastListener(IXWebBroadcastListener iXWebBroadcastListener) {
        XWebBroadcastListenerManager.unregisterListener(iXWebBroadcastListener);
    }

    public static void updateResourceLocale(Locale locale) {
        XWebSdkInternal.updateResourceLocaleInternal(locale);
    }

    public static String getConfigValue(String str, String str2) {
        return CommandCfg.getInstance().getCmd(str, str2);
    }

    public static String getPluginConfigValue(String str, String str2) {
        return CommandCfgPlugin.getInstance().getCmd(str, str2);
    }

    public static void setTempBaseConfigUrl(String str, String str2) {
        XWebUpdateConfigUtil.setTempBaseConfigUrl(str, str2);
    }

    public static void setTempPluginConfigUrl(String str, String str2) {
        XWebUpdateConfigUtil.setTempPluginConfigUrl(str, str2);
    }
}
