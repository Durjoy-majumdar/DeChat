package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videobase.frame.PixelFrame;

public interface CustomVideoProcessListener {
    void onGLContextCreated();

    void onGLContextDestroy();

    void onProcessFrame(PixelFrame pixelFrame, PixelFrame pixelFrame2);
}
