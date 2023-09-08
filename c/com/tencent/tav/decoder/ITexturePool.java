package com.tencent.tav.decoder;

import com.tencent.tav.coremedia.TextureInfo;

public interface ITexturePool {
    TextureInfo popTexture(int i, int i2, int i3);

    void pushTexture(TextureInfo textureInfo);

    void release();

    void setMaxCacheLength(int i);

    void setMaxCacheSize(long j);
}
