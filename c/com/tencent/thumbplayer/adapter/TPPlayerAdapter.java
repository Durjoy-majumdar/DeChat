package com.tencent.thumbplayer.adapter;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.thumbplayer.adapter.TPPlaybackParams;
import com.tencent.thumbplayer.adapter.player.ITPPlayerBase;
import com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener;
import com.tencent.thumbplayer.adapter.player.TPPlayerBaseFactory;
import com.tencent.thumbplayer.adapter.player.TPUrlDataSource;
import com.tencent.thumbplayer.adapter.strategy.ITPStrategy;
import com.tencent.thumbplayer.adapter.strategy.TPStrategyFactory;
import com.tencent.thumbplayer.adapter.strategy.model.TPStrategyConfig;
import com.tencent.thumbplayer.adapter.strategy.model.TPStrategyContext;
import com.tencent.thumbplayer.api.TPAudioFrameBuffer;
import com.tencent.thumbplayer.api.TPCaptureCallBack;
import com.tencent.thumbplayer.api.TPCaptureParams;
import com.tencent.thumbplayer.api.TPCommonEnum;
import com.tencent.thumbplayer.api.TPDrmInfo;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.thumbplayer.api.TPPlayerDetailInfo;
import com.tencent.thumbplayer.api.TPPlayerState;
import com.tencent.thumbplayer.api.TPPostProcessFrameBuffer;
import com.tencent.thumbplayer.api.TPProgramInfo;
import com.tencent.thumbplayer.api.TPRemoteSdpInfo;
import com.tencent.thumbplayer.api.TPSubtitleData;
import com.tencent.thumbplayer.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.api.TPTrackInfo;
import com.tencent.thumbplayer.api.TPVideoFrameBuffer;
import com.tencent.thumbplayer.api.TPVideoInfo;
import com.tencent.thumbplayer.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer;
import com.tencent.thumbplayer.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.log.TPBaseLogger;
import com.tencent.thumbplayer.log.TPLoggerContext;
import com.tencent.thumbplayer.richmedia.ITPInnerRichMediaSynchronizer;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TPPlayerAdapter implements ITPPlayerAdapter, ITPPlayerBaseListener.IOnStateChangeListener {
    private static final int PLAYER_REOPEN_TYPE_ERROR_RETRY = 1;
    private static final int PLAYER_REOPEN_TYPE_UNKNOWN = 0;
    private static final int PLAYER_REOPEN_TYPE_USER_FORCE_REOPEN = 2;
    private static final String TAG = "TPPlayerAdapter";
    private Context mContext;
    private boolean mIsReopening;
    private TPBaseLogger mLogger;
    private ITPPlayerBase mPlayerBase;
    private TPPlayerBaseCallback mPlayerCallback;
    private TPPlaybackParams mPlayerInitParams;
    private TPPlayerBaseListeners mPlayerListeners;
    private TPPlayerState mPlayerState;
    private int mPlayerType;
    private int mReopenType = 0;
    private ITPInnerRichMediaSynchronizer mRichMediaProcessor;
    private TPPlayerStateStrategy mStateChecker;
    private TPLoggerContext mTPLoggerContext;
    private TPPlaybackInfo mTPPlaybackInfo;
    private ITPStrategy mTpStrategy;

    public class TPPlayerBaseCallback implements ITPPlayerBaseListener.IOnPreparedListener, ITPPlayerBaseListener.IOnCompletionListener, ITPPlayerBaseListener.IOnInfoListener, ITPPlayerBaseListener.IOnErrorListener, ITPPlayerBaseListener.IOnSeekCompleteListener, ITPPlayerBaseListener.IOnVideoSizeChangedListener, ITPPlayerBaseListener.IOnSubtitleDataListener, ITPPlayerBaseListener.IOnSubtitleFrameOutListener, ITPPlayerBaseListener.IOnVideoFrameOutListener, ITPPlayerBaseListener.IOnAudioPcmOutListener, ITPPlayerBaseListener.IOnVideoProcessOutListener, ITPPlayerBaseListener.IOnAudioProcessOutListener, ITPPlayerBaseListener.IOnDetailInfoListener, ITPPlayerBaseListener.IOnEventRecordListener, ITPPlayerBaseListener.IOnDemuxerListener {
        private TPPlayerBaseCallback() {
        }

        public void onAudioPcmOut(TPAudioFrameBuffer tPAudioFrameBuffer) {
            TPPlayerAdapter.this.handleOnAudioFrameOut(tPAudioFrameBuffer);
        }

        public TPPostProcessFrameBuffer onAudioProcessFrameOut(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            return TPPlayerAdapter.this.handleOnAudioProcessFrameOut(tPPostProcessFrameBuffer);
        }

        public void onCompletion() {
            TPPlayerAdapter.this.handleOnComplete();
        }

        public void onDetailInfo(TPPlayerDetailInfo tPPlayerDetailInfo) {
            TPPlayerAdapter.this.handleOnDetailInfo(tPPlayerDetailInfo);
        }

        public void onDrmInfo(TPDrmInfo tPDrmInfo) {
            TPPlayerAdapter.this.handleOnDrmInfo(tPDrmInfo);
        }

        public void onError(int i, int i2, long j, long j2) {
            TPPlayerAdapter.this.handleOnError(i, i2, j, j2);
        }

        public void onInfo(int i, long j, long j2, Object obj) {
            TPPlayerAdapter.this.handleOnInfo(i, j, j2, obj);
        }

        public void onPrepared() {
            TPPlayerAdapter.this.handleOnPrepared();
        }

        public TPRemoteSdpInfo onSdpExchange(String str, int i) {
            return TPPlayerAdapter.this.handleOnSdpExchange(str, i);
        }

        public void onSeekComplete() {
            TPPlayerAdapter.this.handleOnSeekComplete();
        }

        public void onSubtitleData(TPSubtitleData tPSubtitleData) {
            TPPlayerAdapter.this.handleOnSubtitleData(tPSubtitleData);
        }

        public void onSubtitleFrameOut(TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
            TPPlayerAdapter.this.handleOnSubtitleFrameOut(tPSubtitleFrameBuffer);
        }

        public void onVideoFrameOut(TPVideoFrameBuffer tPVideoFrameBuffer) {
            TPPlayerAdapter.this.handleOnVideoFrameOut(tPVideoFrameBuffer);
        }

        public TPPostProcessFrameBuffer onVideoProcessFrameOut(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            return TPPlayerAdapter.this.handleOnVideoProcessFrameOut(tPPostProcessFrameBuffer);
        }

        public void onVideoSizeChanged(long j, long j2) {
            TPPlayerAdapter.this.handleOnVideoSizeChange(j, j2);
        }
    }

    public TPPlayerAdapter(Context context, TPLoggerContext tPLoggerContext) {
        TPLoggerContext tPLoggerContext2 = new TPLoggerContext(tPLoggerContext, TAG);
        this.mTPLoggerContext = tPLoggerContext2;
        this.mLogger = new TPBaseLogger(tPLoggerContext2);
        this.mContext = context;
        TPPlayerState tPPlayerState = new TPPlayerState();
        this.mPlayerState = tPPlayerState;
        tPPlayerState.setOnPlayerStateChangeListener(this);
        this.mPlayerInitParams = new TPPlaybackParams();
        this.mPlayerCallback = new TPPlayerBaseCallback();
        this.mPlayerListeners = new TPPlayerBaseListeners(this.mTPLoggerContext.getTag());
        this.mStateChecker = new TPPlayerStateStrategy(this.mPlayerState);
        this.mTPPlaybackInfo = new TPPlaybackInfo();
    }

    private void backupVideoInfo() {
        if (isThumbPlayer()) {
            TPPlaybackInfo parseInfo = TPPlaybackInfo.parseInfo(getPropertyString(0));
            this.mTPPlaybackInfo = parseInfo;
            parseInfo.setVideoLevel((int) this.mPlayerBase.getPropertyLong(204));
            this.mTPPlaybackInfo.setVideoProfile((int) this.mPlayerBase.getPropertyLong(203));
            this.mTPPlaybackInfo.setAudioProfile((int) this.mPlayerBase.getPropertyLong(102));
            this.mTPPlaybackInfo.setVideoCodedId((int) this.mPlayerBase.getPropertyLong(201));
            this.mTPPlaybackInfo.setVideoColorSpace((int) this.mPlayerBase.getPropertyLong(210));
        }
        if (this.mTPPlaybackInfo == null) {
            this.mTPPlaybackInfo = new TPPlaybackInfo();
        }
        this.mTPPlaybackInfo.setDurationMs(this.mPlayerBase.getDurationMs());
        TPOptionalParam optionalParam = this.mPlayerInitParams.getOptionalParam(100);
        if (optionalParam != null) {
            this.mTPPlaybackInfo.setCurrentPositionMs(optionalParam.getParamLong().value);
        }
    }

    private ITPPlayerBase createPlayerBase(int i, TPLoggerContext tPLoggerContext) {
        ITPPlayerBase iTPPlayerBase;
        if (i == 1) {
            try {
                this.mLogger.info("to create androidPlayer");
                iTPPlayerBase = TPPlayerBaseFactory.createSystemMediaPlayer(this.mContext, this.mPlayerInitParams.supportClip(), tPLoggerContext);
            } catch (Exception e) {
                this.mLogger.info("to create Player," + e.toString());
            }
        } else if (i == 2) {
            this.mLogger.info("to create thumbPlayer");
            iTPPlayerBase = TPPlayerBaseFactory.createThumbPlayer(this.mContext, tPLoggerContext);
        } else if (i == 3) {
            this.mLogger.info("to create thumbPlayer software dec");
            iTPPlayerBase = TPPlayerBaseFactory.createThumbPlayer(this.mContext, tPLoggerContext);
        } else {
            this.mLogger.info("to create no Player");
            iTPPlayerBase = null;
        }
        if (iTPPlayerBase == null) {
            this.mLogger.info("play is null!");
            return null;
        }
        this.mPlayerType = i;
        setPlayerParamBeforePrepare(iTPPlayerBase);
        return iTPPlayerBase;
    }

    private ITPStrategy createPlayerStrategy(TPPlaybackParams tPPlaybackParams) {
        TPStrategyConfig tPStrategyConfig;
        try {
            tPStrategyConfig = new TPStrategyConfig(tPPlaybackParams);
        } catch (IllegalArgumentException unused) {
            tPStrategyConfig = new TPStrategyConfig((TPPlaybackParams) null);
        }
        return TPStrategyFactory.createStrategy(tPStrategyConfig);
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
        if (!this.mStateChecker.validStateCallback(2)) {
            this.mLogger.info("handleOnComplete, invalid state");
            return;
        }
        this.mPlayerState.changeState(7);
        this.mPlayerListeners.onCompletion();
    }

    /* access modifiers changed from: private */
    public void handleOnDetailInfo(TPPlayerDetailInfo tPPlayerDetailInfo) {
        this.mPlayerListeners.onDetailInfo(tPPlayerDetailInfo);
    }

    /* access modifiers changed from: private */
    public void handleOnDrmInfo(TPDrmInfo tPDrmInfo) {
        this.mPlayerListeners.onDrmInfo(tPDrmInfo);
    }

    /* access modifiers changed from: private */
    public void handleOnError(int i, int i2, long j, long j2) {
        if (this.mStateChecker.validStateCallback(4)) {
            ITPStrategy iTPStrategy = this.mTpStrategy;
            TPPlaybackInfo tPPlaybackInfo = this.mTPPlaybackInfo;
            int strategyForRetry = iTPStrategy.strategyForRetry(tPPlaybackInfo, new TPStrategyContext(this.mPlayerType, i, i2, tPPlaybackInfo.getDefinition()));
            if (strategyForRetry == 0) {
                this.mPlayerState.changeState(10);
                this.mPlayerListeners.onError(i, i2, j, j2);
                return;
            }
            try {
                reopenPlayer(strategyForRetry, 1);
            } catch (IOException e) {
                this.mLogger.printException(e);
                this.mPlayerState.changeState(10);
                this.mPlayerListeners.onError(i, i2, j, j2);
            } catch (IllegalStateException e2) {
                this.mLogger.printException(e2);
                this.mPlayerState.changeState(10);
                this.mPlayerListeners.onError(i, i2, j, j2);
            }
        }
    }

    /* access modifiers changed from: private */
    public void handleOnInfo(int i, long j, long j2, Object obj) {
        TPPlaybackInfo tPPlaybackInfo;
        if (this.mIsReopening) {
            this.mLogger.info("handleOnInfo, mIsReopening");
            return;
        }
        if (i == 152 && (tPPlaybackInfo = this.mTPPlaybackInfo) != null) {
            tPPlaybackInfo.setCurrentPlayClipNo(((int) j) + 1);
        }
        this.mPlayerListeners.onInfo(i, j, j2, obj);
    }

    /* access modifiers changed from: private */
    public void handleOnPrepared() {
        this.mPlayerListeners.onInfo(1000, (long) this.mPlayerType, 0, (Object) null);
        if (this.mIsReopening) {
            if (this.mPlayerState.innerPlayState() != 3) {
                this.mLogger.warn("handleOnPrepared, invalid state, mIsRetrying.");
                return;
            }
        } else if (!this.mStateChecker.validStateCallback(1)) {
            this.mLogger.info("handleOnPrepared, invalid state");
            return;
        }
        backupVideoInfo();
        setPlayerParamAfterPrepared(this.mPlayerBase);
        if (this.mIsReopening) {
            this.mIsReopening = false;
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.info("handleOnPrepared, mIsRetrying, recoverState, state:" + this.mPlayerState.state());
            int state = this.mPlayerState.state();
            this.mPlayerState.changeState(4);
            if (this.mPlayerState.lastState() == 3) {
                this.mPlayerListeners.onPrepared();
            }
            if (this.mReopenType == 1) {
                this.mPlayerListeners.onInfo(1014, 0, 0, (Object) null);
            } else {
                this.mPlayerListeners.onInfo(201, 0, 0, (Object) null);
            }
            this.mReopenType = 0;
            recoverPlayer(state);
            return;
        }
        this.mPlayerState.setInnerPlayStateState(4);
        this.mPlayerState.changeState(4);
        this.mPlayerListeners.onPrepared();
    }

    /* access modifiers changed from: private */
    public TPRemoteSdpInfo handleOnSdpExchange(String str, int i) {
        return this.mPlayerListeners.onSdpExchange(str, i);
    }

    /* access modifiers changed from: private */
    public void handleOnSeekComplete() {
        if (this.mStateChecker.validStateCallback(5)) {
            this.mPlayerListeners.onSeekComplete();
        }
    }

    /* access modifiers changed from: private */
    public void handleOnSubtitleData(TPSubtitleData tPSubtitleData) {
        if (!this.mStateChecker.validStateCallback(7)) {
            this.mLogger.info("handleOnSubtitleData, invalid state");
        } else {
            this.mPlayerListeners.onSubtitleData(tPSubtitleData);
        }
    }

    /* access modifiers changed from: private */
    public void handleOnSubtitleFrameOut(TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
        if (!this.mStateChecker.validStateCallback(7)) {
            this.mLogger.info("handleOnSubtitleFrameOut, invalid state");
        } else {
            this.mPlayerListeners.onSubtitleFrameOut(tPSubtitleFrameBuffer);
        }
    }

    /* access modifiers changed from: private */
    public void handleOnVideoFrameOut(TPVideoFrameBuffer tPVideoFrameBuffer) {
        if (!this.mStateChecker.validStateCallback(7)) {
            this.mLogger.info("handleOnVideoFrameOut, invalid state");
        } else {
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
        if (!this.mStateChecker.validStateCallback(6)) {
            this.mLogger.info("handleOnVideoSizeChange, invalid state");
            return;
        }
        this.mTPPlaybackInfo.setHeight(j2);
        this.mTPPlaybackInfo.setWidth(j);
        this.mPlayerListeners.onVideoSizeChanged(j, j2);
    }

    private boolean isThumbPlayer() {
        int i = this.mPlayerType;
        return i == 2 || i == 3;
    }

    private void recoverPlayer(int i) {
        if (i == 5) {
            try {
                this.mPlayerBase.start();
                this.mPlayerState.changeState(5);
            } catch (IllegalStateException e) {
                this.mLogger.printException(e);
            }
        }
    }

    private int selectPlayer() {
        if (this.mTpStrategy == null) {
            this.mTpStrategy = createPlayerStrategy(this.mPlayerInitParams);
        }
        return this.mTpStrategy.strategyForOpen(this.mTPPlaybackInfo);
    }

    private void setPlayerParamAfterPrepared(ITPPlayerBase iTPPlayerBase) {
        TPProgramInfo selectProgramInfo;
        TPProgramInfo tPProgramInfo;
        TPProgramInfo[] programInfo = getProgramInfo();
        if (programInfo != null && (selectProgramInfo = this.mPlayerInitParams.getSelectProgramInfo()) != null) {
            int i = 0;
            while (i < programInfo.length) {
                if (TextUtils.isEmpty(selectProgramInfo.url) || (tPProgramInfo = programInfo[i]) == null || !selectProgramInfo.url.equals(tPProgramInfo.url)) {
                    i++;
                } else {
                    iTPPlayerBase.selectProgram(i, -1);
                    return;
                }
            }
        }
    }

    private void setPlayerParamBeforePrepare(ITPPlayerBase iTPPlayerBase) {
        iTPPlayerBase.setOnInfoListener(this.mPlayerCallback);
        iTPPlayerBase.setOnPreparedListener(this.mPlayerCallback);
        iTPPlayerBase.setOnCompletionListener(this.mPlayerCallback);
        iTPPlayerBase.setOnErrorListener(this.mPlayerCallback);
        iTPPlayerBase.setOnSeekCompleteListener(this.mPlayerCallback);
        iTPPlayerBase.setOnVideoSizeChangedListener(this.mPlayerCallback);
        iTPPlayerBase.setOnSubtitleDataListener(this.mPlayerCallback);
        iTPPlayerBase.setOnSubtitleFrameOutListener(this.mPlayerCallback);
        iTPPlayerBase.setOnDetailInfoListener(this.mPlayerCallback);
        iTPPlayerBase.setOnEventRecordListener(this.mPlayerCallback);
        iTPPlayerBase.setOnDemuxerListener(this.mPlayerCallback);
        if (isThumbPlayer()) {
            iTPPlayerBase.setOnVideoFrameOutListener(this.mPlayerCallback);
            iTPPlayerBase.setOnAudioPcmOutputListener(this.mPlayerCallback);
            iTPPlayerBase.setOnVideoProcessOutputListener(this.mPlayerCallback);
            iTPPlayerBase.setOnAudioProcessOutputListener(this.mPlayerCallback);
        }
        if (1 == this.mPlayerInitParams.dataSource().getType()) {
            iTPPlayerBase.setDataSource(this.mPlayerInitParams.dataSource().parcelFileDescriptor());
        } else if (4 == this.mPlayerInitParams.dataSource().getType()) {
            iTPPlayerBase.setDataSource(this.mPlayerInitParams.dataSource().assetFileDescriptor());
        } else if (3 == this.mPlayerInitParams.dataSource().getType()) {
            int i = this.mPlayerType;
            if (i == 2) {
                iTPPlayerBase.setDataSource(this.mPlayerInitParams.dataSource().getTpUrlDataSource().getSelfPlayerUrl(), this.mPlayerInitParams.dataSource().httpHeaders());
            } else if (i == 1) {
                iTPPlayerBase.setDataSource(this.mPlayerInitParams.dataSource().getTpUrlDataSource().getSystemPlayerUrl(), this.mPlayerInitParams.dataSource().httpHeaders());
            }
        } else if (2 == this.mPlayerInitParams.dataSource().getType()) {
            iTPPlayerBase.setDataSource(this.mPlayerInitParams.dataSource().mediaAsset());
        }
        for (TPOptionalParam playerOptionalParam : this.mPlayerInitParams.optionalParams()) {
            iTPPlayerBase.setPlayerOptionalParam(playerOptionalParam);
        }
        for (int i2 = 0; i2 < this.mPlayerInitParams.getTrackInfos().size(); i2++) {
            TPTrackInfo tPTrackInfo = this.mPlayerInitParams.getTrackInfos().get(i2);
            int i3 = tPTrackInfo.trackType;
            if (i3 == 3) {
                Iterator<TPPlaybackParams.SubtitleAttribute> it = this.mPlayerInitParams.subtitleSources().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    TPPlaybackParams.SubtitleAttribute next = it.next();
                    if (!TextUtils.isEmpty(next.name) && next.name.equals(tPTrackInfo.name)) {
                        iTPPlayerBase.addSubtitleSource(next.url, next.httpHeader, next.mimeType, next.name);
                        break;
                    }
                }
            } else if (i3 == 2) {
                Iterator<TPPlaybackParams.AudioTrackAttribute> it4 = this.mPlayerInitParams.audioTrackSources().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    TPPlaybackParams.AudioTrackAttribute next2 = it4.next();
                    if (!TextUtils.isEmpty(next2.name) && next2.name.equals(tPTrackInfo.name)) {
                        iTPPlayerBase.addAudioTrackSource(next2.url, next2.httpHeader, next2.name, next2.audioTrackParams);
                        break;
                    }
                }
            }
        }
        Iterator<TPPlaybackParams.SelectTrackAttribute> it5 = this.mPlayerInitParams.getSelectTrackAttributes().iterator();
        while (it5.hasNext()) {
            TPPlaybackParams.SelectTrackAttribute next3 = it5.next();
            if (next3.trackInfo.isSelected) {
                TPTrackInfo[] trackInfo = iTPPlayerBase.getTrackInfo();
                if (trackInfo == null) {
                    this.mLogger.error("playerTrackInfoList is null.");
                } else {
                    for (int i4 = 0; i4 < trackInfo.length; i4++) {
                        if (next3.trackInfo.name.equals(trackInfo[i4].name)) {
                            iTPPlayerBase.selectTrack(i4, next3.opaque);
                        }
                    }
                }
            }
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
        if (!"".equals(this.mPlayerInitParams.audioNormalizeVolumeParams())) {
            iTPPlayerBase.setAudioNormalizeVolumeParams(this.mPlayerInitParams.audioNormalizeVolumeParams());
        }
        if (this.mPlayerInitParams.surface() instanceof SurfaceHolder) {
            iTPPlayerBase.setSurfaceHolder((SurfaceHolder) this.mPlayerInitParams.surface());
        } else if (this.mPlayerInitParams.surface() instanceof Surface) {
            iTPPlayerBase.setSurface((Surface) this.mPlayerInitParams.surface(), this.mPlayerInitParams.surfaceType());
        }
        iTPPlayerBase.setPlayerOptionalParam(new TPOptionalParam().buildQueueInt(204, this.mTpStrategy.strategyForDec()));
    }

    public void addAudioTrackSource(String str, String str2, List<TPOptionalParam> list) {
        addAudioTrackSource(str, (Map<String, String>) null, str2, list);
    }

    public void addSubtitleSource(String str, String str2, String str3) {
        addSubtitleSource(str, (Map<String, String>) null, str2, str3);
    }

    public void captureVideo(TPCaptureParams tPCaptureParams, TPCaptureCallBack tPCaptureCallBack) {
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.captureVideo(tPCaptureParams, tPCaptureCallBack);
            return;
        }
        throw new IllegalStateException("error , no player for capture :" + this.mPlayerState);
    }

    public void deselectTrack(int i, long j) {
        if (this.mStateChecker.validStateCall(3)) {
            TPTrackInfo[] trackInfo = getTrackInfo();
            if (trackInfo == null) {
                this.mLogger.error("fatal err, tpTrackInfos is null");
            } else if (i < 0 || i > trackInfo.length - 1) {
                throw new IllegalArgumentException("error : track not found");
            } else {
                ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
                if (iTPPlayerBase != null) {
                    iTPPlayerBase.deselectTrack(i, j);
                }
                this.mPlayerInitParams.setDeselectTrackInfo(i, j, trackInfo[i]);
            }
        } else {
            throw new IllegalStateException("error : deselectTrack , state invalid");
        }
    }

    public int getCurrentPlayClipNo() {
        TPPlaybackInfo tPPlaybackInfo = this.mTPPlaybackInfo;
        if (tPPlaybackInfo != null) {
            return tPPlaybackInfo.getCurrentPlayClipNo();
        }
        return 0;
    }

    public long getCurrentPositionMs() {
        if (!this.mStateChecker.validStateCall(12)) {
            TPPlaybackInfo tPPlaybackInfo = this.mTPPlaybackInfo;
            if (tPPlaybackInfo != null) {
                return tPPlaybackInfo.getCurrentPositionMs();
            }
            return 0;
        }
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase == null) {
            this.mLogger.warn("getCurrentPositionMs, mPlayerBase = null, return 0!");
            return 0;
        }
        long currentPositionMs = iTPPlayerBase.getCurrentPositionMs();
        TPPlaybackInfo tPPlaybackInfo2 = this.mTPPlaybackInfo;
        if (tPPlaybackInfo2 != null) {
            tPPlaybackInfo2.setCurrentPositionMs(currentPositionMs);
        }
        return currentPositionMs;
    }

    public int getCurrentState() {
        return this.mPlayerState.state();
    }

    public long getDemuxerOffsetInFile() {
        if (!this.mStateChecker.validStateCall(19)) {
            TPPlaybackInfo tPPlaybackInfo = this.mTPPlaybackInfo;
            if (tPPlaybackInfo != null) {
                return tPPlaybackInfo.getDemuxerOffset();
            }
            return -1;
        }
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase == null) {
            this.mLogger.warn("getDemuxerOffsetInFile, mPlayerBase = null, return 0!");
            return -1;
        }
        long demuxerOffsetInFile = iTPPlayerBase.getDemuxerOffsetInFile();
        TPPlaybackInfo tPPlaybackInfo2 = this.mTPPlaybackInfo;
        if (tPPlaybackInfo2 != null) {
            tPPlaybackInfo2.setDemuxerOffset(demuxerOffsetInFile);
        }
        return demuxerOffsetInFile;
    }

    public long getDurationMs() {
        TPPlaybackInfo tPPlaybackInfo = this.mTPPlaybackInfo;
        if (tPPlaybackInfo != null && tPPlaybackInfo.getDurationMs() > 0) {
            return this.mTPPlaybackInfo.getDurationMs();
        }
        if (!this.mStateChecker.validStateCall(11)) {
            return 0;
        }
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase == null) {
            this.mLogger.warn("getDurationMs, mPlayerBase = null, return 0!");
            return 0;
        }
        long durationMs = iTPPlayerBase.getDurationMs();
        TPPlaybackInfo tPPlaybackInfo2 = this.mTPPlaybackInfo;
        if (tPPlaybackInfo2 != null) {
            tPPlaybackInfo2.setDurationMs(durationMs);
        }
        return durationMs;
    }

    public TPDynamicStatisticParams getDynamicStatisticParams(boolean z) {
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase == null) {
            return null;
        }
        return iTPPlayerBase.getDynamicStatisticParams(z);
    }

    public TPGeneralPlayFlowParams getGeneralPlayFlowParams() {
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase == null) {
            return null;
        }
        return iTPPlayerBase.getGeneralPlayFlowParams();
    }

    public long getPlayableDurationMs() {
        if (!this.mStateChecker.validStateCall(12)) {
            return 0;
        }
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase == null) {
            this.mLogger.warn("getBufferedDurationMs, mPlayerBase = null, return 0!");
            return 0;
        }
        long playableDurationMs = iTPPlayerBase.getPlayableDurationMs();
        TPPlaybackInfo tPPlaybackInfo = this.mTPPlaybackInfo;
        if (tPPlaybackInfo != null) {
            tPPlaybackInfo.setPlayableDurationMs(playableDurationMs);
        }
        return playableDurationMs;
    }

    public TPPlaybackInfo getPlaybackInfo() {
        return this.mTPPlaybackInfo;
    }

    public int getPlayerType() {
        return this.mPlayerType;
    }

    public TPProgramInfo[] getProgramInfo() {
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        return (iTPPlayerBase == null || iTPPlayerBase.getProgramInfo() == null) ? new TPProgramInfo[0] : this.mPlayerBase.getProgramInfo();
    }

    public long getPropertyLong(int i) {
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            return iTPPlayerBase.getPropertyLong(i);
        }
        this.mLogger.warn("getPropertyLong, mPlayerBase = null, return !");
        return -1;
    }

    public String getPropertyString(int i) {
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            return iTPPlayerBase.getPropertyString(i);
        }
        this.mLogger.warn("getPropertyString, mPlayerBase = null, return !");
        return "";
    }

    public TPTrackInfo[] getTrackInfo() {
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        return iTPPlayerBase != null ? iTPPlayerBase.getTrackInfo() : (TPTrackInfo[]) this.mPlayerInitParams.getTrackInfos().toArray(new TPTrackInfo[0]);
    }

    public int getVideoHeight() {
        TPPlaybackInfo tPPlaybackInfo = this.mTPPlaybackInfo;
        if (tPPlaybackInfo != null && tPPlaybackInfo.getHeight() > 0) {
            return (int) this.mTPPlaybackInfo.getHeight();
        }
        if (!this.mStateChecker.validStateCall(13)) {
            this.mLogger.warn("getVideoHeight, state error!");
            return 0;
        }
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase == null) {
            this.mLogger.warn("getVideoHeight, mPlayerBase = null, return 0!");
            return 0;
        }
        int videoHeight = iTPPlayerBase.getVideoHeight();
        TPPlaybackInfo tPPlaybackInfo2 = this.mTPPlaybackInfo;
        if (tPPlaybackInfo2 != null) {
            tPPlaybackInfo2.setHeight((long) videoHeight);
        }
        return videoHeight;
    }

    public int getVideoWidth() {
        TPPlaybackInfo tPPlaybackInfo = this.mTPPlaybackInfo;
        if (tPPlaybackInfo != null && tPPlaybackInfo.getWidth() > 0) {
            return (int) this.mTPPlaybackInfo.getWidth();
        }
        if (!this.mStateChecker.validStateCall(13)) {
            this.mLogger.warn("getVideoWidth, state error!");
            return 0;
        }
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase == null) {
            this.mLogger.warn("getVideoWidth, mPlayerBase = null, return 0!");
            return 0;
        }
        int videoWidth = iTPPlayerBase.getVideoWidth();
        TPPlaybackInfo tPPlaybackInfo2 = this.mTPPlaybackInfo;
        if (tPPlaybackInfo2 != null) {
            tPPlaybackInfo2.setWidth((long) videoWidth);
        }
        return videoWidth;
    }

    public boolean isPlaying() {
        TPPlayerState tPPlayerState = this.mPlayerState;
        return tPPlayerState != null && tPPlayerState.state() == 5;
    }

    public void onStateChange(int i, int i2) {
        this.mPlayerListeners.onStateChange(i, i2);
    }

    public void pause() {
        if (this.mStateChecker.validStateCall(6)) {
            ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase == null) {
                throw new IllegalStateException("error , pause , player is null");
            } else if (this.mIsReopening) {
                this.mPlayerState.changeState(6);
            } else {
                try {
                    iTPPlayerBase.pause();
                    this.mPlayerState.changeState(6);
                } catch (IllegalStateException unused) {
                    throw new IllegalStateException("error , pause ,state invalid");
                }
            }
        } else {
            throw new IllegalStateException("error , pause , state invalid , current state :" + this.mPlayerState);
        }
    }

    public void prepare() {
        if (!this.mStateChecker.validStateCall(1)) {
            throw new IllegalStateException("error , prepare , state invalid , current state :" + this.mPlayerState);
        } else if (this.mPlayerInitParams.validDataSource()) {
            ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.reset();
                this.mPlayerBase.release();
            }
            ITPPlayerBase createPlayerBase = createPlayerBase(selectPlayer(), this.mTPLoggerContext);
            this.mPlayerBase = createPlayerBase;
            if (createPlayerBase != null) {
                this.mPlayerState.setInnerPlayStateState(3);
                this.mPlayerState.changeState(3);
                this.mPlayerBase.prepare();
                return;
            }
            throw new RuntimeException("error , create player failed");
        } else {
            throw new IOException("error , prepare , data source invalid");
        }
    }

    public void prepareAsync() {
        if (!this.mStateChecker.validStateCall(1)) {
            throw new IllegalStateException("error , prepare , state invalid , current state :" + this.mPlayerState);
        } else if (this.mPlayerInitParams.validDataSource()) {
            ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.reset();
                this.mPlayerBase.release();
            }
            ITPPlayerBase createPlayerBase = createPlayerBase(selectPlayer(), this.mTPLoggerContext);
            this.mPlayerBase = createPlayerBase;
            if (createPlayerBase != null) {
                this.mPlayerState.setInnerPlayStateState(3);
                this.mPlayerState.changeState(3);
                this.mPlayerBase.prepareAsync();
                return;
            }
            throw new RuntimeException("error , create player failed");
        } else {
            throw new IllegalStateException("error , prepare , state invalid , data source invalid");
        }
    }

    public void release() {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("release, current state :" + this.mPlayerState);
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.release();
            this.mPlayerBase = null;
        }
        this.mPlayerInitParams.reset();
        this.mPlayerListeners.clear();
        this.mTpStrategy = null;
        this.mIsReopening = false;
        this.mPlayerState.changeState(11);
    }

    public void reopenPlayer() {
        reopenPlayer(this.mPlayerType, 2);
    }

    public void reset() {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("reset, current state :" + this.mPlayerState);
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.reset();
            this.mPlayerBase.release();
            this.mPlayerBase = null;
        }
        this.mPlayerInitParams.reset();
        TPPlaybackInfo tPPlaybackInfo = this.mTPPlaybackInfo;
        if (tPPlaybackInfo != null) {
            tPPlaybackInfo.clear();
        }
        this.mTpStrategy = null;
        this.mIsReopening = false;
        this.mPlayerState.changeState(1);
        this.mPlayerState.setLastState(1);
    }

    public void seekTo(int i) {
        if (!this.mStateChecker.validStateCall(9)) {
            throw new IllegalStateException("error , seek to , state invalid , current state :" + this.mPlayerState);
        } else if (this.mPlayerBase != null) {
            if (this.mPlayerState.state() == 7) {
                this.mPlayerState.changeState(5);
            }
            this.mPlayerBase.seekTo(i);
            ITPInnerRichMediaSynchronizer iTPInnerRichMediaSynchronizer = this.mRichMediaProcessor;
            if (iTPInnerRichMediaSynchronizer != null) {
                try {
                    iTPInnerRichMediaSynchronizer.seek((long) i);
                } catch (Exception unused) {
                    this.mLogger.warn("seekTo, rich media processor seek err.");
                }
            }
        } else {
            this.mLogger.warn("seekTo, mPlayerBase = null!");
        }
    }

    public void selectProgram(int i, long j) {
        if (this.mStateChecker.validStateCall(18)) {
            TPProgramInfo[] programInfo = getProgramInfo();
            if (programInfo == null) {
                programInfo = new TPProgramInfo[0];
            }
            if (i < 0 || i > programInfo.length - 1) {
                throw new IllegalArgumentException("error : program index not found");
            }
            ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.selectProgram(i, j);
            }
            this.mPlayerInitParams.setSelectProgramInfo(programInfo[i]);
            return;
        }
        throw new IllegalStateException("error : selectProgram , state invalid");
    }

    public void selectTrack(int i, long j) {
        if (this.mStateChecker.validStateCall(3)) {
            TPTrackInfo[] trackInfo = getTrackInfo();
            if (trackInfo == null) {
                this.mLogger.error("fatal err, tpTrackInfos is null");
            } else if (i < 0 || i > trackInfo.length - 1) {
                throw new IllegalArgumentException("error : track not found");
            } else {
                ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
                if (iTPPlayerBase != null) {
                    iTPPlayerBase.selectTrack(i, j);
                }
                this.mPlayerInitParams.addSelectedTrackInfo(i, j, trackInfo[i]);
            }
        } else {
            throw new IllegalStateException("error : selectTrack , state invalid");
        }
    }

    public void setAudioGainRatio(float f) {
        if (this.mStateChecker.validStateCall(3)) {
            ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.setAudioGainRatio(f);
            } else {
                this.mLogger.info("setAudioGainRatio, mPlayerBase = null!");
            }
            this.mPlayerInitParams.setAudioGainRatio(f);
            return;
        }
        throw new IllegalStateException("error , setAudioGainRatio , state invalid , current state :" + this.mPlayerState);
    }

    public void setAudioNormalizeVolumeParams(String str) {
        if (this.mStateChecker.validStateCall(3)) {
            ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.setAudioNormalizeVolumeParams(str);
            } else {
                this.mLogger.info("setAudioGainRatio, mPlayerBase = null!");
            }
            this.mPlayerInitParams.setAudioNormalizeVolumeParams(str);
            return;
        }
        throw new IllegalStateException("error , setAudioNormalizeVolumeParams , state invalid , current state :" + this.mPlayerState);
    }

    public void setDataSource(TPUrlDataSource tPUrlDataSource) {
        setDataSource(tPUrlDataSource, (Map<String, String>) null);
    }

    public void setDataSource(String str) {
    }

    public void setDataSource(String str, Map<String, String> map) {
    }

    public void setLoopback(boolean z) {
        if (this.mStateChecker.validStateCall(3)) {
            ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.setLoopback(z);
            } else {
                this.mLogger.info("setLoopback, mPlayerBase = null!");
            }
            this.mPlayerInitParams.setLoopback(z);
            return;
        }
        throw new IllegalStateException("error , setLoopback , state invalid , current state :" + this.mPlayerState);
    }

    public void setOnAudioPcmOutputListener(ITPPlayerBaseListener.IOnAudioPcmOutListener iOnAudioPcmOutListener) {
        this.mPlayerListeners.setOnAudioPcmOutListener(iOnAudioPcmOutListener);
    }

    public void setOnAudioProcessOutputListener(ITPPlayerBaseListener.IOnAudioProcessOutListener iOnAudioProcessOutListener) {
        this.mPlayerListeners.setOnAudioProcessFrameListener(iOnAudioProcessOutListener);
    }

    public void setOnCompletionListener(ITPPlayerBaseListener.IOnCompletionListener iOnCompletionListener) {
        this.mPlayerListeners.setOnCompletionListener(iOnCompletionListener);
    }

    public void setOnDemuxerListener(ITPPlayerBaseListener.IOnDemuxerListener iOnDemuxerListener) {
        this.mPlayerListeners.setOnDemuxerListener(iOnDemuxerListener);
    }

    public void setOnDetailInfoListener(ITPPlayerBaseListener.IOnDetailInfoListener iOnDetailInfoListener) {
        this.mPlayerListeners.setOnDetailInfoListener(iOnDetailInfoListener);
    }

    public void setOnErrorListener(ITPPlayerBaseListener.IOnErrorListener iOnErrorListener) {
        this.mPlayerListeners.setOnErrorListener(iOnErrorListener);
    }

    public void setOnEventRecordListener(ITPPlayerBaseListener.IOnEventRecordListener iOnEventRecordListener) {
        this.mPlayerListeners.setOnEventRecordListener(iOnEventRecordListener);
    }

    public void setOnInfoListener(ITPPlayerBaseListener.IOnInfoListener iOnInfoListener) {
        this.mPlayerListeners.setOnInfoListener(iOnInfoListener);
    }

    public void setOnPlayerStateChangeListener(ITPPlayerBaseListener.IOnStateChangeListener iOnStateChangeListener) {
        this.mPlayerListeners.setOnStateChangeListener(iOnStateChangeListener);
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
        this.mPlayerListeners.setOnSubtitleFrameOutListener(iOnSubtitleFrameOutListener);
    }

    public void setOnVideoFrameOutListener(ITPPlayerBaseListener.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        this.mPlayerListeners.setOnVideoFrameOutListener(iOnVideoFrameOutListener);
    }

    public void setOnVideoProcessOutputListener(ITPPlayerBaseListener.IOnVideoProcessOutListener iOnVideoProcessOutListener) {
        this.mPlayerListeners.setOnVideoProcessFrameListener(iOnVideoProcessOutListener);
    }

    public void setOnVideoSizeChangedListener(ITPPlayerBaseListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
        this.mPlayerListeners.setOnVideoSizeChangedListener(iOnVideoSizeChangedListener);
    }

    public void setOutputMute(boolean z) {
        if (this.mStateChecker.validStateCall(3)) {
            ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.setOutputMute(z);
            } else {
                this.mLogger.info("setOutputMute, mPlayerBase = null!");
            }
            this.mPlayerInitParams.setOutputMute(z);
            return;
        }
        throw new IllegalStateException("error , setOutputMute , state invalid , current state :" + this.mPlayerState);
    }

    public void setPlaySharpenSwitch() {
        if (this.mStateChecker.validStateCall(3)) {
            ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.setPlaySharpenSwitch();
            } else {
                this.mLogger.info("setSharpenSwitch, mPlayerBase = null!");
            }
        } else {
            throw new IllegalStateException("error , setSharpenSwitch , state invalid , current state :" + this.mPlayerState);
        }
    }

    public void setPlaySpeedRatio(float f) {
        if (this.mStateChecker.validStateCall(3)) {
            ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.setPlaySpeedRatio(f);
            } else {
                this.mLogger.info("setPlaySpeedRatio, mPlayerBase = null!");
            }
            this.mPlayerInitParams.setSpeedRatio(f);
            ITPInnerRichMediaSynchronizer iTPInnerRichMediaSynchronizer = this.mRichMediaProcessor;
            if (iTPInnerRichMediaSynchronizer != null) {
                try {
                    iTPInnerRichMediaSynchronizer.setPlaybackRate(f);
                } catch (Exception unused) {
                    this.mLogger.warn("setPlaySpeedRatio, rich media processor setPlaySpeedRatio err.");
                }
            }
        } else {
            throw new IllegalStateException("error , setPlaySpeedRatio , state invalid , current state :" + this.mPlayerState);
        }
    }

    public void setPlayerOptionalParam(TPOptionalParam tPOptionalParam) {
        if (this.mStateChecker.validStateCall(3)) {
            ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.setPlayerOptionalParam(tPOptionalParam);
            }
            this.mPlayerInitParams.addOptionalParams(tPOptionalParam);
            return;
        }
        throw new IllegalStateException("setPlayerOptionalParam , state invalid");
    }

    public void setRichMediaSynchronizer(ITPRichMediaSynchronizer iTPRichMediaSynchronizer) {
        if (iTPRichMediaSynchronizer == null) {
            ITPInnerRichMediaSynchronizer iTPInnerRichMediaSynchronizer = this.mRichMediaProcessor;
            if (iTPInnerRichMediaSynchronizer != null) {
                iTPInnerRichMediaSynchronizer.setInnerListener((ITPInnerRichMediaSynchronizer.ITPRichMediaInnerSynchronizerListener) null);
            }
            this.mRichMediaProcessor = null;
        } else if (iTPRichMediaSynchronizer instanceof ITPInnerRichMediaSynchronizer) {
            ITPInnerRichMediaSynchronizer iTPInnerRichMediaSynchronizer2 = (ITPInnerRichMediaSynchronizer) iTPRichMediaSynchronizer;
            this.mRichMediaProcessor = iTPInnerRichMediaSynchronizer2;
            iTPInnerRichMediaSynchronizer2.setInnerListener(new ITPInnerRichMediaSynchronizer.ITPRichMediaInnerSynchronizerListener() {
                public long onGetCurrentPositionMs(ITPRichMediaSynchronizer iTPRichMediaSynchronizer) {
                    return TPPlayerAdapter.this.getCurrentPositionMs();
                }
            });
        }
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
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.setSurfaceHolder(surfaceHolder);
        }
        this.mPlayerInitParams.setSurfaceHolder(surfaceHolder);
    }

    public void setVideoInfo(TPVideoInfo tPVideoInfo) {
        if (!this.mStateChecker.validStateCall(2)) {
            this.mLogger.error("setVideoInfo state invalid");
        }
        if (tPVideoInfo != null) {
            this.mTPPlaybackInfo.setHeight(tPVideoInfo.getHeight());
            this.mTPPlaybackInfo.setWidth(tPVideoInfo.getWidth());
            this.mTPPlaybackInfo.setDefinition(tPVideoInfo.getDefinition());
            this.mTPPlaybackInfo.setVideoCodedId(tPVideoInfo.getVideoCodecId());
        }
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
        } else {
            throw new IllegalStateException("error , start , state invalid , current state :" + this.mPlayerState);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        throw new java.lang.IllegalStateException("error , stop ,state invalid");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r3.mPlayerState.changeState(9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0023 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void stop() {
        /*
            r3 = this;
            com.tencent.thumbplayer.adapter.TPPlayerStateStrategy r0 = r3.mStateChecker
            r1 = 7
            boolean r0 = r0.validStateCall(r1)
            if (r0 == 0) goto L_0x0039
            com.tencent.thumbplayer.adapter.player.ITPPlayerBase r0 = r3.mPlayerBase
            if (r0 == 0) goto L_0x0031
            r0 = 9
            com.tencent.thumbplayer.api.TPPlayerState r1 = r3.mPlayerState     // Catch:{ IllegalStateException -> 0x0023 }
            r2 = 8
            r1.changeState(r2)     // Catch:{ IllegalStateException -> 0x0023 }
            com.tencent.thumbplayer.adapter.player.ITPPlayerBase r1 = r3.mPlayerBase     // Catch:{ IllegalStateException -> 0x0023 }
            r1.stop()     // Catch:{ IllegalStateException -> 0x0023 }
            com.tencent.thumbplayer.api.TPPlayerState r1 = r3.mPlayerState
            r1.changeState(r0)
            return
        L_0x0021:
            r1 = move-exception
            goto L_0x002b
        L_0x0023:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0021 }
            java.lang.String r2 = "error , stop ,state invalid"
            r1.<init>(r2)     // Catch:{ all -> 0x0021 }
            throw r1     // Catch:{ all -> 0x0021 }
        L_0x002b:
            com.tencent.thumbplayer.api.TPPlayerState r2 = r3.mPlayerState
            r2.changeState(r0)
            throw r1
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "error , stop , player is null"
            r0.<init>(r1)
            throw r0
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "error , stop , state invalid , current state :"
            r1.append(r2)
            com.tencent.thumbplayer.api.TPPlayerState r2 = r3.mPlayerState
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.adapter.TPPlayerAdapter.stop():void");
    }

    public void switchDefinition(TPUrlDataSource tPUrlDataSource, int i, long j) {
        String str;
        if (this.mStateChecker.validStateCall(17)) {
            this.mPlayerInitParams.setDataSource(tPUrlDataSource, (Map<String, String>) null);
            if (this.mPlayerBase != null) {
                int i2 = this.mPlayerType;
                if (i2 == 2) {
                    str = tPUrlDataSource.getSelfPlayerUrl();
                } else {
                    str = i2 == 1 ? tPUrlDataSource.getSystemPlayerUrl() : "";
                }
                this.mPlayerBase.switchDefinition(str, i, j);
                return;
            }
            this.mLogger.warn("switchDefinition, mPlayerBase = null!");
            return;
        }
        throw new IllegalStateException("error , switch definition , state invalid , current state :" + this.mPlayerState);
    }

    public void switchDefinition(String str, @TPCommonEnum.TPSwitchDefMode int i, long j) {
    }

    public void switchDefinition(String str, Map<String, String> map, int i, long j) {
    }

    public void updateLoggerContext(TPLoggerContext tPLoggerContext) {
        this.mTPLoggerContext.update(tPLoggerContext, TAG);
        this.mLogger.updateContext(this.mTPLoggerContext);
        this.mPlayerListeners.updateTag(this.mTPLoggerContext.getTag());
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            iTPPlayerBase.updateLoggerContext(this.mTPLoggerContext);
        }
    }

    public void updateVideoInfo(TPVideoInfo tPVideoInfo) {
        if (!this.mStateChecker.validStateCall(3)) {
            this.mLogger.error("updateVideoInfo state invalid");
        }
        if (tPVideoInfo != null) {
            this.mTPPlaybackInfo.setHeight(tPVideoInfo.getHeight());
            this.mTPPlaybackInfo.setWidth(tPVideoInfo.getWidth());
            this.mTPPlaybackInfo.setDefinition(tPVideoInfo.getDefinition());
            this.mTPPlaybackInfo.setVideoCodedId(tPVideoInfo.getVideoCodecId());
        }
    }

    private void reopenPlayer(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        if (i4 == 1) {
            this.mPlayerListeners.onInfo(1013, (long) i3, 0, (Object) null);
        } else {
            this.mPlayerListeners.onInfo(200, 0, 0, (Object) null);
        }
        this.mReopenType = i4;
        TPPlayerState tPPlayerState = this.mPlayerState;
        tPPlayerState.setLastState(tPPlayerState.state());
        ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase != null) {
            long currentPositionMs = iTPPlayerBase.getCurrentPositionMs();
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.info("switchPlayer, current position:" + currentPositionMs);
            this.mTPPlaybackInfo.setCurrentPositionMs(currentPositionMs);
            this.mTPPlaybackInfo.setPlayableDurationMs(this.mPlayerBase.getPlayableDurationMs());
            this.mPlayerBase.reset();
            this.mPlayerBase.release();
        }
        ITPPlayerBase createPlayerBase = createPlayerBase(i3, this.mTPLoggerContext);
        this.mPlayerBase = createPlayerBase;
        if (createPlayerBase != null) {
            this.mIsReopening = true;
            TPBaseLogger tPBaseLogger2 = this.mLogger;
            tPBaseLogger2.info("switch player to type:" + this.mPlayerType);
            if (this.mTPPlaybackInfo != null) {
                this.mPlayerBase.setPlayerOptionalParam(new TPOptionalParam().buildLong(100, this.mTPPlaybackInfo.getCurrentPositionMs()));
            }
            this.mPlayerState.setInnerPlayStateState(3);
            this.mPlayerBase.prepareAsync();
            return;
        }
        throw new RuntimeException("error , create player failed");
    }

    public void addAudioTrackSource(String str, Map<String, String> map, String str2, List<TPOptionalParam> list) {
        if (this.mStateChecker.validStateCall(3)) {
            ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.addAudioTrackSource(str, map, str2, list);
            }
            this.mPlayerInitParams.addAudioTrackSource(str, map, str2, list);
            return;
        }
        throw new IllegalStateException("error : addAudioTrackSource, state invalid");
    }

    public void addSubtitleSource(String str, Map<String, String> map, String str2, String str3) {
        if (this.mStateChecker.validStateCall(3)) {
            ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.addSubtitleSource(str, map, str2, str3);
            }
            this.mPlayerInitParams.addSubtitleSource(str, map, str2, str3);
            return;
        }
        throw new IllegalStateException("error : addSubtitleSource, state invalid");
    }

    public void setDataSource(TPUrlDataSource tPUrlDataSource, Map<String, String> map) {
        if (this.mStateChecker.validStateCall(2)) {
            this.mPlayerInitParams.setDataSource(tPUrlDataSource, map);
            this.mPlayerState.changeState(2);
            return;
        }
        throw new IllegalStateException("error : setDataSource , state invalid");
    }

    public void setDataSource(ParcelFileDescriptor parcelFileDescriptor) {
        if (!this.mStateChecker.validStateCall(2)) {
            throw new IllegalStateException("error : setDataSource , state invalid");
        } else if (parcelFileDescriptor != null) {
            this.mPlayerInitParams.setDataSource(parcelFileDescriptor);
            this.mPlayerState.changeState(2);
        } else {
            throw new IllegalArgumentException("error : setDataSource , pfd invalid");
        }
    }

    public void setLoopback(boolean z, long j, long j2) {
        if (this.mStateChecker.validStateCall(3)) {
            ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.setLoopback(z, j, j2);
            } else {
                this.mLogger.info("setLoopback, mPlayerBase = null!");
            }
            this.mPlayerInitParams.setLoopback(z, j, j2);
            return;
        }
        throw new IllegalStateException("error , setLoopback , state invalid , current state :" + this.mPlayerState);
    }

    public void switchDefinition(TPUrlDataSource tPUrlDataSource, Map<String, String> map, int i, long j) {
        String str;
        if (this.mStateChecker.validStateCall(17)) {
            this.mPlayerInitParams.setDataSource(tPUrlDataSource, map);
            if (this.mPlayerBase != null) {
                int i2 = this.mPlayerType;
                if (i2 == 2) {
                    str = tPUrlDataSource.getSelfPlayerUrl();
                } else {
                    str = i2 == 1 ? tPUrlDataSource.getSystemPlayerUrl() : "";
                }
                this.mPlayerBase.switchDefinition(str, map, i, j);
                return;
            }
            this.mLogger.warn("switchDefinition, mPlayerBase = null!");
            return;
        }
        throw new IllegalStateException("error , switch definition , state invalid , current state :" + this.mPlayerState);
    }

    public void seekTo(int i, @TPCommonEnum.TPSeekMode int i2) {
        if (!this.mStateChecker.validStateCall(9)) {
            throw new IllegalStateException("error , seek to , state invalid , current state :" + this.mPlayerState);
        } else if (this.mPlayerBase != null) {
            if (this.mPlayerState.state() == 7) {
                this.mPlayerState.changeState(5);
            }
            this.mPlayerBase.seekTo(i, i2);
            ITPInnerRichMediaSynchronizer iTPInnerRichMediaSynchronizer = this.mRichMediaProcessor;
            if (iTPInnerRichMediaSynchronizer != null) {
                try {
                    iTPInnerRichMediaSynchronizer.seek((long) i);
                } catch (Exception unused) {
                    this.mLogger.warn("seekTo, rich media processor seek err.");
                }
            }
        } else {
            this.mLogger.warn("seekTo, mPlayerBase = null!");
        }
    }

    public void setDataSource(AssetFileDescriptor assetFileDescriptor) {
        if (!this.mStateChecker.validStateCall(2)) {
            throw new IllegalStateException("error : setDataSource , state invalid");
        } else if (assetFileDescriptor != null) {
            this.mPlayerInitParams.setDataSource(assetFileDescriptor);
            this.mPlayerState.changeState(2);
        } else {
            throw new IllegalArgumentException("error : setDataSource , afd invalid");
        }
    }

    public void setDataSource(ITPMediaAsset iTPMediaAsset) {
        if (!this.mStateChecker.validStateCall(2)) {
            throw new IllegalStateException("error : setDataSource , state invalid");
        } else if (iTPMediaAsset != null) {
            this.mPlayerInitParams.setDataSource(iTPMediaAsset);
            this.mPlayerState.changeState(2);
        } else {
            throw new IllegalArgumentException("error : setDataSource , mediaAsset invalid");
        }
    }

    public void switchDefinition(ITPMediaAsset iTPMediaAsset, @TPCommonEnum.TPSwitchDefMode int i, long j) {
        if (this.mStateChecker.validStateCall(17)) {
            this.mPlayerInitParams.setDataSource(iTPMediaAsset);
            ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
            if (iTPPlayerBase != null) {
                iTPPlayerBase.switchDefinition(iTPMediaAsset, i, j);
            } else {
                this.mLogger.warn("switchDefinition, mPlayerBase = null!");
            }
        } else {
            throw new IllegalStateException("error , switch definition , state invalid , current state :" + this.mPlayerState);
        }
    }
}
