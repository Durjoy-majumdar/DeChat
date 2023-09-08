package com.tencent.xweb.downloader;

import com.tencent.xweb.DeprecatedOutsideXWebSdk;
import com.tencent.xweb.util.XWebLog;

public class WXFileDownloaderBridge implements IFileDownloaderProxyCallback {
    private static final String TAG = "WXFileDownloaderBridge";
    private static IFileDownloaderProxy mFileDownloaderProxy;
    private IWXFileDownloaderBridgeCallback mBridgeCallback = null;

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void setFileDownloaderProxy(IFileDownloaderProxy iFileDownloaderProxy) {
        XWebLog.m21911i(TAG, "setFileDownloaderProxy:" + iFileDownloaderProxy);
        mFileDownloaderProxy = iFileDownloaderProxy;
    }

    public boolean isValid() {
        return mFileDownloaderProxy != null;
    }

    public void onTaskFailed(String str, int i, boolean z) {
        IWXFileDownloaderBridgeCallback iWXFileDownloaderBridgeCallback = this.mBridgeCallback;
        if (iWXFileDownloaderBridgeCallback != null) {
            iWXFileDownloaderBridgeCallback.onTaskFail(str, i, z);
        }
    }

    public void onTaskFinished(String str, String str2, boolean z) {
        IWXFileDownloaderBridgeCallback iWXFileDownloaderBridgeCallback = this.mBridgeCallback;
        if (iWXFileDownloaderBridgeCallback != null) {
            iWXFileDownloaderBridgeCallback.onTaskFinish(str, str2, z);
        }
    }

    public void onTaskProgressChanged(String str, long j, long j2) {
        IWXFileDownloaderBridgeCallback iWXFileDownloaderBridgeCallback = this.mBridgeCallback;
        if (iWXFileDownloaderBridgeCallback != null) {
            iWXFileDownloaderBridgeCallback.onProgressChange(str, j, j2);
        }
    }

    public void setCallback(IWXFileDownloaderBridgeCallback iWXFileDownloaderBridgeCallback) {
        this.mBridgeCallback = iWXFileDownloaderBridgeCallback;
    }

    public int startDownload(String str, String str2, int i) {
        IFileDownloaderProxy iFileDownloaderProxy = mFileDownloaderProxy;
        if (iFileDownloaderProxy != null) {
            return iFileDownloaderProxy.addDownloadTask(str, str2, i, this);
        }
        return -1;
    }
}
