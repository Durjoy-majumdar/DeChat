package com.tencent.xweb.downloader;

public interface IFileDownloaderProxyCallback {
    void onTaskFailed(String str, int i, boolean z);

    void onTaskFinished(String str, String str2, boolean z);

    void onTaskProgressChanged(String str, long j, long j2);
}
