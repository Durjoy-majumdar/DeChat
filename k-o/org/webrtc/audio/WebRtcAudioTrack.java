package org.webrtc.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import java.nio.ByteBuffer;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.audio.JavaAudioDeviceModule;

class WebRtcAudioTrack {
    private static final int AUDIO_TRACK_START = 0;
    private static final int AUDIO_TRACK_STOP = 1;
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int DEFAULT_USAGE = getDefaultUsageAttribute();
    private static final String TAG = "WebRtcAudioTrackExternal";
    private final AudioAttributes audioAttributes;
    private final AudioManager audioManager;
    private AudioTrackThread audioThread;
    /* access modifiers changed from: private */
    public AudioTrack audioTrack;
    /* access modifiers changed from: private */
    public ByteBuffer byteBuffer;
    private final Context context;
    /* access modifiers changed from: private */
    public byte[] emptyBytes;
    private final JavaAudioDeviceModule.AudioTrackErrorCallback errorCallback;
    private int initialBufferSizeInFrames;
    /* access modifiers changed from: private */
    public long nativeAudioTrack;
    /* access modifiers changed from: private */
    public volatile boolean speakerMute;
    private final JavaAudioDeviceModule.AudioTrackStateCallback stateCallback;
    private final ThreadUtils.ThreadChecker threadChecker;
    /* access modifiers changed from: private */
    public boolean useLowLatency;
    private final VolumeLogger volumeLogger;

    public class AudioTrackThread extends Thread {
        private LowLatencyAudioBufferManager bufferManager = new LowLatencyAudioBufferManager();
        private volatile boolean keepAlive = true;

        public AudioTrackThread(String str) {
            super(str);
        }

        private int writeBytes(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
            return audioTrack.write(byteBuffer, i, 0);
        }

        public void run() {
            Process.setThreadPriority(-19);
            Logging.m25022d(WebRtcAudioTrack.TAG, "AudioTrackThread" + WebRtcAudioUtils.getThreadInfo());
            WebRtcAudioTrack.assertTrue(WebRtcAudioTrack.this.audioTrack.getPlayState() == 3);
            WebRtcAudioTrack.this.doAudioTrackStateCallback(0);
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                WebRtcAudioTrack.nativeGetPlayoutData(WebRtcAudioTrack.this.nativeAudioTrack, capacity);
                WebRtcAudioTrack.assertTrue(capacity <= WebRtcAudioTrack.this.byteBuffer.remaining());
                if (WebRtcAudioTrack.this.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                    WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                int writeBytes = writeBytes(WebRtcAudioTrack.this.audioTrack, WebRtcAudioTrack.this.byteBuffer, capacity);
                if (writeBytes != capacity) {
                    Logging.m25023e(WebRtcAudioTrack.TAG, "AudioTrack.write played invalid number of bytes: " + writeBytes);
                    if (writeBytes < 0) {
                        this.keepAlive = false;
                        WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                        webRtcAudioTrack.reportWebRtcAudioTrackError("AudioTrack.write failed: " + writeBytes);
                    }
                }
                if (WebRtcAudioTrack.this.useLowLatency) {
                    this.bufferManager.maybeAdjustBufferSize(WebRtcAudioTrack.this.audioTrack);
                }
                WebRtcAudioTrack.this.byteBuffer.rewind();
            }
        }

        public void stopThread() {
            Logging.m25022d(WebRtcAudioTrack.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    public WebRtcAudioTrack(Context context2, AudioManager audioManager2) {
        this(context2, audioManager2, (AudioAttributes) null, (JavaAudioDeviceModule.AudioTrackErrorCallback) null, (JavaAudioDeviceModule.AudioTrackStateCallback) null, false);
    }

    private int GetPlayoutUnderrunCount() {
        if (Build.VERSION.SDK_INT < 24) {
            return -2;
        }
        AudioTrack audioTrack2 = this.audioTrack;
        if (audioTrack2 != null) {
            return audioTrack2.getUnderrunCount();
        }
        return -1;
    }

    private static AudioAttributes.Builder applyAttributesOnQOrHigher(AudioAttributes.Builder builder, AudioAttributes audioAttributes2) {
        return builder.setAllowedCapturePolicy(audioAttributes2.getAllowedCapturePolicy());
    }

    /* access modifiers changed from: private */
    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 4 : 12;
    }

    private static AudioTrack createAudioTrackOnLollipopOrHigher(int i, int i2, int i3, AudioAttributes audioAttributes2) {
        Logging.m25022d(TAG, "createAudioTrackOnLollipopOrHigher");
        logNativeOutputSampleRate(i);
        return new AudioTrack(getAudioAttributes(audioAttributes2), new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build(), i3, 1, 0);
    }

    private static AudioTrack createAudioTrackOnLowerThanLollipop(int i, int i2, int i3) {
        return new AudioTrack(0, i, i2, 2, i3, 1);
    }

    private static AudioTrack createAudioTrackOnOreoOrHigher(int i, int i2, int i3, AudioAttributes audioAttributes2) {
        Logging.m25022d(TAG, "createAudioTrackOnOreoOrHigher");
        logNativeOutputSampleRate(i);
        return new AudioTrack.Builder().setAudioAttributes(getAudioAttributes(audioAttributes2)).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build()).setBufferSizeInBytes(i3).setPerformanceMode(1).setTransferMode(1).setSessionId(0).build();
    }

