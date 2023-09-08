package com.tencent.qqmusic.mediaplayer;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener;
import com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import com.tencent.qqmusic.mediaplayer.util.PcmConvertionUtil;
import com.tencent.qqmusic.mediaplayer.util.WaitNotify;
import com.tencent.tav.core.AssetExtension;
import tm0.C14016b0;

abstract class BaseDecodeDataComponent {
    public static final int CALL_PREPARED_DELAY_TIME = 20;
    private static final String TAG = "BaseDecodeDataComponent";
    public static final int WRITE_ZERO_THRESHOLD = 5;
    private static volatile int sSessionId = -1;
    public boolean isUseFloatForHighDepth = false;
    public volatile float leftVolume;
    public final IAudioListener mAudioEffectListener;
    public int mAudioStreamType = getAudioStreamType();
    public AudioTrack mAudioTrack;
    public int mBuffSize;
    public final PlayerCallback mCallback;
    public final CorePlayer mCorePlayer;
    public boolean mCreateAudioTrackFail = false;
    public long mCurPosition = 0;
    public final BufferInfo mDecodeBufferInfo = new BufferInfo();
    private final Handler mEventHandler;
    public final FloatBufferInfo mFloatBufferInfo = new FloatBufferInfo();
    public final HandleDecodeDataCallback mHandleDecodeDataCallback;
    public boolean mHasDecode = false;
    public boolean mHasDecodeSuccess = false;
    public boolean mHasInit = false;
    public final AudioInformation mInformation;
    public int mLeastCommonMultiple = 1;
    public volatile boolean mNeedChangePlayThreadPriority = false;
    private final int mPlayerID;
    public final WaitNotify mSignalControl = new WaitNotify();
    public Float mSpeedToSet = null;
    public final PlayerStateRunner mStateRunner;
    public int mTargetBitDepth = 2;
    public long mTargetPlaySample;
    public final IAudioListener mTerminalAudioEffectListener;
    public volatile boolean needSetVolume = false;
    public PerformanceTracer performanceTracer = null;
    public volatile float rightVolume;

    public interface HandleDecodeDataCallback {
        long getCurPositionByDecoder();

        long getMinPcmBufferSize();

        void onAudioTrackChanged(AudioTrack audioTrack);

        void onPullDecodeDataEndOrFailed(int i, int i2);

        int pullDecodeData(int i, byte[] bArr);

        int seekTo(int i);
    }

    public BaseDecodeDataComponent(CorePlayer corePlayer, PlayerStateRunner playerStateRunner, AudioInformation audioInformation, PlayerCallback playerCallback, HandleDecodeDataCallback handleDecodeDataCallback, Handler handler, int i, IAudioListener iAudioListener, IAudioListener iAudioListener2) {
        this.mCorePlayer = corePlayer;
        this.mStateRunner = playerStateRunner;
        this.mInformation = audioInformation;
        this.mCallback = playerCallback;
        this.mHandleDecodeDataCallback = handleDecodeDataCallback;
        this.mEventHandler = handler;
        this.mPlayerID = i;
        this.mAudioEffectListener = iAudioListener;
        this.mTerminalAudioEffectListener = iAudioListener2;
    }

    private void destroyAudioListeners() {
        this.mAudioEffectListener.onPlayerStopped();
        this.mTerminalAudioEffectListener.onPlayerStopped();
    }

    public static int getAudioTrackPosition(long j, AudioTrack audioTrack) {
        long j2;
        if (audioTrack != null) {
            try {
                j2 = Math.round((((double) (j + ((long) audioTrack.getPlaybackHeadPosition()))) / ((double) audioTrack.getSampleRate())) * 1000.0d);
            } catch (Exception e) {
                Logger.m21788e(TAG, "getAudioTrackPosition", (Throwable) e);
            }
            return (int) j2;
        }
        j2 = 0;
        return (int) j2;
    }

    public static AudioTrack instantiateAudioTrackCompat(int i, int i2, int i3, int i4, int i5, int i6) {
        AudioTrack create;
        if (sSessionId == -1) {
            sSessionId = 0;
        }
        IAudioTrackCreator audioTrackCreator = AudioPlayerConfigure.getAudioTrackCreator();
        if (audioTrackCreator != null && (create = audioTrackCreator.create(i, i2, i3, i4, i5, i6, sSessionId)) != null) {
            return create;
        }
        int i7 = Build.VERSION.SDK_INT;
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(i);
        AudioFormat.Builder builder2 = new AudioFormat.Builder();
        builder2.setSampleRate(i2);
        builder2.setEncoding(i4);
        builder2.setChannelMask(i3);
        if (i7 >= 23) {
            return new AudioTrack.Builder().setAudioAttributes(builder.build()).setAudioFormat(builder2.build()).setBufferSizeInBytes(i5).setTransferMode(i6).setSessionId(sSessionId).build();
        }
        return new AudioTrack(builder.build(), builder2.build(), i5, i6, sSessionId);
    }

