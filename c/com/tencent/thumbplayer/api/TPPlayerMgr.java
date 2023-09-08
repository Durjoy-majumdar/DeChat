package com.tencent.thumbplayer.api;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.thumbplayer.adapter.player.thumbplayer.TPDrmCapability;
import com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil;
import com.tencent.thumbplayer.common.report.TPBeaconReportWrapper;
import com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportManager;
import com.tencent.thumbplayer.config.TPPlayerConfig;
import com.tencent.thumbplayer.core.common.ITPNativeLibraryExternalLoader;
import com.tencent.thumbplayer.core.common.ITPNativeLogCallback;
import com.tencent.thumbplayer.core.common.TPNativeLibraryLoader;
import com.tencent.thumbplayer.core.common.TPNativeLog;
import com.tencent.thumbplayer.core.common.TPSystemInfo;
import com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyNativeLibLoader;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPProxyAdapter;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyHelper;
import com.tencent.thumbplayer.datatransport.ITPProxyManagerAdapter;
import com.tencent.thumbplayer.datatransport.TPProxyGlobalManager;
import com.tencent.thumbplayer.datatransport.config.TPProxyConfig;
import com.tencent.thumbplayer.utils.TPCommonUtils;
import com.tencent.thumbplayer.utils.TPElapsedTimeStatistics;
import com.tencent.thumbplayer.utils.TPGlobalEventNofication;
import com.tencent.thumbplayer.utils.TPLogUtil;
import com.tencent.thumbplayer.utils.TPNetworkChangeMonitor;
import com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher;
import com.tencent.thumbplayer.utils.TPThreadPool;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class TPPlayerMgr {
    public static final String BEACON_LOG_HOST_KEY = "beacon_log_host";
    public static final String BEACON_POLICY_HOST_KEY = "beacon_policy_host";
    public static final int EVENT_ID_APP_ENTER_BACKGROUND = 100001;
    public static final int EVENT_ID_APP_ENTER_FOREGROUND = 100002;
    public static final int INVALID_CELLULAR_FLOW = -1;
    public static final int INVALID_SUGGEST_BITRATE = -1;
    public static final String PLYAER_HOST_KEY = "player_host_config";
    public static final String PROPERTY_AB_USER_ID = "PROPERTY_AbUserId";
    public static final String PROPERTY_ENABLE_DATA_REPORT = "PROPERTY_EnableDataReport";
    public static final String PROPERTY_ENABLE_NEW_REPORT = "PROPERTY_EnableNewReport";
    public static final String PROPERTY_ENABLE_PLAYER_REPORT = "PROPERTY_EnablePlayerReport";
    public static final String PROPERTY_MEDIA_DRM_REUSE = "PROPERTY_MediaDrmReuse";
    public static final String PROPERTY_PROXY_MAX_USE_MEMORY_MB = "PROPERTY_ProxyMaxUseMemoryMB";
    public static final String PROPERTY_VIDEO_MEDIACODEC_CO_EXIST_MAX_CNT = "PROPERTY_VideoMediaCodecCoexistMaxCnt";
    public static final String PROPERTY_WIDEVINE_PROVISIONING_SERVER_URL = "PROPERTY_WidevineProvisioningServerUrl";
    public static final String PROXY_HOST_KEY = "httpproxy_config";
    private static final String TAG = "TPThumbPlayer[TPPlayerMgr.java]";
    public static final String TP_DOWNLOAD_PROXY_MODULE_NAME = "DownloadProxy";
    public static final String TP_PLAYERCORE_MODULE_NAME = "TPCore";
    /* access modifiers changed from: private */
    public static Context mAppContext;
    private static final HashMap<String, Boolean> mBoolPropertyNameToValueCache = new HashMap<>();
    private static final HashMap<String, ITPPropertyHandler<Boolean>> mBooleanPropertyNameToPropertyHandlerTables;
    private static final HashMap<String, ITPPropertyHandler<Integer>> mIntegerPropertyNameToPropertyHandlerTables;
    private static final HashMap<String, Integer> mIntegerPropertyNameToValueCache = new HashMap<>();
    private static boolean mIsInit;
    private static final HashMap<String, ITPPropertyHandler<Long>> mLongPropertyNameToPropertyHandlerTables;
    private static final HashMap<String, Long> mLongPropertyNameToValueCache = new HashMap<>();
    private static final HashMap<String, ITPPropertyHandler<String>> mStringPropertyNameToPropertyHandlerTables;
    private static final HashMap<String, String> mStringPropertyNameToValueCache = new HashMap<>();

    public interface ITPPropertyHandler<T> {
        T getPropertyValue();

        void setPropertyValue(T t);
    }

    public interface OnLogListener {
        /* renamed from: d */
        int mo22568d(String str, String str2);

        /* renamed from: e */
        int mo22569e(String str, String str2);

        /* renamed from: i */
        int mo22570i(String str, String str2);

        /* renamed from: v */
        int mo22571v(String str, String str2);

        /* renamed from: w */
        int mo22572w(String str, String str2);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BooleanProperty {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface EventId {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface IntegerProperty {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LongProperty {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StringProperty {
    }

    static {
        HashMap<String, ITPPropertyHandler<Boolean>> hashMap = new HashMap<>();
        mBooleanPropertyNameToPropertyHandlerTables = hashMap;
        hashMap.put(PROPERTY_MEDIA_DRM_REUSE, new ITPPropertyHandler<Boolean>() {
            public Boolean getPropertyValue() {
                return Boolean.valueOf(TPPlayerConfig.getMediaDrmReuseEnable());
            }

            public void setPropertyValue(Boolean bool) {
                TPPlayerConfig.setMediaDrmReuseEnable(bool.booleanValue());
            }
        });
        hashMap.put(PROPERTY_ENABLE_DATA_REPORT, new ITPPropertyHandler<Boolean>() {
            public Boolean getPropertyValue() {
                return Boolean.valueOf(TPPlayerConfig.isDataReportEnable());
            }

            public void setPropertyValue(Boolean bool) {
                TPLogUtil.m21897i(TPPlayerMgr.TAG, "set data report enable : " + bool);
                TPPlayerConfig.setDataReportEnable(bool.booleanValue());
                TPProxyGlobalManager.getInstance().updateDataReportEnable(bool.booleanValue());
            }
        });
        hashMap.put(PROPERTY_ENABLE_PLAYER_REPORT, new ITPPropertyHandler<Boolean>() {
            public Boolean getPropertyValue() {
                return Boolean.valueOf(TPPlayerConfig.isPlayerReportEnable());
            }

            public void setPropertyValue(Boolean bool) {
                TPLogUtil.m21897i(TPPlayerMgr.TAG, "set player report enable : " + bool);
                TPPlayerConfig.setPlayerReportEnable(bool.booleanValue());
            }
        });
        hashMap.put(PROPERTY_ENABLE_NEW_REPORT, new ITPPropertyHandler<Boolean>() {
            public Boolean getPropertyValue() {
                return Boolean.valueOf(TPPlayerConfig.getNewReportEnable());
            }

            public void setPropertyValue(Boolean bool) {
                TPLogUtil.m21897i(TPPlayerMgr.TAG, "set new report enable : " + bool);
                TPPlayerConfig.setNewReportEnable(bool.booleanValue());
            }
        });
        HashMap<String, ITPPropertyHandler<String>> hashMap2 = new HashMap<>();
        mStringPropertyNameToPropertyHandlerTables = hashMap2;
        hashMap2.put(PROPERTY_AB_USER_ID, new ITPPropertyHandler<String>() {
            public String getPropertyValue() {
                return TPPlayerConfig.getAbUserId();
            }

            public void setPropertyValue(String str) {
                TPPlayerConfig.setAbUserId(str);
            }
        });
        hashMap2.put(PROPERTY_WIDEVINE_PROVISIONING_SERVER_URL, new ITPPropertyHandler<String>() {
            public String getPropertyValue() {
                return TPPlayerConfig.getWidevineProvisioningServerUrl();
            }

            public void setPropertyValue(String str) {
                TPPlayerConfig.setWidevineProvisioningServerUrl(str);
            }
        });
        HashMap<String, ITPPropertyHandler<Integer>> hashMap3 = new HashMap<>();
        mIntegerPropertyNameToPropertyHandlerTables = hashMap3;
        hashMap3.put(PROPERTY_VIDEO_MEDIACODEC_CO_EXIST_MAX_CNT, new ITPPropertyHandler<Integer>() {
            public Integer getPropertyValue() {
                return Integer.valueOf(TPPlayerConfig.getVideoMediaCodecCoexistMaxCnt());
            }

            public void setPropertyValue(Integer num) {
                TPPlayerConfig.setVideoMediaCodecCoexistMaxCnt(num.intValue());
            }
        });
        HashMap<String, ITPPropertyHandler<Long>> hashMap4 = new HashMap<>();
        mLongPropertyNameToPropertyHandlerTables = hashMap4;
        hashMap4.put(PROPERTY_PROXY_MAX_USE_MEMORY_MB, new ITPPropertyHandler<Long>() {
            public Long getPropertyValue() {
                return Long.valueOf(TPProxyConfig.getProxyConfig(TPProxyConfig.getDefaultServiceType()).maxUseMemoryMB);
            }

            public void setPropertyValue(Long l) {
                TPProxyConfig.setMaxUseMemoryMB(l.longValue());
                TPProxyGlobalManager.getInstance().updateMaxUseMemoryMB(l.longValue());
            }
        });
    }

    private static void dumpStackTrace() {
        TPLogUtil.m21897i(TAG, "Current stack trace: ");
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            TPLogUtil.m21897i(TAG, stackTraceElement.toString());
        }
    }

    public static Context getAppContext() {
        return mAppContext;
    }

    public static int getCellularDataCost() {
        ITPDownloadProxy downloadProxy;
        ITPProxyManagerAdapter playerProxy = TPProxyGlobalManager.getInstance().getPlayerProxy(TPPlayerConfig.getProxyServiceType());
        if (playerProxy == null || (downloadProxy = playerProxy.getDownloadProxy()) == null) {
            return -1;
        }
        return TPCommonUtils.optInt(downloadProxy.getNativeInfo(2), -1);
    }

    public static String getLibVersion(String str) {
        if (mIsInit) {
            if (!TextUtils.isEmpty(str)) {
                if (str.equals("DownloadProxy")) {
                    return TPDownloadProxyHelper.getNativeLibVersion();
                }
                if (str.equals(TP_PLAYERCORE_MODULE_NAME)) {
                    return TPNativeLibraryLoader.getLibVersion();
                }
            }
            throw new IllegalArgumentException("libName:" + str);
        }
        throw new IllegalStateException("player not initialized");
    }

    public static int getOfflineRecordDurationMs(String str, String str2) {
        return TPDownloadProxyHelper.getRecordDuration(str, str2);
    }

    public static String getOfflineRecordVinfo(String str, String str2) {
        return TPDownloadProxyHelper.checkVideoStatus(str, str2);
    }

    public static synchronized boolean getPropertyBoolean(String str, boolean z) {
        synchronized (TPPlayerMgr.class) {
            Boolean bool = mBoolPropertyNameToValueCache.get(str);
            if (bool != null) {
                z = bool.booleanValue();
            }
        }
        return z;
    }

    public static synchronized int getPropertyInteger(String str, int i) {
        synchronized (TPPlayerMgr.class) {
            Integer num = mIntegerPropertyNameToValueCache.get(str);
            if (num != null) {
                i = num.intValue();
            }
        }
        return i;
    }

    public static synchronized long getPropertyLong(String str, long j) {
        synchronized (TPPlayerMgr.class) {
            Long l = mLongPropertyNameToValueCache.get(str);
            if (l != null) {
                j = l.longValue();
            }
        }
        return j;
    }

    public static synchronized String getPropertyString(String str, String str2) {
        synchronized (TPPlayerMgr.class) {
            String str3 = mStringPropertyNameToValueCache.get(str);
            if (str3 != null) {
                str2 = str3;
            }
        }
        return str2;
    }

    public static int getSuggestedBitrate() {
        ITPDownloadProxy downloadProxy;
        ITPProxyManagerAdapter playerProxy = TPProxyGlobalManager.getInstance().getPlayerProxy(TPPlayerConfig.getProxyServiceType());
        if (playerProxy == null || (downloadProxy = playerProxy.getDownloadProxy()) == null) {
            return -1;
        }
        return TPCommonUtils.optInt(downloadProxy.getNativeInfo(0), -1);
    }

    public static String getThumbPlayerVersion() {
        return TPPlayerConfig.VERSION;
    }

    private static Future<Boolean> initAsyncWithWait() {
        return TPThreadPool.getInstance().obtainSingleThreadExecutor().submit(new Callable<Boolean>() {
            public Boolean call() {
                TPPlayerMgr.initInAsyncThread();
                return Boolean.TRUE;
            }
        });
    }

    private static void initAsyncWithoutWait() {
        TPThreadPool.getInstance().obtainThreadExecutor().execute(new Runnable() {
            public void run() {
                TPElapsedTimeStatistics tPElapsedTimeStatistics = new TPElapsedTimeStatistics();
                tPElapsedTimeStatistics.startPoint();
                TPNativeKeyMapUtil.init();
                TPLogUtil.m21897i(TPPlayerMgr.TAG, "Init SDK, initAsyncWithoutWait  nativeKeyMap init, times: " + tPElapsedTimeStatistics.costTimeMsFromLastPoint());
                TPNetworkChangeMonitor.getInstance().init(TPPlayerMgr.mAppContext);
                TPProcessLifeCycleEventPublisher.init();
                new TPDeviceCapabilityReportManager().reportSync();
                TPPlayerMgr.setExternalProperties();
                TPLogUtil.m21897i(TPPlayerMgr.TAG, "Init SDK, initAsyncWithoutWait all times: " + tPElapsedTimeStatistics.costTimeMsFromStartPoint());
            }
        });
    }

    /* access modifiers changed from: private */
    public static void initInAsyncThread() {
        TPElapsedTimeStatistics tPElapsedTimeStatistics = new TPElapsedTimeStatistics();
        tPElapsedTimeStatistics.startPoint();
        TPBeaconReportWrapper.init(mAppContext.getApplicationContext());
        TPLogUtil.m21897i(TAG, "Init SDK, initAsyncWithWait  TPBeaconReportWrapper init, times: " + tPElapsedTimeStatistics.costTimeMsFromLastPointAndPoint());
        TPDrmCapability.init(mAppContext);
        TPLogUtil.m21897i(TAG, "Init SDK, initAsyncWithWait  TPDrmCapability init, times: " + tPElapsedTimeStatistics.costTimeMsFromLastPointAndPoint());
        TPThumbplayerCapabilityHelper.init(mAppContext, true);
        TPLogUtil.m21897i(TAG, "Init SDK, initAsyncWithWait all times: " + tPElapsedTimeStatistics.costTimeMsFromStartPoint());
    }

    public static synchronized void initSdk(Context context, String str, int i) {
        synchronized (TPPlayerMgr.class) {
            dumpStackTrace();
            if (mIsInit) {
                TPLogUtil.m21897i(TAG, "Init SDK, has init sdk");
                return;
            }
            mIsInit = true;
            TPElapsedTimeStatistics tPElapsedTimeStatistics = new TPElapsedTimeStatistics();
            tPElapsedTimeStatistics.startPoint();
            preInitSync(context, str, i);
            Future<Boolean> initAsyncWithWait = initAsyncWithWait();
            initSync();
            initAsyncWithoutWait();
            tPElapsedTimeStatistics.point();
            try {
                if (initAsyncWithWait.get().booleanValue()) {
                    TPLogUtil.m21897i(TAG, "Init SDK, TPPlayer  wait initSync finish, times: " + tPElapsedTimeStatistics.costTimeMsFromLastPoint());
                }
            } catch (ExecutionException unused) {
                TPLogUtil.m21894e(TAG, "Init SDK, TPPlayer wait initSync ExecutionException, times: " + tPElapsedTimeStatistics.costTimeMsFromLastPoint());
            } catch (InterruptedException unused2) {
                TPLogUtil.m21894e(TAG, "Init SDK, TPPlayer wait initSync InterruptedException, times: " + tPElapsedTimeStatistics.costTimeMsFromLastPoint());
            }
            TPLogUtil.m21897i(TAG, "Init SDK, TPPlayer all times: " + tPElapsedTimeStatistics.costTimeMsFromStartPoint());
        }
    }

    private static void initSync() {
        TPElapsedTimeStatistics tPElapsedTimeStatistics = new TPElapsedTimeStatistics();
        tPElapsedTimeStatistics.startPoint();
        try {
            TPNativeLibraryLoader.loadLibIfNeeded(mAppContext);
        } catch (UnsupportedOperationException e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        }
        TPLogUtil.m21897i(TAG, "Init SDK, initSync so load times: " + tPElapsedTimeStatistics.costTimeMsFromStartPoint());
    }

    public static boolean isProxyEnable() {
        return TPProxyConfig.isProxyEnable() && TPDownloadProxyHelper.isReadyForPlay();
    }

    public static boolean isThumbPlayerEnable() {
        return TPNativeLibraryLoader.isLibLoadedAndTryToLoad();
    }

    public static void postEvent(int i, int i2, int i3, Object obj) {
        TPGlobalEventNofication.postGlobalEvent(i, i2, i3, obj);
    }

    private static void preInitSync(Context context, String str, int i) {
        TPElapsedTimeStatistics tPElapsedTimeStatistics = new TPElapsedTimeStatistics();
        tPElapsedTimeStatistics.startPoint();
        mAppContext = context.getApplicationContext();
        TPPlayerConfig.setGuid(str);
        TPPlayerConfig.setPlatform(i);
        TPProxyConfig.setDefaultServiceType(i);
        TPNativeLog.setLogCallback(new ITPNativeLogCallback() {
            public void onPrintLog(int i, String str, String str2) {
                if (i == 0) {
                    TPLogUtil.m21898v(str, str2);
                } else if (i == 1) {
                    TPLogUtil.m21893d(str, str2);
                } else if (i == 2) {
                    TPLogUtil.m21897i(str, str2);
                } else if (i == 3) {
                    TPLogUtil.m21899w(str, str2);
                } else if (i == 4) {
                    TPLogUtil.m21894e(str, str2);
                }
            }
        });
        TPLogUtil.m21897i(TAG, "Init SDK, preInitSync all times: " + tPElapsedTimeStatistics.costTimeMsFromStartPoint());
    }

    public static void setDebugEnable(boolean z) {
        TPPlayerConfig.setDebugEnable(z);
    }

    /* access modifiers changed from: private */
    public static synchronized void setExternalProperties() {
        synchronized (TPPlayerMgr.class) {
            for (Map.Entry next : mBoolPropertyNameToValueCache.entrySet()) {
                ITPPropertyHandler iTPPropertyHandler = mBooleanPropertyNameToPropertyHandlerTables.get(next.getKey());
                if (iTPPropertyHandler != null) {
                    iTPPropertyHandler.setPropertyValue(next.getValue());
                }
            }
            for (Map.Entry next2 : mIntegerPropertyNameToValueCache.entrySet()) {
                ITPPropertyHandler iTPPropertyHandler2 = mIntegerPropertyNameToPropertyHandlerTables.get(next2.getKey());
                if (iTPPropertyHandler2 != null) {
                    iTPPropertyHandler2.setPropertyValue(next2.getValue());
                }
            }
            for (Map.Entry next3 : mStringPropertyNameToValueCache.entrySet()) {
                ITPPropertyHandler iTPPropertyHandler3 = mStringPropertyNameToPropertyHandlerTables.get(next3.getKey());
                if (iTPPropertyHandler3 != null) {
                    iTPPropertyHandler3.setPropertyValue(next3.getValue());
                }
            }
            for (Map.Entry next4 : mLongPropertyNameToValueCache.entrySet()) {
                ITPPropertyHandler iTPPropertyHandler4 = mLongPropertyNameToPropertyHandlerTables.get(next4.getKey());
                if (iTPPropertyHandler4 != null) {
                    iTPPropertyHandler4.setPropertyValue(next4.getValue());
                }
            }
        }
    }

    public static void setHost(String str) {
        TPPlayerConfig.parseHostConfig(str);
    }

    public static void setLibLoader(final ITPModuleLoader iTPModuleLoader) {
        if (!mIsInit) {
            TPNativeLibraryLoader.setLibLoader(new ITPNativeLibraryExternalLoader() {
                public boolean loadLib(String str, String str2) {
                    ITPModuleLoader iTPModuleLoader = iTPModuleLoader;
                    if (iTPModuleLoader == null) {
                        return false;
                    }
                    try {
                        iTPModuleLoader.loadLibrary(str, str2);
                        return true;
                    } catch (Throwable th) {
                        TPLogUtil.m21895e(TPPlayerMgr.TAG, th);
                        return false;
                    }
                }
            });
            TPDownloadProxyHelper.setNativeLibLoader(new ITPDLProxyNativeLibLoader() {
                public boolean loadLib(String str, String str2) {
                    ITPModuleLoader iTPModuleLoader = iTPModuleLoader;
                    if (iTPModuleLoader == null) {
                        return false;
                    }
                    try {
                        iTPModuleLoader.loadLibrary(str, str2);
                        return true;
                    } catch (Throwable th) {
                        TPLogUtil.m21895e(TPPlayerMgr.TAG, th);
                        return false;
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("player has init");
    }

    public static void setOnLogListener(OnLogListener onLogListener) {
        TPLogUtil.setOnLogListener(onLogListener);
    }

    public static void setOutNetIP(String str) {
        TPPlayerConfig.setOutNetIp(str);
    }

    public static synchronized void setPropertyBool(String str, boolean z) {
        synchronized (TPPlayerMgr.class) {
            if (!mIsInit) {
                mBoolPropertyNameToValueCache.put(str, Boolean.valueOf(z));
                return;
            }
            ITPPropertyHandler iTPPropertyHandler = mBooleanPropertyNameToPropertyHandlerTables.get(str);
            if (iTPPropertyHandler == null) {
                TPLogUtil.m21899w(TAG, "not found handler of property, propertyName:" + str);
                return;
            }
            iTPPropertyHandler.setPropertyValue(Boolean.valueOf(z));
            mBoolPropertyNameToValueCache.put(str, Boolean.valueOf(z));
        }
    }

    public static synchronized void setPropertyInteger(String str, int i) {
        synchronized (TPPlayerMgr.class) {
            if (!mIsInit) {
                mIntegerPropertyNameToValueCache.put(str, Integer.valueOf(i));
                return;
            }
            ITPPropertyHandler iTPPropertyHandler = mIntegerPropertyNameToPropertyHandlerTables.get(str);
            if (iTPPropertyHandler == null) {
                TPLogUtil.m21899w(TAG, "not found handler of property, propertyName:" + str);
                return;
            }
            iTPPropertyHandler.setPropertyValue(Integer.valueOf(i));
            mIntegerPropertyNameToValueCache.put(str, Integer.valueOf(i));
        }
    }

    public static synchronized void setPropertyLong(String str, long j) {
        synchronized (TPPlayerMgr.class) {
            if (!mIsInit) {
                mLongPropertyNameToValueCache.put(str, Long.valueOf(j));
                return;
            }
            ITPPropertyHandler iTPPropertyHandler = mLongPropertyNameToPropertyHandlerTables.get(str);
            if (iTPPropertyHandler == null) {
                TPLogUtil.m21899w(TAG, "not found handler of property, propertyName:" + str);
                return;
            }
            iTPPropertyHandler.setPropertyValue(Long.valueOf(j));
            mLongPropertyNameToValueCache.put(str, Long.valueOf(j));
        }
    }

    public static synchronized void setPropertyString(String str, String str2) {
        synchronized (TPPlayerMgr.class) {
            if (!mIsInit) {
                mStringPropertyNameToValueCache.put(str, str2);
                return;
            }
            ITPPropertyHandler iTPPropertyHandler = mStringPropertyNameToPropertyHandlerTables.get(str);
            if (iTPPropertyHandler == null) {
                TPLogUtil.m21899w(TAG, "not found handler of property, propertyName:" + str);
                return;
            }
            iTPPropertyHandler.setPropertyValue(str2);
            mStringPropertyNameToValueCache.put(str, str2);
        }
    }

    public static void setProxyConfig(int i, String str, String str2) {
        TPProxyConfig.setProxyConfig(i, str, str2);
    }

    public static void setProxyEnable(boolean z) {
        TPProxyConfig.setProxyEnable(z);
    }

    public static void setProxyMaxStorageSizeMB(long j) {
        TPLogUtil.m21897i(TAG, "setProxyMaxStorageSize: " + j + " MB.");
        TPProxyConfig.setMaxUseStorageMB(j);
        TPProxyGlobalManager.getInstance().updateMaxStorageSizeMB(j);
    }

    public static void setProxyServiceType(int i) {
        TPProxyConfig.setDefaultServiceType(i);
    }

    public static void setProxyVodCachedEnable(int i, boolean z) {
        TPProxyConfig.setVodCachedEnable(i, z);
        TPProxyGlobalManager.getInstance().updateVodCachedEnable(i, z);
    }

    public static void setTPProxyAdapter(ITPProxyAdapter iTPProxyAdapter) {
        TPDownloadProxyHelper.setTPProxyAdapter(iTPProxyAdapter);
    }

    public static void setUpcInfo(String str, int i) {
        TPPlayerConfig.setUserUpc(str);
        TPPlayerConfig.setUserUpcState(i);
        TPGlobalEventNofication.postGlobalEvent(TPGlobalEventNofication.EVENT_ID_UPC_CHANGED, i, 0, str);
    }

    public static void setUserInfo(String str, boolean z) {
        TPPlayerConfig.setUserUin(str);
        TPPlayerConfig.setUserIsVip(z);
    }

    @Deprecated
    public static synchronized boolean getPropertyBoolean(String str) {
        boolean propertyBoolean;
        synchronized (TPPlayerMgr.class) {
            propertyBoolean = getPropertyBoolean(str, false);
        }
        return propertyBoolean;
    }

    @Deprecated
    public static synchronized int getPropertyInteger(String str) {
        int propertyInteger;
        synchronized (TPPlayerMgr.class) {
            propertyInteger = getPropertyInteger(str, 0);
        }
        return propertyInteger;
    }

    @Deprecated
    public static long getPropertyLong(String str) {
        return getPropertyLong(str, 0);
    }

    @Deprecated
    public static String getPropertyString(String str) {
        return getPropertyString(str, "");
    }

    public static void setProxyMaxStorageSizeMB(int i, long j) {
        TPProxyConfig.setMaxUseStorageMB(i, j);
        TPProxyGlobalManager.getInstance().updateMaxStorageSizeMB(i, j);
    }

    public static void initSdk(Context context, TPInitParams tPInitParams) {
        TPSystemInfo.setDeviceName(tPInitParams.getDeviceName());
        initSdk(context, tPInitParams.getGuid(), tPInitParams.getPlatform());
    }
}
