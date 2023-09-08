package com.tencent.thumbplayer.adapter;

import android.text.TextUtils;
import com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener;
import com.tencent.thumbplayer.api.TPAudioFrameBuffer;
import com.tencent.thumbplayer.api.TPCommonEnum;
import com.tencent.thumbplayer.api.TPDrmInfo;
import com.tencent.thumbplayer.api.TPPlayerDetailInfo;
import com.tencent.thumbplayer.api.TPPostProcessFrameBuffer;
import com.tencent.thumbplayer.api.TPRemoteSdpInfo;
import com.tencent.thumbplayer.api.TPSubtitleData;
import com.tencent.thumbplayer.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.api.TPVideoFrameBuffer;
import com.tencent.thumbplayer.utils.TPLogUtil;

public class TPPlayerBaseListeners implements ITPPlayerBaseListener.IOnPreparedListener, ITPPlayerBaseListener.IOnCompletionListener, ITPPlayerBaseListener.IOnInfoListener, ITPPlayerBaseListener.IOnErrorListener, ITPPlayerBaseListener.IOnSeekCompleteListener, ITPPlayerBaseListener.IOnVideoSizeChangedListener, ITPPlayerBaseListener.IOnSubtitleDataListener, ITPPlayerBaseListener.IOnSubtitleFrameOutListener, ITPPlayerBaseListener.IOnVideoFrameOutListener, ITPPlayerBaseListener.IOnAudioPcmOutListener, ITPPlayerBaseListener.IOnVideoProcessOutListener, ITPPlayerBaseListener.IOnAudioProcessOutListener, ITPPlayerBaseListener.IOnStateChangeListener, ITPPlayerBaseListener.IOnDetailInfoListener, ITPPlayerBaseListener.IOnEventRecordListener, ITPPlayerBaseListener.IOnDemuxerListener {
    private static final String TAG = "TPPlayerListenerS";
    private TPPlayerListenersEmptyImpl EMPTY_LISTENERS;
    private ITPPlayerBaseListener.IOnAudioPcmOutListener mOnAudioFrameOutListener;
    private ITPPlayerBaseListener.IOnAudioProcessOutListener mOnAudioProcessFrameOutListener;
    private ITPPlayerBaseListener.IOnCompletionListener mOnCompletionListener;
    private ITPPlayerBaseListener.IOnDemuxerListener mOnDemuxerListener;
    private ITPPlayerBaseListener.IOnDetailInfoListener mOnDetailInfoListener;
    private ITPPlayerBaseListener.IOnErrorListener mOnErrorListener;
    private ITPPlayerBaseListener.IOnEventRecordListener mOnEventRecordListener;
    private ITPPlayerBaseListener.IOnInfoListener mOnInfoListener;
    private ITPPlayerBaseListener.IOnPreparedListener mOnPreparedListener;
    private ITPPlayerBaseListener.IOnSeekCompleteListener mOnSeekCompleteListener;
    private ITPPlayerBaseListener.IOnStateChangeListener mOnStateChangeListener;
    private ITPPlayerBaseListener.IOnSubtitleDataListener mOnSubtitleDataListener;
    private ITPPlayerBaseListener.IOnSubtitleFrameOutListener mOnSubtitleFrameOutListener;
    private ITPPlayerBaseListener.IOnVideoFrameOutListener mOnVideoFrameOutListener;
    private ITPPlayerBaseListener.IOnVideoProcessOutListener mOnVideoProcessFrameOutListener;
    private ITPPlayerBaseListener.IOnVideoSizeChangedListener mOnVideoSizeChangedListener;
    private String mTag = TAG;

    public static class TPPlayerListenersEmptyImpl implements ITPPlayerBaseListener.IOnPreparedListener, ITPPlayerBaseListener.IOnCompletionListener, ITPPlayerBaseListener.IOnInfoListener, ITPPlayerBaseListener.IOnErrorListener, ITPPlayerBaseListener.IOnSeekCompleteListener, ITPPlayerBaseListener.IOnVideoSizeChangedListener, ITPPlayerBaseListener.IOnSubtitleDataListener, ITPPlayerBaseListener.IOnSubtitleFrameOutListener, ITPPlayerBaseListener.IOnVideoFrameOutListener, ITPPlayerBaseListener.IOnAudioPcmOutListener, ITPPlayerBaseListener.IOnVideoProcessOutListener, ITPPlayerBaseListener.IOnAudioProcessOutListener, ITPPlayerBaseListener.IOnStateChangeListener, ITPPlayerBaseListener.IOnDetailInfoListener, ITPPlayerBaseListener.IOnEventRecordListener, ITPPlayerBaseListener.IOnDemuxerListener {
        /* access modifiers changed from: private */
        public String mTag;

