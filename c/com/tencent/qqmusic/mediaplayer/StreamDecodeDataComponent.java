package com.tencent.qqmusic.mediaplayer;

import android.media.AudioTrack;
import android.os.Handler;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent;
import com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.util.Stack;

class StreamDecodeDataComponent extends BaseDecodeDataComponent {
    private static final int MAX_AUDIO_TRACK_BUFFER_TIME = 1;
    private static final int MIN_AUDIO_TRACK_BUFFER_TIMES = 1;
    private static final String TAG = "StreamDecodeDataComponent";
    private static final int USE_AUDIO_TRACK_TIME_THRESHOLD = 5000;
    private long mCurrentFrameCount = 0;
    private boolean mNeedFlush = false;
    private final Stack<Integer> mSeekRecord = new Stack<>();
    private int mTrackBufferSizeInByte;

    public StreamDecodeDataComponent(CorePlayer corePlayer, PlayerStateRunner playerStateRunner, AudioInformation audioInformation, PlayerCallback playerCallback, BaseDecodeDataComponent.HandleDecodeDataCallback handleDecodeDataCallback, Handler handler, int i, IAudioListener iAudioListener, IAudioListener iAudioListener2) {
        super(corePlayer, playerStateRunner, audioInformation, playerCallback, handleDecodeDataCallback, handler, i, iAudioListener, iAudioListener2);
    }

    private void addSeekRecord(int i) {
        synchronized (this.mSeekRecord) {
            Logger.m21791i(TAG, "add seek: " + i);
            this.mSeekRecord.push(Integer.valueOf(i));
        }
    }

    private boolean createAudioTrack() {
        int i;
        int i2;
        Logger.m21786d(TAG, axiliary("createAudioTrack"));
        if (!this.mStateRunner.isEqual(3)) {
            Logger.m21787e(TAG, "mState is not preparing");
            callExceptionCallback(91, 54);
            return false;
        } else if (this.mInformation.getSampleRate() <= 0) {
            Logger.m21787e(TAG, "mInformation.getSampleRate() failed");
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
            Logger.m21786d(TAG, axiliary(this.mInformation.toString()));
            this.mTargetPlaySample = this.mInformation.getSampleRate();
            while (this.mTargetPlaySample > ((long) getMaxSupportSampleRate())) {
                this.mTargetPlaySample /= 2;
            }
            int bitDepth = this.mInformation.getBitDepth();
            int i3 = bitDepth == 0 ? 2 : bitDepth;
            if (isSupportHighBitDepth() && this.mInformation.getBitDepth() >= 3) {
                this.mTargetBitDepth = i3;
                this.isUseFloatForHighDepth = true;
                if (this.mTargetPlaySample != this.mInformation.getSampleRate()) {
                    Logger.m21791i(TAG, axiliary("will use float resampled pcm for Hi-Res, bitDept: " + this.mInformation.getBitDepth() + ", origin sample rate: " + this.mInformation.getSampleRate() + ", target sample rate: " + this.mTargetPlaySample));
                } else {
                    Logger.m21791i(TAG, axiliary("will use float pcm for Hi-Res, bitDept: " + this.mInformation.getBitDepth() + ", sample rate: " + this.mTargetPlaySample));
                }
            } else if (isSupportHighBitDepth() || this.mInformation.getBitDepth() < 3) {
                this.mTargetBitDepth = i3;
                Logger.m21791i(TAG, axiliary("will use byte pcm resampled, bitDept: " + this.mInformation.getBitDepth() + ", origin sample rate: " + this.mInformation.getSampleRate() + ", target sample rate: " + this.mTargetPlaySample));
            } else {
                this.mTargetBitDepth = 2;
                if (this.mTargetPlaySample != this.mInformation.getSampleRate()) {
                    Logger.m21791i(TAG, axiliary("will use byte pcm resampled and bitDept converted, origin bitDept: " + this.mInformation.getBitDepth() + ", target bitDept: " + this.mTargetBitDepth + ", origin sample rate: " + this.mInformation.getSampleRate() + ", target sample rate: " + this.mTargetPlaySample));
                } else {
                    Logger.m21791i(TAG, axiliary("will use byte pcm with bitDept converted, origin bitDept: " + this.mInformation.getBitDepth() + ", target bitDept: " + this.mTargetBitDepth));
                }
            }
            int i4 = i3 == 1 ? 3 : (i3 != 2 && this.isUseFloatForHighDepth) ? 4 : 2;
            int minPcmBufferSize = (int) this.mHandleDecodeDataCallback.getMinPcmBufferSize();
            int i5 = i3;
            int minBufferSize = getMinBufferSize(this.mTargetPlaySample, i, i4, channels, i3);
            Logger.m21791i(TAG, axiliary("[createAudioTrack] playback_bufsize:" + minBufferSize + " decoderBufsizeInByte:" + minPcmBufferSize));
            int i6 = this.mLeastCommonMultiple;
            if (i6 > 1) {
                minBufferSize = getLcm(i6, minBufferSize);
            }
            this.mBuffSize = minBufferSize > minPcmBufferSize ? minBufferSize : minPcmBufferSize;
            Logger.m21791i(TAG, axiliary(String.format("playback_bufsize: %d, mBuffSize: %d, mTargetPlaySample: %d, playChannel: %d, pcmEncoding: %d", new Object[]{Integer.valueOf(minBufferSize), Integer.valueOf(this.mBuffSize), Long.valueOf(this.mTargetPlaySample), Integer.valueOf(channels), Integer.valueOf(i4)})));
            int max = Math.max((int) (Math.floor((double) ((((this.mTargetPlaySample * 1) * ((long) channels)) * 2) / ((long) minBufferSize))) + 1.0d), 1);
            Logger.m21786d(TAG, axiliary("times: " + max + ", MIN_AUDIO_TRACK_BUFFER_TIMES: " + 1));
            int i7 = max;
            while (true) {
                if (i7 < 1) {
                    break;
                }
                int i8 = minBufferSize * i7;
                try {
                    this.mTrackBufferSizeInByte = i8;
                    setAudioTrack(BaseDecodeDataComponent.instantiateAudioTrackCompat(this.mAudioStreamType, (int) this.mTargetPlaySample, i, i4, i8, 1));
                    StringBuilder sb = new StringBuilder();
                    sb.append("[createAudioTrack] new AudioTrack, sampleRate: ");
                    sb.append(this.mTargetPlaySample);
                    sb.append(", channels: ");
                    sb.append(i);
                    sb.append(", bitDepth: ");
                    i2 = i5;
                    try {
                        sb.append(i2);
                        sb.append(", buffer: ");
                        sb.append(this.mTrackBufferSizeInByte);
                        Logger.m21791i(TAG, axiliary(sb.toString()));
                        int state = this.mAudioTrack.getState();
                        if (state == 1) {
                            Logger.m21791i(TAG, axiliary("new AudioTrack succeed"));
                            break;
                        }
                        Logger.m21787e(TAG, axiliary("audioTrack create fail!!! state = " + state));
                        this.mAudioTrack.release();
                        i7 -= 2;
                        i5 = i2;
                    } catch (Throwable th) {
                        th = th;
                        Logger.m21790e(TAG, th);
                        i7 -= 2;
                        i5 = i2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    i2 = i5;
                    Logger.m21790e(TAG, th);
                    i7 -= 2;
                    i5 = i2;
                }
            }
            AudioTrack audioTrack = this.mAudioTrack;
            if (audioTrack == null || audioTrack.getState() != 1) {
                this.mCreateAudioTrackFail = true;
                Logger.m21787e(TAG, axiliary("create audioTrack fail mCreateAudioTrackFail = true"));
                setAudioTrack((AudioTrack) null);
                callExceptionCallback(92, 66);
                return false;
            }
            Logger.m21786d(TAG, axiliary("create audioTrack success times = " + i7));
            this.mStateRunner.setAudioTrack(this.mAudioTrack);
            return true;
        }
    }

    private long getCalcBitMinSize(AudioInformation audioInformation) {
        if (audioInformation != null) {
            return (long) ((((float) ((audioInformation.getSampleRate() * ((long) audioInformation.getChannels())) * ((long) audioInformation.getBitDepth()))) * 5.0f) / 1000.0f);
        }
        return 0;
    }

    private int getGcd(int i, int i2) {
        while (true) {
            int i3 = i2;
            int i4 = i;
            i = i3;
            if (i <= 0) {
                return i4;
            }
            i2 = i4 % i;
        }
    }

    private int getLcm(int i, int i2) {
        return (i * i2) / getGcd(i, i2);
    }

    private BufferInfo initTempBufferInfoIfNeeded(BufferInfo bufferInfo, int i) {
        if (bufferInfo != null) {
            return bufferInfo;
        }
        BufferInfo bufferInfo2 = new BufferInfo();
        bufferInfo2.setByteBufferCapacity(i);
        return bufferInfo2;
    }

    private FloatBufferInfo initTempFloatBufferInfoIfNeeded(FloatBufferInfo floatBufferInfo, int i) {
        if (floatBufferInfo != null) {
            return floatBufferInfo;
        }
        FloatBufferInfo floatBufferInfo2 = new FloatBufferInfo();
        floatBufferInfo2.setFloatBufferCapacity(i);
        return floatBufferInfo2;
    }

    public void flush() {
        this.mNeedFlush = true;
    }

    public int getAudioStreamType() {
        return 3;
    }

    public long getCurPosition() {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack == null || audioTrack.getState() == 0) {
            return this.mCurPosition;
        }
        AudioInformation audioInformation = this.mInformation;
        if (audioInformation == null) {
            return this.mCurPosition;
        }
        long actualTime = this.mAudioEffectListener.getActualTime((long) BaseDecodeDataComponent.getAudioTrackPosition(this.mCurrentFrameCount, audioTrack));
        long channels = ((long) (audioInformation.getChannels() * this.mTargetBitDepth)) * audioInformation.getPlaySample();
        long curPositionByDecoder = this.mHandleDecodeDataCallback.getCurPositionByDecoder() - Math.max(0, channels > 0 ? (((long) this.mTrackBufferSizeInByte) / channels) * 1000 : 0);
        if (curPositionByDecoder < 0) {
            this.mCurPosition = actualTime;
        } else if (actualTime <= 0 || Math.abs(actualTime - curPositionByDecoder) >= FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
            this.mCurPosition = curPositionByDecoder;
        } else {
            this.mCurPosition = actualTime;
        }
        return this.mCurPosition;
    }

