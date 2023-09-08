package com.tencent.thumbplayer.core.player;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class TPGeneralPlayFlowParams {
    public static final int TP_DRM_TYPE_CHACHA20 = 8;
    public static final int TP_DRM_TYPE_CHINA_DRM = 64;
    public static final int TP_DRM_TYPE_FAIRPLAY = 16;
    public static final int TP_DRM_TYPE_NONE = -1;
    public static final int TP_DRM_TYPE_TAIHE = 4;
    public static final int TP_DRM_TYPE_WIDEVINE = 32;
    public TPPlayerBaseMediaParams mPlayerBaseMediaParams = new TPPlayerBaseMediaParams();
    public TPPlayerConfigParams mPlayerConfigParams = new TPPlayerConfigParams();
    public TPPlayerDrmParams mPlayerDrmParams = new TPPlayerDrmParams();
    public TPPlayerGeneralTrackingParams mPlayerGeneralTrackingParams = new TPPlayerGeneralTrackingParams();

    public static class TPPlayerBaseMediaParams {
        public int mAudioDecoderType = -1;
        public int mAudioEncodeFormat = -1;
        public int mAudioRenderType = -1;
        public int mDemuxerType = -1;
        public long mDurationMs = -1;
        public String mFormatContainer = "";
        public int mHlsSourceType = -1;
        public int mSubtitleEncodeFormat = -1;
        public int mVideoDecoderType = -1;
        public int mVideoEncodeFormat = -1;
        public float mVideoFrameRate = -1.0f;
        public int mVideoHeight = -1;
        public int mVideoRenderType = -1;
        public long mVideoStreamBitrateKbps = -1;
        public int mVideoWidth = -1;
    }

    public static class TPPlayerConfigParams {
        public long mBufferMaxTotalDurationMs = -1;
        public long mBufferMinTotalDurationMs = -1;
        public int mBufferType = -1;
        public long mMaxBufferingTimeMs = -1;
        public long mMinBufferingDurationMs = -1;
        public long mMinBufferingTimeMs = -1;
        public long mPreloadTotalDurationMs = -1;
        public int mReduceLatencyAction = -1;
        public float mReduceLatencyPlaySpeed = -1.0f;
    }

    public static class TPPlayerDrmParams {
        public String mComponentName = "";
        @TPDrmType
        public int mDrmType = -1;
        public long mGetKeyReqETimeMs = 0;
        public long mGetKeyReqSTimeMs = 0;
        public long mGetProvisionReqETimeMs = 0;
        public long mGetProvisionReqSTimeMs = 0;
        public long mOpenSessionETimeMs = 0;
        public long mOpenSessionSTimeMs = 0;
        public long mPrepareETimeMs = 0;
        public long mPrepareSTimeMs = 0;
        public long mProvideKeyRespETimeMs = 0;
        public long mProvideKeyRespSTimeMs = 0;
        public long mProvideProvisionRespETimeMs = 0;
        public long mProvideProvisionRespSTimeMs = 0;
        public long mRecvKeyRespTimeMs = 0;
        public long mRecvProvisionRespTimeMs = 0;
        public int mSecureLevel = -1;
        public long mSendKeyReqTimeMs = 0;
        public long mSendProvisionReqTimeMs = 0;
        public int mSupportSecureDecoder = -1;
        public int mSupportSecureDecrypt = -1;
    }

    public static class TPPlayerGeneralTrackingParams {
        public long mAudioDecoderOpenedTimeMs = 0;
        public long mCoreApiPrepareTimeMs = 0;
        public long mCoreSchedulingThreadOnPreparedTimeMs = 0;
        public long mCoreSchedulingThreadPrepareTimeMs = 0;
        public long mDemuxerOpenFileETimems = 0;
        public long mDemuxerOpenFileSTimeMs = 0;
        public long mDemuxerThreadOnPreparedTimeMs = 0;
        public long mDemuxerThreadPrepareTimeMs = 0;
        public long mFirstAudioFrameRenderETimeMs = 0;
        public long mFirstAudioPacketReadETimeMs = 0;
        public long mFirstVideoFrameRenderETimeMs = 0;
        public long mFirstVideoPacketReadETimeMs = 0;
        public long mInitFirstClipPositionETimeMs = 0;
        public long mVideoDecoderOpenedTimeMs = 0;
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface TPDrmType {
    }
}
