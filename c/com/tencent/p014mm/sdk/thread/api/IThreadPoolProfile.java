package com.tencent.p014mm.sdk.thread.api;

import com.tencent.p014mm.sdk.thread.ThreadTaskInfo;
import java.util.List;

/* renamed from: com.tencent.mm.sdk.thread.api.IThreadPoolProfile */
public interface IThreadPoolProfile {
    long getTaskTimeout();

    void onBusy(int i, List<ThreadTaskInfo> list, List<ThreadTaskInfo> list2);

    void onException(Object obj, Throwable th);

    void onLog(Runnable runnable, String str, long j, long j2);

    void onRelax(long j);

    void onTaskAdded(ThreadTaskInfo threadTaskInfo);

    void onTaskAfterExecuted(ThreadTaskInfo threadTaskInfo);

    void onTaskBeforeExecute(ThreadTaskInfo threadTaskInfo);

    void onTaskRemove(ThreadTaskInfo threadTaskInfo);

    void onTaskTimeout(ThreadTaskInfo threadTaskInfo);
}
