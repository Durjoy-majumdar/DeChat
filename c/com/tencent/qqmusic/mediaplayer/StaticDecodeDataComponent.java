package com.tencent.qqmusic.mediaplayer;

import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent;
import com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import com.tencent.qqmusic.mediaplayer.util.WaitNotify;
import com.tencent.qqmusic.mediaplayer.utils.AudioUtil;
import java.util.ArrayList;
import java.util.List;

class StaticDecodeDataComponent extends BaseDecodeDataComponent {
    private static final String TAG = "StaticDecodeDataComponent";
    private int mAllBufferSize;
    private List<BufferInfo> mAllPcmBufferList;
    private boolean mHasTerminal = false;
    private boolean mIsfirstStarted;

    public StaticDecodeDataComponent(CorePlayer corePlayer, PlayerStateRunner playerStateRunner, AudioInformation audioInformation, PlayerCallback playerCallback, BaseDecodeDataComponent.HandleDecodeDataCallback handleDecodeDataCallback, Handler handler, int i, IAudioListener iAudioListener, IAudioListener iAudioListener2) {
        super(corePlayer, playerStateRunner, audioInformation, playerCallback, handleDecodeDataCallback, handler, i, iAudioListener, iAudioListener2);
        this.mBuffSize = 8192;
    }

    private boolean createAudioTrack() {
        int i;
        Logger.m21786d(TAG, axiliary("createAudioTrack"));
        if (this.mInformation == null) {
            Logger.m21787e(TAG, axiliary("不留痕迹的退出 时机：获取Information时 step = 3"));
            this.mStateRunner.transfer(9);
            callExceptionCallback(91, 63);
            return false;
        }
        if (!this.mStateRunner.isEqual(3)) {
            Logger.m21787e(TAG, axiliary("mState is not preparing"));
            callExceptionCallback(91, 54);
            return false;
        } else if (this.mInformation.getSampleRate() <= 0) {
            Logger.m21787e(TAG, axiliary("mInformation.getSampleRate() failed"));
            callExceptionCallback(91, 64);
            return false;
        } else {
            int channels = this.mInformation.getChannels();
            if (channels == 1) {
                i = 4;
            } else {
                if (channels != 2) {
                    if (channels == 6) {
                        i = 252;
                    } else if (channels == 8) {
                        i = 1020;
                    }
                }
                i = 12;
            }
            this.mTargetPlaySample = this.mInformation.getSampleRate();
            int bitDepth = this.mInformation.getBitDepth();
            while (this.mTargetPlaySample > ((long) getMaxSupportSampleRate())) {
                this.mTargetPlaySample /= 2;
            }
            if (isSupportHighBitDepth() && bitDepth >= 3) {
                this.mTargetBitDepth = bitDepth;
                this.isUseFloatForHighDepth = true;
                if (this.mTargetPlaySample != this.mInformation.getSampleRate()) {
                    Logger.m21791i(TAG, axiliary("will use float resampled pcm for Hi-Res, bitDept: " + bitDepth + ", origin sample rate: " + this.mInformation.getSampleRate() + ", target sample rate: " + this.mTargetPlaySample));
                } else {
                    Logger.m21791i(TAG, axiliary("will use float pcm for Hi-Res, bitDept: " + bitDepth + ", sample rate: " + this.mTargetPlaySample));
                }
            } else if (isSupportHighBitDepth() || bitDepth < 3) {
                this.mTargetBitDepth = bitDepth;
                Logger.m21791i(TAG, axiliary("will use byte pcm resampled, bitDept: " + bitDepth + ", origin sample rate: " + this.mInformation.getSampleRate() + ", target sample rate: " + this.mTargetPlaySample));
            } else {
                this.mTargetBitDepth = 2;
                if (this.mTargetPlaySample != this.mInformation.getSampleRate()) {
                    Logger.m21791i(TAG, axiliary("will use byte pcm resampled and bitDept converted, origin bitDept: " + bitDepth + ", target bitDept: " + this.mTargetBitDepth + ", origin sample rate: " + this.mInformation.getSampleRate() + ", target sample rate: " + this.mTargetPlaySample));
                } else {
                    Logger.m21791i(TAG, axiliary("will use byte pcm with bitDept converted, origin bitDept: " + bitDepth + ", target bitDept: " + this.mTargetBitDepth));
                }
            }
            int i2 = bitDepth == 1 ? 3 : (bitDepth != 2 && this.isUseFloatForHighDepth) ? 4 : 2;
            Logger.m21786d(TAG, axiliary(String.format("mTargetPlaySample: %d, playChannel: %d", new Object[]{Long.valueOf(this.mTargetPlaySample), Integer.valueOf(channels)})));
            try {
                setAudioTrack(BaseDecodeDataComponent.instantiateAudioTrackCompat(this.mAudioStreamType, (int) this.mTargetPlaySample, i, i2, this.mAllBufferSize, 0));
                if (this.mSpeedToSet != null && Build.VERSION.SDK_INT >= 23) {
                    Logger.m21791i(TAG, axiliary("setSpeed:" + this.mSpeedToSet));
                    PlaybackParams playbackParams = this.mAudioTrack.getPlaybackParams();
                    playbackParams.setSpeed(this.mSpeedToSet.floatValue());
                    this.mSpeedToSet = null;
                    this.mAudioTrack.setPlaybackParams(playbackParams);
                }
                if (this.mAudioTrack.getState() == 2) {
                    Logger.m21786d(TAG, axiliary("new AudioTrack succeed"));
                }
            } catch (Throwable th) {
                Logger.m21790e(TAG, th);
            }
            AudioTrack audioTrack = this.mAudioTrack;
            if (audioTrack == null || audioTrack.getState() != 2) {
                this.mCreateAudioTrackFail = true;
                Logger.m21787e(TAG, axiliary("create audioTrack fail mCreateAudioTrackFail = true"));
                setAudioTrack((AudioTrack) null);
                this.mStateRunner.transfer(9);
                callExceptionCallback(91, 66);
                return false;
            }
            Logger.m21786d(TAG, axiliary("create audioTrack success"));
            return true;
        }
    }

