package com.tencent.thumbplayer.tplayer.reportv2.data.vod;

import com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams;

public class TPVodDrmParams extends TPCommonParams {
    @TPCommonParams.TPReportParam(key = "certificateetimems")
    private long mCertificateETimeMs;
    @TPCommonParams.TPReportParam(key = "certificatestimems")
    private long mCertificateSTimeMs;
    @TPCommonParams.TPReportParam(key = "componentname")
    private String mComponentName = "";
    @TPCommonParams.TPReportParam(key = "drmtype")
    private int mDrmType = -1;
    @TPCommonParams.TPReportParam(key = "getkeyreqetimems")
    private long mGetKeyReqETimeMs;
    @TPCommonParams.TPReportParam(key = "getkeyreqstimems")
    private long mGetKeyReqSTimeMs;
    @TPCommonParams.TPReportParam(key = "getprovisionreqetimems")
    private long mGetProvisionReqETimeMs;
    @TPCommonParams.TPReportParam(key = "getprovisionreqstimems")
    private long mGetProvisionReqSTimeMs;
    @TPCommonParams.TPReportParam(key = "licenseetimems")
    private long mLicenseETimeMs;
    @TPCommonParams.TPReportParam(key = "licensestimems")
    private long mLicenseSTimeMs;
    @TPCommonParams.TPReportParam(key = "opensessionetimems")
    private long mOpenSessionETimeMs;
    @TPCommonParams.TPReportParam(key = "opensessionstimems")
    private long mOpenSessionSTimeMs;
    @TPCommonParams.TPReportParam(key = "prepareetimems")
    private long mPrepareETimeMs = 0;
    @TPCommonParams.TPReportParam(key = "preparestimems")
    private long mPrepareSTimeMs = 0;
    @TPCommonParams.TPReportParam(key = "providekeyrespetimems")
    private long mProvideKeyRespETimeMs;
    @TPCommonParams.TPReportParam(key = "providekeyrespstimems")
    private long mProvideKeyRespSTimeMs;
    @TPCommonParams.TPReportParam(key = "provideprovisionrespetimems")
    private long mProvideProvisionRespETimeMs;
    @TPCommonParams.TPReportParam(key = "provideprovisionrespstimems")
    private long mProvideProvisionRespSTimeMs;
    @TPCommonParams.TPReportParam(key = "recvkeyresptimems")
    private long mRecvKeyRespTimeMs;
    @TPCommonParams.TPReportParam(key = "recvprovisionresptimems")
    private long mRecvProvisionRespTimeMs;
    @TPCommonParams.TPReportParam(key = "securelevel")
    private int mSecureLevel = -1;
    @TPCommonParams.TPReportParam(key = "sendkeyreqtimems")
    private long mSendKeyReqTimeMs;
    @TPCommonParams.TPReportParam(key = "sendprovisionreqtimems")
    private long mSendProvisionReqTimeMs;
    @TPCommonParams.TPReportParam(key = "supportsecuredecoder")
    private int mSupportSecureDecoder = -1;
    @TPCommonParams.TPReportParam(key = "supportsecuredecrypt")
    private int mSupportSecureDecrypt = -1;

    public long getCertificateETimeMs() {
        return this.mCertificateETimeMs;
    }

    public long getCertificateSTimeMs() {
        return this.mCertificateSTimeMs;
    }

    public String getComponentName() {
        return this.mComponentName;
    }

    public int getDrmType() {
        return this.mDrmType;
    }

    public long getGetKeyReqETimeMs() {
        return this.mGetKeyReqETimeMs;
    }

    public long getGetKeyReqSTimeMs() {
        return this.mGetKeyReqSTimeMs;
    }

    public long getGetProvisionReqETimeMs() {
        return this.mGetProvisionReqETimeMs;
    }

    public long getGetProvisionReqSTimeMs() {
        return this.mGetProvisionReqSTimeMs;
    }

    public long getLicenseETimeMs() {
        return this.mLicenseETimeMs;
    }

    public long getLicenseSTimeMs() {
        return this.mLicenseSTimeMs;
    }

    public long getOpenSessionETimeMs() {
        return this.mOpenSessionETimeMs;
    }

