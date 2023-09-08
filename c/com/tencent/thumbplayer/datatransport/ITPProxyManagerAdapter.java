package com.tencent.thumbplayer.datatransport;

import com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy;

public interface ITPProxyManagerAdapter {
    ITPDownloadProxy getDownloadProxy();

    void pushEvent(int i);
}
