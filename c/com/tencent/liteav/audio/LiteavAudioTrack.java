package com.tencent.liteav.audio;

import android.media.AudioTrack;
import android.os.Process;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.nio.ByteBuffer;

@JNINamespace("liteav::audio")
class LiteavAudioTrack {
    private static final String TAG = "LiteavAudioTrack";
    private AudioTrack mAudioTrack;
    private byte[] mPlayBuffer;

    private static AudioTrack createStartedAudioTrack(int i, int i2, int i3, int i4) {
        AudioTrack audioTrack;
        try {
            audioTrack = new AudioTrack(i4, i, i2, 2, i3, 1);
            try {
                if (audioTrack.getState() == 1) {
                    audioTrack.play();
                    Log.m97547i(TAG, "create AudioTrack success. sampleRate: %d, channelConfig: %d, bufferSize: %d, streamType: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), streamTypeToString(i4));
                    return audioTrack;
                }
                throw new RuntimeException("AudioTrack is not initialized.");
            } catch (Throwable unused) {
                Log.m97549w(TAG, "create AudioTrack failed. sampleRate: %d, channelConfig: %d, bufferSize: %d, streamType: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), streamTypeToString(i4));
                destroyAudioTrack(audioTrack);
                return null;
            }
        } catch (Throwable unused2) {
            audioTrack = null;
            Log.m97549w(TAG, "create AudioTrack failed. sampleRate: %d, channelConfig: %d, bufferSize: %d, streamType: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), streamTypeToString(i4));
            destroyAudioTrack(audioTrack);
            return null;
        }
    }

    private static void destroyAudioTrack(AudioTrack audioTrack) {
        if (audioTrack != null) {
            try {
                if (audioTrack.getPlayState() == 3) {
                    audioTrack.stop();
                    audioTrack.flush();
                }
                audioTrack.release();
            } catch (Exception e) {
                Log.m97546e(TAG, "stop AudioTrack failed.", e);
            }
        }
    }

    private static String streamTypeToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION" : "STREAM_ALARM" : "STREAM_MUSIC" : "STREAM_RING" : "STREAM_SYSTEM" : "STREAM_VOICE_CALL";
    }

    public int startPlayout(int i, int i2, int i3, int i4) {
        int[] iArr = {i, 0, 3, 1};
        int i5 = i3 == 1 ? 4 : 12;
        int minBufferSize = AudioTrack.getMinBufferSize(i2, i5, 2);
        if (minBufferSize <= 0) {
            Log.m97546e(TAG, "AudioTrack.getMinBufferSize return error: ".concat(String.valueOf(minBufferSize)), new Object[0]);
            return -2;
        }
        for (int i6 = 0; i6 < 4 && this.mAudioTrack == null; i6++) {
            int i7 = iArr[i6];
            for (int i8 = 1; i8 <= 2 && this.mAudioTrack == null; i8++) {
                int i9 = minBufferSize * i8;
                if (i9 >= i4 * 4 || i8 >= 2) {
                    this.mAudioTrack = createStartedAudioTrack(i2, i5, i9, i7);
                }
            }
        }
        if (this.mAudioTrack == null) {
            return -1;
        }
        Process.setThreadPriority(-19);
        return 0;
    }

    public void stopPlayout() {
        destroyAudioTrack(this.mAudioTrack);
        this.mAudioTrack = null;
    }

    public int write(ByteBuffer byteBuffer, int i, int i2) {
        int i3;
        if (this.mAudioTrack == null) {
            return -1;
        }
        byteBuffer.position(i);
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 21) {
            i3 = this.mAudioTrack.write(byteBuffer, i2, 0);
        } else {
            byte[] bArr = this.mPlayBuffer;
            if (bArr == null || bArr.length < i2) {
                this.mPlayBuffer = new byte[i2];
            }
            byteBuffer.get(this.mPlayBuffer, 0, i2);
            i3 = this.mAudioTrack.write(this.mPlayBuffer, 0, i2);
        }
        if (i3 > 0) {
            return i3;
        }
        Log.m97546e(TAG, "write audio data to AudioTrack failed. ".concat(String.valueOf(i3)), new Object[0]);
        return -1;
    }
}
