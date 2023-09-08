package com.tencent.thumbplayer.api.resourceloader;

public interface ITPAssetResourceLoadingDataRequest {
    long getCurrentOffset();

    int getRequestNum();

    long getRequestedLength();

    long getRequestedOffset();

    void notifyDataReady(long j, long j2);

    void respondWithData(byte[] bArr);
}
