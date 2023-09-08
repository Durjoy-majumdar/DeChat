package com.tencent.maas.camstudio.frame;

public interface TextureVideoFrame extends VideoFrame {
    long getFenceSyncObj();

    int getTextureName();

    void release(long j);
}
