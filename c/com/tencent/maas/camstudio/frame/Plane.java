package com.tencent.maas.camstudio.frame;

import java.nio.ByteBuffer;

public interface Plane {
    ByteBuffer getBuffer();

    int getPixelStride();

    int getRowStride();
}
