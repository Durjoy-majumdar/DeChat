package com.tencent.xweb.updater;

import com.tencent.xweb.updater.XWebHttpTask;

public interface IXWebHttpTaskCallback {
    void onTaskFailed(XWebHttpTask.ResultOut resultOut);

    void onTaskProgressChanged(XWebHttpTask.Progress progress);

    void onTaskStarted();

    void onTaskSucceed(XWebHttpTask.ResultOut resultOut);
}
