package com.tencent.thumbplayer.tmediacodec.pools;

import com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper;

public interface PoolActionCallback {
    void onErase(ReuseCodecWrapper reuseCodecWrapper);
}
