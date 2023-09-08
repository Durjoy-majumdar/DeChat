package com.tencent.thumbplayer.datatransport.config;

import android.text.TextUtils;
import com.tencent.thumbplayer.api.TPPlayerMgr;
import com.tencent.thumbplayer.config.TPPlayerConfig;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDLProxyInitParam;
import com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig;
import java.util.HashMap;
import java.util.Map;

public class TPProxyConfig {
    private static final int SERVICE_TYPE_DEFAULT = 0;
    private static final Map<Integer, TPProxyServiceConfig> mConfigs = new HashMap(1);
    private static int mDefaultServiceType = 0;
    private static volatile boolean mProxyEnable = true;

    private static void addServiceConfig(TPProxyServiceConfig tPProxyServiceConfig) {
        Map<Integer, TPProxyServiceConfig> map = mConfigs;
        synchronized (map) {
            map.put(Integer.valueOf(tPProxyServiceConfig.serviceType), tPProxyServiceConfig);
        }
    }

    public static int getDefaultServiceType() {
        return mDefaultServiceType;
    }

    public static TPProxyServiceConfig getProxyConfig(int i) {
        TPProxyServiceConfig serviceConfig = getServiceConfig(i);
        return serviceConfig == null ? new TPProxyServiceConfig() : TPProxyServiceConfig.Helper.clone(serviceConfig);
    }

    public static TPDLProxyInitParam getProxyInitParam(int i) {
        TPProxyServiceConfig serviceConfig = getServiceConfig(i);
        if (serviceConfig == null) {
            serviceConfig = getProxyConfig(mDefaultServiceType);
        }
        return new TPDLProxyInitParam(TPPlayerConfig.getPlatform(), TPPlayerConfig.getAppVersionName(TPPlayerMgr.getAppContext()), TPPlayerConfig.getGuid(), serviceConfig.cacheDir, serviceConfig.dataDir, TPProxyServiceConfig.Helper.jsonConfig(serviceConfig));
    }

    private static TPProxyServiceConfig getServiceConfig(int i) {
        TPProxyServiceConfig tPProxyServiceConfig;
        Map<Integer, TPProxyServiceConfig> map = mConfigs;
        synchronized (map) {
            tPProxyServiceConfig = map.get(Integer.valueOf(i));
        }
        return tPProxyServiceConfig;
    }

    public static boolean isProxyEnable() {
        return mProxyEnable;
    }

    public static void setDefaultServiceType(int i) {
        mDefaultServiceType = i;
        TPProxyServiceConfig tPProxyServiceConfig = new TPProxyServiceConfig();
        tPProxyServiceConfig.serviceType = mDefaultServiceType;
        setProxyConfig(tPProxyServiceConfig);
    }

    public static void setInitConfig(int i, String str) {
        TPProxyServiceConfig serviceConfig = getServiceConfig(i);
        if (serviceConfig != null && !TextUtils.isEmpty(str)) {
            serviceConfig.initConfig = str;
        }
    }

    public static void setMaxUseMemoryMB(long j) {
        Map<Integer, TPProxyServiceConfig> map = mConfigs;
        synchronized (map) {
            for (TPProxyServiceConfig tPProxyServiceConfig : map.values()) {
                tPProxyServiceConfig.maxUseMemoryMB = j;
            }
        }
    }

    public static void setMaxUseStorageMB(long j) {
        Map<Integer, TPProxyServiceConfig> map = mConfigs;
        synchronized (map) {
            for (TPProxyServiceConfig tPProxyServiceConfig : map.values()) {
                tPProxyServiceConfig.maxUseStorageMB = j;
            }
        }
    }

    public static void setProxyConfig(int i, String str, String str2) {
        TPProxyServiceConfig serviceConfig = getServiceConfig(i);
        if (serviceConfig == null) {
            serviceConfig = new TPProxyServiceConfig();
        }
        serviceConfig.serviceType = i;
        serviceConfig.cacheDir = str;
        serviceConfig.dataDir = str2;
        addServiceConfig(serviceConfig);
    }

    public static void setProxyEnable(boolean z) {
        mProxyEnable = z;
    }

    public static void setReportEnable(boolean z) {
        Map<Integer, TPProxyServiceConfig> map = mConfigs;
        synchronized (map) {
            for (TPProxyServiceConfig tPProxyServiceConfig : map.values()) {
                tPProxyServiceConfig.reportEnable = z;
            }
        }
    }

    public static void setVodCachedEnable(boolean z) {
        Map<Integer, TPProxyServiceConfig> map = mConfigs;
        synchronized (map) {
            for (TPProxyServiceConfig tPProxyServiceConfig : map.values()) {
                tPProxyServiceConfig.vodCachedEnable = z;
            }
        }
    }

    public static void setMaxUseMemoryMB(int i, long j) {
        TPProxyServiceConfig serviceConfig = getServiceConfig(i);
        if (serviceConfig != null) {
            serviceConfig.maxUseMemoryMB = j;
        }
    }

    public static void setMaxUseStorageMB(int i, long j) {
        TPProxyServiceConfig serviceConfig = getServiceConfig(i);
        if (serviceConfig != null) {
            serviceConfig.maxUseStorageMB = j;
        }
    }

    public static void setReportEnable(int i, boolean z) {
        TPProxyServiceConfig serviceConfig = getServiceConfig(i);
        if (serviceConfig != null) {
            serviceConfig.reportEnable = z;
        }
    }

    public static void setVodCachedEnable(int i, boolean z) {
        TPProxyServiceConfig serviceConfig = getServiceConfig(i);
        if (serviceConfig != null) {
            serviceConfig.vodCachedEnable = z;
        }
    }

    public static void setProxyConfig(TPProxyServiceConfig tPProxyServiceConfig) {
        if (getServiceConfig(tPProxyServiceConfig.serviceType) == null) {
            TPProxyServiceConfig clone = TPProxyServiceConfig.Helper.clone(tPProxyServiceConfig);
            clone.serviceType = tPProxyServiceConfig.serviceType;
            clone.cacheDir = tPProxyServiceConfig.cacheDir;
            clone.dataDir = tPProxyServiceConfig.dataDir;
            clone.maxUseMemoryMB = tPProxyServiceConfig.maxUseMemoryMB;
            clone.maxUseStorageMB = tPProxyServiceConfig.maxUseStorageMB;
            clone.vodCachedEnable = tPProxyServiceConfig.vodCachedEnable;
            clone.initConfig = tPProxyServiceConfig.initConfig;
            addServiceConfig(clone);
        }
    }
}
