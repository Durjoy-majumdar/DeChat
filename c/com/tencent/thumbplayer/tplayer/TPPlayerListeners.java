package com.tencent.thumbplayer.tplayer;

import android.text.TextUtils;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import com.tencent.thumbplayer.api.TPAudioFrameBuffer;
import com.tencent.thumbplayer.api.TPPlayerDetailInfo;
import com.tencent.thumbplayer.api.TPPostProcessFrameBuffer;
import com.tencent.thumbplayer.api.TPRemoteSdpInfo;
import com.tencent.thumbplayer.api.TPSubtitleData;
import com.tencent.thumbplayer.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.api.TPVideoFrameBuffer;
import com.tencent.thumbplayer.utils.TPLogUtil;

public class TPPlayerListeners implements ITPPlayerListener.IOnPreparedListener, ITPPlayerListener.IOnCompletionListener, ITPPlayerListener.IOnInfoListener, ITPPlayerListener.IOnErrorListener, ITPPlayerListener.IOnSeekCompleteListener, ITPPlayerListener.IOnVideoSizeChangedListener, ITPPlayerListener.IOnSubtitleDataListener, ITPPlayerListener.IOnSubtitleFrameOutListener, ITPPlayerListener.IOnVideoFrameOutListener, ITPPlayerListener.IOnAudioFrameOutputListener, ITPPlayerListener.IOnVideoProcessFrameOutputListener, ITPPlayerListener.IOnAudioProcessFrameOutputListener, ITPPlayerListener.IOnStateChangeListener, ITPPlayerListener.IOnStopAsyncCompleteListener, ITPPlayerListener.IOnDetailInfoListener, ITPPlayerListener.IOnDemuxerListener {
    private static final String TAG = "TPPlayerListenerS";
    private TPPlayerListenersEmptyImpl EMPTY_LISTENERS;
    private ITPPlayerListener.IOnAudioFrameOutputListener mOnAudioFrameOutListener;
    private ITPPlayerListener.IOnAudioProcessFrameOutputListener mOnAudioProcessFrameOutListener;
    private ITPPlayerListener.IOnCompletionListener mOnCompletionListener;
    private ITPPlayerListener.IOnDemuxerListener mOnDemuxerListener;
    private ITPPlayerListener.IOnDetailInfoListener mOnDetailInfoListener;
    private ITPPlayerListener.IOnErrorListener mOnErrorListener;
    private ITPPlayerListener.IOnInfoListener mOnInfoListener;
    private ITPPlayerListener.IOnStateChangeListener mOnPlayerStateChangeListener;
    private ITPPlayerListener.IOnPreparedListener mOnPreparedListener;
    private ITPPlayerListener.IOnSeekCompleteListener mOnSeekCompleteListener;
    private ITPPlayerListener.IOnStopAsyncCompleteListener mOnStopAsyncCompleteListener;
    private ITPPlayerListener.IOnSubtitleDataListener mOnSubtitleDataListener;
    private ITPPlayerListener.IOnSubtitleFrameOutListener mOnSubtitleFrameOutListener;
    private ITPPlayerListener.IOnVideoFrameOutListener mOnVideoFrameOutListener;
    private ITPPlayerListener.IOnVideoProcessFrameOutputListener mOnVideoProcessFrameOutListener;
    private ITPPlayerListener.IOnVideoSizeChangedListener mOnVideoSizeChangedListener;
    private String mTag = TAG;

    public static class TPPlayerListenersEmptyImpl implements ITPPlayerListener.IOnPreparedListener, ITPPlayerListener.IOnCompletionListener, ITPPlayerListener.IOnInfoListener, ITPPlayerListener.IOnErrorListener, ITPPlayerListener.IOnSeekCompleteListener, ITPPlayerListener.IOnVideoSizeChangedListener, ITPPlayerListener.IOnSubtitleDataListener, ITPPlayerListener.IOnSubtitleFrameOutListener, ITPPlayerListener.IOnVideoFrameOutListener, ITPPlayerListener.IOnAudioFrameOutputListener, ITPPlayerListener.IOnVideoProcessFrameOutputListener, ITPPlayerListener.IOnAudioProcessFrameOutputListener, ITPPlayerListener.IOnStateChangeListener, ITPPlayerListener.IOnStopAsyncCompleteListener, ITPPlayerListener.IOnDetailInfoListener, ITPPlayerListener.IOnDemuxerListener {
        /* access modifiers changed from: private */
        public String mTag;

