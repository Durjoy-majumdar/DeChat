package com.tencent.p014mm.sdk.platformtools;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Deprecated
/* renamed from: com.tencent.mm.sdk.platformtools.QueuedWork */
class QueuedWork {
    private static final ConcurrentLinkedQueue<Runnable> mPendingWorks = new ConcurrentLinkedQueue<>();
    private static ExecutorService mSingleThreadExecutor = null;

    public static void add(Runnable runnable) {
        mPendingWorks.add(runnable);
    }

    public static boolean hasPendingWork() {
        return !mPendingWorks.isEmpty();
    }

    public static void remove(Runnable runnable) {
        mPendingWorks.remove(runnable);
    }

    public static ExecutorService singleThreadExecutor() {
        ExecutorService executorService;
        synchronized (QueuedWork.class) {
            if (mSingleThreadExecutor == null) {
                mSingleThreadExecutor = Executors.newSingleThreadExecutor();
            }
            executorService = mSingleThreadExecutor;
        }
        return executorService;
    }

    public static void waitToFinish() {
        while (true) {
            Runnable poll = mPendingWorks.poll();
            if (poll != null) {
                poll.run();
            } else {
                return;
            }
        }
    }
}
