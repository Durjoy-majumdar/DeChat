package com.tencent.maas;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.ArrayMap;
import android.view.SurfaceView;
import com.facebook.jni.HybridData;
import com.tencent.maas.analytics.MJAnalyticsEvent;
import com.tencent.maas.camerafun.MJCamFunSession;
import com.tencent.maas.camstudio.MJCamResourceManager;
import com.tencent.maas.camstudio.MJCamSession;
import com.tencent.maas.instamovie.MJMaasCoreCallback;
import com.tencent.maas.instamovie.MJMovieSession;
import com.tencent.maas.instamovie.MJResourcePreloader;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.maas.instamovie.base.MJLogLevel;
import com.tencent.maas.instamovie.mediafoundation.DimensionLevel;
import com.tencent.maas.internal.NativeCallbackManager;
import com.tencent.maas.model.MJModelInfo;
import com.tencent.maas.model.MJTemplateMetadata;
import com.tencent.mars.ilink.comm.PlatformComm;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;
import p172io.clipworks.corekit.HarmonyOSChecker;
import p172io.clipworks.displaysys.DSRenderView;

public class MJMaasCore {
    public static final String DEFAULT_FALLBACK_FONT_PACKAGE_PATH = "MKDefaultFallbackFontPackagePath";
    public static final String PREPROC_SERVICE = "preprocessing";
    private static final String TAG = "MJMaasCore";
    private AnalyticsListener mAnalyticsListener;
    private final NativeCallbackManager mCallbackManager;
    private final HybridData mHybridData;
    private SettingsListener mSettingsListener;
    private final Map<String, Object> serviceCache = new ArrayMap();

    public interface OnBoolComplete {
        void onComplete(boolean z);
    }

    public interface SettingsListener {
        String getSettingForKey(String str);
    }

    public static class TemplateServiceParams {
        private TemplateServiceProvider camFunServiceProvider;
        private TemplateServiceProvider instaMovieServiceProvider;

        public TemplateServiceParams(TemplateServiceProvider templateServiceProvider, TemplateServiceProvider templateServiceProvider2) {
            this.instaMovieServiceProvider = templateServiceProvider;
            this.camFunServiceProvider = templateServiceProvider2;
        }

        public TemplateServiceProvider getCamFunServiceProvider() {
            return this.camFunServiceProvider;
        }

        public TemplateServiceProvider getInstaMovieServiceProvider() {
            return this.instaMovieServiceProvider;
        }

        public boolean hasCamFunServiceProvider() {
            return this.camFunServiceProvider != null;
        }

        public boolean hasInstaMovieServiceProvider() {
            return this.instaMovieServiceProvider != null;
        }

        public MJTemplateMetadata requestCamFunTemplateMetadata(String str) {
            TemplateServiceProvider templateServiceProvider = this.camFunServiceProvider;
            if (templateServiceProvider == null) {
                return null;
            }
            return templateServiceProvider.onRequestTemplateMetadata(str);
        }

        public MJTemplateMetadata requestInstaMovieTemplateMetadata(String str) {
            TemplateServiceProvider templateServiceProvider = this.instaMovieServiceProvider;
            if (templateServiceProvider == null) {
                return null;
            }
            return templateServiceProvider.onRequestTemplateMetadata(str);
        }
    }

    public interface TemplateServiceProvider {
        MJTemplateMetadata onRequestTemplateMetadata(String str);
    }