        public TPPlayerListenersEmptyImpl(String str) {
            this.mTag = str;
        }

        public void onAudioFrameOut(ITPPlayer iTPPlayer, TPAudioFrameBuffer tPAudioFrameBuffer) {
            TPLogUtil.m21897i(this.mTag, " empty player listener , notify , onAudioFrameOut");
        }

        public TPPostProcessFrameBuffer onAudioProcessFrameOut(ITPPlayer iTPPlayer, TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            TPLogUtil.m21897i(this.mTag, " empty player listener , notify , onPostProcessFrameOut");
            return null;
        }

        public void onCompletion(ITPPlayer iTPPlayer) {
            TPLogUtil.m21897i(this.mTag, " empty player listener , notify , onCompletion");
        }

        public void onDetailInfo(ITPPlayer iTPPlayer, TPPlayerDetailInfo tPPlayerDetailInfo) {
            TPLogUtil.m21897i(this.mTag, " empty player listener , notify , onDetailInfo");
        }

        public void onError(ITPPlayer iTPPlayer, int i, int i2, long j, long j2) {
            TPLogUtil.m21897i(this.mTag, " empty player listener , notify , onError");
        }

        public void onInfo(ITPPlayer iTPPlayer, int i, long j, long j2, Object obj) {
            TPLogUtil.m21897i(this.mTag, " empty player listener , notify , onInfo");
        }

        public void onPrepared(ITPPlayer iTPPlayer) {
            TPLogUtil.m21897i(this.mTag, " empty player listener , notify , onPrepared");
        }

        public TPRemoteSdpInfo onSdpExchange(ITPPlayer iTPPlayer, String str, int i) {
            TPLogUtil.m21897i(this.mTag, " empty player listener , notify , onSdpExchange");
            return null;
        }

        public void onSeekComplete(ITPPlayer iTPPlayer) {
            TPLogUtil.m21897i(this.mTag, " empty player listener , notify , onSeekComplete");
        }

        public void onStateChange(int i, int i2) {
            TPLogUtil.m21897i(this.mTag, " empty player listener , notify , onStateChange");
        }

        public void onStopAsyncComplete(ITPPlayer iTPPlayer) {
            TPLogUtil.m21897i(this.mTag, " empty player listener , notify , onStopAsyncComplete");
        }

        public void onSubtitleData(ITPPlayer iTPPlayer, TPSubtitleData tPSubtitleData) {
            TPLogUtil.m21897i(this.mTag, " empty player listener , notify , onSubtitleData");
        }

        public void onSubtitleFrameOut(ITPPlayer iTPPlayer, TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
            TPLogUtil.m21897i(this.mTag, " empty player listener , notify , onSubtitleFrameOut");
        }

        public void onVideoFrameOut(ITPPlayer iTPPlayer, TPVideoFrameBuffer tPVideoFrameBuffer) {
            TPLogUtil.m21897i(this.mTag, " empty player listener , notify , onVideoFrameOut");
        }

        public TPPostProcessFrameBuffer onVideoProcessFrameOut(ITPPlayer iTPPlayer, TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            TPLogUtil.m21897i(this.mTag, " empty player listener , notify , onPostProcessFrameOut");
            return null;
        }

        public void onVideoSizeChanged(ITPPlayer iTPPlayer, long j, long j2) {
            TPLogUtil.m21897i(this.mTag, " empty player listener , notify , onVideoSizeChanged");
        }
    }

    public TPPlayerListeners(String str) {
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
        this.mOnSubtitleFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnVideoFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnAudioFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnVideoProcessFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnAudioProcessFrameOutListener = tPPlayerListenersEmptyImpl;
        this.mOnPlayerStateChangeListener = tPPlayerListenersEmptyImpl;
        this.mOnStopAsyncCompleteListener = tPPlayerListenersEmptyImpl;
        this.mOnDetailInfoListener = tPPlayerListenersEmptyImpl;
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
        this.mOnPlayerStateChangeListener = tPPlayerListenersEmptyImpl;
        this.mOnStopAsyncCompleteListener = tPPlayerListenersEmptyImpl;
        this.mOnDetailInfoListener = tPPlayerListenersEmptyImpl;
        this.mOnDemuxerListener = tPPlayerListenersEmptyImpl;
    }

