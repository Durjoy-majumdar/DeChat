package com.tencent.qqmusic.mediaplayer;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener;
import com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo;
import com.tencent.qqmusic.mediaplayer.codec.BaseDecoder;
import com.tencent.qqmusic.mediaplayer.codec.MediaCodecDecoder;
import com.tencent.qqmusic.mediaplayer.codec.NativeDecoder;
import com.tencent.qqmusic.mediaplayer.network.DefaultMediaHTTPService;
import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService;
import com.tencent.qqmusic.mediaplayer.seektable.SeekTable;
import com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.FileDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSourceFactory;
import com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.ListPlayerListenerCallback;
import com.tencent.qqmusic.mediaplayer.upstream.TracerDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.TrackDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.UriLoader;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.Thread;
import java.util.List;

public class CommonPlayer extends BaseMediaPlayer {
    private static final int INIT_STATE_CHECK_TIME = 5000;
    private static final String TAG = "CommonPlayer";
    private int currentState;
    private Looper eventLooper;
    private boolean isMatchHuawei;
    /* access modifiers changed from: private */
    public CorePlayer mAudioPlayer;
    /* access modifiers changed from: private */
    public int mBufferPercentage;
    /* access modifiers changed from: private */
    public final ListPlayerListenerCallback mCallback;
    private long mDuration;
    private final QMThreadExecutor mExecutor;
    private String mLocalPlayPath;
    /* access modifiers changed from: private */
    public boolean mPreferMediaCodecDecode;
    private Float mSpeedToSet;
    private OpenedResources openedResources;

    public class BufferListener implements CacheDataSource.Listener {
        private BufferListener() {
        }

        public void onBufferEnded() {
            Logger.m21791i(CommonPlayer.TAG, CommonPlayer.this.auxiliary("buffer ended."));
        }

        public void onBufferStarted(long j) {
            Logger.m21791i(CommonPlayer.TAG, CommonPlayer.this.auxiliary("buffer started."));
        }

        public void onBytesTransferError(long j, long j2, long j3) {
        }

        public void onBytesTransferred(long j, long j2) {
        }

        public void onBytesTransferring(long j, long j2) {
        }

        public long onStreamingError(IOException iOException) {
            Logger.m21788e(CommonPlayer.TAG, CommonPlayer.this.auxiliary("streaming error!"), (Throwable) iOException);
            return -1;
        }

        public void onStreamingFinished() {
            int unused = CommonPlayer.this.mBufferPercentage = 100;
            Logger.m21791i(CommonPlayer.TAG, CommonPlayer.this.auxiliary("streaming finished"));
        }

        public void onTransferEnd() {
        }

        public void onTransferStart() {
        }

        public void onUpStreamTransfer(long j, long j2) {
            int round;
            if ((CommonPlayer.this.getPlayerState() == 2 || CommonPlayer.this.getPlayerState() == 4) && (round = (int) Math.round((((double) j) / ((double) j2)) * 100.0d)) != CommonPlayer.this.mBufferPercentage) {
                int unused = CommonPlayer.this.mBufferPercentage = round;
                ListPlayerListenerCallback access$100 = CommonPlayer.this.mCallback;
                CommonPlayer commonPlayer = CommonPlayer.this;
                access$100.onBufferingUpdate(commonPlayer, commonPlayer.mBufferPercentage);
            }
        }
    }

    public class CorePlayerCallback implements PlayerCallback {
        private final IDataSource mDataSource;
        private final IDataSourceFactory mFactory;

        public void playThreadStart(CorePlayer corePlayer) {
        }

        public void playerEnded(CorePlayer corePlayer) {
            if (CommonPlayer.this.mAudioPlayer == corePlayer) {
                Logger.m21791i(CommonPlayer.TAG, "playerEnded() callback ended");
                CommonPlayer.this.TransferStateTo(7);
                CommonPlayer.this.mCallback.onCompletion(CommonPlayer.this);
                return;
            }
            Logger.m21791i(CommonPlayer.TAG, "different playerEnded");
        }

