package com.tencent.qqmusic.mediaplayer.audiofx;

import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.BufferInfo;
import com.tencent.qqmusic.mediaplayer.FloatBufferInfo;

public interface IAudioListener {
    long getActualTime(long j);

    boolean isEnabled();

    boolean isTerminal();

    boolean onPcm(BufferInfo bufferInfo, BufferInfo bufferInfo2, long j);

    boolean onPcm(FloatBufferInfo floatBufferInfo, FloatBufferInfo floatBufferInfo2, long j);

    long onPlayerReady(int i, AudioInformation audioInformation, long j);

    void onPlayerSeekComplete(long j);

    void onPlayerStopped();
}
