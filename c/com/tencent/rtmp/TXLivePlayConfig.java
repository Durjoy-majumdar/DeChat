package com.tencent.rtmp;

import java.io.Serializable;
import java.util.Map;

public class TXLivePlayConfig implements Serializable {
    private static final long serialVersionUID = 1;
    public boolean mAutoAdjustCacheTime = true;
    public boolean mAutoRotate = true;
    public String mCacheFolderPath;
    public float mCacheTime = 5.0f;
    public int mConnectRetryCount = 3;
    public int mConnectRetryInterval = 3;
    public boolean mEnableAec = false;
    public boolean mEnableMessage = false;
    public boolean mEnableMetaData = false;
    public boolean mEnableNearestIP = true;
    public String mFlvSessionKey = "";
    public Map<String, String> mHeaders;
    public float mMaxAutoAdjustCacheTime = 5.0f;
    public int mMaxCacheItems;
    public float mMinAutoAdjustCacheTime = 1.0f;
    public int mRtmpChannelType = 0;
    public int mVideoBlockThreshold = 800;

    public String getCacheFolderPath() {
        return this.mCacheFolderPath;
    }

    public float getCacheTime() {
        return this.mCacheTime;
    }

    public int getConnectRetryCount() {
        return this.mConnectRetryCount;
    }

    public int getConnectRetryInterval() {
        return this.mConnectRetryInterval;
    }

    public String getFlvSessionKey() {
        return this.mFlvSessionKey;
    }

    public Map<String, String> getHeaders() {
        return this.mHeaders;
    }

    public float getMaxAutoAdjustCacheTime() {
        return this.mMaxAutoAdjustCacheTime;
    }

    public int getMaxCacheItems() {
        return this.mMaxCacheItems;
    }

    public float getMinAutoAdjustCacheTime() {
        return this.mMinAutoAdjustCacheTime;
    }

    public int getRtmpChannelType() {
        return this.mRtmpChannelType;
    }

    public int getVideoBlockThreshold() {
        return this.mVideoBlockThreshold;
    }

    public boolean isAutoAdjustCacheTime() {
        return this.mAutoAdjustCacheTime;
    }

    public boolean isAutoRotate() {
        return this.mAutoRotate;
    }

    public boolean isEnableAec() {
        return this.mEnableAec;
    }

    public boolean isEnableMessage() {
        return this.mEnableMessage;
    }

    public boolean isEnableMetaData() {
        return this.mEnableMetaData;
    }

    public boolean isEnableNearestIP() {
        return this.mEnableNearestIP;
    }

    public void setAutoAdjustCacheTime(boolean z) {
        this.mAutoAdjustCacheTime = z;
    }

    @Deprecated
    public void setCacheFolderPath(String str) {
        this.mCacheFolderPath = str;
    }

    public void setCacheTime(float f) {
        this.mCacheTime = f;
    }

    public void setConnectRetryCount(int i) {
        this.mConnectRetryCount = i;
    }

    public void setConnectRetryInterval(int i) {
        this.mConnectRetryInterval = i;
    }

    public void setEnableAEC(boolean z) {
        this.mEnableAec = z;
    }

    public void setEnableMessage(boolean z) {
        this.mEnableMessage = z;
    }

    public void setEnableMetaData(boolean z) {
        this.mEnableMetaData = z;
    }

    @Deprecated
    public void setEnableNearestIP(boolean z) {
        this.mEnableNearestIP = z;
    }

    public void setFlvSessionKey(String str) {
        this.mFlvSessionKey = str;
    }

    @Deprecated
    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }

    public void setMaxAutoAdjustCacheTime(float f) {
        this.mMaxAutoAdjustCacheTime = f;
    }

    @Deprecated
    public void setMaxCacheItems(int i) {
        this.mMaxCacheItems = i;
    }

    public void setMinAutoAdjustCacheTime(float f) {
        this.mMinAutoAdjustCacheTime = f;
    }

    @Deprecated
    public void setRtmpChannelType(int i) {
        this.mRtmpChannelType = i;
    }

    public void setVideoBlockThreshold(int i) {
        this.mVideoBlockThreshold = i;
    }

    public String toString() {
        return "{mCacheTime=" + this.mCacheTime + ", mMaxAutoAdjustCacheTime=" + this.mMaxAutoAdjustCacheTime + ", mMinAutoAdjustCacheTime=" + this.mMinAutoAdjustCacheTime + ", mAutoAdjustCacheTime=" + this.mAutoAdjustCacheTime + ", mVideoBlockThreshold=" + this.mVideoBlockThreshold + ", mConnectRetryCount=" + this.mConnectRetryCount + ", mConnectRetryInterval=" + this.mConnectRetryInterval + ", mEnableAec=" + this.mEnableAec + ", mEnableMessage=" + this.mEnableMessage + ", mEnableMetaData=" + this.mEnableMetaData + '}';
    }
}
