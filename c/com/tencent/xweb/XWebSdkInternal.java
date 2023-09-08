package com.tencent.xweb;

import android.content.Context;
import com.tencent.xweb.WebView;
import com.tencent.xweb.internal.ConstValue;
import com.tencent.xweb.internal.IWebViewProvider;
import com.tencent.xweb.internal.IXWebUpdateListener;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.WebViewWrapperFactory;
import com.tencent.xweb.util.XWebLog;
import com.tencent.xweb.util.XWebSharedPreferenceUtil;
import java.util.Locale;
import org.xwalk.core.XWalkEnvironment;

class XWebSdkInternal {
    public static final String SP_KEY_IP_TYPE = "IP_TYPE";
    private static final String TAG = "XWebSdkInternal";
    public static long sApplicationStartTime;
    public static IXWebUpdateListener sUpdateListener;
    public static boolean sWaitForXWeb;

    public static void bindNativeTransInternal(long j) {
        try {
            IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(WebView.getCurrentModuleWebCoreType());
            if (webViewProvider != null) {
                webViewProvider.execute(ConstValue.STR_CMD_NATIVE_TRANS_INIT, new Object[]{Long.valueOf(j)});
            }
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "bindNativeTrans, error", th);
        }
    }

    public static void clearAllWebViewCacheInternal(boolean z) {
        try {
            Context applicationContext = XWalkEnvironment.getApplicationContext();
            if (applicationContext == null) {
                XWebLog.m21913w(TAG, "clearAllWebViewCache, invalid context");
                return;
            }
            IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(WebView.getCurrentModuleWebCoreType());
            if (webViewProvider != null) {
                webViewProvider.clearAllWebViewCache(applicationContext, z);
            }
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "clearAllWebViewCache, error", th);
        }
    }

    public static void forceKillGpuProcessInternal() {
        try {
            IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(WebView.getCurrentModuleWebCoreType());
            if (webViewProvider != null) {
                webViewProvider.execute(ConstValue.STR_CMD_FORCE_KILL_GPU_PROCESS, new Object[0]);
            }
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "forceKillGpuProcess, error", th);
        }
    }

    public static void forceKillRenderProcessInternal() {
        try {
            IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(WebView.getCurrentModuleWebCoreType());
            if (webViewProvider != null) {
                webViewProvider.execute(ConstValue.STR_CMD_FORCE_KILL_RENDER_PROCESS, new Object[0]);
            }
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "forceKillRenderProcess, error", th);
        }
    }

    public static long getApplicationStartTime() {
        return sApplicationStartTime;
    }

    public static int getIpType() {
        return XWebSharedPreferenceUtil.getSharedPreferencesForXWalkCore().getInt(SP_KEY_IP_TYPE, -2);
    }

    public static int getRenderSandboxProcessMemoryInternal() {
        if (!WebView.isPinus()) {
            XWebLog.m21913w(TAG, "getRenderSandboxProcessMemory, not pinus now");
            return 0;
        }
        try {
            IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(WebView.getCurrentModuleWebCoreType());
            if (webViewProvider != null) {
                Object execute = webViewProvider.execute(ConstValue.STR_CMD_GET_RENDER_SANDBOX_PROCESS_MEMORY, new Object[0]);
                if (execute instanceof Integer) {
                    return ((Integer) execute).intValue();
                }
                return 0;
            }
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "getRenderSandboxProcessMemory, error", th);
        }
        return 0;
    }

    private static WebDebugCfg getXWebDebugCfg(Context context) {
        WebDebugCfg.getInst().load(context);
        return WebDebugCfg.getInst();
    }

    public static IXWebUpdateListener getXWebUpdateListener() {
        return sUpdateListener;
    }

    public static boolean hasXWebFeatureInternal(int i) {
        Object obj = null;
        try {
            IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(WebView.getCurrentModuleWebCoreType());
            if (webViewProvider != null) {
                obj = webViewProvider.invokeRuntimeChannel(ConstValue.INVOKE_RUNTIME_ID_HAS_FEATURE, new Object[]{Integer.valueOf(i)});
            }
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "hasXWebFeature, error", th);
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public static synchronized void initXWebEnvironmentInternal(Context context, XWebEnvironmentConfig xWebEnvironmentConfig) {
        synchronized (XWebSdkInternal.class) {
            XWebLog.m21911i(TAG, String.format("initXWebEnvironment, logInterface:%s, reportInterface:%s, spProvider:%s", new Object[]{xWebEnvironmentConfig.getLogInterface(), xWebEnvironmentConfig.getReporterInterface(), xWebEnvironmentConfig.getSharedPreferenceProvider()}));
            if (xWebEnvironmentConfig.getLogInterface() != null) {
                XWebLog.setLogClient(xWebEnvironmentConfig.getLogInterface());
            }
            if (xWebEnvironmentConfig.getReporterInterface() != null) {
                WXWebReporter.setReporterCallback(xWebEnvironmentConfig.getReporterInterface());
            }
            if (xWebEnvironmentConfig.getSharedPreferenceProvider() != null) {
                XWebSharedPreferenceUtil.setSharedPreferenceProvider(xWebEnvironmentConfig.getSharedPreferenceProvider());
            }
            XWalkEnvironment.init(context);
            XWalkEnvironment.tryLoadLocalAssetRuntime(context);
        }
    }

    public static boolean isWaitForXWeb() {
        return sWaitForXWeb;
    }

    public static void preInitGpuProcessInternal() {
        try {
            IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(WebView.getCurrentModuleWebCoreType());
            if (webViewProvider != null) {
                webViewProvider.execute(ConstValue.STR_CMD_PRE_INIT_GPU_PROCESS, new Object[0]);
            }
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "preInitGpuProcess, error", th);
        }
    }

    public static void preInitRenderProcessInternal() {
        try {
            IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(WebView.getCurrentModuleWebCoreType());
            if (webViewProvider != null) {
                webViewProvider.execute(ConstValue.STR_CMD_PRE_INIT_RENDER_PROCESS, new Object[0]);
            }
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "preInitRenderProcess, error", th);
        }
    }

    public static void setABTestWebViewKindInternal(Context context, String str, WebView.WebViewKind webViewKind) {
        try {
            getXWebDebugCfg(context).setABTestWebViewKind(str, webViewKind);
        } catch (Exception e) {
            XWebLog.m21910e(TAG, "setABTestWebViewKind failed, error", e);
        }
    }

    public static void setAppBrandIdInternal(String str) {
        try {
            IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(WebView.getCurrentModuleWebCoreType());
            if (webViewProvider != null) {
                webViewProvider.invokeRuntimeChannel(90001, new Object[]{str});
            }
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "setAppBrandId, error", th);
        }
    }

    public static void setApplicationStartTime(long j) {
        sApplicationStartTime = j;
    }

    public static void setEnableCheckStorageInternal(Context context, boolean z) {
        try {
            getXWebDebugCfg(context).setEnableCheckStorage(z);
        } catch (Exception e) {
            XWebLog.m21910e(TAG, "setEnableCheckStorage failed, error", e);
        }
    }

    public static void setEnableLocalDebugInternal(Context context, boolean z) {
        try {
            getXWebDebugCfg(context).setEnableLocalDebug(z);
        } catch (Exception e) {
            XWebLog.m21910e(TAG, "setEnableLocalDebug failed, error", e);
        }
    }

    public static boolean setIpTypeInternal(int i) {
        int ipType = getIpType();
        if (i == ipType) {
            return false;
        }
        XWebSharedPreferenceUtil.getSharedPreferencesForXWalkCore().edit().putInt(SP_KEY_IP_TYPE, i).commit();
        XWebLog.m21911i(TAG, "setIpType, ip type changed from " + ipType + " to " + i);
        if (ipType == 0 && i == 1) {
            WXWebReporter.idkeyReport(197, 1);
        } else if (ipType == 1 && i == 0) {
            WXWebReporter.idkeyReport(198, 1);
        }
        if (ipType <= 0 && i <= 0) {
            return false;
        }
        WXWebReporter.idkeyReport(1749, 28, 1);
        return true;
    }

    public static void setWaitForXWebInternal(boolean z) {
        XWebLog.m21911i(TAG, "setWaitForXWeb:" + z);
        sWaitForXWeb = z;
    }

    public static void setXWebUpdateListenerInternal(IXWebUpdateListener iXWebUpdateListener) {
        sUpdateListener = iXWebUpdateListener;
    }

    public static void updateResourceLocaleInternal(Locale locale) {
        try {
            IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(WebView.getCurrentModuleWebCoreType());
            if (webViewProvider != null) {
                webViewProvider.execute(ConstValue.STR_CMD_UPDATE_RESOURCE_LOCALE, new Object[]{locale});
            }
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "updateResourceLocale, error", th);
        }
    }
}