    private boolean decodeAllData() {
        this.mAllPcmBufferList = new ArrayList();
        while (true) {
            if (this.mCorePlayer.mIsExit) {
                break;
            }
            BufferInfo bufferInfo = new BufferInfo();
            bufferInfo.setByteBufferCapacity(this.mBuffSize);
            try {
                int pullDecodeData = this.mHandleDecodeDataCallback.pullDecodeData(this.mBuffSize, bufferInfo.byteBuffer);
                this.mHasDecode = true;
                if (pullDecodeData > 0) {
                    bufferInfo.bufferSize = pullDecodeData;
                    this.mAllPcmBufferList.add(bufferInfo);
                    if (!this.mHasDecodeSuccess) {
                        this.mHasDecodeSuccess = true;
                    }
                } else if (pullDecodeData == 0) {
                    bufferInfo.bufferSize = this.mBuffSize;
                    this.mAllPcmBufferList.add(bufferInfo);
                    Logger.m21791i(TAG, "static decode end");
                } else {
                    this.mHandleDecodeDataCallback.onPullDecodeDataEndOrFailed(pullDecodeData, 91);
                    return false;
                }
            } catch (SoNotFindException e) {
                Logger.m21790e(TAG, (Throwable) e);
                this.mStateRunner.transfer(9);
                callExceptionCallback(91, 62);
                return false;
            } catch (Throwable th) {
                Logger.m21790e(TAG, th);
                this.mStateRunner.transfer(9);
                callExceptionCallback(91, 67);
                return false;
            }
        }
        if (!this.mAllPcmBufferList.isEmpty()) {
            int i = 0;
            for (BufferInfo bufferInfo2 : this.mAllPcmBufferList) {
                i += bufferInfo2.bufferSize;
            }
            Logger.m21791i(TAG, "static totalBufferSize = " + i);
            this.mDecodeBufferInfo.setByteBufferCapacity(i);
            int i2 = 0;
            for (BufferInfo next : this.mAllPcmBufferList) {
                System.arraycopy(next.byteBuffer, 0, this.mDecodeBufferInfo.byteBuffer, i2, next.bufferSize);
                int i3 = next.bufferSize;
                i2 += i3;
                this.mDecodeBufferInfo.bufferSize += i3;
                this.mAllBufferSize += next.bufferSize;
            }
        }
        return true;
    }

