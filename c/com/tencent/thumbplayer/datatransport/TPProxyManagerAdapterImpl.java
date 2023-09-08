package com.tencent.thumbplayer.datatransport;

import com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy;

public class TPProxyManagerAdapterImpl implements ITPProxyManagerAdapter {
    private ITPDownloadProxy mDownloadProxy;

    public TPProxyManagerAdapterImpl(ITPDownloadProxy iTPDownloadProxy) {
        this.mDownloadProxy = iTPDownloadProxy;
    }

    public ITPDownloadProxy getDownloadProxy() {
        return this.mDownloadProxy;
    }

    public void pushEvent(int i) {
        this.mDownloadProxy.pushEvent(i);
    }
}
