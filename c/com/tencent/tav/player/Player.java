package com.tencent.tav.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.tav.asset.Asset;
import com.tencent.tav.coremedia.CGRect;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.RenderContextParams;
import com.tencent.tav.player.IPlayer;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;

public class Player implements IPlayer, Handler.Callback {
    private static final int DEFAULT_MAX_CACHE_SIZE = 60;
    public static final String TAG = "PlayerThreadMain";
    public static final int TYPE_PROGRESS = 2;
    public static final int TYPE_STATES = 1;
    public static final int TYPE_VIEWPORT_UPDATE = 3;
    public static String time = "time";
    private AVPlayerActionAtItemEnd actionAtItemEnd;
    private Asset asset;
    private int bgColor;
    private PlayerItem currentItem;
    private ErrorMsg errMsg;
    private boolean loop;
    private AudioFocusHelper mAudioFocuser;
    private boolean mHasPostedSeek;
    private CMTime mLastSeekTargetTimeUs;
    public Handler mMainHandler;
    private CMTimeRange mPlayRange;
    private PlayerThread mPlayThread;
    private IPlayer.PlayerListener mPlayerListener;
    private IPlayer.PlayerStatus mPlayerStatus;
    private CMTime mPosition;
    private CMTime mSeekTargetTimeUs;
    private boolean muted;
    /* access modifiers changed from: private */
    public OnCompositionUpdateListener onCompositionUpdateListener;
    private PlayerLayer playerLayer;
    private float rate;
    private volatile boolean released;
    private PlayerStatus status;
    private OnViewportUpdateListener viewportUpdateListener;
    private float volume;

    public enum AVPlayerActionAtItemEnd {
        AVPlayerActionAtItemEndAdvance,
        AVPlayerActionAtItemEndPause,
        AVPlayerActionAtItemEndNone
    }

    public enum PlayerStatus {
        PlayerStatusUnknown,
        PlayerStatusReadyToPlay,
        PlayerStatusFailed
    }

    public Player(String str) {
        this(new PlayerItem(str));
    }

    private synchronized void checkAndReady() {
        if (this.mPlayerStatus == IPlayer.PlayerStatus.IDLE) {
            this.mPlayThread.sendMessage(1, FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT);
        }
    }

    public void bindLayer(PlayerLayer playerLayer2) {
        this.playerLayer = playerLayer2;
        this.currentItem.bindLayer(playerLayer2);
    }

    public synchronized IPlayer.PlayerStatus currentStatus() {
        return this.mPlayerStatus;
    }

    public CMTime currentTime() {
        PlayerThread playerThread = this.mPlayThread;
        return playerThread == null ? CMTime.CMTimeZero : playerThread.getPosition();
    }

    public synchronized CMTime duration() {
        Asset asset2;
        asset2 = this.asset;
        return asset2 == null ? CMTime.CMTimeZero : asset2.getDuration();
    }

    public void enAbleAudioFocus(Context context, boolean z) {
        if (!z) {
            AudioFocusHelper audioFocusHelper = this.mAudioFocuser;
            if (audioFocusHelper != null) {
                audioFocusHelper.release();
            }
        } else if (this.mAudioFocuser == null) {
            this.mAudioFocuser = new AudioFocusHelper(context, this);
        }
    }

    public int getBgColor() {
        return this.bgColor;
    }

    public PlayerItem getCurrentItem() {
        return this.currentItem;
    }

    public ErrorMsg getErrMsg() {
        return this.errMsg;
    }

    public CGRect getGlViewport() {
        PlayerThread playerThread = this.mPlayThread;
        if (playerThread == null) {
            return null;
        }
        return playerThread.getGlViewportRect();
    }

    public float getRate() {
        return this.rate;
    }

    public RenderContextParams getRenderContextParams() {
        PlayerThread playerThread = this.mPlayThread;
        if (playerThread != null) {
            return playerThread.getRenderContextParams();
        }
        return null;
    }

    public PlayerStatus getStatus() {
        return this.status;
    }

