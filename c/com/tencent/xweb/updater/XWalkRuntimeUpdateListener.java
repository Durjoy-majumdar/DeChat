package com.tencent.xweb.updater;

import com.tencent.xweb.util.Scheduler;

public interface XWalkRuntimeUpdateListener {
    void onXWalkUpdateCancelled();

    void onXWalkUpdateCompleted(Scheduler scheduler);

    void onXWalkUpdateFailed(int i, Scheduler scheduler);

    void onXWalkUpdateProgress(int i);

    void onXWalkUpdateStarted(Scheduler scheduler);
}
