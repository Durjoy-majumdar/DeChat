package com.tencent.xweb.downloader;

public interface IWXFileDownloaderBridgeCallback {
    void onProgressChange(String str, long j, long j2);

    void onTaskFail(String str, int i, boolean z);

    void onTaskFinish(String str, String str2, boolean z);
}
