package com.tencent.thumbplayer.core.player;

import com.tencent.thumbplayer.core.common.TPVideoPacket;

public interface ITPNativePlayerSurfaceCallback {
    void onFlush();

    void onRenderInfo(TPNativePlayerSurfaceRenderInfo tPNativePlayerSurfaceRenderInfo);

    void onVideoPacket(TPVideoPacket tPVideoPacket, long j);
}