        public TPPlayerListenersEmptyImpl(String str) {
            this.mTag = str;
        }

        public void onAudioPcmOut(TPAudioFrameBuffer tPAudioFrameBuffer) {
            TPLogUtil.m21897i(this.mTag, " empty base listener , notify , onAudioFrameOut");
        }

        public TPPostProcessFrameBuffer onAudioProcessFrameOut(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            TPLogUtil.m21897i(this.mTag, " empty base listener , notify , onAudioProcessFrameOut");
            return null;
        }

        public void onCompletion() {
            TPLogUtil.m21897i(this.mTag, " empty base listener , notify , onCompletion");
        }

        public void onDetailInfo(TPPlayerDetailInfo tPPlayerDetailInfo) {
            TPLogUtil.m21897i(this.mTag, " empty base listener , notify , onDetailInfo");
        }

        public void onDrmInfo(TPDrmInfo tPDrmInfo) {
            TPLogUtil.m21897i(this.mTag, " empty base listener , notify , onEventRecord");
        }

        public void onError(int i, int i2, long j, long j2) {
            TPLogUtil.m21897i(this.mTag, " empty base listener , notify , onError");
        }

        public void onInfo(int i, long j, long j2, Object obj) {
            TPLogUtil.m21897i(this.mTag, " empty base listener , notify , onInfo");
        }

        public void onPrepared() {
            TPLogUtil.m21897i(this.mTag, " empty base listener , notify , onPrepared");
        }

        public TPRemoteSdpInfo onSdpExchange(String str, int i) {
            TPLogUtil.m21897i(this.mTag, " empty base listener , notify , onSdpExchange");
            return null;
        }

        public void onSeekComplete() {
            TPLogUtil.m21897i(this.mTag, " empty base listener , notify , onSeekComplete");
        }

        public void onStateChange(int i, int i2) {
            TPLogUtil.m21897i(this.mTag, " empty base listener , notify , onStateChange");
        }

        public void onSubtitleData(TPSubtitleData tPSubtitleData) {
            TPLogUtil.m21897i(this.mTag, " empty base listener , notify , onSubtitleData");
        }

        public void onSubtitleFrameOut(TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
            TPLogUtil.m21897i(this.mTag, " empty base listener , notify , TPSubtitleFrameBuffer");
        }

        public void onVideoFrameOut(TPVideoFrameBuffer tPVideoFrameBuffer) {
            TPLogUtil.m21897i(this.mTag, " empty base listener , notify , onVideoFrameOut");
        }

        public TPPostProcessFrameBuffer onVideoProcessFrameOut(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            TPLogUtil.m21897i(this.mTag, " empty base listener , notify , onVideoProcessFrameOut");
            return null;
        }

        public void onVideoSizeChanged(long j, long j2) {
            TPLogUtil.m21897i(this.mTag, " empty base listener , notify , onVideoSizeChanged");
        }
    }

    public TPPlayerBaseListeners(String str) {
        updateTag(str);
        TPPlayerListenersEmptyImpl tPPlayerListenersEmptyImpl = new TPPlayerListenersEmptyImpl(this.mTag);
        this.EMPTY_LISTENERS = tPPlayerListenersEmptyImpl;
        this.mOnPreparedListener = tPPlayerListenersEmptyImpl;
        this.mOnCompletionListener = tPPlayerListenersEmptyImpl;
        this.mOnInfoListener = tPPlayerListenersEmptyImpl;
        this.mOnErrorListener = tPPlayerListenersEmptyImpl;
        this.mOnSeekCompleteListener = tPPlayerListenersEmptyImpl;
        this.mOnVideoSizeChangedListener = tPPlayerListenersEmptyImpl;
        this.mOnSubtitleDataListener = tPPlayerListenersEmptyImpl;
        this.mOnVideoFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnAudioFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnSubtitleFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnVideoProcessFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnAudioProcessFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnStateChangeListener = tPPlayerListenersEmptyImpl;
        this.mOnDetailInfoListener = tPPlayerListenersEmptyImpl;
        this.mOnEventRecordListener = tPPlayerListenersEmptyImpl;
        this.mOnDemuxerListener = tPPlayerListenersEmptyImpl;
    }

