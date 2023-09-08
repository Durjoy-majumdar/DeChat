package com.tencent.qqmusic.mediaplayer.codec.mp3;

import android.text.TextUtils;
import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition;

public class MP3Recognition implements IAudioRecognition {
    public AudioFormat.AudioType getAudioType(String str, byte[] bArr) {
        return MP3FileCheck.isMp3File(str) ? AudioFormat.AudioType.MP3 : AudioFormat.AudioType.UNSUPPORT;
    }

    public AudioFormat.AudioType guessAudioType(String str) {
        return (TextUtils.isEmpty(str) || (!str.toLowerCase().endsWith(".mp3") && !str.endsWith(".mp3.tmp") && !str.endsWith(".mp3.mqcc") && !str.endsWith(".ofl") && !str.endsWith(".efe"))) ? AudioFormat.AudioType.UNSUPPORT : AudioFormat.AudioType.MP3;
    }
}
