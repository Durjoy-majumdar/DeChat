package com.tencent.thumbplayer.datatransport.config;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class TPProxyServiceConfig {
    public String cacheDir;
    public String dataDir;
    public String initConfig;
    public long maxUseMemoryMB;
    public long maxUseStorageMB;
    public boolean reportEnable = true;
    public int serviceType;
    public boolean vodCachedEnable = false;

    public static final class Helper {
        public static String bufferTimeSecJsonConfig(long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("VodEmergencyTimeMax", j);
                jSONObject.put("VodSafePlayTimeMax", j);
                jSONObject.put("FileVodEmergencyTimeMax", j);
                jSONObject.put("FileVodSafePlayTimeMax", j);
                return jSONObject.toString();
            } catch (JSONException unused) {
                return "";
            }
        }

        public static TPProxyServiceConfig clone(TPProxyServiceConfig tPProxyServiceConfig) {
            TPProxyServiceConfig tPProxyServiceConfig2 = new TPProxyServiceConfig();
            tPProxyServiceConfig2.serviceType = tPProxyServiceConfig.serviceType;
            tPProxyServiceConfig2.cacheDir = tPProxyServiceConfig.cacheDir;
            tPProxyServiceConfig2.dataDir = tPProxyServiceConfig.dataDir;
            tPProxyServiceConfig2.maxUseMemoryMB = tPProxyServiceConfig.maxUseMemoryMB;
            tPProxyServiceConfig2.maxUseStorageMB = tPProxyServiceConfig.maxUseStorageMB;
            tPProxyServiceConfig2.vodCachedEnable = tPProxyServiceConfig.vodCachedEnable;
            tPProxyServiceConfig2.reportEnable = tPProxyServiceConfig.reportEnable;
            tPProxyServiceConfig2.initConfig = tPProxyServiceConfig.initConfig;
            return tPProxyServiceConfig2;
        }

        public static String jsonConfig(TPProxyServiceConfig tPProxyServiceConfig) {
            if (!TextUtils.isEmpty(tPProxyServiceConfig.initConfig)) {
                return tPProxyServiceConfig.initConfig;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("EnableReport", tPProxyServiceConfig.reportEnable);
                jSONObject.put("VodCacheEnable", tPProxyServiceConfig.vodCachedEnable);
                long j = tPProxyServiceConfig.maxUseMemoryMB;
                if (j > 0) {
                    jSONObject.put("MaxUseMemoryLevel1MB", j);
                    jSONObject.put("MaxUseMemoryLevel2MB", tPProxyServiceConfig.maxUseMemoryMB);
                    jSONObject.put("MaxUseMemoryMB", tPProxyServiceConfig.maxUseMemoryMB);
                }
                return jSONObject.toString();
            } catch (JSONException unused) {
                return "";
            }
        }

        public static String maxUseMemoryMBJsonConfig(long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("MaxUseMemoryLevel1MB", j);
                jSONObject.put("MaxUseMemoryLevel2MB", j);
                jSONObject.put("MaxUseMemoryMB", j);
                return jSONObject.toString();
            } catch (JSONException unused) {
                return "";
            }
        }

        public static String reportEnableJsonConfig(boolean z) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("EnableReport", z);
                return jSONObject.toString();
            } catch (JSONException unused) {
                return "";
            }
        }

        public static String vodCachedEnableJsonConfig(boolean z) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("VodCacheEnable", z);
                return jSONObject.toString();
            } catch (JSONException unused) {
                return "";
            }
        }
    }
}
