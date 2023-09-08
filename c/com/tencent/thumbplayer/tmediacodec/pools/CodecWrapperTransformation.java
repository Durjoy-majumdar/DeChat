package com.tencent.thumbplayer.tmediacodec.pools;

import com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper;
import com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper;

public interface CodecWrapperTransformation {
    void clearAndReleaseAll();

    ReuseCodecWrapper obtainCodecWrapper(FormatWrapper formatWrapper);

    void removeFromRunning(ReuseCodecWrapper reuseCodecWrapper);

    void transToKeep(ReuseCodecWrapper reuseCodecWrapper);

    void transToRunning(ReuseCodecWrapper reuseCodecWrapper);
}