    private void playAudioTrack() {
        this.mAudioTrack.reloadStaticData();
        while (!this.mCorePlayer.mIsExit) {
            if (isPaused()) {
                if (this.mAudioTrack.getPlayState() != 2) {
                    this.mAudioTrack.pause();
                }
                postRunnable(new Runnable() {
                    public void run() {
                        StaticDecodeDataComponent staticDecodeDataComponent = StaticDecodeDataComponent.this;
                        staticDecodeDataComponent.mCallback.playerPaused(staticDecodeDataComponent.mCorePlayer);
                    }
                }, 20);
                doWaitForPaused();
            } else if (!isIdle()) {
                if (isError()) {
                    Logger.m21787e(TAG, "static play error");
                    return;
                } else if (isStopped()) {
                    if (this.mAudioTrack.getPlayState() != 1) {
                        this.mAudioTrack.stop();
                    }
                    postRunnable(new Runnable() {
                        public void run() {
                            StaticDecodeDataComponent staticDecodeDataComponent = StaticDecodeDataComponent.this;
                            staticDecodeDataComponent.mCallback.playerStopped(staticDecodeDataComponent.mCorePlayer);
                        }
                    }, 20);
                    return;
                } else if (isCompleted()) {
                    this.mCorePlayer.mIsExit = true;
                    return;
                } else if (isPlaying()) {
                    if (this.mAudioTrack.getPlayState() == 2) {
                        this.mAudioTrack.play();
                    } else if (this.mAudioTrack.getPlayState() == 1) {
                        if (!this.mIsfirstStarted) {
                            this.mIsfirstStarted = true;
                            this.mAudioTrack.play();
                            this.mCallback.playerStarted(this.mCorePlayer);
                        }
                    } else if (((long) AudioUtil.getPlaybackHeadPositionSafely(this.mAudioTrack)) * ((long) this.mInformation.getChannels()) * ((long) this.mTargetBitDepth) >= ((long) this.mAllBufferSize)) {
                        this.mStateRunner.transfer(7);
                        Logger.m21791i(TAG, "static play completed");
                        postRunnable(new Runnable() {
                            public void run() {
                                StaticDecodeDataComponent staticDecodeDataComponent = StaticDecodeDataComponent.this;
                                staticDecodeDataComponent.mCallback.playerEnded(staticDecodeDataComponent.mCorePlayer);
                            }
                        }, 20);
                    }
                }
            } else {
                return;
            }
        }
    }

    private boolean writeAudioTrack() {
        BufferInfo bufferInfo = new BufferInfo();
        if (!(this.mDecodeBufferInfo.byteBuffer == null || this.mAudioTrack == null)) {
            if (this.mTargetBitDepth != this.mInformation.getBitDepth()) {
                handleHighBitDepth(this.mDecodeBufferInfo, bufferInfo);
                this.mDecodeBufferInfo.fillInto(bufferInfo);
            }
            if (this.mTargetPlaySample != this.mInformation.getSampleRate()) {
                handleHighSample(this.mDecodeBufferInfo, bufferInfo);
                this.mDecodeBufferInfo.fillInto(bufferInfo);
            }
            if (this.isUseFloatForHighDepth) {
                convertBytePcmToFloatPcm(this.mDecodeBufferInfo, this.mFloatBufferInfo);
                IAudioListener iAudioListener = this.mAudioEffectListener;
                FloatBufferInfo floatBufferInfo = this.mFloatBufferInfo;
                iAudioListener.onPcm(floatBufferInfo, floatBufferInfo, this.mCorePlayer.getCurPositionByDecoder());
            } else {
                this.mAudioEffectListener.onPcm(this.mDecodeBufferInfo, bufferInfo, this.mCorePlayer.getCurPositionByDecoder());
                this.mDecodeBufferInfo.fillInto(bufferInfo);
            }
            this.mHasTerminal = false;
            if (this.mTerminalAudioEffectListener.isEnabled()) {
                if (this.isUseFloatForHighDepth) {
                    IAudioListener iAudioListener2 = this.mTerminalAudioEffectListener;
                    FloatBufferInfo floatBufferInfo2 = this.mFloatBufferInfo;
                    iAudioListener2.onPcm(floatBufferInfo2, floatBufferInfo2, this.mCorePlayer.getCurPositionByDecoder());
                } else {
                    IAudioListener iAudioListener3 = this.mTerminalAudioEffectListener;
                    BufferInfo bufferInfo2 = this.mDecodeBufferInfo;
                    iAudioListener3.onPcm(bufferInfo2, bufferInfo2, this.mCorePlayer.getCurPositionByDecoder());
                }
                this.mHasTerminal = true;
            }
            if (!this.mHasTerminal) {
                if (this.isUseFloatForHighDepth) {
                    AudioTrack audioTrack = this.mAudioTrack;
                    FloatBufferInfo floatBufferInfo3 = this.mFloatBufferInfo;
                    int write = audioTrack.write(floatBufferInfo3.floatBuffer, 0, floatBufferInfo3.bufferSize, 0);
                    if (write < 0) {
                        Logger.m21787e(TAG, axiliary("mAudioTrack write float failed: " + write + ", expect: " + this.mFloatBufferInfo.bufferSize));
                        this.mStateRunner.transfer(9);
                        callExceptionCallback(91, 102);
                        return false;
                    }
                    if (write != this.mFloatBufferInfo.bufferSize) {
                        Logger.m21793w(TAG, axiliary("mAudioTrack write float not equal: " + write + ", expect: " + this.mFloatBufferInfo.bufferSize));
                    }
                    int i = this.mFloatBufferInfo.bufferSize;
                } else {
                    AudioTrack audioTrack2 = this.mAudioTrack;
                    BufferInfo bufferInfo3 = this.mDecodeBufferInfo;
                    int write2 = audioTrack2.write(bufferInfo3.byteBuffer, 0, bufferInfo3.bufferSize);
                    if (write2 < 0) {
                        Logger.m21787e(TAG, axiliary("mAudioTrack write bytes failed: " + write2 + ", expect: " + this.mDecodeBufferInfo.bufferSize));
                        this.mStateRunner.transfer(9);
                        callExceptionCallback(91, 102);
                        return false;
                    }
                    if (write2 != this.mDecodeBufferInfo.bufferSize) {
                        Logger.m21793w(TAG, axiliary("mAudioTrack write bytes not equal: " + write2 + ", expect: " + this.mDecodeBufferInfo.bufferSize));
                    }
                    int i2 = this.mDecodeBufferInfo.bufferSize;
                }
                return true;
            }
            Logger.m21791i(TAG, "mTerminalAudioEffectList has blocked");
        }
        return false;
    }

