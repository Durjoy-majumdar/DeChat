package com.tencent.thumbplayer.adapter.player.systemplayer;

import android.text.TextUtils;
import com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle;
import com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils;
import com.tencent.thumbplayer.api.TPSubtitleRenderModel;
import com.tencent.thumbplayer.core.common.TPMediaTrackInfo;
import com.tencent.thumbplayer.core.common.TPSubtitleFrame;
import com.tencent.thumbplayer.core.subtitle.ITPSubtitleParserCallback;
import com.tencent.thumbplayer.core.subtitle.TPNativeSubtitleRenderParams;
import com.tencent.thumbplayer.core.subtitle.TPSubtitleParser;
import com.tencent.thumbplayer.utils.TPLogUtil;
import com.tencent.thumbplayer.utils.TPThreadPool;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TPSysPlayerExternalSubtitle implements ITPSysPlayerExternalSubtitle {
    private static final int SUB_POLL_INTV_MS = 200;
    private static final String TAG = "TPSysPlayerExternalSubtitle";
    private String mLastSubText;
    public TPNativeSubtitleRenderParams mNativeSubtitleRenderParams;
    /* access modifiers changed from: private */
    public ITPSysPlayerExternalSubtitle.IPlayPositionListener mPlayPosLis;
    private SubtitleState mState = SubtitleState.IDLE;
    /* access modifiers changed from: private */
    public ITPSysPlayerExternalSubtitle.IOnSubTitleListener mSubLis;
    private Future<?> mSubPoll = null;
    private final Object mSubPollLock = new Object();
    /* access modifiers changed from: private */
    public ITPSysPlayerExternalSubtitle.IOnSubtitleErrorListener mSubtitleErrorLis;
    public int mSubtitleType = 0;
    private TPSubtitleParser mTpSubParser;
    /* access modifiers changed from: private */
    public ITPSysPlayerExternalSubtitle.IOnTrackSelectListener mTrackSelectLis;

    public enum SubtitleState {
        IDLE,
        INITED,
        PREPARED,
        STOPED,
        ERROR
    }

    /* access modifiers changed from: private */
    public void handleSubtitleLoadResult(long j) {
        if (this.mState != SubtitleState.INITED) {
            TPLogUtil.m21894e(TAG, "prepare, illegalState, state:" + this.mState);
            return;
        }
        TPMediaTrackInfo[] trackInfo = this.mTpSubParser.getTrackInfo();
        if (trackInfo == null || trackInfo.length <= 0) {
            TPLogUtil.m21899w(TAG, "prepare, err, trackInfos is empty.");
            this.mState = SubtitleState.ERROR;
        } else if (trackInfo[0].trackType != 3) {
            this.mState = SubtitleState.ERROR;
            TPLogUtil.m21899w(TAG, "prepare, err, track type not match.");
        } else {
            this.mTpSubParser.selectTrackAsync(0, j);
            this.mState = SubtitleState.PREPARED;
            if (this.mSubtitleType == 0) {
                synchronized (this.mSubPollLock) {
                    Future<?> future = this.mSubPoll;
                    if (future != null) {
                        future.cancel(true);
                        this.mSubPoll = null;
                    }
                    this.mSubPoll = TPThreadPool.getInstance().obtainScheduledExecutorService().scheduleAtFixedRate(new Runnable() {
                        public void run() {
                            TPSysPlayerExternalSubtitle.this.subPollFunc(0);
                        }
                    }, 0, 200, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void subPollFunc(int i) {
        ITPSysPlayerExternalSubtitle.IPlayPositionListener iPlayPositionListener = this.mPlayPosLis;
        ITPSysPlayerExternalSubtitle.IOnSubTitleListener iOnSubTitleListener = this.mSubLis;
        if (iPlayPositionListener == null || iOnSubTitleListener == null) {
            TPLogUtil.m21899w(TAG, "subPollFunc, posLis:" + iPlayPositionListener + ", subLis:" + iOnSubTitleListener);
            return;
        }
        long currentPosition = iPlayPositionListener.getCurrentPosition();
        if (currentPosition < 0) {
            TPLogUtil.m21899w(TAG, "subPollFunc, cur position:" + currentPosition);
            return;
        }
        String subtitleText = this.mTpSubParser.getSubtitleText(currentPosition, i);
        if (!TextUtils.equals(this.mLastSubText, subtitleText)) {
            this.mLastSubText = subtitleText;
            iOnSubTitleListener.onSubtitleInfo(new ITPSysPlayerExternalSubtitle.SubtitleData(subtitleText));
        }
    }

    public void pauseAsync() {
        if (this.mState != SubtitleState.PREPARED) {
            TPLogUtil.m21894e(TAG, "pauseAsync, illegalState, state:" + this.mState);
            return;
        }
        TPLogUtil.m21897i(TAG, "pauseAsync");
        this.mTpSubParser.pauseAsync();
    }

    public void prepare() {
        if (this.mState != SubtitleState.INITED) {
            TPLogUtil.m21894e(TAG, "prepare, illegalState, state:" + this.mState);
            return;
        }
        TPLogUtil.m21897i(TAG, "prepare.");
        this.mTpSubParser.init();
        this.mTpSubParser.loadAsync();
        TPNativeSubtitleRenderParams tPNativeSubtitleRenderParams = this.mNativeSubtitleRenderParams;
        if (tPNativeSubtitleRenderParams != null) {
            this.mTpSubParser.setRenderParams(tPNativeSubtitleRenderParams);
        }
    }

    public void release() {
        TPLogUtil.m21897i(TAG, "release.");
        this.mPlayPosLis = null;
        this.mSubLis = null;
    }

    public void reset() {
        TPLogUtil.m21897i(TAG, "reset.");
        if (this.mState != SubtitleState.IDLE) {
            TPSubtitleParser tPSubtitleParser = this.mTpSubParser;
            if (tPSubtitleParser != null) {
                try {
                    tPSubtitleParser.stop();
                    this.mTpSubParser.unInit();
                } catch (Exception e) {
                    TPLogUtil.m21895e(TAG, (Throwable) e);
                }
            }
            this.mTpSubParser = null;
        }
        synchronized (this.mSubPollLock) {
            Future<?> future = this.mSubPoll;
            if (future != null) {
                future.cancel(true);
                this.mSubPoll = null;
            }
        }
        this.mState = SubtitleState.IDLE;
    }

    public void setDataSource(String str, long j) {
        setDataSource(str, (Map<String, String>) null, j);
    }

    public void setOnSubTitleListener(ITPSysPlayerExternalSubtitle.IOnSubTitleListener iOnSubTitleListener) {
        this.mSubLis = iOnSubTitleListener;
    }

    public void setPlayerPositionListener(ITPSysPlayerExternalSubtitle.IPlayPositionListener iPlayPositionListener) {
        this.mPlayPosLis = iPlayPositionListener;
    }

    public void setSubtitleErrorListener(ITPSysPlayerExternalSubtitle.IOnSubtitleErrorListener iOnSubtitleErrorListener) {
        this.mSubtitleErrorLis = iOnSubtitleErrorListener;
    }

    public void setSubtitleRenderModel(TPSubtitleRenderModel tPSubtitleRenderModel) {
        TPNativeSubtitleRenderParams convert2TPNativeSubtitleRenderParams = TPThumbPlayerUtils.convert2TPNativeSubtitleRenderParams(tPSubtitleRenderModel);
        this.mNativeSubtitleRenderParams = convert2TPNativeSubtitleRenderParams;
        TPSubtitleParser tPSubtitleParser = this.mTpSubParser;
        if (tPSubtitleParser != null) {
            tPSubtitleParser.setRenderParams(convert2TPNativeSubtitleRenderParams);
        }
    }

    public void setSubtitleType(int i) {
        this.mSubtitleType = i;
    }

    public void setTrackSelectListener(ITPSysPlayerExternalSubtitle.IOnTrackSelectListener iOnTrackSelectListener) {
        this.mTrackSelectLis = iOnTrackSelectListener;
    }

    public void startAsync() {
        if (this.mState != SubtitleState.PREPARED) {
            TPLogUtil.m21894e(TAG, "startAsync, illegalState, state:" + this.mState);
            return;
        }
        TPLogUtil.m21897i(TAG, "startAsync");
        this.mTpSubParser.startAsync();
    }

    public void stop() {
        TPLogUtil.m21897i(TAG, "stop.");
        SubtitleState subtitleState = this.mState;
        if (subtitleState == SubtitleState.INITED || subtitleState == SubtitleState.PREPARED || subtitleState == SubtitleState.ERROR) {
            TPSubtitleParser tPSubtitleParser = this.mTpSubParser;
            if (tPSubtitleParser != null) {
                try {
                    tPSubtitleParser.stop();
                    this.mTpSubParser.unInit();
                } catch (Exception e) {
                    TPLogUtil.m21895e(TAG, (Throwable) e);
                }
            }
            this.mTpSubParser = null;
        }
        if (this.mSubtitleType == 0) {
            synchronized (this.mSubPollLock) {
                Future<?> future = this.mSubPoll;
                if (future != null) {
                    future.cancel(true);
                    this.mSubPoll = null;
                }
            }
        }
        this.mState = SubtitleState.STOPED;
    }

    public void setDataSource(String str, Map<String, String> map, final long j) {
        if (this.mState != SubtitleState.IDLE) {
            TPLogUtil.m21894e(TAG, "setDataSource, illegalState, state:" + this.mState);
        } else if (TextUtils.isEmpty(str)) {
            TPLogUtil.m21894e(TAG, "setDataSource, illegal argument, url:" + str);
        } else {
            TPLogUtil.m21897i(TAG, "setDataSource, url: " + str);
            if (this.mTpSubParser != null) {
                TPLogUtil.m21899w(TAG, "setDataSource, mTpSubParser != null.");
                try {
                    this.mTpSubParser.stop();
                    this.mTpSubParser.unInit();
                } catch (Exception unused) {
                }
                this.mTpSubParser = null;
            }
            this.mTpSubParser = new TPSubtitleParser(str, map, new ITPSubtitleParserCallback() {
                public long onGetCurrentPlayPositionMs() {
                    if (TPSysPlayerExternalSubtitle.this.mPlayPosLis != null) {
                        return TPSysPlayerExternalSubtitle.this.mPlayPosLis.getCurrentPosition();
                    }
                    return 0;
                }

                public void onLoadResult(int i) {
                    TPLogUtil.m21897i(TPSysPlayerExternalSubtitle.TAG, "onLoadResult, index:" + i);
                    TPSysPlayerExternalSubtitle.this.handleSubtitleLoadResult(j);
                }

                public void onSelectResult(int i, long j) {
                    TPLogUtil.m21897i(TPSysPlayerExternalSubtitle.TAG, "onSelectResult, errCode:" + i + ", selectOpaque:" + j + ", opaque =" + j);
                    if (i == 0 && TPSysPlayerExternalSubtitle.this.mTrackSelectLis != null) {
                        TPSysPlayerExternalSubtitle.this.mTrackSelectLis.onTrackSelectSuccess(j);
                    } else if (i != 0 && TPSysPlayerExternalSubtitle.this.mTrackSelectLis != null) {
                        TPSysPlayerExternalSubtitle.this.mTrackSelectLis.onTrackSelectFailure(i, j);
                    }
                }

                public void onSubtitleError(int i, int i2) {
                    TPLogUtil.m21897i(TPSysPlayerExternalSubtitle.TAG, "onSubtitleError, index:" + i + ", errorCode:" + i2);
                    TPSysPlayerExternalSubtitle.this.mSubtitleErrorLis.onSubtitleError(i, i2);
                }

                public void onSubtitleFrame(TPSubtitleFrame tPSubtitleFrame) {
                    TPLogUtil.m21897i(TPSysPlayerExternalSubtitle.TAG, "onSubtitleFrame");
                    if (TPSysPlayerExternalSubtitle.this.mSubLis != null) {
                        TPSysPlayerExternalSubtitle.this.mSubLis.onSubtitleFrameData(tPSubtitleFrame);
                    }
                }

                public void onSubtitleNote(String str) {
                    TPLogUtil.m21897i(TPSysPlayerExternalSubtitle.TAG, "onSubtitleNote");
                    if (TPSysPlayerExternalSubtitle.this.mSubLis != null) {
                        TPSysPlayerExternalSubtitle.this.mSubLis.onSubtitleNote(str);
                    }
                }
            }, this.mSubtitleType);
            this.mState = SubtitleState.INITED;
        }
    }
}
