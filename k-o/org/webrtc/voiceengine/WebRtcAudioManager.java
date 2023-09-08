package org.webrtc.voiceengine;

import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import com.tencent.midas.data.APMidasPluginInfo;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;

public class WebRtcAudioManager {
    private static final int BITS_PER_SAMPLE = 16;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static final String TAG = "WebRtcAudioManager";
    private static final boolean blacklistDeviceForAAudioUsage = true;
    private static boolean blacklistDeviceForOpenSLESUsage;
    private static boolean blacklistDeviceForOpenSLESUsageIsOverridden;
    private static boolean useStereoInput;
    private static boolean useStereoOutput;
    private boolean aAudio;
    private final AudioManager audioManager;
    private boolean hardwareAEC;
    private boolean hardwareAGC;
    private boolean hardwareNS;
    private boolean initialized;
    private int inputBufferSize;
    private int inputChannels;
    private boolean lowLatencyInput;
    private boolean lowLatencyOutput;
    private final long nativeAudioManager;
    private int nativeChannels;
    private int nativeSampleRate;
    private int outputBufferSize;
    private int outputChannels;
    private boolean proAudio;
    private int sampleRate;
    private final VolumeLogger volumeLogger;

    public static class VolumeLogger {
        private static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
        private static final int TIMER_PERIOD_IN_SECONDS = 30;
        /* access modifiers changed from: private */
        public final AudioManager audioManager;
        private Timer timer;

        public class LogVolumeTask extends TimerTask {
            private final int maxRingVolume;
            private final int maxVoiceCallVolume;

            public LogVolumeTask(int i, int i2) {
                this.maxRingVolume = i;
                this.maxVoiceCallVolume = i2;
            }

            public void run() {
                int mode = VolumeLogger.this.audioManager.getMode();
                if (mode == 1) {
                    Logging.m25022d(WebRtcAudioManager.TAG, "STREAM_RING stream volume: " + VolumeLogger.this.audioManager.getStreamVolume(2) + " (max=" + this.maxRingVolume + ")");
                } else if (mode == 3) {
                    Logging.m25022d(WebRtcAudioManager.TAG, "VOICE_CALL stream volume: " + VolumeLogger.this.audioManager.getStreamVolume(0) + " (max=" + this.maxVoiceCallVolume + ")");
                }
            }
        }

        public VolumeLogger(AudioManager audioManager2) {
            this.audioManager = audioManager2;
        }

        /* access modifiers changed from: private */
        public void stop() {
            Timer timer2 = this.timer;
            if (timer2 != null) {
                timer2.cancel();
                this.timer = null;
            }
        }

