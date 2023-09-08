package com.tencent.tav.coremedia;

import java.nio.ByteBuffer;

public interface IAVResample {
    byte[] resample(ByteBuffer byteBuffer, int i);

    void updateSrcFormat(int i, int i2);
}
