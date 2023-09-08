package com.tencent.thumbplayer.tplayer.reportv2.data;

import com.tencent.thumbplayer.utils.TPLogUtil;
import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TPCommonParams implements Serializable {
    @TPReportParam(key = "appname")
    private String mAppName = "";
    @TPReportParam(key = "appver")
    private String mAppVer = "";
    @TPReportParam(key = "audioencodefmt")
    private int mAudioEncodeFmt = -1;
    @TPReportParam(key = "cdnip")
    private String mCdnIp = "";
    @TPReportParam(key = "cdnuip")
    private String mCdnUip = "";
    @TPReportParam(key = "containerformat")
    private String mContainerFormat = "";
    @TPReportParam(key = "datatransportprotocolver")
    private String mDataTransportProtocolVer = "";
    @TPReportParam(key = "datatransportver")
    private String mDataTransportVer = "";
    @TPReportParam(key = "devicename")
    private String mDeviceName = "";
    @TPReportParam(key = "devtype")
    private int mDeviceType = -1;
    @TPReportParam(key = "drmability")
    private int mDrmAbility = -1;
    @TPReportParam(key = "durationms")
    private long mDurationMs = -1;
    @TPReportParam(key = "flowid")
    private String mFlowId = "";
    @TPReportParam(key = "guid")
    private String mGuid = "";
    @TPReportParam(key = "hlssourcetype")
    private int mHlsSourceType = -1;
    private Map<String, String> mInitExtFields = null;
    private Map<String, String> mInitRsvExtFields = null;
    @TPReportParam(key = "networktype")
    private int mNetworkType = -1;
    @TPReportParam(key = "osver")
    private String mOsVersion = "";
    private Map<String, String> mPeriodExtFields = null;
    private Map<String, String> mPeriodRsvExtFields = null;
    @TPReportParam(key = "platform")
    private int mPlatform = -1;
    @TPReportParam(key = "platformtype")
    private int mPlatformType = -1;
    @TPReportParam(key = "playerconfig")
    private String mPlayerConfig = "";
    @TPReportParam(key = "playertype")
    private int mPlayerType = -1;
    @TPReportParam(key = "playerver")
    private String mPlayerVer = "";
    @TPReportParam(key = "reportprotocolver")
    private String mReportProtocolVer = "";
    @TPReportParam(key = "resolution")
    private String mResolution = "";
    @TPReportParam(key = "seq")
    private int mSeq = -1;
    @TPReportParam(key = "speedkbps")
    private int mSpeedKbps = -1;
    @TPReportParam(key = "streambitratekbps")
    private long mStreamBitrateKbps = -1;
    @TPReportParam(key = "subtitleencodefmt")
    private int mSubtitleEncodeFmt = -1;
    @TPReportParam(key = "url")
    private String mUrl = "";
    @TPReportParam(key = "urlprotocol")
    private int mUrlProtocol = -1;
    @TPReportParam(key = "usedatatransport")
    private int mUseDataTransport = -1;
    @TPReportParam(key = "videoencodefmt")
    private int mVideoEncodeFmt = -1;
    @TPReportParam(key = "videoframerate")
    private float mVideoFrameRate = -1.0f;

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface TPReportParam {
        String key() default "";
    }

    private Map<String, String> constructMapFromFields(Field[] fieldArr) {
        HashMap hashMap = new HashMap();
        for (Field field : fieldArr) {
            TPReportParam tPReportParam = (TPReportParam) field.getAnnotation(TPReportParam.class);
            if (tPReportParam != null) {
                hashMap.put(tPReportParam.key(), getFieldValue(field));
            }
        }
        return hashMap;
    }

    private String getFieldValue(Field field) {
        String str;
        try {
            field.setAccessible(true);
            if (field.getType() == Integer.TYPE) {
                str = String.valueOf(field.getInt(this));
            } else if (field.getType() == Long.TYPE) {
                str = String.valueOf(field.getLong(this));
            } else if (field.getType() == Float.TYPE) {
                str = String.valueOf(field.getFloat(this));
            } else if (field.getType() == Boolean.TYPE) {
                str = String.valueOf(field.getBoolean(this));
            } else if (field.getType() == String.class) {
                str = (String) field.get(this);
            } else {
                String name = getClass().getName();
                TPLogUtil.m21894e(name, "getFieldValue field:" + field.getName() + " is not match.");
                return "-1";
            }
            return str;
        } catch (Exception e) {
            TPLogUtil.m21895e(getClass().getName(), (Throwable) e);
            return "-1";
        }
    }

    private void updateInitExtMapFromPeriodExtMap() {
        Map<String, String> map;
        Map<String, String> map2 = this.mInitExtFields;
        if (map2 != null && (map = this.mPeriodExtFields) != null) {
            updateMap(map2, map);
        }
    }

    private void updateInitRsvExtMapFromPeriodRsvExtMap() {
        Map<String, String> map;
        Map<String, String> map2 = this.mInitRsvExtFields;
        if (map2 != null && (map = this.mPeriodRsvExtFields) != null) {
            updateMap(map2, map);
        }
    }

    private static void updateMap(Map<String, String> map, Map<String, String> map2) {
        for (Map.Entry next : map2.entrySet()) {
            if (map.containsKey(next.getKey())) {
                map.put(next.getKey(), next.getValue());
            }
        }
    }

    public void copyCommonParams(TPCommonParams tPCommonParams) {
        this.mFlowId = tPCommonParams.mFlowId;
        this.mGuid = tPCommonParams.mGuid;
        this.mSeq = tPCommonParams.mSeq;
        this.mPlatformType = tPCommonParams.mPlatformType;
        this.mDeviceType = tPCommonParams.mDeviceType;
        this.mNetworkType = tPCommonParams.mNetworkType;
        this.mDeviceName = tPCommonParams.mDeviceName;
        this.mOsVersion = tPCommonParams.mOsVersion;
        this.mAppName = tPCommonParams.mAppName;
        this.mPlayerVer = tPCommonParams.mPlayerVer;
        this.mAppVer = tPCommonParams.mAppVer;
        this.mReportProtocolVer = tPCommonParams.mReportProtocolVer;
        this.mDurationMs = tPCommonParams.mDurationMs;
        this.mHlsSourceType = tPCommonParams.mHlsSourceType;
        this.mPlayerType = tPCommonParams.mPlayerType;
        this.mUrlProtocol = tPCommonParams.mUrlProtocol;
        this.mContainerFormat = tPCommonParams.mContainerFormat;
        this.mVideoEncodeFmt = tPCommonParams.mVideoEncodeFmt;
        this.mAudioEncodeFmt = tPCommonParams.mAudioEncodeFmt;
        this.mSubtitleEncodeFmt = tPCommonParams.mSubtitleEncodeFmt;
        this.mStreamBitrateKbps = tPCommonParams.mStreamBitrateKbps;
        this.mVideoFrameRate = tPCommonParams.mVideoFrameRate;
        this.mUrl = tPCommonParams.mUrl;
        this.mResolution = tPCommonParams.mResolution;
        this.mDataTransportVer = tPCommonParams.mDataTransportVer;
        this.mSpeedKbps = tPCommonParams.mSpeedKbps;
        this.mUseDataTransport = tPCommonParams.mUseDataTransport;
        this.mCdnUip = tPCommonParams.mCdnUip;
        this.mCdnIp = tPCommonParams.mCdnIp;
        this.mDataTransportProtocolVer = tPCommonParams.mDataTransportProtocolVer;
        this.mPlatform = tPCommonParams.mPlatform;
        this.mPlayerConfig = tPCommonParams.mPlayerConfig;
        this.mInitRsvExtFields = tPCommonParams.mInitRsvExtFields;
        this.mInitExtFields = tPCommonParams.mInitExtFields;
        this.mPeriodRsvExtFields = tPCommonParams.mPeriodRsvExtFields;
        this.mPeriodExtFields = tPCommonParams.mPeriodExtFields;
        this.mDrmAbility = tPCommonParams.mDrmAbility;
    }

    public Map<String, String> fillParamsToMap() {
        HashMap hashMap = new HashMap();
        Class<? super Object> superclass = getClass().getSuperclass();
        if (superclass != null) {
            hashMap.putAll(constructMapFromFields(superclass.getDeclaredFields()));
        }
        hashMap.putAll(constructMapFromFields(getClass().getDeclaredFields()));
        updateInitRsvExtMapFromPeriodRsvExtMap();
        updateInitExtMapFromPeriodExtMap();
        Map<String, String> map = this.mInitRsvExtFields;
        if (map != null) {
            hashMap.putAll(map);
        }
        Map<String, String> map2 = this.mPeriodRsvExtFields;
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        Map<String, String> map3 = this.mInitExtFields;
        if (map3 != null) {
            hashMap.putAll(map3);
        }
        Map<String, String> map4 = this.mPeriodExtFields;
        if (map4 != null) {
            hashMap.putAll(map4);
        }
        return hashMap;
    }

    public String geResolution() {
        return this.mResolution;
    }

    public String getAppName() {
        return this.mAppName;
    }

    public String getAppVer() {
        return this.mAppVer;
    }

    public int getAudioEncodeFmt() {
        return this.mAudioEncodeFmt;
    }

    public String getCdnIp() {
        return this.mCdnIp;
    }

    public String getCdnUip() {
        return this.mCdnUip;
    }

    public String getContainerFormat() {
        return this.mContainerFormat;
    }

    public String getDataTransportProtocolVer() {
        return this.mDataTransportProtocolVer;
    }

    public String getDataTransportVer() {
        return this.mDataTransportVer;
    }

    public String getDeviceName() {
        return this.mDeviceName;
    }

    public int getDeviceType() {
        return this.mDeviceType;
    }

    public int getDrmAbility() {
        return this.mDrmAbility;
    }

    public long getDurationMs() {
        return this.mDurationMs;
    }

    public String getFlowId() {
        return this.mFlowId;
    }

    public String getGuid() {
        return this.mGuid;
    }

    public int getHlsSourceType() {
        return this.mHlsSourceType;
    }

    public Map<String, String> getInitExtFields() {
        Map<String, String> map = this.mInitExtFields;
        if (map == null) {
            return null;
        }
        return Collections.unmodifiableMap(map);
    }

    public Map<String, String> getInitRsvExtFields() {
        Map<String, String> map = this.mInitRsvExtFields;
        if (map == null) {
            return null;
        }
        return Collections.unmodifiableMap(map);
    }

    public int getNetworkType() {
        return this.mNetworkType;
    }

    public String getOsVersion() {
        return this.mOsVersion;
    }

    public Map<String, String> getPeriodExtFields() {
        Map<String, String> map = this.mPeriodExtFields;
        if (map == null) {
            return null;
        }
        return Collections.unmodifiableMap(map);
    }

    public Map<String, String> getPeriodRsvExtFields() {
        Map<String, String> map = this.mPeriodRsvExtFields;
        if (map == null) {
            return null;
        }
        return Collections.unmodifiableMap(map);
    }

    public int getPlatform() {
        return this.mPlatform;
    }

    public int getPlatformType() {
        return this.mPlatformType;
    }

    public String getPlayerConfig() {
        return this.mPlayerConfig;
    }

    public int getPlayerType() {
        return this.mPlayerType;
    }

    public String getPlayerVer() {
        return this.mPlayerVer;
    }

    public String getReportProtocolVer() {
        return this.mReportProtocolVer;
    }

    public int getSeq() {
        return this.mSeq;
    }

    public int getSpeedKbps() {
        return this.mSpeedKbps;
    }

    public long getStreamBitrateKbps() {
        return this.mStreamBitrateKbps;
    }

    public int getSubtitleEncodeFmt() {
        return this.mSubtitleEncodeFmt;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public int getUrlProtocol() {
        return this.mUrlProtocol;
    }

    public int getUseDataTransport() {
        return this.mUseDataTransport;
    }

    public int getVideoEncodeFmt() {
        return this.mVideoEncodeFmt;
    }

    public float getVideoFrameRate() {
        return this.mVideoFrameRate;
    }

    public void setAppName(String str) {
        this.mAppName = str;
    }

    public void setAppVer(String str) {
        this.mAppVer = str;
    }

    public void setAudioEncodeFmt(int i) {
        this.mAudioEncodeFmt = i;
    }

    public void setCdnIp(String str) {
        this.mCdnIp = str;
    }

    public void setCdnUip(String str) {
        this.mCdnUip = str;
    }

    public void setContainerFormat(String str) {
        this.mContainerFormat = str;
    }

    public void setDataTransportProtocolVer(String str) {
        this.mDataTransportProtocolVer = str;
    }

    public void setDataTransportVer(String str) {
        this.mDataTransportVer = str;
    }

    public void setDeviceName(String str) {
        this.mDeviceName = str;
    }

    public void setDeviceType(int i) {
        this.mDeviceType = i;
    }

    public void setDrmAbility(int i) {
        this.mDrmAbility = i;
    }

    public void setDurationMs(long j) {
        this.mDurationMs = j;
    }

    public void setFlowId(String str) {
        this.mFlowId = str;
    }

    public void setGuid(String str) {
        this.mGuid = str;
    }

    public void setHlsSourceType(int i) {
        this.mHlsSourceType = i;
    }

    public void setInitExtFields(Map<String, String> map) {
        this.mInitExtFields = map;
    }

    public void setInitRsvExtFields(Map<String, String> map) {
        this.mInitRsvExtFields = map;
    }

    public void setNetworkType(int i) {
        this.mNetworkType = i;
    }

    public void setOsVersion(String str) {
        this.mOsVersion = str;
    }

    public void setPeriodExtFields(Map<String, String> map) {
        this.mPeriodExtFields = map;
    }

    public void setPeriodRsvExtFields(Map<String, String> map) {
        this.mPeriodRsvExtFields = map;
    }

    public void setPlatform(int i) {
        this.mPlatform = i;
    }

    public void setPlatformType(int i) {
        this.mPlatformType = i;
    }

    public void setPlayerConfig(String str) {
        this.mPlayerConfig = str;
    }

    public void setPlayerType(int i) {
        this.mPlayerType = i;
    }

    public void setPlayerVer(String str) {
        this.mPlayerVer = str;
    }

    public void setReportProtocolVer(String str) {
        this.mReportProtocolVer = str;
    }

    public void setResolution(String str) {
        this.mResolution = str;
    }

    public void setSeq(int i) {
        this.mSeq = i;
    }

    public void setSpeedKbps(int i) {
        this.mSpeedKbps = i;
    }

    public void setStreamBitrateKbps(long j) {
        this.mStreamBitrateKbps = j;
    }

    public void setSubtitleEncodeFmt(int i) {
        this.mSubtitleEncodeFmt = i;
    }

    public void setUrl(String str) {
        this.mUrl = str;
    }

    public void setUrlProtocol(int i) {
        this.mUrlProtocol = i;
    }

    public void setUseDataTransport(int i) {
        this.mUseDataTransport = i;
    }

    public void setVideoEncodeFmt(int i) {
        this.mVideoEncodeFmt = i;
    }

    public void setVideoFrameRate(float f) {
        this.mVideoFrameRate = f;
    }
}
