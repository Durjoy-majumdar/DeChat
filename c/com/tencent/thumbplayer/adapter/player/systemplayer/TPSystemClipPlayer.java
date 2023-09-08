package com.tencent.thumbplayer.adapter.player.systemplayer;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.thumbplayer.adapter.TPPlaybackInfo;
import com.tencent.thumbplayer.adapter.TPPlaybackParams;
import com.tencent.thumbplayer.adapter.TPPlayerBaseListeners;
import com.tencent.thumbplayer.adapter.TPPlayerStateStrategy;
import com.tencent.thumbplayer.adapter.player.ITPPlayerBase;
import com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener;
import com.tencent.thumbplayer.api.TPAudioFrameBuffer;
import com.tencent.thumbplayer.api.TPCaptureCallBack;
import com.tencent.thumbplayer.api.TPCaptureParams;
import com.tencent.thumbplayer.api.TPCommonEnum;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.thumbplayer.api.TPPlayerState;
import com.tencent.thumbplayer.api.TPPostProcessFrameBuffer;
import com.tencent.thumbplayer.api.TPProgramInfo;
import com.tencent.thumbplayer.api.TPSubtitleData;
import com.tencent.thumbplayer.api.TPTrackInfo;
import com.tencent.thumbplayer.api.TPVideoFrameBuffer;
import com.tencent.thumbplayer.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.api.composition.ITPMediaTrack;
import com.tencent.thumbplayer.api.composition.ITPMediaTrackClip;
import com.tencent.thumbplayer.composition.TPMediaComposition;
import com.tencent.thumbplayer.composition.TPMediaCompositionTrack;
import com.tencent.thumbplayer.composition.TPMediaCompositionTrackClip;
import com.tencent.thumbplayer.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.log.TPBaseLogger;
import com.tencent.thumbplayer.log.TPLoggerContext;
import com.tencent.thumbplayer.utils.TPCommonUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TPSystemClipPlayer implements ITPPlayerBase {
    private static final String TAG = "TPSystemClipPlayer";
    private boolean isPlayingClip;
    private boolean isSwitchingDef;
    private List<ITPMediaTrackClip> mClipList;
    private Context mContext;
    private int mCurrentClip = 0;
    private TPBaseLogger mLogger;
    private ITPPlayerBase mPlayerBase;
    private TPPlayerBaseCallback mPlayerCallback;
    private TPPlaybackParams mPlayerInitParams;
    private TPPlayerBaseListeners mPlayerListeners;
    private TPPlayerState mPlayerState;
    private TPPlayerStateStrategy mStateChecker;
    private LinkedList<Long> mSwitchingDefTagQueue;
    private TPLoggerContext mTPLoggerContext;
    private TPPlaybackInfo mTPPlaybackInfo;

    public class TPPlayerBaseCallback implements ITPPlayerBaseListener.IOnPreparedListener, ITPPlayerBaseListener.IOnCompletionListener, ITPPlayerBaseListener.IOnInfoListener, ITPPlayerBaseListener.IOnErrorListener, ITPPlayerBaseListener.IOnSeekCompleteListener, ITPPlayerBaseListener.IOnVideoSizeChangedListener, ITPPlayerBaseListener.IOnSubtitleDataListener, ITPPlayerBaseListener.IOnVideoFrameOutListener, ITPPlayerBaseListener.IOnAudioPcmOutListener, ITPPlayerBaseListener.IOnVideoProcessOutListener, ITPPlayerBaseListener.IOnAudioProcessOutListener {
        private TPPlayerBaseCallback() {
        }

        public void onAudioPcmOut(TPAudioFrameBuffer tPAudioFrameBuffer) {
            TPSystemClipPlayer.this.handleOnAudioFrameOut(tPAudioFrameBuffer);
        }

        public TPPostProcessFrameBuffer onAudioProcessFrameOut(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            return TPSystemClipPlayer.this.handleOnAudioProcessFrameOut(tPPostProcessFrameBuffer);
        }

        public void onCompletion() {
            TPSystemClipPlayer.this.handleOnComplete();
        }

        public void onError(int i, int i2, long j, long j2) {
            TPSystemClipPlayer.this.handleOnError(i, i2, j, j2);
        }

        public void onInfo(int i, long j, long j2, Object obj) {
            TPSystemClipPlayer.this.handleOnInfo(i, j, j2, obj);
        }

        public void onPrepared() {
            TPSystemClipPlayer.this.handleOnPrepared();
        }

        public void onSeekComplete() {
            TPSystemClipPlayer.this.handleOnSeekComplete();
        }

        public void onSubtitleData(TPSubtitleData tPSubtitleData) {
            TPSystemClipPlayer.this.handleOnSubtitleData(tPSubtitleData);
        }

        public void onVideoFrameOut(TPVideoFrameBuffer tPVideoFrameBuffer) {
            TPSystemClipPlayer.this.handleOnVideoFrameOut(tPVideoFrameBuffer);
        }

        public TPPostProcessFrameBuffer onVideoProcessFrameOut(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            return TPSystemClipPlayer.this.handleOnVideoProcessFrameOut(tPPostProcessFrameBuffer);
        }

        public void onVideoSizeChanged(long j, long j2) {
            TPSystemClipPlayer.this.handleOnVideoSizeChange(j, j2);
        }
    }

    public TPSystemClipPlayer(Context context, TPLoggerContext tPLoggerContext) {
        TPLoggerContext tPLoggerContext2 = new TPLoggerContext(tPLoggerContext, TAG);
        this.mTPLoggerContext = tPLoggerContext2;
        this.mLogger = new TPBaseLogger(tPLoggerContext2);
        this.mContext = context;
        this.mPlayerState = new TPPlayerState();
        this.mPlayerInitParams = new TPPlaybackParams();
        this.mPlayerCallback = new TPPlayerBaseCallback();
        this.mPlayerListeners = new TPPlayerBaseListeners(this.mLogger.getTag());
        this.mStateChecker = new TPPlayerStateStrategy(this.mPlayerState);
        this.mClipList = new ArrayList();
    }

    private ITPPlayerBase createPlayerBase() {
        TPSystemMediaPlayer tPSystemMediaPlayer = new TPSystemMediaPlayer(this.mContext, this.mTPLoggerContext);
        if (this.mTPPlaybackInfo == null) {
            this.mTPPlaybackInfo = new TPPlaybackInfo();
        }
        setPlayerParamBeforePrepare(tPSystemMediaPlayer);
        return tPSystemMediaPlayer;
    }

    private List<ITPMediaTrackClip> getClipListWithAsset(ITPMediaAsset iTPMediaAsset) {
        List list;
        boolean z = iTPMediaAsset instanceof TPMediaComposition;
        if (z || (iTPMediaAsset instanceof TPMediaCompositionTrack) || (iTPMediaAsset instanceof TPMediaCompositionTrackClip)) {
            ArrayList arrayList = new ArrayList();
            if (z) {
                List<ITPMediaTrack> allAVTracks = ((TPMediaComposition) iTPMediaAsset).getAllAVTracks();
                if (TPCommonUtils.isEmpty((Collection<? extends Object>) allAVTracks) || allAVTracks.get(0) == null) {
                    throw new IllegalStateException("empty av tracks when set data source!");
                }
                list = allAVTracks.get(0).getAllTrackClips();
            } else if (iTPMediaAsset instanceof TPMediaCompositionTrack) {
                list = ((TPMediaCompositionTrack) iTPMediaAsset).getAllTrackClips();
            } else {
                arrayList.add((ITPMediaTrackClip) iTPMediaAsset);
                list = arrayList;
            }
            long j = 0;
            for (int i = 0; i < list.size(); i++) {
                ((ITPMediaTrackClip) list.get(i)).setStartPositionMs(j);
                j += ((ITPMediaTrackClip) list.get(i)).getOriginalDurationMs();
            }
            return list;
        }
        throw new IllegalStateException("system mediaPlayer : media asset is illegal source!");
    }

    private ITPMediaTrackClip getCurrentClip() {
        return this.mClipList.get(this.mCurrentClip);
    }

    /* access modifiers changed from: private */
    public void handleOnAudioFrameOut(TPAudioFrameBuffer tPAudioFrameBuffer) {
        if (this.mStateChecker.validStateCallback(7)) {
            this.mPlayerListeners.onAudioPcmOut(tPAudioFrameBuffer);
        }
    }

    /* access modifiers changed from: private */
    public TPPostProcessFrameBuffer handleOnAudioProcessFrameOut(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        if (!this.mStateChecker.validStateCallback(7)) {
            return null;
        }
        return this.mPlayerListeners.onAudioProcessFrameOut(tPPostProcessFrameBuffer);
    }

    /* access modifiers changed from: private */
    public void handleOnComplete() {
        if (this.mStateChecker.validStateCallback(2)) {
            if (this.mCurrentClip >= this.mClipList.size() - 1) {
                this.mPlayerState.changeState(7);
                this.mPlayerListeners.onCompletion();
                return;
            }
            try {
                switchPlayer(this.mCurrentClip + 1, 0);
            } catch (IOException e) {
                TPBaseLogger tPBaseLogger = this.mLogger;
                tPBaseLogger.info("handleOnComplete:" + e.toString());
            }
        }
    }

    /* access modifiers changed from: private */
    public void handleOnError(int i, int i2, long j, long j2) {
        if (this.mStateChecker.validStateCallback(4)) {
            this.mPlayerListeners.onError(i, i2, j, j2);
        }
    }

    /* access modifiers changed from: private */
    public void handleOnInfo(int i, long j, long j2, Object obj) {
        if (this.mStateChecker.validStateCallback(3)) {
            this.mPlayerListeners.onInfo(i, j, j2, obj);
        }
    }

    /* access modifiers changed from: private */
    public void handleOnPrepared() {
        TPPlayerBaseListeners tPPlayerBaseListeners = this.mPlayerListeners;
        if (tPPlayerBaseListeners != null) {
            tPPlayerBaseListeners.onInfo(152, (long) this.mCurrentClip, 0, (Object) null);
        }
        if (this.isPlayingClip) {
            start();
            if (this.isSwitchingDef && this.mPlayerListeners != null && !TPCommonUtils.isEmpty((Collection<? extends Object>) this.mSwitchingDefTagQueue)) {
                Long poll = this.mSwitchingDefTagQueue.poll();
                if (poll != null) {
                    this.mPlayerListeners.onInfo(3, poll.longValue(), 0, (Object) null);
                }
                this.isSwitchingDef = false;
            }
        } else if (this.mStateChecker.validStateCallback(1)) {
            this.mPlayerState.changeState(4);
            TPPlayerBaseListeners tPPlayerBaseListeners2 = this.mPlayerListeners;
            if (tPPlayerBaseListeners2 != null) {
                tPPlayerBaseListeners2.onPrepared();
            }
            setPlayerParamAfterPrepared(this.mPlayerBase);
        }
    }

    /* access modifiers changed from: private */
    public void handleOnSeekComplete() {
        if (this.mStateChecker.validStateCallback(5)) {
            if (this.mPlayerState.mo28465is(7)) {
                start();
            }
            this.mPlayerListeners.onSeekComplete();
        }
    }

    /* access modifiers changed from: private */
    public void handleOnSubtitleData(TPSubtitleData tPSubtitleData) {
        if (this.mStateChecker.validStateCallback(7)) {
            this.mPlayerListeners.onSubtitleData(tPSubtitleData);
        }
    }

    /* access modifiers changed from: private */
    public void handleOnVideoFrameOut(TPVideoFrameBuffer tPVideoFrameBuffer) {
        if (this.mStateChecker.validStateCallback(7)) {
            this.mPlayerListeners.onVideoFrameOut(tPVideoFrameBuffer);
        }
    }

    /* access modifiers changed from: private */
    public TPPostProcessFrameBuffer handleOnVideoProcessFrameOut(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        if (!this.mStateChecker.validStateCallback(7)) {
            return null;
        }
        return this.mPlayerListeners.onVideoProcessFrameOut(tPPostProcessFrameBuffer);
    }

    /* access modifiers changed from: private */
    public void handleOnVideoSizeChange(long j, long j2) {
        if (this.mStateChecker.validStateCallback(6)) {
            this.mTPPlaybackInfo.setHeight(j2);
            this.mTPPlaybackInfo.setWidth(j);
            this.mPlayerListeners.onVideoSizeChanged(j, j2);
        }
    }

    private void selectClipPlayer(int i) {
        for (int i2 = 0; i2 < this.mClipList.size(); i2++) {
            long j = (long) i;
            if (this.mClipList.get(i2).getStartPositionMs() <= j && j <= this.mClipList.get(i2).getStartPositionMs() + this.mClipList.get(i2).getOriginalDurationMs()) {
                try {
                    switchPlayer(i2, j - this.mClipList.get(i2).getStartPositionMs());
                } catch (IOException e) {
                    TPBaseLogger tPBaseLogger = this.mLogger;
                    tPBaseLogger.info("selectClipPlayer:" + e.toString());
                }
            }
        }
    }

    private void setPlayerParamAfterPrepared(ITPPlayerBase iTPPlayerBase) {
        TPTrackInfo[] trackInfo = getTrackInfo();
        if (trackInfo != null) {
            for (int i = 0; i < trackInfo.length; i++) {
                if (trackInfo[i].equals(this.mPlayerInitParams.getTrackInfoByType(trackInfo[i].getTrackType()))) {
                    iTPPlayerBase.selectTrack(i, -1);
                }
            }
        }
    }

    private void setPlayerParamBeforePrepare(ITPPlayerBase iTPPlayerBase) {
        if (1 == this.mPlayerInitParams.dataSource().getType()) {
            iTPPlayerBase.setDataSource(this.mPlayerInitParams.dataSource().parcelFileDescriptor());
        } else if (4 == this.mPlayerInitParams.dataSource().getType()) {
            iTPPlayerBase.setDataSource(this.mPlayerInitParams.dataSource().assetFileDescriptor());
        }
        if (this.mPlayerInitParams.dataSource().getType() == 0) {
            iTPPlayerBase.setDataSource(this.mPlayerInitParams.dataSource().url(), this.mPlayerInitParams.dataSource().httpHeaders());
        }
        for (TPOptionalParam playerOptionalParam : this.mPlayerInitParams.optionalParams()) {
            iTPPlayerBase.setPlayerOptionalParam(playerOptionalParam);
        }
        for (TPPlaybackParams.SubtitleAttribute next : this.mPlayerInitParams.subtitleSources()) {
            iTPPlayerBase.addSubtitleSource(next.url, next.httpHeader, next.mimeType, next.name);
        }
        for (TPPlaybackParams.AudioTrackAttribute next2 : this.mPlayerInitParams.audioTrackSources()) {
            iTPPlayerBase.addAudioTrackSource(next2.url, next2.httpHeader, next2.name, next2.audioTrackParams);
        }
        if (this.mPlayerInitParams.loopback() != null) {
            iTPPlayerBase.setLoopback(this.mPlayerInitParams.loopback().isLoopback, this.mPlayerInitParams.loopback().startPositionMs, this.mPlayerInitParams.loopback().endPositionMs);
        }
        iTPPlayerBase.setOutputMute(this.mPlayerInitParams.outputMute());
        if (this.mPlayerInitParams.audioGainRatio() != 0.0f) {
            iTPPlayerBase.setAudioGainRatio(this.mPlayerInitParams.audioGainRatio());
        }
        if (this.mPlayerInitParams.speedRatio() != 0.0f) {
            iTPPlayerBase.setPlaySpeedRatio(this.mPlayerInitParams.speedRatio());
        }
        if (this.mPlayerInitParams.surface() instanceof SurfaceHolder) {
            iTPPlayerBase.setSurfaceHolder((SurfaceHolder) this.mPlayerInitParams.surface());
        } else if (this.mPlayerInitParams.surface() instanceof Surface) {
            iTPPlayerBase.setSurface((Surface) this.mPlayerInitParams.surface(), this.mPlayerInitParams.surfaceType());
        }
        iTPPlayerBase.setOnInfoListener(this.mPlayerCallback);
        iTPPlayerBase.setOnPreparedListener(this.mPlayerCallback);
        iTPPlayerBase.setOnCompletionListener(this.mPlayerCallback);
        iTPPlayerBase.setOnErrorListener(this.mPlayerCallback);
        iTPPlayerBase.setOnSeekCompleteListener(this.mPlayerCallback);
        iTPPlayerBase.setOnVideoSizeChangedListener(this.mPlayerCallback);
        iTPPlayerBase.setOnSubtitleDataListener(this.mPlayerCallback);
    }

    private void switchPlayer(int i, long j) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.debug("switchPlayer: clipNo:" + i + "   startPostion:" + j);
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.release();
        }
        this.isPlayingClip = true;
        this.mCurrentClip = i;
        this.mPlayerInitParams.setDataSource(this.mClipList.get(i).getFilePath(), this.mClipList.get(this.mCurrentClip).getHttpHeader());
        ITPPlayerBase createPlayerBase = createPlayerBase();
        this.mPlayerBase = createPlayerBase;
        if (createPlayerBase != null) {
            this.mPlayerBase.setPlayerOptionalParam(new TPOptionalParam().buildLong(100, j));
            this.mPlayerBase.prepare();
            return;
        }
        throw new RuntimeException("error , create player failed");
    }

    public void addAudioTrackSource(String str, String str2, List<TPOptionalParam> list) {
        this.mLogger.error("addAudioTrackSource not supported.");
    }

    public void addSubtitleSource(String str, String str2, String str3) {
        this.mLogger.error("addSubtitleSource not supported.");
    }

    public void captureVideo(TPCaptureParams tPCaptureParams, TPCaptureCallBack tPCaptureCallBack) {
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.captureVideo(tPCaptureParams, tPCaptureCallBack);
        }
    }

    public void deselectTrack(int i, long j) {
        this.mLogger.error("deselectTrack not supported.");
    }

    public long getCurrentPositionMs() {
        long j = 0;
        int i = 0;
        while (i < this.mClipList.size() && i < this.mCurrentClip) {
            j += this.mClipList.get(i).getOriginalDurationMs();
            i++;
        }
        return !this.mStateChecker.validStateCall(12) ? j : j + this.mPlayerBase.getCurrentPositionMs();
    }

    public long getDemuxerOffsetInFile() {
        return -1;
    }

    public long getDurationMs() {
        long j = 0;
        for (ITPMediaTrackClip originalDurationMs : this.mClipList) {
            j += originalDurationMs.getOriginalDurationMs();
        }
        return j;
    }

    public TPDynamicStatisticParams getDynamicStatisticParams(boolean z) {
        return null;
    }

    public TPGeneralPlayFlowParams getGeneralPlayFlowParams() {
        return null;
    }

    public long getPlayableDurationMs() {
        if (this.mStateChecker.validStateCall(15)) {
            return this.mPlayerBase.getPlayableDurationMs();
        }
        TPPlaybackInfo tPPlaybackInfo = this.mTPPlaybackInfo;
        if (tPPlaybackInfo != null) {
            return tPPlaybackInfo.getPlayableDurationMs();
        }
        return 0;
    }

    public TPProgramInfo[] getProgramInfo() {
        this.mLogger.error("getProgramInfo not supported.");
        return new TPProgramInfo[0];
    }

    public long getPropertyLong(int i) {
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            return iTPPlayerBase.getPropertyLong(i);
        }
        return -1;
    }

    public String getPropertyString(int i) {
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        return iTPPlayerBase != null ? iTPPlayerBase.getPropertyString(i) : "";
    }

    public TPTrackInfo[] getTrackInfo() {
        this.mLogger.error("getTrackInfo not supported.");
        return new TPTrackInfo[0];
    }

    public int getVideoHeight() {
        long height;
        TPPlaybackInfo tPPlaybackInfo = this.mTPPlaybackInfo;
        if (tPPlaybackInfo == null) {
            return 0;
        }
        if (tPPlaybackInfo.getHeight() > 0) {
            height = this.mTPPlaybackInfo.getHeight();
        } else if (!this.mStateChecker.validStateCall(13)) {
            return 0;
        } else {
            this.mTPPlaybackInfo.setHeight((long) this.mPlayerBase.getVideoHeight());
            height = this.mTPPlaybackInfo.getHeight();
        }
        return (int) height;
    }

    public int getVideoWidth() {
        long width;
        TPPlaybackInfo tPPlaybackInfo = this.mTPPlaybackInfo;
        if (tPPlaybackInfo == null) {
            return 0;
        }
        if (tPPlaybackInfo.getWidth() > 0) {
            width = this.mTPPlaybackInfo.getWidth();
        } else if (!this.mStateChecker.validStateCall(13)) {
            return 0;
        } else {
            this.mTPPlaybackInfo.setWidth((long) this.mPlayerBase.getVideoWidth());
            width = this.mTPPlaybackInfo.getWidth();
        }
        return (int) width;
    }

    public void pause() {
        if (this.mStateChecker.validStateCall(6)) {
            ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                try {
                    iTPPlayerBase.pause();
                    this.mPlayerState.changeState(6);
                } catch (IllegalStateException unused) {
                    throw new IllegalStateException("error , pause ,state invalid");
                }
            } else {
                throw new IllegalStateException("error , pause , player is null");
            }
        }
    }

    public void prepare() {
        if (this.mStateChecker.validStateCall(1)) {
            if (this.mPlayerInitParams.validDataSource()) {
                ITPPlayerBase createPlayerBase = createPlayerBase();
                this.mPlayerBase = createPlayerBase;
                if (createPlayerBase != null) {
                    this.mPlayerState.changeState(3);
                    this.mPlayerBase.prepare();
                    return;
                }
                throw new RuntimeException("error , create player failed");
            }
            throw new IOException("error , prepare , data source invalid");
        }
    }

    public void prepareAsync() {
        if (this.mStateChecker.validStateCall(1)) {
            if (this.mPlayerInitParams.validDataSource()) {
                ITPPlayerBase createPlayerBase = createPlayerBase();
                this.mPlayerBase = createPlayerBase;
                if (createPlayerBase != null) {
                    this.mPlayerState.changeState(3);
                    this.mPlayerBase.prepareAsync();
                    return;
                }
                throw new RuntimeException("error , create player failed");
            }
            throw new IllegalStateException("error , prepare , state invalid , data source invalid");
        }
    }

    public void release() {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("release, current state:" + this.mPlayerState);
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.release();
            this.mPlayerBase = null;
        }
        this.mPlayerInitParams.reset();
        this.mPlayerListeners.clear();
        this.mPlayerState.changeState(11);
    }

    public void reset() {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("reset, current state:" + this.mPlayerState);
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.reset();
        }
        this.mPlayerInitParams.reset();
        this.mPlayerListeners.clear();
        this.mPlayerState.changeState(1);
    }

    public void seekTo(int i) {
        if (this.mStateChecker.validStateCall(9)) {
            long j = (long) i;
            if (j < getCurrentClip().getStartPositionMs() || j > getCurrentClip().getStartPositionMs() + getCurrentClip().getOriginalDurationMs()) {
                selectClipPlayer(i);
            } else if (this.mPlayerBase != null) {
                TPBaseLogger tPBaseLogger = this.mLogger;
                tPBaseLogger.debug("seek to:" + i);
                this.mPlayerBase.seekTo((int) (j - getCurrentClip().getStartPositionMs()));
            }
        }
    }

    public void selectProgram(int i, long j) {
        this.mLogger.error("selectProgram not supported.");
    }

    public void selectTrack(int i, long j) {
        this.mLogger.error("selectTrack not supported.");
    }

    public void setAudioGainRatio(float f) {
        if (this.mStateChecker.validStateCall(3)) {
            ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.setAudioGainRatio(f);
            }
            this.mPlayerInitParams.setAudioGainRatio(f);
        }
    }

    public void setAudioNormalizeVolumeParams(String str) {
    }

    public void setDataSource(String str) {
        setDataSource(str, (Map<String, String>) null);
    }

    public void setLoopback(boolean z) {
        if (this.mStateChecker.validStateCall(3)) {
            ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.setLoopback(z);
            }
            this.mPlayerInitParams.setLoopback(z);
        }
    }

    public void setOnAudioPcmOutputListener(ITPPlayerBaseListener.IOnAudioPcmOutListener iOnAudioPcmOutListener) {
        throw new IllegalStateException("system Mediaplayer cannot support audio frame out");
    }

    public void setOnAudioProcessOutputListener(ITPPlayerBaseListener.IOnAudioProcessOutListener iOnAudioProcessOutListener) {
        throw new IllegalStateException("system Mediaplayer cannot support audio postprocess frame out");
    }

    public void setOnCompletionListener(ITPPlayerBaseListener.IOnCompletionListener iOnCompletionListener) {
        this.mPlayerListeners.setOnCompletionListener(iOnCompletionListener);
    }

    public void setOnDemuxerListener(ITPPlayerBaseListener.IOnDemuxerListener iOnDemuxerListener) {
    }

    public void setOnDetailInfoListener(ITPPlayerBaseListener.IOnDetailInfoListener iOnDetailInfoListener) {
    }

    public void setOnErrorListener(ITPPlayerBaseListener.IOnErrorListener iOnErrorListener) {
        this.mPlayerListeners.setOnErrorListener(iOnErrorListener);
    }

    public void setOnEventRecordListener(ITPPlayerBaseListener.IOnEventRecordListener iOnEventRecordListener) {
    }

    public void setOnInfoListener(ITPPlayerBaseListener.IOnInfoListener iOnInfoListener) {
        this.mPlayerListeners.setOnInfoListener(iOnInfoListener);
    }

    public void setOnPreparedListener(ITPPlayerBaseListener.IOnPreparedListener iOnPreparedListener) {
        this.mPlayerListeners.setOnPreparedListener(iOnPreparedListener);
    }

    public void setOnSeekCompleteListener(ITPPlayerBaseListener.IOnSeekCompleteListener iOnSeekCompleteListener) {
        this.mPlayerListeners.setOnSeekCompleteListener(iOnSeekCompleteListener);
    }

    public void setOnSubtitleDataListener(ITPPlayerBaseListener.IOnSubtitleDataListener iOnSubtitleDataListener) {
        this.mPlayerListeners.setOnSubtitleDataListener(iOnSubtitleDataListener);
    }

    public void setOnSubtitleFrameOutListener(ITPPlayerBaseListener.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
    }

    public void setOnVideoFrameOutListener(ITPPlayerBaseListener.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        throw new IllegalStateException("system Mediaplayer cannot support video frame out");
    }

    public void setOnVideoProcessOutputListener(ITPPlayerBaseListener.IOnVideoProcessOutListener iOnVideoProcessOutListener) {
        throw new IllegalStateException("system Mediaplayer cannot support video postprocess frame out");
    }

    public void setOnVideoSizeChangedListener(ITPPlayerBaseListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
        this.mPlayerListeners.setOnVideoSizeChangedListener(iOnVideoSizeChangedListener);
    }

    public void setOutputMute(boolean z) {
        if (this.mStateChecker.validStateCall(3)) {
            ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.setOutputMute(z);
            }
            this.mPlayerInitParams.setOutputMute(z);
        }
    }

    public void setPlaySharpenSwitch() {
    }

    public void setPlaySpeedRatio(float f) {
        if (this.mStateChecker.validStateCall(3)) {
            ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.setPlaySpeedRatio(f);
            }
            this.mPlayerInitParams.setSpeedRatio(f);
        }
    }

    public void setPlayerOptionalParam(TPOptionalParam tPOptionalParam) {
        if (tPOptionalParam.getKey() == 100) {
            int i = (int) tPOptionalParam.getParamLong().value;
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.debug("start position:" + i);
            for (int i2 = 0; i2 < this.mClipList.size(); i2++) {
                long j = (long) i;
                if (this.mClipList.get(i2).getStartPositionMs() <= j && j <= this.mClipList.get(i2).getStartPositionMs() + this.mClipList.get(i2).getOriginalDurationMs()) {
                    this.mCurrentClip = i2;
                    this.mPlayerInitParams.setDataSource(this.mClipList.get(i2).getFilePath());
                    tPOptionalParam.getParamLong().value = j - this.mClipList.get(i2).getStartPositionMs();
                }
            }
        }
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.setPlayerOptionalParam(tPOptionalParam);
        }
        this.mPlayerInitParams.addOptionalParams(tPOptionalParam);
    }

    public void setSurface(Surface surface, @TPCommonEnum.TPSurfaceType int i) {
        if (this.mStateChecker.validStateCall(4)) {
            ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.setSurface(surface, i);
            }
            this.mPlayerInitParams.setSurface(surface, i);
            return;
        }
        throw new IllegalStateException("setSurface , state invalid");
    }

    public void setSurfaceHolder(SurfaceHolder surfaceHolder) {
        if (this.mStateChecker.validStateCall(4)) {
            ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.setSurfaceHolder(surfaceHolder);
            }
            this.mPlayerInitParams.setSurfaceHolder(surfaceHolder);
            return;
        }
        throw new IllegalStateException("setSurfaceHolder , state invalid");
    }

    public void start() {
        if (this.mStateChecker.validStateCall(5)) {
            ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                try {
                    iTPPlayerBase.start();
                    this.mPlayerState.changeState(5);
                } catch (IllegalStateException unused) {
                    throw new IllegalStateException("error , start ,state invalid");
                }
            } else {
                throw new IllegalStateException("error , start , player is null");
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        throw new java.lang.IllegalStateException("error , pause ,state invalid");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        r3.mPlayerState.changeState(9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void stop() {
        /*
            r3 = this;
            com.tencent.thumbplayer.adapter.TPPlayerStateStrategy r0 = r3.mStateChecker
            r1 = 7
            boolean r0 = r0.validStateCall(r1)
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            com.tencent.thumbplayer.adapter.player.ITPPlayerBase r0 = r3.mPlayerBase
            if (r0 == 0) goto L_0x0032
            r0 = 9
            com.tencent.thumbplayer.api.TPPlayerState r1 = r3.mPlayerState     // Catch:{ IllegalStateException -> 0x0024 }
            r2 = 8
            r1.changeState(r2)     // Catch:{ IllegalStateException -> 0x0024 }
            com.tencent.thumbplayer.adapter.player.ITPPlayerBase r1 = r3.mPlayerBase     // Catch:{ IllegalStateException -> 0x0024 }
            r1.stop()     // Catch:{ IllegalStateException -> 0x0024 }
            com.tencent.thumbplayer.api.TPPlayerState r1 = r3.mPlayerState
            r1.changeState(r0)
            return
        L_0x0022:
            r1 = move-exception
            goto L_0x002c
        L_0x0024:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0022 }
            java.lang.String r2 = "error , pause ,state invalid"
            r1.<init>(r2)     // Catch:{ all -> 0x0022 }
            throw r1     // Catch:{ all -> 0x0022 }
        L_0x002c:
            com.tencent.thumbplayer.api.TPPlayerState r2 = r3.mPlayerState
            r2.changeState(r0)
            throw r1
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "error , stop , player is null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemClipPlayer.stop():void");
    }

    public void switchDefinition(ITPMediaAsset iTPMediaAsset, @TPCommonEnum.TPSwitchDefMode int i, long j) {
        List<ITPMediaTrackClip> clipListWithAsset = getClipListWithAsset(iTPMediaAsset);
        if (!TPCommonUtils.isEmpty((Collection<? extends Object>) clipListWithAsset)) {
            long currentPositionMs = getCurrentPositionMs();
            try {
                this.mClipList = clipListWithAsset;
                this.isSwitchingDef = true;
                if (TPCommonUtils.isEmpty((Collection<? extends Object>) this.mSwitchingDefTagQueue)) {
                    this.mSwitchingDefTagQueue = new LinkedList<>();
                }
                this.mSwitchingDefTagQueue.offer(Long.valueOf(j));
                TPBaseLogger tPBaseLogger = this.mLogger;
                tPBaseLogger.info("try to switch definition with system clip player, current clipNo:" + this.mCurrentClip);
                selectClipPlayer((int) currentPositionMs);
            } catch (Exception e) {
                this.mLogger.printException(e);
                throw new IllegalStateException("exception when system clip player switch definition!");
            }
        } else {
            throw new IllegalStateException("exception when switch Definition with clip mediaAsset empty source!");
        }
    }

    public void switchDefinition(String str, @TPCommonEnum.TPSwitchDefMode int i, long j) {
    }

    public void switchDefinition(String str, Map<String, String> map, @TPCommonEnum.TPSwitchDefMode int i, long j) {
    }

    public void updateLoggerContext(TPLoggerContext tPLoggerContext) {
        this.mLogger.updateContext(new TPLoggerContext(tPLoggerContext, TAG));
        TPPlayerBaseListeners tPPlayerBaseListeners = this.mPlayerListeners;
        if (tPPlayerBaseListeners != null && tPLoggerContext != null) {
            tPPlayerBaseListeners.updateTag(this.mLogger.getTPLoggerContext().getTag());
        }
    }

    public void addAudioTrackSource(String str, Map<String, String> map, String str2, List<TPOptionalParam> list) {
        this.mLogger.error("addAudioTrackSource not supported.");
    }

    public void addSubtitleSource(String str, Map<String, String> map, String str2, String str3) {
        this.mLogger.error("addSubtitleSource not supported.");
    }

    public void setDataSource(String str, Map<String, String> map) {
        this.mPlayerInitParams.setDataSource(str, map);
        this.mPlayerState.changeState(2);
    }

    public void setDataSource(ParcelFileDescriptor parcelFileDescriptor) {
        this.mPlayerInitParams.setDataSource(parcelFileDescriptor);
        this.mPlayerState.changeState(2);
    }

    public void setLoopback(boolean z, long j, long j2) {
        if (this.mStateChecker.validStateCall(3)) {
            ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.setLoopback(z, j, j2);
            }
            this.mPlayerInitParams.setLoopback(z, j, j2);
        }
    }

    public void setDataSource(AssetFileDescriptor assetFileDescriptor) {
        this.mPlayerInitParams.setDataSource(assetFileDescriptor);
        this.mPlayerState.changeState(2);
    }

    public void seekTo(int i, @TPCommonEnum.TPSeekMode int i2) {
        if (this.mStateChecker.validStateCall(9)) {
            long j = (long) i;
            if (j < getCurrentClip().getStartPositionMs() || j > getCurrentClip().getStartPositionMs() + getCurrentClip().getOriginalDurationMs()) {
                selectClipPlayer(i);
            } else if (this.mPlayerBase != null) {
                TPBaseLogger tPBaseLogger = this.mLogger;
                tPBaseLogger.debug("seek to:" + i + "/mode=" + i2);
                this.mPlayerBase.seekTo((int) (j - getCurrentClip().getStartPositionMs()), i2);
            }
        }
    }

    public void setDataSource(ITPMediaAsset iTPMediaAsset) {
        List<ITPMediaTrackClip> clipListWithAsset = getClipListWithAsset(iTPMediaAsset);
        try {
            this.mClipList = clipListWithAsset;
            this.mPlayerInitParams.setDataSource(clipListWithAsset.get(this.mCurrentClip).getFilePath(), this.mClipList.get(this.mCurrentClip).getHttpHeader());
            this.mPlayerState.changeState(2);
        } catch (Exception e) {
            this.mLogger.printException(e);
            throw new IllegalStateException("exception when system clip player set data source!");
        }
    }
}
