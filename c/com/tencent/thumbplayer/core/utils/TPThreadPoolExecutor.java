package com.tencent.thumbplayer.core.utils;

import com.tencent.thumbplayer.core.common.TPNativeLog;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class TPThreadPoolExecutor {
    private static final int QUEUE_CAPACITY = 20;
    private static final String TAG = "TPCore[TPThreadPoolExecutor]";
    private static final long THREAD_KEEP_ALIVE_TIME = 60;
    private static final String THREAD_POOL_NAME = "TP-Thread";

    public static class CustomRejectedExecutionHandler implements RejectedExecutionHandler {
        private CustomRejectedExecutionHandler() {
        }

        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            try {
                threadPoolExecutor.getQueue().put(runnable);
                TPNativeLog.printLog(2, TPThreadPoolExecutor.TAG, "rejectedExecution put task to queue");
            } catch (InterruptedException e) {
                TPNativeLog.printLog(4, TPThreadPoolExecutor.TAG, "rejectedExecution has exception:" + e.toString());
            }
        }
    }

    public static class CustomThreadFactory implements ThreadFactory {
        private AtomicInteger threadAtomicCount;

        private CustomThreadFactory() {
            this.threadAtomicCount = new AtomicInteger(0);
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(TPThreadPoolExecutor.THREAD_POOL_NAME + this.threadAtomicCount.incrementAndGet());
            return thread;
        }
    }

    public static ExecutorService newCustomThreadExecutor(int i, int i2) {
        return new ThreadPoolExecutor(i, i2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(20), new CustomThreadFactory(), new CustomRejectedExecutionHandler());
    }
}