        public void playerException(CorePlayer corePlayer, int i, int i2, int i3) {
            if (CommonPlayer.this.mAudioPlayer == corePlayer) {
                Logger.m21787e(CommonPlayer.TAG, "playerException() callback exception what = " + i + ",extra = " + i2 + " mAudioPlayer:" + CommonPlayer.this.mAudioPlayer);
                if (CommonPlayer.this.mAudioPlayer != null) {
                    int playerState = CommonPlayer.this.mAudioPlayer.getPlayerState();
                    Logger.m21787e(CommonPlayer.TAG, "handleMessage state = " + playerState);
                    Logger.m21787e(CommonPlayer.TAG, "handleMessage isInit = " + CommonPlayer.this.mAudioPlayer.isInit() + ",isStartDecode = " + CommonPlayer.this.mAudioPlayer.hasDecodeData() + ",decodeSuccess = " + CommonPlayer.this.mAudioPlayer.hasDecodeDataSuccess());
                }
                if (!CommonPlayer.this.mPreferMediaCodecDecode || i != 91) {
                    CommonPlayer.this.onError(i, i2, i3);
                    return;
                }
                boolean unused = CommonPlayer.this.mPreferMediaCodecDecode = false;
                IDataSourceFactory iDataSourceFactory = this.mFactory;
                if (iDataSourceFactory != null) {
                    try {
                        CommonPlayer.this.setDataSource(iDataSourceFactory);
                        CommonPlayer.this.prepare();
                    } catch (Exception e) {
                        Logger.m21788e(CommonPlayer.TAG, "retry nativeDecoder", (Throwable) e);
                        CommonPlayer.this.onError(i, i2, i3);
                    }
                } else {
                    IDataSource iDataSource = this.mDataSource;
                    if (iDataSource != null) {
                        CommonPlayer.this.setDataSourceInternal(iDataSource);
                        CommonPlayer.this.prepare();
                        return;
                    }
                    CommonPlayer.this.onError(i, i2, i3);
                }
            } else {
                Logger.m21791i(CommonPlayer.TAG, "different playerException");
            }
        }

        public void playerPaused(CorePlayer corePlayer) {
            if (CommonPlayer.this.mAudioPlayer == corePlayer) {
                Logger.m21791i(CommonPlayer.TAG, "playerPaused() callback paused");
            } else {
                Logger.m21791i(CommonPlayer.TAG, "different playerPaused");
            }
        }

        public void playerPrepared(CorePlayer corePlayer) {
            if (CommonPlayer.this.mAudioPlayer == corePlayer) {
                Logger.m21791i(CommonPlayer.TAG, "playerPrepared() callback prepared");
                CommonPlayer.this.TransferStateTo(2);
                CommonPlayer.this.mCallback.onPrepared(CommonPlayer.this);
                return;
            }
            Logger.m21791i(CommonPlayer.TAG, "different playerPrepared");
        }

        public void playerSeekCompletion(CorePlayer corePlayer, int i) {
            if (CommonPlayer.this.mAudioPlayer == corePlayer) {
                Logger.m21791i(CommonPlayer.TAG, "playerSeekCompletion() callback seek completion");
                CommonPlayer.this.mCallback.onSeekComplete(CommonPlayer.this, i);
                return;
            }
            Logger.m21791i(CommonPlayer.TAG, "different playerSeekCompletion");
        }

        public void playerStarted(CorePlayer corePlayer) {
            if (CommonPlayer.this.mAudioPlayer == corePlayer) {
                Logger.m21791i(CommonPlayer.TAG, "playerStarted() callback started");
                CommonPlayer.this.mCallback.onStarted(CommonPlayer.this);
                return;
            }
            Logger.m21791i(CommonPlayer.TAG, "different playerStarted");
        }

        public void playerStopped(CorePlayer corePlayer) {
            if (CommonPlayer.this.mAudioPlayer == corePlayer) {
                Logger.m21791i(CommonPlayer.TAG, "playerStopped() callback stopped");
            } else {
                Logger.m21791i(CommonPlayer.TAG, "different playerStopped");
            }
        }

        private CorePlayerCallback(IDataSourceFactory iDataSourceFactory, IDataSource iDataSource) {
            this.mFactory = iDataSourceFactory;
            this.mDataSource = iDataSource;
        }
    }

    public static class OpenedResources {
        /* access modifiers changed from: private */
        public File bufferFile;
        /* access modifiers changed from: private */
        public CacheDataSource dataSource;

        private OpenedResources() {
        }

        public void release() {
            File file = this.bufferFile;
            if (file != null && !file.delete()) {
                Logger.m21793w(CommonPlayer.TAG, "[release] failed to delete buffer file: " + this.bufferFile);
            }
            CacheDataSource cacheDataSource = this.dataSource;
            if (cacheDataSource != null) {
                cacheDataSource.setListener((CacheDataSource.Listener) null);
                this.dataSource.releaseLock();
            }
        }
    }