    /* access modifiers changed from: private */
    public void doAudioTrackStateCallback(int i) {
        Logging.m25022d(TAG, "doAudioTrackStateCallback: " + i);
        JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback = this.stateCallback;
        if (audioTrackStateCallback == null) {
            return;
        }
        if (i == 0) {
            audioTrackStateCallback.onWebRtcAudioTrackStart();
        } else if (i == 1) {
            audioTrackStateCallback.onWebRtcAudioTrackStop();
        } else {
            Logging.m25023e(TAG, "Invalid audio state");
        }
    }

    private static AudioAttributes getAudioAttributes(AudioAttributes audioAttributes2) {
        AudioAttributes.Builder contentType = new AudioAttributes.Builder().setUsage(DEFAULT_USAGE).setContentType(1);
        if (audioAttributes2 != null) {
            if (audioAttributes2.getUsage() != 0) {
                contentType.setUsage(audioAttributes2.getUsage());
            }
            if (audioAttributes2.getContentType() != 0) {
                contentType.setContentType(audioAttributes2.getContentType());
            }
            contentType.setFlags(audioAttributes2.getFlags());
            if (Build.VERSION.SDK_INT >= 29) {
                contentType = applyAttributesOnQOrHigher(contentType, audioAttributes2);
            }
        }
        return contentType.build();
    }

    private int getBufferSizeInFrames() {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.audioTrack.getBufferSizeInFrames();
        }
        return -1;
    }

    private static int getDefaultUsageAttribute() {
        return 2;
    }

