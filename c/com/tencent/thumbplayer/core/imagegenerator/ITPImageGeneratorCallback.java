package com.tencent.thumbplayer.core.imagegenerator;

import com.tencent.thumbplayer.core.common.TPVideoFrame;

public interface ITPImageGeneratorCallback {
    void onImageGenerationCompleted(int i, long j, long j2, long j3, TPVideoFrame tPVideoFrame);
}
