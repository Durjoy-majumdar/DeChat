package com.tencent.qqmusic.mediaplayer.codec.wav;

import android.text.TextUtils;
import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import java.io.IOException;

public class WavRecognition implements IAudioRecognition {
    public static boolean isWav(IDataSource iDataSource) {
        byte[] bArr = new byte[4];
        try {
            iDataSource.readAt(0, bArr, 0, 4);
        } catch (IOException unused) {
        }
        if (bArr[0] == 82 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 70) {
            return true;
        }
        try {
            iDataSource.readAt(8, bArr, 0, 4);
        } catch (IOException unused2) {
        }
        return bArr[0] == 87 && bArr[1] == 65 && bArr[2] == 86 && bArr[3] == 69;
    }

    public AudioFormat.AudioType getAudioType(String str, byte[] bArr) {
        return WaveReader.isWavFormat(str) ? AudioFormat.AudioType.WAV : AudioFormat.AudioType.UNSUPPORT;
    }

    public AudioFormat.AudioType guessAudioType(String str) {
        return (TextUtils.isEmpty(str) || !str.toLowerCase().contains(".wav")) ? AudioFormat.AudioType.UNSUPPORT : AudioFormat.AudioType.WAV;
    }
}