    public void clear() {
        TPPlayerListenersEmptyImpl tPPlayerListenersEmptyImpl = this.EMPTY_LISTENERS;
        this.mOnPreparedListener = tPPlayerListenersEmptyImpl;
        this.mOnCompletionListener = tPPlayerListenersEmptyImpl;
        this.mOnInfoListener = tPPlayerListenersEmptyImpl;
        this.mOnErrorListener = tPPlayerListenersEmptyImpl;
        this.mOnSeekCompleteListener = tPPlayerListenersEmptyImpl;
        this.mOnVideoSizeChangedListener = tPPlayerListenersEmptyImpl;
        this.mOnSubtitleDataListener = tPPlayerListenersEmptyImpl;
        this.mOnVideoFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnAudioFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnSubtitleFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnStateChangeListener = tPPlayerListenersEmptyImpl;
        this.mOnVideoProcessFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnAudioProcessFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnDetailInfoListener = tPPlayerListenersEmptyImpl;
        this.mOnEventRecordListener = tPPlayerListenersEmptyImpl;
        this.mOnDemuxerListener = tPPlayerListenersEmptyImpl;
    }

    public void onAudioPcmOut(TPAudioFrameBuffer tPAudioFrameBuffer) {
        this.mOnAudioFrameOutListener.onAudioPcmOut(tPAudioFrameBuffer);
    }

    public TPPostProcessFrameBuffer onAudioProcessFrameOut(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        return this.mOnAudioProcessFrameOutListener.onAudioProcessFrameOut(tPPostProcessFrameBuffer);
    }

    public void onCompletion() {
        this.mOnCompletionListener.onCompletion();
    }

    public void onDetailInfo(TPPlayerDetailInfo tPPlayerDetailInfo) {
        this.mOnDetailInfoListener.onDetailInfo(tPPlayerDetailInfo);
    }

    public void onDrmInfo(TPDrmInfo tPDrmInfo) {
        this.mOnEventRecordListener.onDrmInfo(tPDrmInfo);
    }

    public void onError(@TPCommonEnum.TPErrorType int i, int i2, long j, long j2) {
        this.mOnErrorListener.onError(i, i2, j, j2);
    }

    public void onInfo(int i, long j, long j2, Object obj) {
        this.mOnInfoListener.onInfo(i, j, j2, obj);
    }

    public void onPrepared() {
        this.mOnPreparedListener.onPrepared();
    }

    public TPRemoteSdpInfo onSdpExchange(String str, int i) {
        return this.mOnDemuxerListener.onSdpExchange(str, i);
    }

    public void onSeekComplete() {
        this.mOnSeekCompleteListener.onSeekComplete();
    }

    public void onStateChange(int i, int i2) {
        this.mOnStateChangeListener.onStateChange(i, i2);
    }

    public void onSubtitleData(TPSubtitleData tPSubtitleData) {
        this.mOnSubtitleDataListener.onSubtitleData(tPSubtitleData);
    }

    public void onSubtitleFrameOut(TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
        this.mOnSubtitleFrameOutListener.onSubtitleFrameOut(tPSubtitleFrameBuffer);
    }

    public void onVideoFrameOut(TPVideoFrameBuffer tPVideoFrameBuffer) {
        this.mOnVideoFrameOutListener.onVideoFrameOut(tPVideoFrameBuffer);
    }

    public TPPostProcessFrameBuffer onVideoProcessFrameOut(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        return this.mOnVideoProcessFrameOutListener.onVideoProcessFrameOut(tPPostProcessFrameBuffer);
    }

    public void onVideoSizeChanged(long j, long j2) {
        this.mOnVideoSizeChangedListener.onVideoSizeChanged(j, j2);
    }

    public void setOnAudioPcmOutListener(ITPPlayerBaseListener.IOnAudioPcmOutListener iOnAudioPcmOutListener) {
        if (iOnAudioPcmOutListener == null) {
            iOnAudioPcmOutListener = this.EMPTY_LISTENERS;
        }
        this.mOnAudioFrameOutListener = iOnAudioPcmOutListener;
    }

    public void setOnAudioProcessFrameListener(ITPPlayerBaseListener.IOnAudioProcessOutListener iOnAudioProcessOutListener) {
        if (iOnAudioProcessOutListener == null) {
            iOnAudioProcessOutListener = this.EMPTY_LISTENERS;
        }
        this.mOnAudioProcessFrameOutListener = iOnAudioProcessOutListener;
    }

    public void setOnCompletionListener(ITPPlayerBaseListener.IOnCompletionListener iOnCompletionListener) {
        if (iOnCompletionListener == null) {
            iOnCompletionListener = this.EMPTY_LISTENERS;
        }
        this.mOnCompletionListener = iOnCompletionListener;
    }

