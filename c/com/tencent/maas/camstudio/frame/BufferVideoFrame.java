package com.tencent.maas.camstudio.frame;

public interface BufferVideoFrame extends VideoFrame {
    int getFormat();

    Plane[] getPlanes();
}
