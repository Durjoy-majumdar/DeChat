package com.tencent.qqmusic.mediaplayer.util;

import android.media.AudioTrack;
import java.lang.ref.WeakReference;

public class AudioTrackMonitor {
    private static final boolean ENABLE = false;
    private static final String TAG = "AudioTrackMonitor";
    /* access modifiers changed from: private */
    public WeakReference<AudioTrack> mAudioTrackRef = null;
    /* access modifiers changed from: private */
    public StringBuilder mBuilder = new StringBuilder(100);
    /* access modifiers changed from: private */
    public long mLastPosition = 0;
    /* access modifiers changed from: private */
    public long mLastTime = System.nanoTime();
    /* access modifiers changed from: private */
    public int mLooperTime = 200;
    private Thread mMonitorThread = new Thread("Monitor-AudioTrack") {
        public void run() {
            super.run();
            while (!AudioTrackMonitor.this.mStop) {
                try {
                    Thread.currentThread();
                    Thread.sleep((long) AudioTrackMonitor.this.mLooperTime);
                } catch (Throwable th) {
                    Logger.m21790e(AudioTrackMonitor.TAG, th);
                }
                try {
                    if (AudioTrackMonitor.this.mAudioTrackRef != null && AudioTrackMonitor.this.mAudioTrackRef.get() != null) {
                        AudioTrack audioTrack = (AudioTrack) AudioTrackMonitor.this.mAudioTrackRef.get();
                        if (audioTrack != null) {
                            long playbackHeadPosition = (long) audioTrack.getPlaybackHeadPosition();
                            long access$300 = playbackHeadPosition - AudioTrackMonitor.this.mLastPosition;
                            long unused = AudioTrackMonitor.this.mLastPosition = playbackHeadPosition;
                            long nanoTime = System.nanoTime() - AudioTrackMonitor.this.mLastTime;
                            long unused2 = AudioTrackMonitor.this.mLastTime = System.nanoTime();
                            StringBuilder access$500 = AudioTrackMonitor.this.mBuilder;
                            access$500.append("play-speedTime-");
                            access$500.append(nanoTime);
                            access$500.append(",play-speedPosition-");
                            access$500.append(access$300);
                            StringBuilder access$5002 = AudioTrackMonitor.this.mBuilder;
                            access$5002.append(",playstate-");
                            access$5002.append(audioTrack.getPlayState());
                            Logger.m21787e(AudioTrackMonitor.TAG, AudioTrackMonitor.this.mBuilder.toString());
                            AudioTrackMonitor.this.mBuilder.delete(0, AudioTrackMonitor.this.mBuilder.length());
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th4) {
                    Logger.m21790e(AudioTrackMonitor.TAG, th4);
                }
            }
        }
    };
    /* access modifiers changed from: private */
    public boolean mStop = false;

    public AudioTrackMonitor(AudioTrack audioTrack) {
        this.mAudioTrackRef = new WeakReference<>(audioTrack);
    }

    public void start() {
    }

    public void stop() {
    }
}
