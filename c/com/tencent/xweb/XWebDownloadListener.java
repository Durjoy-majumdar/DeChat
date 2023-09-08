package com.tencent.xweb;

import com.tencent.xweb.XWebDownloader;

public interface XWebDownloadListener {
    void onDownloadCancelled();

    void onDownloadCompleted(XWebDownloader.DownloadInfo downloadInfo);

    void onDownloadFailed(XWebDownloader.DownloadInfo downloadInfo);

    void onDownloadStarted(int i);

    void onDownloadUpdated(int i);
}
