package com.tencent.thumbplayer.core.downloadproxy.api;

public interface ITPDownloadListener {
    void didReleaseMemory(String str);

    void onQuicQualityReportUpdate(String str);

    void willReleaseMemory(String str);
}
