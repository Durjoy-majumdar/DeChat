package com.tencent.thumbplayer.api;

public interface ITPSurfaceListener {
    void onFlush();

    void onRenderInfo(TPSurfaceRenderInfo tPSurfaceRenderInfo);

    void onVideoPacket(TPVideoPacketBuffer tPVideoPacketBuffer, long j);
}