    private int getInitialBufferSizeInFrames() {
        return this.initialBufferSizeInFrames;
    }

    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.m25022d(TAG, "getStreamMaxVolume");
        return this.audioManager.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.m25022d(TAG, "getStreamVolume");
        return this.audioManager.getStreamVolume(0);
    }

    private int initPlayout(int i, int i2, double d) {
        this.threadChecker.checkIsOnValidThread();
        Logging.m25022d(TAG, "initPlayout(sampleRate=" + i + ", channels=" + i2 + ", bufferSizeFactor=" + d + ")");
        this.byteBuffer = ByteBuffer.allocateDirect(i2 * 2 * (i / 100));
        StringBuilder sb = new StringBuilder();
        sb.append("byteBuffer.capacity: ");
        sb.append(this.byteBuffer.capacity());
        Logging.m25022d(TAG, sb.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioTrack, this.byteBuffer);
        int channelCountToConfiguration = channelCountToConfiguration(i2);
        int minBufferSize = (int) (((double) AudioTrack.getMinBufferSize(i, channelCountToConfiguration, 2)) * d);
        Logging.m25022d(TAG, "minBufferSizeInBytes: " + minBufferSize);
        if (minBufferSize < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return -1;
        }
        if (d > 1.0d) {
            this.useLowLatency = false;
        }
        if (this.audioTrack != null) {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            return -1;
        }
        try {
            if (!this.useLowLatency || Build.VERSION.SDK_INT < 26) {
                this.audioTrack = createAudioTrackOnLollipopOrHigher(i, channelCountToConfiguration, minBufferSize, this.audioAttributes);
            } else {
                this.audioTrack = createAudioTrackOnOreoOrHigher(i, channelCountToConfiguration, minBufferSize, this.audioAttributes);
            }
            AudioTrack audioTrack2 = this.audioTrack;
            if (audioTrack2 == null || audioTrack2.getState() != 1) {
                reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                releaseAudioResources();
                return -1;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                this.initialBufferSizeInFrames = this.audioTrack.getBufferSizeInFrames();
            } else {
                this.initialBufferSizeInFrames = -1;
            }
            logMainParameters();
            logMainParametersExtended();
            return minBufferSize;
        } catch (IllegalArgumentException e) {
            reportWebRtcAudioTrackInitError(e.getMessage());
            releaseAudioResources();
            return -1;
        }
    }

    private boolean isVolumeFixed() {
        return this.audioManager.isVolumeFixed();
    }

    private void logBufferCapacityInFrames() {
        if (Build.VERSION.SDK_INT >= 24) {
            Logging.m25022d(TAG, "AudioTrack: buffer capacity in frames: " + this.audioTrack.getBufferCapacityInFrames());
        }
    }

    private void logBufferSizeInFrames() {
        if (Build.VERSION.SDK_INT >= 23) {
            Logging.m25022d(TAG, "AudioTrack: buffer size in frames: " + this.audioTrack.getBufferSizeInFrames());
        }
    }

    private void logMainParameters() {
        Logging.m25022d(TAG, "AudioTrack: session ID: " + this.audioTrack.getAudioSessionId() + ", channels: " + this.audioTrack.getChannelCount() + ", sample rate: " + this.audioTrack.getSampleRate() + ", max gain: " + AudioTrack.getMaxVolume());
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    private static void logNativeOutputSampleRate(int i) {
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        Logging.m25022d(TAG, "nativeOutputSampleRate: " + nativeOutputSampleRate);
        if (i != nativeOutputSampleRate) {
            Logging.m25026w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
    }

    private void logUnderrunCount() {
        if (Build.VERSION.SDK_INT >= 24) {
            Logging.m25022d(TAG, "underrun count: " + this.audioTrack.getUnderrunCount());
        }
    }

    private static native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer2);

    /* access modifiers changed from: private */
    public static native void nativeGetPlayoutData(long j, int i);

    private void releaseAudioResources() {
        Logging.m25022d(TAG, "releaseAudioResources");
        AudioTrack audioTrack2 = this.audioTrack;
        if (audioTrack2 != null) {
            audioTrack2.release();
            this.audioTrack = null;
        }
    }

    /* access modifiers changed from: private */
    public void reportWebRtcAudioTrackError(String str) {
        Logging.m25023e(TAG, "Run-time playback error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        Logging.m25023e(TAG, "Init playout error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        Logging.m25023e(TAG, "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    private boolean setStreamVolume(int i) {
        this.threadChecker.checkIsOnValidThread();
        Logging.m25022d(TAG, "setStreamVolume(" + i + ")");
        if (isVolumeFixed()) {
            Logging.m25023e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i, 0);
        return true;
    }

    private boolean startPlayout() {
        this.threadChecker.checkIsOnValidThread();
        this.volumeLogger.start();
        Logging.m25022d(TAG, "startPlayout");
        assertTrue(this.audioTrack != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode = JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH;
                reportWebRtcAudioTrackStartError(audioTrackStartErrorCode, "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState());
                releaseAudioResources();
                return false;
            }
            AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        } catch (IllegalStateException e) {
            JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode2 = JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION;
            reportWebRtcAudioTrackStartError(audioTrackStartErrorCode2, "AudioTrack.play failed: " + e.getMessage());
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopPlayout() {
        this.threadChecker.checkIsOnValidThread();
        this.volumeLogger.stop();
        Logging.m25022d(TAG, "stopPlayout");
        assertTrue(this.audioThread != null);
        logUnderrunCount();
        this.audioThread.stopThread();
        Logging.m25022d(TAG, "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000)) {
            Logging.m25023e(TAG, "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        }
        Logging.m25022d(TAG, "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        if (this.audioTrack != null) {
            Logging.m25022d(TAG, "Calling AudioTrack.stop...");
            try {
                this.audioTrack.stop();
                Logging.m25022d(TAG, "AudioTrack.stop is done.");
                doAudioTrackStateCallback(1);
            } catch (IllegalStateException e) {
                Logging.m25023e(TAG, "AudioTrack.stop failed: " + e.getMessage());
            }
        }
        releaseAudioResources();
        return true;
    }

    public void setNativeAudioTrack(long j) {
        this.nativeAudioTrack = j;
    }

    public void setSpeakerMute(boolean z) {
        Logging.m25026w(TAG, "setSpeakerMute(" + z + ")");
        this.speakerMute = z;
    }

    public WebRtcAudioTrack(Context context2, AudioManager audioManager2, AudioAttributes audioAttributes2, JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback, JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback, boolean z) {
        ThreadUtils.ThreadChecker threadChecker2 = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker2;
        threadChecker2.detachThread();
        this.context = context2;
        this.audioManager = audioManager2;
        this.audioAttributes = audioAttributes2;
        this.errorCallback = audioTrackErrorCallback;
        this.stateCallback = audioTrackStateCallback;
        this.volumeLogger = new VolumeLogger(audioManager2);
        this.useLowLatency = z;
        Logging.m25022d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
    }
}
