package com.tencent.liteav.videoconsumer.renderer;

import com.tencent.liteav.videobase.frame.PixelFrame;

public interface VideoRenderListener {
    void onRenderFrame(PixelFrame pixelFrame);

    void onRenderTargetSizeChanged(int i, int i2);
}
