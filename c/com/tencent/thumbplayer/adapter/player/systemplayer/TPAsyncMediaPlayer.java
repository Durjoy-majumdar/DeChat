package com.tencent.thumbplayer.adapter.player.systemplayer;

import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.tencent.thumbplayer.utils.TPLogUtil;
import com.tencent.thumbplayer.utils.TPThreadPool;
import java.lang.ref.WeakReference;

public class TPAsyncMediaPlayer extends TPMediaPlayer {
    private static final String TAG = "TPThumbPlayer[TPAsyncMediaPlayer.java]";
    private static final int TP_MEDIAPLAYER_MSG_PAUSE = 3;
    private static final int TP_MEDIAPLAYER_MSG_RELEASE = 8;
    private static final int TP_MEDIAPLAYER_MSG_RESET = 7;
    private static final int TP_MEDIAPLAYER_MSG_SEEK = 4;
    private static final int TP_MEDIAPLAYER_MSG_SEEK_BY_MODE = 5;
    private static final int TP_MEDIAPLAYER_MSG_SETSURFACE = 1;
    private static final int TP_MEDIAPLAYER_MSG_SET_PLAY_PARAM = 9;
    private static final int TP_MEDIAPLAYER_MSG_START = 2;
    private static final int TP_MEDIAPLAYER_MSG_STOP = 6;
    private static final int WAIT_STOP_TIMEOUT = 2500;
    private EventHandler mEventHandler = new EventHandler(this.mHandlerThread.getLooper(), this);
    private HandlerThread mHandlerThread = TPThreadPool.getInstance().obtainShareThread();
    /* access modifiers changed from: private */
    public boolean mIsSeeking = false;
    private long mLastSeekPos = 0;
    /* access modifiers changed from: private */
    public MediaPlayer.OnSeekCompleteListener mOnSeekCompleteListener;
    private MediaPlayer.OnSeekCompleteListener mOnSeekCompleteListenerInner = new MediaPlayer.OnSeekCompleteListener() {
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            synchronized (TPAsyncMediaPlayer.this.mStateLock) {
                boolean unused = TPAsyncMediaPlayer.this.mIsSeeking = false;
            }
            MediaPlayer.OnSeekCompleteListener access$200 = TPAsyncMediaPlayer.this.mOnSeekCompleteListener;
            if (access$200 != null) {
                access$200.onSeekComplete(mediaPlayer);
            }
        }
    };
    private final Object mReleaseCondition = new Object();
    private final Object mResetCondition = new Object();
    /* access modifiers changed from: private */
    public final Object mStateLock = new Object();
    private final Object mStopCondition = new Object();

    public static class EventHandler extends Handler {
        private WeakReference<TPAsyncMediaPlayer> mWeakRef;

        public EventHandler(Looper looper, TPAsyncMediaPlayer tPAsyncMediaPlayer) {
            super(looper);
            this.mWeakRef = new WeakReference<>(tPAsyncMediaPlayer);
        }

        public void handleMessage(Message message) {
            TPLogUtil.m21897i(TPAsyncMediaPlayer.TAG, "EventHandler msg msg.what: " + message.what + ", value: " + message.what + ", arg1: " + message.arg1 + ", arg2: " + message.arg2);
            TPAsyncMediaPlayer tPAsyncMediaPlayer = this.mWeakRef.get();
            if (tPAsyncMediaPlayer == null) {
                TPLogUtil.m21894e(TPAsyncMediaPlayer.TAG, "mWeakRef is null");
                return;
            }
            switch (message.what) {
                case 1:
                    tPAsyncMediaPlayer.handleSetSurface(message);
                    return;
                case 2:
                    tPAsyncMediaPlayer.handleStart();
                    return;
                case 3:
                    tPAsyncMediaPlayer.handlePause();
                    return;
                case 4:
                    tPAsyncMediaPlayer.handleSeekTo(message);
                    return;
                case 5:
                    tPAsyncMediaPlayer.handleSeekToByMode(message);
                    return;
                case 6:
                    tPAsyncMediaPlayer.handleStop();
                    return;
                case 7:
                    tPAsyncMediaPlayer.handleReset();
                    return;
                case 8:
                    tPAsyncMediaPlayer.handleRelease();
                    return;
                case 9:
                    tPAsyncMediaPlayer.handleSetPlaybackParams(message);
                    return;
                default:
                    TPLogUtil.m21897i(TPAsyncMediaPlayer.TAG, "eventHandler unknow msg");
                    return;
            }
        }
    }

    public int getCurrentPosition() {
        return this.mIsSeeking ? (int) this.mLastSeekPos : super.getCurrentPosition();
    }

    public void handlePause() {
        try {
            super.pause();
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        }
    }

    public void handleRelease() {
        try {
            super.release();
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        }
        TPThreadPool.getInstance().recycle(this.mHandlerThread, this.mEventHandler);
        this.mHandlerThread = null;
        this.mEventHandler = null;
        synchronized (this.mReleaseCondition) {
            this.mReleaseCondition.notify();
        }
    }

    public void handleReset() {
        try {
            super.reset();
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        }
        synchronized (this.mResetCondition) {
            this.mResetCondition.notify();
        }
    }

    public void handleSeekTo(Message message) {
        synchronized (this.mStateLock) {
            try {
                super.seekTo(message.arg1);
            } catch (Exception e) {
                TPLogUtil.m21895e(TAG, (Throwable) e);
            }
        }
    }

    public void handleSeekToByMode(Message message) {
        synchronized (this.mStateLock) {
            try {
                super.seekTo(((Long) message.obj).longValue(), message.arg1);
            } catch (Exception e) {
                TPLogUtil.m21895e(TAG, (Throwable) e);
            }
        }
    }

    public void handleSetPlaybackParams(Message message) {
        try {
            super.setPlaybackParams((PlaybackParams) message.obj);
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        }
    }

    public void handleSetSurface(Message message) {
        super.setSurface((Surface) message.obj);
    }

    public void handleStart() {
        try {
            super.start();
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        }
    }

    public void handleStop() {
        try {
            super.stop();
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        }
        synchronized (this.mStopCondition) {
            this.mStopCondition.notify();
        }
    }

    public void pause() {
        this.mEventHandler.sendEmptyMessage(3);
    }

    public void release() {
        synchronized (this.mReleaseCondition) {
            this.mEventHandler.sendEmptyMessage(8);
            try {
                this.mReleaseCondition.wait(2500);
            } catch (InterruptedException e) {
                TPLogUtil.m21895e(TAG, (Throwable) e);
            }
        }
    }

    public void reset() {
        synchronized (this.mResetCondition) {
            this.mEventHandler.sendEmptyMessage(7);
            try {
                this.mResetCondition.wait(2500);
            } catch (InterruptedException e) {
                TPLogUtil.m21895e(TAG, (Throwable) e);
            }
        }
    }

    public void seekTo(int i) {
        synchronized (this.mStateLock) {
            this.mLastSeekPos = (long) i;
            this.mIsSeeking = true;
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.arg1 = i;
            this.mEventHandler.sendMessage(obtain);
        }
    }

    public void setOnSeekCompleteListener(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        this.mOnSeekCompleteListener = onSeekCompleteListener;
        super.setOnSeekCompleteListener(this.mOnSeekCompleteListenerInner);
    }

    public void setPlaybackParams(PlaybackParams playbackParams) {
        Message obtain = Message.obtain();
        obtain.what = 9;
        obtain.obj = playbackParams;
        this.mEventHandler.sendMessage(obtain);
    }

    public void setSurface(Surface surface) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = surface;
        this.mEventHandler.sendMessage(obtain);
    }

    public void start() {
        this.mEventHandler.sendEmptyMessage(2);
    }

    public void stop() {
        synchronized (this.mStopCondition) {
            this.mEventHandler.sendEmptyMessage(6);
            try {
                this.mStopCondition.wait(2500);
            } catch (InterruptedException e) {
                TPLogUtil.m21895e(TAG, (Throwable) e);
            }
        }
    }

    public void seekTo(long j, int i) {
        synchronized (this.mStateLock) {
            this.mLastSeekPos = j;
            this.mIsSeeking = true;
            Message obtain = Message.obtain();
            obtain.what = 5;
            obtain.arg1 = i;
            obtain.obj = Long.valueOf(j);
            this.mEventHandler.sendMessage(obtain);
        }
    }
}