    public String axiliary(String str) {
        return "ID: " + this.mPlayerID + ". " + str;
    }

    public long calculatePcmPlayTime(byte[] bArr, int i, int i2, long j) {
        if (i == 0 || i2 == 0 || j == 0) {
            return 0;
        }
        return (long) ((((((float) bArr.length) * 1000.0f) / ((float) i)) / ((float) i2)) / ((float) j));
    }

    public void callExceptionCallback(int i, int i2) {
        callExceptionCallback(i, i2, 0);
    }

    public void changePlayThreadPriorityImmediately() {
        Logger.m21786d(TAG, axiliary("changePlayThreadPriorityImmediately"));
        this.mNeedChangePlayThreadPriority = true;
    }

    public void convertBytePcmToFloatPcm(BufferInfo bufferInfo, FloatBufferInfo floatBufferInfo) {
        try {
            PcmConvertionUtil.convertByteBufferToFloatBuffer(bufferInfo, floatBufferInfo, this.mInformation.getBitDepth());
        } catch (Throwable th) {
            Logger.m21790e(TAG, th);
        }
    }

    public void doWaitForPaused() {
        this.mSignalControl.doWait(2000, 5, new WaitNotify.WaitListener() {
            public boolean keepWaiting() {
                return BaseDecodeDataComponent.this.isPaused();
            }
        });
    }

    public void flush() {
    }

    public abstract int getAudioStreamType();

    public abstract long getCurPosition();

    public int getMaxSupportSampleRate() {
        Logger.m21791i(TAG, axiliary("can't reflect max sample rate, use default sample rate"));
        return Build.VERSION.SDK_INT < 22 ? 96000 : 192000;
    }

    public int getMinBufferSize(long j, int i, int i2, int i3, int i4) {
        int minBufferSize = AudioTrack.getMinBufferSize((int) j, i, i2);
        if (minBufferSize >= 0) {
            return minBufferSize;
        }
        Logger.m21791i(TAG, axiliary("minBufferSize = " + minBufferSize + " mTargetPlaySample = " + j + "  channelConfiguration = " + i + "   pcmEncoding = " + i2));
        return i3 * 3536 * i4;
    }

    public int getPlayerState() {
        return this.mStateRunner.get().intValue();
    }

