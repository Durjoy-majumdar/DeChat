package org.webrtc.voiceengine;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import java.nio.ByteBuffer;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;

public class WebRtcAudioTrack {
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_CONTENT_TYPE = 2;
    private static final int DEFAULT_STREAM_TYPE = 3;
    private static final int DEFAULT_USAGE;
    private static final String TAG = "WebRtcAudioTrack";
    private static ErrorCallback errorCallback;
    private static WebRtcAudioTrackErrorCallback errorCallbackOld;
    /* access modifiers changed from: private */
    public static volatile boolean speakerMute;
    private static int usageAttribute;
    private final AudioManager audioManager = ((AudioManager) ContextUtils.getApplicationContext().getSystemService("audio"));
    private AudioTrackThread audioThread;
    /* access modifiers changed from: private */
    public AudioTrack audioTrack;
    /* access modifiers changed from: private */
    public ByteBuffer byteBuffer;
    /* access modifiers changed from: private */
    public byte[] emptyBytes;
    /* access modifiers changed from: private */
    public final long nativeAudioTrack;
    private final ThreadUtils.ThreadChecker threadChecker;

    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    public class AudioTrackThread extends Thread {
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
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                webRtcAudioTrack.nativeGetPlayoutData(capacity, webRtcAudioTrack.nativeAudioTrack);
                WebRtcAudioTrack.assertTrue(capacity <= WebRtcAudioTrack.this.byteBuffer.remaining());
                if (WebRtcAudioTrack.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                    WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                int writeBytes = writeBytes(WebRtcAudioTrack.this.audioTrack, WebRtcAudioTrack.this.byteBuffer, capacity);
                if (writeBytes != capacity) {
                    Logging.m25023e(WebRtcAudioTrack.TAG, "AudioTrack.write played invalid number of bytes: " + writeBytes);
                    if (writeBytes < 0) {
                        this.keepAlive = false;
                        WebRtcAudioTrack webRtcAudioTrack2 = WebRtcAudioTrack.this;
                        webRtcAudioTrack2.reportWebRtcAudioTrackError("AudioTrack.write failed: " + writeBytes);
                    }
                }
                WebRtcAudioTrack.this.byteBuffer.rewind();
            }
            if (WebRtcAudioTrack.this.audioTrack != null) {
                Logging.m25022d(WebRtcAudioTrack.TAG, "Calling AudioTrack.stop...");
                try {
                    WebRtcAudioTrack.this.audioTrack.stop();
                    Logging.m25022d(WebRtcAudioTrack.TAG, "AudioTrack.stop is done.");
                } catch (IllegalStateException e) {
                    Logging.m25023e(WebRtcAudioTrack.TAG, "AudioTrack.stop failed: " + e.getMessage());
                }
            }
        }

