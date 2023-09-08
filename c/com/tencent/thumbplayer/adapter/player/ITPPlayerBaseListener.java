package com.tencent.thumbplayer.adapter.player;

import com.tencent.thumbplayer.api.TPAudioFrameBuffer;
import com.tencent.thumbplayer.api.TPCommonEnum;
import com.tencent.thumbplayer.api.TPDrmInfo;
import com.tencent.thumbplayer.api.TPPlayerDetailInfo;
import com.tencent.thumbplayer.api.TPPostProcessFrameBuffer;
import com.tencent.thumbplayer.api.TPRemoteSdpInfo;
import com.tencent.thumbplayer.api.TPSubtitleData;
import com.tencent.thumbplayer.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.api.TPVideoFrameBuffer;

public class ITPPlayerBaseListener {

    public interface IOnAudioPcmOutListener {
        void onAudioPcmOut(TPAudioFrameBuffer tPAudioFrameBuffer);
    }

    public interface IOnAudioProcessOutListener {
        TPPostProcessFrameBuffer onAudioProcessFrameOut(TPPostProcessFrameBuffer tPPostProcessFrameBuffer);
    }

    public interface IOnCompletionListener {
        void onCompletion();
    }

    public interface IOnDemuxerListener {
        TPRemoteSdpInfo onSdpExchange(String str, int i);
    }

    public interface IOnDetailInfoListener {
        void onDetailInfo(TPPlayerDetailInfo tPPlayerDetailInfo);
    }

    public interface IOnErrorListener {
        void onError(@TPCommonEnum.TPErrorType int i, int i2, long j, long j2);
    }

    public interface IOnEventRecordListener {
        void onDrmInfo(TPDrmInfo tPDrmInfo);
    }

    public interface IOnInfoListener {
        void onInfo(int i, long j, long j2, Object obj);
    }

    public interface IOnPreparedListener {
        void onPrepared();
    }

    public interface IOnSeekCompleteListener {
        void onSeekComplete();
    }

    public interface IOnStateChangeListener {
        void onStateChange(int i, int i2);
    }

    public interface IOnSubtitleDataListener {
        void onSubtitleData(TPSubtitleData tPSubtitleData);
    }

    public interface IOnSubtitleFrameOutListener {
        void onSubtitleFrameOut(TPSubtitleFrameBuffer tPSubtitleFrameBuffer);
    }

    public interface IOnVideoFrameOutListener {
        void onVideoFrameOut(TPVideoFrameBuffer tPVideoFrameBuffer);
    }

    public interface IOnVideoProcessOutListener {
        TPPostProcessFrameBuffer onVideoProcessFrameOut(TPPostProcessFrameBuffer tPPostProcessFrameBuffer);
    }

    public interface IOnVideoSizeChangedListener {
        void onVideoSizeChanged(long j, long j2);
    }
}