    public boolean handleMessage(Message message) {
        if (this.released) {
            return false;
        }
        int i = message.what;
        if (i == 1) {
            IPlayer.PlayerStatus playerStatus = this.mPlayerStatus;
            PlayerStatusMsg playerStatusMsg = (PlayerStatusMsg) message.obj;
            IPlayer.PlayerStatus playerStatus2 = playerStatusMsg.getPlayerStatus();
            this.mPlayerStatus = playerStatus2;
            if (playerStatus != IPlayer.PlayerStatus.PLAYING || (!(playerStatus2 == IPlayer.PlayerStatus.FINISHED || playerStatus2 == IPlayer.PlayerStatus.ERROR) || !this.loop)) {
                IPlayer.PlayerListener playerListener = this.mPlayerListener;
                if (playerListener != null) {
                    playerListener.onStatusChanged(playerStatus2);
                }
                if (this.mPlayerStatus == IPlayer.PlayerStatus.ERROR) {
                    this.errMsg = new ErrorMsg(-1, playerStatusMsg.getErrorMsg());
                }
            } else {
                synchronized (this) {
                    if (!this.mPlayThread.hasMessage(3) && !this.mPlayThread.hasMessage(6) && !this.mPlayThread.hasMessage(4) && !this.mPlayThread.hasMessage(11)) {
                        if (!this.mMainHandler.hasMessages(1)) {
                            CMTimeRange cMTimeRange = this.mPlayRange;
                            if (cMTimeRange == null || cMTimeRange.getDuration().getValue() <= 0) {
                                seekToTime(CMTime.CMTimeZero);
                            } else {
                                seekToTime(this.mPlayRange.getStart());
                            }
                            IPlayer.PlayerListener playerListener2 = this.mPlayerListener;
                            if (playerListener2 != null) {
                                playerListener2.onStatusChanged(IPlayer.PlayerStatus.REPLAY);
                            }
                            play();
                        }
                    }
                }
            }
        } else if (i == 2) {
            this.mPosition = (CMTime) message.obj;
            if (this.mPlayerListener != null && !this.mMainHandler.hasMessages(2)) {
                this.mPlayerListener.onPositionChanged(this.mPosition);
            }
            CMTimeRange cMTimeRange2 = this.mPlayRange;
            if (cMTimeRange2 != null && !this.mPosition.smallThan(cMTimeRange2.getEnd()) && isPlaying()) {
                if (this.loop) {
                    IPlayer.PlayerListener playerListener3 = this.mPlayerListener;
                    if (playerListener3 != null) {
                        playerListener3.onStatusChanged(IPlayer.PlayerStatus.REPLAY);
                    }
                    seekToTime(this.mPlayRange.getStart());
                } else {
                    pause();
                }
            }
        } else if (i != 3) {
            return false;
        } else {
            OnViewportUpdateListener onViewportUpdateListener = this.viewportUpdateListener;
            if (onViewportUpdateListener != null) {
                Object obj = message.obj;
                if (obj instanceof CGRect) {
                    onViewportUpdateListener.onViewportUpdate(((CGRect) obj).clone());
                }
            }
        }
        return true;
    }

    public synchronized boolean isPlaying() {
        return this.mPlayerStatus == IPlayer.PlayerStatus.PLAYING;
    }

    public synchronized boolean isReleased() {
        return this.released;
    }