    public long getOpenSessionSTimeMs() {
        return this.mOpenSessionSTimeMs;
    }

    public long getPrepareETimeMs() {
        return this.mPrepareETimeMs;
    }

    public long getPrepareSTimeMs() {
        return this.mPrepareSTimeMs;
    }

    public long getProvideKeyRespETimeMs() {
        return this.mProvideKeyRespETimeMs;
    }

    public long getProvideKeyRespSTimeMs() {
        return this.mProvideKeyRespSTimeMs;
    }

    public long getProvideProvisionRespETimeMs() {
        return this.mProvideProvisionRespETimeMs;
    }

    public long getProvideProvisionRespSTimeMs() {
        return this.mProvideProvisionRespSTimeMs;
    }

    public long getRecvKeyRespTimeMs() {
        return this.mRecvKeyRespTimeMs;
    }

    public long getRecvProvisionRespTimeMs() {
        return this.mRecvProvisionRespTimeMs;
    }

    public int getSecureLevel() {
        return this.mSecureLevel;
    }

    public long getSendKeyReqTimeMs() {
        return this.mSendKeyReqTimeMs;
    }

    public long getSendProvisionReqTimeMs() {
        return this.mSendProvisionReqTimeMs;
    }

    public int getSupportSecureDecoder() {
        return this.mSupportSecureDecoder;
    }

    public int getSupportSecureDecrypt() {
        return this.mSupportSecureDecrypt;
    }

    public void setCertificateETimeMs(long j) {
        this.mCertificateETimeMs = j;
    }

    public void setCertificateSTimeMs(long j) {
        this.mCertificateSTimeMs = j;
    }

    public void setComponentName(String str) {
        this.mComponentName = str;
    }

    public void setDrmType(int i) {
        this.mDrmType = i;
    }

    public void setGetKeyReqETimeMs(long j) {
        this.mGetKeyReqETimeMs = j;
    }

    public void setGetKeyReqSTimeMs(long j) {
        this.mGetKeyReqSTimeMs = j;
    }

    public void setGetProvisionReqETimeMs(long j) {
        this.mGetProvisionReqETimeMs = j;
    }

    public void setGetProvisionReqSTimeMs(long j) {
        this.mGetProvisionReqSTimeMs = j;
    }

    public void setLicenseETimeMs(long j) {
        this.mLicenseETimeMs = j;
    }

    public void setLicenseSTimeMs(long j) {
        this.mLicenseSTimeMs = j;
    }

    public void setOpenSessionETimeMs(long j) {
        this.mOpenSessionETimeMs = j;
    }

    public void setOpenSessionSTimeMs(long j) {
        this.mOpenSessionSTimeMs = j;
    }

    public void setPrepareETimeMs(long j) {
        this.mPrepareETimeMs = j;
    }

    public void setPrepareSTimeMs(long j) {
        this.mPrepareSTimeMs = j;
    }

    public void setProvideKeyRespETimeMs(long j) {
        this.mProvideKeyRespETimeMs = j;
    }

    public void setProvideKeyRespSTimeMs(long j) {
        this.mProvideKeyRespSTimeMs = j;
    }

    public void setProvideProvisionRespETimeMs(long j) {
        this.mProvideProvisionRespETimeMs = j;
    }

    public void setProvideProvisionRespSTimeMs(long j) {
        this.mProvideProvisionRespSTimeMs = j;
    }

    public void setRecvKeyRespTimeMs(long j) {
        this.mRecvKeyRespTimeMs = j;
    }

    public void setRecvProvisionRespTimeMs(long j) {
        this.mRecvProvisionRespTimeMs = j;
    }

    public void setSecureLevel(int i) {
        this.mSecureLevel = i;
    }

    public void setSendKeyReqTimeMs(long j) {
        this.mSendKeyReqTimeMs = j;
    }

    public void setSendProvisionReqTimeMs(long j) {
        this.mSendProvisionReqTimeMs = j;
    }

    public void setSupportSecureDecoder(int i) {
        this.mSupportSecureDecoder = i;
    }

    public void setSupportSecureDecrypt(int i) {
        this.mSupportSecureDecrypt = i;
    }
}
