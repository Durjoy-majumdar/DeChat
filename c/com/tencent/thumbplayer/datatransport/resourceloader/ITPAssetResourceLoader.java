package com.tencent.thumbplayer.datatransport.resourceloader;

import com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoaderListener;

public interface ITPAssetResourceLoader {
    void fillInContentInformation();

    String getContentType(int i, String str);

    String getDataFilePath(int i, String str);

    long getDataTotalSize(int i, String str);

    int onReadData(int i, String str, long j, long j2);

    int onStartReadData(int i, String str, long j, long j2);

    int onStopReadData(int i, String str, int i2);

    void release();

    void reset();

    void setTPAssetResourceLoaderListener(ITPAssetResourceLoaderListener iTPAssetResourceLoaderListener);
}
