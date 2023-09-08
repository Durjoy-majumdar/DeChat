package com.tencent.liteav.audio;

import android.media.AudioRecord;
import android.os.Process;
import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import j20.C117292a;
import java.nio.ByteBuffer;

@JNINamespace("liteav::audio")
class LiteavAudioRecord {
    private static final String TAG = "LiteavAudioRecord";
    private AudioRecord mAudioRecord;

    private static String audioSourceToString(int i) {
        switch (i) {
            case 0:
                return NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN;
            case 1:
                return "MIC";
            case 2:
                return "VOICE_UPLINK";
            case 3:
                return "VOICE_DOWNLINK";
            case 4:
                return "VOICE_CALL";
            case 5:
                return "CAMCORDER";
            case 6:
                return "VOICE_RECOGNITION";
            case 7:
                return "VOICE_COMMUNICATION";
            case 9:
                return "UNPROCESSED";
            case 10:
                return "VOICE_PERFORMANCE";
            default:
                return "INVALID";
        }
    }

    private static AudioRecord createStartedAudioRecord(int i, int i2, int i3, int i4) {
        AudioRecord audioRecord;
        try {
            audioRecord = new AudioRecord(i, i2, i3, 2, i4);
            try {
                if (audioRecord.getState() == 1) {
                    C117292a.m165363i(audioRecord, "com/tencent/liteav/audio/LiteavAudioRecord", "createStartedAudioRecord", "(IIII)Landroid/media/AudioRecord;", "android/media/AudioRecord", "startRecording", "()V");
                    return audioRecord;
                }
                throw new RuntimeException("AudioRecord is not initialized.");
            } catch (Throwable unused) {
                Log.m97549w(TAG, "create AudioRecord failed. source: %s, sampleRate: %d, channelConfig: %d, bufferSize: %d", audioSourceToString(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
                destroyAudioRecord(audioRecord);
                return null;
            }
        } catch (Throwable unused2) {
            audioRecord = null;
            Log.m97549w(TAG, "create AudioRecord failed. source: %s, sampleRate: %d, channelConfig: %d, bufferSize: %d", audioSourceToString(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            destroyAudioRecord(audioRecord);
            return null;
        }
    }

    private static void destroyAudioRecord(AudioRecord audioRecord) {
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    audioRecord.stop();
                }
                audioRecord.release();
            } catch (Exception e) {
                Log.m97546e(TAG, "stop AudioRecord failed.", e);
            }
        }
    }

    public int read(ByteBuffer byteBuffer, int i) {
        if (this.mAudioRecord == null) {
            return -1;
        }
        byteBuffer.position(0);
        int read = this.mAudioRecord.read(byteBuffer, i);
        if (read > 0) {
            return read;
        }
        Log.m97546e(TAG, "read failed, %d", Integer.valueOf(read));
        return -1;
    }

    public int startRecording(int i, int i2, int i3, int i4) {
        int[] iArr = {i, 1, 5, 0};
        int i5 = i3 == 1 ? 16 : 12;
        int minBufferSize = AudioRecord.getMinBufferSize(i2, i5, 2);
        if (minBufferSize <= 0) {
            Log.m97546e(TAG, "AudioRecord.getMinBufferSize return error: ".concat(String.valueOf(minBufferSize)), new Object[0]);
            return -2;
        }
        for (int i6 = 0; i6 < 4 && this.mAudioRecord == null; i6++) {
            int i7 = iArr[i6];
            for (int i8 = 1; i8 <= 2 && this.mAudioRecord == null; i8++) {
                int i9 = minBufferSize * i8;
                if (i9 >= i4 * 4 || i8 >= 2) {
                    this.mAudioRecord = createStartedAudioRecord(i7, i2, i5, i9);
                }
            }
        }
        if (this.mAudioRecord == null) {
            return -1;
        }
        Process.setThreadPriority(-19);
        return 0;
    }

    public void stopRecording() {
        destroyAudioRecord(this.mAudioRecord);
        this.mAudioRecord = null;
    }
}