    /* JADX WARNING: Removed duplicated region for block: B:202:0x063d  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0646  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0730  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0735  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleDecodeData() {
        /*
            r39 = this;
            r7 = r39
            com.tencent.qqmusic.mediaplayer.AudioInformation r0 = r7.mInformation
            r1 = 63
            r2 = 91
            r3 = 9
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            if (r0 == 0) goto L_0x07cb
            com.tencent.qqmusic.mediaplayer.CorePlayer r0 = r7.mCorePlayer
            boolean r0 = r0.mIsExit
            if (r0 != 0) goto L_0x07cb
            r9 = 0
            r11 = 1
            com.tencent.qqmusic.mediaplayer.AudioInformation r0 = r7.mInformation     // Catch:{ SoNotFindException -> 0x006c }
            long r3 = r0.getSampleRate()     // Catch:{ SoNotFindException -> 0x006c }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0033
            java.lang.String r0 = "StreamDecodeDataComponent"
            java.lang.String r3 = "failed to getSampleRate"
            com.tencent.qqmusic.mediaplayer.util.Logger.m21787e((java.lang.String) r0, (java.lang.String) r3)     // Catch:{ SoNotFindException -> 0x006c }
            com.tencent.qqmusic.mediaplayer.PlayerStateRunner r0 = r7.mStateRunner     // Catch:{ SoNotFindException -> 0x006c }
            r0.transfer(r8)     // Catch:{ SoNotFindException -> 0x006c }
            r7.callExceptionCallback(r2, r1)     // Catch:{ SoNotFindException -> 0x006c }
            return
        L_0x0033:
            com.tencent.qqmusic.mediaplayer.AudioInformation r0 = r7.mInformation     // Catch:{ SoNotFindException -> 0x006c }
            int r0 = r0.getChannels()     // Catch:{ SoNotFindException -> 0x006c }
            if (r0 > 0) goto L_0x004b
            java.lang.String r0 = "StreamDecodeDataComponent"
            java.lang.String r3 = "failed to getChannels"
            com.tencent.qqmusic.mediaplayer.util.Logger.m21787e((java.lang.String) r0, (java.lang.String) r3)     // Catch:{ SoNotFindException -> 0x006c }
            com.tencent.qqmusic.mediaplayer.PlayerStateRunner r0 = r7.mStateRunner     // Catch:{ SoNotFindException -> 0x006c }
            r0.transfer(r8)     // Catch:{ SoNotFindException -> 0x006c }
            r7.callExceptionCallback(r2, r1)     // Catch:{ SoNotFindException -> 0x006c }
            return
        L_0x004b:
            r7.mHasInit = r11     // Catch:{ SoNotFindException -> 0x006c }
            boolean r0 = r39.createAudioTrack()     // Catch:{ SoNotFindException -> 0x006c }
            if (r0 != 0) goto L_0x0060
            java.lang.String r0 = "StreamDecodeDataComponent"
            java.lang.String r1 = "failed to createAudioTrack"
            com.tencent.qqmusic.mediaplayer.util.Logger.m21787e((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ SoNotFindException -> 0x006c }
            com.tencent.qqmusic.mediaplayer.PlayerStateRunner r0 = r7.mStateRunner     // Catch:{ SoNotFindException -> 0x006c }
            r0.transfer(r8)     // Catch:{ SoNotFindException -> 0x006c }
            return
        L_0x0060:
            int r0 = r7.mTargetBitDepth     // Catch:{ SoNotFindException -> 0x006c }
            com.tencent.qqmusic.mediaplayer.AudioInformation r1 = r7.mInformation     // Catch:{ SoNotFindException -> 0x006c }
            long r2 = r39.getCurPosition()     // Catch:{ SoNotFindException -> 0x006c }
            r7.initAudioListeners(r0, r1, r2)     // Catch:{ SoNotFindException -> 0x006c }
            goto L_0x0072
        L_0x006c:
            r0 = move-exception
            java.lang.String r1 = "StreamDecodeDataComponent"
            com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r1, (java.lang.Throwable) r0)
        L_0x0072:
            com.tencent.qqmusic.mediaplayer.PlayerStateRunner r0 = r7.mStateRunner
            r12 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r0.transfer(r1)
            com.tencent.qqmusic.mediaplayer.StreamDecodeDataComponent$1 r0 = new com.tencent.qqmusic.mediaplayer.StreamDecodeDataComponent$1
            r0.<init>()
            r13 = 0
            r7.postRunnable(r0, r13)
            boolean r0 = r39.isPlaying()
            if (r0 != 0) goto L_0x00b6
            com.tencent.qqmusic.mediaplayer.CorePlayer r0 = r7.mCorePlayer
            boolean r0 = r0.mIsExit
            if (r0 != 0) goto L_0x00b6
            java.lang.String r0 = "StreamDecodeDataComponent"
            java.lang.String r1 = "prepared. waiting..."
            java.lang.String r1 = r7.axiliary(r1)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r0, r1)
            com.tencent.qqmusic.mediaplayer.util.WaitNotify r0 = r7.mSignalControl
            r1 = 20
            r3 = 100
            com.tencent.qqmusic.mediaplayer.StreamDecodeDataComponent$2 r4 = new com.tencent.qqmusic.mediaplayer.StreamDecodeDataComponent$2
            r4.<init>()
            r0.doWait(r1, r3, r4)
            java.lang.String r0 = "StreamDecodeDataComponent"
            java.lang.String r1 = "woke after preparing"
            java.lang.String r1 = r7.axiliary(r1)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r0, r1)
        L_0x00b6:
            com.tencent.qqmusic.mediaplayer.PlayerConfigManager r0 = com.tencent.qqmusic.mediaplayer.PlayerConfigManager.getInstance()
            com.tencent.qqmusic.mediaplayer.CorePlayer r1 = r7.mCorePlayer
            r0.setCommonPlayerRef(r1)
            com.tencent.qqmusic.mediaplayer.BufferInfo r0 = r7.mDecodeBufferInfo
            int r1 = r7.mBuffSize
            r0.setByteBufferCapacity(r1)
            r0 = 0
            r16 = r0
            r17 = r16
            r4 = r9
            r1 = 0
            r2 = 0
            r3 = 1
            r6 = 0
            r14 = 0
            r15 = 0
            r18 = 0
            r19 = 0
            r20 = 1
            r26 = 0
        L_0x00da:
            com.tencent.qqmusic.mediaplayer.CorePlayer r9 = r7.mCorePlayer
            boolean r9 = r9.mIsExit
            if (r9 != 0) goto L_0x07ca
            java.lang.Float r9 = r7.mSpeedToSet
            if (r9 == 0) goto L_0x0121
            android.media.AudioTrack r9 = r7.mAudioTrack
            if (r9 == 0) goto L_0x0121
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 23
            if (r9 < r10) goto L_0x0121
            java.lang.String r9 = "StreamDecodeDataComponent"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "setSpeed:"
            r10.append(r11)
            java.lang.Float r11 = r7.mSpeedToSet
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r10 = r7.axiliary(r10)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r9, r10)
            android.media.AudioTrack r9 = r7.mAudioTrack
            android.media.PlaybackParams r9 = r9.getPlaybackParams()
            java.lang.Float r10 = r7.mSpeedToSet
            float r10 = r10.floatValue()
            r9.setSpeed(r10)
            r7.mSpeedToSet = r0
            android.media.AudioTrack r10 = r7.mAudioTrack
            r10.setPlaybackParams(r9)
        L_0x0121:
            java.util.Stack<java.lang.Integer> r9 = r7.mSeekRecord
            monitor-enter(r9)
            java.util.Stack<java.lang.Integer> r10 = r7.mSeekRecord     // Catch:{ all -> 0x07c7 }
            boolean r10 = r10.empty()     // Catch:{ all -> 0x07c7 }
            if (r10 != 0) goto L_0x0159
            java.util.Stack<java.lang.Integer> r10 = r7.mSeekRecord     // Catch:{ all -> 0x07c7 }
            java.lang.Object r10 = r10.pop()     // Catch:{ all -> 0x07c7 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x07c7 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x07c7 }
            java.util.Stack<java.lang.Integer> r11 = r7.mSeekRecord     // Catch:{ all -> 0x07c7 }
            r11.clear()     // Catch:{ all -> 0x07c7 }
            java.lang.String r11 = "StreamDecodeDataComponent"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x07c7 }
            r0.<init>()     // Catch:{ all -> 0x07c7 }
            java.lang.String r12 = "execute seek: "
            r0.append(r12)     // Catch:{ all -> 0x07c7 }
            r0.append(r10)     // Catch:{ all -> 0x07c7 }
            java.lang.String r12 = ", abandon the others"
            r0.append(r12)     // Catch:{ all -> 0x07c7 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x07c7 }
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r11, r0)     // Catch:{ all -> 0x07c7 }
            goto L_0x015a
        L_0x0159:
            r10 = -1
        L_0x015a:
            monitor-exit(r9)     // Catch:{ all -> 0x07c7 }
            if (r10 >= 0) goto L_0x0185
            boolean r0 = r7.mNeedFlush
            if (r0 == 0) goto L_0x0185
            long r9 = r7.mCurrentFrameCount
            android.media.AudioTrack r0 = r7.mAudioTrack
            int r10 = com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.getAudioTrackPosition(r9, r0)
            java.lang.String r0 = "StreamDecodeDataComponent"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "[run] flashback to "
            r9.append(r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = r7.axiliary(r9)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r0, r9)
            r7.mNeedFlush = r13
        L_0x0185:
            r0 = 3
            if (r10 < 0) goto L_0x0202
            com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent$HandleDecodeDataCallback r9 = r7.mHandleDecodeDataCallback
            int r9 = r9.seekTo(r10)
            if (r9 >= 0) goto L_0x01b8
            java.lang.String r0 = "StreamDecodeDataComponent"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "seekTo failed: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r7.axiliary(r1)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21787e((java.lang.String) r0, (java.lang.String) r1)
            com.tencent.qqmusic.mediaplayer.PlayerStateRunner r0 = r7.mStateRunner
            r0.transfer(r8)
            r0 = 95
            r1 = 74
            r7.callExceptionCallback(r0, r1)
            return
        L_0x01b8:
            android.media.AudioTrack r9 = r7.mAudioTrack
            if (r9 == 0) goto L_0x01f2
            double r11 = (double) r10
            r21 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r11 = r11 / r21
            int r1 = r9.getSampleRate()
            r21 = r14
            double r13 = (double) r1
            double r11 = r11 * r13
            long r11 = java.lang.Math.round(r11)
            r7.mCurrentFrameCount = r11
            android.media.AudioTrack r1 = r7.mAudioTrack
            int r1 = r1.getPlayState()
            if (r1 != r0) goto L_0x01eb
            android.media.AudioTrack r1 = r7.mAudioTrack
            r1.pause()
            android.media.AudioTrack r1 = r7.mAudioTrack
            r1.flush()
            android.media.AudioTrack r1 = r7.mAudioTrack
            r1.play()
            goto L_0x01f0
        L_0x01eb:
            android.media.AudioTrack r1 = r7.mAudioTrack
            r1.flush()
        L_0x01f0:
            r1 = 0
            goto L_0x01f4
        L_0x01f2:
            r21 = r14
        L_0x01f4:
            long r11 = (long) r10
            r7.mCurPosition = r11
            r7.notifySeekCompleteForAudioListeners(r11)
            com.tencent.qqmusic.mediaplayer.PlayerCallback r9 = r7.mCallback
            com.tencent.qqmusic.mediaplayer.CorePlayer r11 = r7.mCorePlayer
            r9.playerSeekCompletion(r11, r10)
            goto L_0x0204
        L_0x0202:
            r21 = r14
        L_0x0204:
            r9 = r1
            boolean r1 = r39.isPaused()
            if (r1 == 0) goto L_0x0246
            android.media.AudioTrack r0 = r7.mAudioTrack
            int r0 = r0.getPlayState()
            r1 = 2
            if (r0 == r1) goto L_0x0219
            android.media.AudioTrack r0 = r7.mAudioTrack
            r0.pause()
        L_0x0219:
            com.tencent.qqmusic.mediaplayer.StreamDecodeDataComponent$3 r0 = new com.tencent.qqmusic.mediaplayer.StreamDecodeDataComponent$3
            r0.<init>()
            r1 = 20
            r7.postRunnable(r0, r1)
            java.lang.String r0 = "StreamDecodeDataComponent"
            java.lang.String r1 = "paused. waiting..."
            java.lang.String r1 = r7.axiliary(r1)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r0, r1)
            r39.doWaitForPaused()
            java.lang.String r0 = "StreamDecodeDataComponent"
            java.lang.String r1 = "woke after pausing"
            java.lang.String r1 = r7.axiliary(r1)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r0, r1)
            r1 = r9
        L_0x023e:
            r14 = r21
            r0 = 0
            r11 = 1
            r12 = 2
            r13 = 0
            goto L_0x00da
        L_0x0246:
            boolean r1 = r39.isIdle()
            if (r1 == 0) goto L_0x024e
            goto L_0x07ca
        L_0x024e:
            boolean r1 = r39.isError()
            if (r1 == 0) goto L_0x0256
            goto L_0x07ca
        L_0x0256:
            boolean r1 = r39.isStopped()
            if (r1 == 0) goto L_0x025e
            goto L_0x07ca
        L_0x025e:
            boolean r1 = r39.isCompleted()
            if (r1 == 0) goto L_0x02d3
            com.tencent.qqmusic.mediaplayer.AudioInformation r0 = r7.mInformation
            int r0 = r0.getChannels()
            int r0 = r9 / r0
            int r0 = r0 - r2
            if (r0 <= 0) goto L_0x0271
            r13 = r0
            goto L_0x0272
        L_0x0271:
            r13 = 0
        L_0x0272:
            int r0 = r7.mTrackBufferSizeInByte
            int r1 = r7.mTargetBitDepth
            int r0 = r0 / r1
            com.tencent.qqmusic.mediaplayer.AudioInformation r1 = r7.mInformation
            int r1 = r1.getChannels()
            int r0 = r0 / r1
            if (r13 >= r0) goto L_0x0281
            goto L_0x0282
        L_0x0281:
            r13 = r0
        L_0x0282:
            int r13 = r13 * 1000
            long r0 = (long) r13
            com.tencent.qqmusic.mediaplayer.AudioInformation r3 = r7.mInformation
            long r3 = r3.getSampleRate()
            long r0 = r0 / r3
            int r1 = (int) r0
            int r0 = com.tencent.qqmusic.mediaplayer.AudioPlayerConfigure.minAudioTrackWaitTimeMs
            java.lang.String r3 = "StreamDecodeDataComponent"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "writeShortCount: "
            r4.append(r5)
            r4.append(r9)
            java.lang.String r5 = ", playFramePosition: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ", leftTimeInMs: "
            r4.append(r2)
            r4.append(r1)
            java.lang.String r2 = ", minAudioTrackWaitTimeMs: "
            r4.append(r2)
            r4.append(r0)
            java.lang.String r2 = r4.toString()
            java.lang.String r2 = r7.axiliary(r2)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r3, r2)
            if (r1 <= 0) goto L_0x07ca
            monitor-enter(r39)
            int r0 = java.lang.Math.max(r0, r1)     // Catch:{ all -> 0x02d0 }
            long r0 = (long) r0     // Catch:{ all -> 0x02d0 }
            r7.wait(r0)     // Catch:{ all -> 0x02d0 }
            monitor-exit(r39)     // Catch:{ all -> 0x02d0 }
            goto L_0x07ca
        L_0x02d0:
            r0 = move-exception
            monitor-exit(r39)     // Catch:{ all -> 0x02d0 }
            throw r0
        L_0x02d3:
            boolean r1 = r39.isPlaying()
            if (r1 == 0) goto L_0x02e6
            android.media.AudioTrack r1 = r7.mAudioTrack
            int r1 = r1.getPlayState()
            if (r1 == r0) goto L_0x02e6
            android.media.AudioTrack r1 = r7.mAudioTrack
            r1.play()
        L_0x02e6:
            long r10 = java.lang.System.currentTimeMillis()
            if (r3 == 0) goto L_0x0448
            if (r21 == 0) goto L_0x0319
            java.lang.String r1 = "StreamDecodeDataComponent"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SoNotFindException -> 0x0435 }
            r6.<init>()     // Catch:{ SoNotFindException -> 0x0435 }
            java.lang.String r13 = "writeFail = true,  mBuffSize = "
            r6.append(r13)     // Catch:{ SoNotFindException -> 0x0435 }
            int r13 = r7.mBuffSize     // Catch:{ SoNotFindException -> 0x0435 }
            r6.append(r13)     // Catch:{ SoNotFindException -> 0x0435 }
            java.lang.String r6 = r6.toString()     // Catch:{ SoNotFindException -> 0x0435 }
            java.lang.String r6 = r7.axiliary(r6)     // Catch:{ SoNotFindException -> 0x0435 }
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r1, r6)     // Catch:{ SoNotFindException -> 0x0435 }
            java.lang.String r1 = "StreamDecodeDataComponent"
            java.lang.String r6 = "there is no need to read more pcm data, just use writeFailByteArray"
            java.lang.String r6 = r7.axiliary(r6)     // Catch:{ SoNotFindException -> 0x0435 }
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r1, r6)     // Catch:{ SoNotFindException -> 0x0435 }
            r1 = 0
            goto L_0x032b
        L_0x0319:
            com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent$HandleDecodeDataCallback r1 = r7.mHandleDecodeDataCallback     // Catch:{ SoNotFindException -> 0x0435 }
            int r6 = r7.mBuffSize     // Catch:{ SoNotFindException -> 0x0435 }
            com.tencent.qqmusic.mediaplayer.BufferInfo r13 = r7.mDecodeBufferInfo     // Catch:{ SoNotFindException -> 0x0435 }
            byte[] r13 = r13.byteBuffer     // Catch:{ SoNotFindException -> 0x0435 }
            int r1 = r1.pullDecodeData(r6, r13)     // Catch:{ SoNotFindException -> 0x0435 }
            com.tencent.qqmusic.mediaplayer.BufferInfo r6 = r7.mDecodeBufferInfo     // Catch:{ SoNotFindException -> 0x0435 }
            r6.bufferSize = r1     // Catch:{ SoNotFindException -> 0x0435 }
            long r13 = (long) r1     // Catch:{ SoNotFindException -> 0x0435 }
            long r4 = r4 + r13
        L_0x032b:
            r6 = 1
            r7.mHasDecode = r6     // Catch:{ SoNotFindException -> 0x0435 }
            if (r18 != 0) goto L_0x042f
            com.tencent.qqmusic.mediaplayer.AudioInformation r13 = r7.mInformation     // Catch:{ SoNotFindException -> 0x0435 }
            long r13 = r7.getCalcBitMinSize(r13)     // Catch:{ SoNotFindException -> 0x0435 }
            java.lang.String r6 = "StreamDecodeDataComponent"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SoNotFindException -> 0x0435 }
            r0.<init>()     // Catch:{ SoNotFindException -> 0x0435 }
            java.lang.String r12 = "minSize: "
            r0.append(r12)     // Catch:{ SoNotFindException -> 0x0435 }
            r0.append(r13)     // Catch:{ SoNotFindException -> 0x0435 }
            java.lang.String r12 = ", mDecodeBufferInfo.bufferSize: "
            r0.append(r12)     // Catch:{ SoNotFindException -> 0x0435 }
            com.tencent.qqmusic.mediaplayer.BufferInfo r12 = r7.mDecodeBufferInfo     // Catch:{ SoNotFindException -> 0x0435 }
            int r12 = r12.bufferSize     // Catch:{ SoNotFindException -> 0x0435 }
            r0.append(r12)     // Catch:{ SoNotFindException -> 0x0435 }
            java.lang.String r0 = r0.toString()     // Catch:{ SoNotFindException -> 0x0435 }
            java.lang.String r0 = r7.axiliary(r0)     // Catch:{ SoNotFindException -> 0x0435 }
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r6, r0)     // Catch:{ SoNotFindException -> 0x0435 }
            r24 = 0
            int r0 = (r13 > r24 ? 1 : (r13 == r24 ? 0 : -1))
            if (r0 <= 0) goto L_0x03ca
            r6 = 10
        L_0x0364:
            com.tencent.qqmusic.mediaplayer.BufferInfo r0 = r7.mDecodeBufferInfo     // Catch:{ SoNotFindException -> 0x0435 }
            int r12 = r0.bufferSize     // Catch:{ SoNotFindException -> 0x0435 }
            r18 = r1
            r24 = r2
            long r1 = (long) r12     // Catch:{ SoNotFindException -> 0x0435 }
            int r12 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r12 >= 0) goto L_0x03c6
            if (r6 < 0) goto L_0x03c6
            int r1 = r7.mBuffSize     // Catch:{ SoNotFindException -> 0x0435 }
            r0.setTempByteBufferCapacity(r1)     // Catch:{ SoNotFindException -> 0x0435 }
            com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent$HandleDecodeDataCallback r0 = r7.mHandleDecodeDataCallback     // Catch:{ SoNotFindException -> 0x0435 }
            int r1 = r7.mBuffSize     // Catch:{ SoNotFindException -> 0x0435 }
            com.tencent.qqmusic.mediaplayer.BufferInfo r2 = r7.mDecodeBufferInfo     // Catch:{ SoNotFindException -> 0x0435 }
            byte[] r2 = r2.tempByteBuffer     // Catch:{ SoNotFindException -> 0x0435 }
            int r1 = r0.pullDecodeData(r1, r2)     // Catch:{ SoNotFindException -> 0x0435 }
            if (r1 <= 0) goto L_0x0399
            com.tencent.qqmusic.mediaplayer.BufferInfo r0 = r7.mDecodeBufferInfo     // Catch:{ SoNotFindException -> 0x0435 }
            byte[] r2 = r0.tempByteBuffer     // Catch:{ SoNotFindException -> 0x0435 }
            r12 = 0
            r0.appendByte(r2, r12, r1)     // Catch:{ SoNotFindException -> 0x0435 }
            com.tencent.qqmusic.mediaplayer.BufferInfo r0 = r7.mDecodeBufferInfo     // Catch:{ SoNotFindException -> 0x0435 }
            int r2 = r0.bufferSize     // Catch:{ SoNotFindException -> 0x0435 }
            int r2 = r2 + r1
            r0.bufferSize = r2     // Catch:{ SoNotFindException -> 0x0435 }
            r0 = r3
            long r2 = (long) r1     // Catch:{ SoNotFindException -> 0x0435 }
            long r4 = r4 + r2
            goto L_0x039a
        L_0x0399:
            r0 = r3
        L_0x039a:
            int r6 = r6 + -1
            java.lang.String r2 = "StreamDecodeDataComponent"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SoNotFindException -> 0x0435 }
            r3.<init>()     // Catch:{ SoNotFindException -> 0x0435 }
            java.lang.String r12 = "decode tmpSize: "
            r3.append(r12)     // Catch:{ SoNotFindException -> 0x0435 }
            r3.append(r1)     // Catch:{ SoNotFindException -> 0x0435 }
            java.lang.String r12 = ", mDecodeBufferInfo.bufferSize: "
            r3.append(r12)     // Catch:{ SoNotFindException -> 0x0435 }
            com.tencent.qqmusic.mediaplayer.BufferInfo r12 = r7.mDecodeBufferInfo     // Catch:{ SoNotFindException -> 0x0435 }
            int r12 = r12.bufferSize     // Catch:{ SoNotFindException -> 0x0435 }
            r3.append(r12)     // Catch:{ SoNotFindException -> 0x0435 }
            java.lang.String r3 = r3.toString()     // Catch:{ SoNotFindException -> 0x0435 }
            java.lang.String r3 = r7.axiliary(r3)     // Catch:{ SoNotFindException -> 0x0435 }
            com.tencent.qqmusic.mediaplayer.util.Logger.m21786d(r2, r3)     // Catch:{ SoNotFindException -> 0x0435 }
            r3 = r0
            r2 = r24
            goto L_0x0364
        L_0x03c6:
            r0 = r3
            r1 = r18
            goto L_0x03cd
        L_0x03ca:
            r24 = r2
            r0 = r3
        L_0x03cd:
            com.tencent.qqmusic.mediaplayer.AudioInformation r2 = r7.mInformation     // Catch:{ SoNotFindException -> 0x0435 }
            int r2 = r2.getBitDepth()     // Catch:{ SoNotFindException -> 0x0435 }
            if (r2 != 0) goto L_0x0410
            com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent$HandleDecodeDataCallback r2 = r7.mHandleDecodeDataCallback     // Catch:{ SoNotFindException -> 0x0435 }
            long r34 = r2.getCurPositionByDecoder()     // Catch:{ SoNotFindException -> 0x0435 }
            com.tencent.qqmusic.mediaplayer.AudioInformation r2 = r7.mInformation     // Catch:{ SoNotFindException -> 0x0435 }
            int r36 = r2.getChannels()     // Catch:{ SoNotFindException -> 0x0435 }
            com.tencent.qqmusic.mediaplayer.AudioInformation r2 = r7.mInformation     // Catch:{ SoNotFindException -> 0x0435 }
            long r37 = r2.getSampleRate()     // Catch:{ SoNotFindException -> 0x0435 }
            r32 = r4
            int r2 = com.tencent.qqmusic.mediaplayer.AudioRecognition.calcBitDept(r32, r34, r36, r37)     // Catch:{ SoNotFindException -> 0x0435 }
            r7.mTargetBitDepth = r2     // Catch:{ SoNotFindException -> 0x0435 }
            com.tencent.qqmusic.mediaplayer.AudioInformation r3 = r7.mInformation     // Catch:{ SoNotFindException -> 0x0435 }
            r3.setBitDept(r2)     // Catch:{ SoNotFindException -> 0x0435 }
            java.lang.String r2 = "StreamDecodeDataComponent"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SoNotFindException -> 0x0435 }
            r3.<init>()     // Catch:{ SoNotFindException -> 0x0435 }
            java.lang.String r6 = "create audiotrack with wrong bitDepth, there may cause some problem!! "
            r3.append(r6)     // Catch:{ SoNotFindException -> 0x0435 }
            int r6 = r7.mTargetBitDepth     // Catch:{ SoNotFindException -> 0x0435 }
            r3.append(r6)     // Catch:{ SoNotFindException -> 0x0435 }
            java.lang.String r3 = r3.toString()     // Catch:{ SoNotFindException -> 0x0435 }
            java.lang.String r3 = r7.axiliary(r3)     // Catch:{ SoNotFindException -> 0x0435 }
            com.tencent.qqmusic.mediaplayer.util.Logger.m21793w(r2, r3)     // Catch:{ SoNotFindException -> 0x0435 }
        L_0x0410:
            int r2 = r7.mTargetBitDepth     // Catch:{ SoNotFindException -> 0x0435 }
            java.lang.String r3 = "StreamDecodeDataComponent"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SoNotFindException -> 0x0435 }
            r6.<init>()     // Catch:{ SoNotFindException -> 0x0435 }
            java.lang.String r12 = "mPlayBitDept: "
            r6.append(r12)     // Catch:{ SoNotFindException -> 0x0435 }
            r6.append(r2)     // Catch:{ SoNotFindException -> 0x0435 }
            java.lang.String r6 = r6.toString()     // Catch:{ SoNotFindException -> 0x0435 }
            java.lang.String r6 = r7.axiliary(r6)     // Catch:{ SoNotFindException -> 0x0435 }
            com.tencent.qqmusic.mediaplayer.util.Logger.m21786d(r3, r6)     // Catch:{ SoNotFindException -> 0x0435 }
            r18 = r2
            goto L_0x0432
        L_0x042f:
            r24 = r2
            r0 = r3
        L_0x0432:
            r14 = r1
            r12 = r4
            goto L_0x044d
        L_0x0435:
            r0 = move-exception
            java.lang.String r1 = "StreamDecodeDataComponent"
            com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r1, (java.lang.Throwable) r0)
            com.tencent.qqmusic.mediaplayer.PlayerStateRunner r0 = r7.mStateRunner
            r0.transfer(r8)
            r0 = 62
            r1 = 92
            r7.callExceptionCallback(r1, r0)
            return
        L_0x0448:
            r24 = r2
            r0 = r3
            r12 = r4
            r14 = r6
        L_0x044d:
            boolean r1 = r7.mNeedChangePlayThreadPriority
            if (r1 == 0) goto L_0x045b
            r1 = 0
            r7.mNeedChangePlayThreadPriority = r1
            com.tencent.qqmusic.mediaplayer.PlayerConfigManager r1 = com.tencent.qqmusic.mediaplayer.PlayerConfigManager.getInstance()
            r1.changeDecodeThreadPriorityIfNeed()
        L_0x045b:
            com.tencent.qqmusic.mediaplayer.BufferInfo r1 = r7.mDecodeBufferInfo
            int r1 = r1.bufferSize
            if (r1 <= 0) goto L_0x07ab
            boolean r1 = r7.mHasDecodeSuccess
            if (r1 != 0) goto L_0x0470
            com.tencent.qqmusic.mediaplayer.PlayerCallback r1 = r7.mCallback
            com.tencent.qqmusic.mediaplayer.CorePlayer r2 = r7.mCorePlayer
            r1.playerStarted(r2)
            r5 = 1
            r7.mHasDecodeSuccess = r5
            goto L_0x0471
        L_0x0470:
            r5 = 1
        L_0x0471:
            if (r21 != 0) goto L_0x0515
            int r1 = r7.mTargetBitDepth
            com.tencent.qqmusic.mediaplayer.AudioInformation r2 = r7.mInformation
            int r2 = r2.getBitDepth()
            if (r1 == r2) goto L_0x0494
            boolean r1 = r7.isUseFloatForHighDepth
            if (r1 != 0) goto L_0x0494
            int r1 = r7.mBuffSize
            r2 = r16
            com.tencent.qqmusic.mediaplayer.BufferInfo r1 = r7.initTempBufferInfoIfNeeded(r2, r1)
            com.tencent.qqmusic.mediaplayer.BufferInfo r2 = r7.mDecodeBufferInfo
            r7.handleHighBitDepth(r2, r1)
            com.tencent.qqmusic.mediaplayer.BufferInfo r2 = r7.mDecodeBufferInfo
            r1.fillInto(r2)
            goto L_0x0497
        L_0x0494:
            r2 = r16
            r1 = r2
        L_0x0497:
            long r2 = r7.mTargetPlaySample
            com.tencent.qqmusic.mediaplayer.AudioInformation r4 = r7.mInformation
            long r32 = r4.getSampleRate()
            int r4 = (r2 > r32 ? 1 : (r2 == r32 ? 0 : -1))
            if (r4 == 0) goto L_0x04b3
            int r2 = r7.mBuffSize
            com.tencent.qqmusic.mediaplayer.BufferInfo r1 = r7.initTempBufferInfoIfNeeded(r1, r2)
            com.tencent.qqmusic.mediaplayer.BufferInfo r2 = r7.mDecodeBufferInfo
            r7.handleHighSample(r2, r1)
            com.tencent.qqmusic.mediaplayer.BufferInfo r2 = r7.mDecodeBufferInfo
            r1.fillInto(r2)
        L_0x04b3:
            boolean r2 = r7.isUseFloatForHighDepth
            if (r2 == 0) goto L_0x04ee
            com.tencent.qqmusic.mediaplayer.BufferInfo r2 = r7.mDecodeBufferInfo
            com.tencent.qqmusic.mediaplayer.FloatBufferInfo r3 = r7.mFloatBufferInfo
            r7.convertBytePcmToFloatPcm(r2, r3)
            com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener r2 = r7.mAudioEffectListener
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L_0x04eb
            com.tencent.qqmusic.mediaplayer.FloatBufferInfo r2 = r7.mFloatBufferInfo
            int r2 = r2.bufferSize
            r3 = r17
            com.tencent.qqmusic.mediaplayer.FloatBufferInfo r2 = r7.initTempFloatBufferInfoIfNeeded(r3, r2)
            com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener r3 = r7.mAudioEffectListener
            com.tencent.qqmusic.mediaplayer.FloatBufferInfo r4 = r7.mFloatBufferInfo
            com.tencent.qqmusic.mediaplayer.CorePlayer r6 = r7.mCorePlayer
            long r5 = r6.getCurPositionByDecoder()
            r3.onPcm((com.tencent.qqmusic.mediaplayer.FloatBufferInfo) r4, (com.tencent.qqmusic.mediaplayer.FloatBufferInfo) r2, (long) r5)
            com.tencent.qqmusic.mediaplayer.FloatBufferInfo r3 = r7.mFloatBufferInfo
            float[] r4 = r2.floatBuffer
            int r5 = r2.bufferSize
            r3.fillFloat(r4, r5)
            r16 = r1
            r17 = r2
            goto L_0x0519
        L_0x04eb:
            r3 = r17
            goto L_0x0510
        L_0x04ee:
            r3 = r17
            com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener r2 = r7.mAudioEffectListener
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L_0x0510
            int r2 = r7.mBuffSize
            com.tencent.qqmusic.mediaplayer.BufferInfo r1 = r7.initTempBufferInfoIfNeeded(r1, r2)
            com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener r2 = r7.mAudioEffectListener
            com.tencent.qqmusic.mediaplayer.BufferInfo r4 = r7.mDecodeBufferInfo
            com.tencent.qqmusic.mediaplayer.CorePlayer r5 = r7.mCorePlayer
            long r5 = r5.getCurPositionByDecoder()
            r2.onPcm((com.tencent.qqmusic.mediaplayer.BufferInfo) r4, (com.tencent.qqmusic.mediaplayer.BufferInfo) r1, (long) r5)
            com.tencent.qqmusic.mediaplayer.BufferInfo r2 = r7.mDecodeBufferInfo
            r1.fillInto(r2)
        L_0x0510:
            r16 = r1
            r17 = r3
            goto L_0x0519
        L_0x0515:
            r2 = r16
            r3 = r17
        L_0x0519:
            android.media.AudioTrack r1 = r7.mAudioTrack
            if (r1 == 0) goto L_0x079b
            boolean r1 = r39.isPlaying()
            if (r1 == 0) goto L_0x079b
            if (r21 != 0) goto L_0x054e
            com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener r1 = r7.mTerminalAudioEffectListener
            boolean r1 = r1.isEnabled()
            if (r1 == 0) goto L_0x054e
            boolean r1 = r7.isUseFloatForHighDepth
            if (r1 == 0) goto L_0x053f
            com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener r1 = r7.mTerminalAudioEffectListener
            com.tencent.qqmusic.mediaplayer.FloatBufferInfo r2 = r7.mFloatBufferInfo
            com.tencent.qqmusic.mediaplayer.CorePlayer r3 = r7.mCorePlayer
            long r3 = r3.getCurPositionByDecoder()
            r1.onPcm((com.tencent.qqmusic.mediaplayer.FloatBufferInfo) r2, (com.tencent.qqmusic.mediaplayer.FloatBufferInfo) r2, (long) r3)
            goto L_0x054c
        L_0x053f:
            com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener r1 = r7.mTerminalAudioEffectListener
            com.tencent.qqmusic.mediaplayer.BufferInfo r2 = r7.mDecodeBufferInfo
            com.tencent.qqmusic.mediaplayer.CorePlayer r3 = r7.mCorePlayer
            long r3 = r3.getCurPositionByDecoder()
            r1.onPcm((com.tencent.qqmusic.mediaplayer.BufferInfo) r2, (com.tencent.qqmusic.mediaplayer.BufferInfo) r2, (long) r3)
        L_0x054c:
            r1 = 1
            goto L_0x054f
        L_0x054e:
            r1 = 0
        L_0x054f:
            if (r1 != 0) goto L_0x0789
            long r0 = java.lang.System.currentTimeMillis()
            long r10 = r0 - r10
            boolean r0 = r7.needSetVolume
            if (r0 == 0) goto L_0x0567
            android.media.AudioTrack r0 = r7.mAudioTrack
            float r1 = r7.leftVolume
            float r2 = r7.rightVolume
            r0.setStereoVolume(r1, r2)
            r0 = 0
            r7.needSetVolume = r0
        L_0x0567:
            boolean r0 = r7.isUseFloatForHighDepth
            r4 = 102(0x66, float:1.43E-43)
            if (r0 == 0) goto L_0x0654
            com.tencent.qqmusic.mediaplayer.FloatBufferInfo r0 = r7.mFloatBufferInfo
            float[] r0 = r0.floatBuffer
            com.tencent.qqmusic.mediaplayer.AudioInformation r1 = r7.mInformation
            int r1 = r1.getChannels()
            long r2 = r7.mTargetPlaySample
            long r0 = r7.calculatePcmPlayTime(r0, r1, r2)
            android.media.AudioTrack r2 = r7.mAudioTrack
            com.tencent.qqmusic.mediaplayer.FloatBufferInfo r3 = r7.mFloatBufferInfo
            float[] r5 = r3.floatBuffer
            int r3 = r3.bufferSize
            r6 = 0
            int r2 = r2.write(r5, r6, r3, r6)
            if (r2 >= 0) goto L_0x05de
            android.media.AudioTrack r3 = r7.mAudioTrack
            int r3 = r3.getPlayState()
            r5 = 3
            if (r3 != r5) goto L_0x05c6
            java.lang.String r0 = "StreamDecodeDataComponent"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "mAudioTrack write float failed: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = ", expect: "
            r1.append(r2)
            com.tencent.qqmusic.mediaplayer.FloatBufferInfo r2 = r7.mFloatBufferInfo
            int r2 = r2.bufferSize
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r7.axiliary(r1)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21787e((java.lang.String) r0, (java.lang.String) r1)
            com.tencent.qqmusic.mediaplayer.PlayerStateRunner r0 = r7.mStateRunner
            r0.transfer(r8)
            r1 = 92
            r7.callExceptionCallback(r1, r4)
            return
        L_0x05c6:
            java.lang.String r2 = "StreamDecodeDataComponent"
            java.lang.String r3 = "write data to audiotrack failed, but it's OK"
            java.lang.String r3 = r7.axiliary(r3)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r2, r3)
            r24 = r0
            r0 = r21
            r3 = 0
            r6 = 0
            r30 = 1
            r31 = 2
            goto L_0x073b
        L_0x05de:
            com.tencent.qqmusic.mediaplayer.FloatBufferInfo r3 = r7.mFloatBufferInfo
            int r3 = r3.bufferSize
            if (r2 == r3) goto L_0x0639
            java.lang.String r3 = "StreamDecodeDataComponent"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "mAudioTrack write float not equal: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = ", expect: "
            r4.append(r5)
            com.tencent.qqmusic.mediaplayer.FloatBufferInfo r5 = r7.mFloatBufferInfo
            int r5 = r5.bufferSize
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r7.axiliary(r4)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21793w(r3, r4)
            if (r2 != 0) goto L_0x062b
            int r3 = r15 + 1
            r5 = 5
            if (r3 < r5) goto L_0x0629
            java.lang.String r0 = "StreamDecodeDataComponent"
            java.lang.String r1 = "continuous write zero"
            java.lang.String r1 = r7.axiliary(r1)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21793w(r0, r1)
            com.tencent.qqmusic.mediaplayer.PlayerStateRunner r0 = r7.mStateRunner
            r0.transfer(r8)
            r0 = 105(0x69, float:1.47E-43)
            r1 = 92
            r7.callExceptionCallback(r1, r0)
            return
        L_0x0629:
            r6 = 1
            goto L_0x063b
        L_0x062b:
            android.media.AudioTrack r3 = r7.mAudioTrack
            r3.flush()
            com.tencent.qqmusic.mediaplayer.PlayStuckMonitor r3 = com.tencent.qqmusic.mediaplayer.PlayStuckMonitor.INSTANCE
            com.tencent.qqmusic.mediaplayer.FloatBufferInfo r4 = r7.mFloatBufferInfo
            int r4 = r4.bufferSize
            r3.onAudioTrackFlush(r2, r4)
        L_0x0639:
            r3 = 0
            r6 = 0
        L_0x063b:
            if (r2 <= 0) goto L_0x0646
            com.tencent.qqmusic.mediaplayer.FloatBufferInfo r2 = r7.mFloatBufferInfo
            int r2 = r2.bufferSize
            r31 = 2
            int r2 = r2 * 2
            goto L_0x0649
        L_0x0646:
            r31 = 2
            r2 = 0
        L_0x0649:
            int r9 = r9 + r2
            r24 = r0
            r15 = r3
            r0 = r6
            r3 = 1
            r6 = 0
            r30 = 1
            goto L_0x073b
        L_0x0654:
            r0 = 105(0x69, float:1.47E-43)
            r5 = 5
            r31 = 2
            com.tencent.qqmusic.mediaplayer.BufferInfo r1 = r7.mDecodeBufferInfo
            byte[] r2 = r1.byteBuffer
            com.tencent.qqmusic.mediaplayer.AudioInformation r1 = r7.mInformation
            int r3 = r1.getChannels()
            int r6 = r7.mTargetBitDepth
            r24 = r6
            long r5 = r7.mTargetPlaySample
            r1 = r39
            r0 = 102(0x66, float:1.43E-43)
            r4 = r24
            r30 = 1
            long r1 = r1.calculatePcmPlayTime(r2, r3, r4, r5)
            android.media.AudioTrack r3 = r7.mAudioTrack
            com.tencent.qqmusic.mediaplayer.BufferInfo r4 = r7.mDecodeBufferInfo
            byte[] r5 = r4.byteBuffer
            int r4 = r4.bufferSize
            r6 = 0
            int r3 = r3.write(r5, r6, r4)
            if (r3 >= 0) goto L_0x06d0
            android.media.AudioTrack r4 = r7.mAudioTrack
            int r4 = r4.getPlayState()
            r5 = 3
            if (r4 != r5) goto L_0x06be
            java.lang.String r1 = "StreamDecodeDataComponent"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "mAudioTrack write bytes failed: "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = ", expect: "
            r2.append(r3)
            com.tencent.qqmusic.mediaplayer.BufferInfo r3 = r7.mDecodeBufferInfo
            int r3 = r3.bufferSize
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r7.axiliary(r2)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21787e((java.lang.String) r1, (java.lang.String) r2)
            com.tencent.qqmusic.mediaplayer.PlayerStateRunner r1 = r7.mStateRunner
            r1.transfer(r8)
            r1 = 92
            r7.callExceptionCallback(r1, r0)
            return
        L_0x06be:
            java.lang.String r0 = "StreamDecodeDataComponent"
            java.lang.String r3 = "write data to audiotrack failed, but it's OK"
            java.lang.String r3 = r7.axiliary(r3)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r0, r3)
            r24 = r1
            r0 = r21
            r3 = 0
            goto L_0x073b
        L_0x06d0:
            com.tencent.qqmusic.mediaplayer.BufferInfo r0 = r7.mDecodeBufferInfo
            int r0 = r0.bufferSize
            if (r3 == r0) goto L_0x072c
            java.lang.String r0 = "StreamDecodeDataComponent"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "mAudioTrack write bytes not equal: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = ", expect: "
            r4.append(r5)
            com.tencent.qqmusic.mediaplayer.BufferInfo r5 = r7.mDecodeBufferInfo
            int r5 = r5.bufferSize
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r7.axiliary(r4)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21793w(r0, r4)
            if (r3 != 0) goto L_0x071e
            int r0 = r15 + 1
            r4 = 5
            if (r0 < r4) goto L_0x071b
            java.lang.String r0 = "StreamDecodeDataComponent"
            java.lang.String r1 = "float, continuous write zero"
            java.lang.String r1 = r7.axiliary(r1)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21793w(r0, r1)
            com.tencent.qqmusic.mediaplayer.PlayerStateRunner r0 = r7.mStateRunner
            r0.transfer(r8)
            r0 = 105(0x69, float:1.47E-43)
            r1 = 92
            r7.callExceptionCallback(r1, r0)
            return
        L_0x071b:
            r4 = r0
            r0 = 1
            goto L_0x072e
        L_0x071e:
            android.media.AudioTrack r0 = r7.mAudioTrack
            r0.flush()
            com.tencent.qqmusic.mediaplayer.PlayStuckMonitor r0 = com.tencent.qqmusic.mediaplayer.PlayStuckMonitor.INSTANCE
            com.tencent.qqmusic.mediaplayer.BufferInfo r4 = r7.mDecodeBufferInfo
            int r4 = r4.bufferSize
            r0.onAudioTrackFlush(r3, r4)
        L_0x072c:
            r0 = 0
            r4 = 0
        L_0x072e:
            if (r3 <= 0) goto L_0x0735
            com.tencent.qqmusic.mediaplayer.BufferInfo r3 = r7.mDecodeBufferInfo
            int r3 = r3.bufferSize
            goto L_0x0736
        L_0x0735:
            r3 = 0
        L_0x0736:
            int r9 = r9 + r3
            r24 = r1
            r15 = r4
            r3 = 1
        L_0x073b:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r1 < r2) goto L_0x0760
            android.media.AudioTrack r1 = r7.mAudioTrack
            int r1 = r1.getUnderrunCount()
            r4 = r19
            if (r1 <= 0) goto L_0x075a
            if (r1 <= r4) goto L_0x075a
            int r27 = r1 - r4
            com.tencent.qqmusic.mediaplayer.PlayStuckMonitor r21 = com.tencent.qqmusic.mediaplayer.PlayStuckMonitor.INSTANCE
            r22 = r10
            r21.onPlayStuck(r22, r24, r26, r27)
            r19 = r1
            r1 = 1
            goto L_0x075d
        L_0x075a:
            r19 = r4
            r1 = 0
        L_0x075d:
            r28 = 0
            goto L_0x077e
        L_0x0760:
            r4 = r19
            r28 = 0
            int r1 = (r24 > r28 ? 1 : (r24 == r28 ? 0 : -1))
            if (r1 <= 0) goto L_0x077b
            int r1 = (r10 > r24 ? 1 : (r10 == r24 ? 0 : -1))
            if (r1 <= 0) goto L_0x077b
            if (r20 != 0) goto L_0x077b
            com.tencent.qqmusic.mediaplayer.PlayStuckMonitor r21 = com.tencent.qqmusic.mediaplayer.PlayStuckMonitor.INSTANCE
            r27 = 0
            r22 = r10
            r21.onPlayStuck(r22, r24, r26, r27)
            r19 = r4
            r1 = 1
            goto L_0x077e
        L_0x077b:
            r19 = r4
            r1 = 0
        L_0x077e:
            android.media.AudioTrack r2 = r7.mAudioTrack
            int r2 = com.tencent.qqmusic.mediaplayer.utils.AudioUtil.getPlaybackHeadPositionSafely(r2)
            r26 = r1
            r20 = 0
            goto L_0x0797
        L_0x0789:
            r4 = r19
            r6 = 0
            r28 = 0
            r30 = 1
            r31 = 2
            r3 = r0
            r0 = r21
            r2 = r24
        L_0x0797:
            r21 = r0
            r1 = r9
            goto L_0x07c3
        L_0x079b:
            r4 = r19
            r6 = 0
            r28 = 0
            r30 = 1
            r31 = 2
            r3 = r0
            r19 = r4
            r1 = r9
            r2 = r24
            goto L_0x07c3
        L_0x07ab:
            r2 = r16
            r3 = r17
            r4 = r19
            r6 = 0
            r28 = 0
            r30 = 1
            r31 = 2
            com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent$HandleDecodeDataCallback r1 = r7.mHandleDecodeDataCallback
            r5 = 92
            r1.onPullDecodeDataEndOrFailed(r14, r5)
            r1 = r9
            r2 = r24
            r3 = r0
        L_0x07c3:
            r4 = r12
            r6 = r14
            goto L_0x023e
        L_0x07c7:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x07c7 }
            throw r0
        L_0x07ca:
            return
        L_0x07cb:
            com.tencent.qqmusic.mediaplayer.CorePlayer r0 = r7.mCorePlayer
            boolean r0 = r0.mIsExit
            if (r0 != 0) goto L_0x07e5
            java.lang.String r0 = "StreamDecodeDataComponent"
            java.lang.String r3 = "不留痕迹的退出 时机：获取Information时 step = 3"
            java.lang.String r3 = r7.axiliary(r3)
            com.tencent.qqmusic.mediaplayer.util.Logger.m21787e((java.lang.String) r0, (java.lang.String) r3)
            com.tencent.qqmusic.mediaplayer.PlayerStateRunner r0 = r7.mStateRunner
            r0.transfer(r8)
            r7.callExceptionCallback(r2, r1)
        L_0x07e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.StreamDecodeDataComponent.handleDecodeData():void");
    }

    public void pause(boolean z) {
        AudioTrack audioTrack;
        super.pause(z);
        if (z && (audioTrack = this.mAudioTrack) != null) {
            try {
                if (audioTrack.getState() == 1 && audioTrack.getPlayState() != 2) {
                    audioTrack.pause();
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public void release() {
        super.release();
        this.mCurrentFrameCount = 0;
    }

    public void seek(int i) {
        addSeekRecord(i);
        refreshTimeAndNotify(i);
    }

    public void setAudioStreamType(int i) {
        if (i != this.mAudioStreamType) {
            try {
                this.mAudioStreamType = i;
                AudioTrack audioTrack = this.mAudioTrack;
                if (audioTrack != null) {
                    AudioTrack instantiateAudioTrackCompat = BaseDecodeDataComponent.instantiateAudioTrackCompat(i, audioTrack.getSampleRate(), this.mAudioTrack.getChannelConfiguration(), this.mAudioTrack.getAudioFormat(), this.mTrackBufferSizeInByte, 1);
                    Logger.m21791i(TAG, axiliary("[setAudioStreamType] new AudioTrack, sampleRate: " + this.mAudioTrack.getSampleRate() + ", channels: " + this.mAudioTrack.getChannelConfiguration() + ", bitDepth: " + this.mAudioTrack.getAudioFormat() + ", buffer: " + this.mTrackBufferSizeInByte));
                    int playState = this.mAudioTrack.getPlayState();
                    if (playState == 3) {
                        pause(false);
                    }
                    this.mAudioTrack.release();
                    setAudioTrack(instantiateAudioTrackCompat);
                    this.mStateRunner.setAudioTrack(this.mAudioTrack);
                    if (playState == 3) {
                        play();
                    }
                }
            } catch (IllegalArgumentException | IllegalStateException e) {
                Logger.m21788e(TAG, "failed in setting audio stream type to :" + i, e);
            }
        }
    }
}
