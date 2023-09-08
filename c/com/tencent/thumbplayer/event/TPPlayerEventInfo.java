package com.tencent.thumbplayer.event;

import android.os.SystemClock;
import com.tencent.thumbplayer.api.TPDrmInfo;
import com.tencent.thumbplayer.api.TPTrackInfo;
import com.tencent.thumbplayer.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams;

public class TPPlayerEventInfo {

    public static class BaseEventInfo {
        private int mEventId = -1;
        private long mEventTimeSince1970Ms = System.currentTimeMillis();
        private long mEventTimeSinceBootMs = SystemClock.elapsedRealtime();

        public int getEventId() {
            return this.mEventId;
        }

        public long getEventTimeSince1970Ms() {
            return this.mEventTimeSince1970Ms;
        }

        public long getEventTimeSinceBootMs() {
            return this.mEventTimeSinceBootMs;
        }

        public void setEventId(int i) {
            this.mEventId = i;
        }
    }

    public static class BufferingEndEventInfo extends BaseEventInfo {
        public BufferingEndEventInfo() {
            setEventId(112);
        }
    }

    public static class BufferingStartEventInfo extends BaseEventInfo {
        public BufferingStartEventInfo() {
            setEventId(111);
        }
    }

    public static class DTCdnUrlUpdataEventInfo extends BaseEventInfo {
        private String mCdnIp;
        private String mUserIp;

        public DTCdnUrlUpdataEventInfo() {
            setEventId(202);
        }

        public String getCdnIp() {
            return this.mCdnIp;
        }

        public String getUserIp() {
            return this.mUserIp;
        }

        public void setCdnIp(String str) {
            this.mCdnIp = str;
        }

        public void setUserIp(String str) {
            this.mUserIp = str;
        }
    }

    public static class DTDownloadProgressUpdataEventInfo extends BaseEventInfo {
        private int mDownloadSpeedKbps;

        public DTDownloadProgressUpdataEventInfo() {
            setEventId(201);
        }

        public int getDownloadSpeedKbps() {
            return this.mDownloadSpeedKbps;
        }

        public void setDownloadSpeedKbps(int i) {
            this.mDownloadSpeedKbps = i;
        }
    }

    public static class DTProtocalUpdateEventInfo extends BaseEventInfo {
        private String mProtocol;
        private String mProtocolVer;

        public DTProtocalUpdateEventInfo() {
            setEventId(203);
        }

        public String getProtocol() {
            return this.mProtocol;
        }

        public String getProtocolVer() {
            return this.mProtocolVer;
        }

        public void setProtocol(String str) {
            this.mProtocol = str;
        }

        public void setProtocolVer(String str) {
            this.mProtocolVer = str;
        }
    }

    public static class DTReturnConvertedUrlEventInfo extends BaseEventInfo {
        public DTReturnConvertedUrlEventInfo() {
            setEventId(204);
        }
    }

    public static class DrmEventInfo extends BaseEventInfo {
        private TPDrmInfo mDrmInfo;

        public DrmEventInfo() {
            setEventId(116);
        }

        public TPDrmInfo getDrmInfo() {
            return this.mDrmInfo;
        }

        public void setDrmInfo(TPDrmInfo tPDrmInfo) {
            this.mDrmInfo = tPDrmInfo;
        }
    }

    public static class PlayErrorEventInfo extends BaseEventInfo {
        private TPDynamicStatisticParams mDynamicStatisticParams;
        private int mErrorCode;
        private int mErrorType;
        private TPGeneralPlayFlowParams mGeneralPlayFlowParams;

        public PlayErrorEventInfo() {
            setEventId(106);
        }

        public TPDynamicStatisticParams getDynamicStatisticParams() {
            return this.mDynamicStatisticParams;
        }

        public int getErrorCode() {
            return this.mErrorCode;
        }

        public int getErrorType() {
            return this.mErrorType;
        }

        public TPGeneralPlayFlowParams getGeneralPlayFlowParams() {
            return this.mGeneralPlayFlowParams;
        }

        public void setDynamicStatisticParams(TPDynamicStatisticParams tPDynamicStatisticParams) {
            this.mDynamicStatisticParams = tPDynamicStatisticParams;
        }

        public void setErrorCode(int i) {
            this.mErrorCode = i;
        }

        public void setErrorType(int i) {
            this.mErrorType = i;
        }

        public void setGeneralPlayFlowParams(TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
            this.mGeneralPlayFlowParams = tPGeneralPlayFlowParams;
        }
    }

    public static class PlayPauseEventInfo extends BaseEventInfo {
        public PlayPauseEventInfo() {
            setEventId(104);
        }
    }

    public static class PlayReleaseEventInfo extends BaseEventInfo {
        public PlayReleaseEventInfo() {
            setEventId(108);
        }
    }

    public static class PlayResetEventInfo extends BaseEventInfo {
        private TPDynamicStatisticParams mDynamicStatisticParams;
        private TPGeneralPlayFlowParams mGeneralPlayFlowParams;

        public PlayResetEventInfo() {
            setEventId(107);
        }

