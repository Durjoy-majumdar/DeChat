package com.tencent.midas.download;

public interface IAPMidasPluginDownListener {
    void onDownloadFail(int i);

    void onDownloadSuccess();
}
