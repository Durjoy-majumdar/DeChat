package org.webrtc.audio;

import android.media.AudioManager;
import com.tencent.xweb.IXWebBroadcastListener;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.Logging;

class VolumeLogger {
    private static final String TAG = "VolumeLogger";
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
                Logging.m25022d(VolumeLogger.TAG, "STREAM_RING stream volume: " + VolumeLogger.this.audioManager.getStreamVolume(2) + " (max=" + this.maxRingVolume + ")");
            } else if (mode == 3) {
                Logging.m25022d(VolumeLogger.TAG, "VOICE_CALL stream volume: " + VolumeLogger.this.audioManager.getStreamVolume(0) + " (max=" + this.maxVoiceCallVolume + ")");
            }
        }
    }

    public VolumeLogger(AudioManager audioManager2) {
        this.audioManager = audioManager2;
    }

    public void start() {
        Logging.m25022d(TAG, IXWebBroadcastListener.STAGE_START + WebRtcAudioUtils.getThreadInfo());
        if (this.timer == null) {
            Logging.m25022d(TAG, "audio mode is: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
            Timer timer2 = new Timer(THREAD_NAME);
            this.timer = timer2;
            timer2.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0, 30000);
        }
    }

    public void stop() {
        Logging.m25022d(TAG, "stop" + WebRtcAudioUtils.getThreadInfo());
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.cancel();
            this.timer = null;
        }
    }
}
