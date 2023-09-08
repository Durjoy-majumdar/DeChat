package com.tencent.liteav.audio;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord;
import android.media.projection.MediaProjection;
import android.os.Process;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import j20.C117292a;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

@JNINamespace("liteav::audio")
public class SystemLoopbackRecorder {
    private static final String TAG = "SystemLoopbackRecorder";

    /* renamed from: a */
    public static final /* synthetic */ int f46024a = 0;
    private static final Object mLock = new Object();
    private static final List<SystemLoopbackRecorder> sListeners = new LinkedList();
    private volatile long mNativeSystemLoopbackRecorder;

    public SystemLoopbackRecorder(long j) {
        this.mNativeSystemLoopbackRecorder = j;
    }

    private static native void nativeSetMediaProjectionSession(long j, MediaProjection mediaProjection);

    public static void notifyMediaProjectionState(MediaProjection mediaProjection) {
        StringBuilder sb = new StringBuilder("Received MediaProjection state ");
        sb.append(mediaProjection != null);
        Log.m97547i(TAG, sb.toString(), new Object[0]);
        synchronized (mLock) {
            for (SystemLoopbackRecorder mediaProjectionSession : sListeners) {
                mediaProjectionSession.setMediaProjectionSession(mediaProjection);
            }
        }
    }

    public void registerMediaProjectionListener() {
        synchronized (mLock) {
            sListeners.add(this);
        }
    }

    public void setMediaProjectionSession(MediaProjection mediaProjection) {
        if (this.mNativeSystemLoopbackRecorder != 0) {
            nativeSetMediaProjectionSession(this.mNativeSystemLoopbackRecorder, mediaProjection);
        }
    }

    public void unregisterMediaProjectionListener() {
        synchronized (mLock) {
            sListeners.remove(this);
        }
    }

    public static class Recorder {

        /* renamed from: a */
        private AudioRecord f46025a;

        /* renamed from: b */
        private AudioManager f46026b;

        public Recorder() {
            Context applicationContext = ContextUtils.getApplicationContext();
            ContextUtils.getApplicationContext();
            this.f46026b = (AudioManager) applicationContext.getSystemService("audio");
        }

        /* renamed from: a */
        private static AudioRecord m16840a(MediaProjection mediaProjection, int i, int i2, int i3) {
            int i4 = i;
            AudioPlaybackCaptureConfiguration.Builder builder = new AudioPlaybackCaptureConfiguration.Builder(mediaProjection);
            int i5 = 1;
            builder.addMatchingUsage(1);
            builder.addMatchingUsage(14);
            AudioPlaybackCaptureConfiguration build = builder.build();
            if (build == null) {
                return null;
            }
            int i6 = i2 == 1 ? 16 : 12;
            AudioFormat build2 = new AudioFormat.Builder().setEncoding(2).setSampleRate(i4).setChannelMask(i6).build();
            int minBufferSize = AudioRecord.getMinBufferSize(i4, i6, 2);
            AudioRecord audioRecord = null;
            int i7 = 1;
            while (i7 <= 2 && audioRecord == null) {
                int i8 = minBufferSize * i7;
                if (i8 >= i3 * 4 || i7 >= 2) {
                    audioRecord = new AudioRecord.Builder().setAudioFormat(build2).setBufferSizeInBytes(i8).setAudioPlaybackCaptureConfig(build).build();
                    if (audioRecord.getState() != i5) {
                        Log.m97546e(SystemLoopbackRecorder.TAG, "Audio record state error", new Object[0]);
                        m16842a(audioRecord);
                        audioRecord = null;
                    } else {
                        String str = SystemLoopbackRecorder.TAG;
                        C117292a.m165363i(audioRecord, "com/tencent/liteav/audio/SystemLoopbackRecorder$Recorder", "a", "(Landroid/media/projection/MediaProjection;III)Landroid/media/AudioRecord;", "android/media/AudioRecord", "startRecording", "()V");
                        Log.m97547i(str, "Create audio record success", new Object[0]);
                    }
                }
                i7++;
                i5 = 1;
            }
            return audioRecord;
        }

        public int read(ByteBuffer byteBuffer, int i) {
            if (this.f46025a == null) {
                return -1;
            }
            byteBuffer.position(0);
            int read = this.f46025a.read(byteBuffer, i);
            if (read > 0) {
                return read;
            }
            Log.m97546e(SystemLoopbackRecorder.TAG, "Read failed ".concat(String.valueOf(read)), new Object[0]);
            return -1;
        }

        public int startRecording(MediaProjection mediaProjection, int i, int i2, int i3) {
            try {
                AudioManager audioManager = this.f46026b;
                if (audioManager != null) {
                    audioManager.setAllowedCapturePolicy(3);
                }
            } catch (Throwable th) {
                Log.m97546e(SystemLoopbackRecorder.TAG, "ForbidCaptureAudioFromCurrentApp error " + th.getMessage(), new Object[0]);
            }
            AudioManager audioManager2 = this.f46026b;
            int mode = audioManager2 != null ? audioManager2.getMode() : 0;
            m16841a(0);
            this.f46025a = m16840a(mediaProjection, i, i2, i3);
            m16841a(mode);
            if (this.f46025a == null) {
                return -1;
            }
            Process.setThreadPriority(-19);
            return 0;
        }

        public void stopRecording() {
            m16842a(this.f46025a);
            this.f46025a = null;
        }

        /* renamed from: a */
        private static void m16842a(AudioRecord audioRecord) {
            if (audioRecord != null) {
                try {
                    if (audioRecord.getRecordingState() == 3) {
                        audioRecord.stop();
                    }
                    audioRecord.release();
                } catch (Throwable th) {
                    Log.m97546e(SystemLoopbackRecorder.TAG, "Destroy AudioRecord failed." + th.getMessage(), new Object[0]);
                }
            }
        }

        /* renamed from: a */
        private void m16841a(int i) {
            try {
                AudioManager audioManager = this.f46026b;
                if (audioManager != null) {
                    audioManager.setMode(i);
                }
            } catch (Throwable th) {
                Log.m97546e(SystemLoopbackRecorder.TAG, "Set audio mode exception " + th.getMessage(), new Object[0]);
            }
        }
    }
}