        public void stopThread() {
            Logging.m25022d(WebRtcAudioTrack.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    public interface ErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    @Deprecated
    public interface WebRtcAudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(String str);
    }

    static {
        int defaultUsageAttribute = getDefaultUsageAttribute();
        DEFAULT_USAGE = defaultUsageAttribute;
        usageAttribute = defaultUsageAttribute;
    }

    public WebRtcAudioTrack(long j) {
        ThreadUtils.ThreadChecker threadChecker2 = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker2;
        threadChecker2.checkIsOnValidThread();
        Logging.m25022d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioTrack = j;
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

    private static AudioTrack createAudioTrackOnLollipopOrHigher(int i, int i2, int i3) {
        Logging.m25022d(TAG, "createAudioTrackOnLollipopOrHigher");
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(3);
        Logging.m25022d(TAG, "nativeOutputSampleRate: " + nativeOutputSampleRate);
        if (i != nativeOutputSampleRate) {
            Logging.m25026w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
        if (usageAttribute != DEFAULT_USAGE) {
            Logging.m25026w(TAG, "A non default usage attribute is used: " + usageAttribute);
        }
        return new AudioTrack(new AudioAttributes.Builder().setUsage(usageAttribute).setContentType(2).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build(), i3, 1, 0);
    }

    private static AudioTrack createAudioTrackOnLowerThanLollipop(int i, int i2, int i3) {
        return new AudioTrack(3, i, i2, 2, i3, 1);
    }

    private int getBufferSizeInFrames() {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.audioTrack.getBufferSizeInFrames();
        }
        return -1;
    }

    private static int getDefaultUsageAttribute() {
        return 1;
    }

    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.m25022d(TAG, "getStreamMaxVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamMaxVolume(3);
    }

    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.m25022d(TAG, "getStreamVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamVolume(3);
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
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
        int channelCountToConfiguration = channelCountToConfiguration(i2);
        int minBufferSize = (int) (((double) AudioTrack.getMinBufferSize(i, channelCountToConfiguration, 2)) * d);
        Logging.m25022d(TAG, "minBufferSizeInBytes: " + minBufferSize);
        if (minBufferSize < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return -1;
        } else if (this.audioTrack != null) {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            return -1;
        } else {
            try {
                AudioTrack createAudioTrackOnLollipopOrHigher = createAudioTrackOnLollipopOrHigher(i, channelCountToConfiguration, minBufferSize);
                this.audioTrack = createAudioTrackOnLollipopOrHigher;
                if (createAudioTrackOnLollipopOrHigher == null || createAudioTrackOnLollipopOrHigher.getState() != 1) {
                    reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                    releaseAudioResources();
                    return -1;
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

    private void logUnderrunCount() {
        if (Build.VERSION.SDK_INT >= 24) {
            Logging.m25022d(TAG, "underrun count: " + this.audioTrack.getUnderrunCount());
        }
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer2, long j);

    /* access modifiers changed from: private */
    public native void nativeGetPlayoutData(int i, long j);

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
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        Logging.m25023e(TAG, "Init playout error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        Logging.m25023e(TAG, "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackStartError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    public static synchronized void setAudioTrackUsageAttribute(int i) {
        synchronized (WebRtcAudioTrack.class) {
            Logging.m25026w(TAG, "Default usage attribute is changed from: " + DEFAULT_USAGE + " to " + i);
            usageAttribute = i;
        }
    }

    @Deprecated
    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        Logging.m25022d(TAG, "Set error callback (deprecated");
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }

    public static void setSpeakerMute(boolean z) {
        Logging.m25026w(TAG, "setSpeakerMute(" + z + ")");
        speakerMute = z;
    }

    private boolean setStreamVolume(int i) {
        this.threadChecker.checkIsOnValidThread();
        Logging.m25022d(TAG, "setStreamVolume(" + i + ")");
        assertTrue(this.audioManager != null);
        if (isVolumeFixed()) {
            Logging.m25023e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(3, i, 0);
        return true;
    }

    private boolean startPlayout() {
        this.threadChecker.checkIsOnValidThread();
        Logging.m25022d(TAG, "startPlayout");
        assertTrue(this.audioTrack != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                AudioTrackStartErrorCode audioTrackStartErrorCode = AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH;
                reportWebRtcAudioTrackStartError(audioTrackStartErrorCode, "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState());
                releaseAudioResources();
                return false;
            }
            AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        } catch (IllegalStateException e) {
            AudioTrackStartErrorCode audioTrackStartErrorCode2 = AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION;
            reportWebRtcAudioTrackStartError(audioTrackStartErrorCode2, "AudioTrack.play failed: " + e.getMessage());
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopPlayout() {
        this.threadChecker.checkIsOnValidThread();
        Logging.m25022d(TAG, "stopPlayout");
        assertTrue(this.audioThread != null);
        logUnderrunCount();
        this.audioThread.stopThread();
        Logging.m25022d(TAG, "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000)) {
            Logging.m25023e(TAG, "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState(TAG);
        }
        Logging.m25022d(TAG, "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        releaseAudioResources();
        return true;
    }

    public static void setErrorCallback(ErrorCallback errorCallback2) {
        Logging.m25022d(TAG, "Set extended error callback");
        errorCallback = errorCallback2;
    }
}