    public void onAudioFrameOut(ITPPlayer iTPPlayer, TPAudioFrameBuffer tPAudioFrameBuffer) {
        this.mOnAudioFrameOutListener.onAudioFrameOut(iTPPlayer, tPAudioFrameBuffer);
    }

    public TPPostProcessFrameBuffer onAudioProcessFrameOut(ITPPlayer iTPPlayer, TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        return this.mOnAudioProcessFrameOutListener.onAudioProcessFrameOut(iTPPlayer, tPPostProcessFrameBuffer);
    }

    public void onCompletion(ITPPlayer iTPPlayer) {
        this.mOnCompletionListener.onCompletion(iTPPlayer);
    }

    public void onDetailInfo(ITPPlayer iTPPlayer, TPPlayerDetailInfo tPPlayerDetailInfo) {
        this.mOnDetailInfoListener.onDetailInfo(iTPPlayer, tPPlayerDetailInfo);
    }

    public void onError(ITPPlayer iTPPlayer, int i, int i2, long j, long j2) {
        this.mOnErrorListener.onError(iTPPlayer, i, i2, j, j2);
    }

    public void onInfo(ITPPlayer iTPPlayer, int i, long j, long j2, Object obj) {
        this.mOnInfoListener.onInfo(iTPPlayer, i, j, j2, obj);
    }

    public void onPrepared(ITPPlayer iTPPlayer) {
        this.mOnPreparedListener.onPrepared(iTPPlayer);
    }

    public TPRemoteSdpInfo onSdpExchange(ITPPlayer iTPPlayer, String str, int i) {
        return this.mOnDemuxerListener.onSdpExchange(iTPPlayer, str, i);
    }

    public void onSeekComplete(ITPPlayer iTPPlayer) {
        this.mOnSeekCompleteListener.onSeekComplete(iTPPlayer);
    }

    public void onStateChange(int i, int i2) {
        this.mOnPlayerStateChangeListener.onStateChange(i, i2);
    }

    public void onStopAsyncComplete(ITPPlayer iTPPlayer) {
        this.mOnStopAsyncCompleteListener.onStopAsyncComplete(iTPPlayer);
    }

    public void onSubtitleData(ITPPlayer iTPPlayer, TPSubtitleData tPSubtitleData) {
        this.mOnSubtitleDataListener.onSubtitleData(iTPPlayer, tPSubtitleData);
    }

    public void onSubtitleFrameOut(ITPPlayer iTPPlayer, TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
        this.mOnSubtitleFrameOutListener.onSubtitleFrameOut(iTPPlayer, tPSubtitleFrameBuffer);
    }

    public void onVideoFrameOut(ITPPlayer iTPPlayer, TPVideoFrameBuffer tPVideoFrameBuffer) {
        this.mOnVideoFrameOutListener.onVideoFrameOut(iTPPlayer, tPVideoFrameBuffer);
    }

    public TPPostProcessFrameBuffer onVideoProcessFrameOut(ITPPlayer iTPPlayer, TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        return this.mOnVideoProcessFrameOutListener.onVideoProcessFrameOut(iTPPlayer, tPPostProcessFrameBuffer);
    }

    public void onVideoSizeChanged(ITPPlayer iTPPlayer, long j, long j2) {
        this.mOnVideoSizeChangedListener.onVideoSizeChanged(iTPPlayer, j, j2);
    }

    public void setOnAudioPcmOutputListener(ITPPlayerListener.IOnAudioFrameOutputListener iOnAudioFrameOutputListener) {
        if (iOnAudioFrameOutputListener == null) {
            iOnAudioFrameOutputListener = this.EMPTY_LISTENERS;
        }
        this.mOnAudioFrameOutListener = iOnAudioFrameOutputListener;
    }

    public void setOnAudioProcessOutputListener(ITPPlayerListener.IOnAudioProcessFrameOutputListener iOnAudioProcessFrameOutputListener) {
        if (iOnAudioProcessFrameOutputListener == null) {
            iOnAudioProcessFrameOutputListener = this.EMPTY_LISTENERS;
        }
        this.mOnAudioProcessFrameOutListener = iOnAudioProcessFrameOutputListener;
    }

