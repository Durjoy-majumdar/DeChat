package com.tencent.qqmusic.mediaplayer.codec.ogg;

import android.text.TextUtils;
import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition;

public class VorbisRecognition implements IAudioRecognition {
    public AudioFormat.AudioType getAudioType(String str, byte[] bArr) {
        return (bArr == null || bArr.length <= 0 || !new String(bArr).startsWith("OggS")) ? AudioFormat.AudioType.UNSUPPORT : AudioFormat.AudioType.OGG;
    }

    public AudioFormat.AudioType guessAudioType(String str) {
        return (TextUtils.isEmpty(str) || !str.toLowerCase().contains(".ogg")) ? AudioFormat.AudioType.UNSUPPORT : AudioFormat.AudioType.OGG;
    }
}