    public CommonPlayer() {
        this((PlayerListenerCallback) null, (Looper) null, false, new QMThreadExecutor() {
            public void execute(Runnable runnable, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
                Thread thread = new Thread(runnable, "decoder");
                thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
                thread.start();
            }
        });
    }

    /* access modifiers changed from: private */
    public String auxiliary(String str) {
        CorePlayer corePlayer = this.mAudioPlayer;
        String str2 = this.mPreferMediaCodecDecode ? "[MediaCodec]" : "";
        if (corePlayer == null) {
            return "null";
        }
        return "[" + corePlayer + "]" + str2 + str;
    }

    private void checkToRelease() {
        if (this.currentState == 8) {
            Logger.m21791i(TAG, auxiliary("[checkToRelease]"));
            resetInternal();
            this.mCallback.clear();
        }
    }

    private Looper insureEventLooper() {
        if (this.eventLooper == null) {
            HandlerThread handlerThread = new HandlerThread("CommonPlayer_EventHandler_" + hashCode());
            handlerThread.start();
            this.eventLooper = handlerThread.getLooper();
        }
        return this.eventLooper;
    }

    private void onError(int i, int i2) {
        onError(i, i2, 0);
    }

    private synchronized void resetInternal() {
        OpenedResources openedResources2 = this.openedResources;
        if (openedResources2 != null) {
            openedResources2.release();
            this.openedResources = null;
        }
        CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.release();
            this.mAudioPlayer = null;
        }
        Looper looper = this.eventLooper;
        if (!(looper == null || looper == Looper.getMainLooper())) {
            this.eventLooper.quitSafely();
            this.eventLooper = null;
        }
        this.mDuration = 0;
        this.mBufferPercentage = 0;
        this.mSpeedToSet = null;
    }

    /* access modifiers changed from: private */
    public void setDataSourceInternal(IDataSource iDataSource) {
        TransferStateTo(1);
        BaseDecoder mediaCodecDecoder = this.mPreferMediaCodecDecode ? new MediaCodecDecoder() : new NativeDecoder();
        CorePlayer corePlayer = new CorePlayer(new TracerDataSource(iDataSource), (INativeDataSource) null, new CorePlayerCallback((IDataSourceFactory) null, iDataSource), insureEventLooper(), mediaCodecDecoder, this.mExecutor);
        this.mAudioPlayer = corePlayer;
        corePlayer.setThreadName(iDataSource.toString());
        setSpeedToCorePlayerIfNeeded(this.mAudioPlayer);
    }

    private void setSpeedToCorePlayerIfNeeded(CorePlayer corePlayer) {
        Float f = this.mSpeedToSet;
        if (f != null) {
            corePlayer.setSpeed(f.floatValue());
            this.mSpeedToSet = null;
        }
    }

    public void TransferStateTo(int i) {
        Logger.m21791i("CommonPlayer StateRunner", this.currentState + " -> " + i);
        this.currentState = i;
        ListPlayerListenerCallback listPlayerListenerCallback = this.mCallback;
        if (listPlayerListenerCallback != null) {
            listPlayerListenerCallback.onStateChanged(this, i);
        }
    }

    public void addAudioListener(IAudioListener iAudioListener) {
        CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.addAudioListener(iAudioListener);
        }
    }

    public void addPlayerListenerCallback(PlayerListenerCallback playerListenerCallback) {
        this.mCallback.add(playerListenerCallback);
    }

    public SeekTable createSeekTable() {
        CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer == null) {
            return null;
        }
        return corePlayer.createSeekTable();
    }

    public void flush() {
        CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer == null) {
            Logger.m21787e(TAG, "[getCurrentFrame] mAudioPlayer is null!");
        } else {
            corePlayer.flush();
        }
    }

    public int getBufferedPercentage() {
        return this.mBufferPercentage;
    }

    public AudioInformation getCurrentAudioInformation() {
        CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            return corePlayer.getCurrentAudioInformation();
        }
        return null;
    }

    public long getCurrentPosition() {
        CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            return corePlayer.getCurPosition();
        }
        Logger.m21787e(TAG, "getCurrentPosition() mAudioPlayer is null!");
        return 0;
    }

    public long getCurrentPositionFromFile() {
        return 0;
    }

    public long getDecodePosition() {
        CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            return corePlayer.getCurPositionByDecoder();
        }
        Logger.m21787e(TAG, "getDecodePosition() ERROR : mAudioPlayer is null!");
        return 0;
    }

    public int getDecoderType() {
        return this.mPreferMediaCodecDecode ? 2 : 1;
    }

    public int getDuration() {
        CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            long duration = corePlayer.getDuration();
            this.mDuration = duration;
            return (int) duration;
        }
        Logger.m21787e(TAG, "getDuration() mAudioPlayer is null!");
        long j = this.mDuration;
        if (j <= 0) {
            j = 0;
        }
        return (int) j;
    }

    public int getPlayerMode() {
        CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            return corePlayer.getPlayerMode();
        }
        return 0;
    }

    public int getPlayerState() {
        return this.currentState;
    }

    public int getSessionId() {
        CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            return corePlayer.getSessionId();
        }
        return 0;
    }

    public float getSpeed() {
        CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            return corePlayer.getSpeed();
        }
        Float f = this.mSpeedToSet;
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }

    public boolean isPlaying() {
        CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            return corePlayer.getPlayerState() == 4;
        }
        Logger.m21787e(TAG, "isPlaying() mAudioPlayer is null!");
        return false;
    }

    public void pause() {
        TransferStateTo(5);
        Logger.m21791i(TAG, auxiliary("[pause]"));
        CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.pause(false);
        } else {
            Logger.m21787e(TAG, "pause() mAudioPlayer is null!");
        }
        notifyPauseSong();
    }

    public void pauseRealTime() {
        TransferStateTo(5);
        Logger.m21791i(TAG, auxiliary("[pauseRealTime]"));
        CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.pause(true);
        } else {
            Logger.m21787e(TAG, "pauseRealTime() mAudioPlayer is null!");
        }
        notifyPauseSong();
    }

    public void prepare() {
        if (this.currentState == 8) {
            Logger.m21787e(TAG, "prepare already released!");
            return;
        }
        TransferStateTo(3);
        Logger.m21791i(TAG, auxiliary("[prepare]"));
        CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.prepare();
        } else {
            Logger.m21787e(TAG, "prepare() null mAudioPlayer!");
        }
    }

    public void prepareAsync() {
        throw new UnSupportMethodException("Soft decode player cannot support prepareAsync");
    }

    public void release() {
        TransferStateTo(8);
        Logger.m21791i(TAG, auxiliary("[release]"));
        resetInternal();
        this.mCallback.clear();
    }

    public void removeAudioListener(IAudioListener iAudioListener) {
        CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.removeAudioListener(iAudioListener);
        }
    }

    public void reset() {
        TransferStateTo(0);
        Logger.m21791i(TAG, auxiliary("[reset]"));
        resetInternal();
    }

    public void seekTo(int i) {
        CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.seek(i);
        } else {
            Logger.m21787e(TAG, "seekTo() mAudioPlayer is null!");
        }
    }

    public void setAudioStreamType(int i) {
        CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.setAudioStreamType(i);
        }
    }

    public void setDataSource(String str) {
        if (str != null) {
            TransferStateTo(1);
            Logger.m21791i(TAG, "setDataSource, path: " + str);
            this.mBufferPercentage = 100;
            setDataSourceInternal(new FileDataSource(str));
            checkToRelease();
            return;
        }
        Logger.m21787e(TAG, "setDataSource() ERROR:the path is null!");
        throw new IllegalArgumentException("the path is null!");
    }

    public void setLeastCommonMultiple(int i) {
        CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.setLeastCommonMultiple(i);
        }
    }

    public void setPlayLocalPath(String str) {
        this.mLocalPlayPath = str;
        CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.setPlayPath(str);
        }
    }

    public void setPlayerListenerCallback(PlayerListenerCallback playerListenerCallback) {
        this.mCallback.clear();
        this.mCallback.add(playerListenerCallback);
    }

    public void setPlayerMode(int i) {
        CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.setPlayerMode(i);
        }
    }

    public void setSpeed(float f) {
        CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.setSpeed(f);
        } else {
            this.mSpeedToSet = Float.valueOf(f);
        }
    }

    public void setVolume(float f, float f2) {
        CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.setVolume(f, f2);
        }
    }

    public void setWakeMode(Context context, int i) {
        throw new UnSupportMethodException("Soft decode player cannot support setWakeMode");
    }

    public void start() {
        TransferStateTo(4);
        Logger.m21791i(TAG, auxiliary("[start]"));
        CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.play();
        } else {
            Logger.m21787e(TAG, "start() mAudioPlayer is null!");
        }
        notifyStartPlaySong();
    }

    public void stop() {
        try {
            TransferStateTo(6);
            Logger.m21791i(TAG, auxiliary("[stop]"));
            CorePlayer corePlayer = this.mAudioPlayer;
            if (corePlayer != null) {
                corePlayer.stop();
            } else {
                Logger.m21787e(TAG, "stop() mAudioPlayer is null!");
            }
        } catch (Exception e) {
            Logger.m21790e(TAG, (Throwable) e);
        }
    }

    public CommonPlayer(PlayerListenerCallback playerListenerCallback) {
        this(playerListenerCallback, (Looper) null, false, new QMThreadExecutor() {
            public void execute(Runnable runnable, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
                Thread thread = new Thread(runnable, "decoder");
                thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
                thread.start();
            }
        });
    }

    /* access modifiers changed from: private */
    public void onError(int i, int i2, int i3) {
        TransferStateTo(9);
        Logger.m21787e(TAG, "onError prefer MediaCodec " + this.mPreferMediaCodecDecode);
        this.mCallback.onError(this, i, i2, i3);
    }

    public CommonPlayer(PlayerListenerCallback playerListenerCallback, Looper looper, boolean z, QMThreadExecutor qMThreadExecutor) {
        ListPlayerListenerCallback listPlayerListenerCallback = new ListPlayerListenerCallback();
        this.mCallback = listPlayerListenerCallback;
        this.mAudioPlayer = null;
        boolean z2 = false;
        this.currentState = 0;
        this.mSpeedToSet = null;
        this.mPreferMediaCodecDecode = false;
        this.mLocalPlayPath = null;
        this.isMatchHuawei = false;
        if (playerListenerCallback != null) {
            listPlayerListenerCallback.add(playerListenerCallback);
        }
        this.eventLooper = looper;
        int i = Build.VERSION.SDK_INT;
        this.mPreferMediaCodecDecode = i >= 23 && z;
        this.mExecutor = qMThreadExecutor;
        if ((Build.MANUFACTURER + Build.BRAND + Build.MODEL).toLowerCase().contains("huawei") && i >= 26) {
            z2 = true;
        }
        this.isMatchHuawei = z2;
        reset();
    }

    public void setDataSource(FileDescriptor fileDescriptor) {
        throw new UnSupportMethodException("Soft decode player cannot support setDataSource by FileDescriptor");
    }

    public void setDataSource(Context context, Uri uri) {
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme)) {
            setDataSource(uri.toString());
        } else if (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase(C113600ck.f339986i)) {
            setDataSource((IMediaHTTPService) new DefaultMediaHTTPService(), uri);
        } else if (!scheme.equalsIgnoreCase("content")) {
            scheme.equalsIgnoreCase("file");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d A[Catch:{ IOException -> 0x006c }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDataSource(com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService r8, android.net.Uri r9) {
        /*
            r7 = this;
            r0 = 0
            r1 = 103(0x67, float:1.44E-43)
            r2 = 90
            java.lang.String r3 = r7.mCacheDir     // Catch:{ IOException -> 0x006c }
            java.lang.String r4 = "tmp"
            java.lang.String r5 = "mediaHttpCommonPlayer"
            if (r3 == 0) goto L_0x0020
            boolean r3 = r3.isEmpty()     // Catch:{ IOException -> 0x006c }
            if (r3 != 0) goto L_0x0020
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x006c }
            java.lang.String r6 = r7.mCacheDir     // Catch:{ IOException -> 0x006c }
            r3.<init>(r6)     // Catch:{ IOException -> 0x006c }
            java.io.File r3 = java.io.File.createTempFile(r5, r4, r3)     // Catch:{ IOException -> 0x006c }
            goto L_0x0024
        L_0x0020:
            java.io.File r3 = java.io.File.createTempFile(r5, r4)     // Catch:{ IOException -> 0x006c }
        L_0x0024:
            r3.delete()     // Catch:{ IOException -> 0x006c }
            boolean r4 = r3.createNewFile()     // Catch:{ IOException -> 0x006c }
            if (r4 != 0) goto L_0x0031
            r7.onError(r2, r1, r0)     // Catch:{ IOException -> 0x006c }
            return
        L_0x0031:
            java.lang.String r0 = r3.getAbsolutePath()
            com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource r1 = new com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource
            com.tencent.qqmusic.mediaplayer.upstream.HttpDataSource r2 = new com.tencent.qqmusic.mediaplayer.upstream.HttpDataSource
            r4 = 0
            r2.<init>(r9, r4, r8)
            com.tencent.qqmusic.mediaplayer.upstream.FileDataSource r8 = new com.tencent.qqmusic.mediaplayer.upstream.FileDataSource
            r8.<init>(r0)
            com.tencent.qqmusic.mediaplayer.downstream.FileDataSink r9 = new com.tencent.qqmusic.mediaplayer.downstream.FileDataSink
            r9.<init>(r0)
            android.os.Looper r0 = r7.insureEventLooper()
            r1.<init>(r2, r8, r9, r0)
            com.tencent.qqmusic.mediaplayer.CommonPlayer$OpenedResources r8 = new com.tencent.qqmusic.mediaplayer.CommonPlayer$OpenedResources
            r8.<init>()
            r7.openedResources = r8
            java.io.File unused = r8.bufferFile = r3
            com.tencent.qqmusic.mediaplayer.CommonPlayer$OpenedResources r8 = r7.openedResources
            com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource unused = r8.dataSource = r1
            com.tencent.qqmusic.mediaplayer.CommonPlayer$BufferListener r8 = new com.tencent.qqmusic.mediaplayer.CommonPlayer$BufferListener
            r8.<init>()
            r1.setListener(r8)
            r7.setDataSourceInternal(r1)
            r7.checkToRelease()
            return
        L_0x006c:
            r7.onError(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.CommonPlayer.setDataSource(com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService, android.net.Uri):void");
    }

    public void setDataSource(IDataSourceFactory iDataSourceFactory) {
        if (iDataSourceFactory != null) {
            TransferStateTo(1);
            CorePlayerCallback corePlayerCallback = new CorePlayerCallback(iDataSourceFactory, (IDataSource) null);
            if (this.mPreferMediaCodecDecode) {
                this.mAudioPlayer = new CorePlayer(iDataSourceFactory.createDataSource(), (INativeDataSource) null, corePlayerCallback, insureEventLooper(), new MediaCodecDecoder(), this.mExecutor);
            } else {
                INativeDataSource createNativeDataSource = iDataSourceFactory.createNativeDataSource();
                if (createNativeDataSource != null) {
                    this.mAudioPlayer = new CorePlayer((IDataSource) null, createNativeDataSource, corePlayerCallback, insureEventLooper(), new NativeDecoder(), this.mExecutor);
                } else {
                    this.mAudioPlayer = new CorePlayer(iDataSourceFactory.createDataSource(), (INativeDataSource) null, corePlayerCallback, insureEventLooper(), new NativeDecoder(), this.mExecutor);
                }
            }
            this.mAudioPlayer.setThreadName(iDataSourceFactory.toString());
            setSpeedToCorePlayerIfNeeded(this.mAudioPlayer);
            String str = this.mLocalPlayPath;
            if (str != null) {
                this.mAudioPlayer.setPlayPath(str);
            }
            checkToRelease();
            return;
        }
        throw new IllegalArgumentException("dataSourceFactory is null!");
    }

    public void setDataSource(TrackInfo trackInfo) {
        TransferStateTo(1);
        Logger.m21791i(TAG, "setDataSource, trackInfo.getUri: " + trackInfo.getUri());
        Logger.m21791i(TAG, "setDataSource, trackInfo.range: " + trackInfo.getRange().toString());
        this.mBufferPercentage = 100;
        TrackDataSource trackDataSource = new TrackDataSource(trackInfo);
        List<PlayerListenerCallback> collection = this.mCallback.toCollection();
        this.mCallback.clear();
        this.mCallback.add((PlayerListenerCallback) trackDataSource);
        this.mCallback.addAll(collection);
        TransferStateTo(1);
        TracerDataSource tracerDataSource = new TracerDataSource(trackDataSource);
        TrackCorePlayer trackCorePlayer = new TrackCorePlayer(tracerDataSource, new CorePlayerCallback((IDataSourceFactory) null, tracerDataSource), insureEventLooper(), this.mExecutor);
        this.mAudioPlayer = trackCorePlayer;
        TrackCorePlayer trackCorePlayer2 = trackCorePlayer;
        trackDataSource.setTrackStateCallback(trackCorePlayer);
        this.mAudioPlayer.setThreadName(trackDataSource.toString());
        setSpeedToCorePlayerIfNeeded(this.mAudioPlayer);
        checkToRelease();
    }

    public void setDataSource(Context context, final UriLoader uriLoader) {
        setDataSource((IDataSourceFactory) new IDataSourceFactory() {
            public IDataSource createDataSource() {
                return CacheDataSource.Factory.createFromUriLoader(uriLoader, CommonPlayer.this.mCacheDir);
            }

            public INativeDataSource createNativeDataSource() {
                return null;
            }
        });
    }
}
