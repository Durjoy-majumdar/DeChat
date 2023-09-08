package com.tencent.tavkit.component;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tav.player.IPlayer;
import com.tencent.tav.player.OnCompositionUpdateListener;
import com.tencent.tav.player.Player;
import com.tencent.tav.player.PlayerItem;
import com.tencent.tav.player.PlayerLayer;
import com.tencent.tavkit.composition.TAVComposition;
import com.tencent.tavkit.composition.TAVSource;
import com.tencent.tavkit.composition.builder.TAVCompositionBuilder;

public class TAVPlayer {
    public static final int VIDEO_PLAYER_HEIGHT = 960;
    public static final int VIDEO_PLAYER_WIDTH = 540;
    /* access modifiers changed from: private */
    public final String TAG = ("GameTemplatePlayer@" + Integer.toHexString(hashCode()));
    private AudioManager.OnAudioFocusChangeListener audioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        public void onAudioFocusChange(int i) {
            if (i == -2 || i == -1) {
                if (TAVPlayer.this.isAllowInterrupt && TAVPlayer.this.player != null) {
                    TAVPlayer.this.player.pause();
                }
            } else if (i == 1 && TAVPlayer.this.player != null) {
                TAVPlayer.this.player.play();
            }
        }
    };
    private AudioManager audioManager;
    private boolean audioTracksMerge = true;
    private int bgColor = -16777216;
    private OnCompositionUpdateListener compositionUpdateListener;
    private Context context;
    /* access modifiers changed from: private */
    public boolean isAllowInterrupt = true;
    private boolean isAutoPlay = true;
    /* access modifiers changed from: private */
    public boolean isResetting = false;
    private boolean loopPlay = false;
    private FrameLayout mPlayerLayout;
    private CMTimeRange playRange;
    /* access modifiers changed from: private */
    public Player player;
    private IPlayer.PlayerListener playerListener;
    private CMTime position = CMTime.CMTimeZero;
    private PostUpdateThread postUpdateThread;
    private float rate = 1.0f;
    private Surface surface;
    private int surfaceHeight;
    private int surfaceWidth;
    private TAVComposition tavComposition;
    private boolean videoTracksMerge = true;
    private float volume = 1.0f;

    public interface ICompositionBuilder extends OnCompositionUpdateListener {
        TAVComposition buildComposition();
    }

    public interface PlayerListener {
        void onPositionChanged(CMTime cMTime, CMTime cMTime2);

        void onStatusChanged(IPlayer.PlayerStatus playerStatus, Player player);
    }

    public class PostUpdateThread extends HandlerThread implements Handler.Callback {
        private static final int MSG_UNLOCK = 95;
        private static final int MSG_UPDATE = 223;
        private boolean autoPlay;
        private Handler handler;
        private volatile boolean msgLock;
        private ICompositionBuilder templateSource;

        private void doUnlockMsg() {
            if (this.msgLock) {
                this.msgLock = false;
                ICompositionBuilder iCompositionBuilder = this.templateSource;
                if (iCompositionBuilder != null) {
                    update(iCompositionBuilder, this.autoPlay);
                }
            }
        }

        private void doUpdateComposition(final ICompositionBuilder iCompositionBuilder, boolean z) {
            unlockMsg(1000);
            TAVPlayer.this.updateComposition(iCompositionBuilder.buildComposition(), CMTime.CMTimeZero, z, new OnCompositionUpdateListener() {
                public void onUpdated(Player player, boolean z) {
                    iCompositionBuilder.onUpdated(player, z);
                    PostUpdateThread.this.unlockMsg(0);
                }
            });
        }

        private void doUpdateMsg() {
            if (!this.msgLock && this.templateSource != null) {
                String unused = TAVPlayer.this.TAG;
                this.msgLock = true;
                doUpdateComposition(this.templateSource, this.autoPlay);
                this.templateSource = null;
                this.autoPlay = false;
            }
        }

        /* access modifiers changed from: private */
        public synchronized void unlockMsg(int i) {
            String access$500 = TAVPlayer.this.TAG;
            Logger.m144641d(access$500, "unlockMsg() called thread = " + Thread.currentThread().getName());
            this.handler.removeMessages(95);
            this.handler.sendEmptyMessageDelayed(95, (long) i);
        }

        /* access modifiers changed from: private */
        public synchronized void update(ICompositionBuilder iCompositionBuilder, boolean z) {
            String access$500 = TAVPlayer.this.TAG;
            Logger.m144641d(access$500, "update() called with: thread = " + Thread.currentThread().getName() + ", templateSource = [" + iCompositionBuilder + "], autoPlay = [" + z + "]");
            this.templateSource = iCompositionBuilder;
            this.autoPlay = z;
            this.handler.removeMessages(223);
            this.handler.sendEmptyMessage(223);
        }

        public boolean handleMessage(Message message) {
            String access$500 = TAVPlayer.this.TAG;
            Logger.m144641d(access$500, "handleMessage() called with: msg = [" + message + "] msgLock = " + this.msgLock + ",templateSource = " + this.templateSource);
            int i = message.what;
            if (i == 95) {
                doUnlockMsg();
                return true;
            } else if (i != 223) {
                return true;
            } else {
                doUpdateMsg();
                return true;
            }
        }

        public void onLooperPrepared() {
            super.onLooperPrepared();
        }

        public void release() {
            this.templateSource = null;
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages((Object) null);
                this.handler = null;
            }
            quit();
        }

        public synchronized void start() {
            super.start();
            this.handler = new Handler(getLooper(), this);
        }

        private PostUpdateThread(String str) {
            super(str);
            this.msgLock = false;
        }
    }

    public TAVPlayer() {
    }

    private void abandonAudioFocus() {
        AudioManager audioManager2 = this.audioManager;
        if (audioManager2 != null) {
            audioManager2.abandonAudioFocus(this.audioFocusChangeListener);
        }
    }

    private PlayerItem buildPlayerItem(TAVComposition tAVComposition) {
        String str = this.TAG;
        Logger.m144641d(str, "buildPlayerItem() called with: tavComposition = [" + tAVComposition + "]");
        TAVCompositionBuilder tAVCompositionBuilder = new TAVCompositionBuilder(tAVComposition);
        tAVCompositionBuilder.setVideoTracksMerge(this.videoTracksMerge);
        tAVCompositionBuilder.setAudioTracksMerge(this.audioTracksMerge);
        TAVSource buildSource = tAVCompositionBuilder.buildSource();
        PlayerItem playerItem = new PlayerItem(buildSource.getAsset());
        playerItem.setVideoComposition(buildSource.getVideoComposition());
        playerItem.setAudioMix(buildSource.getAudioMix());
        return playerItem;
    }

    private void initContentView() {
        FrameLayout frameLayout = this.mPlayerLayout;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            TextureView textureView = new TextureView(this.context);
            textureView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.mPlayerLayout.addView(textureView);
            textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
                private final String TAG = ("GameTextureView@" + Integer.toHexString(hashCode()));

                public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                    TAVPlayer.this.onSurfaceCreate(new Surface(surfaceTexture), i2, i);
                }

                public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    TAVPlayer.this.onSurfaceDestory();
                    return false;
                }

                public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                    TAVPlayer.this.onSurfaceSizeChanged(i, i2);
                }

                public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }
            });
        }
    }

    private Player newPlayer(PlayerItem playerItem, CMTime cMTime, boolean z) {
        String str = this.TAG;
        Logger.m144641d(str, "newPlayer() called with: playerItem = [" + playerItem + "], position = [" + cMTime + "], autoPlay = [" + z + "]");
        Player player2 = new Player(playerItem);
        player2.setPlayerListener(this.playerListener);
        player2.setLoop(this.loopPlay);
        player2.setRate(this.rate);
        player2.setBgColor(this.bgColor);
        player2.setPlayRange(this.playRange);
        player2.setVolume(this.volume);
        player2.seekToTime(cMTime);
        new PlayerLayer(this.surface, this.surfaceWidth, this.surfaceHeight).setPlayer(player2);
        if (z && requestAudioFocus()) {
            player2.play();
        }
        OnCompositionUpdateListener onCompositionUpdateListener = this.compositionUpdateListener;
        if (onCompositionUpdateListener != null) {
            onCompositionUpdateListener.onUpdated(player2, false);
        }
        this.isResetting = false;
        return player2;
    }

    private boolean requestAudioFocus() {
        Context context2 = this.context;
        if (context2 == null) {
            return true;
        }
        if (this.audioManager == null) {
            this.audioManager = (AudioManager) context2.getSystemService("audio");
        }
        return this.audioManager.requestAudioFocus(this.audioFocusChangeListener, 3, 1) == 1;
    }

    public synchronized IPlayer.PlayerStatus getCurrentStatus() {
        Player player2 = this.player;
        if (player2 == null) {
            return IPlayer.PlayerStatus.ERROR;
        }
        return player2.currentStatus();
    }

    public synchronized CMTime getDuration() {
        Player player2 = this.player;
        if (player2 != null) {
            return player2.duration();
        }
        return CMTime.CMTimeZero;
    }

    public synchronized CMTime getPosition() {
        Player player2 = this.player;
        if (player2 != null) {
            return player2.position();
        }
        return CMTime.CMTimeInvalid;
    }

    public synchronized float getVolume() {
        return this.volume;
    }

    public synchronized boolean isPlaying() {
        Player player2 = this.player;
        if (player2 == null) {
            return false;
        }
        return player2.isPlaying();
    }

    public boolean isResetting() {
        return this.isResetting;
    }

    public void onSurfaceCreate(Surface surface2, int i, int i2) {
        this.surfaceWidth = i2;
        this.surfaceHeight = i;
        this.surface = surface2;
        updateComposition(this.tavComposition, this.position, this.isAutoPlay, this.compositionUpdateListener);
    }

    public void onSurfaceDestory() {
        Player player2 = this.player;
        if (player2 != null && !player2.isReleased()) {
            this.position = this.player.position();
            this.player.release();
        }
        this.surface = null;
    }

    public void onSurfaceSizeChanged(int i, int i2) {
        Player player2 = this.player;
        if (player2 != null) {
            player2.updateViewport(i, i2);
        }
    }

    public synchronized void pause() {
        String str = this.TAG;
        Logger.m144641d(str, "pause: player = " + this.player);
        if (this.player != null) {
            abandonAudioFocus();
            this.player.pause();
        } else {
            this.isAutoPlay = false;
        }
    }

    public synchronized void play() {
        String str = this.TAG;
        Logger.m144641d(str, "play: player = " + this.player);
        if (this.player == null) {
            this.isAutoPlay = true;
        } else if (requestAudioFocus()) {
            this.player.play();
        }
    }

    public synchronized void postUpdate(final TAVComposition tAVComposition, boolean z) {
        postUpdate((ICompositionBuilder) new ICompositionBuilder() {
            public TAVComposition buildComposition() {
                return tAVComposition;
            }

            public void onUpdated(Player player, boolean z) {
            }
        }, z);
    }

    public synchronized void release() {
        String str = this.TAG;
        Logger.m144641d(str, "release: player = " + this.player);
        Player player2 = this.player;
        if (player2 != null) {
            this.position = player2.position();
            abandonAudioFocus();
            this.player.release();
            this.player = null;
        }
        PostUpdateThread postUpdateThread2 = this.postUpdateThread;
        if (postUpdateThread2 != null) {
            postUpdateThread2.quit();
            this.postUpdateThread = null;
        }
        this.isResetting = false;
    }

    public synchronized void reset() {
        this.isResetting = true;
        initContentView();
    }

    public void seekToTime(CMTime cMTime) {
        String str = this.TAG;
        Logger.m144641d(str, "seekToTime() called with: cmTime = [" + cMTime + "],player = " + this.player);
        Player player2 = this.player;
        if (player2 != null) {
            player2.seekToTime(cMTime);
        }
    }

    public void setAllowInterrupt(boolean z) {
        this.isAllowInterrupt = z;
    }

    public void setAudioTracksMerge(boolean z) {
        this.audioTracksMerge = z;
    }

    public synchronized void setAutoPlay(boolean z) {
        this.isAutoPlay = z;
    }

    public void setBgColor(int i) {
        this.bgColor = i;
        Player player2 = this.player;
        if (player2 != null) {
            player2.setBgColor(i);
        }
    }

    public synchronized void setLoopPlay(boolean z) {
        String str = this.TAG;
        Logger.m144641d(str, "setLoopPlay() called with: loopPlay = [" + z + "],player = " + this.player);
        this.loopPlay = z;
        Player player2 = this.player;
        if (player2 != null) {
            player2.setLoop(z);
        }
    }

    public synchronized void setPlayRange(CMTimeRange cMTimeRange) {
        String str = this.TAG;
        Logger.m144641d(str, "setPlayRange() called with: playRange = [" + cMTimeRange + "],player = " + this.player);
        this.playRange = cMTimeRange;
        Player player2 = this.player;
        if (player2 != null) {
            player2.setPlayRange(cMTimeRange);
        }
    }

    public void setPlayerListener(final PlayerListener playerListener2) {
        String str = this.TAG;
        Logger.m144641d(str, "setPlayerListener() called with: playerListener = [" + playerListener2 + "],player = " + this.player);
        setPlayerListener((IPlayer.PlayerListener) new IPlayer.PlayerListener() {
            public void onPositionChanged(CMTime cMTime) {
                if (playerListener2 != null && TAVPlayer.this.player != null) {
                    playerListener2.onPositionChanged(cMTime, TAVPlayer.this.player.duration());
                }
            }

            public void onStatusChanged(IPlayer.PlayerStatus playerStatus) {
                if (playerListener2 != null && TAVPlayer.this.player != null) {
                    playerListener2.onStatusChanged(playerStatus, TAVPlayer.this.player);
                }
            }
        });
    }

    public synchronized void setRate(float f) {
        String str = this.TAG;
        Logger.m144641d(str, "setLoopPlay() called with: loopPlay = [" + this.loopPlay + "],player = " + this.player);
        this.rate = f;
        Player player2 = this.player;
        if (player2 != null) {
            player2.setRate(f);
        }
    }

    public void setVideoTracksMerge(boolean z) {
        this.videoTracksMerge = z;
    }

    public synchronized void setVolume(float f) {
        String str = this.TAG;
        Logger.m144641d(str, "setVolume() called with: volume = [" + f + "],player = " + this.player);
        this.volume = f;
        Player player2 = this.player;
        if (player2 != null) {
            player2.setVolume(f);
        }
    }

    public void updateComposition(TAVComposition tAVComposition, boolean z) {
        updateComposition(tAVComposition, CMTime.CMTimeZero, z);
    }

    public void updateComposition(TAVComposition tAVComposition, CMTime cMTime, boolean z) {
        updateComposition(tAVComposition, cMTime, z, (OnCompositionUpdateListener) null);
    }

    private void setPlayerListener(IPlayer.PlayerListener playerListener2) {
        String str = this.TAG;
        Logger.m144641d(str, "setPlayerListener() called with: playerListener = [" + playerListener2 + "],player = " + this.player);
        this.playerListener = playerListener2;
        Player player2 = this.player;
        if (player2 != null) {
            player2.setPlayerListener(playerListener2);
        }
    }

    public synchronized void postUpdate(ICompositionBuilder iCompositionBuilder, boolean z) {
        if (this.postUpdateThread == null) {
            PostUpdateThread postUpdateThread2 = new PostUpdateThread("PostUpdateThread");
            this.postUpdateThread = postUpdateThread2;
            postUpdateThread2.start();
        }
        this.postUpdateThread.update(iCompositionBuilder, z);
    }

    public void updateComposition(TAVComposition tAVComposition, final CMTime cMTime, final boolean z, OnCompositionUpdateListener onCompositionUpdateListener) {
        String str = this.TAG;
        Logger.m144641d(str, "updateComposition() called with: tavComposition = [" + tAVComposition + "], position = [" + cMTime + "], autoPlay = [" + z + "]");
        this.tavComposition = tAVComposition;
        this.position = cMTime;
        this.compositionUpdateListener = onCompositionUpdateListener;
        if (tAVComposition == null) {
            this.isResetting = false;
        } else if (this.surface == null) {
            this.isAutoPlay = z;
            this.isResetting = false;
        } else {
            PlayerItem buildPlayerItem = buildPlayerItem(tAVComposition);
            Player player2 = this.player;
            if (player2 == null || player2.isReleased()) {
                this.player = newPlayer(buildPlayerItem, cMTime, z);
                return;
            }
            Player player3 = this.player;
            if (onCompositionUpdateListener == null) {
                onCompositionUpdateListener = new OnCompositionUpdateListener() {
                    public void onUpdated(Player player, boolean z) {
                        TAVPlayer.this.seekToTime(cMTime);
                        if (z && z) {
                            TAVPlayer.this.play();
                        }
                        boolean unused = TAVPlayer.this.isResetting = false;
                    }
                };
            }
            player3.update(buildPlayerItem, cMTime, onCompositionUpdateListener);
            this.compositionUpdateListener = null;
        }
    }

    public TAVPlayer(Surface surface2, int i, int i2) {
        onSurfaceCreate(surface2, i2, i);
    }

    public TAVPlayer(FrameLayout frameLayout) {
        this.context = frameLayout.getContext();
        this.mPlayerLayout = frameLayout;
        initContentView();
    }
}