        public void start() {
            Timer timer2 = new Timer(THREAD_NAME);
            this.timer = timer2;
            timer2.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0, 30000);
        }
    }

    public WebRtcAudioManager(long j) {
        Logging.m25022d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioManager = j;
        AudioManager audioManager2 = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
        this.audioManager = audioManager2;
        this.volumeLogger = new VolumeLogger(audioManager2);
        storeAudioParameters();
        int i = this.sampleRate;
        int i2 = this.outputChannels;
        int i3 = this.inputChannels;
        boolean z = this.hardwareAEC;
        boolean z2 = this.hardwareAGC;
        boolean z3 = this.hardwareNS;
        boolean z4 = this.lowLatencyOutput;
        boolean z5 = this.lowLatencyInput;
        boolean z6 = this.proAudio;
        boolean z7 = this.aAudio;
        int i4 = this.outputBufferSize;
        int i5 = this.inputBufferSize;
        String str = TAG;
        nativeCacheAudioParameters(i, i2, i3, z, z2, z3, z4, z5, z6, z7, i4, i5, j);
        WebRtcAudioUtils.logAudioState(str);
    }

    private static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private void dispose() {
        Logging.m25022d(TAG, "dispose" + WebRtcAudioUtils.getThreadInfo());
        if (this.initialized) {
            this.volumeLogger.stop();
        }
    }

    private int getLowLatencyInputFramesPerBuffer() {
        assertTrue(isLowLatencyInputSupported());
        return getLowLatencyOutputFramesPerBuffer();
    }

    private int getLowLatencyOutputFramesPerBuffer() {
        assertTrue(isLowLatencyOutputSupported());
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property == null) {
            return 256;
        }
        return Integer.parseInt(property);
    }

    private static int getMinInputFrameSize(int i, int i2) {
        return AudioRecord.getMinBufferSize(i, i2 == 1 ? 16 : 12, 2) / (i2 * 2);
    }

    private static int getMinOutputFrameSize(int i, int i2) {
        return AudioTrack.getMinBufferSize(i, i2 == 1 ? 4 : 12, 2) / (i2 * 2);
    }

    private int getNativeOutputSampleRate() {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            Logging.m25022d(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        } else if (WebRtcAudioUtils.isDefaultSampleRateOverridden()) {
            Logging.m25022d(TAG, "Default sample rate is overriden to " + WebRtcAudioUtils.getDefaultSampleRateHz() + " Hz");
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        } else {
            int sampleRateForApiLevel = getSampleRateForApiLevel();
            Logging.m25022d(TAG, "Sample rate is set to " + sampleRateForApiLevel + " Hz");
            return sampleRateForApiLevel;
        }
    }

    private int getSampleRateForApiLevel() {
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        return property == null ? WebRtcAudioUtils.getDefaultSampleRateHz() : Integer.parseInt(property);
    }

    public static synchronized boolean getStereoInput() {
        boolean z;
        synchronized (WebRtcAudioManager.class) {
            z = useStereoInput;
        }
        return z;
    }

    public static synchronized boolean getStereoOutput() {
        boolean z;
        synchronized (WebRtcAudioManager.class) {
            z = useStereoOutput;
        }
        return z;
    }

    private boolean hasEarpiece() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    private boolean init() {
        Logging.m25022d(TAG, APMidasPluginInfo.LAUNCH_INTERFACE_INIT + WebRtcAudioUtils.getThreadInfo());
        if (this.initialized) {
            return true;
        }
        Logging.m25022d(TAG, "audio mode is: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
        this.initialized = true;
        this.volumeLogger.start();
        return true;
    }

    private boolean isAAudioSupported() {
        Logging.m25026w(TAG, "AAudio support is currently disabled on all devices!");
        return false;
    }

    private static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    private boolean isCommunicationModeEnabled() {
        return this.audioManager.getMode() == 3;
    }

    private boolean isDeviceBlacklistedForOpenSLESUsage() {
        boolean deviceIsBlacklistedForOpenSLESUsage = blacklistDeviceForOpenSLESUsageIsOverridden ? blacklistDeviceForOpenSLESUsage : WebRtcAudioUtils.deviceIsBlacklistedForOpenSLESUsage();
        if (deviceIsBlacklistedForOpenSLESUsage) {
            Logging.m25022d(TAG, Build.MODEL + " is blacklisted for OpenSL ES usage!");
        }
        return deviceIsBlacklistedForOpenSLESUsage;
    }

    private boolean isLowLatencyOutputSupported() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    private static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private boolean isProAudioSupported() {
        return Build.VERSION.SDK_INT >= 23 && ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.pro");
    }

    private native void nativeCacheAudioParameters(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i4, int i5, long j);

    public static synchronized void setBlacklistDeviceForOpenSLESUsage(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            blacklistDeviceForOpenSLESUsageIsOverridden = true;
            blacklistDeviceForOpenSLESUsage = z;
        }
    }

    public static synchronized void setStereoInput(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            Logging.m25026w(TAG, "Overriding default input behavior: setStereoInput(" + z + ')');
            useStereoInput = z;
        }
    }

    public static synchronized void setStereoOutput(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            Logging.m25026w(TAG, "Overriding default output behavior: setStereoOutput(" + z + ')');
            useStereoOutput = z;
        }
    }

    private void storeAudioParameters() {
        int i = 2;
        this.outputChannels = getStereoOutput() ? 2 : 1;
        if (!getStereoInput()) {
            i = 1;
        }
        this.inputChannels = i;
        this.sampleRate = getNativeOutputSampleRate();
        this.hardwareAEC = isAcousticEchoCancelerSupported();
        this.hardwareAGC = false;
        this.hardwareNS = isNoiseSuppressorSupported();
        this.lowLatencyOutput = isLowLatencyOutputSupported();
        this.lowLatencyInput = isLowLatencyInputSupported();
        this.proAudio = isProAudioSupported();
        this.aAudio = isAAudioSupported();
        this.outputBufferSize = this.lowLatencyOutput ? getLowLatencyOutputFramesPerBuffer() : getMinOutputFrameSize(this.sampleRate, this.outputChannels);
        this.inputBufferSize = this.lowLatencyInput ? getLowLatencyInputFramesPerBuffer() : getMinInputFrameSize(this.sampleRate, this.inputChannels);
    }

    public boolean isLowLatencyInputSupported() {
        return isLowLatencyOutputSupported();
    }
}
