package com.tencent.xweb.downloader;

public interface IFileDownloaderProxy {
    int addDownloadTask(String str, String str2, int i, IFileDownloaderProxyCallback iFileDownloaderProxyCallback);
}