    /* renamed from: com.tencent.maas.MJMaasCore$1 */
    public static /* synthetic */ class C1045451 {
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$maas$MJMaasCore$LogLevel;
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$maas$MJMaasCore$LoginParams$LoginType;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|14|15|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|5|6|7|8|9|10|11|12|13|14|15|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0028 */
        static {
            /*
                com.tencent.maas.MJMaasCore$LogLevel[] r0 = com.tencent.maas.MJMaasCore.LogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$tencent$maas$MJMaasCore$LogLevel = r0
                r1 = 1
                com.tencent.maas.MJMaasCore$LogLevel r2 = com.tencent.maas.MJMaasCore.LogLevel.ISSUE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$tencent$maas$MJMaasCore$LogLevel     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.maas.MJMaasCore$LogLevel r3 = com.tencent.maas.MJMaasCore.LogLevel.FATAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = $SwitchMap$com$tencent$maas$MJMaasCore$LogLevel     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.maas.MJMaasCore$LogLevel r3 = com.tencent.maas.MJMaasCore.LogLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r2 = $SwitchMap$com$tencent$maas$MJMaasCore$LogLevel     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.maas.MJMaasCore$LogLevel r3 = com.tencent.maas.MJMaasCore.LogLevel.WARN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4 = 4
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r2 = $SwitchMap$com$tencent$maas$MJMaasCore$LogLevel     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tencent.maas.MJMaasCore$LogLevel r3 = com.tencent.maas.MJMaasCore.LogLevel.INFO     // Catch:{ NoSuchFieldError -> 0x003e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r4 = 5
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r2 = $SwitchMap$com$tencent$maas$MJMaasCore$LogLevel     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tencent.maas.MJMaasCore$LogLevel r3 = com.tencent.maas.MJMaasCore.LogLevel.DEBUG     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r4 = 6
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                com.tencent.maas.MJMaasCore$LoginParams$LoginType[] r2 = com.tencent.maas.MJMaasCore.LoginParams.LoginType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                $SwitchMap$com$tencent$maas$MJMaasCore$LoginParams$LoginType = r2
                com.tencent.maas.MJMaasCore$LoginParams$LoginType r3 = com.tencent.maas.MJMaasCore.LoginParams.LoginType.ThirdApp     // Catch:{ NoSuchFieldError -> 0x005a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r1 = $SwitchMap$com$tencent$maas$MJMaasCore$LoginParams$LoginType     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.tencent.maas.MJMaasCore$LoginParams$LoginType r2 = com.tencent.maas.MJMaasCore.LoginParams.LoginType.Visitor     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.MJMaasCore.C1045451.<clinit>():void");
        }
    }

    public interface AnalyticsListener {
        void onEvent(MJAnalyticsEvent mJAnalyticsEvent);
    }

    public static class EnvironmentParams {
        private final String cachesDirectory;
        private final boolean createDirectoryIfNotExist;
        private final String localeID;
        private final String persistentDirectory;
        private final String resourcesDirectory;
        private final String temporaryDirectory;

        public EnvironmentParams(String str, String str2, String str3, String str4, boolean z, String str5) {
            this.persistentDirectory = str;
            this.cachesDirectory = str2;
            this.temporaryDirectory = str3;
            this.resourcesDirectory = str4;
            this.createDirectoryIfNotExist = z;
            this.localeID = str5;
        }

        public String getCachesDirectory() {
            return this.cachesDirectory;
        }

        public String getLocaleID() {
            return this.localeID;
        }

        public String getPersistentDirectory() {
            return this.persistentDirectory;
        }

        public String getResourcesDirectory() {
            return this.resourcesDirectory;
        }

        public String getTemporaryDirectory() {
            return this.temporaryDirectory;
        }

        public boolean isCreateDirectoryIfNotExist() {
            return this.createDirectoryIfNotExist;
        }
    }

    public static class ILinkContextParamsExternalManaged {
    }

    public static class ILinkContextParamsSelfManaged {
        private String debugServerIP;
        private final int sessionModuleType;
        private boolean useDebugServer;

        public ILinkContextParamsSelfManaged(int i, boolean z, String str) {
            this.sessionModuleType = i;
            this.useDebugServer = z;
            this.debugServerIP = str;
        }

        public String getDebugServerIP() {
            return this.debugServerIP;
        }

        public int getSessionModuleType() {
            return this.sessionModuleType;
        }

        public boolean isUseDebugServer() {
            return this.useDebugServer;
        }
    }

    public enum LogLevel {
        ISSUE,
        FATAL,
        ERROR,
        WARN,
        INFO,
        DEBUG;

        public int getValue() {
            int i = C1045451.$SwitchMap$com$tencent$maas$MJMaasCore$LogLevel[ordinal()];
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return 2;
            }
            if (i != 4) {
                return i != 5 ? 5 : 4;
            }
            return 3;
        }
    }

    public static class LoggingParams {
        private volatile long logFuncPointer = 0;
        private LogLevel maxLogLevel = LogLevel.INFO;

        public LoggingParams(long j, LogLevel logLevel) {
            this.logFuncPointer = j;
            this.maxLogLevel = logLevel;
        }

        public long getLogFuncPointer() {
            return this.logFuncPointer;
        }

        public LogLevel getMaxLogLevel() {
            return this.maxLogLevel;
        }

        public int getMaxLogLevelValue() {
            return this.maxLogLevel.getValue();
        }
    }

    public static class LoginParams {
        private final String authCode;
        private final String clientInfo;
        private final LoginType loginType;

        public enum LoginType {
            ThirdApp,
            Visitor
        }

        public LoginParams(String str, String str2, LoginType loginType2) {
            this.authCode = str;
            this.clientInfo = str2;
            this.loginType = loginType2;
        }

        public String getAuthCode() {
            return this.authCode;
        }

        public String getClientInfo() {
            return this.clientInfo;
        }

        public int getLoginType() {
            return C1045451.$SwitchMap$com$tencent$maas$MJMaasCore$LoginParams$LoginType[this.loginType.ordinal()] != 2 ? 0 : 1;
        }
    }

    public interface LoginParamsCallback {
        LoginParams onGetLoginParams();
    }

    public interface OnComplete {
        void onComplete(MJError mJError);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SettingKey {
    }

    public static class WarmupParams {
        private final String camFunDirectory;
        private final String instaMovieDirectory;
        private final boolean overwriteExisting;

        public WarmupParams(String str, String str2, boolean z) {
            this.instaMovieDirectory = str;
            this.camFunDirectory = str2;
            this.overwriteExisting = z;
        }

        public String getCamFunDirectory() {
            return this.camFunDirectory;
        }

        public String getInstaMovieDirectory() {
            return this.instaMovieDirectory;
        }

        public boolean overwriteExisting() {
            return this.overwriteExisting;
        }
    }

    public MJMaasCore(Handler handler) {
        NativeCallbackManager nativeCallbackManager = new NativeCallbackManager(handler.getLooper());
        this.mCallbackManager = nativeCallbackManager;
        this.mHybridData = initHybrid(handler, nativeCallbackManager);
    }

    public static void disableLogging() {
        nativeDisableLogging();
    }

    public static void enableLogging(LoggingParams loggingParams) {
        nativeEnableLogging(loggingParams);
    }

    private native HybridData initHybrid(Handler handler, NativeCallbackManager nativeCallbackManager);

    private native void nativeCleanupResourceCaches(ResourceCacheCleanupOptions resourceCacheCleanupOptions, int i);

    private native void nativeDestroyResourcePreloader();

    private static native void nativeDisableLogging();

    private static native void nativeEnableLogging(LoggingParams loggingParams);

    private native Object nativeGetMaasService(String str);

    private native MJCamFunSession nativeNewCamFunSession(Handler handler, List<MJModelInfo> list, int i);

    private native MJCamResourceManager nativeNewCamResourceManager(Handler handler);

    private native MJCamSession nativeNewCamSession(Handler handler, List<MJModelInfo> list);

    private native MJCamSession nativeNewLegacyCamSession(Handler handler, List<MJModelInfo> list);

    private native MJServiceManager nativeNewMJServiceManager(Handler handler);

    private native MJMovieSession nativeNewMovieSession(Handler handler, List<MJModelInfo> list);

    private native MJResourcePreloader nativeNewResourcePreloader(Handler handler);

    private native MJError nativeQueryCamFunTemplateResourcesStatus(String str, long j, int i);

    private native MJError nativeQueryInstaMovieTemplateResourcesStatus(String str, long j, int i);

    private native MJError nativeRegisterAIModelInfos(List<MJModelInfo> list);

    private native void nativeSetAnalyticsListener(AnalyticsListener analyticsListener);

    private static native void nativeSetLogLevel(int i);

    private native void nativeSetSettingForKey(String str, String str2);

    private native void nativeSetSettingsListener(SettingsListener settingsListener);

    private native MJError nativeStartup(Context context, ILinkParams iLinkParams, EnvironmentParams environmentParams, LoggingParams loggingParams, WarmupParams warmupParams, TemplateServiceParams templateServiceParams, int i, int i2);

    private native MJError nativeTeardown(int i);

    public static void setLogLevel(MJLogLevel mJLogLevel) {
        nativeSetLogLevel(mJLogLevel.getValue());
    }

    public void cleanupResourceCaches(ResourceCacheCleanupOptions resourceCacheCleanupOptions, OnComplete onComplete) {
        nativeCleanupResourceCaches(resourceCacheCleanupOptions, onComplete != null ? this.mCallbackManager.registerCallback(new MJMaasCoreCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public void destroyResourcePreloader() {
        nativeDestroyResourcePreloader();
    }

    public <T> T getMaasService(String str) {
        synchronized (this.serviceCache) {
            T t = this.serviceCache.get(str);
            if (t != null) {
                return t;
            }
            T nativeGetMaasService = nativeGetMaasService(str);
            if (nativeGetMaasService == null) {
                return null;
            }
            this.serviceCache.put(str, nativeGetMaasService);
            return nativeGetMaasService;
        }
    }

    @Deprecated
    public MJCamFunSession newCamFunSession(Handler handler, List<MJModelInfo> list, DimensionLevel dimensionLevel) {
        return nativeNewCamFunSession(handler, list, dimensionLevel.getId());
    }

    public MJCamResourceManager newCamResourceManager(Handler handler) {
        return nativeNewCamResourceManager(handler);
    }

    public MJCamSession newCamSession(Handler handler, List<MJModelInfo> list) {
        return nativeNewCamSession(handler, list);
    }

    public MJCamSession newLegacyCamSession(Handler handler, List<MJModelInfo> list) {
        return nativeNewLegacyCamSession(handler, list);
    }

    public MJServiceManager newMJServiceManager(Handler handler) {
        return nativeNewMJServiceManager(handler);
    }

    public MJMovieSession newMovieSession(Handler handler, List<MJModelInfo> list) {
        return nativeNewMovieSession(handler, list);
    }

    public SurfaceView newRenderView(Context context) {
        return new DSRenderView(context);
    }

    public MJResourcePreloader newResourcePreloader(Handler handler) {
        return nativeNewResourcePreloader(handler);
    }

    public MJError queryCamFunTemplateResourcesStatus(String str, long j, OnBoolComplete onBoolComplete) {
        return nativeQueryCamFunTemplateResourcesStatus(str, j, onBoolComplete != null ? this.mCallbackManager.registerCallback(new MJMaasCoreCallback.BoolCompleteCallback(this, onBoolComplete)) : -1);
    }

    public MJError queryInstaMovieTemplateResourcesStatus(String str, long j, OnBoolComplete onBoolComplete) {
        return nativeQueryInstaMovieTemplateResourcesStatus(str, j, onBoolComplete != null ? this.mCallbackManager.registerCallback(new MJMaasCoreCallback.BoolCompleteCallback(this, onBoolComplete)) : -1);
    }

    public MJError registerAIModelInfos(List<MJModelInfo> list) {
        return nativeRegisterAIModelInfos(list);
    }

    public void setAnalyticsListener(AnalyticsListener analyticsListener) {
        this.mAnalyticsListener = analyticsListener;
        nativeSetAnalyticsListener(analyticsListener);
    }

    public void setSettingForKey(String str, String str2) {
        nativeSetSettingForKey(str, str2);
    }

    public void setSettingsListener(SettingsListener settingsListener) {
        this.mSettingsListener = settingsListener;
        nativeSetSettingsListener(settingsListener);
    }

    public MJError startup(Context context, ILinkParams iLinkParams, EnvironmentParams environmentParams, LoggingParams loggingParams, WarmupParams warmupParams, TemplateServiceParams templateServiceParams, OnComplete onComplete) {
        OnComplete onComplete2 = onComplete;
        PlatformComm.init(context.getApplicationContext(), new Handler(Looper.getMainLooper()));
        HarmonyOSChecker.init();
        return nativeStartup(context, iLinkParams, environmentParams, loggingParams, warmupParams, templateServiceParams, onComplete2 != null ? this.mCallbackManager.registerCallback(new MJMaasCoreCallback.CompleteCallback(this, onComplete2)) : -1, iLinkParams.getLoginParamsCallback() != null ? this.mCallbackManager.registerCallbackWithReturnValue(new MJMaasCoreCallback.ILinkLoginParamCallback(this, iLinkParams.getLoginParamsCallback())) : -1);
    }

    public MJError teardown(OnComplete onComplete) {
        return nativeTeardown(onComplete != null ? this.mCallbackManager.registerCallback(new MJMaasCoreCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public static class ILinkContextParams {
        public ILinkContextParamsExternalManaged paramsExternalManaged;
        public ILinkContextParamsSelfManaged paramsSelfManaged;

        public ILinkContextParams(ILinkContextParamsSelfManaged iLinkContextParamsSelfManaged) {
            this.paramsSelfManaged = iLinkContextParamsSelfManaged;
        }

        public ILinkContextParamsExternalManaged getParamsExternalManaged() {
            return this.paramsExternalManaged;
        }

        public ILinkContextParamsSelfManaged getParamsSelfManaged() {
            return this.paramsSelfManaged;
        }

        public ILinkContextParams(ILinkContextParamsExternalManaged iLinkContextParamsExternalManaged) {
            this.paramsExternalManaged = iLinkContextParamsExternalManaged;
        }
    }

    public static class ResourceCacheCleanupOptions {
        private final int cacheSizeLimit;
        private final int cleanupThreshold;

        public ResourceCacheCleanupOptions(int i) {
            this.cacheSizeLimit = i;
            this.cleanupThreshold = 102400;
        }

        public int getCacheSizeLimit() {
            return this.cacheSizeLimit;
        }

        public int getCleanupThreshold() {
            return this.cleanupThreshold;
        }

        public ResourceCacheCleanupOptions(int i, int i2) {
            this.cacheSizeLimit = i;
            this.cleanupThreshold = i2;
        }
    }

    public static class ILinkParams {
        private ILinkAppClientParams appClientParams;
        private String appID;
        private String authCode;
        private String clientInfo;
        private ILinkContextParams contextParams;

        public ILinkParams(String str, String str2, String str3, LoginParamsCallback loginParamsCallback) {
            this.contextParams = new ILinkContextParams(new ILinkContextParamsExternalManaged());
            this.appClientParams = new ILinkAppClientParams(str, str2, str3, loginParamsCallback);
        }

        public ILinkAppClientParams getAppClientParams() {
            return this.appClientParams;
        }

        public String getAppID() {
            return this.appID;
        }

        public String getAuthCode() {
            return this.authCode;
        }

        public String getClientInfo() {
            return this.clientInfo;
        }

        public ILinkContextParams getContextParams() {
            return this.contextParams;
        }

        public LoginParamsCallback getLoginParamsCallback() {
            return this.appClientParams.getLoginParamsCallback();
        }

        public ILinkParams(ILinkContextParams iLinkContextParams, String str, String str2, String str3, LoginParamsCallback loginParamsCallback) {
            this.contextParams = iLinkContextParams;
            this.appClientParams = new ILinkAppClientParams(str, str2, str3, loginParamsCallback);
        }

        public ILinkParams(ILinkContextParamsSelfManaged iLinkContextParamsSelfManaged, String str, String str2, String str3, LoginParamsCallback loginParamsCallback) {
            this.contextParams = new ILinkContextParams(iLinkContextParamsSelfManaged);
            this.appClientParams = new ILinkAppClientParams(str, str2, str3, loginParamsCallback);
        }

        public ILinkParams(ILinkContextParamsExternalManaged iLinkContextParamsExternalManaged, String str, String str2, String str3, LoginParamsCallback loginParamsCallback) {
            this.contextParams = new ILinkContextParams(iLinkContextParamsExternalManaged);
            this.appClientParams = new ILinkAppClientParams(str, str2, str3, loginParamsCallback);
        }
    }

    public static class ILinkAppClientParams {
        public final String appID;
        private String authCode;
        private String clientInfo;
        public LoginParamsCallback loginParamsCallback;

        public ILinkAppClientParams(String str, String str2, String str3, LoginParamsCallback loginParamsCallback2) {
            this.appID = str;
            this.authCode = str2;
            this.clientInfo = str3;
            this.loginParamsCallback = loginParamsCallback2;
        }

        public String getAppID() {
            return this.appID;
        }

        public String getAuthCode() {
            return this.authCode;
        }

        public String getClientInfo() {
            return this.clientInfo;
        }

        public LoginParamsCallback getLoginParamsCallback() {
            return this.loginParamsCallback;
        }

        public ILinkAppClientParams(String str, LoginParamsCallback loginParamsCallback2) {
            this.appID = str;
            this.loginParamsCallback = loginParamsCallback2;
        }

        public ILinkAppClientParams(String str, String str2, String str3) {
            this.appID = str;
            this.authCode = str2;
            this.clientInfo = str3;
        }
    }
}
