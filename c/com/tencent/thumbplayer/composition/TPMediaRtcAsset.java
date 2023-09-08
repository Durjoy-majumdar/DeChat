package com.tencent.thumbplayer.composition;

import com.tencent.thumbplayer.api.composition.ITPMediaRTCAsset;
import com.tencent.thumbplayer.utils.TPLogUtil;
import java.io.IOException;

public class TPMediaRtcAsset extends TPMediaCommonAsset implements ITPMediaRTCAsset {
    private static final String TAG = "TPMediaWebrtcAsset";
    private int mSdpExchangeType;
    private String mServerUrl;
    private String mStreamUrl;

    public TPMediaRtcAsset(String str, String str2) {
        this.mSdpExchangeType = 0;
        this.mStreamUrl = str;
        this.mServerUrl = str2;
    }

    public int getMediaType() {
        return 0;
    }

    public int getRtcSdpExchangeType() {
        return this.mSdpExchangeType;
    }

    public String getRtcServerUrl() {
        return this.mServerUrl;
    }

    public String getRtcStreamUrl() {
        return this.mStreamUrl;
    }

    public String getUrl() {
        try {
            return TPMediaCompositionXmlGenerator.buildXmlPathFromRtcAsset(this);
        } catch (IOException e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
            return "";
        }
    }

    public TPMediaRtcAsset(String str, String str2, int i) {
        this.mStreamUrl = str;
        this.mServerUrl = str2;
        this.mSdpExchangeType = i;
    }
}