    public int getAudioStreamType() {
        return 3;
    }

    public long getCurPosition() {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack == null || audioTrack.getState() == 0) {
            return this.mCurPosition;
        }
        long audioTrackPosition = (long) BaseDecodeDataComponent.getAudioTrackPosition(0, audioTrack);
        this.mCurPosition = audioTrackPosition;
        return audioTrackPosition;
    }

    public void handleDecodeData() {
        AudioInformation audioInformation = this.mInformation;
        if (audioInformation != null) {
            try {
                if (0 >= audioInformation.getSampleRate()) {
                    Logger.m21787e(TAG, "failed to getSampleRate");
                    this.mStateRunner.transfer(9);
                    callExceptionCallback(91, 63);
                } else if (this.mInformation.getChannels() <= 0) {
                    Logger.m21787e(TAG, "failed to getChannels");
                    this.mStateRunner.transfer(9);
                    callExceptionCallback(91, 63);
                } else {
                    this.mHasInit = true;
                    if (!decodeAllData()) {
                        Logger.m21787e(TAG, "failed to decodeAllData");
                        this.mStateRunner.transfer(9);
                    } else if (!createAudioTrack()) {
                        Logger.m21787e(TAG, "failed to createAudioTrack");
                        this.mStateRunner.transfer(9);
                    } else {
                        initAudioListeners(this.mTargetBitDepth, this.mInformation, getCurPosition());
                        if (!writeAudioTrack() && !this.mHasTerminal) {
                            Logger.m21787e(TAG, "failed to writeAudioTrack");
                            this.mStateRunner.transfer(9);
                        } else if (this.mHasTerminal) {
                            this.mStateRunner.transfer(7);
                        } else {
                            if (!this.mStateRunner.transfer(2, 3)) {
                                Logger.m21787e(TAG, "failed to transfer to PREPARED because cur State is NOT PREPARING!!");
                                return;
                            }
                            this.mIsfirstStarted = false;
                            postRunnable(new Runnable() {
                                public void run() {
                                    if (StaticDecodeDataComponent.this.getPlayerState() == 8) {
                                        Logger.m21793w(StaticDecodeDataComponent.TAG, "[run] state changed to END during postRunnable!");
                                        return;
                                    }
                                    StaticDecodeDataComponent staticDecodeDataComponent = StaticDecodeDataComponent.this;
                                    staticDecodeDataComponent.mCallback.playerPrepared(staticDecodeDataComponent.mCorePlayer);
                                }
                            }, 0);
                            Logger.m21791i(TAG, axiliary("prepared. waiting..."));
                            this.mSignalControl.doWait(20, 100, new WaitNotify.WaitListener() {
                                public boolean keepWaiting() {
                                    return StaticDecodeDataComponent.this.getPlayerState() == 2;
                                }
                            });
                            Logger.m21791i(TAG, axiliary("woke after preparing"));
                            playAudioTrack();
                        }
                    }
                }
            } catch (SoNotFindException e) {
                Logger.m21790e(TAG, (Throwable) e);
            }
        } else {
            Logger.m21787e(TAG, axiliary("不留痕迹的退出 时机：获取Information时 step = 3"));
            this.mStateRunner.transfer(9);
            callExceptionCallback(91, 63);
        }
    }
}