    public int getSessionId() {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            return audioTrack.getAudioSessionId();
        }
        return 0;
    }

    public float getSpeed() {
        AudioTrack audioTrack;
        Float f = this.mSpeedToSet;
        if (f != null) {
            return f.floatValue();
        }
        if (Build.VERSION.SDK_INT < 23 || (audioTrack = this.mAudioTrack) == null) {
            return 1.0f;
        }
        return audioTrack.getPlaybackParams().getSpeed();
    }

    public abstract void handleDecodeData();

    public void handleHighBitDepth(BufferInfo bufferInfo, BufferInfo bufferInfo2) {
        if (this.isUseFloatForHighDepth) {
            bufferInfo.fillInto(bufferInfo2);
            return;
        }
        try {
            PcmConvertionUtil.convertBitDepthTo16(bufferInfo, bufferInfo2, this.mInformation.getBitDepth());
        } catch (Throwable th) {
            Logger.m21790e(TAG, th);
        }
    }

    public void handleHighSample(BufferInfo bufferInfo, BufferInfo bufferInfo2) {
        try {
            PcmConvertionUtil.reSample(bufferInfo, bufferInfo2, this.mInformation.getSampleRate(), this.mTargetPlaySample, this.mTargetBitDepth);
        } catch (Throwable th) {
            Logger.m21790e(TAG, th);
        }
    }

    public synchronized boolean hasDecodeData() {
        return this.mHasDecode;
    }

    public synchronized boolean hasDecodeDataSuccess() {
        return this.mHasDecodeSuccess;
    }

    public void initAudioListeners(int i, AudioInformation audioInformation, long j) {
        this.mAudioEffectListener.onPlayerReady(i, audioInformation, j);
        this.mTerminalAudioEffectListener.onPlayerReady(i, audioInformation, j);
    }

    public synchronized boolean isCompleted() {
        return this.mStateRunner.isEqual(7);
    }

    public synchronized boolean isError() {
        return this.mStateRunner.isEqual(9);
    }

    public synchronized boolean isIdle() {
        return this.mStateRunner.isEqual(0);
    }

    public boolean isInit() {
        return this.mHasInit;
    }

    public synchronized boolean isPaused() {
        return this.mStateRunner.isEqual(5);
    }

    public synchronized boolean isPlaying() {
        return this.mStateRunner.isEqual(4);
    }

    public synchronized boolean isStopped() {
        return this.mStateRunner.isEqual(6);
    }

    public boolean isSupportHighBitDepth() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public void notifySeekCompleteForAudioListeners(long j) {
        this.mAudioEffectListener.onPlayerSeekComplete(j);
        this.mTerminalAudioEffectListener.onPlayerSeekComplete(j);
    }

    public void pause(boolean z) {
        Logger.m21791i(TAG, axiliary("pause"));
        this.mStateRunner.transfer(5, 4, 2);
    }

    public void play() {
        Logger.m21791i(TAG, axiliary(AssetExtension.SCENE_PLAY));
        this.mStateRunner.transfer(4, 5, 2, 6, 4);
        if (this.mSignalControl.isWaiting()) {
            Logger.m21786d(TAG, axiliary("lock is Waiting, event: play, doNotify"));
            this.mSignalControl.doNotify();
        }
    }

    public void postRunnable(Runnable runnable, int i) {
        this.mEventHandler.postDelayed(runnable, (long) i);
    }

    public void refreshTimeAndNotify(int i) {
        if (this.mSignalControl.isWaiting() && isPlaying()) {
            Logger.m21786d(TAG, axiliary("lock is Waiting, event: seek, doNotify"));
            this.mSignalControl.doNotify();
        }
    }

    public void release() {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            try {
                audioTrack.stop();
            } catch (Throwable th) {
                Logger.m21790e(TAG, th);
            }
            try {
                this.mAudioTrack.flush();
            } catch (Throwable th4) {
                Logger.m21790e(TAG, th4);
            }
            try {
                this.mAudioTrack.release();
            } catch (Throwable th5) {
                Logger.m21790e(TAG, th5);
            }
            try {
                destroyAudioListeners();
            } catch (Throwable th6) {
                Logger.m21792i(TAG, "[run] failed to destroyAudioListeners!", th6);
            }
            setAudioTrack((AudioTrack) null);
            Logger.m21786d(TAG, axiliary("finally release audioTrack"));
        }
        if (!this.mCorePlayer.mIsExit) {
            if (this.mStateRunner.isEqual(7)) {
                this.mCallback.playerEnded(this.mCorePlayer);
            } else {
                this.mCallback.playerStopped(this.mCorePlayer);
            }
        }
    }

    public void releaseNotify() {
        if (this.mSignalControl.isWaiting()) {
            Logger.m21786d(TAG, axiliary("lock is Waiting, event: release, doNotify"));
            this.mSignalControl.doNotify();
        }
    }

    public void seek(int i) {
    }

    public void setAudioStreamType(int i) {
        if (i != this.mAudioStreamType) {
            this.mAudioStreamType = i;
        }
    }

    public void setAudioTrack(AudioTrack audioTrack) {
        this.mAudioTrack = audioTrack;
        this.mHandleDecodeDataCallback.onAudioTrackChanged(audioTrack);
    }

    public void setLeastCommonMultiple(int i) {
        if (i < 1) {
            Logger.m21787e(TAG, "wrong least common multiple: " + i);
            return;
        }
        this.mLeastCommonMultiple = i;
    }

    public void setPerformanceTracer(PerformanceTracer performanceTracer2) {
        this.performanceTracer = performanceTracer2;
    }

    public void setSpeed(float f) {
        this.mSpeedToSet = Float.valueOf(f);
    }

    public void setVolume(float f, float f2) {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            try {
                audioTrack.setStereoVolume(f, f2);
            } catch (IllegalStateException e) {
                Logger.m21788e(TAG, C14016b0.NAME, (Throwable) e);
            }
        }
    }

    public void setVolumeForHuawei(float f, float f2) {
        this.leftVolume = f;
        this.rightVolume = f2;
        this.needSetVolume = true;
    }

    public void stop() {
        Logger.m21791i(TAG, axiliary("stop"));
        if (this.mStateRunner.transfer(6, 4, 5, 2) && this.mSignalControl.isWaiting()) {
            Logger.m21786d(TAG, axiliary("lock is Waiting, event: stop, doNotify"));
            this.mSignalControl.doNotify();
        }
    }

    private void callExceptionCallback(int i, int i2, int i3) {
        this.mCallback.playerException(this.mCorePlayer, i, i2, i3);
    }

    public long calculatePcmPlayTime(float[] fArr, int i, long j) {
        if (i == 0 || j == 0) {
            return 0;
        }
        return (long) (((((float) fArr.length) * 1000.0f) / ((float) i)) / ((float) j));
    }
}