        public TPDynamicStatisticParams getDynamicStatisticParams() {
            return this.mDynamicStatisticParams;
        }

        public TPGeneralPlayFlowParams getGeneralPlayFlowParams() {
            return this.mGeneralPlayFlowParams;
        }

        public void setDynamicStatisticParams(TPDynamicStatisticParams tPDynamicStatisticParams) {
            this.mDynamicStatisticParams = tPDynamicStatisticParams;
        }

        public void setGeneralPlayFlowParams(TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
            this.mGeneralPlayFlowParams = tPGeneralPlayFlowParams;
        }
    }

    public static class PlayStartEventInfo extends BaseEventInfo {
        public PlayStartEventInfo() {
            setEventId(103);
        }
    }

    public static class PlayStopEventInfo extends BaseEventInfo {
        private TPDynamicStatisticParams mDynamicStatisticParams;
        private TPGeneralPlayFlowParams mGeneralPlayFlowParams;

        public PlayStopEventInfo() {
            setEventId(105);
        }

        public TPDynamicStatisticParams getDynamicStatisticParams() {
            return this.mDynamicStatisticParams;
        }

        public TPGeneralPlayFlowParams getGeneralPlayFlowParams() {
            return this.mGeneralPlayFlowParams;
        }

        public void setDynamicStatisticParams(TPDynamicStatisticParams tPDynamicStatisticParams) {
            this.mDynamicStatisticParams = tPDynamicStatisticParams;
        }

        public void setGeneralPlayFlowParams(TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
            this.mGeneralPlayFlowParams = tPGeneralPlayFlowParams;
        }
    }

    public static class PrepareEndEventInfo extends BaseEventInfo {
        private long mDurationMs;
        private int mPlayerType;

        public PrepareEndEventInfo() {
            setEventId(102);
        }

        public long getDurationMs() {
            return this.mDurationMs;
        }

        public int getPlayerType() {
            return this.mPlayerType;
        }

        public void setDurationMs(long j) {
            this.mDurationMs = j;
        }

        public void setPlayerType(int i) {
            this.mPlayerType = i;
        }
    }

    public static class PrepareStartEventInfo extends BaseEventInfo {
        private String mFlowId = "";

        public PrepareStartEventInfo() {
            setEventId(101);
        }

        public String getFlowId() {
            return this.mFlowId;
        }

        public void setFlowId(String str) {
            this.mFlowId = str;
        }
    }

    public static class SeekEndEventInfo extends BaseEventInfo {
        public SeekEndEventInfo() {
            setEventId(110);
        }
    }

    public static class SeekStartEventInfo extends BaseEventInfo {
        public SeekStartEventInfo() {
            setEventId(109);
        }
    }

    public static class SelectTrackEndEventInfo extends BaseEventInfo {
        private int mErrorCode;
        private long mOpaque;

        public SelectTrackEndEventInfo() {
            setEventId(115);
        }

        public int getErrorCode() {
            return this.mErrorCode;
        }

        public long getOpaque() {
            return this.mOpaque;
        }

        public void setErrorCode(int i) {
            this.mErrorCode = i;
        }

        public void setOpaque(long j) {
            this.mOpaque = j;
        }
    }

    public static class SelectTrackStartEventInfo extends BaseEventInfo {
        private long mOpaque;
        private int mTrackIndex;
        private TPTrackInfo mTrackInfo;

        public SelectTrackStartEventInfo() {
            setEventId(114);
        }

        public long getOpaque() {
            return this.mOpaque;
        }

        public int getTrackIndex() {
            return this.mTrackIndex;
        }

        public TPTrackInfo getTrackInfo() {
            return this.mTrackInfo;
        }

        public void setOpaque(long j) {
            this.mOpaque = j;
        }

        public void setTrackIndex(int i) {
            this.mTrackIndex = i;
        }

        public void setTrackInfo(TPTrackInfo tPTrackInfo) {
            this.mTrackInfo = tPTrackInfo;
        }
    }

    public static class SetDataSourceEventInfo extends BaseEventInfo {
        private boolean mIsUseProxy;
        private String mUrl;
        private int mUrlProtocol;

        public SetDataSourceEventInfo() {
            setEventId(117);
        }

        public String getUrl() {
            return this.mUrl;
        }

        public int getUrlProtocol() {
            return this.mUrlProtocol;
        }

        public boolean isIsUseProxy() {
            return this.mIsUseProxy;
        }

        public void setIsUseProxy(boolean z) {
            this.mIsUseProxy = z;
        }

        public void setUrl(String str) {
            this.mUrl = str;
        }

        public void setUrlProtocol(int i) {
            this.mUrlProtocol = i;
        }
    }

    public static class SetPlaySpeedEventInfo extends BaseEventInfo {
        private float mPlaySpeedRatio;

        public SetPlaySpeedEventInfo() {
            setEventId(113);
        }

        public float getPlaySpeedRatio() {
            return this.mPlaySpeedRatio;
        }

        public void setPlaySpeedRatio(float f) {
            this.mPlaySpeedRatio = f;
        }
    }

    private TPPlayerEventInfo() {
    }
}
