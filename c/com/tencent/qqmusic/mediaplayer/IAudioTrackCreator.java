package com.tencent.qqmusic.mediaplayer;

import android.media.AudioTrack;

public interface IAudioTrackCreator {
    AudioTrack create(int i, int i2, int i3, int i4, int i5, int i6, int i7);
}
