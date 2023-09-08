package com.tencent.thumbplayer.adapter.player;

import com.tencent.thumbplayer.api.TPCaptureCallBack;
import com.tencent.thumbplayer.core.imagegenerator.TPImageGeneratorParams;

public interface ITPCapture {
    void generateImageAsyncAtTime(long j, TPImageGeneratorParams tPImageGeneratorParams, TPCaptureCallBack tPCaptureCallBack);

    void release();
}
