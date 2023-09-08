package com.tencent.thumbplayer.adapter.player.systemplayer;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.media.TimedText;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.tav.core.ExportErrorStatus;
import com.tencent.thumbplayer.adapter.player.ITPPlayerBase;
import com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener;
import com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle;
import com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils;
import com.tencent.thumbplayer.api.TPAudioAttributes;
import com.tencent.thumbplayer.api.TPCaptureCallBack;
import com.tencent.thumbplayer.api.TPCaptureParams;
import com.tencent.thumbplayer.api.TPCommonEnum;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.thumbplayer.api.TPPlayerMsg;
import com.tencent.thumbplayer.api.TPProgramInfo;
import com.tencent.thumbplayer.api.TPSubtitleData;
import com.tencent.thumbplayer.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.api.TPSubtitleRenderModel;
import com.tencent.thumbplayer.api.TPTrackInfo;
import com.tencent.thumbplayer.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.caputure.TPSystemCapture;
import com.tencent.thumbplayer.core.common.TPGeneralError;
import com.tencent.thumbplayer.core.common.TPSubtitleFrame;
import com.tencent.thumbplayer.core.imagegenerator.TPImageGeneratorParams;
import com.tencent.thumbplayer.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.log.TPBaseLogger;
import com.tencent.thumbplayer.log.TPLoggerContext;
import com.tencent.thumbplayer.utils.TPLogUtil;
import com.tencent.thumbplayer.utils.TPThreadPool;
import java.io.FileDescriptor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TPSystemMediaPlayer implements ITPPlayerBase {
    private static final int RESET_TYPE_SEL_AUDIO_TRACK = 2;
    private static final int RESET_TYPE_SWITCH_URL = 1;
    private static final String TAG = "TPSystemMediaPlayer";
    private static final int TP_SYSTEM_PLAYER_INNER_RESTORE_STATE_ERR = -10004;
    private static final int TP_SYSTEM_PLAYER_INNER_SEL_TRACK_EXCEPTION = -10000;
    private static final int TP_SYSTEM_PLAYER_INNER_SEL_TRACK_NOT_SUPPORT = -10001;
    private static final int TP_SYSTEM_PLAYER_INNER_TRACK_INDEX_ERR = -10002;
    private static final int TP_SYSTEM_PLAYER_INNER_TRACK_TYPE_NOT_SUPPORT = -10003;
    private static final int mIntervalCheckBuffering = 400;
    private AssetFileDescriptor mAssetFd;
    private TPAudioAttributes mAttributes = null;
    private float mAudioGain = 1.0f;
    private List<ExternalTrackInfo> mAudioTrackInfo = new ArrayList();
    private long mBaseDuration = 0;
    private BufferCheck mBufferCheck;
    private long mCgiDuration = -1;
    /* access modifiers changed from: private */
    public int mCgiVideoHeight = -1;
    /* access modifiers changed from: private */
    public int mCgiVideoWidth = -1;
    private int mCheckBufferFrequent = 3;
    private Future<?> mCheckBufferTimeOutBySystemInfoTimer = null;
    private final Object mCheckBufferTimerOutByInfoLock = new Object();
    private int mCheckBufferTimeroutFrequent = 30;
    private final Object mCheckBuffingTimerLock = new Object();
    private final Object mCheckPrepareTimeoutLock = new Object();
    private Future<?> mCheckPrepareTimeoutTask = null;
    private Context mContext;
    private int mCurAudioTrackIndex = 0;
    private int mCurInnerAudioTrackIndex = -1;
    private int mCurSubTrackIndex = -1;
    /* access modifiers changed from: private */
    public ITPSysPlayerExternalSubtitle mExtSub;
    private FileDescriptor mFd;
    private Map<String, String> mHeader;
    private InnerPlayerListener mInnerPlayerListener;
    private long mIntervalCheckPreparingTimeOut = 25000;
    private boolean mIsAllowCheckBuffingByPosition = true;
    /* access modifiers changed from: private */
    public volatile boolean mIsBuffering = false;
    /* access modifiers changed from: private */
    public boolean mIsLive = false;
    private boolean mIsLoopback = false;
    /* access modifiers changed from: private */
    public boolean mIsNotSeekable = false;
    private long mLastCheckPos = -1;
    private ResetActionInfo mLastestAction = null;
    /* access modifiers changed from: private */
    public TPBaseLogger mLogger;
    private long mLoopEndPositionMs = 0;
    private long mLoopStartPositionMs = 0;
    /* access modifiers changed from: private */
    public volatile MediaPlayer mMediaPlayer;
    /* access modifiers changed from: private */
    public volatile PlayerState mMediaPlayerState;
    private boolean mMute = false;
    /* access modifiers changed from: private */
    public ITPPlayerBaseListener.IOnCompletionListener mOnCompletionListener;
    /* access modifiers changed from: private */
    public ITPPlayerBaseListener.IOnErrorListener mOnErrorListener;
    /* access modifiers changed from: private */
    public ITPPlayerBaseListener.IOnInfoListener mOnInfoListener;
    private ITPPlayerBaseListener.IOnPreparedListener mOnPreparedListener;
    /* access modifiers changed from: private */
    public ITPPlayerBaseListener.IOnSeekCompleteListener mOnSeekCompleteListener;
    /* access modifiers changed from: private */
    public ITPPlayerBaseListener.IOnSubtitleDataListener mOnSubtitleDataListener;
    /* access modifiers changed from: private */
    public ITPPlayerBaseListener.IOnSubtitleFrameOutListener mOnSubtitleFrameOutListener;
    private MediaPlayer.OnTimedTextListener mOnTimedTextListener = new MediaPlayer.OnTimedTextListener() {
        public void onTimedText(MediaPlayer mediaPlayer, TimedText timedText) {
            if (TPSystemMediaPlayer.this.mOnSubtitleDataListener != null) {
                TPSubtitleData tPSubtitleData = new TPSubtitleData();
                tPSubtitleData.subtitleData = timedText != null ? timedText.getText() : "";
                tPSubtitleData.trackIndex = (long) TPSystemMediaPlayer.this.mSelectSubtitleIndex;
                tPSubtitleData.startPositionMs = TPSystemMediaPlayer.this.getCurrentPositionMs();
                TPSystemMediaPlayer.this.mOnSubtitleDataListener.onSubtitleData(tPSubtitleData);
            }
        }
    };
    /* access modifiers changed from: private */
    public ITPPlayerBaseListener.IOnVideoSizeChangedListener mOnVideoSizeChangedListener;
    private float mPlaySpeed = 1.0f;
    private long mPosChangeCount = 0;
    /* access modifiers changed from: private */
    public int mSelectSubtitleIndex = -1;
    private long mSkipEndPositionMs = -1;
    /* access modifiers changed from: private */
    public int mStartPositionMs = 0;
    /* access modifiers changed from: private */
    public volatile PlayerState mState;
    private List<ExternalTrackInfo> mSubTrackInfo = new ArrayList();
    private Object mSurfaceObj;
    private boolean mSuspend = false;
    private TPSystemCapture mTpSystemCapture;
    private String mUrl;
    /* access modifiers changed from: private */
    public int mVideoHeight = 0;
    /* access modifiers changed from: private */
    public int mVideoWidth = 0;
    private int mcheckBufferPosNoChangeCount = 0;

    public static class BufferCheck {
        public boolean mCheckAbort;
        public Future<?> mCheckBuffingTimer;

        private BufferCheck() {
        }
    }

    public static class ExternalTrackInfo {
        public Map<String, String> httpHeader;
        public TPTrackInfo info;
        public List<TPOptionalParam> paramData;
        public String url;

        private ExternalTrackInfo() {
            this.url = "";
        }
    }

    public class InnerPlayerListener implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener, MediaPlayer.OnBufferingUpdateListener {
        private InnerPlayerListener() {
        }

        private int heightToCgiHeight(int i) {
            return TPSystemMediaPlayer.this.mCgiVideoHeight > 0 ? TPSystemMediaPlayer.this.mCgiVideoHeight : i;
        }

        private int widthToCgiWidth(int i) {
            return TPSystemMediaPlayer.this.mCgiVideoWidth > 0 ? TPSystemMediaPlayer.this.mCgiVideoWidth : i;
        }

        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            if (TPSystemMediaPlayer.this.mIsLive) {
                TPSystemMediaPlayer.this.mLogger.warn("onCompletion, unknown err.");
                return;
            }
            TPSystemMediaPlayer.this.mLogger.info("onCompletion.");
            PlayerState unused = TPSystemMediaPlayer.this.mMediaPlayerState = PlayerState.COMPLETE;
            TPSystemMediaPlayer.this.destroyCheckBuffingTimer();
            ITPPlayerBaseListener.IOnCompletionListener access$2400 = TPSystemMediaPlayer.this.mOnCompletionListener;
            if (access$2400 != null) {
                access$2400.onCompletion();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x007c, code lost:
            if (r12 == 100) goto L_0x007f;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0091  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onError(android.media.MediaPlayer r11, int r12, int r13) {
            /*
                r10 = this;
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r11 = r11.mState
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r0 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.COMPLETE
                r1 = 1
                if (r11 == r0) goto L_0x009c
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r11 = r11.mState
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r0 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.STOPPED
                if (r11 == r0) goto L_0x009c
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r11 = r11.mState
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r0 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.RELEASE
                if (r11 == r0) goto L_0x009c
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r11 = r11.mState
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r0 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.IDLE
                if (r11 == r0) goto L_0x009c
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r11 = r11.mState
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r0 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.ERROR
                if (r11 != r0) goto L_0x0034
                goto L_0x009c
            L_0x0034:
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                com.tencent.thumbplayer.log.TPBaseLogger r11 = r11.mLogger
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "onError, what: "
                r2.append(r3)
                r2.append(r12)
                java.lang.String r3 = ", extra: "
                r2.append(r3)
                r2.append(r13)
                java.lang.String r2 = r2.toString()
                r11.info(r2)
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                r11.destroyCheckPrepareTimeoutTimer()
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                r11.destroyCheckBuffingTimer()
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState unused = r11.mState = r0
                r11 = -1010(0xfffffffffffffc0e, float:NaN)
                r0 = 2001(0x7d1, float:2.804E-42)
                r2 = 2000(0x7d0, float:2.803E-42)
                if (r13 == r11) goto L_0x0082
                r11 = -1007(0xfffffffffffffc11, float:NaN)
                if (r13 == r11) goto L_0x0082
                r11 = -110(0xffffffffffffff92, float:NaN)
                if (r13 == r11) goto L_0x007f
                switch(r13) {
                    case -1005: goto L_0x007f;
                    case -1004: goto L_0x007f;
                    case -1003: goto L_0x007f;
                    default: goto L_0x0078;
                }
            L_0x0078:
                if (r12 == r1) goto L_0x0082
                r11 = 100
                if (r12 == r11) goto L_0x007f
                goto L_0x0082
            L_0x007f:
                r4 = 2001(0x7d1, float:2.804E-42)
                goto L_0x0084
            L_0x0082:
                r4 = 2000(0x7d0, float:2.803E-42)
            L_0x0084:
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                r11.mediaPlayerStopAndRelease()
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener$IOnErrorListener r3 = r11.mOnErrorListener
                if (r3 == 0) goto L_0x009b
                int r5 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.formatErrorCode(r12)
                long r6 = (long) r13
                r8 = 0
                r3.onError(r4, r5, r6, r8)
            L_0x009b:
                return r1
            L_0x009c:
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                com.tencent.thumbplayer.log.TPBaseLogger r11 = r11.mLogger
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "onError, illegal state:"
                r0.append(r2)
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r2 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r2 = r2.mState
                r0.append(r2)
                java.lang.String r2 = ", what:"
                r0.append(r2)
                r0.append(r12)
                java.lang.String r12 = ", extra:"
                r0.append(r12)
                r0.append(r13)
                java.lang.String r12 = r0.toString()
                r11.info(r12)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.InnerPlayerListener.onError(android.media.MediaPlayer, int, int):boolean");
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            int i3;
            TPBaseLogger access$400 = TPSystemMediaPlayer.this.mLogger;
            access$400.info("mediaplayer, onInfo. what:" + i + ", extra:" + i2);
            if (i != 3) {
                if (i == 801) {
                    boolean unused = TPSystemMediaPlayer.this.mIsNotSeekable = true;
                } else if (i == 701) {
                    i3 = 200;
                } else if (i == 702) {
                    i3 = 201;
                }
                i3 = -1;
            } else {
                i3 = 106;
            }
            if (i3 != -1) {
                if (200 == i3 || 201 == i3) {
                    if (!TPSystemMediaPlayer.this.isAllowCheckBufferByPosition()) {
                        if (200 == i3) {
                            boolean unused2 = TPSystemMediaPlayer.this.mIsBuffering = true;
                            TPSystemMediaPlayer.this.startCheckBufferTimeOutByInfo();
                        } else {
                            boolean unused3 = TPSystemMediaPlayer.this.mIsBuffering = false;
                            TPSystemMediaPlayer.this.destroyCheckBufferTimeOutByInfo();
                        }
                        if (TPSystemMediaPlayer.this.mOnInfoListener != null) {
                            TPSystemMediaPlayer.this.mOnInfoListener.onInfo(i3, 0, 0, (Object) null);
                        }
                    }
                } else if (TPSystemMediaPlayer.this.mOnInfoListener != null) {
                    TPSystemMediaPlayer.this.mOnInfoListener.onInfo(i3, 0, 0, (Object) null);
                }
            }
            if (i3 == 106) {
                int widthToCgiWidth = widthToCgiWidth(mediaPlayer.getVideoWidth());
                int heightToCgiHeight = heightToCgiHeight(mediaPlayer.getVideoHeight());
                if (!(heightToCgiHeight == TPSystemMediaPlayer.this.mVideoHeight && widthToCgiWidth == TPSystemMediaPlayer.this.mVideoWidth) && heightToCgiHeight > 0 && widthToCgiWidth > 0) {
                    int unused4 = TPSystemMediaPlayer.this.mVideoHeight = heightToCgiHeight;
                    int unused5 = TPSystemMediaPlayer.this.mVideoWidth = widthToCgiWidth;
                    if (TPSystemMediaPlayer.this.mOnVideoSizeChangedListener != null) {
                        TPSystemMediaPlayer.this.mOnVideoSizeChangedListener.onVideoSizeChanged((long) TPSystemMediaPlayer.this.mVideoWidth, (long) TPSystemMediaPlayer.this.mVideoHeight);
                    }
                }
            }
            return true;
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            if (TPSystemMediaPlayer.this.mState != PlayerState.PREPARING) {
                TPBaseLogger access$400 = TPSystemMediaPlayer.this.mLogger;
                access$400.info("onPrepared() is called in a wrong situation, mState = " + TPSystemMediaPlayer.this.mState);
                return;
            }
            PlayerState unused = TPSystemMediaPlayer.this.mMediaPlayerState = PlayerState.PREPARED;
            long duration = (long) TPSystemMediaPlayer.this.mMediaPlayer.getDuration();
            if (duration <= 0) {
                boolean unused2 = TPSystemMediaPlayer.this.mIsNotSeekable = true;
            }
            TPBaseLogger access$4002 = TPSystemMediaPlayer.this.mLogger;
            access$4002.info("onPrepared() , mStartPositionMs=" + TPSystemMediaPlayer.this.mStartPositionMs + ", duration:" + duration + ", mIsLive:" + TPSystemMediaPlayer.this.mIsLive);
            TPSystemMediaPlayer.this.destroyCheckPrepareTimeoutTimer();
            TPSystemMediaPlayer.this.playerResetEnd();
        }

        public void onSeekComplete(MediaPlayer mediaPlayer) {
            if (TPSystemMediaPlayer.this.mMediaPlayer != null) {
                TPSystemMediaPlayer.this.mLogger.info("onSeekComplete().");
                PlayerState access$600 = TPSystemMediaPlayer.this.mState;
                PlayerState playerState = PlayerState.STARTED;
                if (access$600 == playerState && TPSystemMediaPlayer.this.mMediaPlayerState == PlayerState.COMPLETE) {
                    PlayerState unused = TPSystemMediaPlayer.this.mState = playerState;
                    PlayerState unused2 = TPSystemMediaPlayer.this.mMediaPlayerState = playerState;
                    TPSystemMediaPlayer.this.mMediaPlayer.start();
                }
                if (PlayerState.PREPARED != TPSystemMediaPlayer.this.mState && TPSystemMediaPlayer.this.mOnSeekCompleteListener != null) {
                    TPSystemMediaPlayer.this.mOnSeekCompleteListener.onSeekComplete();
                }
            }
        }

        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            if (i == 0 || i2 == 0) {
                TPBaseLogger access$400 = TPSystemMediaPlayer.this.mLogger;
                access$400.error("onVideoSizeChanged() size error, width:" + i + " height:" + i2);
                return;
            }
            int widthToCgiWidth = widthToCgiWidth(i);
            int heightToCgiHeight = heightToCgiHeight(i2);
            try {
                if (!(widthToCgiWidth == TPSystemMediaPlayer.this.mVideoWidth && heightToCgiHeight == TPSystemMediaPlayer.this.mVideoHeight) && heightToCgiHeight > 0 && widthToCgiWidth > 0) {
                    TPSystemMediaPlayer.this.mOnVideoSizeChangedListener.onVideoSizeChanged((long) widthToCgiWidth, (long) heightToCgiHeight);
                }
            } catch (Exception e) {
                TPSystemMediaPlayer.this.mLogger.warn(e.toString());
            }
            int unused = TPSystemMediaPlayer.this.mVideoWidth = widthToCgiWidth;
            int unused2 = TPSystemMediaPlayer.this.mVideoHeight = heightToCgiHeight;
            TPBaseLogger access$4002 = TPSystemMediaPlayer.this.mLogger;
            access$4002.info("onVideoSizeChanged(), width:" + widthToCgiWidth + " height:" + heightToCgiHeight);
        }
    }

    public enum PlayerState {
        IDLE,
        INITIALIZED,
        PREPARING,
        PREPARED,
        STARTED,
        PAUSED,
        STOPPED,
        COMPLETE,
        ERROR,
        RELEASE
    }

    public static class ResetActionInfo {
        public int externalAudioTrackIndex;
        public int innerAudioTrackIndex;
        public int innerSubtitleTrackIndex;
        public int mResetType;
        public long opaque;
        public long position;
        public PlayerState state;
        public String url;

        private ResetActionInfo() {
        }
    }

    public static class HookCallback implements Handler.Callback {
        private Handler impl;

        public HookCallback(Handler handler) {
            this.impl = handler;
        }

        public boolean handleMessage(Message message) {
            try {
                this.impl.handleMessage(message);
                return true;
            } catch (Exception e) {
                TPLogUtil.m21894e(TPSystemMediaPlayer.TAG, "mediaPlayerExceptionHook, HookCallback, " + Log.getStackTraceString(e));
                return true;
            }
        }
    }

    public TPSystemMediaPlayer(Context context, TPLoggerContext tPLoggerContext) {
        this.mLogger = new TPBaseLogger(tPLoggerContext, TAG);
        this.mContext = context;
        this.mInnerPlayerListener = new InnerPlayerListener();
        ExternalTrackInfo externalTrackInfo = new ExternalTrackInfo();
        TPTrackInfo tPTrackInfo = new TPTrackInfo();
        externalTrackInfo.info = tPTrackInfo;
        tPTrackInfo.isSelected = true;
        tPTrackInfo.name = "audio_1";
        this.mAudioTrackInfo.add(externalTrackInfo);
        initMediaPlayer();
        TPSysPlayerExternalSubtitle tPSysPlayerExternalSubtitle = new TPSysPlayerExternalSubtitle();
        this.mExtSub = tPSysPlayerExternalSubtitle;
        tPSysPlayerExternalSubtitle.setOnSubTitleListener(new ITPSysPlayerExternalSubtitle.IOnSubTitleListener() {
            public void onEventInfo() {
            }

            public void onSubtitleFrameData(TPSubtitleFrame tPSubtitleFrame) {
                TPSubtitleFrameBuffer convert2TPSubtitleFrameBuffer = TPThumbPlayerUtils.convert2TPSubtitleFrameBuffer(tPSubtitleFrame);
                ITPPlayerBaseListener.IOnSubtitleFrameOutListener access$300 = TPSystemMediaPlayer.this.mOnSubtitleFrameOutListener;
                if (access$300 != null) {
                    access$300.onSubtitleFrameOut(convert2TPSubtitleFrameBuffer);
                }
            }

            public void onSubtitleInfo(ITPSysPlayerExternalSubtitle.SubtitleData subtitleData) {
                TPSubtitleData tPSubtitleData = new TPSubtitleData();
                tPSubtitleData.subtitleData = subtitleData.text;
                ITPPlayerBaseListener.IOnSubtitleDataListener access$200 = TPSystemMediaPlayer.this.mOnSubtitleDataListener;
                if (access$200 != null) {
                    access$200.onSubtitleData(tPSubtitleData);
                }
            }

            public void onSubtitleNote(String str) {
                TPBaseLogger access$400 = TPSystemMediaPlayer.this.mLogger;
                access$400.info("onSubtitleNote, " + str);
                ITPPlayerBaseListener.IOnInfoListener access$500 = TPSystemMediaPlayer.this.mOnInfoListener;
                if (access$500 != null) {
                    access$500.onInfo(506, 0, 0, str);
                }
            }
        });
        this.mExtSub.setPlayerPositionListener(new ITPSysPlayerExternalSubtitle.IPlayPositionListener() {
            public long getCurrentPosition() {
                if (TPSystemMediaPlayer.this.mState == PlayerState.PAUSED || TPSystemMediaPlayer.this.mState == PlayerState.STARTED) {
                    return TPSystemMediaPlayer.this.getCurrentPositionMs();
                }
                return -1;
            }
        });
        this.mExtSub.setTrackSelectListener(new ITPSysPlayerExternalSubtitle.IOnTrackSelectListener() {
            public void onTrackSelectFailure(int i, long j) {
                if (TPSystemMediaPlayer.this.mOnInfoListener != null) {
                    TPSystemMediaPlayer.this.mOnInfoListener.onInfo(4, 2000, (long) TPSystemMediaPlayer.formatErrorCode(i), Long.valueOf(j));
                }
            }

            public void onTrackSelectSuccess(long j) {
                if (TPSystemMediaPlayer.this.mState == PlayerState.STARTED) {
                    TPSystemMediaPlayer.this.mExtSub.startAsync();
                }
                if (TPSystemMediaPlayer.this.mOnInfoListener != null) {
                    TPSystemMediaPlayer.this.mOnInfoListener.onInfo(4, 1000, 0, Long.valueOf(j));
                }
            }
        });
        this.mExtSub.setSubtitleErrorListener(new ITPSysPlayerExternalSubtitle.IOnSubtitleErrorListener() {
            public void onSubtitleError(int i, int i2) {
                if (TPSystemMediaPlayer.this.mOnInfoListener != null) {
                    TPSystemMediaPlayer.this.mOnInfoListener.onInfo(254, (long) i, (long) i2, (Object) null);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void checkBuffingEvent() {
        long currentPositionMs = getCurrentPositionMs();
        long j = this.mLastCheckPos;
        this.mLastCheckPos = currentPositionMs;
        if (this.mState == PlayerState.STARTED) {
            if (this.mIsLoopback) {
                long j2 = this.mLoopEndPositionMs;
                if (j2 > 0 && currentPositionMs >= j2 && !this.mIsNotSeekable) {
                    this.mLogger.info("checkBuffingEvent, loopback skip end, curPosition:" + currentPositionMs + ", mLoopStartPositionMs:" + this.mLoopStartPositionMs);
                    this.mMediaPlayer.seekTo((int) this.mLoopStartPositionMs);
                }
            } else if (this.mSkipEndPositionMs > 0 && currentPositionMs >= getDurationMs() - this.mSkipEndPositionMs) {
                this.mLogger.info("checkBuffingEvent, skip end, mBaseDuration: " + this.mBaseDuration + ", curPosition:" + currentPositionMs + ", mSkipEndMilsec:" + this.mSkipEndPositionMs);
                this.mState = PlayerState.COMPLETE;
                mediaPlayerStopAndRelease();
                destroyCheckBuffingTimer();
                ITPPlayerBaseListener.IOnCompletionListener iOnCompletionListener = this.mOnCompletionListener;
                if (iOnCompletionListener != null) {
                    iOnCompletionListener.onCompletion();
                    return;
                }
                return;
            }
            int i = (currentPositionMs > j ? 1 : (currentPositionMs == j ? 0 : -1));
            if (i != 0) {
                this.mPosChangeCount++;
            }
            if (i != 0 || currentPositionMs <= 0) {
                if (this.mIsBuffering) {
                    this.mLogger.info("checkBuffingEvent, position change, send end buffering");
                    ITPPlayerBaseListener.IOnInfoListener iOnInfoListener = this.mOnInfoListener;
                    if (iOnInfoListener != null) {
                        iOnInfoListener.onInfo(201, currentPositionMs, this.mBaseDuration, Long.valueOf(this.mPosChangeCount));
                    }
                }
                this.mIsBuffering = false;
                this.mcheckBufferPosNoChangeCount = 0;
                return;
            }
            int i2 = this.mcheckBufferPosNoChangeCount + 1;
            this.mcheckBufferPosNoChangeCount = i2;
            if (i2 >= this.mCheckBufferFrequent && !this.mIsBuffering) {
                this.mIsBuffering = true;
                this.mLogger.info("checkBuffingEvent, position no change,send start buffering");
                ITPPlayerBaseListener.IOnInfoListener iOnInfoListener2 = this.mOnInfoListener;
                if (iOnInfoListener2 != null) {
                    iOnInfoListener2.onInfo(200, currentPositionMs, this.mBaseDuration, Long.valueOf(this.mPosChangeCount));
                }
            }
            if (this.mcheckBufferPosNoChangeCount >= this.mCheckBufferTimeroutFrequent) {
                this.mLogger.error("checkBuffingEvent post error");
                this.mState = PlayerState.ERROR;
                mediaPlayerStopAndRelease();
                this.mIsBuffering = false;
                destroyCheckBuffingTimer();
                ITPPlayerBaseListener.IOnErrorListener iOnErrorListener = this.mOnErrorListener;
                if (iOnErrorListener != null) {
                    iOnErrorListener.onError(2001, formatErrorCode(ExportErrorStatus.APPEND_BUFFER), 0, 0);
                }
            }
        } else if (this.mState == PlayerState.PAUSED && this.mIsBuffering) {
            this.mLogger.info("checkBuffingEvent, pause state and send end buffering");
            this.mIsBuffering = false;
            this.mcheckBufferPosNoChangeCount = 0;
            ITPPlayerBaseListener.IOnInfoListener iOnInfoListener3 = this.mOnInfoListener;
            if (iOnInfoListener3 != null) {
                iOnInfoListener3.onInfo(201, 0, 0, (Object) null);
            }
        }
    }

    private void deselectSubTrack(int i, long j) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("deselectSubTrack, trackIndex:" + i + ", opaque:" + j);
        this.mExtSub.reset();
    }

    /* access modifiers changed from: private */
    public synchronized void destroyCheckBufferTimeOutByInfo() {
        synchronized (this.mCheckBufferTimerOutByInfoLock) {
            Future<?> future = this.mCheckBufferTimeOutBySystemInfoTimer;
            if (future != null) {
                future.cancel(true);
                this.mCheckBufferTimeOutBySystemInfoTimer = null;
            }
        }
    }

    /* access modifiers changed from: private */
    public synchronized void destroyCheckBuffingTimer() {
        synchronized (this.mCheckBuffingTimerLock) {
            BufferCheck bufferCheck = this.mBufferCheck;
            if (bufferCheck != null) {
                bufferCheck.mCheckAbort = true;
                Future<?> future = bufferCheck.mCheckBuffingTimer;
                if (future != null) {
                    future.cancel(true);
                }
                this.mBufferCheck.mCheckBuffingTimer = null;
                this.mBufferCheck = null;
            }
        }
    }

    /* access modifiers changed from: private */
    public synchronized void destroyCheckPrepareTimeoutTimer() {
        synchronized (this.mCheckPrepareTimeoutLock) {
            Future<?> future = this.mCheckPrepareTimeoutTask;
            if (future != null) {
                future.cancel(true);
                this.mCheckPrepareTimeoutTask = null;
            }
        }
    }

    /* access modifiers changed from: private */
    public static int formatErrorCode(int i) {
        long j = i < 0 ? 10000000 - ((long) i) : 10000000 + ((long) i);
        if (j >= 2147483647L) {
            j = 2147483647L;
        }
        return (int) j;
    }

    private void handleDataSource(int i) {
        if (i > 0) {
            ExternalTrackInfo externalTrackInfo = this.mAudioTrackInfo.get(i);
            ITPPlayerBaseListener.IOnInfoListener iOnInfoListener = this.mOnInfoListener;
            if (iOnInfoListener != null) {
                TPPlayerMsg.TPAudioTrackInfo tPAudioTrackInfo = new TPPlayerMsg.TPAudioTrackInfo();
                tPAudioTrackInfo.audioTrackUrl = externalTrackInfo.url;
                tPAudioTrackInfo.paramData = externalTrackInfo.paramData;
                TPBaseLogger tPBaseLogger = this.mLogger;
                tPBaseLogger.info("handleDataSource, audioTrack url:" + tPAudioTrackInfo.audioTrackUrl);
                iOnInfoListener.onInfo(1011, 0, 0, tPAudioTrackInfo);
            }
        }
    }

    private void handleSetDataSourceWithAfd(AssetFileDescriptor assetFileDescriptor) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.mMediaPlayer.setDataSource(assetFileDescriptor);
        } else {
            this.mMediaPlayer.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    private void initMediaPlayer() {
        this.mMediaPlayer = mediaPlayerCreate();
        PlayerState playerState = PlayerState.IDLE;
        this.mState = playerState;
        this.mMediaPlayerState = playerState;
    }

    /* access modifiers changed from: private */
    public boolean isAllowCheckBufferByPosition() {
        if (this.mIsLive) {
            return false;
        }
        return this.mIsAllowCheckBuffingByPosition;
    }

    private boolean isValidRelease(PlayerState playerState) {
        return playerState != PlayerState.RELEASE;
    }

    private boolean isValidStop(PlayerState playerState) {
        return playerState == PlayerState.PREPARED || playerState == PlayerState.STARTED || playerState == PlayerState.PAUSED;
    }

    private MediaPlayer mediaPlayerCreate() {
        TPMediaPlayer tPMediaPlayer = new TPMediaPlayer();
        tPMediaPlayer.setOnPreparedListener(this.mInnerPlayerListener);
        tPMediaPlayer.setOnCompletionListener(this.mInnerPlayerListener);
        tPMediaPlayer.setOnErrorListener(this.mInnerPlayerListener);
        tPMediaPlayer.setOnInfoListener(this.mInnerPlayerListener);
        tPMediaPlayer.setOnBufferingUpdateListener(this.mInnerPlayerListener);
        tPMediaPlayer.setOnSeekCompleteListener(this.mInnerPlayerListener);
        tPMediaPlayer.setOnVideoSizeChangedListener(this.mInnerPlayerListener);
        tPMediaPlayer.setOnTimedTextListener(this.mOnTimedTextListener);
        return tPMediaPlayer;
    }

    private void mediaPlayerExceptionHook(MediaPlayer mediaPlayer) {
        try {
            Field declaredField = MediaPlayer.class.getDeclaredField("mEventHandler");
            declaredField.setAccessible(true);
            Handler handler = (Handler) declaredField.get(mediaPlayer);
            Field declaredField2 = Handler.class.getDeclaredField("mCallback");
            declaredField2.setAccessible(true);
            if (((Handler.Callback) declaredField2.get(handler)) == null) {
                declaredField2.set(handler, new HookCallback(handler));
            }
        } catch (Exception e) {
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.error("mediaPlayerExceptionHook, " + Log.getStackTraceString(e));
        }
    }

    private void mediaPlayerRelease() {
        if (isValidRelease(this.mMediaPlayerState)) {
            this.mMediaPlayerState = PlayerState.RELEASE;
            this.mLogger.info("MediaPlayer release.");
            this.mMediaPlayer.release();
        }
    }

    private void mediaPlayerReset() {
        destroyCheckPrepareTimeoutTimer();
        destroyCheckBuffingTimer();
        destroyCheckBufferTimeOutByInfo();
        mediaPlayerStopAndRelease();
        this.mMediaPlayer = new TPMediaPlayer();
        this.mMediaPlayer.setOnPreparedListener(this.mInnerPlayerListener);
        this.mMediaPlayer.setOnCompletionListener(this.mInnerPlayerListener);
        this.mMediaPlayer.setOnErrorListener(this.mInnerPlayerListener);
        this.mMediaPlayer.setOnInfoListener(this.mInnerPlayerListener);
        this.mMediaPlayer.setOnBufferingUpdateListener(this.mInnerPlayerListener);
        this.mMediaPlayer.setOnSeekCompleteListener(this.mInnerPlayerListener);
        this.mMediaPlayer.setOnVideoSizeChangedListener(this.mInnerPlayerListener);
        this.mMediaPlayer.setOnTimedTextListener(this.mOnTimedTextListener);
        if (this.mMute) {
            this.mMediaPlayer.setVolume(0.0f, 0.0f);
        } else if (this.mAudioGain != 1.0f) {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            float f = this.mAudioGain;
            mediaPlayer.setVolume(f, f);
        }
        float f2 = this.mPlaySpeed;
        if (((double) f2) != 1.0d) {
            setPlaySpeedRatio(f2);
        }
        if (this.mIsLoopback) {
            this.mMediaPlayer.setLooping(this.mIsLoopback);
        }
    }

    /* access modifiers changed from: private */
    public void mediaPlayerStopAndRelease() {
        unRegisterListener();
        mediaPlayerstop();
        mediaPlayerRelease();
    }

    private void mediaPlayerstop() {
        if (isValidStop(this.mMediaPlayerState)) {
            this.mMediaPlayerState = PlayerState.STOPPED;
            this.mLogger.info("MediaPlayer stop.");
            this.mMediaPlayer.stop();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void playerResetEnd() {
        /*
            r10 = this;
            monitor-enter(r10)
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$ResetActionInfo r0 = r10.mLastestAction     // Catch:{ all -> 0x015b }
            com.tencent.thumbplayer.log.TPBaseLogger r1 = r10.mLogger     // Catch:{ all -> 0x015b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x015b }
            r2.<init>()     // Catch:{ all -> 0x015b }
            java.lang.String r3 = "playerResetEnd, actionInfo:"
            r2.append(r3)     // Catch:{ all -> 0x015b }
            r2.append(r0)     // Catch:{ all -> 0x015b }
            java.lang.String r3 = ", mSuspend:"
            r2.append(r3)     // Catch:{ all -> 0x015b }
            boolean r3 = r10.mSuspend     // Catch:{ all -> 0x015b }
            r2.append(r3)     // Catch:{ all -> 0x015b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x015b }
            r1.info(r2)     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x0120
            boolean r1 = r10.mSuspend     // Catch:{ all -> 0x015b }
            if (r1 == 0) goto L_0x0120
            com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener$IOnInfoListener r2 = r10.mOnInfoListener     // Catch:{ all -> 0x015b }
            int r1 = r0.mResetType     // Catch:{ all -> 0x015b }
            r3 = 1
            if (r1 != r3) goto L_0x0033
            r1 = 3
            r3 = 3
            goto L_0x0035
        L_0x0033:
            r1 = 4
            r3 = 4
        L_0x0035:
            if (r2 == 0) goto L_0x0044
            r4 = 1000(0x3e8, double:4.94E-321)
            r6 = 0
            long r8 = r0.opaque     // Catch:{ all -> 0x015b }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x015b }
            r2.onInfo(r3, r4, r6, r8)     // Catch:{ all -> 0x015b }
        L_0x0044:
            int r1 = r0.innerAudioTrackIndex     // Catch:{ all -> 0x015b }
            if (r1 <= 0) goto L_0x004f
            android.media.MediaPlayer r1 = r10.mMediaPlayer     // Catch:{ all -> 0x015b }
            int r2 = r0.innerAudioTrackIndex     // Catch:{ all -> 0x015b }
            r1.selectTrack(r2)     // Catch:{ all -> 0x015b }
        L_0x004f:
            int r1 = r0.innerSubtitleTrackIndex     // Catch:{ all -> 0x015b }
            if (r1 <= 0) goto L_0x005a
            android.media.MediaPlayer r1 = r10.mMediaPlayer     // Catch:{ all -> 0x015b }
            int r2 = r0.innerSubtitleTrackIndex     // Catch:{ all -> 0x015b }
            r1.selectTrack(r2)     // Catch:{ all -> 0x015b }
        L_0x005a:
            long r1 = r0.position     // Catch:{ all -> 0x015b }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x008d
            boolean r1 = r10.mIsNotSeekable     // Catch:{ all -> 0x015b }
            if (r1 != 0) goto L_0x008d
            com.tencent.thumbplayer.log.TPBaseLogger r1 = r10.mLogger     // Catch:{ all -> 0x015b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x015b }
            r2.<init>()     // Catch:{ all -> 0x015b }
            java.lang.String r3 = "playerResetEnd, onPrepared(), and seek to:"
            r2.append(r3)     // Catch:{ all -> 0x015b }
            long r3 = r0.position     // Catch:{ all -> 0x015b }
            r2.append(r3)     // Catch:{ all -> 0x015b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x015b }
            r1.info(r2)     // Catch:{ all -> 0x015b }
            android.media.MediaPlayer r1 = r10.mMediaPlayer     // Catch:{ Exception -> 0x0087 }
            long r2 = r0.position     // Catch:{ Exception -> 0x0087 }
            int r3 = (int) r2     // Catch:{ Exception -> 0x0087 }
            r1.seekTo(r3)     // Catch:{ Exception -> 0x0087 }
            goto L_0x008d
        L_0x0087:
            r1 = move-exception
            com.tencent.thumbplayer.log.TPBaseLogger r2 = r10.mLogger     // Catch:{ all -> 0x015b }
            r2.printException(r1)     // Catch:{ all -> 0x015b }
        L_0x008d:
            com.tencent.thumbplayer.log.TPBaseLogger r1 = r10.mLogger     // Catch:{ all -> 0x015b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x015b }
            r2.<init>()     // Catch:{ all -> 0x015b }
            java.lang.String r3 = "playerResetEnd, restore state:"
            r2.append(r3)     // Catch:{ all -> 0x015b }
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r3 = r0.state     // Catch:{ all -> 0x015b }
            r2.append(r3)     // Catch:{ all -> 0x015b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x015b }
            r1.info(r2)     // Catch:{ all -> 0x015b }
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r1 = r0.state     // Catch:{ all -> 0x015b }
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r2 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.IDLE     // Catch:{ all -> 0x015b }
            if (r1 == r2) goto L_0x010d
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r2 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.INITIALIZED     // Catch:{ all -> 0x015b }
            if (r1 == r2) goto L_0x010d
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r2 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PREPARING     // Catch:{ all -> 0x015b }
            if (r1 != r2) goto L_0x00b4
            goto L_0x010d
        L_0x00b4:
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r2 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PREPARED     // Catch:{ all -> 0x015b }
            if (r1 == r2) goto L_0x010a
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r2 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PAUSED     // Catch:{ all -> 0x015b }
            if (r1 != r2) goto L_0x00bd
            goto L_0x010a
        L_0x00bd:
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r2 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.STARTED     // Catch:{ all -> 0x015b }
            if (r1 != r2) goto L_0x00d7
            com.tencent.thumbplayer.log.TPBaseLogger r1 = r10.mLogger     // Catch:{ all -> 0x015b }
            java.lang.String r3 = "playerResetEnd,  MediaPlayer.start()."
            r1.info(r3)     // Catch:{ all -> 0x015b }
            android.media.MediaPlayer r1 = r10.mMediaPlayer     // Catch:{ all -> 0x015b }
            r1.start()     // Catch:{ all -> 0x015b }
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r0 = r0.state     // Catch:{ all -> 0x015b }
            r10.mState = r0     // Catch:{ all -> 0x015b }
            r10.mMediaPlayerState = r2     // Catch:{ all -> 0x015b }
            r10.startCheckBufferingTimer()     // Catch:{ all -> 0x015b }
            goto L_0x0118
        L_0x00d7:
            com.tencent.thumbplayer.log.TPBaseLogger r1 = r10.mLogger     // Catch:{ all -> 0x015b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x015b }
            r2.<init>()     // Catch:{ all -> 0x015b }
            java.lang.String r3 = "illegal state, state:"
            r2.append(r3)     // Catch:{ all -> 0x015b }
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r0 = r0.state     // Catch:{ all -> 0x015b }
            r2.append(r0)     // Catch:{ all -> 0x015b }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x015b }
            r1.error(r0)     // Catch:{ all -> 0x015b }
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r0 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.ERROR     // Catch:{ all -> 0x015b }
            r10.mState = r0     // Catch:{ all -> 0x015b }
            r10.mediaPlayerStopAndRelease()     // Catch:{ all -> 0x015b }
            com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener$IOnErrorListener r1 = r10.mOnErrorListener     // Catch:{ all -> 0x015b }
            if (r1 == 0) goto L_0x0118
            r2 = 2000(0x7d0, float:2.803E-42)
            r0 = -10004(0xffffffffffffd8ec, float:NaN)
            int r3 = formatErrorCode(r0)     // Catch:{ all -> 0x015b }
            r4 = 0
            r6 = 0
            r1.onError(r2, r3, r4, r6)     // Catch:{ all -> 0x015b }
            goto L_0x0118
        L_0x010a:
            r10.mState = r1     // Catch:{ all -> 0x015b }
            goto L_0x0118
        L_0x010d:
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r0 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PREPARED     // Catch:{ all -> 0x015b }
            r10.mState = r0     // Catch:{ all -> 0x015b }
            com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener$IOnPreparedListener r0 = r10.mOnPreparedListener     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x0118
            r0.onPrepared()     // Catch:{ all -> 0x015b }
        L_0x0118:
            r0 = 0
            r10.mSuspend = r0     // Catch:{ all -> 0x015b }
            r0 = 0
            r10.mLastestAction = r0     // Catch:{ all -> 0x015b }
            monitor-exit(r10)
            return
        L_0x0120:
            int r0 = r10.mStartPositionMs     // Catch:{ all -> 0x015b }
            if (r0 <= 0) goto L_0x014e
            boolean r0 = r10.mIsNotSeekable     // Catch:{ all -> 0x015b }
            if (r0 != 0) goto L_0x014e
            com.tencent.thumbplayer.log.TPBaseLogger r0 = r10.mLogger     // Catch:{ all -> 0x015b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x015b }
            r1.<init>()     // Catch:{ all -> 0x015b }
            java.lang.String r2 = "onPrepared(), and seekto:"
            r1.append(r2)     // Catch:{ all -> 0x015b }
            int r2 = r10.mStartPositionMs     // Catch:{ all -> 0x015b }
            r1.append(r2)     // Catch:{ all -> 0x015b }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x015b }
            r0.info(r1)     // Catch:{ all -> 0x015b }
            android.media.MediaPlayer r0 = r10.mMediaPlayer     // Catch:{ Exception -> 0x0148 }
            int r1 = r10.mStartPositionMs     // Catch:{ Exception -> 0x0148 }
            r0.seekTo(r1)     // Catch:{ Exception -> 0x0148 }
            goto L_0x014e
        L_0x0148:
            r0 = move-exception
            com.tencent.thumbplayer.log.TPBaseLogger r1 = r10.mLogger     // Catch:{ all -> 0x015b }
            r1.printException(r0)     // Catch:{ all -> 0x015b }
        L_0x014e:
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r0 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PREPARED     // Catch:{ all -> 0x015b }
            r10.mState = r0     // Catch:{ all -> 0x015b }
            com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener$IOnPreparedListener r0 = r10.mOnPreparedListener     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x0159
            r0.onPrepared()     // Catch:{ all -> 0x015b }
        L_0x0159:
            monitor-exit(r10)
            return
        L_0x015b:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.playerResetEnd():void");
    }

    private synchronized void playerResetStart(ResetActionInfo resetActionInfo) {
        int i;
        String str = resetActionInfo.url;
        resetActionInfo.position = getCurrentPositionMs();
        resetActionInfo.state = this.mState;
        resetActionInfo.innerAudioTrackIndex = this.mCurInnerAudioTrackIndex;
        resetActionInfo.innerSubtitleTrackIndex = this.mSelectSubtitleIndex;
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("playerResetStart, pos:" + resetActionInfo.position + ", state:" + resetActionInfo.state);
        this.mSuspend = true;
        mediaPlayerReset();
        this.mMediaPlayerState = PlayerState.IDLE;
        if (this.mFd != null) {
            this.mMediaPlayer.setDataSource(this.mFd);
        } else {
            AssetFileDescriptor assetFileDescriptor = this.mAssetFd;
            if (assetFileDescriptor != null) {
                handleSetDataSourceWithAfd(assetFileDescriptor);
            } else {
                handleDataSource(resetActionInfo.externalAudioTrackIndex);
                Map<String, String> map = this.mHeader;
                if (map == null || map.isEmpty()) {
                    this.mMediaPlayer.setDataSource(str);
                } else {
                    this.mMediaPlayer.setDataSource(this.mContext, Uri.parse(str), this.mHeader);
                }
            }
        }
        this.mMediaPlayerState = PlayerState.INITIALIZED;
        Object obj = this.mSurfaceObj;
        if (obj == null) {
            this.mMediaPlayer.setDisplay((SurfaceHolder) null);
        } else if (obj instanceof SurfaceHolder) {
            this.mMediaPlayer.setDisplay((SurfaceHolder) this.mSurfaceObj);
        } else if (obj instanceof Surface) {
            this.mMediaPlayer.setSurface((Surface) this.mSurfaceObj);
        }
        ResetActionInfo resetActionInfo2 = this.mLastestAction;
        if (!(resetActionInfo2 == null || (i = resetActionInfo2.mResetType) == resetActionInfo.mResetType)) {
            ITPPlayerBaseListener.IOnInfoListener iOnInfoListener = this.mOnInfoListener;
            int i2 = i == 1 ? 3 : 4;
            if (iOnInfoListener != null) {
                iOnInfoListener.onInfo(i2, resetActionInfo2.opaque, 0, (Object) null);
            }
            resetActionInfo.state = resetActionInfo2.state;
            resetActionInfo.position = resetActionInfo2.position;
        }
        this.mLastestAction = resetActionInfo;
        PlayerState playerState = resetActionInfo.state;
        if (playerState == PlayerState.PREPARING || playerState == PlayerState.PREPARED || playerState == PlayerState.STARTED || playerState == PlayerState.PAUSED) {
            prepareAsync();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        if (r7 == 3) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void seekToComm(android.media.MediaPlayer r5, int r6, @com.tencent.thumbplayer.api.TPCommonEnum.TPSeekMode int r7) {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L_0x002d
            com.tencent.thumbplayer.log.TPBaseLogger r7 = r4.mLogger
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "os ver is too low, current sdk int:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", is less than "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ", use seekTo(int positionMs) instead"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r7.info(r0)
            r5.seekTo(r6)
            return
        L_0x002d:
            r0 = 2
            r1 = 1
            r2 = 0
            if (r7 != r1) goto L_0x0034
        L_0x0032:
            r0 = 0
            goto L_0x003b
        L_0x0034:
            if (r7 != r0) goto L_0x0038
            r0 = 1
            goto L_0x003b
        L_0x0038:
            r1 = 3
            if (r7 != r1) goto L_0x0032
        L_0x003b:
            long r1 = (long) r6
            r5.seekTo(r1, r0)     // Catch:{ Exception -> 0x0040 }
            goto L_0x005a
        L_0x0040:
            r7 = move-exception
            com.tencent.thumbplayer.log.TPBaseLogger r0 = r4.mLogger
            r0.printException(r7)
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r7 = r4.mMediaPlayerState     // Catch:{ Exception -> 0x0054 }
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r0 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.COMPLETE     // Catch:{ Exception -> 0x0054 }
            if (r7 != r0) goto L_0x0050
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r7 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.STARTED     // Catch:{ Exception -> 0x0054 }
            r4.mState = r7     // Catch:{ Exception -> 0x0054 }
        L_0x0050:
            r5.seekTo(r6)     // Catch:{ Exception -> 0x0054 }
            goto L_0x005a
        L_0x0054:
            r5 = move-exception
            com.tencent.thumbplayer.log.TPBaseLogger r6 = r4.mLogger
            r6.printException(r5)
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.seekToComm(android.media.MediaPlayer, int, int):void");
    }

    private void selectAudioTrack(int i, long j) {
        ResetActionInfo resetActionInfo = new ResetActionInfo();
        resetActionInfo.opaque = j;
        resetActionInfo.externalAudioTrackIndex = i;
        resetActionInfo.mResetType = 2;
        resetActionInfo.url = this.mUrl;
        playerResetStart(resetActionInfo);
    }

    private void selectSubTrack(int i, long j) {
        this.mExtSub.reset();
        ExternalTrackInfo externalTrackInfo = this.mSubTrackInfo.get(i);
        this.mExtSub.setDataSource(externalTrackInfo.url, externalTrackInfo.httpHeader, j);
        this.mExtSub.prepare();
    }

    private void setAudioAttributes(TPAudioAttributes tPAudioAttributes) {
        if (tPAudioAttributes != null) {
            int i = Build.VERSION.SDK_INT;
            this.mMediaPlayer.setAudioAttributes(this.mAttributes.toAndroidMediaAudioAttributes());
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.info("set audio attributes into MediaPlayer, API:" + i + ">=" + 21 + ", " + this.mAttributes.toString());
        }
    }

    private void setInitParamsBeforePrepare() {
        setAudioAttributes(this.mAttributes);
    }

    /* access modifiers changed from: private */
    public void startCheckBufferTimeOutByInfo() {
        synchronized (this.mCheckBufferTimerOutByInfoLock) {
            if (this.mCheckBufferTimeOutBySystemInfoTimer == null) {
                this.mCheckBufferTimeOutBySystemInfoTimer = TPThreadPool.getInstance().obtainScheduledExecutorService().schedule(new Runnable() {
                    public void run() {
                        if (TPSystemMediaPlayer.this.mState != PlayerState.PAUSED && TPSystemMediaPlayer.this.mIsBuffering) {
                            TPSystemMediaPlayer.this.mLogger.error("startCheckBufferTimeOutByInfo, buffer last too long");
                            PlayerState unused = TPSystemMediaPlayer.this.mState = PlayerState.ERROR;
                            TPSystemMediaPlayer.this.mediaPlayerStopAndRelease();
                            boolean unused2 = TPSystemMediaPlayer.this.mIsBuffering = false;
                            TPSystemMediaPlayer.this.destroyCheckBufferTimeOutByInfo();
                            ITPPlayerBaseListener.IOnErrorListener access$1200 = TPSystemMediaPlayer.this.mOnErrorListener;
                            if (access$1200 != null) {
                                access$1200.onError(2001, TPSystemMediaPlayer.formatErrorCode(ExportErrorStatus.APPEND_BUFFER), 0, 0);
                            }
                        }
                    }
                }, (long) (this.mCheckBufferTimeroutFrequent * 400), TimeUnit.MILLISECONDS);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void startCheckBufferingTimer() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.mCheckBuffingTimerLock
            monitor-enter(r0)
            boolean r1 = r7.isAllowCheckBufferByPosition()     // Catch:{ all -> 0x003b }
            if (r1 != 0) goto L_0x0013
            com.tencent.thumbplayer.log.TPBaseLogger r1 = r7.mLogger     // Catch:{ all -> 0x003b }
            java.lang.String r2 = "startCheckBufferingTimer, forbidden check buffer by position"
            r1.info(r2)     // Catch:{ all -> 0x003b }
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x0013:
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$BufferCheck r1 = r7.mBufferCheck     // Catch:{ all -> 0x003b }
            if (r1 != 0) goto L_0x0039
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$BufferCheck r1 = new com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$BufferCheck     // Catch:{ all -> 0x003b }
            r2 = 0
            r1.<init>()     // Catch:{ all -> 0x003b }
            r7.mBufferCheck = r1     // Catch:{ all -> 0x003b }
            r2 = 0
            r1.mCheckAbort = r2     // Catch:{ all -> 0x003b }
            com.tencent.thumbplayer.utils.TPThreadPool r2 = com.tencent.thumbplayer.utils.TPThreadPool.getInstance()     // Catch:{ all -> 0x003b }
            java.util.concurrent.ScheduledExecutorService r2 = r2.obtainScheduledExecutorService()     // Catch:{ all -> 0x003b }
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$6 r3 = new com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$6     // Catch:{ all -> 0x003b }
            r3.<init>(r1)     // Catch:{ all -> 0x003b }
            r4 = 0
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x003b }
            java.util.concurrent.ScheduledFuture r2 = r2.schedule(r3, r4, r6)     // Catch:{ all -> 0x003b }
            r1.mCheckBuffingTimer = r2     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.startCheckBufferingTimer():void");
    }

    private void startCheckPrepareTimeoutTimer() {
        this.mLogger.info("startCheckPrepareTimeoutTimer");
        synchronized (this.mCheckPrepareTimeoutLock) {
            if (this.mCheckPrepareTimeoutTask == null) {
                this.mCheckPrepareTimeoutTask = TPThreadPool.getInstance().obtainScheduledExecutorService().schedule(new Runnable() {
                    public void run() {
                        if (TPSystemMediaPlayer.this.mState == PlayerState.PREPARING) {
                            TPSystemMediaPlayer.this.mLogger.error("startCheckPrepareTimeoutTimer, post error");
                            PlayerState unused = TPSystemMediaPlayer.this.mState = PlayerState.ERROR;
                            TPSystemMediaPlayer.this.mediaPlayerStopAndRelease();
                            TPSystemMediaPlayer.this.destroyCheckPrepareTimeoutTimer();
                            ITPPlayerBaseListener.IOnErrorListener access$1200 = TPSystemMediaPlayer.this.mOnErrorListener;
                            if (access$1200 != null) {
                                access$1200.onError(2001, TPSystemMediaPlayer.formatErrorCode(ExportErrorStatus.APPEND_BUFFER), 0, 0);
                            }
                        }
                    }
                }, this.mIntervalCheckPreparingTimeOut, TimeUnit.MILLISECONDS);
            }
        }
    }

    private int systemTrackType2TPTrackType(int i) {
        if (2 == i) {
            return 2;
        }
        if (1 == i) {
            return 1;
        }
        return 4 == i ? 3 : 0;
    }

    private void unRegisterListener() {
        this.mMediaPlayer.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
        this.mMediaPlayer.setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
        this.mMediaPlayer.setOnErrorListener((MediaPlayer.OnErrorListener) null);
        this.mMediaPlayer.setOnInfoListener((MediaPlayer.OnInfoListener) null);
        this.mMediaPlayer.setOnBufferingUpdateListener((MediaPlayer.OnBufferingUpdateListener) null);
        this.mMediaPlayer.setOnSeekCompleteListener((MediaPlayer.OnSeekCompleteListener) null);
        this.mMediaPlayer.setOnVideoSizeChangedListener((MediaPlayer.OnVideoSizeChangedListener) null);
    }

    public void addAudioTrackSource(String str, String str2, List<TPOptionalParam> list) {
        addAudioTrackSource(str, (Map<String, String>) null, str2, list);
    }

    public void addSubtitleSource(String str, String str2, String str3) {
        addSubtitleSource(str, (Map<String, String>) null, str2, str3);
    }

    public void captureVideo(TPCaptureParams tPCaptureParams, TPCaptureCallBack tPCaptureCallBack) {
        if (this.mTpSystemCapture != null) {
            TPImageGeneratorParams tPImageGeneratorParams = new TPImageGeneratorParams();
            tPImageGeneratorParams.width = tPCaptureParams.width;
            tPImageGeneratorParams.height = tPCaptureParams.height;
            tPImageGeneratorParams.format = tPCaptureParams.format;
            tPImageGeneratorParams.requestedTimeMsToleranceBefore = tPCaptureParams.requestedTimeMsToleranceBefore;
            tPImageGeneratorParams.requestedTimeMsToleranceAfter = tPCaptureParams.requestedTimeMsToleranceAfter;
            this.mTpSystemCapture.generateImageAsyncAtTime(getCurrentPositionMs(), tPImageGeneratorParams, tPCaptureCallBack);
            return;
        }
        tPCaptureCallBack.onCaptureVideoFailed(TPGeneralError.UNMATCHED_STATE);
    }

    public void deselectTrack(int i, long j) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("deselectTrack, trackID " + i);
        int size = this.mAudioTrackInfo.size();
        int size2 = this.mSubTrackInfo.size();
        if (i < size || i >= size2 + size) {
            this.mMediaPlayer.deselectTrack(i);
            return;
        }
        int i2 = i - size;
        try {
            deselectSubTrack(i2, j);
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
        this.mSubTrackInfo.get(i2).info.isSelected = false;
        this.mCurSubTrackIndex = -1;
    }

    public long getCurrentPositionMs() {
        if (this.mIsLive) {
            return 0;
        }
        if (this.mSuspend || this.mState == PlayerState.ERROR) {
            long j = this.mLastCheckPos;
            return j == -1 ? (long) this.mStartPositionMs : j;
        }
        return (long) ((this.mState == PlayerState.IDLE || this.mState == PlayerState.INITIALIZED || this.mState == PlayerState.PREPARING || this.mState == PlayerState.STOPPED || this.mState == PlayerState.PREPARED) ? this.mStartPositionMs : this.mMediaPlayer.getCurrentPosition());
    }

    public long getDemuxerOffsetInFile() {
        return -1;
    }

    public long getDurationMs() {
        if (this.mIsLive) {
            return 0;
        }
        if (this.mSuspend) {
            return this.mBaseDuration;
        }
        if (this.mState != PlayerState.PREPARED && this.mState != PlayerState.STARTED && this.mState != PlayerState.PAUSED) {
            return -1;
        }
        if (this.mBaseDuration <= 0) {
            this.mBaseDuration = (long) this.mMediaPlayer.getDuration();
        }
        long j = this.mCgiDuration;
        if (j > 0) {
            long j2 = this.mBaseDuration;
            if (j2 <= 0) {
                this.mBaseDuration = j;
            } else {
                long j3 = this.mCgiDuration;
                if ((Math.abs(j - j2) * 100) / j3 > 1) {
                    this.mBaseDuration = j3;
                }
            }
        }
        return this.mBaseDuration;
    }

    public TPDynamicStatisticParams getDynamicStatisticParams(boolean z) {
        return null;
    }

    public TPGeneralPlayFlowParams getGeneralPlayFlowParams() {
        return null;
    }

    public long getPlayableDurationMs() {
        return -1;
    }

    public TPProgramInfo[] getProgramInfo() {
        return new TPProgramInfo[0];
    }

    public long getPropertyLong(int i) {
        return -1;
    }

    public String getPropertyString(int i) {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.thumbplayer.api.TPTrackInfo[] getTrackInfo() {
        /*
            r9 = this;
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r0 = r9.mState
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r1 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PREPARED
            if (r0 == r1) goto L_0x0012
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r0 = r9.mState
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r1 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.STARTED
            if (r0 == r1) goto L_0x0012
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r0 = r9.mState
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r1 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PAUSED
            if (r0 != r1) goto L_0x0026
        L_0x0012:
            int r0 = com.tencent.thumbplayer.core.common.TPSystemInfo.SDK_INT
            r1 = 16
            if (r0 <= r1) goto L_0x0026
            android.media.MediaPlayer r0 = r9.mMediaPlayer     // Catch:{ Exception -> 0x001f }
            android.media.MediaPlayer$TrackInfo[] r0 = r0.getTrackInfo()     // Catch:{ Exception -> 0x001f }
            goto L_0x0027
        L_0x001f:
            com.tencent.thumbplayer.log.TPBaseLogger r0 = r9.mLogger
            java.lang.String r1 = "getTrackInfo, android getTrackInfo crash"
            r0.error(r1)
        L_0x0026:
            r0 = 0
        L_0x0027:
            r1 = 0
            if (r0 != 0) goto L_0x003d
            java.util.List<com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$ExternalTrackInfo> r2 = r9.mAudioTrackInfo
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x003d
            java.util.List<com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$ExternalTrackInfo> r2 = r9.mSubTrackInfo
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x003d
            com.tencent.thumbplayer.api.TPTrackInfo[] r0 = new com.tencent.thumbplayer.api.TPTrackInfo[r1]
            return r0
        L_0x003d:
            java.util.List<com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$ExternalTrackInfo> r2 = r9.mAudioTrackInfo
            int r2 = r2.size()
            java.util.List<com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$ExternalTrackInfo> r3 = r9.mSubTrackInfo
            int r3 = r3.size()
            int r2 = r2 + r3
            if (r0 != 0) goto L_0x004e
            r3 = 0
            goto L_0x004f
        L_0x004e:
            int r3 = r0.length
        L_0x004f:
            int r2 = r2 + r3
            com.tencent.thumbplayer.api.TPTrackInfo[] r2 = new com.tencent.thumbplayer.api.TPTrackInfo[r2]
            java.util.List<com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$ExternalTrackInfo> r3 = r9.mAudioTrackInfo
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L_0x0059:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x006d
            java.lang.Object r5 = r3.next()
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$ExternalTrackInfo r5 = (com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ExternalTrackInfo) r5
            int r6 = r4 + 1
            com.tencent.thumbplayer.api.TPTrackInfo r5 = r5.info
            r2[r4] = r5
            r4 = r6
            goto L_0x0059
        L_0x006d:
            java.util.List<com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$ExternalTrackInfo> r3 = r9.mSubTrackInfo
            java.util.Iterator r3 = r3.iterator()
        L_0x0073:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0087
            java.lang.Object r5 = r3.next()
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$ExternalTrackInfo r5 = (com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ExternalTrackInfo) r5
            int r6 = r4 + 1
            com.tencent.thumbplayer.api.TPTrackInfo r5 = r5.info
            r2[r4] = r5
            r4 = r6
            goto L_0x0073
        L_0x0087:
            if (r0 == 0) goto L_0x00e3
            int r3 = r0.length
            if (r3 > 0) goto L_0x008d
            goto L_0x00e3
        L_0x008d:
            int r3 = r0.length
        L_0x008e:
            if (r1 >= r3) goto L_0x00e3
            r5 = r0[r1]
            com.tencent.thumbplayer.api.TPTrackInfo r6 = new com.tencent.thumbplayer.api.TPTrackInfo
            r6.<init>()
            java.lang.String r7 = r5.getLanguage()
            r6.name = r7
            int r5 = r5.getTrackType()
            int r5 = r9.systemTrackType2TPTrackType(r5)
            r6.trackType = r5
            com.tencent.thumbplayer.log.TPBaseLogger r5 = r9.mLogger
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "getTrackInfo index:"
            r7.append(r8)
            r7.append(r4)
            java.lang.String r8 = ", type:"
            r7.append(r8)
            int r8 = r6.trackType
            r7.append(r8)
            java.lang.String r8 = ", isselcted:"
            r7.append(r8)
            boolean r8 = r6.isSelected
            r7.append(r8)
            java.lang.String r8 = ", name:"
            r7.append(r8)
            java.lang.String r8 = r6.name
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r5.info(r7)
            int r5 = r4 + 1
            r2[r4] = r6
            int r1 = r1 + 1
            r4 = r5
            goto L_0x008e
        L_0x00e3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.getTrackInfo():com.tencent.thumbplayer.api.TPTrackInfo[]");
    }

    public int getVideoHeight() {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("getVideoHeight, height:" + this.mVideoHeight);
        return this.mVideoHeight;
    }

    public int getVideoWidth() {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("getVideoWidth, width:" + this.mVideoWidth);
        return this.mVideoWidth;
    }

    public synchronized void pause() {
        this.mLogger.info("pause ");
        if (this.mSuspend) {
            ResetActionInfo resetActionInfo = this.mLastestAction;
            if (resetActionInfo != null) {
                resetActionInfo.state = PlayerState.PAUSED;
            }
            this.mLogger.warn("system player is busy.");
            return;
        }
        ITPSysPlayerExternalSubtitle iTPSysPlayerExternalSubtitle = this.mExtSub;
        if (iTPSysPlayerExternalSubtitle != null) {
            iTPSysPlayerExternalSubtitle.pauseAsync();
        }
        this.mMediaPlayer.pause();
        PlayerState playerState = PlayerState.PAUSED;
        this.mState = playerState;
        this.mMediaPlayerState = playerState;
    }

    public void prepare() {
        if (this.mMediaPlayerState == PlayerState.COMPLETE) {
            this.mLogger.warn("call prepare() on mMediaPlayerState==COMPLETE");
            return;
        }
        setInitParamsBeforePrepare();
        this.mLogger.info("prepare ");
        PlayerState playerState = PlayerState.PREPARING;
        this.mState = playerState;
        this.mMediaPlayerState = playerState;
        this.mMediaPlayer.prepare();
    }

    public void prepareAsync() {
        setInitParamsBeforePrepare();
        this.mLogger.info("prepareAsync ");
        PlayerState playerState = PlayerState.PREPARING;
        this.mState = playerState;
        this.mMediaPlayerState = playerState;
        this.mMediaPlayer.prepareAsync();
        startCheckPrepareTimeoutTimer();
    }

    public synchronized void release() {
        this.mLogger.info("release ");
        this.mExtSub.release();
        destroyCheckPrepareTimeoutTimer();
        destroyCheckBuffingTimer();
        destroyCheckBufferTimeOutByInfo();
        this.mState = PlayerState.RELEASE;
        mediaPlayerStopAndRelease();
        this.mOnPreparedListener = null;
        this.mOnCompletionListener = null;
        this.mOnInfoListener = null;
        this.mOnErrorListener = null;
        this.mOnSeekCompleteListener = null;
        this.mOnVideoSizeChangedListener = null;
        this.mOnSubtitleDataListener = null;
        this.mSurfaceObj = null;
        this.mLogger.info("release over.");
    }

    public synchronized void reset() {
        this.mLogger.info("reset ");
        PlayerState playerState = PlayerState.IDLE;
        this.mState = playerState;
        this.mMediaPlayerState = playerState;
        this.mExtSub.reset();
        this.mMediaPlayer.reset();
        this.mStartPositionMs = 0;
        this.mSkipEndPositionMs = -1;
        this.mIsLive = false;
        this.mCgiDuration = -1;
        this.mCgiVideoHeight = -1;
        this.mCgiVideoWidth = -1;
        this.mAttributes = null;
        destroyCheckPrepareTimeoutTimer();
        destroyCheckBuffingTimer();
        destroyCheckBufferTimeOutByInfo();
        this.mLogger.info("reset over.");
    }

    public void seekTo(int i) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("seekTo, position: " + i);
        if (this.mIsNotSeekable) {
            this.mLogger.info("current media is not seekable, ignore");
        } else if (this.mSuspend) {
            ResetActionInfo resetActionInfo = this.mLastestAction;
            if (resetActionInfo != null) {
                resetActionInfo.position = (long) i;
            }
        } else {
            if (this.mMediaPlayerState == PlayerState.COMPLETE) {
                this.mState = PlayerState.STARTED;
            }
            this.mMediaPlayer.seekTo(i);
        }
    }

    public void selectProgram(int i, long j) {
        this.mLogger.error("selectProgram, android mediaplayer not support");
    }

    public void selectTrack(int i, long j) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("selectTrack, trackID:" + i + ", opaque:" + j);
        int size = this.mAudioTrackInfo.size();
        int size2 = this.mSubTrackInfo.size();
        this.mAudioTrackInfo.size();
        ITPPlayerBaseListener.IOnInfoListener iOnInfoListener = this.mOnInfoListener;
        if (i >= 0 && i < size) {
            try {
                selectAudioTrack(i, j);
                this.mAudioTrackInfo.get(this.mCurAudioTrackIndex).info.isSelected = false;
                this.mAudioTrackInfo.get(i).info.isSelected = true;
                this.mCurAudioTrackIndex = i;
            } catch (Exception e) {
                this.mLogger.printException(e);
                if (iOnInfoListener != null) {
                    iOnInfoListener.onInfo(4, 2000, (long) formatErrorCode(-10000), Long.valueOf(j));
                }
            }
        } else if (i < size || i >= size + size2) {
            int i2 = i - (size + size2);
            if (this.mState == PlayerState.PREPARED || this.mState == PlayerState.STARTED || this.mState == PlayerState.PAUSED) {
                MediaPlayer.TrackInfo[] trackInfoArr = null;
                try {
                    trackInfoArr = this.mMediaPlayer.getTrackInfo();
                } catch (Exception unused) {
                    this.mLogger.error("getTrackInfo, android getTrackInfo crash");
                }
                if (trackInfoArr != null && trackInfoArr.length > i2) {
                    MediaPlayer.TrackInfo trackInfo = trackInfoArr[i2];
                    if (trackInfo.getTrackType() == 2) {
                        this.mCurInnerAudioTrackIndex = i2;
                    } else if (trackInfo.getTrackType() == 4) {
                        this.mSelectSubtitleIndex = i2;
                    } else if (iOnInfoListener != null) {
                        iOnInfoListener.onInfo(4, 2000, (long) formatErrorCode(-10003), Long.valueOf(j));
                        return;
                    } else {
                        return;
                    }
                    this.mMediaPlayer.selectTrack(i2);
                    if (iOnInfoListener != null) {
                        iOnInfoListener.onInfo(4, 1000, 0, Long.valueOf(j));
                    }
                } else if (iOnInfoListener != null) {
                    iOnInfoListener.onInfo(4, 2000, (long) formatErrorCode(-10002), Long.valueOf(j));
                }
            } else {
                TPBaseLogger tPBaseLogger2 = this.mLogger;
                tPBaseLogger2.error("selectTrack, illegal state:" + this.mState);
            }
        } else {
            int i3 = i - size;
            try {
                selectSubTrack(i3, j);
            } catch (Exception e2) {
                this.mLogger.printException(e2);
                if (iOnInfoListener != null) {
                    iOnInfoListener.onInfo(4, 2000, (long) formatErrorCode(-10000), Long.valueOf(j));
                }
            }
            int i4 = this.mCurSubTrackIndex;
            if (i4 >= 0 && i4 < size2) {
                this.mSubTrackInfo.get(i4).info.isSelected = false;
            }
            this.mSubTrackInfo.get(i3).info.isSelected = true;
            this.mCurSubTrackIndex = i;
        }
    }

    public void setAudioGainRatio(float f) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("setAudioGainRatio, : " + f);
        this.mAudioGain = f;
        try {
            if (this.mMediaPlayer != null) {
                MediaPlayer mediaPlayer = this.mMediaPlayer;
                float f2 = this.mAudioGain;
                mediaPlayer.setVolume(f2, f2);
            }
        } catch (IllegalStateException e) {
            TPBaseLogger tPBaseLogger2 = this.mLogger;
            tPBaseLogger2.info("setAudioGainRatio ex : " + e.toString());
        }
    }

    public void setAudioNormalizeVolumeParams(String str) {
        this.mLogger.info("setAudioNormalizeVolumeParams not supported.");
    }

    public void setDataSource(String str) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("setDataSource， url: " + str);
        this.mUrl = str;
        this.mMediaPlayer.setDataSource(str);
        this.mTpSystemCapture = new TPSystemCapture(str);
        PlayerState playerState = PlayerState.INITIALIZED;
        this.mState = playerState;
        this.mMediaPlayerState = playerState;
    }

    public void setLoopback(boolean z) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("setLoopback, : " + z);
        this.mIsLoopback = z;
        this.mMediaPlayer.setLooping(z);
    }

    public void setOnAudioPcmOutputListener(ITPPlayerBaseListener.IOnAudioPcmOutListener iOnAudioPcmOutListener) {
        throw new IllegalStateException("system Mediaplayer cannot support audio frame out");
    }

    public void setOnAudioProcessOutputListener(ITPPlayerBaseListener.IOnAudioProcessOutListener iOnAudioProcessOutListener) {
        throw new IllegalStateException("system Mediaplayer cannot support audio postprocess frame out");
    }

    public void setOnCompletionListener(ITPPlayerBaseListener.IOnCompletionListener iOnCompletionListener) {
        this.mOnCompletionListener = iOnCompletionListener;
    }

    public void setOnDemuxerListener(ITPPlayerBaseListener.IOnDemuxerListener iOnDemuxerListener) {
    }

    public void setOnDetailInfoListener(ITPPlayerBaseListener.IOnDetailInfoListener iOnDetailInfoListener) {
    }

    public void setOnErrorListener(ITPPlayerBaseListener.IOnErrorListener iOnErrorListener) {
        this.mOnErrorListener = iOnErrorListener;
    }

    public void setOnEventRecordListener(ITPPlayerBaseListener.IOnEventRecordListener iOnEventRecordListener) {
    }

    public void setOnInfoListener(ITPPlayerBaseListener.IOnInfoListener iOnInfoListener) {
        this.mOnInfoListener = iOnInfoListener;
    }

    public void setOnPreparedListener(ITPPlayerBaseListener.IOnPreparedListener iOnPreparedListener) {
        this.mOnPreparedListener = iOnPreparedListener;
    }

    public void setOnSeekCompleteListener(ITPPlayerBaseListener.IOnSeekCompleteListener iOnSeekCompleteListener) {
        this.mOnSeekCompleteListener = iOnSeekCompleteListener;
    }

    public void setOnSubtitleDataListener(ITPPlayerBaseListener.IOnSubtitleDataListener iOnSubtitleDataListener) {
        this.mOnSubtitleDataListener = iOnSubtitleDataListener;
    }

    public void setOnSubtitleFrameOutListener(ITPPlayerBaseListener.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
        this.mOnSubtitleFrameOutListener = iOnSubtitleFrameOutListener;
    }

    public void setOnVideoFrameOutListener(ITPPlayerBaseListener.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        throw new IllegalStateException("system Mediaplayer cannot support video frame out");
    }

    public void setOnVideoProcessOutputListener(ITPPlayerBaseListener.IOnVideoProcessOutListener iOnVideoProcessOutListener) {
        throw new IllegalStateException("system Mediaplayer cannot support video postprocess frame out");
    }

    public void setOnVideoSizeChangedListener(ITPPlayerBaseListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
        this.mOnVideoSizeChangedListener = iOnVideoSizeChangedListener;
    }

    public void setOutputMute(boolean z) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("setOutputMute, : " + z);
        this.mMute = z;
        if (z) {
            try {
                this.mMediaPlayer.setVolume(0.0f, 0.0f);
                this.mLogger.info("setOutputMute, true");
            } catch (Exception e) {
                TPBaseLogger tPBaseLogger2 = this.mLogger;
                tPBaseLogger2.info("setOutputMute, Exception: " + e.toString());
            }
        } else {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            float f = this.mAudioGain;
            mediaPlayer.setVolume(f, f);
            TPBaseLogger tPBaseLogger3 = this.mLogger;
            tPBaseLogger3.info("setOutputMute, false, mAudioGain: " + this.mAudioGain);
        }
    }

    public void setPlaySharpenSwitch() {
    }

    public void setPlaySpeedRatio(float f) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("setPlaySpeedRatio, : " + f);
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            TPBaseLogger tPBaseLogger2 = this.mLogger;
            tPBaseLogger2.info("os version is too low: " + i);
            return;
        }
        this.mPlaySpeed = f;
        TPBaseLogger tPBaseLogger3 = this.mLogger;
        tPBaseLogger3.info("setPlaySpeedRatio play speed:" + f);
        try {
            PlaybackParams playbackParams = this.mMediaPlayer.getPlaybackParams();
            if (playbackParams.getSpeed() != f) {
                playbackParams.setSpeed(f);
                this.mMediaPlayer.setPlaybackParams(playbackParams);
            }
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
    }

    public void setPlayerOptionalParam(TPOptionalParam tPOptionalParam) {
        int key = tPOptionalParam.getKey();
        if (key == 1) {
            this.mCgiDuration = tPOptionalParam.getParamLong().value;
        } else if (key == 2) {
            this.mCgiVideoWidth = (int) tPOptionalParam.getParamLong().value;
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.info("setPlayerOptionalParam, video width:" + this.mCgiVideoWidth);
        } else if (key == 3) {
            this.mCgiVideoHeight = (int) tPOptionalParam.getParamLong().value;
            TPBaseLogger tPBaseLogger2 = this.mLogger;
            tPBaseLogger2.info("setPlayerOptionalParam, video height:" + this.mCgiVideoHeight);
        } else if (key == 4) {
            this.mIsLive = tPOptionalParam.getParamBoolean().value;
            this.mIsNotSeekable = true;
            TPBaseLogger tPBaseLogger3 = this.mLogger;
            tPBaseLogger3.info("setPlayerOptionalParam, is live:" + this.mIsLive);
        } else if (key == 5) {
            this.mIsAllowCheckBuffingByPosition = tPOptionalParam.getParamBoolean().value;
        } else if (key == 7) {
            this.mCheckBufferFrequent = (int) (tPOptionalParam.getParamLong().value / 400);
            TPBaseLogger tPBaseLogger4 = this.mLogger;
            tPBaseLogger4.info("setPlayerOptionalParam, on buffer timeout:" + tPOptionalParam.getParamLong().value + "(ms)");
        } else if (key == 100) {
            this.mStartPositionMs = (int) tPOptionalParam.getParamLong().value;
            TPBaseLogger tPBaseLogger5 = this.mLogger;
            tPBaseLogger5.info("setPlayerOptionalParam, start position:" + this.mStartPositionMs);
        } else if (key == 107) {
            this.mCheckBufferTimeroutFrequent = (int) ((tPOptionalParam.getParamLong().value + 400) / 400);
            TPBaseLogger tPBaseLogger6 = this.mLogger;
            tPBaseLogger6.info("setPlayerOptionalParam, buffer timeout:" + tPOptionalParam.getParamLong().value + "(ms)");
        } else if (key == 128) {
            this.mIntervalCheckPreparingTimeOut = tPOptionalParam.getParamLong().value;
            TPBaseLogger tPBaseLogger7 = this.mLogger;
            tPBaseLogger7.info("setPlayerOptionalParam, prepare timeout:" + this.mIntervalCheckPreparingTimeOut + "(ms)");
        } else if (key == 414) {
            this.mAttributes = (TPAudioAttributes) tPOptionalParam.getParamObject().objectValue;
            TPBaseLogger tPBaseLogger8 = this.mLogger;
            tPBaseLogger8.info("setPlayerOptionalParam, " + this.mAttributes.toString());
        } else if (key == 450) {
            int i = (int) tPOptionalParam.getParamLong().value;
            ITPSysPlayerExternalSubtitle iTPSysPlayerExternalSubtitle = this.mExtSub;
            if (iTPSysPlayerExternalSubtitle != null) {
                iTPSysPlayerExternalSubtitle.setSubtitleType(i);
            }
            TPLogUtil.m21897i(TAG, "setPlayerOptionalParam, subtitle type:" + tPOptionalParam.getParamLong().value);
        } else if (key == 500) {
            this.mSkipEndPositionMs = tPOptionalParam.getParamLong().value;
            TPBaseLogger tPBaseLogger9 = this.mLogger;
            tPBaseLogger9.info("setPlayerOptionalParam, skip end position:" + this.mSkipEndPositionMs);
        } else if (key == 507) {
            TPSubtitleRenderModel tPSubtitleRenderModel = (TPSubtitleRenderModel) tPOptionalParam.getParamObject().objectValue;
            ITPSysPlayerExternalSubtitle iTPSysPlayerExternalSubtitle2 = this.mExtSub;
            if (iTPSysPlayerExternalSubtitle2 != null) {
                iTPSysPlayerExternalSubtitle2.setSubtitleRenderModel(tPSubtitleRenderModel);
            }
            TPLogUtil.m21897i(TAG, "setPlayerOptionalParam, subtitle render model");
        }
    }

    public void setSurface(Surface surface, @TPCommonEnum.TPSurfaceType int i) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("setSurface, surface: " + surface);
        this.mSurfaceObj = surface;
        this.mMediaPlayer.setSurface(surface);
        TPBaseLogger tPBaseLogger2 = this.mLogger;
        tPBaseLogger2.info("setSurface over, surface: " + surface);
    }

    public void setSurfaceHolder(SurfaceHolder surfaceHolder) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("setSurfaceHolder, sh: " + surfaceHolder);
        this.mSurfaceObj = surfaceHolder;
        this.mMediaPlayer.setDisplay(surfaceHolder);
        TPBaseLogger tPBaseLogger2 = this.mLogger;
        tPBaseLogger2.info("setSurfaceHolder over, sh: " + surfaceHolder);
    }

    public void start() {
        this.mLogger.info("start ");
        if (this.mSuspend) {
            ResetActionInfo resetActionInfo = this.mLastestAction;
            if (resetActionInfo != null) {
                resetActionInfo.state = PlayerState.STARTED;
            }
            this.mLogger.warn("system player is busy.");
        } else if (this.mState == PlayerState.PREPARED || this.mState == PlayerState.PAUSED) {
            ITPSysPlayerExternalSubtitle iTPSysPlayerExternalSubtitle = this.mExtSub;
            if (iTPSysPlayerExternalSubtitle != null) {
                iTPSysPlayerExternalSubtitle.startAsync();
            }
            this.mMediaPlayer.start();
            PlayerState playerState = PlayerState.STARTED;
            this.mState = playerState;
            this.mMediaPlayerState = playerState;
            float f = this.mPlaySpeed;
            if (((double) f) != 1.0d) {
                setPlaySpeedRatio(f);
            }
            startCheckBufferingTimer();
        } else {
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.warn("start(), illegal state, state:" + this.mState);
        }
    }

    public synchronized void stop() {
        this.mLogger.info("stop ");
        destroyCheckPrepareTimeoutTimer();
        destroyCheckBuffingTimer();
        destroyCheckBufferTimeOutByInfo();
        this.mState = PlayerState.STOPPED;
        mediaPlayerstop();
        this.mCurAudioTrackIndex = 0;
        this.mCurSubTrackIndex = -1;
        this.mLastestAction = null;
        this.mSelectSubtitleIndex = -1;
        this.mCurInnerAudioTrackIndex = -1;
        this.mExtSub.stop();
        this.mPosChangeCount = 0;
        this.mLogger.info("stop over.");
    }

    public void switchDefinition(ITPMediaAsset iTPMediaAsset, @TPCommonEnum.TPSwitchDefMode int i, long j) {
    }

    public void switchDefinition(String str, @TPCommonEnum.TPSwitchDefMode int i, long j) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("switchDefinition, defUrl: " + str);
        if (TextUtils.isEmpty(str)) {
            this.mLogger.info("switchDefinition, defUrl is null");
            return;
        }
        this.mUrl = str;
        ResetActionInfo resetActionInfo = new ResetActionInfo();
        resetActionInfo.opaque = j;
        resetActionInfo.externalAudioTrackIndex = this.mCurAudioTrackIndex;
        resetActionInfo.mResetType = 1;
        resetActionInfo.url = str;
        try {
            playerResetStart(resetActionInfo);
        } catch (Exception unused) {
            throw new IllegalStateException("playerResetStart");
        }
    }

    public void updateLoggerContext(TPLoggerContext tPLoggerContext) {
        this.mLogger.updateContext(new TPLoggerContext(tPLoggerContext, TAG));
    }

    public void addAudioTrackSource(String str, Map<String, String> map, String str2, List<TPOptionalParam> list) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            this.mLogger.error("addAudioTrackSource, illegal argument.");
            return;
        }
        TPTrackInfo tPTrackInfo = new TPTrackInfo();
        tPTrackInfo.name = str2;
        tPTrackInfo.isExclusive = true;
        tPTrackInfo.isInternal = false;
        tPTrackInfo.isSelected = false;
        tPTrackInfo.trackType = 2;
        ExternalTrackInfo externalTrackInfo = new ExternalTrackInfo();
        externalTrackInfo.info = tPTrackInfo;
        externalTrackInfo.url = str;
        externalTrackInfo.httpHeader = map;
        externalTrackInfo.paramData = list;
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("addAudioTrackSource, name:" + tPTrackInfo.name + ", url:" + str2);
        this.mAudioTrackInfo.add(externalTrackInfo);
    }

    public void addSubtitleSource(String str, Map<String, String> map, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            this.mLogger.error("addSubtitleSource, illegal argument.");
            return;
        }
        TPTrackInfo tPTrackInfo = new TPTrackInfo();
        tPTrackInfo.name = str3;
        tPTrackInfo.isExclusive = true;
        tPTrackInfo.isInternal = false;
        tPTrackInfo.isSelected = false;
        tPTrackInfo.trackType = 3;
        ExternalTrackInfo externalTrackInfo = new ExternalTrackInfo();
        externalTrackInfo.info = tPTrackInfo;
        externalTrackInfo.url = str;
        externalTrackInfo.httpHeader = map;
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("addSubtitleSource, name:" + tPTrackInfo.name + ", url:" + str3);
        this.mSubTrackInfo.add(externalTrackInfo);
    }

    public void setLoopback(boolean z, long j, long j2) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("setLoopback, : " + z + ", loopStart: " + j + ", loopEnd: " + j2);
        if (j >= 0) {
            long j3 = this.mBaseDuration;
            if (j <= j3 && j2 <= j3) {
                this.mIsLoopback = z;
                this.mLoopStartPositionMs = j;
                this.mLoopEndPositionMs = j2;
                this.mMediaPlayer.setLooping(z);
                return;
            }
        }
        throw new IllegalArgumentException("position error, must more than 0 and less than duration");
    }

    public void setDataSource(String str, Map<String, String> map) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("setDataSource httpHeader, url: " + str);
        this.mUrl = str;
        this.mHeader = map;
        this.mMediaPlayer.setDataSource(this.mContext, Uri.parse(str), this.mHeader);
        this.mTpSystemCapture = new TPSystemCapture(str);
        PlayerState playerState = PlayerState.INITIALIZED;
        this.mState = playerState;
        this.mMediaPlayerState = playerState;
    }

    public void seekTo(int i, @TPCommonEnum.TPSeekMode int i2) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("seekTo, position: " + i + ", mode: " + i2);
        if (this.mIsNotSeekable) {
            this.mLogger.info("current media is not seekable, ignore");
        } else if (this.mSuspend) {
            ResetActionInfo resetActionInfo = this.mLastestAction;
            if (resetActionInfo != null) {
                resetActionInfo.position = (long) i;
            }
        } else {
            seekToComm(this.mMediaPlayer, i, i2);
        }
    }

    public void switchDefinition(String str, Map<String, String> map, @TPCommonEnum.TPSwitchDefMode int i, long j) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("switchDefinition, defUrl: " + str);
        if (TextUtils.isEmpty(str)) {
            this.mLogger.info("switchDefinition, defUrl is null");
            return;
        }
        this.mUrl = str;
        ResetActionInfo resetActionInfo = new ResetActionInfo();
        resetActionInfo.opaque = j;
        resetActionInfo.externalAudioTrackIndex = this.mCurAudioTrackIndex;
        resetActionInfo.mResetType = 1;
        resetActionInfo.url = str;
        try {
            playerResetStart(resetActionInfo);
        } catch (Exception unused) {
            throw new IllegalStateException("playerResetStart");
        }
    }

    public void setDataSource(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.info("setDataSource pfd， pfd: " + parcelFileDescriptor.toString());
            this.mFd = parcelFileDescriptor.getFileDescriptor();
            this.mMediaPlayer.setDataSource(parcelFileDescriptor.getFileDescriptor());
            this.mTpSystemCapture = new TPSystemCapture(parcelFileDescriptor.getFileDescriptor());
            PlayerState playerState = PlayerState.INITIALIZED;
            this.mState = playerState;
            this.mMediaPlayerState = playerState;
            return;
        }
        this.mLogger.info("setDataSource pfd is null ");
        throw new IllegalArgumentException("pfd is null");
    }

    public void setDataSource(AssetFileDescriptor assetFileDescriptor) {
        if (assetFileDescriptor != null) {
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.info("setDataSource afd， afd: " + assetFileDescriptor.toString());
            this.mAssetFd = assetFileDescriptor;
            handleSetDataSourceWithAfd(assetFileDescriptor);
            this.mTpSystemCapture = new TPSystemCapture(assetFileDescriptor);
            PlayerState playerState = PlayerState.INITIALIZED;
            this.mState = playerState;
            this.mMediaPlayerState = playerState;
            return;
        }
        this.mLogger.info("setDataSource afd is null ");
        throw new IllegalArgumentException("afd is null");
    }

    public void setDataSource(ITPMediaAsset iTPMediaAsset) {
        throw new IllegalArgumentException("setDataSource by asset, android mediaplayer not support");
    }
}