    public void setOnCompletionListener(ITPPlayerListener.IOnCompletionListener iOnCompletionListener) {
        if (iOnCompletionListener == null) {
            iOnCompletionListener = this.EMPTY_LISTENERS;
        }
        this.mOnCompletionListener = iOnCompletionListener;
    }

    public void setOnDemuxerListener(ITPPlayerListener.IOnDemuxerListener iOnDemuxerListener) {
        if (iOnDemuxerListener == null) {
            iOnDemuxerListener = this.EMPTY_LISTENERS;
        }
        this.mOnDemuxerListener = iOnDemuxerListener;
    }

    public void setOnDetailInfoListener(ITPPlayerListener.IOnDetailInfoListener iOnDetailInfoListener) {
        if (iOnDetailInfoListener == null) {
            iOnDetailInfoListener = this.EMPTY_LISTENERS;
        }
        this.mOnDetailInfoListener = iOnDetailInfoListener;
    }

    public void setOnErrorListener(ITPPlayerListener.IOnErrorListener iOnErrorListener) {
        if (iOnErrorListener == null) {
            iOnErrorListener = this.EMPTY_LISTENERS;
        }
        this.mOnErrorListener = iOnErrorListener;
    }

    public void setOnInfoListener(ITPPlayerListener.IOnInfoListener iOnInfoListener) {
        if (iOnInfoListener == null) {
            iOnInfoListener = this.EMPTY_LISTENERS;
        }
        this.mOnInfoListener = iOnInfoListener;
    }

    public void setOnPlayerStateChangeListener(ITPPlayerListener.IOnStateChangeListener iOnStateChangeListener) {
        if (iOnStateChangeListener == null) {
            iOnStateChangeListener = this.EMPTY_LISTENERS;
        }
        this.mOnPlayerStateChangeListener = iOnStateChangeListener;
    }

    public void setOnPreparedListener(ITPPlayerListener.IOnPreparedListener iOnPreparedListener) {
        if (iOnPreparedListener == null) {
            iOnPreparedListener = this.EMPTY_LISTENERS;
        }
        this.mOnPreparedListener = iOnPreparedListener;
    }

    public void setOnSeekCompleteListener(ITPPlayerListener.IOnSeekCompleteListener iOnSeekCompleteListener) {
        if (iOnSeekCompleteListener == null) {
            iOnSeekCompleteListener = this.EMPTY_LISTENERS;
        }
        this.mOnSeekCompleteListener = iOnSeekCompleteListener;
    }

    public void setOnStopAsyncCompleteListener(ITPPlayerListener.IOnStopAsyncCompleteListener iOnStopAsyncCompleteListener) {
        if (iOnStopAsyncCompleteListener == null) {
            iOnStopAsyncCompleteListener = this.EMPTY_LISTENERS;
        }
        this.mOnStopAsyncCompleteListener = iOnStopAsyncCompleteListener;
    }

    public void setOnSubtitleDataListener(ITPPlayerListener.IOnSubtitleDataListener iOnSubtitleDataListener) {
        if (iOnSubtitleDataListener == null) {
            iOnSubtitleDataListener = this.EMPTY_LISTENERS;
        }
        this.mOnSubtitleDataListener = iOnSubtitleDataListener;
    }

    public void setOnSubtitleFrameOutListener(ITPPlayerListener.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
        if (iOnSubtitleFrameOutListener == null) {
            iOnSubtitleFrameOutListener = this.EMPTY_LISTENERS;
        }
        this.mOnSubtitleFrameOutListener = iOnSubtitleFrameOutListener;
    }

    public void setOnVideoFrameOutListener(ITPPlayerListener.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        if (iOnVideoFrameOutListener == null) {
            iOnVideoFrameOutListener = this.EMPTY_LISTENERS;
        }
        this.mOnVideoFrameOutListener = iOnVideoFrameOutListener;
    }

    public void setOnVideoProcessOutputListener(ITPPlayerListener.IOnVideoProcessFrameOutputListener iOnVideoProcessFrameOutputListener) {
        if (iOnVideoProcessFrameOutputListener == null) {
            iOnVideoProcessFrameOutputListener = this.EMPTY_LISTENERS;
        }
        this.mOnVideoProcessFrameOutListener = iOnVideoProcessFrameOutputListener;
    }

    public void setOnVideoSizeChangedListener(ITPPlayerListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
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
            String unused = tPPlayerListenersEmptyImpl.mTag = str;
        }
    }
}