    public void setOnDemuxerListener(ITPPlayerBaseListener.IOnDemuxerListener iOnDemuxerListener) {
        if (iOnDemuxerListener == null) {
            iOnDemuxerListener = this.EMPTY_LISTENERS;
        }
        this.mOnDemuxerListener = iOnDemuxerListener;
    }

    public void setOnDetailInfoListener(ITPPlayerBaseListener.IOnDetailInfoListener iOnDetailInfoListener) {
        if (iOnDetailInfoListener == null) {
            iOnDetailInfoListener = this.EMPTY_LISTENERS;
        }
        this.mOnDetailInfoListener = iOnDetailInfoListener;
    }

    public void setOnErrorListener(ITPPlayerBaseListener.IOnErrorListener iOnErrorListener) {
        if (iOnErrorListener == null) {
            iOnErrorListener = this.EMPTY_LISTENERS;
        }
        this.mOnErrorListener = iOnErrorListener;
    }

    public void setOnEventRecordListener(ITPPlayerBaseListener.IOnEventRecordListener iOnEventRecordListener) {
        if (iOnEventRecordListener == null) {
            iOnEventRecordListener = this.EMPTY_LISTENERS;
        }
        this.mOnEventRecordListener = iOnEventRecordListener;
    }

    public void setOnInfoListener(ITPPlayerBaseListener.IOnInfoListener iOnInfoListener) {
        if (iOnInfoListener == null) {
            iOnInfoListener = this.EMPTY_LISTENERS;
        }
        this.mOnInfoListener = iOnInfoListener;
    }

    public void setOnPreparedListener(ITPPlayerBaseListener.IOnPreparedListener iOnPreparedListener) {
        if (iOnPreparedListener == null) {
            iOnPreparedListener = this.EMPTY_LISTENERS;
        }
        this.mOnPreparedListener = iOnPreparedListener;
    }

    public void setOnSeekCompleteListener(ITPPlayerBaseListener.IOnSeekCompleteListener iOnSeekCompleteListener) {
        if (iOnSeekCompleteListener == null) {
            iOnSeekCompleteListener = this.EMPTY_LISTENERS;
        }
        this.mOnSeekCompleteListener = iOnSeekCompleteListener;
    }

    public void setOnStateChangeListener(ITPPlayerBaseListener.IOnStateChangeListener iOnStateChangeListener) {
        if (iOnStateChangeListener == null) {
            iOnStateChangeListener = this.EMPTY_LISTENERS;
        }
        this.mOnStateChangeListener = iOnStateChangeListener;
    }

    public void setOnSubtitleDataListener(ITPPlayerBaseListener.IOnSubtitleDataListener iOnSubtitleDataListener) {
        if (iOnSubtitleDataListener == null) {
            iOnSubtitleDataListener = this.EMPTY_LISTENERS;
        }
        this.mOnSubtitleDataListener = iOnSubtitleDataListener;
    }

    public void setOnSubtitleFrameOutListener(ITPPlayerBaseListener.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
        if (iOnSubtitleFrameOutListener == null) {
            iOnSubtitleFrameOutListener = this.EMPTY_LISTENERS;
        }
        this.mOnSubtitleFrameOutListener = iOnSubtitleFrameOutListener;
    }

    public void setOnVideoFrameOutListener(ITPPlayerBaseListener.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        if (iOnVideoFrameOutListener == null) {
            iOnVideoFrameOutListener = this.EMPTY_LISTENERS;
        }
        this.mOnVideoFrameOutListener = iOnVideoFrameOutListener;
    }

    public void setOnVideoProcessFrameListener(ITPPlayerBaseListener.IOnVideoProcessOutListener iOnVideoProcessOutListener) {
        if (iOnVideoProcessOutListener == null) {
            iOnVideoProcessOutListener = this.EMPTY_LISTENERS;
        }
        this.mOnVideoProcessFrameOutListener = iOnVideoProcessOutListener;
    }

    public void setOnVideoSizeChangedListener(ITPPlayerBaseListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
        if (iOnVideoSizeChangedListener == null) {
            iOnVideoSizeChangedListener = this.EMPTY_LISTENERS;
        }
        this.mOnVideoSizeChangedListener = iOnVideoSizeChangedListener;
    }

    public void updateTag(String str) {
        if (TextUtils.isEmpty(str)) {
            this.mTag = TAG;
        } else {
            this.mTag = str;
        }
        TPPlayerListenersEmptyImpl tPPlayerListenersEmptyImpl = this.EMPTY_LISTENERS;
        if (tPPlayerListenersEmptyImpl != null) {
            String unused = tPPlayerListenersEmptyImpl.mTag = this.mTag;
        }
    }
}