    public synchronized void pause() {
        if (!this.released) {
            this.mPlayThread.removeReadSampleMessage();
            this.mPlayThread.enableScheduleNext(false);
            this.mPlayThread.sendMessage(3, FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void play() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.released     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            com.tencent.tav.coremedia.CMTimeRange r0 = r3.mPlayRange     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x001e
            com.tencent.tav.coremedia.CMTime r1 = r3.currentTime()     // Catch:{ all -> 0x002f }
            boolean r0 = r0.containsTime(r1)     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x001e
            com.tencent.tav.coremedia.CMTimeRange r0 = r3.mPlayRange     // Catch:{ all -> 0x002f }
            com.tencent.tav.coremedia.CMTime r0 = r0.getStart()     // Catch:{ all -> 0x002f }
            r3.seekToTime(r0)     // Catch:{ all -> 0x002f }
        L_0x001e:
            com.tencent.tav.player.PlayerThread r0 = r3.mPlayThread     // Catch:{ all -> 0x002f }
            r1 = 2
            java.lang.String r2 = "main"
            r0.sendMessage(r1, r2)     // Catch:{ all -> 0x002f }
            com.tencent.tav.player.AudioFocusHelper r0 = r3.mAudioFocuser     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x002d
            r0.requestFocus()     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r3)
            return
        L_0x002f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.player.Player.play():void");
    }

    public synchronized CMTime position() {
        PlayerThread playerThread;
        playerThread = this.mPlayThread;
        return playerThread == null ? CMTime.CMTimeZero : playerThread.getPosition();
    }

    public void prepare(PlayerPrepareListener playerPrepareListener) {
        IPlayer.PlayerStatus playerStatus = IPlayer.PlayerStatus.IDLE;
    }

    public void readSnapShootBitmap(OnReadSnapShootListener onReadSnapShootListener) {
        PlayerThread playerThread = this.mPlayThread;
        if (playerThread != null) {
            playerThread.sendMessage(24, onReadSnapShootListener, "readSnapShootBitmap");
        }
    }

    public void refreshSurface(Callback callback) {
        if (!this.released) {
            this.mPlayThread.sendMessage(26, callback, FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT);
        }
    }

    public synchronized void release() {
        release((Runnable) null);
    }

    public void replaceCurrentItemWithPlayerItem(PlayerItem playerItem) {
        update(playerItem, position());
    }

    public void seekToTime(CMTime cMTime) {
        seekToTime(cMTime, (Callback) null);
    }

    public void setBgColor(int i) {
        this.bgColor = i;
    }

    public void setGetTavExtraListener(OnGetTavExtraListener onGetTavExtraListener) {
        PlayerThread playerThread = this.mPlayThread;
        if (playerThread != null) {
            playerThread.sendMessage(25, onGetTavExtraListener, "setGetTavExtraListener");
        }
    }

    public synchronized void setLoop(boolean z) {
        this.loop = z;
    }

    public void setOnCompositionUpdateListener(OnCompositionUpdateListener onCompositionUpdateListener2) {
        this.onCompositionUpdateListener = onCompositionUpdateListener2;
    }

    public synchronized void setPlayRange(CMTimeRange cMTimeRange) {
        this.mPlayRange = cMTimeRange;
        if (cMTimeRange != null && !cMTimeRange.containsTime(currentTime()) && isPlaying()) {
            seekToTime(cMTimeRange.getStart());
        }
        this.mPlayThread.setPlayRange(cMTimeRange);
    }

    public void setPlayerListener(IPlayer.PlayerListener playerListener) {
        this.mPlayerListener = playerListener;
    }

    public void setRate(float f) {
        setRate(f, 60);
    }

    public void setRateAtTimeAndHostTime(float f, CMTime cMTime, CMTime cMTime2) {
    }

    public void setRenderContextParams(RenderContextParams renderContextParams) {
        PlayerThread playerThread = this.mPlayThread;
        if (playerThread != null) {
            playerThread.setRenderContextParams(renderContextParams);
        }
    }

    public void setViewportUpdateListener(OnViewportUpdateListener onViewportUpdateListener) {
        this.viewportUpdateListener = onViewportUpdateListener;
    }

    public synchronized void setVolume(float f) {
        if (!this.released) {
            this.mPlayThread.sendMessage(7, Float.valueOf(f), FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT);
        }
    }

    public synchronized void stop() {
        if (!this.released) {
            this.mPlayThread.sendMessage(4, Boolean.TRUE, FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT);
        }
    }

    public synchronized void update(PlayerItem playerItem, CMTime cMTime) {
        if (!this.released) {
            this.currentItem = playerItem;
            this.asset = playerItem.getAsset();
            this.currentItem.updateDecoderTrack();
            this.mMainHandler.removeMessages(2);
            this.mPlayThread.removePendingUpdateCompositionMessage();
            this.mPlayThread.updatePositionRightAway(cMTime);
            this.mPlayThread.removeReadSampleMessage();
            this.mPlayThread.enableScheduleNext(false);
            this.mPlayThread.sendMessage(11, new UpdateCompositionMessage(playerItem, this.onCompositionUpdateListener), "update clips");
            this.mLastSeekTargetTimeUs = CMTime.CMTimeZero;
        }
    }

    public synchronized void updateAllProperties() {
        if (!this.released) {
            this.mPlayThread.sendMessage(20, FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT);
        }
    }

    public synchronized void updateAudioClipsProperties() {
        if (!this.released) {
            this.mPlayThread.sendMessage(22, FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT);
        }
    }

    public synchronized void updateAudioVolumeProperties() {
        if (!this.released) {
            this.mPlayThread.sendMessage(23, FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT);
        }
    }

    public synchronized void updateProperties() {
        if (!this.released) {
            this.mPlayThread.sendMessage(10, FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT);
        }
    }

    public void updateViewport(int i, int i2) {
        if (!this.released) {
            this.mPlayThread.sendMessage(21, new CGSize((float) i, (float) i2), FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT);
        }
    }

    public int videoHeight() {
        PlayerItem playerItem = this.currentItem;
        if (playerItem == null) {
            return 0;
        }
        return (int) playerItem.getPresentationSize().height;
    }

    public int videoWidth() {
        PlayerItem playerItem = this.currentItem;
        if (playerItem == null) {
            return 0;
        }
        return (int) playerItem.getPresentationSize().width;
    }

    public synchronized void waitForRelease(long j) {
    }

    public Player(PlayerItem playerItem) {
        this.mPlayerStatus = IPlayer.PlayerStatus.IDLE;
        this.loop = false;
        this.released = false;
        this.bgColor = -16777216;
        this.currentItem = playerItem;
        this.mMainHandler = new Handler(Looper.getMainLooper(), this);
        this.asset = this.currentItem.getAsset();
        this.currentItem.start(this);
        this.mPlayThread = this.currentItem.getPlayerThreadMain();
    }

    public void seekToTime(CMTime cMTime, CMTime cMTime2, CMTime cMTime3) {
        seekToTime(cMTime, cMTime2, cMTime3, (Callback) null);
    }

    public void setRate(float f, int i) {
        IPlayer.PlayerStatus playerStatus = this.mPlayerStatus;
        if (playerStatus != IPlayer.PlayerStatus.PLAYING && playerStatus != IPlayer.PlayerStatus.PAUSED) {
            this.rate = f;
            this.currentItem.setRate(f, i);
        }
    }

    public synchronized void release(Runnable runnable) {
        if (!this.released) {
            this.released = true;
            this.mMainHandler.removeCallbacksAndMessages((Object) null);
            this.mMainHandler = null;
            this.mPlayThread.sendMessage(4, FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT);
            this.mPlayThread.sendMessage(6, runnable, FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT);
            this.mPlayThread = null;
            AudioFocusHelper audioFocusHelper = this.mAudioFocuser;
            if (audioFocusHelper != null) {
                audioFocusHelper.release();
            }
            PlayerItem playerItem = this.currentItem;
            if (playerItem != null) {
                playerItem.release();
            }
            this.currentItem = null;
        }
    }

    public void seekToTime(CMTime cMTime, Callback callback) {
        CMTime cMTime2 = CMTime.CMTimeZero;
        seekToTime(cMTime, cMTime2, cMTime2, callback);
    }

    public void seekToTime(CMTime cMTime, CMTime cMTime2, CMTime cMTime3, Callback callback) {
        if (!this.released) {
            this.mSeekTargetTimeUs = cMTime;
            this.mLastSeekTargetTimeUs = cMTime;
            this.mPlayThread.updatePositionRightAway(cMTime);
            this.mPlayThread.enableScheduleNext(true);
            this.mPlayThread.cancelAllPendingSeeks();
            this.mPlayThread.sendMessage(5, this.mSeekTargetTimeUs, FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT, callback);
        }
    }

    public synchronized void update(PlayerItem playerItem, CMTime cMTime, final OnCompositionUpdateListener onCompositionUpdateListener2) {
        if (!this.released) {
            this.currentItem = playerItem;
            this.asset = playerItem.getAsset();
            this.currentItem.updateDecoderTrack();
            this.mMainHandler.removeMessages(2);
            this.mPlayThread.removePendingUpdateCompositionMessage();
            this.mPlayThread.updatePositionRightAway(cMTime);
            this.mPlayThread.removeReadSampleMessage();
            this.mPlayThread.enableScheduleNext(false);
            this.mPlayThread.sendMessage(11, new UpdateCompositionMessage(playerItem, new OnCompositionUpdateListener() {
                public void onUpdated(Player player, boolean z) {
                    OnCompositionUpdateListener onCompositionUpdateListener = onCompositionUpdateListener2;
                    if (onCompositionUpdateListener != null) {
                        onCompositionUpdateListener.onUpdated(player, z);
                    }
                    if (Player.this.onCompositionUpdateListener != null) {
                        Player.this.onCompositionUpdateListener.onUpdated(player, z);
                    }
                }
            }), "update clips");
            this.mLastSeekTargetTimeUs = CMTime.CMTimeZero;
        }
    }
}
