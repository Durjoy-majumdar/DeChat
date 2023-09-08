package com.tencent.thumbplayer.core.demuxer;

public interface ITPNativeDemuxerCallback {
    TPNativeRemoteSdpInfo onSdpExchange(String str, int i);
}
