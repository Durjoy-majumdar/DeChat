package com.tencent.thumbplayer.core.downloadproxy.api;

public interface ITPPreLoadListener {
    void onPrepareDownloadProgressUpdate(int i, int i2, long j, long j2, String str);

    void onPrepareError(int i, int i2, String str);

    void onPrepareOK();
}
